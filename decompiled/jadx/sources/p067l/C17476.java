package p067l;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: l.ܺۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17476 implements Comparable {

    /* JADX INFO: renamed from: ֫֫ */
    public int f52253;

    /* JADX INFO: renamed from: ۗ */
    public final Class f52254;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f52255;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f52256;

    /* JADX INFO: renamed from: ۟ */
    public final long f52257;

    /* JADX INFO: renamed from: ۤ */
    public final String f52258;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f52259;

    /* JADX INFO: renamed from: ۨ */
    public final boolean f52260;

    /* JADX INFO: renamed from: ۫ */
    public final Type f52261;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f52262;

    /* JADX INFO: renamed from: ܰ */
    public final String f52263;

    /* JADX INFO: renamed from: ᩶ */
    public final Field f52264;

    /* JADX INFO: renamed from: ᩸ */
    public final String[] f52265;

    /* JADX INFO: renamed from: ᩹ */
    public final Class f52266;

    /* JADX INFO: renamed from: ᩺ */
    public final Method f52267;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14691 m39845() {
        return null;
    }

    public C17476(String str, Class cls, Class cls2, Type type, Field field, int i, int i2) {
        this.f52253 = 0;
        i = i < 0 ? 0 : i;
        this.f52263 = str;
        this.f52266 = cls;
        this.f52254 = cls2;
        this.f52261 = type;
        this.f52267 = null;
        this.f52264 = field;
        this.f52253 = i;
        this.f52259 = i2;
        this.f52260 = cls2.isEnum() && !InterfaceC9998.class.isAssignableFrom(cls2);
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f52255 = true;
            this.f52262 = Modifier.isTransient(modifiers);
        } else {
            this.f52255 = false;
            this.f52262 = false;
        }
        this.f52256 = false;
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f52257 = jCharAt;
        this.f52258 = null;
        this.f52265 = new String[0];
    }

    public C17476(String str, Method method, Field field, Class cls, Type type, int i, int i2, InterfaceC14691 interfaceC14691, InterfaceC14691 interfaceC14692) {
        String str2;
        Type genericType;
        Class<?> returnType;
        boolean z = false;
        this.f52253 = 0;
        i = i < 0 ? 0 : i;
        this.f52263 = str;
        this.f52267 = method;
        this.f52264 = field;
        this.f52253 = i;
        this.f52259 = i2;
        InterfaceC14691 interfaceC14691M39845 = m39845();
        Type type2 = null;
        if (interfaceC14691M39845 != null) {
            str2 = interfaceC14691M39845.format();
            str2 = str2.trim().length() == 0 ? null : str2;
            this.f52265 = interfaceC14691M39845.alternateNames();
        } else {
            this.f52265 = new String[0];
            str2 = null;
        }
        this.f52258 = str2;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f52255 = method == null || ((modifiers & 1) != 0 && method.getReturnType() == field.getType());
            this.f52262 = (modifiers & 128) != 0;
        } else {
            this.f52255 = false;
            this.f52262 = false;
        }
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f52257 = jCharAt;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                returnType = parameterTypes[0];
                genericType = (returnType == Class.class || returnType == String.class || returnType.isPrimitive()) ? returnType : method.getGenericParameterTypes()[0];
                this.f52256 = false;
            } else {
                returnType = method.getReturnType();
                genericType = returnType == Class.class ? returnType : method.getGenericReturnType();
                this.f52256 = true;
            }
            this.f52266 = method.getDeclaringClass();
        } else {
            Class<?> type3 = field.getType();
            genericType = (type3.isPrimitive() || type3 == String.class || type3.isEnum()) ? type3 : field.getGenericType();
            this.f52266 = field.getDeclaringClass();
            this.f52256 = Modifier.isFinal(field.getModifiers());
            returnType = type3;
        }
        if (returnType == Object.class && (genericType instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) genericType;
            Type[] actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : null;
            for (Class superclass = cls; superclass != null && superclass != Object.class && superclass != this.f52266; superclass = superclass.getSuperclass()) {
                Type genericSuperclass = superclass.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    C20831.m47038(actualTypeArguments2, superclass.getTypeParameters(), actualTypeArguments);
                    actualTypeArguments = actualTypeArguments2;
                }
            }
            if (actualTypeArguments != null) {
                TypeVariable[] typeParameters = this.f52266.getTypeParameters();
                for (int i4 = 0; i4 < typeParameters.length; i4++) {
                    if (typeVariable.equals(typeParameters[i4])) {
                        type2 = actualTypeArguments[i4];
                        break;
                    }
                }
            }
            if (type2 != null) {
                this.f52254 = C20831.m47024(type2);
                this.f52261 = type2;
                if (returnType.isEnum() && !InterfaceC9998.class.isAssignableFrom(returnType)) {
                    z = true;
                }
                this.f52260 = z;
                return;
            }
        }
        if (!(genericType instanceof Class)) {
            Type typeM39843 = m39843(cls, type == null ? cls : type, genericType);
            if (typeM39843 != genericType && ((typeM39843 instanceof ParameterizedType) || (typeM39843 instanceof Class))) {
                Class<?> clsM47024 = C20831.m47024(typeM39843);
                returnType = clsM47024;
            }
            genericType = typeM39843;
        }
        this.f52261 = genericType;
        this.f52254 = returnType;
        if (!returnType.isArray() && returnType.isEnum() && !InterfaceC9998.class.isAssignableFrom(returnType)) {
            z = true;
        }
        this.f52260 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Type m39843(Class cls, Type type, Type type2) {
        TypeVariable[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type typeM39843 = m39843(cls, type, genericComponentType);
                return genericComponentType != typeM39843 ? Array.newInstance((Class<?>) C20831.m47024(typeM39843), 0).getClass() : type2;
            }
            if (C20831.m47055(type)) {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) C20831.m47050(type);
                    Class clsM47024 = C20831.m47024((Type) parameterizedType2);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    for (int i = 0; i < clsM47024.getTypeParameters().length; i++) {
                        if (clsM47024.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
                            return parameterizedType2.getActualTypeArguments()[i];
                        }
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                    Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                    Type[] actualTypeArguments2 = null;
                    if (type instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) type;
                        typeParameters = cls.getTypeParameters();
                    } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                        typeParameters = cls.getSuperclass().getTypeParameters();
                    } else {
                        typeParameters = null;
                        parameterizedType = null;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < actualTypeArguments.length && parameterizedType != null; i2++) {
                        Type type3 = actualTypeArguments[i2];
                        if (type3 instanceof TypeVariable) {
                            TypeVariable typeVariable2 = (TypeVariable) type3;
                            for (int i3 = 0; i3 < typeParameters.length; i3++) {
                                if (typeParameters[i3].getName().equals(typeVariable2.getName())) {
                                    if (actualTypeArguments2 == null) {
                                        actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                                    }
                                    actualTypeArguments[i2] = actualTypeArguments2[i3];
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        return new C20160(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
            }
        }
        return type2;
    }

    public final String toString() {
        return this.f52263;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C17476 c17476) {
        int i = c17476.f52253;
        int i2 = this.f52253;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f52263.compareTo(c17476.f52263);
    }
}
