package vert.service.handler;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintViolation;
import java.security.InvalidParameterException;
import java.util.Set;

/**
 * @author Jerry
 * @date 2019/4/24 14:17
 **/
@Slf4j
public abstract class AbstractSmsHandler<Request, Response> implements FuncodeHandler<Request, Response> {

    @Override
    public void handle(Message<JsonObject> event) {
        JsonObject body = event.body();
        String funcode = body.getString("funcode");
        log.info("SmsSendHandler.handle received msg:{}", body.encodePrettily());
        Request request;
        try {
            request = parseRequest(body);
        } catch (InvalidParameterException e) {
            log.error("error occur in parseRequest:{} , error msg:{}", funcode, e.getMessage());
            event.fail(HttpResponseStatus.BAD_REQUEST.code(), e.getMessage());
            return;
        }
        processing(request, ar -> {
            if (ar.succeeded()) {
                Response response = ar.result();
                log.info("SmsSendHandler.handle succeeded,response:{}", response);
                event.reply(response);
            } else {
                event.fail(HttpResponseStatus.INTERNAL_SERVER_ERROR.code(), ar.cause().getMessage());
            }
        });
    }

    private Request parseRequest(JsonObject jsonRequest) throws InvalidParameterException {
        Request request = JSON_MAPPER.convertValue(jsonRequest, requestClass());
        Set<ConstraintViolation<Request>> violations = VALIDATOR.validate(request);
        if (violations.size() > 0) {
            StringBuilder errBuilder = new StringBuilder();
            violations.forEach(violation -> errBuilder.append("invalid param:")
                    .append(violation.getPropertyPath().toString())
                    .append(" ; error msg:")
                    .append(violation.getMessage()).append("\n"));
            throw new InvalidParameterException(errBuilder.toString());
        }
        return request;
    }
}
