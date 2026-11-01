package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4921 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6262 f11206;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4921(C6262 c6262) {
        this.f11206 = c6262;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C6262 c6262 = this.f11206;
        C14268 c14268 = c6262.f15843;
        if (c6262.f15844) {
            throw new IOException("closed");
        }
        if (c14268.f40649 == 0 && c6262.f15842.mo6580(c14268, 8192L) == -1) {
            return -1;
        }
        return c14268.readByte() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C6262 c6262 = this.f11206;
        C14268 c14268 = c6262.f15843;
        if (c6262.f15844) {
            throw new IOException("closed");
        }
        C23026.m51409(bArr.length, i, i2);
        if (c14268.f40649 == 0 && c6262.f15842.mo6580(c14268, 8192L) == -1) {
            return -1;
        }
        return c14268.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C6262 c6262 = this.f11206;
        if (c6262.f15844) {
            throw new IOException("closed");
        }
        return (int) Math.min(c6262.f15843.f40649, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11206.close();
    }

    public final String toString() {
        return this.f11206 + ".inputStream()";
    }
}
