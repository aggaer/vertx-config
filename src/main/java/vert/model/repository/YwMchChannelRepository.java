package vert.model.repository;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import vert.model.pojo.request.SmsChannelsFetchReq;
import vert.model.repository.impl.YwMchChannelRepositoryImpl;

/**
 * @author Jerry
 * @since 2019/4/28 11:38
 **/
@VertxGen
@ProxyGen
public interface YwMchChannelRepository {

    @Fluent
    YwMchChannelRepository findByConditions(SmsChannelsFetchReq conditions, Handler<AsyncResult<JsonArray>> handler);

    static YwMchChannelRepository create(AsyncSQLClient asyncSQLClient) {
        return new YwMchChannelRepositoryImpl(asyncSQLClient);
    }

    static YwMchChannelRepository createProxy(Vertx vertx, String address, DeliveryOptions options) {
        return new YwMchChannelRepositoryVertxEBProxy(vertx, address, options);
    }
}
