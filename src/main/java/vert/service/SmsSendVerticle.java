package vert.service;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Vertx;
import vert.service.handler.impl.TransDetailHandler;

/**
 * @author Jerry
 * @since 2019-04-21 20:49
 **/
public class SmsSendVerticle extends AbstractVerticle {

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
    }

    @Override
    public void start() {
        vertx.eventBus().consumer("goods.list", new TransDetailHandler(vertx));
    }
}
