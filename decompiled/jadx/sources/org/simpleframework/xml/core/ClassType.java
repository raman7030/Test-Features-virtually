package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.strategy.Type;

/* JADX INFO: loaded from: classes2.dex */
public class ClassType implements Type {
    public final Class type;

    @Override // org.simpleframework.xml.strategy.Type
    public Annotation getAnnotation(Class cls) {
        return null;
    }

    public ClassType(Class cls) {
        this.type = cls;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public String toString() {
        return this.type.toString();
    }
}
