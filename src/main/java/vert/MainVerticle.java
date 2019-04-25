package vert;

import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.*;
import io.vertx.core.json.JsonObject;
import lombok.extern.slf4j.Slf4j;
import vert.model.DatabaseVerticle;
import vert.service.SmsSendVerticle;
import vert.web.WebVerticle;

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
        ConfigRetriever retriever = loadConfigs();
        Future<JsonObject> configFuture = Future.future();

        retriever.getConfig(configFuture);
        configFuture.compose(config -> {
            DeploymentOptions deploymentOptions = new DeploymentOptions().setConfig(config);
            Future<String> dbFuture = Future.future();
            vertx.deployVerticle(new DatabaseVerticle(), deploymentOptions, dbFuture);
            Future<String> smsFuture = Future.future();
            vertx.deployVerticle(new SmsSendVerticle(), deploymentOptions, smsFuture);
            Future<String> webFuture = Future.future();
            vertx.deployVerticle(new WebVerticle(), deploymentOptions, webFuture);
            return CompositeFuture.all(dbFuture, smsFuture, webFuture);
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
