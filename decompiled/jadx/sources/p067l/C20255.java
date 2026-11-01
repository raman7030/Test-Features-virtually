package p067l;

import java.io.BufferedInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20255 extends BufferedInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public long f62603;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f62604;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        jSkip = super.skip(j);
        if (this.f62604 && jSkip > 0) {
            this.f62603 += jSkip;
        }
        return jSkip;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45753() {
        this.f62604 = true;
        this.f62603 = 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m45752() {
        return this.f62603;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        if (this.f62604 && i >= 0) {
            this.f62603++;
        }
        return i;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        if (this.f62604 && i3 > 0) {
            this.f62603 += (long) i3;
        }
        return i3;
    }
}
