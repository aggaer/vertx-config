package vert.repository.repository;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import vert.repository.repository.impl.TransSendDetailRepositoryImpl;

/**
 * @author Jerry
 * @since 2019/4/22 16:33
 **/
@VertxGen
@ProxyGen
public interface TransSendDetailRepository {

    @Fluent
    TransSendDetailRepository findByPrimaryKey(String transId, String phone, Handler<AsyncResult<JsonObject>> handler);


    static TransSendDetailRepository create(AsyncSQLClient asyncSQLClient) {
        return new TransSendDetailRepositoryImpl(asyncSQLClient);
    }

    static TransSendDetailRepository createProxy(Vertx vertx, String address, DeliveryOptions options) {
        return new TransSendDetailRepositoryVertxEBProxy(vertx, address, options);
    }
}
