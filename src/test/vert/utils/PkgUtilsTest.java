package vert.utils;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import org.junit.jupiter.api.Test;
import vert.service.handler.FuncodeHandler;

import java.io.IOException;
import java.util.List;
import java.util.Map;

class PkgUtilsTest {

    @Test
    void getClassName() throws IOException {
        List<String> list = PkgUtils.getClassName("vert.service.handler", false);
        System.out.println(list);
    }

    @Test
    void initHandlerMap() {
        Map<String, FuncodeHandler> handlerMap = PkgUtils.initHandlerMap("vert.service.handler", Vertx.vertx());
        handlerMap.forEach((k, v) -> System.out.println(k + "-------" + v));
    }

    @Test
    void test(){
        List<JsonObject> jsonObjects = null;
        System.out.println(Void.class.getSimpleName());
        System.out.println(new JsonArray(jsonObjects));
    }
}