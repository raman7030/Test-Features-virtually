package l;

/* JADX INFO: renamed from: l.ۖᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2696 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f8437;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f8438;

    public C2696(long j, long j2) {
        this.f8438 = j;
        this.f8437 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2696)) {
            return false;
        }
        C2696 c2696 = (C2696) obj;
        return this.f8438 == c2696.f8438 && this.f8437 == c2696.f8437;
    }

    public final int hashCode() {
        return (((int) this.f8438) * 31) + ((int) this.f8437);
    }
}
