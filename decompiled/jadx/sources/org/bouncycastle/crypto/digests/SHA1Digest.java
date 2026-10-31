package org.bouncycastle.crypto.digests;

import l.C19373;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    public static final int DIGEST_LENGTH = 20;
    public static final int Y1 = 1518500249;
    public static final int Y2 = 1859775393;
    public static final int Y3 = -1894007588;
    public static final int Y4 = -899497514;
    public int H1;
    public int H2;
    public int H3;
    public int H4;
    public int H5;
    public int[] X;
    public int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int g(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        int i = this.xOff * 4;
        byte[] bArr = new byte[i + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.X[i2], bArr, (i2 * 4) + 40);
        }
        bArr[i + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iM44633 = this.H1;
        int iM44634 = this.H2;
        int i3 = this.H3;
        int i4 = this.H4;
        int i5 = this.H5;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iM44635 = C19373.m44633(((iM44633 << 5) | (iM44633 >>> 27)) + f(iM44634, i3, i4), this.X[i6], Y1, i5);
            int i8 = (iM44634 >>> 2) | (iM44634 << 30);
            int iM44636 = C19373.m44633(((iM44635 << 5) | (iM44635 >>> 27)) + f(iM44633, i8, i3), this.X[i6 + 1], Y1, i4);
            int i9 = (iM44633 >>> 2) | (iM44633 << 30);
            int iM44637 = C19373.m44633(((iM44636 << 5) | (iM44636 >>> 27)) + f(iM44635, i9, i8), this.X[i6 + 2], Y1, i3);
            i5 = (iM44635 >>> 2) | (iM44635 << 30);
            int i10 = i6 + 4;
            iM44634 = C19373.m44633(((iM44637 << 5) | (iM44637 >>> 27)) + f(iM44636, i5, i9), this.X[i6 + 3], Y1, i8);
            i4 = (iM44636 >>> 2) | (iM44636 << 30);
            i6 += 5;
            iM44633 = C19373.m44633(((iM44634 << 5) | (iM44634 >>> 27)) + f(iM44637, i4, i5), this.X[i10], Y1, i9);
            i3 = (iM44637 >>> 2) | (iM44637 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iM44638 = C19373.m44633(((iM44633 << 5) | (iM44633 >>> 27)) + h(iM44634, i3, i4), this.X[i6], Y2, i5);
            int i12 = (iM44634 >>> 2) | (iM44634 << 30);
            int iM44639 = C19373.m44633(((iM44638 << 5) | (iM44638 >>> 27)) + h(iM44633, i12, i3), this.X[i6 + 1], Y2, i4);
            int i13 = (iM44633 >>> 2) | (iM44633 << 30);
            int iM446310 = C19373.m44633(((iM44639 << 5) | (iM44639 >>> 27)) + h(iM44638, i13, i12), this.X[i6 + 2], Y2, i3);
            i5 = (iM44638 >>> 2) | (iM44638 << 30);
            int i14 = i6 + 4;
            iM44634 = C19373.m44633(((iM446310 << 5) | (iM446310 >>> 27)) + h(iM44639, i5, i13), this.X[i6 + 3], Y2, i12);
            i4 = (iM44639 >>> 2) | (iM44639 << 30);
            i6 += 5;
            iM44633 = C19373.m44633(((iM44634 << 5) | (iM44634 >>> 27)) + h(iM446310, i4, i5), this.X[i14], Y2, i13);
            i3 = (iM446310 >>> 2) | (iM446310 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iM446311 = C19373.m44633(((iM44633 << 5) | (iM44633 >>> 27)) + g(iM44634, i3, i4), this.X[i6], Y3, i5);
            int i16 = (iM44634 >>> 2) | (iM44634 << 30);
            int iM446312 = C19373.m44633(((iM446311 << 5) | (iM446311 >>> 27)) + g(iM44633, i16, i3), this.X[i6 + 1], Y3, i4);
            int i17 = (iM44633 >>> 2) | (iM44633 << 30);
            int iM446313 = C19373.m44633(((iM446312 << 5) | (iM446312 >>> 27)) + g(iM446311, i17, i16), this.X[i6 + 2], Y3, i3);
            i5 = (iM446311 >>> 2) | (iM446311 << 30);
            int i18 = i6 + 4;
            iM44634 = C19373.m44633(((iM446313 << 5) | (iM446313 >>> 27)) + g(iM446312, i5, i17), this.X[i6 + 3], Y3, i16);
            i4 = (iM446312 >>> 2) | (iM446312 << 30);
            i6 += 5;
            iM44633 = C19373.m44633(((iM44634 << 5) | (iM44634 >>> 27)) + g(iM446313, i4, i5), this.X[i18], Y3, i17);
            i3 = (iM446313 >>> 2) | (iM446313 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iM446314 = C19373.m44633(((iM44633 << 5) | (iM44633 >>> 27)) + h(iM44634, i3, i4), this.X[i6], Y4, i5);
            int i20 = (iM44634 >>> 2) | (iM44634 << 30);
            int iM446315 = C19373.m44633(((iM446314 << 5) | (iM446314 >>> 27)) + h(iM44633, i20, i3), this.X[i6 + 1], Y4, i4);
            int i21 = (iM44633 >>> 2) | (iM44633 << 30);
            int iM446316 = C19373.m44633(((iM446315 << 5) | (iM446315 >>> 27)) + h(iM446314, i21, i20), this.X[i6 + 2], Y4, i3);
            i5 = (iM446314 >>> 2) | (iM446314 << 30);
            int i22 = i6 + 4;
            iM44634 = C19373.m44633(((iM446316 << 5) | (iM446316 >>> 27)) + h(iM446315, i5, i21), this.X[i6 + 3], Y4, i20);
            i4 = (iM446315 >>> 2) | (iM446315 << 30);
            i6 += 5;
            iM44633 = C19373.m44633(((iM44634 << 5) | (iM44634 >>> 27)) + h(iM446316, i4, i5), this.X[i22], Y4, i21);
            i3 = (iM446316 >>> 2) | (iM446316 << 30);
        }
        this.H1 += iM44633;
        this.H2 += iM44634;
        this.H3 += i3;
        this.H4 += i4;
        this.H5 += i5;
        this.xOff = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.X[i23] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }
}
