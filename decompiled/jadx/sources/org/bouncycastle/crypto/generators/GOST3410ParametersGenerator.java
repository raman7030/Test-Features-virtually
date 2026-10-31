package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410ParametersGenerator {
    public static final BigInteger ONE = BigInteger.valueOf(1);
    public static final BigInteger TWO = BigInteger.valueOf(2);
    public SecureRandom init_random;
    public int size;
    public int typeproc;

    private int procedure_A(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        int i4;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i5;
        int iNextInt = i;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.init_random.nextInt() / 32768;
        }
        int iNextInt2 = i2;
        while (true) {
            i4 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(iNextInt));
        int i6 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i3};
        int i7 = 0;
        int i8 = 0;
        while (iArr[i7] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i8 = i7 + 1;
            iArr[i8] = iArr[i7] / 2;
            i7 = i8;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i8 + 1];
        int i9 = 16;
        bigIntegerArr4[i8] = new BigInteger("8003", 16);
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 < i8) {
            int i12 = iArr[i10] / i9;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i6, bigIntegerArr5, i6, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i12 + 1];
                System.arraycopy(bigIntegerArr5, i6, bigIntegerArr2, i6, length2);
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i13 + 1;
                    bigIntegerArr2[i14] = bigIntegerArr2[i13].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i9));
                    i13 = i14;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                for (int i15 = 0; i15 < i12; i15++) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i15].multiply(TWO.pow(i15 * 16)));
                }
                bigIntegerArr2[0] = bigIntegerArr2[i12];
                BigInteger bigInteger8 = TWO;
                int i16 = i10 + 1;
                BigInteger bigIntegerAdd = bigInteger8.pow(iArr[i10] - i4).divide(bigIntegerArr4[i16]).add(bigInteger8.pow(iArr[i10] - i4).multiply(bigInteger7).divide(bigIntegerArr4[i16].multiply(bigInteger8.pow(i12 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (bigIntegerMod.compareTo(bigInteger9) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger9);
                }
                int i17 = 0;
                while (true) {
                    bigInteger2 = bigInteger4;
                    bigInteger3 = bigInteger5;
                    long j = i17;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i16].multiply(bigIntegerAdd.add(BigInteger.valueOf(j)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger10);
                    bigIntegerArr4[i10] = bigIntegerAdd2;
                    i5 = i8;
                    BigInteger bigInteger11 = TWO;
                    if (bigIntegerAdd2.compareTo(bigInteger11.pow(iArr[i10])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i16].multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerArr4[i10]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigIntegerAdd.add(BigInteger.valueOf(j)), bigIntegerArr4[i10]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i17 += 2;
                        bigInteger4 = bigInteger2;
                        i8 = i5;
                        bigInteger5 = bigInteger3;
                    } else {
                        i6 = 0;
                        i4 = 1;
                        i9 = 16;
                        bigInteger4 = bigInteger2;
                        i8 = i5;
                        bigIntegerArr3 = bigIntegerArr2;
                        bigInteger5 = bigInteger3;
                    }
                }
            }
            i10--;
            if (i10 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                return bigInteger.intValue();
            }
            i11++;
            i6 = 0;
            i4 = 1;
            i9 = 16;
            bigInteger4 = bigInteger2;
            i8 = i5;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger5 = bigInteger3;
        }
        bigInteger = bigIntegerArr3[0];
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        int i2;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i3;
        long jNextInt = j;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= Blake2xsDigest.MAX_NUMBER_BLOCKS) {
                break;
            }
            jNextInt = this.init_random.nextInt() * 2;
        }
        long jNextInt2 = j2;
        while (true) {
            i2 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= Blake2xsDigest.MAX_NUMBER_BLOCKS && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger5 = new BigInteger("97781173");
        BigInteger bigInteger6 = new BigInteger(Long.toString(jNextInt));
        int i4 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i};
        int i5 = 0;
        int i6 = 0;
        while (iArr[i5] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i6 = i5 + 1;
            iArr[i6] = iArr[i5] / 2;
            i5 = i6;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i6 + 1];
        bigIntegerArr4[i6] = new BigInteger("8000000B", 16);
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = 32;
            int i10 = iArr[i7] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i4, bigIntegerArr5, i4, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i10 + 1];
                System.arraycopy(bigIntegerArr5, i4, bigIntegerArr2, i4, length2);
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    bigIntegerArr2[i12] = bigIntegerArr2[i11].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i9));
                    i11 = i12;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                for (int i13 = 0; i13 < i10; i13++) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i13].multiply(TWO.pow(i13 * 32)));
                }
                bigIntegerArr2[0] = bigIntegerArr2[i10];
                BigInteger bigInteger8 = TWO;
                int i14 = i7 + 1;
                BigInteger bigIntegerAdd = bigInteger8.pow(iArr[i7] - i2).divide(bigIntegerArr4[i14]).add(bigInteger8.pow(iArr[i7] - i2).multiply(bigInteger7).divide(bigIntegerArr4[i14].multiply(bigInteger8.pow(i10 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (bigIntegerMod.compareTo(bigInteger9) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger9);
                }
                int i15 = 0;
                while (true) {
                    long j3 = i15;
                    bigInteger2 = bigInteger4;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i14].multiply(bigIntegerAdd.add(BigInteger.valueOf(j3)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger10);
                    bigIntegerArr4[i7] = bigIntegerAdd2;
                    bigInteger3 = bigInteger5;
                    BigInteger bigInteger11 = TWO;
                    i3 = i6;
                    if (bigIntegerAdd2.compareTo(bigInteger11.pow(iArr[i7])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i14].multiply(bigIntegerAdd.add(BigInteger.valueOf(j3))), bigIntegerArr4[i7]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigIntegerAdd.add(BigInteger.valueOf(j3)), bigIntegerArr4[i7]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i15 += 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                        i6 = i3;
                    } else {
                        i4 = 0;
                        i2 = 1;
                        i9 = 32;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                        i6 = i3;
                        bigIntegerArr3 = bigIntegerArr2;
                    }
                }
            }
            i7--;
            if (i7 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                return bigInteger.longValue();
            }
            i8++;
            i4 = 0;
            i2 = 1;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            i6 = i3;
            bigIntegerArr3 = bigIntegerArr2;
        }
        bigInteger = bigIntegerArr3[0];
        return bigInteger.longValue();
    }

    private void procedure_B(int i, int i2, BigInteger[] bigIntegerArr) {
        int i3;
        int iNextInt = i;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            } else {
                iNextInt = this.init_random.nextInt() / 32768;
            }
        }
        int iNextInt2 = i2;
        while (true) {
            i3 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            } else {
                iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger2 = new BigInteger("19381");
        int iProcedure_A = procedure_A(iNextInt, iNextInt2, bigIntegerArr2, 256);
        char c = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int iProcedure_A2 = procedure_A(iProcedure_A, iNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(iProcedure_A2));
        while (true) {
            int i4 = 0;
            while (i4 < 64) {
                int i5 = i4 + 1;
                bigIntegerArr3[i5] = bigIntegerArr3[i4].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i4 = i5;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i6 = 0; i6 < 64; i6++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i6].multiply(TWO.pow(i6 * 16)));
            }
            bigIntegerArr3[c] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            int i7 = 1024;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            BigInteger bigInteger8 = bigIntegerAdd;
            int i8 = 0;
            while (true) {
                long j = i8;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j)));
                BigInteger bigInteger9 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                if (bigIntegerAdd2.compareTo(bigInteger10.pow(i7)) == i3) {
                    break;
                }
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[0] = bigIntegerAdd2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i8 += 2;
                    i3 = 1;
                    i7 = 1024;
                }
            }
            c = 0;
        }
    }

    private void procedure_Bb(long j, long j2, BigInteger[] bigIntegerArr) {
        int i;
        long jNextInt = j;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= Blake2xsDigest.MAX_NUMBER_BLOCKS) {
                break;
            } else {
                jNextInt = this.init_random.nextInt() * 2;
            }
        }
        long jNextInt2 = j2;
        while (true) {
            i = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= Blake2xsDigest.MAX_NUMBER_BLOCKS && jNextInt2 / 2 != 0) {
                break;
            } else {
                jNextInt2 = (this.init_random.nextInt() * 2) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long j3 = jNextInt2;
        long jProcedure_Aa = procedure_Aa(jNextInt, j3, bigIntegerArr2, 256);
        char c = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long jProcedure_Aa2 = procedure_Aa(jProcedure_Aa, j3, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(jProcedure_Aa2));
        while (true) {
            int i2 = 0;
            while (i2 < 32) {
                int i3 = i2 + 1;
                bigIntegerArr3[i3] = bigIntegerArr3[i2].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i2 = i3;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i4 = 0; i4 < 32; i4++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i4].multiply(TWO.pow(i4 * 32)));
            }
            bigIntegerArr3[c] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            int i5 = 1024;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            BigInteger bigInteger8 = bigIntegerAdd;
            int i6 = 0;
            while (true) {
                long j4 = i6;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j4)));
                BigInteger bigInteger9 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                if (bigIntegerAdd2.compareTo(bigInteger10.pow(i5)) == i) {
                    break;
                }
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j4))), bigIntegerAdd2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j4))), bigIntegerAdd2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[0] = bigIntegerAdd2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i6 += 2;
                    i = 1;
                    i5 = 1024;
                }
            }
            c = 0;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (bigIntegerCreateRandomBigInteger.compareTo(bigInteger3) > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigIntegerCreateRandomBigInteger.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger3) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int iNextInt = this.init_random.nextInt();
            int iNextInt2 = this.init_random.nextInt();
            int i = this.size;
            if (i == 512) {
                procedure_A(iNextInt, iNextInt2, bigIntegerArr, 512);
            } else {
                if (i != 1024) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(iNextInt, iNextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(iNextInt, iNextInt2));
        }
        long jNextLong = this.init_random.nextLong();
        long jNextLong2 = this.init_random.nextLong();
        int i2 = this.size;
        if (i2 == 512) {
            procedure_Aa(jNextLong, jNextLong2, bigIntegerArr, 512);
        } else {
            if (i2 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            procedure_Bb(jNextLong, jNextLong2, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(jNextLong, jNextLong2));
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.typeproc = i2;
        this.init_random = secureRandom;
    }
}
