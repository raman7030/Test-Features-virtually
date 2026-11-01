package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J56M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17338 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC12093 f51718;

    @Override // p067l.AbstractC12093
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24450(Object obj, Object obj2) {
        throw null;
    }

    public C17338(AbstractC12093 abstractC12093) {
        this.f51718 = abstractC12093;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f51718.compare(obj2, obj);
    }

    @Override // p067l.AbstractC12093
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12093 mo24451() {
        return this.f51718;
    }

    public final int hashCode() {
        return -this.f51718.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17338) {
            return this.f51718.equals(((C17338) obj).f51718);
        }
        return false;
    }

    public final String toString() {
        return this.f51718 + ".reverse()";
    }
}
