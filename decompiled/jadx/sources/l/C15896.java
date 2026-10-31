package l;

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
public final class C15896 implements Comparable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f49113;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Class f49114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f49115;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f49116;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f49117;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f49118;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f49119;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f49120;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Type f49121;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f49122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f49123;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Field f49124;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] f49125;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Class f49126;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Method f49127;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12966 m37672() {
        return null;
    }

    public C15896(String str, Class cls, Class cls2, Type type, Field field, int i, int i2) {
        this.f49113 = 0;
        i = i < 0 ? 0 : i;
        this.f49123 = str;
        this.f49126 = cls;
        this.f49114 = cls2;
        this.f49121 = type;
        this.f49127 = null;
        this.f49124 = field;
        this.f49113 = i;
        this.f49119 = i2;
        this.f49120 = cls2.isEnum() && !InterfaceC8028.class.isAssignableFrom(cls2);
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f49115 = true;
            this.f49122 = Modifier.isTransient(modifiers);
        } else {
            this.f49115 = false;
            this.f49122 = false;
        }
        this.f49116 = false;
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f49117 = jCharAt;
        this.f49118 = null;
        this.f49125 = new String[0];
    }

    public C15896(String str, Method method, Field field, Class cls, Type type, int i, int i2, InterfaceC12966 interfaceC12966, InterfaceC12966 interfaceC12967) {
        String str2;
        Type genericType;
        Class<?> returnType;
        boolean z = false;
        this.f49113 = 0;
        i = i < 0 ? 0 : i;
        this.f49123 = str;
        this.f49127 = method;
        this.f49124 = field;
        this.f49113 = i;
        this.f49119 = i2;
        InterfaceC12966 interfaceC12966M37672 = m37672();
        Type type2 = null;
        if (interfaceC12966M37672 != null) {
            str2 = interfaceC12966M37672.format();
            str2 = str2.trim().length() == 0 ? null : str2;
            this.f49125 = interfaceC12966M37672.alternateNames();
        } else {
            this.f49125 = new String[0];
            str2 = null;
        }
        this.f49118 = str2;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f49115 = method == null || ((modifiers & 1) != 0 && method.getReturnType() == field.getType());
            this.f49122 = (modifiers & 128) != 0;
        } else {
            this.f49115 = false;
            this.f49122 = false;
        }
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f49117 = jCharAt;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                returnType = parameterTypes[0];
                genericType = (returnType == Class.class || returnType == String.class || returnType.isPrimitive()) ? returnType : method.getGenericParameterTypes()[0];
                this.f49116 = false;
            } else {
                returnType = method.getReturnType();
                genericType = returnType == Class.class ? returnType : method.getGenericReturnType();
                this.f49116 = true;
            }
            this.f49126 = method.getDeclaringClass();
        } else {
            Class<?> type3 = field.getType();
            genericType = (type3.isPrimitive() || type3 == String.class || type3.isEnum()) ? type3 : field.getGenericType();
            this.f49126 = field.getDeclaringClass();
            this.f49116 = Modifier.isFinal(field.getModifiers());
            returnType = type3;
        }
        if (returnType == Object.class && (genericType instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) genericType;
            Type[] actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : null;
            for (Class superclass = cls; superclass != null && superclass != Object.class && superclass != this.f49126; superclass = superclass.getSuperclass()) {
                Type genericSuperclass = superclass.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    C19426.m44744(actualTypeArguments2, superclass.getTypeParameters(), actualTypeArguments);
                    actualTypeArguments = actualTypeArguments2;
                }
            }
            if (actualTypeArguments != null) {
                TypeVariable[] typeParameters = this.f49126.getTypeParameters();
                for (int i4 = 0; i4 < typeParameters.length; i4++) {
                    if (typeVariable.equals(typeParameters[i4])) {
                        type2 = actualTypeArguments[i4];
                        break;
                    }
                }
            }
            if (type2 != null) {
                this.f49114 = C19426.m44730(type2);
                this.f49121 = type2;
                if (returnType.isEnum() && !InterfaceC8028.class.isAssignableFrom(returnType)) {
                    z = true;
                }
                this.f49120 = z;
                return;
            }
        }
        if (!(genericType instanceof Class)) {
            Type typeM37670 = m37670(cls, type == null ? cls : type, genericType);
            if (typeM37670 != genericType && ((typeM37670 instanceof ParameterizedType) || (typeM37670 instanceof Class))) {
                Class<?> clsM44730 = C19426.m44730(typeM37670);
                returnType = clsM44730;
            }
            genericType = typeM37670;
        }
        this.f49121 = genericType;
        this.f49114 = returnType;
        if (!returnType.isArray() && returnType.isEnum() && !InterfaceC8028.class.isAssignableFrom(returnType)) {
            z = true;
        }
        this.f49120 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Type m37670(Class cls, Type type, Type type2) {
        TypeVariable[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type typeM37670 = m37670(cls, type, genericComponentType);
                return genericComponentType != typeM37670 ? Array.newInstance((Class<?>) C19426.m44730(typeM37670), 0).getClass() : type2;
            }
            if (C19426.m44761(type)) {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) C19426.m44756(type);
                    Class clsM44730 = C19426.m44730((Type) parameterizedType2);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    for (int i = 0; i < clsM44730.getTypeParameters().length; i++) {
                        if (clsM44730.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
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
                        return new C18720(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
            }
        }
        return type2;
    }

    public final String toString() {
        return this.f49123;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C15896 c15896) {
        int i = c15896.f49113;
        int i2 = this.f49113;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f49123.compareTo(c15896.f49123);
    }
}
