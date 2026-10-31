package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13226 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12521 f39593;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C13226(C12521 c12521) {
        this.f39593 = c12521;
    }

    @Override // java.io.InputStream
    public final int read() {
        C12521 c12521 = this.f39593;
        if (c12521.f37625 > 0) {
            return c12521.readByte() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f39593.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f39593.f37625, 2147483647L);
    }

    public final String toString() {
        return this.f39593 + ".inputStream()";
    }
}
