package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface Extractor {
    Annotation[] getAnnotations();

    Label getLabel(Annotation annotation);

    Class getType(Annotation annotation);
}
