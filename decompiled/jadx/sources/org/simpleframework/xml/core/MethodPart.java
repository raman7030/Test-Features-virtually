package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodPart {
    Annotation getAnnotation();

    Annotation getAnnotation(Class cls);

    Class getDeclaringClass();

    Class getDependent();

    Class[] getDependents();

    Method getMethod();

    MethodType getMethodType();

    String getName();

    Class getType();

    String toString();
}
