package l;

/* JADX INFO: renamed from: l.ۗ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2917 implements InterfaceC5508 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7582 f9282;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f9283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11384 f9284;

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f9283) {
            return;
        }
        this.f9283 = true;
        this.f9284.f34053.mo26251("0\r\n\r\n");
        C7582 c7582 = this.f9282;
        C15384 c15384M20334 = c7582.m20334();
        c7582.m20327();
        c15384M20334.mo20325();
        c15384M20334.mo20328();
        this.f9284.f34054 = 3;
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public final synchronized void flush() {
        if (this.f9283) {
            return;
        }
        this.f9284.f34053.flush();
    }

    public C2917(C11384 c11384) {
        this.f9284 = c11384;
        this.f9282 = new C7582(c11384.f34053.mo8912());
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15384 mo8912() {
        return this.f9282;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8911(C12521 c12521, long j) {
        InterfaceC10405 interfaceC10405 = this.f9284.f34053;
        if (this.f9283) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        interfaceC10405.mo26247(j);
        interfaceC10405.mo26251("\r\n");
        interfaceC10405.mo8911(c12521, j);
        interfaceC10405.mo26251("\r\n");
    }
}
