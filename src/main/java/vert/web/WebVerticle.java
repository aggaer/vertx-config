package vert.web;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.http.HttpServer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author Jerry
 * @since 2019/4/19 16:40
 **/
@Slf4j
public class WebVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) {
        HttpServer httpServer = vertx.createHttpServer();
        Router router = Router.router(vertx);
        router.post("/miniprogram/api/v1")
                .handler(BodyHandler.create())
                .handler(this::funcodeDispatcher)
                .failureHandler(this::errorHandler);
        JsonObject env = Objects.requireNonNull(config());
        log.info("web env:{}", env.toString());
        Integer port = env.getJsonObject("server").getInteger("port");
        httpServer.requestHandler(router).listen(port, ar -> {
            if (ar.succeeded()) {
                log.info("http server start success in port:{}", port);
            } else {
                log.error("http server start failed");
            }
        });
    }

    /**
     * 处理主要业务逻辑
     *
     * @param request web上下文
     */
    private void funcodeDispatcher(RoutingContext request) {
        JsonObject body = Objects.requireNonNull(request.getBodyAsJson(), "request body is null");
        String funcode = Objects.requireNonNull(body.getString("funcode"), "missing require param:funcode");
        vertx.eventBus().send(funcode, body, (Handler<AsyncResult<Message<JsonObject>>>) event -> {
            if (event.succeeded()) {
                JsonObject result = event.result().body();
                request.response().putHeader("Content-Type", "application/json").end(result.toBuffer());
            } else {
                request.response().end(event.cause().getMessage());
            }
        });
    }

    /**
     * 异常处理
     *
     * @param context web上下文
     */
    private void errorHandler(RoutingContext context) {
        String errMsg = context.failure().getMessage();
        log.error("error occur:{}", errMsg);
        context.response().setStatusCode(HttpResponseStatus.INTERNAL_SERVER_ERROR.code()).end(String.format("error occur:%s", errMsg));
    }
}
