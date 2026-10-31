package org.bouncycastle.crypto.generators;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import l.C13325;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public NaccacheSternKeyGenerationParameters param;
    public static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 109, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    public static final BigInteger ONE = BigInteger.valueOf(1);

    public static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    public static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i);
        return bigIntegerCreateRandomPrime;
    }

    public static int getInt(SecureRandom secureRandom, int i) {
        int iNextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((((long) i) * ((long) (secureRandom.nextInt() & Integer.MAX_VALUE))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = iNextInt % i;
        } while ((i - 1) + (iNextInt - i2) < 0);
        return i2;
    }

    public static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger3;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigIntegerMod;
        int i;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        BigInteger bigInteger8;
        BigInteger bigInteger9;
        PrintStream printStream;
        StringBuilder sb;
        PrintStream printStream2;
        StringBuilder sb2;
        long j;
        BigInteger bigIntegerCreateRandomPrime;
        SecureRandom secureRandom;
        BigInteger bigInteger10;
        BigInteger bigInteger11;
        int i2;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply2 = ONE;
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2;
        for (int i3 = 0; i3 < vectorPermuteList.size() / 2; i3++) {
            bigIntegerMultiply3 = bigIntegerMultiply3.multiply((BigInteger) vectorPermuteList.elementAt(i3));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply4 = bigIntegerMultiply3.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply4.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply3).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j2 = 0;
        while (true) {
            j2++;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply5 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    bigInteger = bigIntegerShiftLeft2;
                    bigInteger2 = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply5.add(bigInteger2);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    bigIntegerShiftLeft2 = bigInteger;
                    bigIntegerGeneratePrime4 = bigIntegerGeneratePrime4;
                    strength = strength;
                }
                bigInteger3 = bigIntegerShiftLeft;
                if (BigIntegers.modOddIsCoprime(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2), bigIntegerMultiply4)) {
                    bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerAdd2);
                    bigInteger4 = bigIntegerGeneratePrime4;
                    if (bigIntegerMultiply.bitLength() >= strength) {
                        break;
                    }
                    int i4 = strength;
                    random = random;
                    certainty = certainty;
                    bigInteger10 = bigIntegerGeneratePrime3;
                    bigInteger11 = bigInteger4;
                    if (zIsDebug) {
                        PrintStream printStream3 = System.out;
                        i2 = i4;
                        StringBuilder sbM32308 = C13325.m32308(i2, "key size too small. Should be ", " but is actually ");
                        sbM32308.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream3.println(sbM32308.toString());
                    } else {
                        i2 = i4;
                    }
                }
                bigIntegerGeneratePrime3 = bigInteger10;
                bigIntegerShiftLeft2 = bigInteger;
                bigIntegerShiftLeft = bigInteger3;
                random = random;
                certainty = certainty;
                int i5 = i2;
                bigIntegerGeneratePrime4 = bigInteger11;
                strength = i5;
            } else {
                bigInteger = bigIntegerShiftLeft2;
                bigInteger3 = bigIntegerShiftLeft;
            }
            bigInteger10 = bigIntegerGeneratePrime3;
            BigInteger bigInteger12 = bigIntegerGeneratePrime4;
            i2 = strength;
            bigInteger11 = bigInteger12;
            bigIntegerGeneratePrime3 = bigInteger10;
            bigIntegerShiftLeft2 = bigInteger;
            bigIntegerShiftLeft = bigInteger3;
            random = random;
            certainty = certainty;
            int i6 = i2;
            bigIntegerGeneratePrime4 = bigInteger11;
            strength = i6;
        }
        if (zIsDebug) {
            System.out.println("needed " + j2 + " tries to generate p and q.");
        }
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger2).multiply(bigIntegerAdd2.subtract(bigInteger2));
        if (zIsDebug) {
            System.out.println("generating g");
        }
        long j3 = 0;
        while (true) {
            Vector vector = new Vector();
            int i7 = 0;
            bigInteger5 = bigIntegerAdd2;
            while (i7 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i7));
                while (true) {
                    j = j3 + 1;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply).equals(ONE)) {
                        j3 = j;
                        random = secureRandom;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i7++;
                j3 = j;
                random = secureRandom;
            }
            SecureRandom secureRandom2 = random;
            bigIntegerMod = ONE;
            int i8 = 0;
            while (i8 < vectorPermuteList.size()) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i8)).modPow(bigIntegerMultiply4.divide((BigInteger) vectorPermuteList.elementAt(i8)), bigIntegerMultiply)).mod(bigIntegerMultiply);
                i8++;
                vector = vector;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= vectorPermuteList.size()) {
                    i = certainty;
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply);
                    BigInteger bigInteger13 = ONE;
                    if (bigIntegerModPow.equals(bigInteger13)) {
                        if (zIsDebug) {
                            printStream2 = System.out;
                            sb2 = new StringBuilder("g has order phi(n)/4\n g:");
                            sb = sb2;
                            printStream = printStream2;
                            bigInteger6 = bigIntegerGeneratePrime2;
                            sb.append(bigIntegerMod);
                            printStream.println(sb.toString());
                        }
                        bigInteger7 = bigIntegerGeneratePrime3;
                        strength = strength;
                        bigInteger8 = bigInteger4;
                    } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply).equals(bigInteger13)) {
                        bigInteger6 = bigIntegerGeneratePrime2;
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply).equals(bigInteger13)) {
                            bigInteger7 = bigIntegerGeneratePrime3;
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger7), bigIntegerMultiply).equals(bigInteger13)) {
                                strength = strength;
                                bigInteger8 = bigInteger4;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger8), bigIntegerMultiply).equals(bigInteger13)) {
                                    break;
                                }
                                if (zIsDebug) {
                                    bigIntegerMultiply6 = bigIntegerMultiply6;
                                    System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                } else {
                                    bigIntegerMultiply6 = bigIntegerMultiply6;
                                }
                            } else {
                                if (zIsDebug) {
                                    System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                }
                                bigInteger8 = bigInteger4;
                            }
                        } else {
                            if (zIsDebug) {
                                printStream = System.out;
                                sb = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb.append(bigIntegerMod);
                                printStream.println(sb.toString());
                            }
                            bigInteger7 = bigIntegerGeneratePrime3;
                            strength = strength;
                            bigInteger8 = bigInteger4;
                        }
                    } else {
                        if (zIsDebug) {
                            printStream2 = System.out;
                            sb2 = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb = sb2;
                            printStream = printStream2;
                            bigInteger6 = bigIntegerGeneratePrime2;
                            sb.append(bigIntegerMod);
                            printStream.println(sb.toString());
                        }
                        bigInteger7 = bigIntegerGeneratePrime3;
                        strength = strength;
                        bigInteger8 = bigInteger4;
                    }
                    bigIntegerGeneratePrime2 = bigInteger6;
                    bigInteger4 = bigInteger8;
                    bigIntegerMultiply6 = bigIntegerMultiply6;
                    strength = strength;
                    bigIntegerAdd2 = bigInteger5;
                    random = secureRandom2;
                    certainty = i;
                    bigIntegerGeneratePrime3 = bigInteger7;
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i9)), bigIntegerMultiply).equals(ONE)) {
                    i9++;
                } else if (zIsDebug) {
                    i = certainty;
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i9) + "\n g: " + bigIntegerMod);
                } else {
                    i = certainty;
                }
                bigInteger6 = bigIntegerGeneratePrime2;
                bigInteger7 = bigIntegerGeneratePrime3;
                strength = strength;
                bigInteger8 = bigInteger4;
                bigIntegerGeneratePrime2 = bigInteger6;
                bigInteger4 = bigInteger8;
                bigIntegerMultiply6 = bigIntegerMultiply6;
                strength = strength;
                bigIntegerAdd2 = bigInteger5;
                random = secureRandom2;
                certainty = i;
                bigIntegerGeneratePrime3 = bigInteger7;
            }
        }
        BigInteger bigInteger14 = bigIntegerMultiply6;
        if (zIsDebug) {
            System.out.println("needed " + j3 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply4 + " (" + bigIntegerMultiply4.bitLength() + " bits)");
            PrintStream printStream4 = System.out;
            StringBuilder sb3 = new StringBuilder("a:.......... ");
            sb3.append(bigInteger7);
            printStream4.println(sb3.toString());
            System.out.println("b:.......... " + bigInteger8);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigInteger6);
            System.out.println("p:.......... " + bigIntegerAdd);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + bigIntegerMultiply);
            PrintStream printStream5 = System.out;
            StringBuilder sb4 = new StringBuilder("phi(n):..... ");
            bigInteger9 = bigInteger14;
            sb4.append(bigInteger9);
            printStream5.println(sb4.toString());
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        } else {
            bigInteger9 = bigInteger14;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength(), vectorPermuteList, bigInteger9));
    }
}
