package vert.service.handler.impl.sms.channel.management;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;
import vert.model.pojo.request.sms.ChannelDeletionReq;
import vert.repository.repository.YwMchChannelRepository;
import vert.service.handler.AbstractFuncodeHandler;

/**
 * @author Jerry
 * @since 2019/4/29 18:31
 **/
@Slf4j
@SuppressWarnings("unused")
public class ChannelDeletionHandler extends AbstractFuncodeHandler<ChannelDeletionReq, Integer> {

    private YwMchChannelRepository ywMchChannelRepository;

    public ChannelDeletionHandler(Vertx vertx) {
        ywMchChannelRepository = YwMchChannelRepository.createProxy(vertx, YwMchChannelRepository.class.getName(), null);
    }

    @Override
    public String getFuncode() {
        return "sms.channel.deletion";
    }

    @Override
    public Class<ChannelDeletionReq> requestClass() {
        return ChannelDeletionReq.class;
    }

    @Override
    public void processing(ChannelDeletionReq channelDeletionReq, Handler<AsyncResult<Integer>> future) {
        log.info("ChannelCreationHandler.processing ChannelDeletionReq:{}", channelDeletionReq);
        ywMchChannelRepository.delete(channelDeletionReq.getChannelId(), channelDeletionReq.getBusinessType(), future);
    }
}
