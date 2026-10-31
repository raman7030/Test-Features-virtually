package org.simpleframework.xml.core;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class MethodName {
    public Method method;
    public String name;
    public MethodType type;

    public MethodName(Method method, MethodType methodType, String str) {
        this.method = method;
        this.type = methodType;
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public MethodType getType() {
        return this.type;
    }

    public Method getMethod() {
        return this.method;
    }
}
