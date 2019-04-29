package vert.service;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import lombok.extern.slf4j.Slf4j;
import vert.service.handler.FuncodeHandler;
import vert.utils.PkgUtils;

import java.util.Map;

/**
 * @author Jerry
 * @since 2019-04-21 20:49
 **/
@Slf4j
public class SmsSendVerticle extends AbstractVerticle {
    private static final String DEFAULT_HANDLER_PATH = "vert.service.handler";

    @Override
    public void start(Future<Void> startFuture) {
        vertx.executeBlocking((Handler<Future<Map<String, FuncodeHandler>>>)
                future -> future.complete(PkgUtils.initHandlerMap(DEFAULT_HANDLER_PATH, vertx)), ar -> {
            if (ar.succeeded()) {
                ar.result().forEach((funcode, handler) -> {
                    //noinspection unchecked
                    vertx.eventBus().consumer(funcode, handler);
                });
                startFuture.handle(Future.succeededFuture());
            } else {
                ar.cause().printStackTrace();
                startFuture.handle(Future.failedFuture(ar.cause()));
            }
        });
    }
}
