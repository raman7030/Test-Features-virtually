package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes5.dex */
public class C17879 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22817 f54600;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f54601;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f54603;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8415 f54604;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21116 f54605;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4265 f54607;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f54608 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f54602 = new byte[1];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f54606 = null;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41847(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    public C17879(InputStream inputStream, long j, byte b, int i) throws C22609, C9413 {
        C4265 c4265M12843 = C4265.m12843();
        if (j < -1) {
            throw new C9413("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new C22609("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - (i3 * 45);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new C9413("LZMA dictionary is too big for this implementation");
        }
        if (j < -1 || i6 < 0 || i6 > 8 || i5 < 0 || i5 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f54601 = inputStream;
        this.f54607 = c4265M12843;
        int iM41847 = m41847(i);
        if (j >= 0 && iM41847 > j) {
            iM41847 = m41847((int) j);
        }
        this.f54600 = new C22817(m41847(iM41847), c4265M12843);
        C8415 c8415 = new C8415(inputStream);
        this.f54604 = c8415;
        this.f54605 = new C21116(this.f54600, c8415, i6, i5, i3);
        this.f54603 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f54602;
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
        if (this.f54601 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f54606;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f54608) {
            return -1;
        }
        while (i2 > 0) {
            try {
                long j = this.f54603;
                this.f54600.m50922((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                try {
                    this.f54605.m48080();
                } catch (C22609 e) {
                    if (this.f54603 != -1 || !this.f54605.m48081()) {
                        throw e;
                    }
                    this.f54608 = true;
                    this.f54604.mo4772();
                }
                int iM50917 = this.f54600.m50917(i, bArr);
                i += iM50917;
                i2 -= iM50917;
                i4 += iM50917;
                long j2 = this.f54603;
                if (j2 >= 0) {
                    long j3 = j2 - ((long) iM50917);
                    this.f54603 = j3;
                    if (j3 == 0) {
                        this.f54608 = true;
                    }
                }
                if (this.f54608) {
                    if (this.f54600.m50923()) {
                        throw new C22609();
                    }
                    if (!this.f54604.m22026()) {
                        throw new C22609();
                    }
                    C22817 c22817 = this.f54600;
                    if (c22817 != null) {
                        c22817.m50921(this.f54607);
                        this.f54600 = null;
                    }
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
            } catch (IOException e2) {
                this.f54606 = e2;
                throw e2;
            }
        }
        return i4;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f54601 != null) {
            C22817 c22817 = this.f54600;
            if (c22817 != null) {
                c22817.m50921(this.f54607);
                this.f54600 = null;
            }
            try {
                this.f54601.close();
            } finally {
                this.f54601 = null;
            }
        }
    }
}
