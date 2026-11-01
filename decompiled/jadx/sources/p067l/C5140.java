package p067l;

/* JADX INFO: renamed from: l.ۗ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5140 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ᩶ */
    public final C9574 f12081;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f12082;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C13187 f12083;

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12082) {
            return;
        }
        this.f12082 = true;
        this.f12083.f37051.mo28280("0\r\n\r\n");
        C9574 c9574 = this.f12081;
        C16989 c16989M22311 = c9574.m22311();
        c9574.m22304();
        c16989M22311.mo22302();
        c16989M22311.mo22305();
        this.f12083.f37052 = 3;
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final synchronized void flush() {
        if (this.f12082) {
            return;
        }
        this.f12083.f37051.flush();
    }

    public C5140(C13187 c13187) {
        this.f12083 = c13187;
        this.f12081 = new C9574(c13187.f37051.mo10980());
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f12081;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) {
        InterfaceC12257 interfaceC12257 = this.f12083.f37051;
        if (this.f12082) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        interfaceC12257.mo28276(j);
        interfaceC12257.mo28280("\r\n");
        interfaceC12257.mo10979(c14268, j);
        interfaceC12257.mo28280("\r\n");
    }
}
