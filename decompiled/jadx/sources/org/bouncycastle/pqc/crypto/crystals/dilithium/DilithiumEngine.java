package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.security.SecureRandom;
import l.C18307;
import l.C23202;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DilithiumEngine {
    public static final int CrhBytes = 64;
    public static final int DilithiumD = 13;
    public static final int DilithiumN = 256;
    public static final int DilithiumPolyT0PackedBytes = 416;
    public static final int DilithiumPolyT1PackedBytes = 320;
    public static final int DilithiumQ = 8380417;
    public static final int DilithiumQinv = 58728449;
    public static final int DilithiumRootOfUnity = 1753;
    public static final int RndBytes = 32;
    public static final int SeedBytes = 32;
    public static final int TrBytes = 64;
    public final int CryptoBytes;
    public final int CryptoPublicKeyBytes;
    public final int CryptoSecretKeyBytes;
    public final int DilithiumBeta;
    public final int DilithiumCTilde;
    public final int DilithiumEta;
    public final int DilithiumGamma1;
    public final int DilithiumGamma2;
    public final int DilithiumK;
    public final int DilithiumL;
    public final int DilithiumMode;
    public final int DilithiumOmega;
    public final int DilithiumPolyEtaPackedBytes;
    public final int DilithiumPolyVecHPackedBytes;
    public final int DilithiumPolyW1PackedBytes;
    public final int DilithiumPolyZPackedBytes;
    public final int DilithiumTau;
    public final int PolyUniformGamma1NBlocks;
    public final SecureRandom random;
    public final SHAKEDigest shake256Digest = new SHAKEDigest(256);
    public final Symmetric symmetric;

    public Symmetric GetSymmetric() {
        return this.symmetric;
    }

    public byte[][] generateKeyPair() {
        byte[] bArr = new byte[32];
        this.random.nextBytes(bArr);
        return generateKeyPairInternal(bArr);
    }

    public byte[][] generateKeyPairInternal(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        this.shake256Digest.update(bArr, 0, 32);
        this.shake256Digest.update((byte) this.DilithiumK);
        this.shake256Digest.update((byte) this.DilithiumL);
        this.shake256Digest.doFinal(bArr2, 0, 128);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        polyVecMatrix.expandMatrix(bArr4);
        polyVecL.uniformEta(bArr5, (short) 0);
        polyVecK.uniformEta(bArr5, (short) this.DilithiumL);
        PolyVecL polyVecL2 = new PolyVecL(this);
        polyVecL.copyPolyVecL(polyVecL2);
        polyVecL2.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL2);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.addPolyVecK(polyVecK);
        polyVecK2.conditionalAddQ();
        polyVecK2.power2Round(polyVecK3);
        byte[] bArrPackPublicKey = Packing.packPublicKey(polyVecK2, this);
        this.shake256Digest.update(bArr4, 0, 32);
        this.shake256Digest.update(bArrPackPublicKey, 0, bArrPackPublicKey.length);
        this.shake256Digest.doFinal(bArr3, 0, 64);
        byte[][] bArrPackSecretKey = Packing.packSecretKey(bArr4, bArr3, bArr6, polyVecK3, polyVecL, polyVecK, this);
        return new byte[][]{bArrPackSecretKey[0], bArrPackSecretKey[1], bArrPackSecretKey[2], bArrPackSecretKey[3], bArrPackSecretKey[4], bArrPackSecretKey[5], bArrPackPublicKey};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getDilithiumBeta() {
        return this.DilithiumBeta;
    }

    public int getDilithiumCTilde() {
        return this.DilithiumCTilde;
    }

    public int getDilithiumEta() {
        return this.DilithiumEta;
    }

    public int getDilithiumGamma1() {
        return this.DilithiumGamma1;
    }

    public int getDilithiumGamma2() {
        return this.DilithiumGamma2;
    }

    public int getDilithiumK() {
        return this.DilithiumK;
    }

    public int getDilithiumL() {
        return this.DilithiumL;
    }

    public int getDilithiumMode() {
        return this.DilithiumMode;
    }

    public int getDilithiumOmega() {
        return this.DilithiumOmega;
    }

    public int getDilithiumPolyEtaPackedBytes() {
        return this.DilithiumPolyEtaPackedBytes;
    }

    public int getDilithiumPolyVecHPackedBytes() {
        return this.DilithiumPolyVecHPackedBytes;
    }

    public int getDilithiumPolyW1PackedBytes() {
        return this.DilithiumPolyW1PackedBytes;
    }

    public int getDilithiumPolyZPackedBytes() {
        return this.DilithiumPolyZPackedBytes;
    }

    public int getDilithiumTau() {
        return this.DilithiumTau;
    }

    public int getPolyUniformGamma1NBlocks() {
        return this.PolyUniformGamma1NBlocks;
    }

    public SHAKEDigest getShake256Digest() {
        return this.shake256Digest;
    }

    public byte[] sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        return signSignature(bArr, i, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7);
    }

    public boolean signOpen(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return signVerify(bArr2, i, bArr, bArr.length, bArr3, bArr4);
    }

    public byte[] signSignature(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        byte[] bArr8 = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr8);
        }
        return signSignatureInternal(bArr, i, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8);
    }

    public byte[] signSignatureInternal(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        PolyVecK polyVecK;
        PolyVecK polyVecK2;
        int i2;
        byte[] bArr9 = new byte[this.CryptoBytes + i];
        byte[] bArr10 = new byte[64];
        byte[] bArr11 = new byte[64];
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecL polyVecL2 = new PolyVecL(this);
        PolyVecL polyVecL3 = new PolyVecL(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK polyVecK4 = new PolyVecK(this);
        PolyVecK polyVecK5 = new PolyVecK(this);
        PolyVecK polyVecK6 = new PolyVecK(this);
        PolyVecK polyVecK7 = new PolyVecK(this);
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        Poly poly2 = poly;
        PolyVecK polyVecK8 = polyVecK7;
        PolyVecK polyVecK9 = polyVecK6;
        PolyVecK polyVecK10 = polyVecK5;
        PolyVecK polyVecK11 = polyVecK4;
        PolyVecK polyVecK12 = polyVecK3;
        Packing.unpackSecretKey(polyVecK3, polyVecL, polyVecK4, bArr5, bArr6, bArr7, this);
        this.shake256Digest.update(bArr4, 0, 64);
        this.shake256Digest.update(bArr, 0, i);
        this.shake256Digest.doFinal(bArr10, 0, 64);
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, 128);
        System.arraycopy(bArr8, 0, bArrCopyOf, 32, 32);
        System.arraycopy(bArr10, 0, bArrCopyOf, 64, 64);
        this.shake256Digest.update(bArrCopyOf, 0, 128);
        this.shake256Digest.doFinal(bArr11, 0, 64);
        polyVecMatrix.expandMatrix(bArr2);
        polyVecL.polyVecNtt();
        polyVecK11.polyVecNtt();
        polyVecK12.polyVecNtt();
        int i3 = 0;
        short s = 0;
        while (i3 < 1000) {
            int i4 = i3 + 1;
            short s2 = (short) (s + 1);
            polyVecL2.uniformGamma1(bArr11, s);
            polyVecL2.copyPolyVecL(polyVecL3);
            polyVecL3.polyVecNtt();
            PolyVecK polyVecK13 = polyVecK10;
            polyVecMatrix.pointwiseMontgomery(polyVecK13, polyVecL3);
            polyVecK13.reduce();
            polyVecK13.invNttToMont();
            polyVecK13.conditionalAddQ();
            PolyVecK polyVecK14 = polyVecK9;
            polyVecK13.decompose(polyVecK14);
            System.arraycopy(polyVecK13.packW1(), 0, bArr9, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            this.shake256Digest.update(bArr10, 0, 64);
            this.shake256Digest.update(bArr9, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            this.shake256Digest.doFinal(bArr9, 0, this.DilithiumCTilde);
            Poly poly3 = poly2;
            poly3.challenge(Arrays.copyOfRange(bArr9, 0, this.DilithiumCTilde));
            poly3.polyNtt();
            polyVecL3.pointwisePolyMontgomery(poly3, polyVecL);
            polyVecL3.invNttToMont();
            polyVecL3.addPolyVecL(polyVecL2);
            polyVecL3.reduce();
            if (polyVecL3.checkNorm(this.DilithiumGamma1 - this.DilithiumBeta)) {
                polyVecK = polyVecK11;
                i2 = i4;
                polyVecK2 = polyVecK8;
            } else {
                polyVecK = polyVecK11;
                polyVecK2 = polyVecK8;
                polyVecK2.pointwisePolyMontgomery(poly3, polyVecK);
                polyVecK2.invNttToMont();
                polyVecK14.subtract(polyVecK2);
                polyVecK14.reduce();
                i2 = i4;
                if (polyVecK14.checkNorm(this.DilithiumGamma2 - this.DilithiumBeta)) {
                    continue;
                } else {
                    PolyVecK polyVecK15 = polyVecK12;
                    polyVecK2.pointwisePolyMontgomery(poly3, polyVecK15);
                    polyVecK2.invNttToMont();
                    polyVecK2.reduce();
                    if (polyVecK2.checkNorm(this.DilithiumGamma2)) {
                        polyVecK12 = polyVecK15;
                    } else {
                        polyVecK14.addPolyVecK(polyVecK2);
                        polyVecK14.conditionalAddQ();
                        polyVecK12 = polyVecK15;
                        if (polyVecK2.makeHint(polyVecK14, polyVecK13) <= this.DilithiumOmega) {
                            return Packing.packSignature(bArr9, polyVecL3, polyVecK2, this);
                        }
                    }
                }
            }
            i3 = i2;
            polyVecK10 = polyVecK13;
            s = s2;
            polyVecK9 = polyVecK14;
            polyVecK11 = polyVecK;
            poly2 = poly3;
            polyVecK8 = polyVecK2;
        }
        return null;
    }

    public boolean signVerify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        return signVerifyInternal(bArr, i, bArr2, i2, bArr3, bArr4);
    }

    public boolean signVerifyInternal(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[this.DilithiumCTilde];
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        if (i != this.CryptoBytes) {
            return false;
        }
        PolyVecK polyVecKUnpackPublicKey = Packing.unpackPublicKey(polyVecK, bArr4, this);
        if (!Packing.unpackSignature(polyVecL, polyVecK3, bArr, this)) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.DilithiumCTilde);
        if (polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta())) {
            return false;
        }
        this.shake256Digest.update(bArr3, 0, bArr3.length);
        this.shake256Digest.update(bArr4, 0, bArr4.length);
        this.shake256Digest.doFinal(bArr5, 0, 64);
        this.shake256Digest.update(bArr5, 0, 64);
        this.shake256Digest.update(bArr2, 0, i2);
        this.shake256Digest.doFinal(bArr5, 0);
        poly.challenge(Arrays.copyOfRange(bArrCopyOfRange, 0, this.DilithiumCTilde));
        polyVecMatrix.expandMatrix(bArr3);
        polyVecL.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL);
        poly.polyNtt();
        polyVecKUnpackPublicKey.shiftLeft();
        polyVecKUnpackPublicKey.polyVecNtt();
        polyVecKUnpackPublicKey.pointwisePolyMontgomery(poly, polyVecKUnpackPublicKey);
        polyVecK2.subtract(polyVecKUnpackPublicKey);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.conditionalAddQ();
        polyVecK2.useHint(polyVecK2, polyVecK3);
        byte[] bArrPackW1 = polyVecK2.packW1();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, 64);
        sHAKEDigest.update(bArrPackW1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
        sHAKEDigest.doFinal(bArr6, 0, this.DilithiumCTilde);
        return Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr6);
    }

    public DilithiumEngine(int i, SecureRandom secureRandom, boolean z) {
        int i2;
        int i3;
        this.DilithiumMode = i;
        if (i == 2) {
            this.DilithiumK = 4;
            this.DilithiumL = 4;
            this.DilithiumEta = 2;
            this.DilithiumTau = 39;
            this.DilithiumBeta = 78;
            this.DilithiumGamma1 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
            this.DilithiumGamma2 = 95232;
            this.DilithiumOmega = 80;
            this.DilithiumPolyZPackedBytes = 576;
            this.DilithiumPolyW1PackedBytes = 192;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 32;
        } else if (i == 3) {
            this.DilithiumK = 6;
            this.DilithiumL = 5;
            this.DilithiumEta = 4;
            this.DilithiumTau = 49;
            this.DilithiumBeta = 196;
            this.DilithiumGamma1 = 524288;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 55;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 128;
            this.DilithiumCTilde = 48;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(C18307.m42645(i, "The mode ", "is not supported by Crystals Dilithium!"));
            }
            this.DilithiumK = 8;
            this.DilithiumL = 7;
            this.DilithiumEta = 2;
            this.DilithiumTau = 60;
            this.DilithiumBeta = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
            this.DilithiumGamma1 = 524288;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 75;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 64;
        }
        this.symmetric = z ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        this.random = secureRandom;
        int i4 = this.DilithiumOmega;
        int i5 = this.DilithiumK;
        int i6 = i4 + i5;
        this.DilithiumPolyVecHPackedBytes = i6;
        this.CryptoPublicKeyBytes = (i5 * 320) + 32;
        int i7 = this.DilithiumL;
        int i8 = this.DilithiumPolyEtaPackedBytes;
        this.CryptoSecretKeyBytes = (i5 * 416) + (i8 * i5) + (i7 * i8) + 128;
        this.CryptoBytes = C23202.m51496(i7, this.DilithiumPolyZPackedBytes, this.DilithiumCTilde, i6);
        int i9 = this.DilithiumGamma1;
        if (i9 == 131072) {
            i2 = this.symmetric.stream256BlockBytes;
            i3 = i2 + 575;
        } else {
            if (i9 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            i2 = this.symmetric.stream256BlockBytes;
            i3 = i2 + 639;
        }
        this.PolyUniformGamma1NBlocks = i3 / i2;
    }
}
