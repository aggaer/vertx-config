package vert.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class PkgUtilsTest {

    @Test
    void getClassName() throws IOException {
        List<String> list = PkgUtils.getClassName("vert.service.handler");
        System.out.println(list);
    }
}