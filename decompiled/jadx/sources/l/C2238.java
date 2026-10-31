package l;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۖۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2238 extends OutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f7304;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final MessageDigest f7305;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final OutputStream f7306;

    public C2238(OutputStream outputStream, MessageDigest messageDigest) {
        this.f7306 = outputStream;
        this.f7305 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f7306.write(i);
        this.f7305.update((byte) i);
        long j = this.f7304;
        long j2 = 1;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f7304 = j + j2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f7306.write(bArr, i, i2);
        this.f7305.update(bArr, i, i2);
        long j = this.f7304;
        long j2 = i2;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f7304 = j + j2;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f7306.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7306.close();
    }
}
