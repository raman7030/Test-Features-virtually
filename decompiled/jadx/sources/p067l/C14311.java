package p067l;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14311 implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶ */
    public final Type[] f40902;

    /* JADX INFO: renamed from: ᩸ */
    public final Type f40903;

    /* JADX INFO: renamed from: ᩹ */
    public final Type f40904;

    public C14311(Type type, Class cls, Type... typeArr) {
        C12826.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f40903 = type == null ? null : C8276.m19063(type);
        this.f40904 = C8276.m19063(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f40902 = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            C12826.requireNonNull(this.f40902[i]);
            C8276.m19068(this.f40902[i]);
            Type[] typeArr3 = this.f40902;
            typeArr3[i] = C8276.m19063(typeArr3[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f40902.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f40904;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f40903;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C8276.m19066(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f40902) ^ this.f40904.hashCode();
        Type type = this.f40903;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f40902;
        int length = typeArr.length;
        Type type = this.f40904;
        if (length == 0) {
            return C8276.m19071(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C8276.m19071(type));
        sb.append("<");
        sb.append(C8276.m19071(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(C8276.m19071(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
