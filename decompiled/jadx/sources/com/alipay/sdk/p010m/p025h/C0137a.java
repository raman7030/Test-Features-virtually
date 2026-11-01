package com.alipay.sdk.p010m.p025h;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alipay.sdk.m.h.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0137a {
    /* JADX INFO: renamed from: a */
    public static Class m682a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m682a(((ParameterizedType) type).getRawType());
        }
        throw new IllegalArgumentException("TODO");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m683a(Class cls) {
        return cls.isPrimitive() || cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(Boolean.class) || cls.equals(Short.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Void.class);
    }
}
