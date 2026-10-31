package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class Permute {
    public static final int CHACHA_ROUNDS = 12;

    public static void permute(int i, int[] iArr) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = 12;
        int i15 = iArr[12];
        int i16 = iArr[13];
        int i17 = iArr[14];
        int iRotl = i7;
        int i18 = i12;
        int iRotl2 = iArr[15];
        int i19 = 7;
        int i20 = 8;
        int i21 = i5;
        int i22 = i10;
        int iRotl3 = i17;
        int i23 = i3;
        int iRotl4 = i9;
        int iRotl5 = i16;
        int i24 = i2;
        int i25 = i8;
        int iRotl6 = i15;
        int i26 = i;
        int iRotl7 = i6;
        int i27 = i13;
        int i28 = i4;
        int i29 = i11;
        int i30 = 16;
        while (i26 > 0) {
            int i31 = i24 + iRotl7;
            int iRotl8 = rotl(iRotl6 ^ i31, i30);
            int i32 = i22 + iRotl8;
            int iRotl9 = rotl(iRotl7 ^ i32, i14);
            int i33 = i31 + iRotl9;
            int iRotl10 = rotl(iRotl8 ^ i33, i20);
            int i34 = i32 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i34, i19);
            int i35 = i23 + iRotl;
            int iRotl12 = rotl(iRotl5 ^ i35, i30);
            int i36 = i29 + iRotl12;
            int iRotl13 = rotl(iRotl ^ i36, i14);
            int i37 = i35 + iRotl13;
            int iRotl14 = rotl(iRotl12 ^ i37, i20);
            int i38 = i36 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i38, i19);
            int i39 = i28 + i25;
            int iRotl16 = rotl(iRotl3 ^ i39, i30);
            int i40 = i18 + iRotl16;
            int iRotl17 = rotl(i25 ^ i40, 12);
            int i41 = i39 + iRotl17;
            int iRotl18 = rotl(iRotl16 ^ i41, i20);
            int i42 = i40 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i42, i19);
            int i43 = i21 + iRotl4;
            int iRotl20 = rotl(iRotl2 ^ i43, i30);
            int i44 = i27 + iRotl20;
            int iRotl21 = rotl(iRotl4 ^ i44, 12);
            int i45 = i43 + iRotl21;
            int iRotl22 = rotl(iRotl20 ^ i45, i20);
            int i46 = i44 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i46, 7);
            int i47 = i33 + iRotl15;
            int iRotl24 = rotl(iRotl22 ^ i47, 16);
            int i48 = i42 + iRotl24;
            int iRotl25 = rotl(iRotl15 ^ i48, 12);
            i24 = i47 + iRotl25;
            iRotl2 = rotl(iRotl24 ^ i24, 8);
            i18 = i48 + iRotl2;
            iRotl = rotl(iRotl25 ^ i18, 7);
            int i49 = i37 + iRotl19;
            int iRotl26 = rotl(iRotl10 ^ i49, 16);
            int i50 = i46 + iRotl26;
            int iRotl27 = rotl(iRotl19 ^ i50, 12);
            i23 = i49 + iRotl27;
            iRotl6 = rotl(iRotl26 ^ i23, 8);
            i27 = i50 + iRotl6;
            int iRotl28 = rotl(iRotl27 ^ i27, 7);
            int i51 = i41 + iRotl23;
            int iRotl29 = rotl(iRotl14 ^ i51, 16);
            int i52 = i34 + iRotl29;
            int iRotl30 = rotl(iRotl23 ^ i52, 12);
            i28 = i51 + iRotl30;
            iRotl5 = rotl(iRotl29 ^ i28, 8);
            i22 = i52 + iRotl5;
            iRotl4 = rotl(iRotl30 ^ i22, 7);
            int i53 = i45 + iRotl11;
            int iRotl31 = rotl(iRotl18 ^ i53, 16);
            int i54 = i38 + iRotl31;
            int iRotl32 = rotl(iRotl11 ^ i54, 12);
            i21 = i53 + iRotl32;
            iRotl3 = rotl(iRotl31 ^ i21, 8);
            i29 = i54 + iRotl3;
            iRotl7 = rotl(iRotl32 ^ i29, 7);
            i26 -= 2;
            i19 = 7;
            i30 = 16;
            i20 = 8;
            i25 = iRotl28;
            i14 = 12;
        }
        iArr[0] = i24;
        iArr[1] = i23;
        iArr[2] = i28;
        iArr[3] = i21;
        iArr[4] = iRotl7;
        iArr[5] = iRotl;
        iArr[6] = i25;
        iArr[7] = iRotl4;
        iArr[8] = i22;
        iArr[9] = i29;
        iArr[10] = i18;
        iArr[11] = i27;
        iArr[12] = iRotl6;
        iArr[13] = iRotl5;
        iArr[14] = iRotl3;
        iArr[15] = iRotl2;
    }

    public static int rotl(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = Pack.littleEndianToInt(bArr2, i * 4);
        }
        permute(12, iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            Pack.intToLittleEndian(iArr[i2], bArr, i2 * 4);
        }
    }
}
