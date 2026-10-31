package l;

/* JADX INFO: renamed from: l.۟᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7693 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23763;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1594 f23764;

    public C7693(C1594 c1594, int i) {
        this.f23764 = c1594;
        this.f23762 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20582(C7693 c7693, int i) {
        int i2;
        if (c7693.f23763 || i < 0 || i > (i2 = c7693.f23762)) {
            throw new IllegalStateException("Preview memory reservation is invalid");
        }
        c7693.f23762 = i2 - i;
        c7693.f23764.f5643 -= i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f23763) {
            return;
        }
        this.f23763 = true;
        C1594.m5451(this.f23764, this);
    }
}
