package vert.service.handler;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import lombok.extern.slf4j.Slf4j;
import vert.utils.HandlerRespComposer;

import javax.validation.ConstraintViolation;
import java.security.InvalidParameterException;
import java.util.Set;
import java.util.StringJoiner;

/**
 * @author Jerry
 * @date 2019/4/24 14:17
 **/
@Slf4j
@SuppressWarnings("unused")
public abstract class AbstractFuncodeHandler<Request, Response> implements FuncodeHandler<Request, Response> {

    @Override
    public void handle(Message<JsonObject> event) {
        JsonObject body = event.body();
        String funcode = body.getString("funcode");
        log.info("SmsSendHandler.handle received msg:{}", body);
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
                event.reply(HandlerRespComposer.ENCAPSULATE_SUCCESS_RESP.apply(response));
            } else {
                event.fail(HttpResponseStatus.INTERNAL_SERVER_ERROR.code(), ar.cause().getMessage());
            }
        });
    }

    private Request parseRequest(JsonObject jsonRequest) throws InvalidParameterException {
        if (requestClass().getSimpleName().equals(Void.class.getSimpleName())) {
            return null;
        }
        Request request = JSON_MAPPER.convertValue(jsonRequest, requestClass());
        Set<ConstraintViolation<Request>> violations = VALIDATOR.validate(request);
        if (violations.size() > 0) {
            StringJoiner joiner = new StringJoiner(" ，", "参数不合法: ", "。");
            violations.forEach(violation -> joiner.add(violation.getMessage()));
            throw new InvalidParameterException(joiner.toString());
        }
        return request;
    }
}
