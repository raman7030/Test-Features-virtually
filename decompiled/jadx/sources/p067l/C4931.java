package p067l;

/* JADX INFO: renamed from: l.ۖᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4931 {

    /* JADX INFO: renamed from: ֫ */
    public final long f11231;

    /* JADX INFO: renamed from: ۧ */
    public final long f11232;

    public C4931(long j, long j2) {
        this.f11232 = j;
        this.f11231 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4931)) {
            return false;
        }
        C4931 c4931 = (C4931) obj;
        return this.f11232 == c4931.f11232 && this.f11231 == c4931.f11231;
    }

    public final int hashCode() {
        return (((int) this.f11232) * 31) + ((int) this.f11231);
    }
}
