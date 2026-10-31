package l;

/* JADX INFO: renamed from: l.۠ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8370 implements InterfaceC1377 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12312 f25682;

    @Override // l.InterfaceC1377
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo2559(byte[] bArr) {
        return C5611.m15916(this, bArr);
    }

    public C8370(InterfaceC12312 interfaceC12312) {
        this.f25682 = interfaceC12312;
    }

    @Override // l.InterfaceC1377
    public final int read(byte[] bArr, int i, int i2) {
        return ((C10674) this.f25682).read(bArr, i, i2);
    }

    @Override // l.InterfaceC1377
    public final void seek(long j) {
        ((C10674) this.f25682).seek(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C10674) this.f25682).close();
    }
}
