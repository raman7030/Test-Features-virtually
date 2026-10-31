package l;

/* JADX INFO: renamed from: l.ۚ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5377 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1143 f16729;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f16730 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f16731;

    public C5377(C1143 c1143, long j) {
        this.f16729 = c1143;
        this.f16731 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5377 m15350(long j) {
        synchronized (this.f16729) {
            if (!this.f16730) {
                throw new IllegalStateException("Workspace reservation is closed");
            }
        }
        return this.f16729.m3921(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f16729) {
            if (this.f16730) {
                this.f16730 = false;
                this.f16729.f4151 -= this.f16731;
                this.f16729.notifyAll();
            }
        }
    }
}
