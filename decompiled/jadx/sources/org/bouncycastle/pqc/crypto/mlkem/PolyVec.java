package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVec {
    public MLKEMEngine engine;
    public int kyberK;
    public int polyVecBytes;
    public Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public PolyVec(MLKEMEngine mLKEMEngine) {
        this.engine = mLKEMEngine;
        this.kyberK = mLKEMEngine.getKyberK();
        this.polyVecBytes = mLKEMEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i = 0; i < this.kyberK; i++) {
            this.vec[i] = new Poly(mLKEMEngine);
        }
    }

    public static int checkModulus(MLKEMEngine mLKEMEngine, byte[] bArr) {
        int kyberK = mLKEMEngine.getKyberK();
        int iCheckModulus = -1;
        for (int i = 0; i < kyberK; i++) {
            iCheckModulus &= Poly.checkModulus(bArr, i * MLKEMEngine.KyberPolyBytes);
        }
        return iCheckModulus;
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, MLKEMEngine mLKEMEngine) {
        Poly poly2 = new Poly(mLKEMEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i = 1; i < mLKEMEngine.getKyberK(); i++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i), polyVec2.getVectorIndex(i));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).addCoeffs(polyVec.getVectorIndex(i));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        int i = 32;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            short[] sArr = new short[4];
            int i2 = 0;
            for (int i3 = 0; i3 < this.kyberK; i3++) {
                for (int i4 = 0; i4 < 64; i4++) {
                    for (int i5 = 0; i5 < 4; i5++) {
                        sArr[i5] = (short) (((((((long) getVectorIndex(i3).getCoeffIndex((i4 * 4) + i5)) << 10) + 1665) * 1290167) >> 32) & 1023);
                    }
                    short s = sArr[0];
                    bArr[i2] = (byte) s;
                    short s2 = sArr[1];
                    bArr[i2 + 1] = (byte) ((s >> 8) | (s2 << 2));
                    int i6 = s2 >> 6;
                    short s3 = sArr[2];
                    bArr[i2 + 2] = (byte) (i6 | (s3 << 4));
                    short s4 = sArr[3];
                    bArr[i2 + 3] = (byte) ((s3 >> 4) | (s4 << 6));
                    bArr[i2 + 4] = (byte) (s4 >> 2);
                    i2 += 5;
                }
            }
        } else {
            char c = 3;
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            short[] sArr2 = new short[8];
            int i7 = 0;
            int i8 = 0;
            while (i7 < this.kyberK) {
                int i9 = 0;
                while (i9 < i) {
                    for (int i10 = 0; i10 < 8; i10++) {
                        sArr2[i10] = (short) (((((((long) getVectorIndex(i7).getCoeffIndex((i9 * 8) + i10)) << 11) + 1664) * 645084) >> 31) & 2047);
                    }
                    short s5 = sArr2[0];
                    bArr[i8] = (byte) s5;
                    short s6 = sArr2[1];
                    bArr[i8 + 1] = (byte) ((s5 >> 8) | (s6 << 3));
                    short s7 = sArr2[2];
                    bArr[i8 + 2] = (byte) ((s6 >> 5) | (s7 << 6));
                    bArr[i8 + 3] = (byte) (s7 >> 2);
                    int i11 = s7 >> 10;
                    short s8 = sArr2[c];
                    bArr[i8 + 4] = (byte) (i11 | (s8 << 1));
                    short s9 = sArr2[4];
                    bArr[i8 + 5] = (byte) ((s8 >> 7) | (s9 << 4));
                    short s10 = sArr2[5];
                    bArr[i8 + 6] = (byte) ((s9 >> 4) | (s10 << 7));
                    bArr[i8 + 7] = (byte) (s10 >> 1);
                    int i12 = s10 >> 9;
                    short s11 = sArr2[6];
                    bArr[i8 + 8] = (byte) (i12 | (s11 << 2));
                    int i13 = s11 >> 6;
                    short s12 = sArr2[7];
                    bArr[i8 + 9] = (byte) (i13 | (s12 << 5));
                    bArr[i8 + 10] = (byte) (s12 >> 3);
                    i8 += 11;
                    i9++;
                    i = 32;
                    c = 3;
                }
                i7++;
                i = 32;
                c = 3;
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i = 3;
        int i2 = 6;
        short s = 2;
        short s2 = 4;
        short s3 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.kyberK; i4++) {
                for (int i5 = 0; i5 < 64; i5++) {
                    int i6 = bArr[i3] & 255;
                    byte b = bArr[i3 + 1];
                    byte b2 = bArr[i3 + 2];
                    byte b3 = bArr[i3 + 3];
                    short[] sArr = {(short) (i6 | ((short) ((b & 255) << 8))), (short) (((b & 255) >> 2) | ((short) ((b2 & 255) << 6))), (short) (((b2 & 255) >> 4) | ((short) ((b3 & 255) << 4))), (short) (((b3 & 255) >> 6) | ((short) ((bArr[i3 + 4] & 255) << 2)))};
                    i3 += 5;
                    for (int i7 = 0; i7 < 4; i7++) {
                        this.vec[i4].setCoeffIndex((i5 * 4) + i7, (short) ((((sArr[i7] & 1023) * MLKEMEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.kyberK) {
            int i10 = 0;
            while (i10 < 32) {
                int i11 = bArr[i9] & 255;
                byte b4 = bArr[i9 + 1];
                short s4 = (short) (i11 | (((short) (b4 & 255)) << 8));
                int i12 = (b4 & 255) >> i;
                byte b5 = bArr[i9 + 2];
                int i13 = ((b5 & 255) >> i2) | (((short) (bArr[i9 + 3] & 255)) << s);
                byte b6 = bArr[i9 + 4];
                byte b7 = bArr[i9 + 5];
                byte b8 = bArr[i9 + 6];
                int i14 = (((short) (bArr[i9 + 7] & 255)) << s3) | ((b8 & 255) >> 7);
                byte b9 = bArr[i9 + 8];
                byte b10 = bArr[i9 + 9];
                short[] sArr2 = {s4, (short) (i12 | (((short) (b5 & 255)) << 5)), (short) (i13 | ((short) ((b6 & 255) << 10))), (short) (((b6 & 255) >> s3) | (((short) (b7 & 255)) << 7)), (short) ((((short) (b8 & 255)) << s2) | ((b7 & 255) >> s2)), (short) (i14 | ((short) ((b9 & 255) << 9))), (short) (((b9 & 255) >> 2) | (((short) (b10 & 255)) << 6)), (short) (((b10 & 255) >> 5) | (((short) (bArr[i9 + 10] & 255)) << 3))};
                i9 += 11;
                for (int i15 = 0; i15 < 8; i15++) {
                    this.vec[i8].setCoeffIndex((i10 * 8) + i15, (short) ((((sArr2[i15] & 2047) * MLKEMEngine.KyberQ) + 1024) >> 11));
                }
                i10++;
                i = 3;
                i2 = 6;
                s = 2;
                s2 = 4;
                s3 = 1;
            }
            i8++;
            i = 3;
            i2 = 6;
            s = 2;
            s2 = 4;
            s3 = 1;
        }
    }

    public void fromBytes(byte[] bArr) {
        int i = 0;
        while (i < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i);
            int i2 = i * MLKEMEngine.KyberPolyBytes;
            i++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i2, i * MLKEMEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.vec[i];
    }

    public void polyVecInverseNttToMont() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i = 0; i < this.kyberK; i++) {
            System.arraycopy(this.vec[i].toBytes(), 0, bArr, i * MLKEMEngine.KyberPolyBytes, MLKEMEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.kyberK; i++) {
            sb.append(this.vec[i].toString());
            if (i != this.kyberK - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
