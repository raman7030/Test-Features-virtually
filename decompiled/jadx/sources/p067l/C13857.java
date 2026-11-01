package p067l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.۫֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13857 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ۙ */
    public final C9574 f39165;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C13187 f39166;

    /* JADX INFO: renamed from: ᩸ */
    public long f39167;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f39168;

    public C13857(C13187 c13187, long j) {
        this.f39166 = c13187;
        this.f39165 = new C9574(c13187.f37051.mo10980());
        this.f39167 = j;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f39165;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) throws ProtocolException {
        if (this.f39168) {
            throw new IllegalStateException("closed");
        }
        long size = c14268.size();
        byte[] bArr = C21407.f67526;
        if (j < 0 || 0 > size || size < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j > this.f39167) {
            throw new ProtocolException("expected " + this.f39167 + " bytes but received " + j);
        }
        this.f39166.f37051.mo10979(c14268, j);
        this.f39167 -= j;
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
        if (this.f39168) {
            return;
        }
        this.f39166.f37051.flush();
    }

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f39168) {
            return;
        }
        this.f39168 = true;
        if (this.f39167 <= 0) {
            C9574 c9574 = this.f39165;
            C16989 c16989M22311 = c9574.m22311();
            c9574.m22304();
            c16989M22311.mo22302();
            c16989M22311.mo22305();
            this.f39166.f37052 = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }
}
