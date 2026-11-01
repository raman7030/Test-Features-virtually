package org.bouncycastle.math.p080ec.rfc7748;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X448Field {
    public static final int M28 = 268435455;
    public static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    public static final long U32 = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2] ^ iArr2[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i2 + (i >>> 28);
        int i18 = i & M28;
        int i19 = i6 + (i5 >>> 28);
        int i20 = i5 & M28;
        int i21 = i10 + (i9 >>> 28);
        int i22 = i9 & M28;
        int i23 = i14 + (i13 >>> 28);
        int i24 = i13 & M28;
        int i25 = i3 + (i17 >>> 28);
        int i26 = i17 & M28;
        int i27 = i7 + (i19 >>> 28);
        int i28 = i19 & M28;
        int i29 = i11 + (i21 >>> 28);
        int i30 = i21 & M28;
        int i31 = i15 + (i23 >>> 28);
        int i32 = i23 & M28;
        int i33 = i4 + (i25 >>> 28);
        int i34 = i25 & M28;
        int i35 = i8 + (i27 >>> 28);
        int i36 = i27 & M28;
        int i37 = i12 + (i29 >>> 28);
        int i38 = i29 & M28;
        int i39 = i16 + (i31 >>> 28);
        int i40 = i31 & M28;
        int i41 = i39 >>> 28;
        int i42 = i39 & M28;
        int i43 = i18 + i41;
        int i44 = i20 + (i33 >>> 28);
        int i45 = i33 & M28;
        int i46 = i22 + i41 + (i35 >>> 28);
        int i47 = i35 & M28;
        int i48 = i24 + (i37 >>> 28);
        int i49 = i37 & M28;
        int i50 = i26 + (i43 >>> 28);
        int i51 = i43 & M28;
        int i52 = i28 + (i44 >>> 28);
        int i53 = i44 & M28;
        int i54 = i30 + (i46 >>> 28);
        int i55 = i46 & M28;
        int i56 = i32 + (i48 >>> 28);
        int i57 = i48 & M28;
        iArr[0] = i51;
        iArr[1] = i50;
        iArr[2] = i34;
        iArr[3] = i45;
        iArr[4] = i53;
        iArr[5] = i52;
        iArr[6] = i36;
        iArr[7] = i47;
        iArr[8] = i55;
        iArr[9] = i54;
        iArr[10] = i38;
        iArr[11] = i49;
        iArr[12] = i57;
        iArr[13] = i56;
        iArr[14] = i40;
        iArr[15] = i42;
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int[] iArrCreate = create();
        sub(iArrCreate, iArr, iArrCreate);
        cmov(-i, iArrCreate, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i) {
        return new int[i * 16];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode56(bArr, i, iArr, 0);
        decode56(bArr, i + 7, iArr, 2);
        decode56(bArr, i + 14, iArr, 4);
        decode56(bArr, i + 21, iArr, 6);
        decode56(bArr, i + 28, iArr, 8);
        decode56(bArr, i + 35, iArr, 10);
        decode56(bArr, i + 42, iArr, 12);
        decode56(bArr, i + 49, iArr, 14);
    }

    public static void decode(byte[] bArr, int i, int[] iArr, int i2) {
        decode56(bArr, i, iArr, i2);
        decode56(bArr, i + 7, iArr, i2 + 2);
        decode56(bArr, i + 14, iArr, i2 + 4);
        decode56(bArr, i + 21, iArr, i2 + 6);
        decode56(bArr, i + 28, iArr, i2 + 8);
        decode56(bArr, i + 35, iArr, i2 + 10);
        decode56(bArr, i + 42, iArr, i2 + 12);
        decode56(bArr, i + 49, iArr, i2 + 14);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode56(bArr, 0, iArr, 0);
        decode56(bArr, 7, iArr, 2);
        decode56(bArr, 14, iArr, 4);
        decode56(bArr, 21, iArr, 6);
        decode56(bArr, 28, iArr, 8);
        decode56(bArr, 35, iArr, 10);
        decode56(bArr, 42, iArr, 12);
        decode56(bArr, 49, iArr, 14);
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode224(iArr, i, iArr2, 0);
        decode224(iArr, i + 7, iArr2, 8);
    }

    public static void decode224(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        iArr2[i2] = i3 & M28;
        iArr2[i2 + 1] = ((i3 >>> 28) | (i4 << 4)) & M28;
        iArr2[i2 + 2] = ((i4 >>> 24) | (i5 << 8)) & M28;
        iArr2[i2 + 3] = ((i5 >>> 20) | (i6 << 12)) & M28;
        iArr2[i2 + 4] = ((i6 >>> 16) | (i7 << 16)) & M28;
        iArr2[i2 + 5] = ((i7 >>> 12) | (i8 << 20)) & M28;
        iArr2[i2 + 6] = 268435455 & ((i8 >>> 8) | (i9 << 24));
        iArr2[i2 + 7] = i9 >>> 4;
    }

    public static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void decode56(byte[] bArr, int i, int[] iArr, int i2) {
        int iDecode32 = decode32(bArr, i);
        int iDecode24 = decode24(bArr, i + 4);
        iArr[i2] = 268435455 & iDecode32;
        iArr[i2 + 1] = (iDecode24 << 4) | (iDecode32 >>> 28);
    }

    public static void encode(int[] iArr, int i, byte[] bArr, int i2) {
        encode56(iArr, i, bArr, i2);
        encode56(iArr, i + 2, bArr, i2 + 7);
        encode56(iArr, i + 4, bArr, i2 + 14);
        encode56(iArr, i + 6, bArr, i2 + 21);
        encode56(iArr, i + 8, bArr, i2 + 28);
        encode56(iArr, i + 10, bArr, i2 + 35);
        encode56(iArr, i + 12, bArr, i2 + 42);
        encode56(iArr, i + 14, bArr, i2 + 49);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode56(iArr, 0, bArr, 0);
        encode56(iArr, 2, bArr, 7);
        encode56(iArr, 4, bArr, 14);
        encode56(iArr, 6, bArr, 21);
        encode56(iArr, 8, bArr, 28);
        encode56(iArr, 10, bArr, 35);
        encode56(iArr, 12, bArr, 42);
        encode56(iArr, 14, bArr, 49);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode56(iArr, 0, bArr, i);
        encode56(iArr, 2, bArr, i + 7);
        encode56(iArr, 4, bArr, i + 14);
        encode56(iArr, 6, bArr, i + 21);
        encode56(iArr, 8, bArr, i + 28);
        encode56(iArr, 10, bArr, i + 35);
        encode56(iArr, 12, bArr, i + 42);
        encode56(iArr, 14, bArr, i + 49);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode224(iArr, 0, iArr2, i);
        encode224(iArr, 8, iArr2, i + 7);
    }

    public static void encode224(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        int i10 = iArr[i + 7];
        iArr2[i2] = (i4 << 28) | i3;
        iArr2[i2 + 1] = (i4 >>> 4) | (i5 << 24);
        iArr2[i2 + 2] = (i5 >>> 8) | (i6 << 20);
        iArr2[i2 + 3] = (i6 >>> 12) | (i7 << 16);
        iArr2[i2 + 4] = (i7 >>> 16) | (i8 << 12);
        iArr2[i2 + 5] = (i8 >>> 20) | (i9 << 8);
        iArr2[i2 + 6] = (i10 << 4) | (i9 >>> 24);
    }

    public static void encode24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    public static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void encode56(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        encode32((i4 << 28) | i3, bArr, i2);
        encode24(i4 >>> 4, bArr, i2 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i, int[] iArr2) {
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
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = iArr[15];
        long j = i;
        long j2 = ((long) i3) * j;
        int i18 = ((int) j2) & M28;
        long j3 = ((long) i7) * j;
        int i19 = ((int) j3) & M28;
        long j4 = ((long) i11) * j;
        int i20 = ((int) j4) & M28;
        long j5 = ((long) i15) * j;
        int i21 = ((int) j5) & M28;
        long j6 = (((long) i4) * j) + (j2 >>> 28);
        iArr2[2] = ((int) j6) & M28;
        long j7 = j6 >>> 28;
        long j8 = (((long) i8) * j) + (j3 >>> 28);
        iArr2[6] = ((int) j8) & M28;
        long j9 = (((long) i12) * j) + (j4 >>> 28);
        iArr2[10] = ((int) j9) & M28;
        long j10 = (((long) i16) * j) + (j5 >>> 28);
        iArr2[14] = ((int) j10) & M28;
        long j11 = j10 >>> 28;
        long j12 = (((long) i5) * j) + j7;
        iArr2[3] = ((int) j12) & M28;
        long j13 = j12 >>> 28;
        long j14 = (((long) i9) * j) + (j8 >>> 28);
        iArr2[7] = ((int) j14) & M28;
        long j15 = j14 >>> 28;
        long j16 = (((long) i13) * j) + (j9 >>> 28);
        iArr2[11] = ((int) j16) & M28;
        long j17 = j16 >>> 28;
        long j18 = (((long) i17) * j) + j11;
        iArr2[15] = ((int) j18) & M28;
        long j19 = j18 >>> 28;
        long j20 = (((long) i6) * j) + j13;
        iArr2[4] = ((int) j20) & M28;
        long j21 = j20 >>> 28;
        long j22 = (((long) i10) * j) + j15 + j19;
        iArr2[8] = ((int) j22) & M28;
        long j23 = j22 >>> 28;
        long j24 = (((long) i14) * j) + j17;
        iArr2[12] = ((int) j24) & M28;
        long j25 = j24 >>> 28;
        long j26 = (((long) i2) * j) + j19;
        iArr2[0] = ((int) j26) & M28;
        iArr2[1] = i18 + ((int) (j26 >>> 28));
        iArr2[5] = i19 + ((int) j21);
        iArr2[9] = i20 + ((int) j23);
        iArr2[13] = i21 + ((int) j25);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        int i33 = i + i9;
        int i34 = i2 + i10;
        int i35 = i3 + i11;
        int i36 = i5 + i13;
        int i37 = i6 + i14;
        int i38 = i7 + i15;
        int i39 = i8 + i16;
        int i40 = i17 + i25;
        int i41 = i18 + i26;
        int i42 = i19 + i27;
        int i43 = i20 + i28;
        int i44 = i21 + i29;
        int i45 = i22 + i30;
        int i46 = i23 + i31;
        int i47 = i24 + i32;
        long j = i;
        long j2 = i17;
        long j3 = j * j2;
        long j4 = i8;
        long j5 = i18;
        long j6 = j4 * j5;
        long j7 = i7;
        long j8 = i19;
        long j9 = (j7 * j8) + j6;
        long j10 = i6;
        long j11 = i20;
        long j12 = (j10 * j11) + j9;
        long j13 = i5;
        long j14 = i21;
        long j15 = (j13 * j14) + j12;
        long j16 = i4;
        long j17 = i22;
        long j18 = (j16 * j17) + j15;
        long j19 = i3;
        long j20 = i23;
        long j21 = (j19 * j20) + j18;
        long j22 = i2;
        long j23 = i24;
        long j24 = (j22 * j23) + j21;
        long j25 = i9;
        long j26 = i25;
        long j27 = j25 * j26;
        long j28 = i16;
        long j29 = i26;
        long j30 = j28 * j29;
        long j31 = i15;
        long j32 = i27;
        long j33 = (j31 * j32) + j30;
        long j34 = i14;
        long j35 = i28;
        long j36 = (j34 * j35) + j33;
        long j37 = i13;
        long j38 = i29;
        long j39 = (j37 * j38) + j36;
        long j40 = i12;
        long j41 = i30;
        long j42 = (j40 * j41) + j39;
        long j43 = i11;
        long j44 = i31;
        long j45 = (j43 * j44) + j42;
        long j46 = i10;
        long j47 = i32;
        long j48 = (j46 * j47) + j45;
        long j49 = i33;
        long j50 = i40;
        long j51 = j49 * j50;
        long j52 = i39;
        long j53 = i41;
        long j54 = j52 * j53;
        long j55 = i38;
        long j56 = i42;
        long j57 = (j55 * j56) + j54;
        long j58 = i37;
        long j59 = i43;
        long j60 = (j58 * j59) + j57;
        long j61 = i36;
        long j62 = i44;
        long j63 = (j61 * j62) + j60;
        long j64 = i4 + i12;
        long j65 = i45;
        long j66 = (j64 * j65) + j63;
        long j67 = i35;
        long j68 = i46;
        long j69 = (j67 * j68) + j66;
        long j70 = i34;
        long j71 = i47;
        long j72 = (j70 * j71) + j69;
        long j73 = ((j3 + j27) + j72) - j24;
        int i48 = ((int) j73) & M28;
        long j74 = j73 >>> 28;
        long j75 = ((j48 + j51) - j3) + j72;
        int i49 = ((int) j75) & M28;
        long j76 = (j * j5) + (j22 * j2);
        long j77 = (j43 * j47) + (j40 * j44) + (j37 * j41) + (j34 * j38) + (j31 * j35) + (j28 * j32);
        long j78 = (j49 * j53) + (j70 * j50);
        long j79 = (j67 * j71) + (j64 * j68) + (j61 * j65) + (j58 * j62) + (j55 * j59) + (j52 * j56);
        long j80 = (((j76 + ((j25 * j29) + (j46 * j26))) + j79) - ((j19 * j23) + ((j16 * j20) + ((j13 * j17) + ((j10 * j14) + ((j7 * j11) + (j4 * j8))))))) + j74;
        int i50 = ((int) j80) & M28;
        long j81 = ((j77 + j78) - j76) + j79 + (j75 >>> 28);
        int i51 = ((int) j81) & M28;
        long j82 = (j * j8) + (j22 * j5) + (j19 * j2);
        long j83 = (j40 * j47) + (j37 * j44) + (j34 * j41) + (j31 * j38) + (j28 * j35);
        long j84 = (j49 * j56) + (j70 * j53) + (j67 * j50);
        long j85 = (j64 * j71) + (j61 * j68) + (j58 * j65) + (j55 * j62) + (j52 * j59);
        long j86 = (((j82 + ((j25 * j32) + ((j46 * j29) + (j43 * j26)))) + j85) - ((j16 * j23) + ((j13 * j20) + ((j10 * j17) + ((j7 * j14) + (j4 * j11)))))) + (j80 >>> 28);
        int i52 = ((int) j86) & M28;
        long j87 = ((j83 + j84) - j82) + j85 + (j81 >>> 28);
        int i53 = ((int) j87) & M28;
        long j88 = (j * j11) + (j22 * j8) + (j19 * j5) + (j16 * j2);
        long j89 = (j37 * j47) + (j34 * j44) + (j31 * j41) + (j28 * j38);
        long j90 = (j49 * j59) + (j70 * j56) + (j67 * j53) + (j64 * j50);
        long j91 = (j61 * j71) + (j58 * j68) + (j55 * j65) + (j52 * j62);
        long j92 = (((j88 + ((j25 * j35) + ((j46 * j32) + ((j43 * j29) + (j40 * j26))))) + j91) - ((j13 * j23) + ((j10 * j20) + ((j7 * j17) + (j4 * j14))))) + (j86 >>> 28);
        int i54 = ((int) j92) & M28;
        long j93 = ((j89 + j90) - j88) + j91 + (j87 >>> 28);
        int i55 = ((int) j93) & M28;
        long j94 = (j * j14) + (j22 * j11) + (j19 * j8) + (j16 * j5) + (j13 * j2);
        long j95 = (j34 * j47) + (j31 * j44) + (j28 * j41);
        long j96 = (j49 * j62) + (j70 * j59) + (j67 * j56) + (j64 * j53) + (j61 * j50);
        long j97 = (j58 * j71) + (j55 * j68) + (j52 * j65);
        long j98 = (((j94 + ((j25 * j38) + ((j46 * j35) + ((j43 * j32) + ((j40 * j29) + (j37 * j26)))))) + j97) - ((j10 * j23) + ((j7 * j20) + (j4 * j17)))) + (j92 >>> 28);
        int i56 = ((int) j98) & M28;
        long j99 = ((j95 + j96) - j94) + j97 + (j93 >>> 28);
        int i57 = ((int) j99) & M28;
        long j100 = (j * j17) + (j22 * j14) + (j19 * j11) + (j16 * j8) + (j13 * j5) + (j10 * j2);
        long j101 = (j31 * j47) + (j28 * j44);
        long j102 = (j49 * j65) + (j70 * j62) + (j67 * j59) + (j64 * j56) + (j61 * j53) + (j58 * j50);
        long j103 = (j55 * j71) + (j52 * j68);
        long j104 = (((j100 + ((j25 * j41) + ((j46 * j38) + ((j43 * j35) + ((j40 * j32) + ((j37 * j29) + (j34 * j26))))))) + j103) - ((j7 * j23) + (j4 * j20))) + (j98 >>> 28);
        int i58 = ((int) j104) & M28;
        long j105 = ((j101 + j102) - j100) + j103 + (j99 >>> 28);
        int i59 = ((int) j105) & M28;
        long j106 = (j * j20) + (j22 * j17) + (j19 * j14) + (j16 * j11) + (j13 * j8) + (j10 * j5) + (j7 * j2);
        long j107 = j28 * j47;
        long j108 = (j49 * j68) + (j70 * j65) + (j67 * j62) + (j64 * j59) + (j61 * j56) + (j58 * j53) + (j55 * j50);
        long j109 = j52 * j71;
        long j110 = (((j106 + ((j25 * j44) + ((j46 * j41) + ((j43 * j38) + ((j40 * j35) + ((j37 * j32) + ((j34 * j29) + (j31 * j26)))))))) + j109) - (j4 * j23)) + (j104 >>> 28);
        int i60 = ((int) j110) & M28;
        long j111 = ((j107 + j108) - j106) + j109 + (j105 >>> 28);
        int i61 = ((int) j111) & M28;
        long j112 = j22 * j20;
        long j113 = (j * j23) + j112 + (j17 * j19) + (j14 * j16) + (j13 * j11) + (j10 * j8) + (j5 * j7) + (j2 * j4);
        long j114 = (j49 * j71) + (j70 * j68) + (j67 * j65) + (j64 * j62) + (j61 * j59) + (j58 * j56) + (j55 * j53) + (j52 * j50);
        long j115 = (j25 * j47) + (j46 * j44) + (j43 * j41) + (j40 * j38) + (j37 * j35) + (j34 * j32) + (j31 * j29) + (j28 * j26) + j113 + (j110 >>> 28);
        int i62 = ((int) j115) & M28;
        long j116 = (j114 - j113) + (j111 >>> 28);
        int i63 = ((int) j116) & M28;
        long j117 = j116 >>> 28;
        long j118 = (j115 >>> 28) + j117 + ((long) i49);
        int i64 = ((int) j118) & M28;
        long j119 = j117 + ((long) i48);
        iArr3[0] = ((int) j119) & M28;
        iArr3[1] = i50 + ((int) (j119 >>> 28));
        iArr3[2] = i52;
        iArr3[3] = i54;
        iArr3[4] = i56;
        iArr3[5] = i58;
        iArr3[6] = i60;
        iArr3[7] = i62;
        iArr3[8] = i64;
        iArr3[9] = i51 + ((int) (j118 >>> 28));
        iArr3[10] = i53;
        iArr3[11] = i55;
        iArr3[12] = i57;
        iArr3[13] = i59;
        iArr3[14] = i61;
        iArr3[15] = i63;
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        sqr(iArr, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, iArrCreate2);
        mul(iArr, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 3, iArrCreate3);
        mul(iArrCreate2, iArrCreate3, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, 3, iArrCreate4);
        mul(iArrCreate2, iArrCreate4, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, 9, iArrCreate5);
        mul(iArrCreate4, iArrCreate5, iArrCreate5);
        int[] iArrCreate6 = create();
        sqr(iArrCreate5, iArrCreate6);
        mul(iArr, iArrCreate6, iArrCreate6);
        int[] iArrCreate7 = create();
        sqr(iArrCreate6, 18, iArrCreate7);
        mul(iArrCreate5, iArrCreate7, iArrCreate7);
        int[] iArrCreate8 = create();
        sqr(iArrCreate7, 37, iArrCreate8);
        mul(iArrCreate7, iArrCreate8, iArrCreate8);
        int[] iArrCreate9 = create();
        sqr(iArrCreate8, 37, iArrCreate9);
        mul(iArrCreate7, iArrCreate9, iArrCreate9);
        int[] iArrCreate10 = create();
        sqr(iArrCreate9, UMErrorCode.E_UM_BE_CREATE_FAILED, iArrCreate10);
        mul(iArrCreate9, iArrCreate10, iArrCreate10);
        int[] iArrCreate11 = create();
        sqr(iArrCreate10, iArrCreate11);
        mul(iArr, iArrCreate11, iArrCreate11);
        int[] iArrCreate12 = create();
        sqr(iArrCreate11, 223, iArrCreate12);
        mul(iArrCreate12, iArrCreate10, iArr2);
    }

    public static void reduce(int[] iArr, int i) {
        int i2;
        int i3 = iArr[15];
        int i4 = i3 & M28;
        long j = (i3 >>> 28) + i;
        int i5 = 0;
        long j2 = j;
        while (true) {
            if (i5 >= 8) {
                break;
            }
            long j3 = j2 + (4294967295L & ((long) iArr[i5]));
            iArr[i5] = ((int) j3) & M28;
            j2 = j3 >> 28;
            i5++;
        }
        long j4 = j2 + j;
        for (i2 = 8; i2 < 15; i2++) {
            long j5 = j4 + (((long) iArr[i2]) & 4294967295L);
            iArr[i2] = ((int) j5) & M28;
            j4 = j5 >> 28;
        }
        iArr[15] = i4 + ((int) j4);
    }

    public static void sqr(int[] iArr, int i, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i * 2;
        int i18 = i2 * 2;
        int i19 = i3 * 2;
        int i20 = i4 * 2;
        int i21 = i5 * 2;
        int i22 = i6 * 2;
        int i23 = i7 * 2;
        int i24 = i9 * 2;
        int i25 = i10 * 2;
        int i26 = i11 * 2;
        int i27 = i12 * 2;
        int i28 = i13 * 2;
        int i29 = i14 * 2;
        int i30 = i15 * 2;
        int i31 = i + i9;
        int i32 = i2 + i10;
        int i33 = i3 + i11;
        int i34 = i4 + i12;
        int i35 = i5 + i13;
        int i36 = i6 + i14;
        int i37 = i7 + i15;
        int i38 = i8 + i16;
        int i39 = i32 * 2;
        int i40 = i33 * 2;
        int i41 = i34 * 2;
        int i42 = i37 * 2;
        long j = i;
        long j2 = j * j;
        long j3 = i8;
        long j4 = i18;
        long j5 = j3 * j4;
        long j6 = i7;
        long j7 = i19;
        long j8 = (j6 * j7) + j5;
        long j9 = i6;
        long j10 = i20;
        long j11 = i5;
        long j12 = j11 * j11;
        long j13 = i9;
        long j14 = i16;
        long j15 = i25;
        long j16 = j14 * j15;
        long j17 = i15;
        long j18 = i26;
        long j19 = (j17 * j18) + j16;
        long j20 = i14;
        long j21 = i27;
        long j22 = (j20 * j21) + j19;
        long j23 = i13;
        long j24 = i31;
        long j25 = i38;
        long j26 = ((long) i39) & 4294967295L;
        long j27 = j25 * j26;
        long j28 = i37;
        long j29 = ((long) i40) & 4294967295L;
        long j30 = (j28 * j29) + j27;
        long j31 = i36;
        long j32 = ((long) i41) & 4294967295L;
        long j33 = (j31 * j32) + j30;
        long j34 = i35;
        long j35 = (j34 * j34) + j33;
        long j36 = ((j2 + (j13 * j13)) + j35) - (j12 + ((j9 * j10) + j8));
        int i43 = ((int) j36) & M28;
        long j37 = ((((j23 * j23) + j22) + (j24 * j24)) - j2) + j35;
        int i44 = ((int) j37) & M28;
        long j38 = j37 >>> 28;
        long j39 = i2;
        long j40 = i17;
        long j41 = j39 * j40;
        long j42 = i21;
        long j43 = (j9 * j42) + (j6 * j10) + (j3 * j7);
        long j44 = i10;
        long j45 = i24;
        long j46 = (j17 * j21) + (j14 * j18);
        long j47 = i28;
        long j48 = (j20 * j47) + j46;
        long j49 = i32;
        long j50 = ((long) (i31 * 2)) & 4294967295L;
        long j51 = ((long) (i35 * 2)) & 4294967295L;
        long j52 = (j31 * j51) + (j28 * j32) + (j25 * j29);
        long j53 = (((j41 + (j44 * j45)) + j52) - j43) + (j36 >>> 28);
        int i45 = ((int) j53) & M28;
        long j54 = j53 >>> 28;
        long j55 = ((j48 + (j49 * j50)) - j41) + j52 + j38;
        int i46 = ((int) j55) & M28;
        long j56 = j55 >>> 28;
        long j57 = i3;
        long j58 = (j39 * j39) + (j57 * j40);
        long j59 = (j9 * j9) + (j6 * j42) + (j3 * j10);
        long j60 = i11;
        long j61 = (j44 * j44) + (j60 * j45);
        long j62 = i33;
        long j63 = (j31 * j31) + (j28 * j51) + (j25 * j32);
        long j64 = (((j58 + j61) + j63) - j59) + j54;
        int i47 = ((int) j64) & M28;
        long j65 = ((((j20 * j20) + ((j17 * j47) + (j14 * j21))) + ((j49 * j49) + (j62 * j50))) - j58) + j63 + j56;
        int i48 = ((int) j65) & M28;
        long j66 = i4;
        long j67 = (j57 * j4) + (j66 * j40);
        long j68 = i22;
        long j69 = j6 * j68;
        long j70 = i12;
        long j71 = (j60 * j15) + (j70 * j45);
        long j72 = i29;
        long j73 = (j17 * j72) + (j14 * j47);
        long j74 = i34;
        long j75 = (j62 * j26) + (j74 * j50);
        long j76 = ((long) (i36 * 2)) & 4294967295L;
        long j77 = (j28 * j76) + (j51 * j25);
        long j78 = (((j67 + j71) + j77) - (j69 + (j3 * j42))) + (j64 >>> 28);
        int i49 = ((int) j78) & M28;
        long j79 = ((j73 + j75) - j67) + j77 + (j65 >>> 28);
        int i50 = ((int) j79) & M28;
        long j80 = (j57 * j57) + (j66 * j4) + (j11 * j40);
        long j81 = (j62 * j62) + (j74 * j26) + (j34 * j50);
        long j82 = (j28 * j28) + (j76 * j25);
        long j83 = (((j80 + ((j60 * j60) + ((j70 * j15) + (j23 * j45)))) + j82) - ((j6 * j6) + (j68 * j3))) + (j78 >>> 28);
        int i51 = ((int) j83) & M28;
        long j84 = ((((j17 * j17) + (j72 * j14)) + j81) - j80) + j82 + (j79 >>> 28);
        int i52 = ((int) j84) & M28;
        long j85 = (j66 * j7) + (j11 * j4) + (j9 * j40);
        long j86 = (j70 * j18) + (j23 * j15) + (j20 * j45);
        long j87 = (j74 * j29) + (j34 * j26) + (j31 * j50);
        long j88 = (((long) i42) & 4294967295L) * j25;
        long j89 = (((j85 + j86) + j88) - (((long) i23) * j3)) + (j83 >>> 28);
        int i53 = ((int) j89) & M28;
        long j90 = (((((long) i30) * j14) + j87) - j85) + j88 + (j84 >>> 28);
        int i54 = ((int) j90) & M28;
        long j91 = (j66 * j66) + (j11 * j7) + (j9 * j4) + (j6 * j40);
        long j92 = j25 * j25;
        long j93 = (((j91 + ((j70 * j70) + ((j23 * j18) + ((j20 * j15) + (j17 * j45))))) + j92) - (j3 * j3)) + (j89 >>> 28);
        int i55 = ((int) j93) & M28;
        long j94 = (((j14 * j14) + ((j74 * j74) + ((j34 * j29) + ((j31 * j26) + (j28 * j50))))) - j91) + j92 + (j90 >>> 28);
        int i56 = ((int) j94) & M28;
        long j95 = (j10 * j11) + (j9 * j7) + (j6 * j4) + (j3 * j40);
        long j96 = (j23 * j21) + (j20 * j18) + (j17 * j15) + (j14 * j45) + j95 + (j93 >>> 28);
        int i57 = ((int) j96) & M28;
        long j97 = (((j34 * j32) + ((j31 * j29) + ((j28 * j26) + (j25 * j50)))) - j95) + (j94 >>> 28);
        int i58 = ((int) j97) & M28;
        long j98 = j97 >>> 28;
        long j99 = (j96 >>> 28) + j98 + ((long) i44);
        int i59 = ((int) j99) & M28;
        long j100 = j98 + ((long) i43);
        iArr2[0] = 268435455 & ((int) j100);
        iArr2[1] = i45 + ((int) (j100 >>> 28));
        iArr2[2] = i47;
        iArr2[3] = i49;
        iArr2[4] = i51;
        iArr2[5] = i53;
        iArr2[6] = i55;
        iArr2[7] = i57;
        iArr2[8] = i59;
        iArr2[9] = i46 + ((int) (j99 >>> 28));
        iArr2[10] = i48;
        iArr2[11] = i50;
        iArr2[12] = i52;
        iArr2[13] = i54;
        iArr2[14] = i56;
        iArr2[15] = i58;
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        sqr(iArr, iArrCreate);
        mul(iArrCreate, iArr2, iArrCreate);
        sqr(iArrCreate, iArrCreate2);
        mul(iArrCreate, iArr, iArrCreate);
        mul(iArrCreate2, iArr, iArrCreate2);
        mul(iArrCreate2, iArr2, iArrCreate2);
        int[] iArrCreate3 = create();
        powPm3d4(iArrCreate2, iArrCreate3);
        mul(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArr2, iArrCreate4);
        sub(iArr, iArrCreate4, iArrCreate4);
        normalize(iArrCreate4);
        if (!isZeroVar(iArrCreate4)) {
            return false;
        }
        copy(iArrCreate3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = (i2 + 536870910) - i18;
        int i33 = (i6 + 536870910) - i22;
        int i34 = (i10 + 536870910) - i26;
        int i35 = (i14 + 536870910) - i30;
        int i36 = (i16 + 536870910) - iArr2[15];
        int i37 = ((i3 + 536870910) - i19) + (i32 >>> 28);
        int i38 = i32 & M28;
        int i39 = ((i7 + 536870910) - i23) + (i33 >>> 28);
        int i40 = i33 & M28;
        int i41 = ((i11 + 536870910) - i27) + (i34 >>> 28);
        int i42 = i34 & M28;
        int i43 = ((i15 + 536870910) - i31) + (i35 >>> 28);
        int i44 = i35 & M28;
        int i45 = ((i4 + 536870910) - i20) + (i37 >>> 28);
        int i46 = i37 & M28;
        int i47 = ((i8 + 536870910) - i24) + (i39 >>> 28);
        int i48 = i39 & M28;
        int i49 = ((i12 + 536870910) - i28) + (i41 >>> 28);
        int i50 = i41 & M28;
        int i51 = i36 + (i43 >>> 28);
        int i52 = i43 & M28;
        int i53 = i51 >>> 28;
        int i54 = i51 & M28;
        int i55 = ((i + 536870910) - i17) + i53;
        int i56 = ((i5 + 536870910) - i21) + (i45 >>> 28);
        int i57 = i45 & M28;
        int i58 = ((i9 + 536870908) - i25) + i53 + (i47 >>> 28);
        int i59 = i47 & M28;
        int i60 = ((i13 + 536870910) - i29) + (i49 >>> 28);
        int i61 = i49 & M28;
        int i62 = i38 + (i55 >>> 28);
        int i63 = i55 & M28;
        int i64 = i40 + (i56 >>> 28);
        int i65 = i56 & M28;
        int i66 = i42 + (i58 >>> 28);
        int i67 = i58 & M28;
        int i68 = i44 + (i60 >>> 28);
        int i69 = i60 & M28;
        iArr3[0] = i63;
        iArr3[1] = i62;
        iArr3[2] = i46;
        iArr3[3] = i57;
        iArr3[4] = i65;
        iArr3[5] = i64;
        iArr3[6] = i48;
        iArr3[7] = i59;
        iArr3[8] = i67;
        iArr3[9] = i66;
        iArr3[10] = i50;
        iArr3[11] = i61;
        iArr3[12] = i69;
        iArr3[13] = i68;
        iArr3[14] = i52;
        iArr3[15] = i54;
    }

    public static void subOne(int[] iArr) {
        int[] iArrCreate = create();
        iArrCreate[0] = 1;
        sub(iArr, iArrCreate, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
    }
}
