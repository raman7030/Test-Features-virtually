package p067l;

/* JADX INFO: renamed from: l.᩺᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24481 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C9729 f77481;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f77482;

    /* JADX INFO: renamed from: ᩹ */
    public final C23831 f77483;

    public C24481(C9729 c9729, int i, int i2) {
        this.f77481 = c9729;
        this.f77483 = new C23831(c9729.f26879.m34522(), i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53980() {
        this.f77481.m22741();
        if (this.f77482) {
            throw new IllegalStateException("Line cursor is closed");
        }
        return this.f77483.m52903();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f77482) {
            return;
        }
        this.f77482 = true;
        this.f77483.close();
    }
}
