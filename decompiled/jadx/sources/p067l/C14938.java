package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14938 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14268 f42657;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C14938(C14268 c14268) {
        this.f42657 = c14268;
    }

    @Override // java.io.InputStream
    public final int read() {
        C14268 c14268 = this.f42657;
        if (c14268.f40649 > 0) {
            return c14268.readByte() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f42657.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f42657.f40649, 2147483647L);
    }

    public final String toString() {
        return this.f42657 + ".inputStream()";
    }
}
