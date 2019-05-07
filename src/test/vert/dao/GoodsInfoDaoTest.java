package vert.dao;

import com.sun.xml.internal.ws.config.management.policy.ManagementPolicyValidator;
import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.junit5.VertxExtension;
import io.vertx.junit5.VertxTestContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import vert.repository.DatabaseVerticle;
import vert.repository.repository.SmsTemplateRepository;
import vert.repository.repository.TransSendDetailRepository;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Jerry
 * @since 2019-04-21 23:07
 **/
@SuppressWarnings("ALL")
@Slf4j
@ExtendWith(VertxExtension.class)
class GoodsInfoDaoTest {
    private JsonObject config;

    @BeforeEach
    void setup(VertxTestContext context, Vertx vertx) {
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
        String activeEnv = System.getProperty("env", "dev");
        ConfigStoreOptions baseStore = new ConfigStoreOptions()
                .setType("file")
                .setFormat("yaml")
                .setConfig(new JsonObject().put("path", "application.yml"));
        ConfigStoreOptions devStore = new ConfigStoreOptions()
                .setType("file")
                .setFormat("yaml")
                .setConfig(new JsonObject().put("path", String.format("application-%s.yml", activeEnv)));
        ConfigRetriever.create(vertx, new ConfigRetrieverOptions().addStore(baseStore).addStore(devStore))
                .getConfig(ar -> {
                    if (ar.succeeded()) {
                        config = ar.result();
                        context.completeNow();
                    }
                });
    }

    @Test
    void testTransSendDetailRepository(Vertx vertx, VertxTestContext context) {
        DeploymentOptions deploymentOptions = new DeploymentOptions().setConfig(config);
        vertx.deployVerticle(new DatabaseVerticle(), deploymentOptions, ar -> {
            if (ar.succeeded()) {
                TransSendDetailRepository sendDetailRepository = TransSendDetailRepository.createProxy(vertx, TransSendDetailRepository.class.getName(), null);
                Future<JsonObject> future = Future.future();
                sendDetailRepository.findByPrimaryKey("400001201808221934511522565", "08313B16F4B5538833259B26B06E9FF4", future);
                future.setHandler(it -> {
                    if (it.succeeded()) {
                        System.out.println("result:" + it.result());
                        context.completeNow();
                    } else {
                        context.failNow(new RuntimeException(it.cause()));
                    }
                });
            }
        });
    }

    @Test
    void testClassName() {
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
        map.put(13,67);
        map.get(12);
        System.out.println("sms.send".hashCode());
        System.out.println(SmsTemplateRepository.class.getSimpleName());
    }
}
