package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12734 extends OutputStream {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f38293;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f38294;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f38295;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f38291 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f38297 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f38298 = new int[1];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38296 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38300 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f38301 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6384 f38292 = new C6384();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f38299 = new byte[1];

    public C12734(C1654 c1654, byte[] bArr, long[] jArr) {
        this.f38294 = c1654;
        this.f38295 = bArr;
        this.f38293 = jArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f38291) {
            this.f38296 = this.f38294.f5778;
            int unused = this.f38294.f5778;
            this.f38291 = false;
        }
        if (this.f38297) {
            throw new IOException("stream already closed");
        }
        while (i2 > 0) {
            try {
                if (this.f38294.f5768 && this.f38294.f63922 < C19373.m44633(this.f38295.length, 21, i2, 4)) {
                    flush();
                }
                int iM5552 = C1654.m5552(this.f38294, this.f38295, this.f38293[0], bArr, i, i2);
                this.f38301++;
                long[] jArr = this.f38293;
                jArr[0] = jArr[0] + ((long) iM5552);
                i += iM5552;
                i2 -= iM5552;
                if (this.f38294.f5778 - 1 == this.f38296 || this.f38294.f5769.available() >= 1024) {
                    while (this.f38294.f5769.available() > 0) {
                        this.f38294.m5569(this.f38298, this.f38292);
                        int i3 = this.f38298[0];
                        if (this.f38296 > i3 || i3 > this.f38294.f5778 - 1) {
                            throw new C16532(4, "");
                        }
                        this.f38300++;
                    }
                }
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString(), e2);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f38299;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f38297) {
            throw new IOException("stream already closed");
        }
        if (this.f38291) {
            return;
        }
        while (this.f38301 > this.f38300) {
            try {
                this.f38294.m5569((int[]) null, this.f38292);
                this.f38300++;
            } catch (C16532 e) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f38297) {
            return;
        }
        flush();
        try {
            C1654.m5562(this.f38294, this.f38295, this.f38292);
            this.f38297 = true;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
