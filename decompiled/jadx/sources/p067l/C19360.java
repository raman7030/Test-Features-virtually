package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes5.dex */
public class C19360 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public C24053 f57797;

    /* JADX INFO: renamed from: ۙ */
    public InputStream f57798;

    /* JADX INFO: renamed from: ۤ */
    public long f57800;

    /* JADX INFO: renamed from: ۫ */
    public C10366 f57801;

    /* JADX INFO: renamed from: ۬ */
    public C22437 f57802;

    /* JADX INFO: renamed from: ᩸ */
    public C6422 f57804;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f57805 = false;

    /* JADX INFO: renamed from: ۛ */
    public final byte[] f57799 = new byte[1];

    /* JADX INFO: renamed from: ᩶ */
    public IOException f57803 = null;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m44094(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    public C19360(InputStream inputStream, long j, byte b, int i) throws C23856, C11314 {
        C6422 c6422M14707 = C6422.m14707();
        if (j < -1) {
            throw new C11314("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new C23856("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - (i3 * 45);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new C11314("LZMA dictionary is too big for this implementation");
        }
        if (j < -1 || i6 < 0 || i6 > 8 || i5 < 0 || i5 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f57798 = inputStream;
        this.f57804 = c6422M14707;
        int iM44094 = m44094(i);
        if (j >= 0 && iM44094 > j) {
            iM44094 = m44094((int) j);
        }
        this.f57797 = new C24053(m44094(iM44094), c6422M14707);
        C10366 c10366 = new C10366(inputStream);
        this.f57801 = c10366;
        this.f57802 = new C22437(this.f57797, c10366, i6, i5, i3);
        this.f57800 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f57799;
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
        if (this.f57798 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f57803;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f57805) {
            return -1;
        }
        while (i2 > 0) {
            try {
                long j = this.f57800;
                this.f57797.m53312((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                try {
                    this.f57802.m50410();
                } catch (C23856 e) {
                    if (this.f57800 != -1 || !this.f57802.m50411()) {
                        throw e;
                    }
                    this.f57805 = true;
                    this.f57801.mo7010();
                }
                int iM53307 = this.f57797.m53307(i, bArr);
                i += iM53307;
                i2 -= iM53307;
                i4 += iM53307;
                long j2 = this.f57800;
                if (j2 >= 0) {
                    long j3 = j2 - ((long) iM53307);
                    this.f57800 = j3;
                    if (j3 == 0) {
                        this.f57805 = true;
                    }
                }
                if (this.f57805) {
                    if (this.f57797.m53313()) {
                        throw new C23856();
                    }
                    if (!this.f57801.m23996()) {
                        throw new C23856();
                    }
                    C24053 c24053 = this.f57797;
                    if (c24053 != null) {
                        c24053.m53311(this.f57804);
                        this.f57797 = null;
                    }
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
            } catch (IOException e2) {
                this.f57803 = e2;
                throw e2;
            }
        }
        return i4;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f57798 != null) {
            C24053 c24053 = this.f57797;
            if (c24053 != null) {
                c24053.m53311(this.f57804);
                this.f57797 = null;
            }
            try {
                this.f57798.close();
            } finally {
                this.f57798 = null;
            }
        }
    }
}
