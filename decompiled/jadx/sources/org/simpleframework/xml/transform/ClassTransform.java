package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class ClassTransform implements Transform {
    public static final String BOOLEAN = "boolean";
    public static final String BYTE = "byte";
    public static final String CHARACTER = "char";
    public static final String DOUBLE = "double";
    public static final String FLOAT = "float";
    public static final String INTEGER = "int";
    public static final String LONG = "long";
    public static final String SHORT = "short";
    public static final String VOID = "void";

    @Override // org.simpleframework.xml.transform.Transform
    public Class read(String str) {
        Class primitive = readPrimitive(str);
        if (primitive != null) {
            return primitive;
        }
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = getCallerClassLoader();
        }
        return classLoader.loadClass(str);
    }

    private Class readPrimitive(String str) {
        if (str.equals(BYTE)) {
            return Byte.TYPE;
        }
        if (str.equals(SHORT)) {
            return Short.TYPE;
        }
        if (str.equals(INTEGER)) {
            return Integer.TYPE;
        }
        if (str.equals(LONG)) {
            return Long.TYPE;
        }
        if (str.equals(CHARACTER)) {
            return Character.TYPE;
        }
        if (str.equals(FLOAT)) {
            return Float.TYPE;
        }
        if (str.equals(DOUBLE)) {
            return Double.TYPE;
        }
        if (str.equals(BOOLEAN)) {
            return Boolean.TYPE;
        }
        if (str.equals(VOID)) {
            return Void.TYPE;
        }
        return null;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Class cls) {
        return cls.getName();
    }

    private ClassLoader getCallerClassLoader() {
        return getClass().getClassLoader();
    }

    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
