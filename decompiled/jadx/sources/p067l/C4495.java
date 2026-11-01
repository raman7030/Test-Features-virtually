package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۖۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4495 extends OutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public long f10092;

    /* JADX INFO: renamed from: ᩸ */
    public final MessageDigest f10093;

    /* JADX INFO: renamed from: ᩹ */
    public final OutputStream f10094;

    public C4495(OutputStream outputStream, MessageDigest messageDigest) {
        this.f10094 = outputStream;
        this.f10093 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f10094.write(i);
        this.f10093.update((byte) i);
        long j = this.f10092;
        long j2 = 1;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f10092 = j + j2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f10094.write(bArr, i, i2);
        this.f10093.update(bArr, i, i2);
        long j = this.f10092;
        long j2 = i2;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f10092 = j + j2;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f10094.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10094.close();
    }
}
