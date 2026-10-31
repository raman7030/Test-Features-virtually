package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19441 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f62880;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f62881;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11679 f62882;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f62883;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f62884 = new byte[1];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f62885;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC17066 f62886;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f62887;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C19441(AbstractC22967 abstractC22967, C9189 c9189) {
        this.f62883 = abstractC22967;
        this.f62886 = c9189;
        this.f62882 = abstractC22967.mo6179();
        this.f62887 = new BufferedInputStream(abstractC22967.mo6178(), 32768);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f62884;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f62881 = this.f62880;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        long j;
        long j2;
        AbstractC22967 abstractC22967 = this.f62883;
        try {
            IOException iOException = this.f62885;
            if (iOException == null) {
                AbstractC22967.m51107(this.f62886);
                abstractC22967.m51108(this.f62882);
                close();
                this.f62887 = new BufferedInputStream(abstractC22967.mo6178(), 32768);
                this.f62880 = 0L;
                byte[] bArr = new byte[1024];
                do {
                    j = this.f62880;
                    j2 = this.f62881;
                    if (j >= j2) {
                        return;
                    }
                } while (read(bArr, 0, (int) Math.min(1024, j2 - j)) >= 0);
                throw new IOException("GIF rewind reached end of input");
            }
            throw iOException;
        } catch (IOException e) {
            this.f62885 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            IOException iOException = this.f62885;
            if (iOException == null) {
                AbstractC22967.m51107(this.f62886);
                BufferedInputStream bufferedInputStream = this.f62887;
                if (bufferedInputStream == null) {
                    throw new InterruptedIOException("GIF input is closed");
                }
                int i3 = bufferedInputStream.read(bArr, i, (int) Math.min(i2, 268435457 - this.f62880));
                if (i3 > 0) {
                    long j = this.f62880 + ((long) i3);
                    this.f62880 = j;
                    if (j > 268435456) {
                        throw new IOException("GIF input exceeds byte limit");
                    }
                }
                return i3;
            }
            throw iOException;
        } catch (IOException e) {
            this.f62885 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        BufferedInputStream bufferedInputStream = this.f62887;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
            this.f62887 = null;
        }
    }
}
