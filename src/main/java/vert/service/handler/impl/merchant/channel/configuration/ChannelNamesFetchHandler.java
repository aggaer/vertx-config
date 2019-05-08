package vert.service.handler.impl.merchant.channel.configuration;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import lombok.extern.slf4j.Slf4j;
import vert.repository.repository.YwMchChannelRepository;
import vert.service.handler.AbstractFuncodeHandler;

/**
 * @author Jerry
 * @since 2019/4/29 19:13
 **/
@Slf4j
@SuppressWarnings("unused")
public class ChannelNamesFetchHandler extends AbstractFuncodeHandler<Void, JsonArray> {
    private YwMchChannelRepository ywMchChannelRepository;

    public ChannelNamesFetchHandler(Vertx vertx) {
        ywMchChannelRepository = YwMchChannelRepository.createProxy(vertx, YwMchChannelRepository.class.getName(), null);
    }

    @Override
    public String getFuncode() {
        return "sms.channel.names";
    }

    @Override
    public Class<Void> requestClass() {
        return Void.class;
    }

    @Override
    public void processing(Void aVoid, Handler<AsyncResult<JsonArray>> future) {
//        JsonObject object = new JsonObject().put("channelId", "1303").put("channelName", "聚梦");
//        future.handle(Future.succeededFuture(new JsonArray().add(object)));
        ywMchChannelRepository.findAllChannelIdAndNames(future);
    }
}
