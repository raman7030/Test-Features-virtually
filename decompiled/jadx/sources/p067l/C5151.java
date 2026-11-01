package p067l;

/* JADX INFO: renamed from: l.ۗ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5151 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f12108;

    /* JADX INFO: renamed from: ۧ */
    public C13868 f12109;

    /* JADX INFO: renamed from: ܽ */
    public int f12110;

    /* JADX INFO: renamed from: ֫ */
    public final void m11001(int i, boolean z) {
        if (this.f12108) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Dirty run length must be positive");
        }
        int i2 = this.f12110;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f12110 = i2 + i;
        this.f12109 = C15208.m34663(this.f12109, C15208.m34654(i, z));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11002(int i, long[] jArr) {
        if (this.f12108) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0 || i > 65536 || jArr.length != C15208.m34661(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0 && (jArr[jArr.length - 1] >>> i2) != 0) {
            throw new IllegalArgumentException("Dirty bitmap has trailing bits");
        }
        if (((long) this.f12110) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        C13868 c13868M34662 = C15208.m34662(i, jArr);
        if (!c13868M34662.m31577()) {
            throw new IllegalArgumentException("Uniform dirty bitmap is not canonical");
        }
        this.f12110 += i;
        this.f12109 = C15208.m34663(this.f12109, c13868M34662);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13868 m11000() {
        if (this.f12108) {
            throw new IllegalStateException("Dirty builder already built");
        }
        this.f12108 = true;
        return this.f12109;
    }
}
