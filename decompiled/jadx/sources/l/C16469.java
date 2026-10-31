package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ܽۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OG */
/* JADX INFO: loaded from: classes4.dex */
public class C16469 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50624;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class f50625;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Type f50626;

    public C16469() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C16469.class) {
                Type typeM17131 = C6216.m17131(parameterizedType.getActualTypeArguments()[0]);
                if (!C11003.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m38777(typeM17131);
                }
                this.f50626 = typeM17131;
                this.f50625 = C6216.m17138(typeM17131);
                this.f50624 = typeM17131.hashCode();
                return;
            }
        } else if (genericSuperclass == C16469.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public C16469(Type type) {
        C11003.requireNonNull(type);
        Type typeM17131 = C6216.m17131(type);
        this.f50626 = typeM17131;
        this.f50625 = C6216.m17138(typeM17131);
        this.f50624 = typeM17131.hashCode();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38777(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m38777(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m38777(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m38777(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m38777(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m38777(upperBounds[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class m38778() {
        return this.f50625;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Type m38779() {
        return this.f50626;
    }

    public final int hashCode() {
        return this.f50624;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16469) {
            return C6216.m17134(this.f50626, ((C16469) obj).f50626);
        }
        return false;
    }

    public final String toString() {
        return C6216.m17139(this.f50626);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16469 m38776(Type type) {
        return new C16469(type);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16469 m38775(Class cls) {
        return new C16469(cls);
    }
}
