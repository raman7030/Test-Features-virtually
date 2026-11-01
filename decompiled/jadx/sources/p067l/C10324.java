package p067l;

/* JADX INFO: renamed from: l.۠ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10324 implements InterfaceC3678 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC14070 f28595;

    @Override // p067l.InterfaceC3678
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo4915(byte[] bArr) {
        return C7702.m17837(this, bArr);
    }

    public C10324(InterfaceC14070 interfaceC14070) {
        this.f28595 = interfaceC14070;
    }

    @Override // p067l.InterfaceC3678
    public final int read(byte[] bArr, int i, int i2) {
        return ((C12513) this.f28595).read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC3678
    public final void seek(long j) {
        ((C12513) this.f28595).seek(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C12513) this.f28595).close();
    }
}
