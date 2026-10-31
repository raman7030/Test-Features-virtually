package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes2.dex */
public class SnovaSigner implements MessageSigner {
    public SnovaEngine engine;
    public SnovaParameters params;
    public SnovaPrivateKeyParameters privKey;
    public SnovaPublicKeyParameters pubKey;
    public SecureRandom random;
    public final SHAKEDigest shake = new SHAKEDigest(256);

    private void evaluation(byte[] bArr, MapGroup1 mapGroup1, byte[][][][] bArr2, byte[] bArr3) {
        int i;
        int m = this.params.getM();
        int alpha = this.params.getAlpha();
        int n = this.params.getN();
        int l2 = this.params.getL();
        int lsq = this.params.getLsq();
        int o = this.params.getO();
        Class cls = Byte.TYPE;
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n, lsq);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n, lsq);
        byte[] bArr6 = new byte[lsq];
        int i2 = 0;
        int i3 = 0;
        while (i3 < m) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = 0;
                if (i4 >= n) {
                    break;
                }
                int i6 = 0;
                while (i6 < alpha) {
                    GF16Utils.gf16mTranMulMul(bArr3, i5, mapGroup1.aAlpha[i3][i6], mapGroup1.bAlpha[i3][i6], mapGroup1.qAlpha1[i3][i6], mapGroup1.qAlpha2[i3][i6], bArr6, bArr4[i6][i4], bArr5[i6][i4], l2);
                    i6++;
                    i4 = i4;
                }
                i4++;
                i5 += lsq;
            }
            int i7 = i3;
            while (i < alpha) {
                if (i7 >= o) {
                    i7 -= o;
                }
                int i8 = 0;
                while (i8 < n) {
                    int i9 = i2;
                    int i10 = i3;
                    byte[] bArr7 = bArr6;
                    int i11 = o;
                    int i12 = lsq;
                    int i13 = l2;
                    GF16Utils.gf16mMul(getPMatrix(mapGroup1, bArr2, i7, i8, 0), bArr5[i][0], bArr7, i13);
                    int i14 = 1;
                    while (i14 < n) {
                        int i15 = i14;
                        GF16Utils.gf16mMulTo(getPMatrix(mapGroup1, bArr2, i7, i8, i14), bArr5[i][i15], bArr7, i13);
                        i14 = i15 + 1;
                    }
                    GF16Utils.gf16mMulTo(bArr4[i][i8], bArr7, bArr, i9, i13);
                    i8++;
                    l2 = i13;
                    bArr6 = bArr7;
                    i2 = i9;
                    i3 = i10;
                    o = i11;
                    lsq = i12;
                }
                i++;
                i7++;
                i3 = i3;
            }
            i3++;
            i2 += lsq;
            bArr6 = bArr6;
        }
    }

    private byte[] getMessageHash(byte[] bArr) {
        byte[] bArr2 = new byte[this.shake.getDigestSize()];
        this.shake.update(bArr, 0, bArr.length);
        this.shake.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] getPMatrix(MapGroup1 mapGroup1, byte[][][][] bArr, int i, int i2, int i3) {
        int v = this.params.getV();
        if (i2 < v) {
            return i3 < v ? mapGroup1.p11[i][i2][i3] : mapGroup1.p12[i][i2][i3 - v];
        }
        return i3 < v ? mapGroup1.p21[i][i2 - v][i3] : bArr[i][i2 - v][i3 - v];
    }

    private int performGaussianElimination(byte[][] bArr, byte[] bArr2, int i) {
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3;
            while (i4 < i && bArr[i4][i3] == 0) {
                i4++;
            }
            if (i4 >= i) {
                return 1;
            }
            if (i4 != i3) {
                byte[] bArr3 = bArr[i3];
                bArr[i3] = bArr[i4];
                bArr[i4] = bArr3;
            }
            byte bInv = GF16.inv(bArr[i3][i3]);
            for (int i5 = i3; i5 < i2; i5++) {
                byte[] bArr4 = bArr[i3];
                bArr4[i5] = GF16.mul(bArr4[i5], bInv);
            }
            int i6 = i3 + 1;
            for (int i7 = i6; i7 < i; i7++) {
                byte b = bArr[i7][i3];
                if (b != 0) {
                    for (int i8 = i3; i8 < i2; i8++) {
                        byte[] bArr5 = bArr[i7];
                        bArr5[i8] = (byte) (bArr5[i8] ^ GF16.mul(bArr[i3][i8], b));
                    }
                }
            }
            i3 = i6;
        }
        for (int i9 = i - 1; i9 >= 0; i9--) {
            byte bMul = bArr[i9][i];
            for (int i10 = i9 + 1; i10 < i; i10++) {
                bMul = (byte) (bMul ^ GF16.mul(bArr[i9][i10], bArr2[i10]));
            }
            bArr2[i9] = bMul;
        }
        return 0;
    }

    public void createSignedHash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, byte[] bArr4, int i5) {
        this.shake.update(bArr, 0, i);
        this.shake.update(bArr2, 0, i2);
        this.shake.update(bArr3, i3, i4);
        this.shake.doFinal(bArr4, 0, i5);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        byte[] messageHash = getMessageHash(bArr);
        byte[] bArr2 = new byte[this.params.getSaltLength()];
        this.random.nextBytes(bArr2);
        byte[] bArr3 = new byte[this.params.getSaltLength() + (((this.params.getLsq() * this.params.getN()) + 1) >>> 1)];
        SnovaKeyElements snovaKeyElements = new SnovaKeyElements(this.params);
        if (this.params.isSkIsSeed()) {
            byte[] privateKey = this.privKey.getPrivateKey();
            bArrCopyOfRange = Arrays.copyOfRange(privateKey, 0, 16);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey, 16, privateKey.length);
            this.engine.genMap1T12Map2(snovaKeyElements, bArrCopyOfRange, bArrCopyOfRange2);
        } else {
            byte[] privateKey2 = this.privKey.getPrivateKey();
            int length = (privateKey2.length - 48) << 1;
            byte[] bArr4 = new byte[length];
            GF16Utils.decodeMergeInHalf(privateKey2, bArr4, length);
            SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, 0, snovaKeyElements.map1.aAlpha), snovaKeyElements.map1.bAlpha), snovaKeyElements.map1.qAlpha1), snovaKeyElements.map1.qAlpha2), snovaKeyElements.T12), snovaKeyElements.map2.f11), snovaKeyElements.map2.f12), snovaKeyElements.map2.f21);
            bArrCopyOfRange = Arrays.copyOfRange(privateKey2, privateKey2.length - 48, privateKey2.length - 32);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey2, privateKey2.length - 32, privateKey2.length);
        }
        byte[] bArr5 = bArrCopyOfRange2;
        byte[] bArr6 = bArrCopyOfRange;
        MapGroup1 mapGroup1 = snovaKeyElements.map1;
        byte[][][] bArr7 = mapGroup1.aAlpha;
        byte[][][] bArr8 = mapGroup1.bAlpha;
        byte[][][] bArr9 = mapGroup1.qAlpha1;
        byte[][][] bArr10 = mapGroup1.qAlpha2;
        byte[][][] bArr11 = snovaKeyElements.T12;
        MapGroup2 mapGroup2 = snovaKeyElements.map2;
        signDigestCore(bArr3, messageHash, bArr2, bArr7, bArr8, bArr9, bArr10, bArr11, mapGroup2.f11, mapGroup2.f12, mapGroup2.f21, bArr6, bArr5);
        return Arrays.concatenate(bArr3, bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SnovaPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SnovaPrivateKeyParameters) cipherParameters;
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random = secureRandom;
            this.params = this.privKey.getParameters();
        } else {
            SnovaPublicKeyParameters snovaPublicKeyParameters = (SnovaPublicKeyParameters) cipherParameters;
            this.pubKey = snovaPublicKeyParameters;
            this.params = snovaPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
        }
        this.engine = new SnovaEngine(this.params);
    }

    public void signDigestCore(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][][] bArr4, byte[][][] bArr5, byte[][][] bArr6, byte[][][] bArr7, byte[][][] bArr8, byte[][][][] bArr9, byte[][][][] bArr10, byte[][][][] bArr11, byte[] bArr12, byte[] bArr13) {
        int i;
        byte[] bArr14;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        byte[] bArr15 = bArr2;
        int m = this.params.getM();
        int l2 = this.params.getL();
        int lsq = this.params.getLsq();
        int alpha = this.params.getAlpha();
        int v = this.params.getV();
        int o = this.params.getO();
        int n = this.params.getN();
        int i6 = m * lsq;
        int i7 = o * lsq;
        int i8 = v * lsq;
        int i9 = (i7 + 1) >>> 1;
        Class cls = Byte.TYPE;
        byte[][] bArr16 = (byte[][]) Array.newInstance((Class<?>) cls, i6, i6 + 1);
        byte[][] bArr17 = (byte[][]) Array.newInstance((Class<?>) cls, lsq, lsq);
        byte[][][] bArr18 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v, lsq);
        byte[][][] bArr19 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v, lsq);
        byte[] bArr20 = new byte[lsq];
        byte[] bArr21 = new byte[lsq];
        byte[] bArr22 = new byte[i6];
        int i10 = n * lsq;
        byte[] bArr23 = new byte[i9];
        int i11 = (i8 + 1) >>> 1;
        byte[] bArr24 = new byte[i11];
        byte[] bArr25 = new byte[l2];
        byte[][] bArr26 = bArr16;
        byte[] bArr27 = new byte[i6];
        int i12 = o;
        int i13 = m;
        int i14 = v;
        byte[] bArr28 = new byte[lsq];
        byte[] bArr29 = new byte[i10];
        byte[] bArr30 = bArr24;
        int i15 = i11;
        int i16 = alpha;
        int i17 = lsq;
        int i18 = l2;
        createSignedHash(bArr12, bArr12.length, bArr2, bArr15.length, bArr3, 0, bArr3.length, bArr23, i9);
        GF16.decode(bArr23, 0, bArr22, 0, i6);
        byte b2 = 0;
        byte b3 = 0;
        while (true) {
            byte[][] bArr31 = bArr26;
            for (byte[] bArr32 : bArr31) {
                Arrays.fill(bArr32, b3);
            }
            byte b4 = (byte) (b2 + 1);
            for (int i19 = 0; i19 < i6; i19++) {
                bArr31[i19][i6] = bArr22[i19];
            }
            this.shake.update(bArr13, b3, bArr13.length);
            this.shake.update(bArr15, b3, bArr15.length);
            this.shake.update(bArr3, b3, bArr3.length);
            this.shake.update(b4);
            byte[] bArr33 = bArr30;
            this.shake.doFinal(bArr33, b3, i15);
            byte[] bArr34 = bArr29;
            GF16.decode(bArr33, bArr34, i15 << 1);
            byte b5 = b3;
            int i20 = i13;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i20) {
                Arrays.fill(bArr28, b5);
                int i23 = i21;
                int i24 = i16;
                int i25 = 0;
                while (i25 < i24) {
                    byte b6 = b4;
                    int i26 = i12;
                    if (i23 >= i26) {
                        i23 -= i26;
                    }
                    int i27 = i23;
                    int i28 = 0;
                    byte[] bArr35 = bArr33;
                    int i29 = i14;
                    int i30 = 0;
                    while (i28 < i29) {
                        GF16Utils.gf16mTranMulMul(bArr34, i30, bArr4[i21][i25], bArr5[i21][i25], bArr6[i21][i25], bArr7[i21][i25], bArr25, bArr18[i25][i28], bArr19[i25][i28], i18);
                        i28++;
                        i30 += i17;
                        i15 = i15;
                    }
                    int i31 = i15;
                    int i32 = i17;
                    int i33 = 0;
                    while (i33 < i29) {
                        int i34 = 0;
                        while (i34 < i29) {
                            GF16Utils.gf16mMulMulTo(bArr18[i25][i33], bArr9[i27][i33][i34], bArr19[i25][i34], bArr25, bArr28, i18);
                            i34++;
                            i24 = i24;
                            i25 = i25;
                            i20 = i20;
                            i33 = i33;
                            i21 = i21;
                            bArr34 = bArr34;
                        }
                        i33++;
                    }
                    i25++;
                    i23 = i27 + 1;
                    i12 = i26;
                    i14 = i29;
                    i17 = i32;
                    i15 = i31;
                    b4 = b6;
                    bArr33 = bArr35;
                }
                int i35 = i24;
                int i36 = i20;
                byte[] bArr36 = bArr34;
                int i37 = i21;
                byte b7 = b4;
                byte[] bArr37 = bArr33;
                int i38 = i15;
                int i39 = i12;
                int i40 = i14;
                byte[] bArr38 = bArr28;
                int i41 = i17;
                int i42 = 0;
                int i43 = i18;
                for (int i44 = 0; i44 < i43; i44++) {
                    int i45 = 0;
                    while (i45 < i43) {
                        byte[] bArr39 = bArr31[i22 + i42];
                        bArr39[i6] = (byte) (bArr38[i42] ^ bArr39[i6]);
                        i45++;
                        i42++;
                    }
                }
                int i46 = 0;
                int i47 = 0;
                while (i46 < i39) {
                    int i48 = i37;
                    int i49 = 0;
                    while (i49 < i35) {
                        if (i48 >= i39) {
                            i48 -= i39;
                        }
                        int i50 = i48;
                        for (int i51 = 0; i51 < i41; i51++) {
                            Arrays.fill(bArr17[i51], (byte) 0);
                        }
                        int i52 = 0;
                        while (i52 < i40) {
                            int i53 = i52;
                            int i54 = i49;
                            int i55 = i46;
                            GF16Utils.gf16mMulMul(bArr18[i49][i52], bArr10[i50][i52][i46], bArr7[i37][i49], bArr25, bArr20, i43);
                            GF16Utils.gf16mMulMul(bArr6[i37][i54], bArr11[i50][i55][i53], bArr19[i54][i53], bArr25, bArr21, i43);
                            int i56 = 0;
                            int i57 = 0;
                            int i58 = 0;
                            while (i56 < i41) {
                                if (i57 == i43) {
                                    i58 += i43;
                                    i57 = 0;
                                }
                                byte b8 = bArr20[i58];
                                byte b9 = bArr21[i57];
                                int i59 = 0;
                                int i60 = 0;
                                int i61 = 0;
                                int i62 = 0;
                                byte b10 = b8;
                                int i63 = 0;
                                while (i59 < i41) {
                                    if (i63 == i43) {
                                        i60++;
                                        i61 += i43;
                                        b = bArr20[i58 + i60];
                                        b9 = bArr21[i61 + i57];
                                        i62 = 0;
                                        i5 = 0;
                                    } else {
                                        i5 = i63;
                                        b = b10;
                                    }
                                    int i64 = i35;
                                    byte b11 = bArr5[i37][i54][i62 + i57];
                                    int i65 = i58;
                                    byte b12 = bArr4[i37][i54][i58 + i5];
                                    byte[] bArr40 = bArr17[i56];
                                    bArr40[i59] = (byte) (bArr40[i59] ^ (GF16.mul(b12, b9) ^ GF16.mul(b, b11)));
                                    i59++;
                                    i62 += i43;
                                    i35 = i64;
                                    i58 = i65;
                                    b10 = b;
                                    i63 = i5 + 1;
                                }
                                i56++;
                                i57++;
                            }
                            i52 = i53 + 1;
                            i49 = i54;
                            i46 = i55;
                        }
                        int i66 = i49;
                        int i67 = i46;
                        int i68 = i35;
                        for (int i69 = 0; i69 < i41; i69++) {
                            for (int i70 = 0; i70 < i41; i70++) {
                                byte[] bArr41 = bArr31[i22 + i69];
                                int i71 = i47 + i70;
                                bArr41[i71] = (byte) (bArr41[i71] ^ bArr17[i69][i70]);
                            }
                        }
                        i49 = i66 + 1;
                        i48 = i50 + 1;
                        i46 = i67;
                        i35 = i68;
                    }
                    i46++;
                    i47 += i41;
                }
                i16 = i35;
                i21 = i37 + 1;
                i22 += i41;
                b5 = 0;
                i12 = i39;
                i14 = i40;
                i17 = i41;
                i18 = i43;
                bArr28 = bArr38;
                i20 = i36;
                i15 = i38;
                b4 = b7;
                bArr33 = bArr37;
                bArr34 = bArr36;
            }
            i = i18;
            int i72 = i20;
            bArr29 = bArr34;
            byte b13 = b4;
            byte[] bArr42 = bArr33;
            int i73 = i15;
            bArr14 = bArr27;
            i2 = i12;
            i3 = i14;
            byte[] bArr43 = bArr28;
            i4 = i17;
            if (performGaussianElimination(bArr31, bArr14, i6) == 0) {
                break;
            }
            bArr26 = bArr31;
            i12 = i2;
            i14 = i3;
            i17 = i4;
            i18 = i;
            bArr27 = bArr14;
            bArr28 = bArr43;
            i13 = i72;
            i15 = i73;
            b2 = b13;
            bArr30 = bArr42;
            b3 = 0;
            bArr15 = bArr2;
        }
        int i74 = 0;
        int i75 = 0;
        while (i74 < i3) {
            int i76 = 0;
            int i77 = 0;
            while (i76 < i2) {
                GF16Utils.gf16mMulTo(bArr8[i74][i76], bArr14, i77, bArr29, i75, i);
                i76++;
                i77 += i4;
            }
            i74++;
            i75 += i4;
        }
        System.arraycopy(bArr14, 0, bArr29, i8, i7);
        GF16.encode(bArr29, bArr, i10);
        System.arraycopy(bArr3, 0, bArr, bArr.length - 16, 16);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        byte[] messageHash = getMessageHash(bArr);
        MapGroup1 mapGroup1 = new MapGroup1(this.params);
        byte[] encoded = this.pubKey.getEncoded();
        byte[] bArrCopyOf = Arrays.copyOf(encoded, 16);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        this.engine.genABQP(mapGroup1, bArrCopyOf);
        byte[][][][] bArr3 = (byte[][][][]) Array.newInstance((Class<?>) Byte.TYPE, this.params.getM(), this.params.getO(), this.params.getO(), this.params.getLsq());
        if ((this.params.getLsq() & 1) == 0) {
            MapGroup1.decodeP(bArrCopyOfRange, 0, bArr3, bArrCopyOfRange.length << 1);
        } else {
            int length = bArrCopyOfRange.length << 1;
            byte[] bArr4 = new byte[length];
            GF16.decode(bArrCopyOfRange, bArr4, length);
            MapGroup1.fillP(bArr4, 0, bArr3, length);
        }
        return verifySignatureCore(messageHash, bArr2, bArrCopyOf, mapGroup1, bArr3);
    }

    public boolean verifySignatureCore(byte[] bArr, byte[] bArr2, byte[] bArr3, MapGroup1 mapGroup1, byte[][][][] bArr4) {
        int lsq = this.params.getLsq();
        int o = this.params.getO() * lsq;
        int i = (o + 1) >>> 1;
        int saltLength = this.params.getSaltLength();
        int m = this.params.getM();
        int n = this.params.getN() * lsq;
        byte[] bArr5 = new byte[i];
        createSignedHash(bArr3, bArr3.length, bArr, bArr.length, bArr2, (n + 1) >>> 1, saltLength, bArr5, i);
        if ((o & 1) != 0) {
            int i2 = i - 1;
            bArr5[i2] = (byte) (bArr5[i2] & 15);
        }
        byte[] bArr6 = new byte[n];
        GF16.decode(bArr2, 0, bArr6, 0, n);
        int i3 = m * lsq;
        byte[] bArr7 = new byte[i3];
        evaluation(bArr7, mapGroup1, bArr4, bArr6);
        byte[] bArr8 = new byte[i];
        GF16.encode(bArr7, bArr8, i3);
        return Arrays.areEqual(bArr5, bArr8);
    }
}
