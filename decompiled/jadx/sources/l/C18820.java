package l;

import java.io.BufferedInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18820 extends BufferedInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f59376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f59377;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        jSkip = super.skip(j);
        if (this.f59377 && jSkip > 0) {
            this.f59376 += jSkip;
        }
        return jSkip;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43484() {
        this.f59377 = true;
        this.f59376 = 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m43483() {
        return this.f59376;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        if (this.f59377 && i >= 0) {
            this.f59376++;
        }
        return i;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        if (this.f59377 && i3 > 0) {
            this.f59376 += (long) i3;
        }
        return i3;
    }
}
