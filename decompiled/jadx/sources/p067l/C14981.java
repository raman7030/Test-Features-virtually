package p067l;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.۬ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14981 implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Type f42806;

    public C14981(Type type) {
        C12826.requireNonNull(type);
        this.f42806 = C8276.m19063(type);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f42806;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C8276.m19066(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.f42806.hashCode();
    }

    public final String toString() {
        return C8276.m19071(this.f42806) + "[]";
    }
}
