package vert.model.repository;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import vert.model.repository.impl.SmsTemplateRepositoryImpl;

/**
 * @author Jerry
 * @since  2019/4/22 18:08
 **/
@VertxGen
@ProxyGen
public interface SmsTemplateRepository {

    @Fluent
    SmsTemplateRepository findByTempCode(String tempCode, Handler<AsyncResult<JsonObject>> handler);

    static SmsTemplateRepository create(AsyncSQLClient asyncSQLClient) {
        return new SmsTemplateRepositoryImpl(asyncSQLClient);
    }

    static SmsTemplateRepository createProxy(Vertx vertx, String address, DeliveryOptions options) {
        return new SmsTemplateRepositoryVertxEBProxy(vertx, address, options);
    }
}
