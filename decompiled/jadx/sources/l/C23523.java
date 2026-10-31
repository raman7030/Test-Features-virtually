package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1S8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23523 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75510 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InputStream f75511;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10532 f75515;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f75517 = new byte[4096];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f75516 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75512 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f75513 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75518 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f75519 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f75514 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C23523(InputStream inputStream, InterfaceC10532 interfaceC10532) {
        inputStream.getClass();
        this.f75511 = inputStream;
        this.f75515 = interfaceC10532;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f75514;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f75517;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f75511 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f75519;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int iMin = Math.min(this.f75512, i2);
                System.arraycopy(bArr2, this.f75516, bArr, i, iMin);
                int i5 = this.f75516 + iMin;
                this.f75516 = i5;
                int i6 = this.f75512 - iMin;
                this.f75512 = i6;
                i += iMin;
                i2 -= iMin;
                i4 += iMin;
                int i7 = this.f75513;
                if (i5 + i6 + i7 == 4096) {
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.f75516 = 0;
                }
                if (i2 == 0 || this.f75518) {
                    break;
                    break;
                }
                int i8 = this.f75516 + this.f75512 + this.f75513;
                int i9 = this.f75511.read(bArr2, i8, 4096 - i8);
                if (i9 == -1) {
                    this.f75518 = true;
                    this.f75512 = this.f75513;
                    this.f75513 = 0;
                } else {
                    int i10 = this.f75513 + i9;
                    this.f75513 = i10;
                    int iMo10634 = this.f75515.mo10634(this.f75516, i10, bArr2);
                    this.f75512 = iMo10634;
                    this.f75513 -= iMo10634;
                }
            } catch (IOException e) {
                this.f75519 = e;
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
        if (this.f75511 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f75519;
        if (iOException != null) {
            throw iOException;
        }
        return this.f75512;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f75511;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f75511 = null;
            }
        }
    }
}
