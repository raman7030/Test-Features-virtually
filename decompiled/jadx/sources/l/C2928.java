package l;

/* JADX INFO: renamed from: l.ۗ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2928 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12100 f9310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9311;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8933(int i, boolean z) {
        if (this.f9309) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Dirty run length must be positive");
        }
        int i2 = this.f9311;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f9311 = i2 + i;
        this.f9310 = C13510.m32561(this.f9310, C13510.m32552(i, z));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8934(int i, long[] jArr) {
        if (this.f9309) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0 || i > 65536 || jArr.length != C13510.m32559(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0 && (jArr[jArr.length - 1] >>> i2) != 0) {
            throw new IllegalArgumentException("Dirty bitmap has trailing bits");
        }
        if (((long) this.f9311) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        C12100 c12100M32560 = C13510.m32560(i, jArr);
        if (!c12100M32560.m29514()) {
            throw new IllegalArgumentException("Uniform dirty bitmap is not canonical");
        }
        this.f9311 += i;
        this.f9310 = C13510.m32561(this.f9310, c12100M32560);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 m8932() {
        if (this.f9309) {
            throw new IllegalStateException("Dirty builder already built");
        }
        this.f9309 = true;
        return this.f9310;
    }
}
