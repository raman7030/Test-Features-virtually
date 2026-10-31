package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0833 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f3010;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f3011;

    public C0833(long j, C23411 c23411) {
        this.f3010 = j;
        this.f3011 = c23411;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        long j = this.f3010;
        InterfaceC7889 interfaceC7889 = this.f3011;
        interfaceC7889.seek(j);
        this.f3010++;
        interfaceC7889.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        long j = this.f3010;
        InterfaceC7889 interfaceC7889 = this.f3011;
        interfaceC7889.seek(j);
        this.f3010 += (long) bArr.length;
        interfaceC7889.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        long j = this.f3010;
        InterfaceC7889 interfaceC7889 = this.f3011;
        interfaceC7889.seek(j);
        this.f3010 += (long) i2;
        interfaceC7889.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f3011.flush();
    }
}
