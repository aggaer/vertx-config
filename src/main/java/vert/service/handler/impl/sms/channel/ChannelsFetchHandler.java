package vert.service.handler.impl.sms.channel;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import vert.model.pojo.request.SmsChannelsFetchReq;
import vert.model.repository.YwMchChannelRepository;
import vert.service.handler.AbstractSmsHandler;

/**
 * @author Jerry
 * @since 2019/4/28 11:05
 **/
@SuppressWarnings("unused")
public class ChannelsFetchHandler extends AbstractSmsHandler<SmsChannelsFetchReq, JsonArray> {
    private YwMchChannelRepository ywMchChannelRepository;

    public ChannelsFetchHandler(Vertx vertx) {

        this.ywMchChannelRepository = ywMchChannelRepository;
    }

    @Override
    public String getFuncode() {
        return "sms.channels";
    }

    @Override
    public Class<SmsChannelsFetchReq> requestClass() {
        return SmsChannelsFetchReq.class;
    }

    @Override
    public void processing(SmsChannelsFetchReq smsChannelsFetchReq, Handler<AsyncResult<JsonArray>> future) {

    }
}
