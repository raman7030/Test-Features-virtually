package p067l;

/* JADX INFO: renamed from: l.۟᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9680 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public int f26675;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f26676;

    /* JADX INFO: renamed from: ᩹ */
    public final C3883 f26677;

    public C9680(C3883 c3883, int i) {
        this.f26677 = c3883;
        this.f26675 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22562(C9680 c9680, int i) {
        int i2;
        if (c9680.f26676 || i < 0 || i > (i2 = c9680.f26675)) {
            throw new IllegalStateException("Preview memory reservation is invalid");
        }
        c9680.f26675 = i2 - i;
        c9680.f26677.f8422 -= i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f26676) {
            return;
        }
        this.f26676 = true;
        C3883.m7681(this.f26677, this);
    }
}
