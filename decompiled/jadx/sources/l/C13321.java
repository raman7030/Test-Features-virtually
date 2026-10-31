package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C13321 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f39869;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0914 f39870;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f39871;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C13321(InputStream inputStream, long j, C0914 c0914) {
        super(inputStream);
        this.f39869 = Math.max(1L, j);
        this.f39870 = c0914;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C7677, C16290 {
        try {
            int i = super.read();
            if (i != -1) {
                m32302(1);
            }
            return i;
        } catch (IOException e) {
            throw new C7677(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C7677, C16290 {
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 > 0) {
                m32302(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C7677(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C7677(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32302(int i) throws C16290 {
        C0914 c0914 = this.f39870;
        if (c0914.m3271()) {
            throw new C16290();
        }
        long j = this.f39871 + ((long) i);
        this.f39871 = j;
        long j2 = this.f39869;
        c0914.m11541(Math.min(j, j2), j2);
    }
}
