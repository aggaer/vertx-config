package vert.utils;

import io.vertx.core.Vertx;
import vert.service.handler.FuncodeHandler;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

/**
 * @author Jerry
 * @since 2019-04-21 21:37
 **/
@SuppressWarnings("ALL")
public class PkgUtils {

    /**
     * 获取某包下所有类
     *
     * @param packageName  包名
     * @param childPackage 是否遍历子包
     * @return 类的完整名称
     * @throws UnsupportedEncodingException 编码异常
     */
    public static List<String> getClassName(String packageName, boolean childPackage) throws IOException {
        List<String> fileNames = new ArrayList<>();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        String packagePath = packageName.replace(".", "/");
        Enumeration<URL> urls = loader.getResources(packagePath);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            if (url == null) {
                continue;
            }
            String type = url.getProtocol();
            if ("file".equals(type)) {
                fileNames.addAll(getClassNameByFile(url.getPath(), childPackage));
            }
        }
        return fileNames;
    }

    /**
     * 从项目文件获取某包下所有类
     *
     * @param filePath     文件路径
     *                     类名集合
     * @param childPackage 是否遍历子包
     * @return 类的完整名称
     * @throws UnsupportedEncodingException 编码异常
     */
    private static List<String> getClassNameByFile(String filePath, boolean childPackage) throws UnsupportedEncodingException {
        List<String> myClassName = new ArrayList<>();
        filePath = URLDecoder.decode(filePath, "utf8");
        File file = new File(filePath);
        File[] childFiles = file.listFiles();
        if (childFiles == null) {
            return myClassName;
        }
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                if (childPackage) {
                    myClassName.addAll(getClassNameByFile(childFile.getPath(), childPackage));
                }
            } else {
                String childFilePath = childFile.getPath();
                if (childFilePath.endsWith(".class")) {
                    childFilePath = childFilePath.substring(childFilePath.indexOf("/classes/") + 9, childFilePath.lastIndexOf("."));
                    childFilePath = childFilePath.replace("/", ".");
                    myClassName.add(childFilePath);
                }
            }
        }
        return myClassName;
    }

    public static Map<String, FuncodeHandler> initHandlerMap(String packageName, Vertx vertx) {
        Map<String, FuncodeHandler> handlerMap = new HashMap<>(32);
        List<String> targetClasses = null;
        try {
            targetClasses = PkgUtils.getClassName(packageName, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String className : targetClasses) {
            Class<?> clazz;
            try {
                clazz = Class.forName(className);
                if (FuncodeHandler.class.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers())) {
                    Constructor<?> constructor = clazz.getConstructor(Vertx.class);
                    FuncodeHandler handler = (FuncodeHandler) constructor.newInstance(vertx);
                    handlerMap.put(handler.getFuncode(), handler);
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(String.format("object:%s  create failed , cause:%s", className, e.getMessage()));
            }
        }
        return handlerMap;
    }
}
