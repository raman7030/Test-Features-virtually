package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.۬ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 064A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12951 implements InterfaceC20008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f38849;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38850;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C12951(byte[] bArr) {
        this.f38849 = bArr;
        this.f38850 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12951 m31485(byte[] bArr) {
        byte[] bArrM11708;
        int i = C3878.f12396;
        int length = bArr.length;
        int iM37760 = C15972.m37760(0, bArr);
        if (iM37760 != 10831 && iM37760 != 10847) {
            bArrM11708 = C3878.m11708(bArr, length);
        } else {
            C12951 c12951 = new C12951(bArr);
            c12951.f38850 = 2;
            byte[] bArr2 = new byte[c12951.readInt()];
            int iM31494 = c12951.m31494();
            for (int i2 = 0; i2 < iM31494; i2++) {
                int iM31495 = iM37760 == 10831 ? c12951.m31494() : c12951.m31493();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, c12951.f38850, iM31495));
                    try {
                        C0521 c0521 = new C0521();
                        c0521.f2176 = bArr2;
                        c0521.position(((long) i2) * 131072);
                        C22194.m49852(gZIPInputStream, c0521);
                        gZIPInputStream.close();
                        c12951.skipBytes(iM31495);
                    } catch (Throwable th) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            bArrM11708 = bArr2;
        }
        return new C12951(bArrM11708);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12951 m31486(byte[] bArr) {
        try {
            return new C12951(C8152.m21623(new ByteArrayInputStream(bArr, 0, bArr.length)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C12951(InputStream inputStream) throws IOException {
        if (inputStream instanceof C9301) {
            this.f38849 = ((C9301) inputStream).m23865();
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            this.f38849 = byteArrayOutputStream.toByteArray();
        }
        this.f38850 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31489(int i, byte[] bArr) {
        if (i >= 0 && i <= bArr.length) {
            byte[] bArr2 = this.f38849;
            int length = bArr2.length;
            int i2 = this.f38850;
            if (i <= length - i2) {
                if (i == 0) {
                    return;
                }
                System.arraycopy(bArr2, i2, bArr, 0, i);
                this.f38850 += i;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        byte[] bArr = this.f38849;
        int length = bArr.length;
        int i2 = this.f38850;
        if (i > length - i2) {
            throw new IndexOutOfBoundsException(String.format("Expected skip: %d, available: %d, position: 0x%x", Integer.valueOf(i), Integer.valueOf(bArr.length - this.f38850), Integer.valueOf(this.f38850)));
        }
        this.f38850 = i2 + i;
    }

    public final long available() {
        return this.f38849.length - this.f38850;
    }

    public final void seek(long j) {
        this.f38850 = (int) j;
    }

    public final long getPosition() {
        return this.f38850;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31488() {
        return this.f38850;
    }

    public final byte readByte() {
        int i = this.f38850;
        this.f38850 = i + 1;
        return this.f38849[i];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31498() {
        int i = this.f38850;
        this.f38850 = i + 1;
        return this.f38849[i] != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Boolean m31502() {
        byte b = readByte();
        if (b == 1) {
            return Boolean.TRUE;
        }
        if (b != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final short readShort() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f38850 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final int m31494() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f38850 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final char m31507() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        char c = (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f38850 = i + 2;
        return c;
    }

    @Override // l.InterfaceC20008
    public final int readInt() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f38850 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m31492() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.f38850 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31500() {
        int i = readInt();
        this.f38850 -= 4;
        return i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m31501() {
        int iM31494 = m31494();
        this.f38850 -= 2;
        return iM31494;
    }

    public final long readLong() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        long j = (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
        this.f38850 = i + 8;
        return j;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m31495() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m31496() {
        int i = readInt();
        byte[] bArr = new byte[i];
        m31489(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] m31491() {
        int i = readInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m31504() {
        int i = readInt();
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            byte[] bArr = this.f38849;
            int length = bArr.length;
            int i2 = this.f38850;
            if (i <= length - i2) {
                String str = new String(bArr, i2, i, StandardCharsets.UTF_8);
                this.f38850 += i;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m31499() {
        int iM31494 = m31494();
        if (iM31494 == 0) {
            return "";
        }
        if (iM31494 >= 0) {
            byte[] bArr = this.f38849;
            int length = bArr.length;
            int i = this.f38850;
            if (iM31494 <= length - i) {
                String str = new String(bArr, i, iM31494, StandardCharsets.UTF_8);
                this.f38850 += iM31494;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m31506() {
        int i = this.f38850;
        byte[] bArr = this.f38849;
        if (i >= bArr.length) {
            return "";
        }
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2 = this.f38850 + 1;
            this.f38850 = i2;
        }
        if (bArr[i2] == 0) {
            this.f38850++;
        } else {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m31487() {
        if (m31498()) {
            return m31504();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m31503() {
        if (m31498()) {
            return m31506();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31490(int i) {
        if (available() < 4) {
            return false;
        }
        if (readInt() == i) {
            return true;
        }
        this.f38850 -= 4;
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31497(int i) {
        if (available() < 2) {
            return false;
        }
        if (m31494() == i) {
            return true;
        }
        this.f38850 -= 2;
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m31505() {
        int i;
        int i2 = this.f38850;
        int i3 = i2 + 1;
        byte[] bArr = this.f38849;
        byte b = bArr[i2];
        int i4 = b & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte b2 = bArr[i3];
            int i6 = b2 & 255;
            int i7 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte b3 = bArr[i5];
                int i9 = b3 & 255;
                int i10 = i7 | ((b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte b4 = bArr[i8];
                    int i11 = b4 & 255;
                    int i12 = i10 | ((b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int i14 = bArr[i5] & 255;
                        if (i14 > 127) {
                            throw new RuntimeException(String.format("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f38850)));
                        }
                        int i15 = i12 | (i14 << 28);
                        i3 = i13;
                        i = i15;
                    }
                }
            }
            i3 = i5;
        }
        this.f38850 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31493() {
        int i = this.f38850;
        int i2 = i + 1;
        byte[] bArr = this.f38849;
        byte b = bArr[i];
        int i3 = b & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte b2 = bArr[i2];
            int i5 = b2 & 255;
            int i6 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte b3 = bArr[i4];
                int i8 = b3 & 255;
                i3 = ((b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte b4 = bArr[i7];
                    int i9 = b4 & 255;
                    i3 |= (b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte b5 = bArr[i2];
                        if (b5 < 0) {
                            throw new RuntimeException(String.format("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f38850)));
                        }
                        if ((b5 & 15) > 7) {
                            throw new RuntimeException(String.format("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f38850)));
                        }
                        i3 |= b5 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f38850 = i2;
        return i3;
    }
}
