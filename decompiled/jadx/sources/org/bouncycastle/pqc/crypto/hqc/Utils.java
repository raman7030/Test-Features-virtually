package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static long bitMask(long j, long j2) {
        return (1 << ((int) (j % j2))) - 1;
    }

    public static void copyBytes(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        System.arraycopy(iArr, i, iArr2, i2, i3 / 2);
    }

    public static void fromByte32ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i = 0; i != iArr.length; i += 2) {
            int i2 = i / 2;
            long j = ((long) iArr[i]) & 4294967295L;
            jArr[i2] = j;
            jArr[i2] = j | (((long) iArr[i + 1]) << 32);
        }
    }

    public static void fromByteArrayToLongArray(long[] jArr, byte[] bArr, int i, int i2) {
        if (i2 % 8 != 0) {
            byte[] bArr2 = new byte[((i2 + 7) / 8) * 8];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            i = 0;
            bArr = bArr2;
        }
        int iMin = Math.min(jArr.length, (i2 + 7) >>> 3);
        for (int i3 = 0; i3 < iMin; i3++) {
            jArr[i3] = Pack.littleEndianToLong(bArr, i);
            i += 8;
        }
    }

    public static void fromLongArrayToByte32Array(int[] iArr, long[] jArr) {
        for (int i = 0; i != jArr.length; i++) {
            int i2 = i * 2;
            long j = jArr[i];
            iArr[i2] = (int) j;
            iArr[i2 + 1] = (int) (j >> 32);
        }
    }

    public static void fromLongArrayToByteArray(byte[] bArr, int i, int i2, long[] jArr) {
        int i3 = i2 >> 3;
        int i4 = 0;
        for (int i5 = 0; i5 != i3; i5++) {
            Pack.longToLittleEndian(jArr[i5], bArr, i);
            i += 8;
        }
        if ((i2 & 7) != 0) {
            while (i < bArr.length) {
                bArr[i] = (byte) (jArr[i3] >>> (i4 * 8));
                i++;
                i4++;
            }
        }
    }

    public static void fromLongArrayToByteArray(byte[] bArr, long[] jArr) {
        int length = bArr.length / 8;
        int i = 0;
        for (int i2 = 0; i2 != length; i2++) {
            Pack.longToLittleEndian(jArr[i2], bArr, i2 * 8);
        }
        if (bArr.length % 8 != 0) {
            int i3 = length * 8;
            while (i3 < bArr.length) {
                bArr[i3] = (byte) (jArr[length] >>> (i * 8));
                i3++;
                i++;
            }
        }
    }

    public static int getByte64SizeFromBitSize(int i) {
        return (i + 63) / 64;
    }

    public static int getByteSizeFromBitSize(int i) {
        return (i + 7) / 8;
    }

    public static int toUnsigned16Bits(int i) {
        return i & 65535;
    }

    public static int toUnsigned8bits(int i) {
        return i & 255;
    }
}
