package org.bouncycastle.pqc.crypto.mlkem;

import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.Arrays;
import p067l.C19768;

/* JADX INFO: loaded from: classes2.dex */
public class MLKEMEngine {
    public static final int KyberEta2 = 2;
    public static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    public static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    public final int CryptoBytes;
    public final int CryptoCipherTextBytes;
    public final int CryptoPublicKeyBytes;
    public final int CryptoSecretKeyBytes;
    public final int KyberCipherTextBytes;
    public final int KyberEta1;
    public final int KyberIndCpaBytes;
    public final int KyberIndCpaPublicKeyBytes;
    public final int KyberIndCpaSecretKeyBytes;
    public final int KyberK;
    public final int KyberPolyCompressedBytes;
    public final int KyberPolyVecBytes;
    public final int KyberPolyVecCompressedBytes;
    public final int KyberPublicKeyBytes;
    public final int KyberSecretKeyBytes;
    public final MLKEMIndCpa indCpa;
    public SecureRandom random;
    public final int sessionKeyLength;
    public final Symmetric symmetric;

    private void cmov(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = (0 - i2) >> 24;
        for (int i4 = 0; i4 != i; i4++) {
            bArr[i4] = (byte) ((bArr2[i4] & i3) | (bArr[i4] & (~i3)));
        }
    }

    private int constantTimeZeroOnEqual(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length ^ bArr.length;
        for (int i = 0; i != bArr2.length; i++) {
            length |= bArr[i] ^ bArr2[i];
        }
        return length & 255;
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public boolean checkModulus(byte[] bArr) {
        return PolyVec.checkModulus(this, bArr) < 0;
    }

    public byte[][] generateKemKeyPair() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        this.random.nextBytes(bArr);
        this.random.nextBytes(bArr2);
        return generateKemKeyPairInternal(bArr, bArr2);
    }

    public byte[][] generateKemKeyPairInternal(byte[] bArr, byte[] bArr2) {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair(bArr);
        int i = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr3, 0, i);
        byte[] bArr4 = new byte[32];
        this.symmetric.hash_h(bArr4, bArrGenerateKeyPair[0], 0);
        int i2 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr5 = new byte[i2];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr5, 0, i2);
        int i3 = i2 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr5, 0, i3), Arrays.copyOfRange(bArr5, i3, i2), bArr3, bArr4, bArr2, Arrays.concatenate(bArr, bArr2)};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, byte[] bArr) {
        byte[] encoded = mLKEMPrivateKeyParameters.getEncoded();
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, this.KyberIndCpaSecretKeyBytes, encoded.length);
        System.arraycopy(this.indCpa.decrypt(encoded, bArr), 0, bArr2, 0, 32);
        System.arraycopy(encoded, this.KyberSecretKeyBytes - 64, bArr2, 32, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArr4 = new byte[this.KyberCipherTextBytes + 32];
        System.arraycopy(encoded, this.KyberSecretKeyBytes - 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr4, 32, this.KyberCipherTextBytes);
        this.symmetric.kdf(bArr4, bArr4);
        cmov(bArr3, bArr4, 32, constantTimeZeroOnEqual(bArr, this.indCpa.encrypt(bArrCopyOfRange, Arrays.copyOfRange(bArr2, 0, 32), Arrays.copyOfRange(bArr3, 32, 64))));
        return Arrays.copyOfRange(bArr3, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(MLKEMPublicKeyParameters mLKEMPublicKeyParameters, byte[] bArr) {
        byte[] encoded = mLKEMPublicKeyParameters.getEncoded();
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, encoded, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArrEncrypt = this.indCpa.encrypt(encoded, Arrays.copyOfRange(bArr2, 0, 32), Arrays.copyOfRange(bArr3, 32, 64));
        int i = this.sessionKeyLength;
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr3, 0, bArr4, 0, i);
        return new byte[][]{bArr4, bArrEncrypt};
    }

    public MLKEMEngine(int i) {
        this.KyberK = i;
        if (i != 2) {
            if (i == 3) {
                this.KyberEta1 = 2;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(C19768.m44906(i, "K: ", " is not supported for Crystals Kyber"));
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = DHParameters.DEFAULT_MINIMUM_LENGTH;
                this.KyberPolyVecCompressedBytes = i * 352;
                this.sessionKeyLength = 32;
            }
            int i2 = i * KyberPolyBytes;
            this.KyberPolyVecBytes = i2;
            int i3 = i2 + 32;
            this.KyberIndCpaPublicKeyBytes = i3;
            this.KyberIndCpaSecretKeyBytes = i2;
            int i4 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
            this.KyberIndCpaBytes = i4;
            this.KyberPublicKeyBytes = i3;
            int i5 = i2 + i3 + 64;
            this.KyberSecretKeyBytes = i5;
            this.KyberCipherTextBytes = i4;
            this.CryptoBytes = 32;
            this.CryptoSecretKeyBytes = i5;
            this.CryptoPublicKeyBytes = i3;
            this.CryptoCipherTextBytes = i4;
            this.symmetric = new Symmetric.ShakeSymmetric();
            this.indCpa = new MLKEMIndCpa(this);
        }
        this.KyberEta1 = 3;
        this.KyberPolyCompressedBytes = 128;
        this.KyberPolyVecCompressedBytes = i * 320;
        this.sessionKeyLength = 32;
        int i6 = i * KyberPolyBytes;
        this.KyberPolyVecBytes = i6;
        int i7 = i6 + 32;
        this.KyberIndCpaPublicKeyBytes = i7;
        this.KyberIndCpaSecretKeyBytes = i6;
        int i8 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i8;
        this.KyberPublicKeyBytes = i7;
        int i9 = i6 + i7 + 64;
        this.KyberSecretKeyBytes = i9;
        this.KyberCipherTextBytes = i8;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i9;
        this.CryptoPublicKeyBytes = i7;
        this.CryptoCipherTextBytes = i8;
        this.symmetric = new Symmetric.ShakeSymmetric();
        this.indCpa = new MLKEMIndCpa(this);
    }
}
