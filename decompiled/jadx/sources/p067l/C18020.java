package p067l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ܽۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OG */
/* JADX INFO: loaded from: classes4.dex */
public class C18020 {

    /* JADX INFO: renamed from: ֫ */
    public final int f53802;

    /* JADX INFO: renamed from: ۧ */
    public final Class f53803;

    /* JADX INFO: renamed from: ܽ */
    public final Type f53804;

    public C18020() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C18020.class) {
                Type typeM19063 = C8276.m19063(parameterizedType.getActualTypeArguments()[0]);
                if (!C12826.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m41003(typeM19063);
                }
                this.f53804 = typeM19063;
                this.f53803 = C8276.m19070(typeM19063);
                this.f53802 = typeM19063.hashCode();
                return;
            }
        } else if (genericSuperclass == C18020.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public C18020(Type type) {
        C12826.requireNonNull(type);
        Type typeM19063 = C8276.m19063(type);
        this.f53804 = typeM19063;
        this.f53803 = C8276.m19070(typeM19063);
        this.f53802 = typeM19063.hashCode();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41003(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m41003(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m41003(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m41003(actualTypeArguments[i]);
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
            m41003(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m41003(upperBounds[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Class m41004() {
        return this.f53803;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Type m41005() {
        return this.f53804;
    }

    public final int hashCode() {
        return this.f53802;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18020) {
            return C8276.m19066(this.f53804, ((C18020) obj).f53804);
        }
        return false;
    }

    public final String toString() {
        return C8276.m19071(this.f53804);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18020 m41002(Type type) {
        return new C18020(type);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18020 m41001(Class cls) {
        return new C18020(cls);
    }
}
