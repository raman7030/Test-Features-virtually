package l;

/* JADX INFO: renamed from: l.֫ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1785 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f6167;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f6168;

    public C1785(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        this.f6168 = j;
        this.f6167 = j2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m5940() {
        return this.f6168;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m5938() {
        return this.f6167;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5939(C15587 c15587) {
        return c15587.mo23119() && this.f6168 == c15587.mo23127() && this.f6167 == c15587.mo23117();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1785) {
            C1785 c1785 = (C1785) obj;
            if (this.f6168 == c1785.f6168 && this.f6167 == c1785.f6167) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Long.valueOf(this.f6168), Long.valueOf(this.f6167));
    }

    public final String toString() {
        return "FileRevision{length=" + this.f6168 + ", lastModified=" + this.f6167 + '}';
    }
}
