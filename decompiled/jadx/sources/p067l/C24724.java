package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1S8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24724 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۨ */
    public static final /* synthetic */ int f78256 = 0;

    /* JADX INFO: renamed from: ۗ */
    public InputStream f78257;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC12378 f78261;

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f78263 = new byte[4096];

    /* JADX INFO: renamed from: ۬ */
    public int f78262 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f78258 = 0;

    /* JADX INFO: renamed from: ۛ */
    public int f78259 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f78264 = false;

    /* JADX INFO: renamed from: ᩹ */
    public IOException f78265 = null;

    /* JADX INFO: renamed from: ۤ */
    public final byte[] f78260 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C24724(InputStream inputStream, InterfaceC12378 interfaceC12378) {
        inputStream.getClass();
        this.f78257 = inputStream;
        this.f78261 = interfaceC12378;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f78260;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f78263;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f78257 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f78265;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int iMin = Math.min(this.f78258, i2);
                System.arraycopy(bArr2, this.f78262, bArr, i, iMin);
                int i5 = this.f78262 + iMin;
                this.f78262 = i5;
                int i6 = this.f78258 - iMin;
                this.f78258 = i6;
                i += iMin;
                i2 -= iMin;
                i4 += iMin;
                int i7 = this.f78259;
                if (i5 + i6 + i7 == 4096) {
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.f78262 = 0;
                }
                if (i2 == 0 || this.f78264) {
                    break;
                    break;
                }
                int i8 = this.f78262 + this.f78258 + this.f78259;
                int i9 = this.f78257.read(bArr2, i8, 4096 - i8);
                if (i9 == -1) {
                    this.f78264 = true;
                    this.f78258 = this.f78259;
                    this.f78259 = 0;
                } else {
                    int i10 = this.f78259 + i9;
                    this.f78259 = i10;
                    int iMo12629 = this.f78261.mo12629(this.f78262, i10, bArr2);
                    this.f78258 = iMo12629;
                    this.f78259 -= iMo12629;
                }
            } catch (IOException e) {
                this.f78265 = e;
                throw e;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f78257 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f78265;
        if (iOException != null) {
            throw iOException;
        }
        return this.f78258;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f78257;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f78257 = null;
            }
        }
    }
}
