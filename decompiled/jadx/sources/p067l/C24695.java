package p067l;

/* JADX INFO: renamed from: l.᩻ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes.dex */
public final class C24695 {

    /* JADX INFO: renamed from: ֫ */
    public int f78174;

    /* JADX INFO: renamed from: ۧ */
    public long f78175;

    public C24695(C5738 c5738) {
        this.f78175 = c5738.getSize();
        this.f78174 = c5738.m12763();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24695.class == obj.getClass()) {
            C24695 c24695 = (C24695) obj;
            if (this.f78175 == c24695.f78175 && this.f78174 == c24695.f78174) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f78175;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f78174;
    }
}
