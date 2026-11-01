package p067l;

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
public final class C14677 implements InterfaceC21384 {

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f41893;

    /* JADX INFO: renamed from: ᩹ */
    public int f41894;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C14677(byte[] bArr) {
        this.f41893 = bArr;
        this.f41894 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14677 m33572(byte[] bArr) {
        byte[] bArrM13644;
        int i = C6054.f15203;
        int length = bArr.length;
        int iM39944 = C17548.m39944(0, bArr);
        if (iM39944 != 10831 && iM39944 != 10847) {
            bArrM13644 = C6054.m13644(bArr, length);
        } else {
            C14677 c14677 = new C14677(bArr);
            c14677.f41894 = 2;
            byte[] bArr2 = new byte[c14677.readInt()];
            int iM33581 = c14677.m33581();
            for (int i2 = 0; i2 < iM33581; i2++) {
                int iM33582 = iM39944 == 10831 ? c14677.m33581() : c14677.m33580();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, c14677.f41894, iM33582));
                    try {
                        C2864 c2864 = new C2864();
                        c2864.f4949 = bArr2;
                        c2864.position(((long) i2) * 131072);
                        C23461.m52179(gZIPInputStream, c2864);
                        gZIPInputStream.close();
                        c14677.skipBytes(iM33582);
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
            bArrM13644 = bArr2;
        }
        return new C14677(bArrM13644);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14677 m33573(byte[] bArr) {
        try {
            return new C14677(C10116.m23592(new ByteArrayInputStream(bArr, 0, bArr.length)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C14677(InputStream inputStream) throws IOException {
        if (inputStream instanceof C11208) {
            this.f41893 = ((C11208) inputStream).m25874();
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
            this.f41893 = byteArrayOutputStream.toByteArray();
        }
        this.f41894 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33576(int i, byte[] bArr) {
        if (i >= 0 && i <= bArr.length) {
            byte[] bArr2 = this.f41893;
            int length = bArr2.length;
            int i2 = this.f41894;
            if (i <= length - i2) {
                if (i == 0) {
                    return;
                }
                System.arraycopy(bArr2, i2, bArr, 0, i);
                this.f41894 += i;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        byte[] bArr = this.f41893;
        int length = bArr.length;
        int i2 = this.f41894;
        if (i > length - i2) {
            throw new IndexOutOfBoundsException(String.format("Expected skip: %d, available: %d, position: 0x%x", Integer.valueOf(i), Integer.valueOf(bArr.length - this.f41894), Integer.valueOf(this.f41894)));
        }
        this.f41894 = i2 + i;
    }

    public final long available() {
        return this.f41893.length - this.f41894;
    }

    public final void seek(long j) {
        this.f41894 = (int) j;
    }

    public final long getPosition() {
        return this.f41894;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33575() {
        return this.f41894;
    }

    public final byte readByte() {
        int i = this.f41894;
        this.f41894 = i + 1;
        return this.f41893[i];
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m33585() {
        int i = this.f41894;
        this.f41894 = i + 1;
        return this.f41893[i] != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final Boolean m33589() {
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
        int i = this.f41894;
        byte[] bArr = this.f41893;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f41894 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۛۧ */
    public final int m33581() {
        int i = this.f41894;
        byte[] bArr = this.f41893;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f41894 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final char m33594() {
        int i = this.f41894;
        byte[] bArr = this.f41893;
        char c = (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f41894 = i + 2;
        return c;
    }

    @Override // p067l.InterfaceC21384
    public final int readInt() {
        int i = this.f41894;
        byte[] bArr = this.f41893;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f41894 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m33579() {
        int i = this.f41894;
        byte[] bArr = this.f41893;
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.f41894 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m33587() {
        int i = readInt();
        this.f41894 -= 4;
        return i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m33588() {
        int iM33581 = m33581();
        this.f41894 -= 2;
        return iM33581;
    }

    public final long readLong() {
        int i = this.f41894;
        byte[] bArr = this.f41893;
        long j = (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
        this.f41894 = i + 8;
        return j;
    }

    /* JADX INFO: renamed from: ۜ */
    public final float m33582() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX INFO: renamed from: ۜۧ */
    public final byte[] m33583() {
        int i = readInt();
        byte[] bArr = new byte[i];
        m33576(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int[] m33578() {
        int i = readInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final String m33591() {
        int i = readInt();
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            byte[] bArr = this.f41893;
            int length = bArr.length;
            int i2 = this.f41894;
            if (i <= length - i2) {
                String str = new String(bArr, i2, i, StandardCharsets.UTF_8);
                this.f41894 += i;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ܶ */
    public final String m33586() {
        int iM33581 = m33581();
        if (iM33581 == 0) {
            return "";
        }
        if (iM33581 >= 0) {
            byte[] bArr = this.f41893;
            int length = bArr.length;
            int i = this.f41894;
            if (iM33581 <= length - i) {
                String str = new String(bArr, i, iM33581, StandardCharsets.UTF_8);
                this.f41894 += iM33581;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m33593() {
        int i = this.f41894;
        byte[] bArr = this.f41893;
        if (i >= bArr.length) {
            return "";
        }
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2 = this.f41894 + 1;
            this.f41894 = i2;
        }
        if (bArr[i2] == 0) {
            this.f41894++;
        } else {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m33574() {
        if (m33585()) {
            return m33591();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m33590() {
        if (m33585()) {
            return m33593();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33577(int i) {
        if (available() < 4) {
            return false;
        }
        if (readInt() == i) {
            return true;
        }
        this.f41894 -= 4;
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m33584(int i) {
        if (available() < 2) {
            return false;
        }
        if (m33581() == i) {
            return true;
        }
        this.f41894 -= 2;
        return false;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final int m33592() {
        int i;
        int i2 = this.f41894;
        int i3 = i2 + 1;
        byte[] bArr = this.f41893;
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
                            throw new RuntimeException(String.format("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f41894)));
                        }
                        int i15 = i12 | (i14 << 28);
                        i3 = i13;
                        i = i15;
                    }
                }
            }
            i3 = i5;
        }
        this.f41894 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ۙ */
    public final int m33580() {
        int i = this.f41894;
        int i2 = i + 1;
        byte[] bArr = this.f41893;
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
                            throw new RuntimeException(String.format("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f41894)));
                        }
                        if ((b5 & 15) > 7) {
                            throw new RuntimeException(String.format("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f41894)));
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
        this.f41894 = i2;
        return i3;
    }
}
