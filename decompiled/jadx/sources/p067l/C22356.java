package p067l;

/* JADX INFO: renamed from: l.᩷ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes5.dex */
public final class C22356 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11627 f70556;

    /* JADX INFO: renamed from: ᩹ */
    public final C16989 f70557 = new C16989();

    public C22356(C11627 c11627) {
        this.f70556 = c11627;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) {
        synchronized (this.f70556.f32448) {
            if (this.f70556.f32450) {
                throw new IllegalStateException("closed");
            }
            while (true) {
                C11627 c11627 = this.f70556;
                C14268 c14269 = c11627.f32448;
                if (c14269.f40649 == 0) {
                    if (c11627.f32453) {
                        return -1L;
                    }
                    this.f70557.m38577(c14269);
                } else {
                    long jMo6580 = c14269.mo6580(c14268, 8192L);
                    this.f70556.f32448.notifyAll();
                    return jMo6580;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f70556.f32448) {
            C11627 c11627 = this.f70556;
            c11627.f32450 = true;
            c11627.f32448.notifyAll();
        }
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f70557;
    }
}
