package org.bouncycastle.math.raw;

import java.util.Random;
import org.bouncycastle.util.Integers;
import p067l.C10050;
import p067l.C22934;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Mod {
    public static final int M30 = 1073741823;
    public static final long M32L = 4294967295L;

    public static int add30(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4] + iArr2[i4] + i3;
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = iArr[i2] + iArr2[i2] + i3;
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void cnegate30(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = ((iArr[i5] ^ i2) - i2) + i4;
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        iArr[i3] = ((iArr[i3] ^ i2) - i2) + i4;
    }

    public static void cnormalize30(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i - 1;
        int i4 = iArr[i3] >> 31;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = (((iArr[i6] + (iArr2[i6] & i4)) ^ i2) - i2) + i5;
            iArr[i6] = i7 & M30;
            i5 = i7 >> 30;
        }
        int i8 = (((iArr[i3] + (i4 & iArr2[i3])) ^ i2) - i2) + i5;
        iArr[i3] = i8;
        int i9 = i8 >> 31;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = iArr[i11] + (iArr2[i11] & i9) + i10;
            iArr[i11] = i12 & M30;
            i10 = i12 >> 30;
        }
        iArr[i3] = iArr[i3] + (i9 & iArr2[i3]) + i10;
    }

    public static void decode30(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            while (i2 < Math.min(32, i)) {
                j |= ((long) iArr[i3]) << i2;
                i2 += 30;
                i3++;
            }
            iArr2[i4] = (int) j;
            j >>>= 32;
            i2 -= 32;
            i -= 32;
            i4++;
        }
    }

    public static int divsteps30Var(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = 30;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i8) | i7);
            int i13 = i7 >> iNumberOfTrailingZeros;
            i9 <<= iNumberOfTrailingZeros;
            i10 <<= iNumberOfTrailingZeros;
            i5 -= iNumberOfTrailingZeros;
            i8 -= iNumberOfTrailingZeros;
            if (i8 <= 0) {
                iArr[0] = i9;
                iArr[1] = i10;
                iArr[2] = i11;
                iArr[3] = i12;
                return i5;
            }
            if (i5 <= 0) {
                i5 = 2 - i5;
                int i14 = -i6;
                int i15 = -i9;
                int i16 = -i10;
                i4 = ((-1) >>> (32 - (i5 > i8 ? i8 : i5))) & 63 & (((i13 * i13) - 2) * i13 * i14);
                i13 = i14;
                i6 = i13;
                int i17 = i11;
                i11 = i15;
                i9 = i17;
                int i18 = i12;
                i12 = i16;
                i10 = i18;
            } else {
                i4 = ((-1) >>> (32 - (i5 > i8 ? i8 : i5))) & 15 & (((((i6 + 1) & 4) << 1) + i6) * (-i13));
            }
            i7 = i13 + (i6 * i4);
            i11 += i9 * i4;
            i12 += i4 * i10;
        }
    }

    public static void encode30(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (i2 < Math.min(30, i)) {
                j |= (((long) iArr[i3]) & 4294967295L) << i2;
                i2 += 32;
                i3++;
            }
            iArr2[i4] = ((int) j) & M30;
            j >>>= 30;
            i2 -= 30;
            i -= 30;
            i4++;
        }
    }

    public static int equalTo(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        for (int i4 = 1; i4 < i; i4++) {
            i3 |= iArr[i4];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static boolean equalToVar(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        if (i3 != 0) {
            return false;
        }
        for (int i4 = 1; i4 < i; i4++) {
            i3 |= iArr[i4];
        }
        return i3 == 0;
    }

    public static int getMaximumDivsteps(int i) {
        return (int) (((((long) i) * 188898) + ((long) (i < 46 ? 308405 : 181188))) >>> 16);
    }

    public static int getMaximumHDDivsteps(int i) {
        return (int) (((((long) i) * 150964) + 99243) >>> 16);
    }

    public static int hddivsteps30(int i, int i2, int i3, int[] iArr) {
        int i4 = 1073741824;
        int i5 = 1073741824;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < 30; i8++) {
            int i9 = i >> 31;
            int i10 = -(i3 & 1);
            int i11 = i3 - ((i2 ^ i9) & i10);
            int i12 = i7 - ((i4 ^ i9) & i10);
            int i13 = i5 - ((i6 ^ i9) & i10);
            int i14 = (~i9) & i10;
            i = (i ^ i14) + 1;
            i2 += i11 & i14;
            i4 += i12 & i14;
            i6 += i14 & i13;
            i3 = i11 >> 1;
            i7 = i12 >> 1;
            i5 = i13 >> 1;
        }
        iArr[0] = i4;
        iArr[1] = i6;
        iArr[2] = i7;
        iArr[3] = i5;
        return i;
    }

    public static int inverse32(int i) {
        int iM51252 = C22934.m51252(i, i, 2, i);
        int iM51253 = C22934.m51252(i, iM51252, 2, iM51252);
        int iM51254 = C22934.m51252(i, iM51253, 2, iM51253);
        return C22934.m51252(i, iM51254, 2, iM51254);
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        char c = 0;
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int iInverse32 = inverse32(iArr9[0]);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int i2 = 0;
        int i3 = 0;
        while (i3 < maximumHDDivsteps) {
            int iHddivsteps30 = hddivsteps30(i2, iArr7[c], iArr8[c], iArr4);
            updateDE30(i, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(i, iArr7, iArr8, iArr4);
            i3 += 30;
            i2 = iHddivsteps30;
            maximumHDDivsteps = maximumHDDivsteps;
            c = 0;
        }
        int i4 = iArr7[i - 1] >> 31;
        cnegate30(i, i4, iArr7);
        cnormalize30(i, i4, iArr5, iArr9);
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return equalTo(i, iArr7, 1) & equalTo(i, iArr8, 0);
    }

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        ?? r5 = 0;
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int i2 = -bitLength;
        int iInverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        int iTrimFG30 = i;
        while (!equalToVar(iTrimFG30, iArr8, r5)) {
            if (bitLength >= maximumDivsteps) {
                return r5;
            }
            int iDivsteps30Var = divsteps30Var(i2, iArr7[r5], iArr8[0], iArr4);
            int i3 = iTrimFG30;
            updateDE30(i, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(i3, iArr7, iArr8, iArr4);
            iTrimFG30 = trimFG30(i3, iArr7, iArr8);
            r5 = 0;
            i2 = iDivsteps30Var;
            bitLength += 30;
            maximumDivsteps = maximumDivsteps;
        }
        int i4 = iTrimFG30;
        int i5 = iArr7[i4 - 1] >> 31;
        int iNegate30 = iArr5[i - 1] >> 31;
        if (iNegate30 < 0) {
            iNegate30 = add30(i, iArr5, iArr9);
        }
        if (i5 < 0) {
            iNegate30 = negate30(i, iArr5);
            negate30(i4, iArr7);
        }
        if (!equalToVar(i4, iArr7, 1)) {
            return false;
        }
        if (iNegate30 < 0) {
            add30(i, iArr5, iArr9);
        }
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return true;
    }

    public static int modOddIsCoprime(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[i];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, i);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i2 = 0; i2 < maximumHDDivsteps; i2 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr4[0], iArr5[0], iArr3);
            updateFG30(i, iArr4, iArr5, iArr3);
        }
        cnegate30(i, iArr4[i - 1] >> 31, iArr4);
        return equalTo(i, iArr5, 0) & equalTo(i, iArr4, 1);
    }

    public static boolean modOddIsCoprimeVar(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int iTrimFG30 = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[iTrimFG30];
        int[] iArr5 = new int[iTrimFG30];
        int[] iArr6 = new int[iTrimFG30];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, iTrimFG30);
        int iDivsteps30Var = -bitLength;
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        while (!equalToVar(iTrimFG30, iArr5, 0)) {
            if (bitLength >= maximumDivsteps) {
                return false;
            }
            bitLength += 30;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr4[0], iArr5[0], iArr3);
            updateFG30(iTrimFG30, iArr4, iArr5, iArr3);
            iTrimFG30 = trimFG30(iTrimFG30, iArr4, iArr5);
        }
        if ((iArr4[iTrimFG30 - 1] >> 31) < 0) {
            negate30(iTrimFG30, iArr4);
        }
        return equalToVar(iTrimFG30, iArr4, 1);
    }

    public static int negate30(int i, int[] iArr) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                iArrCreate[i8] = random.nextInt();
            }
            iArrCreate[i] = iArrCreate[i] & i7;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    public static int trimFG30(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = iArr[i2];
        int i4 = iArr2[i2];
        int i5 = i - 2;
        if (((i5 >> 31) | ((i3 >> 31) ^ i3) | ((i4 >> 31) ^ i4)) != 0) {
            return i;
        }
        iArr[i5] = (i3 << 30) | iArr[i5];
        iArr2[i5] = iArr2[i5] | (i4 << 30);
        return i - 1;
    }

    public static void updateDE30(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j4 * j7) + (j2 * j6);
        long j9 = i13;
        long j10 = i11 - (((((int) j5) * i2) + i11) & M30);
        long j11 = (j9 * j10) + j5;
        long j12 = i12 - (((((int) j8) * i2) + i12) & M30);
        long j13 = (j9 * j12) + j8;
        long j14 = j11 >> 30;
        long j15 = j13 >> 30;
        int i14 = 1;
        while (i14 < i3) {
            int i15 = iArr4[i14];
            long j16 = iArr[i14];
            long j17 = j12;
            long j18 = iArr2[i14];
            long j19 = j3 * j18;
            long j20 = i15;
            long jM23418 = C10050.m23418(j20, j10, j19 + (j * j16), j14);
            long jM23419 = C10050.m23418(j20, j17, (j18 * j7) + (j16 * j6), j15);
            int i16 = i14 - 1;
            iArr[i16] = ((int) jM23418) & M30;
            j14 = jM23418 >> 30;
            iArr2[i16] = ((int) jM23419) & M30;
            j15 = jM23419 >> 30;
            i14++;
            i3 = i;
            j12 = j17;
        }
        iArr[i8] = (int) j14;
        iArr2[i8] = (int) j15;
    }

    public static void updateFG30(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr3[0];
        int i3 = iArr3[1];
        int i4 = iArr3[2];
        int i5 = iArr3[3];
        long j = i2;
        long j2 = iArr[0];
        long j3 = i3;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i4;
        long j7 = i5;
        long j8 = (j4 * j7) + (j2 * j6);
        long j9 = j5 >> 30;
        long j10 = j8 >> 30;
        int i6 = 1;
        while (i6 < i) {
            long j11 = j7;
            long j12 = iArr[i6];
            long j13 = j * j12;
            long j14 = j;
            long j15 = iArr2[i6];
            long jM23418 = C10050.m23418(j3, j15, j13, j9);
            long jM23419 = C10050.m23418(j11, j15, j6 * j12, j10);
            int i7 = i6 - 1;
            iArr[i7] = ((int) jM23418) & M30;
            j9 = jM23418 >> 30;
            iArr2[i7] = 1073741823 & ((int) jM23419);
            j10 = jM23419 >> 30;
            i6++;
            j7 = j11;
            j = j14;
        }
        int i8 = i - 1;
        iArr[i8] = (int) j9;
        iArr2[i8] = (int) j10;
    }
}
