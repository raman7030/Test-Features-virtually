package l;

/* JADX INFO: renamed from: l.ܿۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17191 extends C15688 {
    /* JADX INFO: renamed from: ֫ */
    public void mo29864(C16477 c16477) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C15688
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return C11003.equals(mo24428(), ((AbstractC17191) obj).mo24428());
        }
        return false;
    }

    @Override // l.C15688
    public final int hashCode() {
        int iHashCode = super.hashCode();
        C16477 c16477Mo24428 = mo24428();
        return (iHashCode * 31) + (c16477Mo24428 != null ? c16477Mo24428.hashCode() : 0);
    }
}
