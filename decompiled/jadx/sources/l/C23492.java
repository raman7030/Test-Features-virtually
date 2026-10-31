package l;

/* JADX INFO: renamed from: l.᩻ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes.dex */
public final class C23492 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75427;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f75428;

    public C23492(C3545 c3545) {
        this.f75428 = c3545.getSize();
        this.f75427 = c3545.m10782();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23492.class == obj.getClass()) {
            C23492 c23492 = (C23492) obj;
            if (this.f75428 == c23492.f75428 && this.f75427 == c23492.f75427) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f75428;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f75427;
    }
}
