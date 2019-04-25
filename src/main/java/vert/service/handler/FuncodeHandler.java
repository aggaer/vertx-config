package vert.service.handler;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import vert.exception.BusinessException;

import javax.validation.Validation;
import javax.validation.Validator;


/**
 * @author Jerry
 * @since 2019-04-21 22:28
 **/
public interface FuncodeHandler<Request, Response> extends Handler<Message<JsonObject>> {
    ObjectMapper JSON_MAPPER = Json.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * 获取功能码
     *
     * @return 功能码
     */
    String getFuncode();

    /**
     * 标注请求参数类型
     *
     * @return 请求类型
     */
    Class<Request> requestClass();

    /**
     * 处理业务逻辑
     *
     * @param request 业务请求参数
     * @param future  异步回调返回值
     * @throws BusinessException 业务异常
     */
    void processing(Request request, Handler<AsyncResult<Response>> future);
}
