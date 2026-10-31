package l;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.۬ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13271 implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Type f39741;

    public C13271(Type type) {
        C11003.requireNonNull(type);
        this.f39741 = C6216.m17131(type);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f39741;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C6216.m17134(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.f39741.hashCode();
    }

    public final String toString() {
        return C6216.m17139(this.f39741) + "[]";
    }
}
