package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public class Loader {
    public Class load(String str) {
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = getCallerClassLoader();
        }
        return classLoader.loadClass(str);
    }

    public static ClassLoader getCallerClassLoader() {
        return Loader.class.getClassLoader();
    }

    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
