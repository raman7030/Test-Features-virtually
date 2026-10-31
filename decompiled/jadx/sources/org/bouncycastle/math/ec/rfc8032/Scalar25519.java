package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Scalar25519 {
    public static final int L0 = -50998291;
    public static final int L1 = 19280294;
    public static final int L2 = 127719000;
    public static final int L3 = -6428113;
    public static final int L4 = 5343;
    public static final long M08L = 255;
    public static final long M28L = 268435455;
    public static final long M32L = 4294967295L;
    public static final int SCALAR_BYTES = 32;
    public static final int SIZE = 8;
    public static final int TARGET_LENGTH = 254;
    public static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    public static byte[] reduce384(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & 4294967295L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & 4294967295L;
        long jDecode33 = ((long) Codec.decode32(bArr, 7)) & 4294967295L;
        long jDecode25 = ((long) (Codec.decode24(bArr, 11) << 4)) & 4294967295L;
        long jDecode34 = ((long) Codec.decode32(bArr, 14)) & 4294967295L;
        long jDecode26 = ((long) (Codec.decode24(bArr, 18) << 4)) & 4294967295L;
        long jDecode35 = ((long) Codec.decode32(bArr, 21)) & 4294967295L;
        long jDecode27 = ((long) (Codec.decode24(bArr, 25) << 4)) & 4294967295L;
        long jDecode36 = ((long) Codec.decode32(bArr, 28)) & 4294967295L;
        long jDecode28 = Codec.decode24(bArr, 32) << 4;
        long j = jDecode28 & 4294967295L;
        long jDecode37 = Codec.decode32(bArr, 35);
        long j2 = jDecode37 & 4294967295L;
        long jDecode29 = Codec.decode24(bArr, 39) << 4;
        long j3 = jDecode29 & 4294967295L;
        long jDecode38 = Codec.decode32(bArr, 42);
        long jDecode16 = (4294967295L & ((long) (Codec.decode16(bArr, 46) << 4))) + ((jDecode38 & 4294967295L) >> 28);
        long j4 = (jDecode38 & 268435455) + (j3 >> 28);
        long j5 = (jDecode35 - (jDecode16 * 127719000)) - (j4 * (-6428113));
        long j6 = (jDecode27 - (jDecode16 * (-6428113))) - (j4 * 5343);
        long j7 = (jDecode29 & 268435455) + (j2 >> 28);
        long j8 = (jDecode25 - (j4 * (-50998291))) - (j7 * 19280294);
        long j9 = ((jDecode34 - (jDecode16 * (-50998291))) - (j4 * 19280294)) - (j7 * 127719000);
        long j10 = ((jDecode26 - (jDecode16 * 19280294)) - (j4 * 127719000)) - (j7 * (-6428113));
        long j11 = (jDecode37 & 268435455) + (j >> 28);
        long j12 = jDecode24 - (j11 * (-50998291));
        long j13 = (jDecode33 - (j7 * (-50998291))) - (j11 * 19280294);
        long j14 = j8 - (j11 * 127719000);
        long j15 = j9 - (j11 * (-6428113));
        long j16 = j10 - (j11 * 5343);
        long j17 = (jDecode36 - (jDecode16 * 5343)) + (j6 >> 28);
        long j18 = (jDecode28 & 268435455) + (j17 >> 28);
        long j19 = j17 & 268435455;
        long j20 = j19 >>> 27;
        long j21 = j18 + j20;
        long j22 = jDecode32 - (j21 * (-50998291));
        long j23 = (j12 - (j21 * 19280294)) + (j22 >> 28);
        long j24 = (j13 - (j21 * 127719000)) + (j23 >> 28);
        long j25 = (j14 - (j21 * (-6428113))) + (j24 >> 28);
        long j26 = (j15 - (j21 * 5343)) + (j25 >> 28);
        long j27 = j16 + (j26 >> 28);
        long j28 = (j5 - (j7 * 5343)) + (j27 >> 28);
        long j29 = (j6 & 268435455) + (j28 >> 28);
        long j30 = j19 + (j29 >> 28);
        long j31 = (j30 >> 28) - j20;
        long j32 = (j22 & 268435455) + (j31 & (-50998291));
        long j33 = (j23 & 268435455) + (j31 & 19280294) + (j32 >> 28);
        long j34 = (j24 & 268435455) + (j31 & 127719000) + (j33 >> 28);
        long j35 = (j25 & 268435455) + (j31 & (-6428113)) + (j34 >> 28);
        long j36 = (j26 & 268435455) + (j31 & 5343) + (j35 >> 28);
        long j37 = (j27 & 268435455) + (j36 >> 28);
        long j38 = (j28 & 268435455) + (j37 >> 28);
        long j39 = (j29 & 268435455) + (j38 >> 28);
        byte[] bArr2 = new byte[64];
        Codec.encode56(((j33 & 268435455) << 28) | (j32 & 268435455), bArr2, 0);
        Codec.encode56((j34 & 268435455) | ((j35 & 268435455) << 28), bArr2, 7);
        Codec.encode56(((j37 & 268435455) << 28) | (j36 & 268435455), bArr2, 14);
        Codec.encode56((j38 & 268435455) | ((j39 & 268435455) << 28), bArr2, 21);
        Codec.encode32((int) ((j30 & 268435455) + (j39 >> 28)), bArr2, 28);
        return bArr2;
    }

    public static byte[] reduce512(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & 4294967295L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & 4294967295L;
        long jDecode33 = ((long) Codec.decode32(bArr, 7)) & 4294967295L;
        long jDecode25 = ((long) (Codec.decode24(bArr, 11) << 4)) & 4294967295L;
        long jDecode34 = ((long) Codec.decode32(bArr, 14)) & 4294967295L;
        long jDecode26 = ((long) (Codec.decode24(bArr, 18) << 4)) & 4294967295L;
        long jDecode35 = ((long) Codec.decode32(bArr, 21)) & 4294967295L;
        long jDecode27 = ((long) (Codec.decode24(bArr, 25) << 4)) & 4294967295L;
        long jDecode36 = ((long) Codec.decode32(bArr, 28)) & 4294967295L;
        long jDecode28 = ((long) (Codec.decode24(bArr, 32) << 4)) & 4294967295L;
        long jDecode37 = ((long) Codec.decode32(bArr, 35)) & 4294967295L;
        long jDecode29 = ((long) (Codec.decode24(bArr, 39) << 4)) & 4294967295L;
        long jDecode38 = ((long) Codec.decode32(bArr, 42)) & 4294967295L;
        long jDecode210 = ((long) (Codec.decode24(bArr, 46) << 4)) & 4294967295L;
        long jDecode39 = Codec.decode32(bArr, 49);
        long j = jDecode39 & 4294967295L;
        long jDecode211 = ((long) (Codec.decode24(bArr, 53) << 4)) & 4294967295L;
        long jDecode310 = Codec.decode32(bArr, 56);
        long j2 = jDecode310 & 4294967295L;
        long jDecode212 = 4294967295L & ((long) (Codec.decode24(bArr, 60) << 4));
        long j3 = ((long) bArr[63]) & 255;
        long j4 = jDecode212 + (j2 >> 28);
        long j5 = jDecode310 & 268435455;
        long j6 = jDecode36 - (j4 * (-50998291));
        long j7 = (jDecode28 - (j3 * (-50998291))) - (j4 * 19280294);
        long j8 = (jDecode38 - (j3 * (-6428113))) - (j4 * 5343);
        long j9 = ((jDecode29 - (j3 * 127719000)) - (j4 * (-6428113))) - (j5 * 5343);
        long j10 = jDecode211 + (j >> 28);
        long j11 = jDecode39 & 268435455;
        long j12 = (((jDecode37 - (j3 * 19280294)) - (j4 * 127719000)) - (j5 * (-6428113))) - (j10 * 5343);
        long j13 = ((jDecode27 - (j5 * (-50998291))) - (j10 * 19280294)) - (j11 * 127719000);
        long j14 = ((j7 - (j5 * 127719000)) - (j10 * (-6428113))) - (j11 * 5343);
        long j15 = (jDecode210 - (j3 * 5343)) + (j8 >> 28);
        long j16 = jDecode34 - (j15 * (-50998291));
        long j17 = (jDecode26 - (j11 * (-50998291))) - (j15 * 19280294);
        long j18 = ((jDecode35 - (j10 * (-50998291))) - (j11 * 19280294)) - (j15 * 127719000);
        long j19 = j13 - (j15 * (-6428113));
        long j20 = (((j6 - (j5 * 19280294)) - (j10 * 127719000)) - (j11 * (-6428113))) - (j15 * 5343);
        long j21 = (j8 & 268435455) + (j9 >> 28);
        long j22 = j9 & 268435455;
        long j23 = jDecode25 - (j21 * (-50998291));
        long j24 = j16 - (j21 * 19280294);
        long j25 = j17 - (j21 * 127719000);
        long j26 = j18 - (j21 * (-6428113));
        long j27 = j19 - (j21 * 5343);
        long j28 = j22 + (j12 >> 28);
        long j29 = j12 & 268435455;
        long j30 = jDecode33 - (j28 * (-50998291));
        long j31 = j23 - (j28 * 19280294);
        long j32 = j24 - (j28 * 127719000);
        long j33 = j25 - (j28 * (-6428113));
        long j34 = j26 - (j28 * 5343);
        long j35 = j29 + (j14 >> 28);
        long j36 = j20 + (j27 >> 28);
        long j37 = j36 & 268435455;
        long j38 = j37 >>> 27;
        long j39 = (j14 & 268435455) + (j36 >> 28) + j38;
        long j40 = jDecode32 - (j39 * (-50998291));
        long j41 = ((jDecode24 - (j35 * (-50998291))) - (j39 * 19280294)) + (j40 >> 28);
        long j42 = j40 & 268435455;
        long j43 = ((j30 - (j35 * 19280294)) - (j39 * 127719000)) + (j41 >> 28);
        long j44 = ((j31 - (j35 * 127719000)) - (j39 * (-6428113))) + (j43 >> 28);
        long j45 = ((j32 - (j35 * (-6428113))) - (j39 * 5343)) + (j44 >> 28);
        long j46 = (j33 - (j35 * 5343)) + (j45 >> 28);
        long j47 = j45 & 268435455;
        long j48 = j34 + (j46 >> 28);
        long j49 = (j27 & 268435455) + (j48 >> 28);
        long j50 = j37 + (j49 >> 28);
        long j51 = (j50 >> 28) - j38;
        long j52 = j42 + (j51 & (-50998291));
        long j53 = (j41 & 268435455) + (j51 & 19280294) + (j52 >> 28);
        long j54 = (j43 & 268435455) + (j51 & 127719000) + (j53 >> 28);
        long j55 = (j44 & 268435455) + (j51 & (-6428113)) + (j54 >> 28);
        long j56 = j47 + (j51 & 5343) + (j55 >> 28);
        long j57 = (j46 & 268435455) + (j56 >> 28);
        long j58 = (j48 & 268435455) + (j57 >> 28);
        long j59 = (j49 & 268435455) + (j58 >> 28);
        byte[] bArr2 = new byte[32];
        Codec.encode56((j52 & 268435455) | ((j53 & 268435455) << 28), bArr2, 0);
        Codec.encode56(((j55 & 268435455) << 28) | (j54 & 268435455), bArr2, 7);
        Codec.encode56(((j57 & 268435455) << 28) | (j56 & 268435455), bArr2, 14);
        Codec.encode56((j58 & 268435455) | ((j59 & 268435455) << 28), bArr2, 21);
        Codec.encode32((int) ((j50 & 268435455) + (j59 >> 28)), bArr2, 28);
        return bArr2;
    }

    public static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i2 = 1016;
        int[] iArr12 = new int[4];
        int[] iArr13 = iArr9;
        int[] iArr14 = iArr10;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int i3 = 15;
        while (bitLengthPositive > 254) {
            i2--;
            if (i2 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i3, iArr6) - bitLengthPositive;
            int i4 = bitLength & (~(bitLength >> 31));
            if (iArr6[i3] < 0) {
                i = i3;
                ScalarUtil.addShifted_NP(i3, i4, iArr4, iArr5, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i4, iArr13, iArr12, iArr14, iArr11);
            } else {
                i = i3;
                ScalarUtil.subShifted_NP(i, i4, iArr4, iArr5, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i4, iArr13, iArr12, iArr14, iArr11);
            }
            int i5 = i;
            if (ScalarUtil.lessThan(i5, iArr4, iArr5)) {
                i3 = bitLengthPositive >>> 5;
                bitLengthPositive = ScalarUtil.getBitLengthPositive(i3, iArr4);
                int[] iArr15 = iArr12;
                iArr12 = iArr11;
                iArr11 = iArr15;
                int[] iArr16 = iArr5;
                iArr5 = iArr4;
                iArr4 = iArr16;
                int[] iArr17 = iArr13;
                iArr13 = iArr14;
                iArr14 = iArr17;
            } else {
                i3 = i5;
                bitLengthPositive = bitLengthPositive;
            }
        }
        System.arraycopy(iArr14, 0, iArr2, 0, 4);
        System.arraycopy(iArr11, 0, iArr3, 0, 4);
        return true;
    }

    public static void toSignedDigits(int i, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
