package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J56M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15751 extends AbstractC10232 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10232 f48578;

    @Override // l.AbstractC10232
    /* JADX INFO: renamed from: ֫ */
    public final Object mo22481(Object obj, Object obj2) {
        throw null;
    }

    public C15751(AbstractC10232 abstractC10232) {
        this.f48578 = abstractC10232;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f48578.compare(obj2, obj);
    }

    @Override // l.AbstractC10232
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10232 mo22482() {
        return this.f48578;
    }

    public final int hashCode() {
        return -this.f48578.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15751) {
            return this.f48578.equals(((C15751) obj).f48578);
        }
        return false;
    }

    public final String toString() {
        return this.f48578 + ".reverse()";
    }
}
