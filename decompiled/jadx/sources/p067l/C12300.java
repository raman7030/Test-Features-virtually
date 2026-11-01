package p067l;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ۤᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12300 implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Type f34335;

    /* JADX INFO: renamed from: ᩹ */
    public final Type f34336;

    public C12300(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length == 1) {
            C12826.requireNonNull(typeArr2[0]);
            C8276.m19068(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f34335 = C8276.m19063(typeArr2[0]);
            this.f34336 = Object.class;
            return;
        }
        C12826.requireNonNull(typeArr[0]);
        C8276.m19068(typeArr[0]);
        this.f34335 = null;
        this.f34336 = C8276.m19063(typeArr[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f34336};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f34335;
        return type != null ? new Type[]{type} : C8276.f21917;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C8276.m19066(this, (WildcardType) obj);
    }

    public final int hashCode() {
        Type type = this.f34335;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f34336.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f34335;
        if (type != null) {
            return "? super " + C8276.m19071(type);
        }
        Type type2 = this.f34336;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + C8276.m19071(type2);
    }
}
