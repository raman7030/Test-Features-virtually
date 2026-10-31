package l;

/* JADX INFO: renamed from: l.ۙ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F8FX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4886 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f15434;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f15435;

    public C4886(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("offset must not be negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        this.f15435 = j;
        this.f15434 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4886.class == obj.getClass()) {
            C4886 c4886 = (C4886) obj;
            if (this.f15435 == c4886.f15435 && this.f15434 == c4886.f15434) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14236() {
        return this.f15434;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m14237() {
        return this.f15435;
    }

    public final int hashCode() {
        return C11003.hash(Long.valueOf(this.f15435), Long.valueOf(this.f15434));
    }

    public final String toString() {
        return "TarArchiveStructSparse{offset=" + this.f15435 + ", numbytes=" + this.f15434 + '}';
    }
}
