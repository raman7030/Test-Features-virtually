package p067l;

/* JADX INFO: renamed from: l.ܺ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1US */
/* JADX INFO: loaded from: classes4.dex */
public final class C17532 {

    /* JADX INFO: renamed from: ֫ */
    public long f52396;

    /* JADX INFO: renamed from: ۧ */
    public long f52397;

    public C17532(long j, long j2) {
        this.f52397 = j;
        this.f52396 = j2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m39906() {
        return this.f52397;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m39905() {
        return this.f52396;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17532.class == obj.getClass()) {
            C17532 c17532 = (C17532) obj;
            if (this.f52397 == c17532.f52397 && this.f52396 == c17532.f52396) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f52397;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f52396;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
