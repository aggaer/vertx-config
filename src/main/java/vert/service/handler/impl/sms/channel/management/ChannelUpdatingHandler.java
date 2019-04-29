package vert.service.handler.impl.sms.channel.management;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;
import vert.model.pojo.request.sms.ChannelUpdateReq;
import vert.repository.repository.YwMchChannelRepository;
import vert.service.handler.AbstractFuncodeHandler;

/**
 * @author Jerry
 * @since 2019/4/29 17:53
 **/
@Slf4j
@SuppressWarnings("unused")
public class ChannelUpdatingHandler extends AbstractFuncodeHandler<ChannelUpdateReq, Integer> {

    private YwMchChannelRepository ywMchChannelRepository;

    public ChannelUpdatingHandler(Vertx vertx) {
        ywMchChannelRepository = YwMchChannelRepository.createProxy(vertx, YwMchChannelRepository.class.getName(), null);
    }

    @Override
    public String getFuncode() {
        return "sms.channel.updating";
    }

    @Override
    public Class<ChannelUpdateReq> requestClass() {
        return ChannelUpdateReq.class;
    }

    @Override
    public void processing(ChannelUpdateReq channelUpdateReq, Handler<AsyncResult<Integer>> future) {
        log.info("ChannelCreationHandler.processing channelCreationReq:{}", channelUpdateReq);
        ywMchChannelRepository.update(channelUpdateReq, future);
    }
}
