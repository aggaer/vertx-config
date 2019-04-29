package vert.utils;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @author Jerry
 * @since 2019/4/28 17:08
 **/
public interface HandlerRespComposer {
    JsonObject EMPTY_RESULT = new JsonObject();

    Function<Object, JsonObject> ENCAPSULATE_SUCCESS_RESP = respBody -> new JsonObject()
            .put("code", 1)
            .put("msg", "success")
            .put("body", respBody);

    Function<String, JsonObject> ENCAPSULATE_FAILURE_RESP = errMsg -> new JsonObject()
            .put("code", 0)
            .put("msg", errMsg)
            .put("body", EMPTY_RESULT);

    BiConsumer<Handler<AsyncResult<JsonArray>>,AsyncResult<List<JsonObject>>> RESULTS_HANDLER = (handler, ar) -> {
        if (ar.succeeded()) {
            List<JsonObject> result = ar.result();
            handler.handle(Future.succeededFuture(Objects.nonNull(result) ? new JsonArray(result) : new JsonArray()));
        } else {
            handler.handle(Future.failedFuture(ar.cause()));
        }
    };
}
