package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2686 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4097 f8412;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2686(C4097 c4097) {
        this.f8412 = c4097;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C4097 c4097 = this.f8412;
        C12521 c12521 = c4097.f13029;
        if (c4097.f13030) {
            throw new IOException("closed");
        }
        if (c12521.f37625 == 0 && c4097.f13028.mo4334(c12521, 8192L) == -1) {
            return -1;
        }
        return c12521.readByte() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C4097 c4097 = this.f8412;
        C12521 c12521 = c4097.f13029;
        if (c4097.f13030) {
            throw new IOException("closed");
        }
        C21736.m49060(bArr.length, i, i2);
        if (c12521.f37625 == 0 && c4097.f13028.mo4334(c12521, 8192L) == -1) {
            return -1;
        }
        return c12521.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C4097 c4097 = this.f8412;
        if (c4097.f13030) {
            throw new IOException("closed");
        }
        return (int) Math.min(c4097.f13029.f37625, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8412.close();
    }

    public final String toString() {
        return this.f8412 + ".inputStream()";
    }
}
