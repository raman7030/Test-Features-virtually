package l;

/* JADX INFO: renamed from: l.᩺᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23266 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7744 f74738;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f74739;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22582 f74740;

    public C23266(C7744 c7744, int i, int i2) {
        this.f74738 = c7744;
        this.f74740 = new C22582(c7744.f23966.m32420(), i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51584() {
        this.f74738.m20761();
        if (this.f74739) {
            throw new IllegalStateException("Line cursor is closed");
        }
        return this.f74740.m50561();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f74739) {
            return;
        }
        this.f74739 = true;
        this.f74740.close();
    }
}
