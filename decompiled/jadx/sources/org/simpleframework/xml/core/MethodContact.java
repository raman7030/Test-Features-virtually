package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import p067l.C6988;

/* JADX INFO: loaded from: classes2.dex */
public class MethodContact implements Contact {
    public MethodPart get;
    public Class item;
    public Class[] items;
    public Annotation label;
    public String name;
    public Class owner;
    public MethodPart set;
    public Class type;

    public MethodContact(MethodPart methodPart) {
        this(methodPart, null);
    }

    public MethodContact(MethodPart methodPart, MethodPart methodPart2) {
        this.owner = methodPart.getDeclaringClass();
        this.label = methodPart.getAnnotation();
        this.items = methodPart.getDependents();
        this.item = methodPart.getDependent();
        this.type = methodPart.getType();
        this.name = methodPart.getName();
        this.set = methodPart2;
        this.get = methodPart;
    }

    @Override // org.simpleframework.xml.core.Contact
    public boolean isReadOnly() {
        return this.set == null;
    }

    public MethodPart getRead() {
        return this.get;
    }

    public MethodPart getWrite() {
        return this.set;
    }

    @Override // org.simpleframework.xml.core.Contact
    public Annotation getAnnotation() {
        return this.label;
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Annotation getAnnotation(Class cls) {
        MethodPart methodPart;
        Annotation annotation = this.get.getAnnotation(cls);
        if (cls == this.label.annotationType()) {
            return this.label;
        }
        return (annotation != null || (methodPart = this.set) == null) ? annotation : methodPart.getAnnotation(cls);
    }

    @Override // org.simpleframework.xml.strategy.Type
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.core.Contact
    public Class getDependent() {
        return this.item;
    }

    @Override // org.simpleframework.xml.core.Contact
    public Class[] getDependents() {
        return this.items;
    }

    @Override // org.simpleframework.xml.core.Contact
    public Class getDeclaringClass() {
        return this.owner;
    }

    @Override // org.simpleframework.xml.core.Contact
    public String getName() {
        return this.name;
    }

    @Override // org.simpleframework.xml.core.Contact
    public void set(Object obj, Object obj2) throws IllegalAccessException, MethodException, InvocationTargetException {
        Class<?> declaringClass = this.get.getMethod().getDeclaringClass();
        MethodPart methodPart = this.set;
        if (methodPart == null) {
            throw new MethodException("Property '%s' is read only in %s", this.name, declaringClass);
        }
        methodPart.getMethod().invoke(obj, obj2);
    }

    @Override // org.simpleframework.xml.core.Contact
    public Object get(Object obj) {
        return this.get.getMethod().invoke(obj, null);
    }

    @Override // org.simpleframework.xml.core.Contact, org.simpleframework.xml.strategy.Type
    public String toString() {
        return C6988.m16053("method '", this.name, "'");
    }
}
