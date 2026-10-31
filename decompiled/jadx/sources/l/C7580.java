package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 880P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7580 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f23449;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f23450;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f23451;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23452;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C7580(long j, InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream cannot be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Max size cannot be negative");
        }
        this.f23449 = inputStream;
        this.f23450 = j;
        this.f23451 = 0L;
        this.f23452 = false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f23452) {
            throw new IOException("Stream is closed");
        }
        if (this.f23451 >= this.f23450) {
            return -1;
        }
        int i = this.f23449.read();
        if (i != -1) {
            this.f23451++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f23452) {
            throw new IOException("Stream is closed");
        }
        if (bArr == null) {
            throw new NullPointerException("Buffer cannot be null");
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f23451;
        long j2 = this.f23450;
        if (j >= j2) {
            return -1;
        }
        int i3 = this.f23449.read(bArr, i, (int) Math.min(i2, j2 - j));
        if (i3 > 0) {
            this.f23451 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f23452) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f23449.skip(Math.min(j, this.f23450 - this.f23451));
        this.f23451 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f23452) {
            throw new IOException("Stream is closed");
        }
        return (int) Math.min(this.f23449.available(), this.f23450 - this.f23451);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23452) {
            return;
        }
        this.f23452 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m20324() {
        return this.f23451;
    }
}
