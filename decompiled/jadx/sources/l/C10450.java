package l;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ۤᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10450 implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Type f31372;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Type f31373;

    public C10450(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length == 1) {
            C11003.requireNonNull(typeArr2[0]);
            C6216.m17136(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f31372 = C6216.m17131(typeArr2[0]);
            this.f31373 = Object.class;
            return;
        }
        C11003.requireNonNull(typeArr[0]);
        C6216.m17136(typeArr[0]);
        this.f31372 = null;
        this.f31373 = C6216.m17131(typeArr[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f31373};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f31372;
        return type != null ? new Type[]{type} : C6216.f19054;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C6216.m17134(this, (WildcardType) obj);
    }

    public final int hashCode() {
        Type type = this.f31372;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f31373.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f31372;
        if (type != null) {
            return "? super " + C6216.m17139(type);
        }
        Type type2 = this.f31373;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + C6216.m17139(type2);
    }
}
