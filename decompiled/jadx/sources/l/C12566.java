package l;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12566 implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type[] f37876;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Type f37877;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Type f37878;

    public C12566(Type type, Class cls, Type... typeArr) {
        C11003.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f37877 = type == null ? null : C6216.m17131(type);
        this.f37878 = C6216.m17131(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f37876 = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            C11003.requireNonNull(this.f37876[i]);
            C6216.m17136(this.f37876[i]);
            Type[] typeArr3 = this.f37876;
            typeArr3[i] = C6216.m17131(typeArr3[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f37876.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f37878;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f37877;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C6216.m17134(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f37876) ^ this.f37878.hashCode();
        Type type = this.f37877;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f37876;
        int length = typeArr.length;
        Type type = this.f37878;
        if (length == 0) {
            return C6216.m17139(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C6216.m17139(type));
        sb.append("<");
        sb.append(C6216.m17139(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(C6216.m17139(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
