package vert;

import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.*;
import io.vertx.core.json.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import vert.repository.DatabaseVerticle;
import vert.service.SmsSendVerticle;
import vert.web.WebVerticle;

import java.util.concurrent.TimeUnit;

import static io.vertx.core.spi.resolver.ResolverProvider.DISABLE_DNS_RESOLVER_PROP_NAME;

/**
 * @author Jerry
 * @since 2019/4/19 11:53
 **/
@Slf4j
public class MainVerticle extends AbstractVerticle {

    @Override
    public void init(Vertx vertx, Context context) {
        System.setProperty("org.jooq.no-logo", "true");
        System.setProperty(DISABLE_DNS_RESOLVER_PROP_NAME, "true");
        super.init(vertx, context);
    }

    @Override
    public void start(Future<Void> startFuture) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ConfigRetriever retriever = loadConfigs();
        retriever.getConfig(ar -> {
            if (ar.succeeded()) {
                DeploymentOptions deploymentOptions = new DeploymentOptions().setConfig(ar.result());
                Future<String> dbFuture = Future.future();
                vertx.deployVerticle(DatabaseVerticle.class, deploymentOptions, dbFuture);
                Future<String> smsFuture = Future.future();
                vertx.deployVerticle(SmsSendVerticle.class, deploymentOptions, smsFuture);
                CompositeFuture.all(dbFuture, smsFuture).setHandler(it -> {
                    if (!it.succeeded()) {
                        log.error("DatabaseVerticle or SmsSendVerticle start failed , cause:{}", it.cause());
                        Future.failedFuture(it.cause());
                    }
                }).compose(future -> {
                    Future<String> webFuture = Future.future();
                    vertx.deployVerticle(WebVerticle.class, deploymentOptions.setInstances(Runtime.getRuntime().availableProcessors()), webFuture);
                    return webFuture;
                }).setHandler(future -> {
                    stopWatch.split();
                    if (future.succeeded()) {
                        log.info("web server started success in {} sec", stopWatch.getTime(TimeUnit.MILLISECONDS) / 1000.0);
                    } else {
                        log.error("web server start failed , cause:{}", future.cause());
                    }
                });
            }
        });
    }

    private ConfigRetriever loadConfigs() {
        String activeEnv = System.getProperty("env", "dev");
        ConfigStoreOptions baseStore = new ConfigStoreOptions()
                .setType("file")
                .setFormat("yaml")
                .setConfig(new JsonObject().put("path", "application.yml"));
        ConfigStoreOptions devStore = new ConfigStoreOptions()
                .setType("file")
                .setFormat("yaml")
                .setConfig(new JsonObject().put("path", String.format("application-%s.yml", activeEnv)));
        return ConfigRetriever.create(vertx, new ConfigRetrieverOptions().addStore(baseStore).addStore(devStore));
    }

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MainVerticle());
    }
}
