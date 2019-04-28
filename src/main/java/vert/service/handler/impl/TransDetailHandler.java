package vert.service.handler.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import lombok.extern.slf4j.Slf4j;
import vert.model.pojo.request.TransSendDetailReq;
import vert.model.repository.TransSendDetailRepository;
import vert.service.handler.AbstractSmsHandler;

/**
 * @author Jerry
 * @since 2019-04-21 21:03
 **/
@Slf4j
@SuppressWarnings("unused")
public class TransDetailHandler extends AbstractSmsHandler<TransSendDetailReq, JsonObject> {
    private TransSendDetailRepository sendDetailRepository;

    public TransDetailHandler(Vertx vertx) {
        sendDetailRepository = TransSendDetailRepository.createProxy(vertx, TransSendDetailRepository.class.getName(), null);
    }

    @Override
    public String getFuncode() {
        return "transdetail";
    }

    @Override
    public Class<TransSendDetailReq> requestClass() {
        return TransSendDetailReq.class;
    }

    @Override
    public void processing(TransSendDetailReq transSendDetailReq, Handler<AsyncResult<JsonObject>> handler) {
        sendDetailRepository.findByPrimaryKey(transSendDetailReq.getTransId(), transSendDetailReq.getPhone(), handler);
    }
}
