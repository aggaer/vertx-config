package vert.repository;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import io.vertx.ext.asyncsql.MySQLClient;
import io.vertx.serviceproxy.ServiceBinder;
import lombok.extern.slf4j.Slf4j;
import vert.repository.repository.SmsTemplateRepository;
import vert.repository.repository.TransSendDetailRepository;
import vert.repository.repository.YwMchChannelRepository;

import java.util.Objects;

/**
 * @author Jerry
 * @since 2019/4/22 16:00
 **/
@Slf4j
public class DatabaseVerticle extends AbstractVerticle {

    private AsyncSQLClient asyncSQLClient;

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        JsonObject dataSource = Objects.requireNonNull(config().getJsonObject("dataSource"), "read data source from config failed");
        log.info("data source config:{}", dataSource);
        asyncSQLClient = MySQLClient.createShared(vertx, dataSource, "async-mysql-pool");
    }

    @Override
    public void start(Future<Void> startFuture) {
        ServiceBinder serviceBinder = new ServiceBinder(vertx);
        serviceBinder.setAddress(SmsTemplateRepository.class.getName())
                .register(SmsTemplateRepository.class, SmsTemplateRepository.create(asyncSQLClient));
        serviceBinder.setAddress(TransSendDetailRepository.class.getName())
                .register(TransSendDetailRepository.class, TransSendDetailRepository.create(asyncSQLClient));
        serviceBinder.setAddress(YwMchChannelRepository.class.getName())
                .register(YwMchChannelRepository.class, YwMchChannelRepository.create(asyncSQLClient));
        startFuture.complete();
    }
}
