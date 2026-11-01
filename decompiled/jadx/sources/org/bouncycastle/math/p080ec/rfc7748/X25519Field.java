package org.bouncycastle.math.p080ec.rfc7748;

import com.alipay.sdk.p010m.p058y.C0254q;
import org.bouncycastle.math.raw.Mod;
import p067l.C10050;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X25519Field {
    public static final int M24 = 16777215;
    public static final int M25 = 33554431;
    public static final int M26 = 67108863;
    public static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] ROOT_NEG_ONE = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
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
        int i11 = i3 + (i2 >> 26);
        int i12 = i2 & M26;
        int i13 = i5 + (i4 >> 26);
        int i14 = i4 & M26;
        int i15 = i8 + (i7 >> 26);
        int i16 = i7 & M26;
        int i17 = i10 + (i9 >> 26);
        int i18 = i9 & M26;
        int i19 = i14 + (i11 >> 25);
        int i20 = i11 & M25;
        int i21 = i6 + (i13 >> 25);
        int i22 = i13 & M25;
        int i23 = i18 + (i15 >> 25);
        int i24 = i15 & M25;
        int i25 = ((i17 >> 25) * 38) + i;
        int i26 = i17 & M25;
        int i27 = i12 + (i25 >> 26);
        int i28 = i25 & M26;
        int i29 = i16 + (i21 >> 26);
        int i30 = i21 & M26;
        int i31 = i20 + (i27 >> 26);
        int i32 = i27 & M26;
        int i33 = i22 + (i19 >> 26);
        int i34 = i19 & M26;
        int i35 = i24 + (i29 >> 26);
        int i36 = i29 & M26;
        int i37 = i26 + (i23 >> 26);
        int i38 = i23 & M26;
        iArr[0] = i28;
        iArr[1] = i32;
        iArr[2] = i31;
        iArr[3] = i34;
        iArr[4] = i33;
        iArr[5] = i30;
        iArr[6] = i36;
        iArr[7] = i35;
        iArr[8] = i38;
        iArr[9] = i37;
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i) {
        return new int[i * 10];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode128(bArr, i, iArr, 0);
        decode128(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void decode(byte[] bArr, int i, int[] iArr, int i2) {
        decode128(bArr, i, iArr, i2);
        decode128(bArr, i + 16, iArr, i2 + 5);
        int i3 = i2 + 9;
        iArr[i3] = iArr[i3] & 16777215;
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode128(bArr, 0, iArr, 0);
        decode128(bArr, 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode128(iArr, i, iArr2, 0);
        decode128(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static void decode128(byte[] bArr, int i, int[] iArr, int i2) {
        int iDecode32 = decode32(bArr, i);
        int iDecode33 = decode32(bArr, i + 4);
        int iDecode34 = decode32(bArr, i + 8);
        int iDecode35 = decode32(bArr, i + 12);
        iArr[i2] = iDecode32 & M26;
        iArr[i2 + 1] = ((iDecode32 >>> 26) | (iDecode33 << 6)) & M26;
        iArr[i2 + 2] = ((iDecode33 >>> 20) | (iDecode34 << 12)) & M25;
        iArr[i2 + 3] = 67108863 & ((iDecode35 << 19) | (iDecode34 >>> 13));
        iArr[i2 + 4] = iDecode35 >>> 7;
    }

    public static void decode128(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & M26;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & M26;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & M25;
        iArr2[i2 + 3] = 67108863 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void encode(int[] iArr, int i, byte[] bArr, int i2) {
        encode128(iArr, i, bArr, i2);
        encode128(iArr, i + 5, bArr, i2 + 16);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode128(iArr, 0, bArr, 0);
        encode128(iArr, 5, bArr, 16);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode128(iArr, 0, bArr, i);
        encode128(iArr, 5, bArr, i + 16);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode128(iArr, 0, iArr2, i);
        encode128(iArr, 5, iArr2, i + 4);
    }

    public static void encode128(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        encode32((i4 << 26) | i3, bArr, i2);
        encode32((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        encode32((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        encode32((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    public static void encode128(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
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
        long j = i4;
        long j2 = i;
        long j3 = j * j2;
        int i12 = ((int) j3) & M25;
        long j4 = ((long) i6) * j2;
        int i13 = ((int) j4) & M25;
        long j5 = ((long) i9) * j2;
        int i14 = ((int) j5) & M25;
        long j6 = j5 >> 25;
        long j7 = ((long) i11) * j2;
        int i15 = ((int) j7) & M25;
        long j8 = (((long) i2) * j2) + ((j7 >> 25) * 38);
        iArr2[0] = ((int) j8) & M26;
        long j9 = (((long) i7) * j2) + (j4 >> 25);
        iArr2[5] = ((int) j9) & M26;
        long j10 = (((long) i3) * j2) + (j8 >> 26);
        iArr2[1] = ((int) j10) & M26;
        long j11 = j10 >> 26;
        long j12 = (((long) i5) * j2) + (j3 >> 25);
        iArr2[3] = ((int) j12) & M26;
        long j13 = (((long) i8) * j2) + (j9 >> 26);
        iArr2[6] = ((int) j13) & M26;
        long j14 = j13 >> 26;
        long j15 = (((long) i10) * j2) + j6;
        iArr2[8] = 67108863 & ((int) j15);
        iArr2[2] = i12 + ((int) j11);
        iArr2[4] = i13 + ((int) (j12 >> 26));
        iArr2[7] = i14 + ((int) j14);
        iArr2[9] = i15 + ((int) (j15 >> 26));
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = i3;
        long j6 = (j5 * j2) + (j * j4);
        long j7 = i6;
        long j8 = i5;
        long j9 = (j8 * j2) + (j5 * j4) + (j * j7);
        long j10 = i8;
        long j11 = i7;
        long jM23418 = C10050.m23418(j11, j2, j * j10, ((j8 * j4) + (j5 * j7)) << 1);
        long j12 = (j8 * j7) << 1;
        long j13 = i10;
        long j14 = (j11 * j4) + (j5 * j10) + (j * j13);
        long j15 = i9;
        long jM23419 = C10050.m23418(j15, j2, j14, j12);
        long j16 = ((j15 * j4) + ((j11 * j7) + ((j8 * j10) + (j5 * j13)))) << 1;
        long j17 = (j11 * j10) + (((j15 * j7) + (j8 * j13)) << 1);
        long j18 = j10 * j15;
        long j19 = (j15 * j13) << 1;
        long j20 = i11;
        long j21 = i12;
        long j22 = j20 * j21;
        long j23 = i14;
        long j24 = i13;
        long j25 = (j24 * j21) + (j20 * j23);
        long j26 = i16;
        long j27 = i15;
        long j28 = (j27 * j21) + (j24 * j23) + (j20 * j26);
        long j29 = ((j27 * j23) + (j24 * j26)) << 1;
        long j30 = i18;
        long j31 = i17;
        long jM234110 = C10050.m23418(j31, j21, j20 * j30, j29);
        long j32 = (j27 * j26) << 1;
        long j33 = i20;
        long j34 = (j31 * j23) + (j24 * j30) + (j20 * j33);
        long j35 = i19;
        long jM234111 = C10050.m23418(j35, j21, j34, j32);
        long j36 = j3 - (((j23 * j35) + ((j31 * j26) + ((j27 * j30) + (j24 * j33)))) * 76);
        long j37 = j6 - (((j31 * j30) + (((j26 * j35) + (j27 * j33)) << 1)) * 38);
        long j38 = j9 - (((j30 * j35) + (j31 * j33)) * 38);
        long j39 = jM23418 - ((j33 * j35) * 76);
        long j40 = j16 - j22;
        long j41 = j17 - j25;
        long j42 = (j18 + (j11 * j13)) - j28;
        long j43 = j19 - jM234110;
        int i21 = i2 + i12;
        int i22 = i3 + i13;
        int i23 = i4 + i14;
        int i24 = i5 + i15;
        int i25 = i6 + i16;
        int i26 = i8 + i18;
        int i27 = i10 + i20;
        long j44 = i + i11;
        long j45 = i21;
        long j46 = j44 * j45;
        long j47 = i23;
        long j48 = i22;
        long j49 = (j48 * j45) + (j44 * j47);
        long j50 = i25;
        long j51 = i24;
        long j52 = (j51 * j45) + (j48 * j47) + (j44 * j50);
        long j53 = j51 * j47;
        long j54 = i26;
        long j55 = i7 + i17;
        long jM234112 = C10050.m23418(j55, j45, j44 * j54, (j53 + (j48 * j50)) << 1);
        long j56 = (j51 * j50) << 1;
        long j57 = i27;
        long j58 = (j55 * j47) + (j48 * j54) + (j44 * j57);
        long j59 = i9 + i19;
        long jM234113 = C10050.m23418(j59, j45, j58, j56);
        long j60 = ((j47 * j59) + ((j55 * j50) + ((j51 * j54) + (j48 * j57)))) << 1;
        long j61 = (j55 * j54) + (((j50 * j59) + (j51 * j57)) << 1);
        long j62 = (j54 * j59) + (j55 * j57);
        long j63 = (j57 * j59) << 1;
        long j64 = (jM234112 - j39) + j43;
        int i28 = ((int) j64) & M26;
        long j65 = ((jM234113 - jM23419) - jM234111) + (j64 >> 26);
        int i29 = ((int) j65) & M25;
        long j66 = ((((j65 >> 25) + j60) - j40) * 38) + j36;
        iArr3[0] = ((int) j66) & M26;
        long j67 = ((j61 - j41) * 38) + j37 + (j66 >> 26);
        iArr3[1] = ((int) j67) & M26;
        long j68 = ((j62 - j42) * 38) + j38 + (j67 >> 26);
        iArr3[2] = ((int) j68) & M25;
        long j69 = ((j63 - j43) * 38) + j39 + (j68 >> 25);
        iArr3[3] = ((int) j69) & M26;
        long jM234114 = C10050.m23418(jM234111, 38L, jM23419, j69 >> 26);
        iArr3[4] = ((int) jM234114) & M25;
        long j70 = (j46 - j36) + j40 + (jM234114 >> 25);
        iArr3[5] = ((int) j70) & M26;
        long j71 = (j49 - j37) + j41 + (j70 >> 26);
        iArr3[6] = ((int) j71) & M26;
        long j72 = (j52 - j38) + j42 + (j71 >> 26);
        iArr3[7] = ((int) j72) & M25;
        long j73 = (j72 >> 25) + ((long) i28);
        iArr3[8] = ((int) j73) & M26;
        iArr3[9] = i29 + ((int) (j73 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void normalize(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        reduce(iArr, i);
        reduce(iArr, -i);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] iArrCreate = create();
        sqr(iArr2, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArr2, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, 5, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 5, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 10, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 25, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 25, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 50, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, C0254q.f1218h, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr3);
    }

    public static void reduce(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j) & M26;
        long j2 = (j >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j2) & M26;
        long j3 = (j2 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j3) & M25;
        long j4 = (j3 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j4) & M26;
        long j5 = (j4 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j5) & M25;
        long j6 = (j5 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j6) & M26;
        long j7 = (j6 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j7) & M26;
        long j8 = (j7 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
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
        int i11 = i4 * 2;
        long j = i;
        long j2 = i2 * 2;
        long j3 = j * j2;
        long j4 = i3 * 2;
        long j5 = i2;
        long j6 = (j5 * j5) + (j * j4);
        long j7 = i11;
        long j8 = (j * j7) + (j2 * j4);
        long j9 = i5 * 2;
        long j10 = (j5 * j7) + (j * j9) + (((long) i3) * j4);
        long j11 = (j7 * j4) + (j2 * j9);
        long j12 = i4;
        long j13 = (j12 * j12) + (j4 * j9);
        long j14 = j12 * j9;
        long j15 = ((long) i5) * j9;
        long j16 = i6;
        long j17 = i7 * 2;
        long j18 = i8 * 2;
        long j19 = i7;
        long j20 = (j19 * j19) + (j16 * j18);
        long j21 = i9 * 2;
        long j22 = (j16 * j21) + (j17 * j18);
        long j23 = i10 * 2;
        long j24 = (j19 * j21) + (j16 * j23) + (((long) i8) * j18);
        long j25 = i9;
        long j26 = (j * j) - (((j21 * j18) + (j17 * j23)) * 38);
        long j27 = j3 - (((j25 * j25) + (j18 * j23)) * 38);
        long j28 = j6 - ((j25 * j23) * 38);
        long j29 = j8 - ((((long) i10) * j23) * 38);
        long j30 = j11 - (j16 * j16);
        long j31 = j13 - (j16 * j17);
        long j32 = j14 - j20;
        long j33 = j15 - j22;
        int i12 = i2 + i7;
        int i13 = i3 + i8;
        int i14 = i4 + i9;
        int i15 = i5 + i10;
        long j34 = i + i6;
        long j35 = i12 * 2;
        long j36 = i13 * 2;
        long j37 = i12;
        long j38 = (j37 * j37) + (j34 * j36);
        long j39 = i14 * 2;
        long j40 = i15 * 2;
        long j41 = i14;
        long j42 = (((j34 * j39) + (j35 * j36)) - j29) + j33;
        int i16 = ((int) j42) & M26;
        long j43 = ((((j37 * j39) + ((j34 * j40) + (((long) i13) * j36))) - j10) - j24) + (j42 >> 26);
        int i17 = ((int) j43) & M25;
        long j44 = ((((j43 >> 25) + ((j39 * j36) + (j35 * j40))) - j30) * 38) + j26;
        iArr2[0] = ((int) j44) & M26;
        long j45 = ((((j41 * j41) + (j36 * j40)) - j31) * 38) + j27 + (j44 >> 26);
        iArr2[1] = ((int) j45) & M26;
        long j46 = (((j41 * j40) - j32) * 38) + j28 + (j45 >> 26);
        iArr2[2] = ((int) j46) & M25;
        long j47 = (((((long) i15) * j40) - j33) * 38) + j29 + (j46 >> 25);
        iArr2[3] = ((int) j47) & M26;
        long jM23418 = C10050.m23418(j24, 38L, j10, j47 >> 26);
        iArr2[4] = ((int) jM23418) & M25;
        long j48 = ((j34 * j34) - j26) + j30 + (jM23418 >> 25);
        iArr2[5] = ((int) j48) & M26;
        long j49 = ((j34 * j35) - j27) + j31 + (j48 >> 26);
        iArr2[6] = ((int) j49) & M26;
        long j50 = (j38 - j28) + j32 + (j49 >> 26);
        iArr2[7] = ((int) j50) & M25;
        long j51 = (j50 >> 25) + ((long) i16);
        iArr2[8] = ((int) j51) & M26;
        iArr2[9] = i17 + ((int) (j51 >> 26));
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        mul(iArr, iArr2, iArrCreate);
        sqr(iArr2, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate);
        sqr(iArrCreate2, iArrCreate2);
        mul(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = create();
        int[] iArrCreate4 = create();
        powPm5d8(iArrCreate2, iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArrCreate, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, iArrCreate5);
        mul(iArrCreate5, iArr2, iArrCreate5);
        sub(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (isZeroVar(iArrCreate3)) {
            copy(iArrCreate4, 0, iArr3, 0);
            return true;
        }
        add(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (!isZeroVar(iArrCreate3)) {
            return false;
        }
        mul(iArrCreate4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }
}
