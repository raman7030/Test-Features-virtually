package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.۫֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12089 implements InterfaceC5508 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7582 f36154;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11384 f36155;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f36156;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f36157;

    public C12089(C11384 c11384, long j) {
        this.f36155 = c11384;
        this.f36154 = new C7582(c11384.f34053.mo8912());
        this.f36156 = j;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f36154;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) throws ProtocolException {
        if (this.f36157) {
            throw new IllegalStateException("closed");
        }
        long size = c12521.size();
        byte[] bArr = C20032.f64884;
        if (j < 0 || 0 > size || size < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j > this.f36156) {
            throw new ProtocolException("expected " + this.f36156 + " bytes but received " + j);
        }
        this.f36155.f34053.mo8911(c12521, j);
        this.f36156 -= j;
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        if (this.f36157) {
            return;
        }
        this.f36155.f34053.flush();
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f36157) {
            return;
        }
        this.f36157 = true;
        if (this.f36156 <= 0) {
            C7582 c7582 = this.f36154;
            C15384 c15384M20334 = c7582.m20334();
            c7582.m20327();
            c15384M20334.mo20325();
            c15384M20334.mo20328();
            this.f36155.f34054 = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }
}
