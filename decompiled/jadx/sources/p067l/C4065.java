package p067l;

/* JADX INFO: renamed from: l.֫ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C4065 {

    /* JADX INFO: renamed from: ֫ */
    public final long f8942;

    /* JADX INFO: renamed from: ۧ */
    public final long f8943;

    public C4065(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        this.f8943 = j;
        this.f8942 = j2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m8135() {
        return this.f8943;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m8133() {
        return this.f8942;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8134(C17182 c17182) {
        return c17182.mo25093() && this.f8943 == c17182.mo25101() && this.f8942 == c17182.mo25091();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4065) {
            C4065 c4065 = (C4065) obj;
            if (this.f8943 == c4065.f8943 && this.f8942 == c4065.f8942) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Long.valueOf(this.f8943), Long.valueOf(this.f8942));
    }

    public final String toString() {
        return "FileRevision{length=" + this.f8943 + ", lastModified=" + this.f8942 + '}';
    }
}
