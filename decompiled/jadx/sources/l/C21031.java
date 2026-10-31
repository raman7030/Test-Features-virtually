package l;

/* JADX INFO: renamed from: l.᩷ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21031 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9742 f67870;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15384 f67871 = new C15384();

    public C21031(C9742 c9742) {
        this.f67870 = c9742;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        synchronized (this.f67870.f29497) {
            if (this.f67870.f29499) {
                throw new IllegalStateException("closed");
            }
            while (true) {
                C9742 c9742 = this.f67870;
                C12521 c12522 = c9742.f29497;
                if (c12522.f37625 == 0) {
                    if (c9742.f29502) {
                        return -1L;
                    }
                    this.f67871.m36419(c12522);
                } else {
                    long jMo4334 = c12522.mo4334(c12521, 8192L);
                    this.f67870.f29497.notifyAll();
                    return jMo4334;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f67870.f29497) {
            C9742 c9742 = this.f67870;
            c9742.f29499 = true;
            c9742.f29497.notifyAll();
        }
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f67871;
    }
}
