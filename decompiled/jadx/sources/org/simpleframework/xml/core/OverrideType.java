package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.strategy.Type;

/* JADX INFO: loaded from: classes2.dex */
public class OverrideType implements Type {
    public final Class override;
    public final Type type;

    public OverrideType(Type type, Class cls) {
        this.override = cls;
        this.type = type;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Annotation getAnnotation(Class cls) {
        return this.type.getAnnotation(cls);
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Class getType() {
        return this.override;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public String toString() {
        return this.type.toString();
    }
}
