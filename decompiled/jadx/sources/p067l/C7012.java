package p067l;

/* JADX INFO: renamed from: l.ۙ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F8FX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7012 {

    /* JADX INFO: renamed from: ֫ */
    public final long f18269;

    /* JADX INFO: renamed from: ۧ */
    public final long f18270;

    public C7012(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("offset must not be negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        this.f18270 = j;
        this.f18269 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7012.class == obj.getClass()) {
            C7012 c7012 = (C7012) obj;
            if (this.f18270 == c7012.f18270 && this.f18269 == c7012.f18269) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m16133() {
        return this.f18269;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m16134() {
        return this.f18270;
    }

    public final int hashCode() {
        return C12826.hash(Long.valueOf(this.f18270), Long.valueOf(this.f18269));
    }

    public final String toString() {
        return "TarArchiveStructSparse{offset=" + this.f18270 + ", numbytes=" + this.f18269 + '}';
    }
}
