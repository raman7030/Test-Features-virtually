package p067l;

/* JADX INFO: renamed from: l.ۚ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C7479 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C3455 f19567;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f19568 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final long f19569;

    public C7479(C3455 c3455, long j) {
        this.f19567 = c3455;
        this.f19569 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7479 m17259(long j) {
        synchronized (this.f19567) {
            if (!this.f19568) {
                throw new IllegalStateException("Workspace reservation is closed");
            }
        }
        return this.f19567.m6162(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f19567) {
            if (this.f19568) {
                this.f19568 = false;
                this.f19567.f6920 -= this.f19569;
                this.f19567.notifyAll();
            }
        }
    }
}
