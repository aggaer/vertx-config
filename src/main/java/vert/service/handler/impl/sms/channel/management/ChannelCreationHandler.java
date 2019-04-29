package vert.service.handler.impl.sms.channel.management;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;
import vert.model.pojo.request.sms.ChannelCreationReq;
import vert.repository.repository.YwMchChannelRepository;
import vert.service.handler.AbstractFuncodeHandler;

/**
 * @author Jerry
 * @since 2019/4/29 14:11
 **/
@Slf4j
@SuppressWarnings("unused")
public class ChannelCreationHandler extends AbstractFuncodeHandler<ChannelCreationReq, Integer> {
    private YwMchChannelRepository ywMchChannelRepository;

    public ChannelCreationHandler(Vertx vertx) {
        ywMchChannelRepository = YwMchChannelRepository.createProxy(vertx, YwMchChannelRepository.class.getName(), null);
    }

    @Override
    public String getFuncode() {
        return "sms.channel.creation";
    }

    @Override
    public Class<ChannelCreationReq> requestClass() {
        return ChannelCreationReq.class;
    }

    @Override
    public void processing(ChannelCreationReq channelCreationReq, Handler<AsyncResult<Integer>> future) {
        log.info("ChannelCreationHandler.processing channelCreationReq:{}", channelCreationReq);
        ywMchChannelRepository.save(channelCreationReq, future);
    }
}
