package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class MethodDetail {
    public final Annotation[] list;
    public final Method method;
    public final String name;

    public MethodDetail(Method method) {
        this.list = method.getDeclaredAnnotations();
        this.name = method.getName();
        this.method = method;
    }

    public Annotation[] getAnnotations() {
        return this.list;
    }

    public Method getMethod() {
        return this.method;
    }

    public String getName() {
        return this.name;
    }
}
