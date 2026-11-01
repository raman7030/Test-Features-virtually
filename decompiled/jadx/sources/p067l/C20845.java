package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20845 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public long f65496;

    /* JADX INFO: renamed from: ۙ */
    public long f65497;

    /* JADX INFO: renamed from: ۤ */
    public final C13468 f65498;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC24196 f65499;

    /* JADX INFO: renamed from: ۬ */
    public final byte[] f65500 = new byte[1];

    /* JADX INFO: renamed from: ᩶ */
    public IOException f65501;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC18588 f65502;

    /* JADX INFO: renamed from: ᩹ */
    public BufferedInputStream f65503;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C20845(AbstractC24196 abstractC24196, C11102 c11102) {
        this.f65499 = abstractC24196;
        this.f65502 = c11102;
        this.f65498 = abstractC24196.mo8381();
        this.f65503 = new BufferedInputStream(abstractC24196.mo8380(), 32768);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f65500;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f65497 = this.f65496;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        long j;
        long j2;
        AbstractC24196 abstractC24196 = this.f65499;
        try {
            IOException iOException = this.f65501;
            if (iOException == null) {
                AbstractC24196.m53499(this.f65502);
                abstractC24196.m53500(this.f65498);
                close();
                this.f65503 = new BufferedInputStream(abstractC24196.mo8380(), 32768);
                this.f65496 = 0L;
                byte[] bArr = new byte[1024];
                do {
                    j = this.f65496;
                    j2 = this.f65497;
                    if (j >= j2) {
                        return;
                    }
                } while (read(bArr, 0, (int) Math.min(1024, j2 - j)) >= 0);
                throw new IOException("GIF rewind reached end of input");
            }
            throw iOException;
        } catch (IOException e) {
            this.f65501 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            IOException iOException = this.f65501;
            if (iOException == null) {
                AbstractC24196.m53499(this.f65502);
                BufferedInputStream bufferedInputStream = this.f65503;
                if (bufferedInputStream == null) {
                    throw new InterruptedIOException("GIF input is closed");
                }
                int i3 = bufferedInputStream.read(bArr, i, (int) Math.min(i2, 268435457 - this.f65496));
                if (i3 > 0) {
                    long j = this.f65496 + ((long) i3);
                    this.f65496 = j;
                    if (j > 268435456) {
                        throw new IOException("GIF input exceeds byte limit");
                    }
                }
                return i3;
            }
            throw iOException;
        } catch (IOException e) {
            this.f65501 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        BufferedInputStream bufferedInputStream = this.f65503;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
            this.f65503 = null;
        }
    }
}
