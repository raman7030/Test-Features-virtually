package p067l;

/* JADX INFO: renamed from: l.۟֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C9128 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24701;

    /* JADX INFO: renamed from: ۧ */
    public final int f24702;

    /* JADX INFO: renamed from: ܽ */
    public final int f24703;

    public C9128(int i, int i2, int i3) {
        this.f24703 = i;
        this.f24702 = i2;
        this.f24701 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m21074() {
        return this.f24703;
    }

    public final String toString() {
        return this.f24702 + "," + this.f24701 + ":" + this.f24703;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9128.class == obj.getClass()) {
            C9128 c9128 = (C9128) obj;
            if (this.f24703 == c9128.f24703 && this.f24702 == c9128.f24702 && this.f24701 == c9128.f24701) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f24703 * 31) + this.f24702) * 31) + this.f24701;
    }
}
