package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ParameterContact implements Contact {
    public final Constructor factory;
    public final int index;
    public final Annotation label;
    public final Annotation[] labels;
    public final Class owner;

    @Override // org.simpleframework.xml.core.Contact
    public Object get(Object obj) {
        return null;
    }

    @Override // org.simpleframework.xml.core.Contact
    public abstract String getName();

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
        return false;
    }

    @Override // org.simpleframework.xml.core.Contact
    public void set(Object obj, Object obj2) {
    }

    public ParameterContact(Annotation annotation, Constructor constructor, int i) {
        this.labels = constructor.getParameterAnnotations()[i];
        this.owner = constructor.getDeclaringClass();
        this.factory = constructor;
        this.index = i;
        this.label = annotation;
    }

    @Override // org.simpleframework.xml.core.Contact
    public Annotation getAnnotation() {
        return this.label;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Class getType() {
        return this.factory.getParameterTypes()[this.index];
    }

    @Override // org.simpleframework.xml.core.Contact
    public Class getDependent() {
        return Reflector.getParameterDependent(this.factory, this.index);
    }

    @Override // org.simpleframework.xml.core.Contact
    public Class[] getDependents() {
        return Reflector.getParameterDependents(this.factory, this.index);
    }

    @Override // org.simpleframework.xml.core.Contact
    public Class getDeclaringClass() {
        return this.owner;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Annotation getAnnotation(Class cls) {
        for (Annotation annotation : this.labels) {
            if (annotation.annotationType().equals(cls)) {
                return annotation;
            }
        }
        return null;
    }

    @Override // org.simpleframework.xml.core.Contact, org.simpleframework.xml.strategy.Type
    public String toString() {
        return "parameter " + this.index + " of constructor " + this.factory;
    }
}
