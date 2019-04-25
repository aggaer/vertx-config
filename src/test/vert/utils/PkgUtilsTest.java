package vert.utils;

import io.vertx.core.Vertx;
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
}