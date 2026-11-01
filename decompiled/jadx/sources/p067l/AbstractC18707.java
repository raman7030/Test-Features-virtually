package p067l;

/* JADX INFO: renamed from: l.ܿۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18707 extends C17278 {
    /* JADX INFO: renamed from: ֫ */
    public void mo31924(C18028 c18028) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C17278
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return C12826.equals(mo26440(), ((AbstractC18707) obj).mo26440());
        }
        return false;
    }

    @Override // p067l.C17278
    public final int hashCode() {
        int iHashCode = super.hashCode();
        C18028 c18028Mo26440 = mo26440();
        return (iHashCode * 31) + (c18028Mo26440 != null ? c18028Mo26440.hashCode() : 0);
    }
}
