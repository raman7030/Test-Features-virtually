package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes3.dex */
public class C5949 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public final int f14687;

    /* JADX INFO: renamed from: ۙ */
    public InputStream f14688;

    /* JADX INFO: renamed from: ۤ */
    public C8631 f14689;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f14690;

    /* JADX INFO: renamed from: ۬ */
    public final byte[] f14691;

    /* JADX INFO: renamed from: ᩶ */
    public IOException f14692;

    /* JADX INFO: renamed from: ᩸ */
    public final C6422 f14693;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f14694;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C5949(InputStream inputStream) throws IOException {
        C6422 c6422M14707 = C6422.m14707();
        this.f14694 = false;
        this.f14692 = null;
        this.f14691 = new byte[1];
        this.f14693 = c6422M14707;
        this.f14688 = inputStream;
        this.f14687 = -1;
        this.f14690 = true;
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        this.f14689 = new C8631(inputStream, -1, true, bArr, c6422M14707);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f14691;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f14688 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f14692;
        if (iOException != null) {
            throw iOException;
        }
        if (!this.f14694) {
            while (i2 > 0) {
                try {
                    if (this.f14689 == null) {
                        m13357();
                        if (this.f14694) {
                            if (i4 == 0) {
                            }
                        }
                    }
                    int i5 = this.f14689.read(bArr, i, i2);
                    if (i5 > 0) {
                        i4 += i5;
                        i += i5;
                        i2 -= i5;
                    } else if (i5 == -1) {
                        this.f14689 = null;
                    }
                } catch (IOException e) {
                    this.f14692 = e;
                    if (i4 == 0) {
                        throw e;
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13357() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(this.f14688);
        byte[] bArr = new byte[12];
        while (dataInputStream.read(bArr, 0, 1) != -1) {
            dataInputStream.readFully(bArr, 1, 3);
            if (bArr[0] != 0 || bArr[1] != 0 || bArr[2] != 0 || bArr[3] != 0) {
                dataInputStream.readFully(bArr, 4, 8);
                try {
                    this.f14689 = new C8631(this.f14688, this.f14687, this.f14690, bArr, this.f14693);
                    return;
                } catch (C17347 unused) {
                    throw new C23856("Garbage after a valid XZ Stream");
                }
            }
        }
        this.f14694 = true;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f14688 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f14692;
        if (iOException != null) {
            throw iOException;
        }
        C8631 c8631 = this.f14689;
        if (c8631 == null) {
            return 0;
        }
        return c8631.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14688 != null) {
            C8631 c8631 = this.f14689;
            if (c8631 != null) {
                c8631.m20050(false);
                this.f14689 = null;
            }
            try {
                this.f14688.close();
            } finally {
                this.f14688 = null;
            }
        }
    }
}
