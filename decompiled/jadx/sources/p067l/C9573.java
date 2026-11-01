package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 880P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9573 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public final InputStream f26360;

    /* JADX INFO: renamed from: ᩶ */
    public final long f26361;

    /* JADX INFO: renamed from: ᩸ */
    public long f26362;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f26363;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C9573(long j, InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream cannot be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Max size cannot be negative");
        }
        this.f26360 = inputStream;
        this.f26361 = j;
        this.f26362 = 0L;
        this.f26363 = false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f26363) {
            throw new IOException("Stream is closed");
        }
        if (this.f26362 >= this.f26361) {
            return -1;
        }
        int i = this.f26360.read();
        if (i != -1) {
            this.f26362++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f26363) {
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
        long j = this.f26362;
        long j2 = this.f26361;
        if (j >= j2) {
            return -1;
        }
        int i3 = this.f26360.read(bArr, i, (int) Math.min(i2, j2 - j));
        if (i3 > 0) {
            this.f26362 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f26363) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f26360.skip(Math.min(j, this.f26361 - this.f26362));
        this.f26362 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f26363) {
            throw new IOException("Stream is closed");
        }
        return (int) Math.min(this.f26360.available(), this.f26361 - this.f26362);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26363) {
            return;
        }
        this.f26363 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m22301() {
        return this.f26362;
    }
}
