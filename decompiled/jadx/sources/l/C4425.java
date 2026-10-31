package l;

/* JADX INFO: renamed from: l.ۙۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4425 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10070 f14155;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21605 f14156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21605 f14157;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f14158;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8617 f14159;

    public C4425(C10070 c10070, C8617 c8617, C21605 c21605) {
        this.f14155 = c10070;
        this.f14159 = c8617;
        this.f14157 = c21605;
        this.f14156 = c21605;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13147() {
        synchronized (this.f14155) {
            if (this.f14158) {
                throw new IllegalStateException("Recovery generation already installed");
            }
            this.f14158 = true;
            this.f14156 = this.f14155.f30283;
            this.f14155.f30283 = this.f14157;
            this.f14155.f30282 = this.f14159;
            this.f14155.f30274 = false;
            this.f14155.getClass();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21605 c21605 = this.f14156;
        this.f14156 = null;
        if (c21605 != null) {
            c21605.m48812();
        }
    }
}
