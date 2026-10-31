package l;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2OJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9900 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f29949;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f29950;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f29950 = this.f29949;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f29950 == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f29949 = this.f29950;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C9900(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f29950 = -1L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m25003() {
        return this.f29949;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f29949++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.f29949 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.f29949 += jSkip;
        return jSkip;
    }
}
