package org.simpleframework.xml.strategy;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface Type {
    Annotation getAnnotation(Class cls);

    Class getType();

    String toString();
}
