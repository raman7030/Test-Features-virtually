package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class HQCEngine {
    public static final int SALT_SIZE_BYTES = 16;
    public static final int SEED_BYTES = 32;
    public final int K_BYTE;
    public final int N1N2_BYTE;
    public final int N1N2_BYTE_64;
    public final int N_BYTE;
    public final int N_BYTE_64;
    public final int N_MU;
    public final int delta;
    public final int fft;
    public final int g;
    public final int[] generatorPoly;
    public final GF2PolynomialCalculator gf;
    public final int k;
    public final int mulParam;
    public final int n;
    public final int n1;
    public final int pkSize;
    public final long rejectionThreshold;
    public final int w;
    public final int wr;

    public HQCEngine(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        this.n = i;
        this.k = i4;
        this.delta = i6;
        this.w = i7;
        this.wr = i8;
        this.n1 = i2;
        this.generatorPoly = iArr;
        this.g = i5;
        this.fft = i9;
        this.N_MU = i10;
        this.pkSize = i11;
        this.mulParam = i3 >> 7;
        this.N_BYTE = Utils.getByteSizeFromBitSize(i);
        this.K_BYTE = i4;
        int byte64SizeFromBitSize = Utils.getByte64SizeFromBitSize(i);
        this.N_BYTE_64 = byte64SizeFromBitSize;
        int i12 = i2 * i3;
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i12);
        this.N1N2_BYTE = Utils.getByteSizeFromBitSize(i12);
        this.gf = new GF2PolynomialCalculator(byte64SizeFromBitSize, i, (1 << (i & 63)) - 1);
        long j = i;
        this.rejectionThreshold = (16777216 / j) * j;
    }

    private int barrettReduce(int i) {
        long j = (((long) i) * ((long) this.N_MU)) >>> 32;
        int i2 = this.n;
        int i3 = i - ((int) (j * ((long) i2)));
        return i3 - ((-(((i3 - i2) >>> 31) ^ 1)) & i2);
    }

    public static int compareU32(int i, int i2) {
        return (((i - i2) | (i2 - i)) >>> 31) ^ 1;
    }

    private void generateRandomSupport(int[] iArr, int i, Shake256RandomGenerator shake256RandomGenerator) {
        int i2 = i * 3;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = i2;
        while (i3 < i) {
            if (i4 == i2) {
                shake256RandomGenerator.xofGetBytes(bArr, i2);
                i4 = 0;
            }
            int i5 = i4 + 2;
            int i6 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 += 3;
            int i7 = i6 | (bArr[i5] & 255);
            if (i7 < this.rejectionThreshold) {
                int iBarrettReduce = barrettReduce(i7);
                int i8 = 0;
                while (true) {
                    if (i8 >= i3) {
                        iArr[i3] = iBarrettReduce;
                        i3++;
                        break;
                    } else if (iArr[i8] == iBarrettReduce) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
    }

    private void hashGJ(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4, int i5, byte b) {
        SHA3Digest sHA3Digest = new SHA3Digest(i);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, i2, i3);
        sHA3Digest.update(bArr4, i4, i5);
        sHA3Digest.update(b);
        sHA3Digest.doFinal(bArr, 0);
    }

    public static void hashHI(byte[] bArr, int i, byte[] bArr2, int i2, byte b) {
        SHA3Digest sHA3Digest = new SHA3Digest(i);
        sHA3Digest.update(bArr2, 0, i2);
        sHA3Digest.update(b);
        sHA3Digest.doFinal(bArr, 0);
    }

    private void pkeEncrypt(long[] jArr, long[] jArr2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = this.N_BYTE_64;
        long[] jArr3 = new long[i2];
        long[] jArr4 = new long[i2];
        int i3 = this.n1;
        byte[] bArr4 = new byte[i3];
        ReedSolomon.encode(bArr4, bArr2, i3, this.k, this.g, this.generatorPoly);
        ReedMuller.encode(jArr2, bArr4, this.n1, this.mulParam);
        Shake256RandomGenerator shake256RandomGenerator = new Shake256RandomGenerator(bArr, 0, 32, (byte) 1);
        vectSetRandom(shake256RandomGenerator, jArr4);
        shake256RandomGenerator.init(bArr3, i, 32, (byte) 1);
        vectSampleFixedWeights2(shake256RandomGenerator, jArr3, this.wr);
        this.gf.vectMul(jArr, jArr3, jArr4);
        Utils.fromByteArrayToLongArray(jArr4, bArr, 32, this.pkSize - 32);
        this.gf.vectMul(jArr4, jArr3, jArr4);
        vectSampleFixedWeights2(shake256RandomGenerator, jArr3, this.wr);
        Longs.xorTo(this.N_BYTE_64, jArr3, 0, jArr4, 0);
        vectTruncate(jArr4);
        Longs.xorTo(this.N1N2_BYTE_64, jArr4, 0, jArr2, 0);
        vectSampleFixedWeights2(shake256RandomGenerator, jArr4, this.wr);
        Longs.xorTo(this.N_BYTE_64, jArr4, 0, jArr, 0);
        Arrays.clear(jArr3);
        Arrays.clear(jArr4);
        Arrays.clear(bArr4);
    }

    private void vectSampleFixedWeights2(Shake256RandomGenerator shake256RandomGenerator, long[] jArr, int i) {
        int i2 = this.wr;
        int[] iArr = new int[i2];
        int i3 = i2 << 2;
        byte[] bArr = new byte[i3];
        shake256RandomGenerator.xofGetBytes(bArr, i3);
        Pack.littleEndianToInt(bArr, 0, iArr);
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = ((int) (((((long) iArr[i4]) & 4294967295L) * ((long) (this.n - i4))) >> 32)) + i4;
        }
        int i5 = i - 1;
        while (true) {
            int i6 = i5 - 1;
            if (i5 <= 0) {
                writeSupportToVector(jArr, iArr, i);
                return;
            }
            int iCompareU32 = 0;
            while (i5 < i) {
                iCompareU32 |= compareU32(iArr[i5], iArr[i6]);
                i5++;
            }
            int i7 = -iCompareU32;
            iArr[i6] = ((~i7) & iArr[i6]) ^ (i7 & i6);
            i5 = i6;
        }
    }

    private void vectSetRandom(Shake256RandomGenerator shake256RandomGenerator, long[] jArr) {
        byte[] bArr = new byte[jArr.length << 3];
        shake256RandomGenerator.xofGetBytes(bArr, this.N_BYTE);
        Pack.littleEndianToLong(bArr, 0, jArr);
        int i = this.N_BYTE_64 - 1;
        jArr[i] = jArr[i] & Utils.bitMask(this.n, 64L);
    }

    private void vectTruncate(long[] jArr) {
        Arrays.fill(jArr, this.N1N2_BYTE_64, (this.n + 63) >> 6, 0L);
    }

    private void writeSupportToVector(long[] jArr, int[] iArr, int i) {
        int i2 = this.wr;
        int[] iArr2 = new int[i2];
        long[] jArr2 = new long[i2];
        for (int i3 = 0; i3 < i; i3++) {
            iArr2[i3] = iArr[i3] >>> 6;
            jArr2[i3] = 1 << (iArr[i3] & 63);
        }
        for (int i4 = 0; i4 < jArr.length; i4++) {
            long j = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i4 - iArr2[i5];
                j |= jArr2[i5] & ((long) (-(((i6 | (-i6)) >>> 31) ^ 1)));
            }
            jArr[i4] = j;
        }
    }

    public int decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = this.N_BYTE_64;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        long[] jArr3 = new long[i];
        long[] jArr4 = new long[i];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        int i2 = this.k;
        byte[] bArr6 = new byte[i2];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[this.n1];
        vectSampleFixedWeight1(jArr4, new Shake256RandomGenerator(bArr3, this.pkSize, 32, (byte) 1), this.w);
        Utils.fromByteArrayToLongArray(jArr, bArr2, 0, this.N_BYTE);
        Utils.fromByteArrayToLongArray(jArr2, bArr2, this.N_BYTE, this.N1N2_BYTE);
        this.gf.vectMul(jArr3, jArr4, jArr);
        vectTruncate(jArr3);
        Longs.xorTo(this.N_BYTE_64, jArr2, 0, jArr3, 0);
        ReedMuller.decode(bArr8, jArr3, this.n1, this.mulParam);
        ReedSolomon.decode(bArr6, bArr8, this.n1, this.fft, this.delta, this.k, this.g);
        hashHI(bArr4, 256, bArr3, this.pkSize, (byte) 1);
        hashGJ(bArr5, 512, bArr4, bArr6, 0, i2, bArr2, this.N_BYTE + this.N1N2_BYTE, 16, (byte) 0);
        System.arraycopy(bArr5, 0, bArr, 0, 32);
        Arrays.fill(jArr4, 0L);
        pkeEncrypt(jArr3, jArr4, bArr3, bArr6, bArr5, 32);
        hashGJ(bArr7, 256, bArr4, bArr3, this.pkSize + 32, this.K_BYTE, bArr2, 0, bArr2.length, (byte) 3);
        int i3 = !Arrays.constantTimeAreEqual(this.N_BYTE_64, jArr, 0, jArr3, 0) ? 1 : 0;
        if (!Arrays.constantTimeAreEqual(this.N_BYTE_64, jArr2, 0, jArr4, 0)) {
            i3 = 1;
        }
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < this.K_BYTE; i5++) {
            bArr[i5] = (byte) (((bArr[i5] & i4) ^ (bArr7[i5] & (~i4))) & 255);
        }
        Arrays.clear(jArr);
        Arrays.clear(jArr2);
        Arrays.clear(jArr3);
        Arrays.clear(jArr4);
        Arrays.clear(bArr4);
        Arrays.clear(bArr5);
        Arrays.clear(bArr6);
        Arrays.clear(bArr7);
        Arrays.clear(bArr8);
        return -i4;
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, SecureRandom secureRandom) {
        int i = this.K_BYTE;
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[32];
        long[] jArr = new long[this.N_BYTE_64];
        long[] jArr2 = new long[this.N1N2_BYTE_64];
        secureRandom.nextBytes(bArr6);
        secureRandom.nextBytes(bArr5);
        hashHI(bArr7, 256, bArr4, bArr4.length, (byte) 1);
        hashGJ(bArr3, 512, bArr7, bArr6, 0, i, bArr5, 0, 16, (byte) 0);
        pkeEncrypt(jArr, jArr2, bArr4, bArr6, bArr3, 32);
        Utils.fromLongArrayToByteArray(bArr, jArr);
        Utils.fromLongArrayToByteArray(bArr2, jArr2);
        Arrays.clear(jArr);
        Arrays.clear(jArr2);
        Arrays.clear(bArr6);
        Arrays.clear(bArr7);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[64];
        int i = this.N_BYTE_64;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        long[] jArr3 = new long[i];
        secureRandom.nextBytes(bArr3);
        Shake256RandomGenerator shake256RandomGenerator = new Shake256RandomGenerator(bArr3, (byte) 1);
        System.arraycopy(bArr3, 0, bArr2, this.pkSize + 32 + this.K_BYTE, 32);
        shake256RandomGenerator.nextBytes(bArr3);
        shake256RandomGenerator.nextBytes(bArr2, this.pkSize + 32, this.K_BYTE);
        hashHI(bArr4, 512, bArr3, 32, (byte) 2);
        shake256RandomGenerator.init(bArr4, 0, 32, (byte) 1);
        vectSampleFixedWeight1(jArr2, shake256RandomGenerator, this.w);
        vectSampleFixedWeight1(jArr, shake256RandomGenerator, this.w);
        System.arraycopy(bArr4, 32, bArr, 0, 32);
        shake256RandomGenerator.init(bArr4, 32, 32, (byte) 1);
        vectSetRandom(shake256RandomGenerator, jArr3);
        this.gf.vectMul(jArr3, jArr2, jArr3);
        Longs.xorTo(this.N_BYTE_64, jArr, 0, jArr3, 0);
        Utils.fromLongArrayToByteArray(bArr, 32, bArr.length - 32, jArr3);
        System.arraycopy(bArr4, 0, bArr2, this.pkSize, 32);
        System.arraycopy(bArr, 0, bArr2, 0, this.pkSize);
        Arrays.clear(bArr4);
        Arrays.clear(jArr);
        Arrays.clear(jArr2);
        Arrays.clear(jArr3);
    }

    public void vectSampleFixedWeight1(long[] jArr, Shake256RandomGenerator shake256RandomGenerator, int i) {
        int[] iArr = new int[this.wr];
        generateRandomSupport(iArr, i, shake256RandomGenerator);
        writeSupportToVector(jArr, iArr, i);
    }
}
