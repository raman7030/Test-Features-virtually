package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10378 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f31209;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31210;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5377 f31211;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f31212;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStream f31213;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10378(InputStream inputStream, byte[] bArr, int i, C5377 c5377) {
        this.f31213 = inputStream;
        this.f31209 = bArr;
        this.f31212 = i;
        this.f31211 = c5377;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C11003.checkFromIndexSize(i, i2, bArr.length);
        synchronized (this) {
            if (this.f31213 == null) {
                throw new IOException("Text input is closed");
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.f31210;
            int i4 = this.f31212;
            if (i3 < i4) {
                int iMin = Math.min(i2, i4 - i3);
                System.arraycopy(this.f31209, this.f31210, bArr, i, iMin);
                int i5 = this.f31210 + iMin;
                this.f31210 = i5;
                if (i5 == this.f31212) {
                    this.f31209 = null;
                    C5377 c5377 = this.f31211;
                    if (c5377 != null) {
                        c5377.close();
                        this.f31211 = null;
                    }
                }
                return iMin;
            }
            this.f31209 = null;
            C5377 c5378 = this.f31211;
            if (c5378 != null) {
                c5378.close();
                this.f31211 = null;
            }
            return this.f31213.read(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f31213;
            this.f31213 = null;
            this.f31209 = null;
            C5377 c5377 = this.f31211;
            if (c5377 != null) {
                c5377.close();
                this.f31211 = null;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
