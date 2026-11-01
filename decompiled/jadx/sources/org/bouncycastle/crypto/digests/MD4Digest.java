package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class MD4Digest extends GeneralDigest {
    public static final int DIGEST_LENGTH = 16;
    public static final int S11 = 3;
    public static final int S12 = 7;
    public static final int S13 = 11;
    public static final int S14 = 19;
    public static final int S21 = 3;
    public static final int S22 = 5;
    public static final int S23 = 9;
    public static final int S24 = 13;
    public static final int S31 = 3;
    public static final int S32 = 9;
    public static final int S33 = 11;
    public static final int S34 = 15;

    /* JADX INFO: renamed from: H1 */
    public int f80849H1;

    /* JADX INFO: renamed from: H2 */
    public int f80850H2;

    /* JADX INFO: renamed from: H3 */
    public int f80851H3;

    /* JADX INFO: renamed from: H4 */
    public int f80852H4;

    /* JADX INFO: renamed from: X */
    public int[] f80853X;
    public int xOff;

    public MD4Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public MD4Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80853X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, cryptoServicePurpose));
        reset();
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super(mD4Digest.purpose);
        this.f80853X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, this.purpose));
        copyIn(mD4Digest);
    }

    /* JADX INFO: renamed from: F */
    private int m55319F(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* JADX INFO: renamed from: G */
    private int m55320G(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: H */
    private int m55321H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private void copyIn(MD4Digest mD4Digest) {
        super.copyIn((GeneralDigest) mD4Digest);
        this.f80849H1 = mD4Digest.f80849H1;
        this.f80850H2 = mD4Digest.f80850H2;
        this.f80851H3 = mD4Digest.f80851H3;
        this.f80852H4 = mD4Digest.f80852H4;
        int[] iArr = mD4Digest.f80853X;
        System.arraycopy(iArr, 0, this.f80853X, 0, iArr.length);
        this.xOff = mD4Digest.xOff;
    }

    private int rotateLeft(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD4Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToLittleEndian(this.f80849H1, bArr, i);
        Pack.intToLittleEndian(this.f80850H2, bArr, i + 4);
        Pack.intToLittleEndian(this.f80851H3, bArr, i + 8);
        Pack.intToLittleEndian(this.f80852H4, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f80849H1;
        int i2 = this.f80850H2;
        int i3 = this.f80851H3;
        int i4 = this.f80852H4;
        int iRotateLeft = rotateLeft(i + m55319F(i2, i3, i4) + this.f80853X[0], 3);
        int iRotateLeft2 = rotateLeft(i4 + m55319F(iRotateLeft, i2, i3) + this.f80853X[1], 7);
        int iRotateLeft3 = rotateLeft(i3 + m55319F(iRotateLeft2, iRotateLeft, i2) + this.f80853X[2], 11);
        int iRotateLeft4 = rotateLeft(i2 + m55319F(iRotateLeft3, iRotateLeft2, iRotateLeft) + this.f80853X[3], 19);
        int iRotateLeft5 = rotateLeft(iRotateLeft + m55319F(iRotateLeft4, iRotateLeft3, iRotateLeft2) + this.f80853X[4], 3);
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m55319F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f80853X[5], 7);
        int iRotateLeft7 = rotateLeft(iRotateLeft3 + m55319F(iRotateLeft6, iRotateLeft5, iRotateLeft4) + this.f80853X[6], 11);
        int iRotateLeft8 = rotateLeft(iRotateLeft4 + m55319F(iRotateLeft7, iRotateLeft6, iRotateLeft5) + this.f80853X[7], 19);
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m55319F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f80853X[8], 3);
        int iRotateLeft10 = rotateLeft(iRotateLeft6 + m55319F(iRotateLeft9, iRotateLeft8, iRotateLeft7) + this.f80853X[9], 7);
        int iRotateLeft11 = rotateLeft(iRotateLeft7 + m55319F(iRotateLeft10, iRotateLeft9, iRotateLeft8) + this.f80853X[10], 11);
        int iRotateLeft12 = rotateLeft(iRotateLeft8 + m55319F(iRotateLeft11, iRotateLeft10, iRotateLeft9) + this.f80853X[11], 19);
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m55319F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f80853X[12], 3);
        int iRotateLeft14 = rotateLeft(iRotateLeft10 + m55319F(iRotateLeft13, iRotateLeft12, iRotateLeft11) + this.f80853X[13], 7);
        int iRotateLeft15 = rotateLeft(iRotateLeft11 + m55319F(iRotateLeft14, iRotateLeft13, iRotateLeft12) + this.f80853X[14], 11);
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m55319F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f80853X[15], 19);
        int iRotateLeft17 = rotateLeft(iRotateLeft13 + m55320G(iRotateLeft16, iRotateLeft15, iRotateLeft14) + this.f80853X[0] + SHA1Digest.f80894Y1, 3);
        int iRotateLeft18 = rotateLeft(iRotateLeft14 + m55320G(iRotateLeft17, iRotateLeft16, iRotateLeft15) + this.f80853X[4] + SHA1Digest.f80894Y1, 5);
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m55320G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f80853X[8] + SHA1Digest.f80894Y1, 9);
        int iRotateLeft20 = rotateLeft(iRotateLeft16 + m55320G(iRotateLeft19, iRotateLeft18, iRotateLeft17) + this.f80853X[12] + SHA1Digest.f80894Y1, 13);
        int iRotateLeft21 = rotateLeft(iRotateLeft17 + m55320G(iRotateLeft20, iRotateLeft19, iRotateLeft18) + this.f80853X[1] + SHA1Digest.f80894Y1, 3);
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m55320G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f80853X[5] + SHA1Digest.f80894Y1, 5);
        int iRotateLeft23 = rotateLeft(iRotateLeft19 + m55320G(iRotateLeft22, iRotateLeft21, iRotateLeft20) + this.f80853X[9] + SHA1Digest.f80894Y1, 9);
        int iRotateLeft24 = rotateLeft(iRotateLeft20 + m55320G(iRotateLeft23, iRotateLeft22, iRotateLeft21) + this.f80853X[13] + SHA1Digest.f80894Y1, 13);
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m55320G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f80853X[2] + SHA1Digest.f80894Y1, 3);
        int iRotateLeft26 = rotateLeft(iRotateLeft22 + m55320G(iRotateLeft25, iRotateLeft24, iRotateLeft23) + this.f80853X[6] + SHA1Digest.f80894Y1, 5);
        int iRotateLeft27 = rotateLeft(iRotateLeft23 + m55320G(iRotateLeft26, iRotateLeft25, iRotateLeft24) + this.f80853X[10] + SHA1Digest.f80894Y1, 9);
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m55320G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f80853X[14] + SHA1Digest.f80894Y1, 13);
        int iRotateLeft29 = rotateLeft(iRotateLeft25 + m55320G(iRotateLeft28, iRotateLeft27, iRotateLeft26) + this.f80853X[3] + SHA1Digest.f80894Y1, 3);
        int iRotateLeft30 = rotateLeft(iRotateLeft26 + m55320G(iRotateLeft29, iRotateLeft28, iRotateLeft27) + this.f80853X[7] + SHA1Digest.f80894Y1, 5);
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m55320G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f80853X[11] + SHA1Digest.f80894Y1, 9);
        int iRotateLeft32 = rotateLeft(iRotateLeft28 + m55320G(iRotateLeft31, iRotateLeft30, iRotateLeft29) + this.f80853X[15] + SHA1Digest.f80894Y1, 13);
        int iRotateLeft33 = rotateLeft(iRotateLeft29 + m55321H(iRotateLeft32, iRotateLeft31, iRotateLeft30) + this.f80853X[0] + SHA1Digest.f80895Y2, 3);
        int iRotateLeft34 = rotateLeft(iRotateLeft30 + m55321H(iRotateLeft33, iRotateLeft32, iRotateLeft31) + this.f80853X[8] + SHA1Digest.f80895Y2, 9);
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m55321H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f80853X[4] + SHA1Digest.f80895Y2, 11);
        int iRotateLeft36 = rotateLeft(iRotateLeft32 + m55321H(iRotateLeft35, iRotateLeft34, iRotateLeft33) + this.f80853X[12] + SHA1Digest.f80895Y2, 15);
        int iRotateLeft37 = rotateLeft(iRotateLeft33 + m55321H(iRotateLeft36, iRotateLeft35, iRotateLeft34) + this.f80853X[2] + SHA1Digest.f80895Y2, 3);
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m55321H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f80853X[10] + SHA1Digest.f80895Y2, 9);
        int iRotateLeft39 = rotateLeft(iRotateLeft35 + m55321H(iRotateLeft38, iRotateLeft37, iRotateLeft36) + this.f80853X[6] + SHA1Digest.f80895Y2, 11);
        int iRotateLeft40 = rotateLeft(iRotateLeft36 + m55321H(iRotateLeft39, iRotateLeft38, iRotateLeft37) + this.f80853X[14] + SHA1Digest.f80895Y2, 15);
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m55321H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f80853X[1] + SHA1Digest.f80895Y2, 3);
        int iRotateLeft42 = rotateLeft(iRotateLeft38 + m55321H(iRotateLeft41, iRotateLeft40, iRotateLeft39) + this.f80853X[9] + SHA1Digest.f80895Y2, 9);
        int iRotateLeft43 = rotateLeft(iRotateLeft39 + m55321H(iRotateLeft42, iRotateLeft41, iRotateLeft40) + this.f80853X[5] + SHA1Digest.f80895Y2, 11);
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m55321H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f80853X[13] + SHA1Digest.f80895Y2, 15);
        int iRotateLeft45 = rotateLeft(iRotateLeft41 + m55321H(iRotateLeft44, iRotateLeft43, iRotateLeft42) + this.f80853X[3] + SHA1Digest.f80895Y2, 3);
        int iRotateLeft46 = rotateLeft(iRotateLeft42 + m55321H(iRotateLeft45, iRotateLeft44, iRotateLeft43) + this.f80853X[11] + SHA1Digest.f80895Y2, 9);
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m55321H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f80853X[7] + SHA1Digest.f80895Y2, 11);
        int iRotateLeft48 = rotateLeft(iRotateLeft44 + m55321H(iRotateLeft47, iRotateLeft46, iRotateLeft45) + this.f80853X[15] + SHA1Digest.f80895Y2, 15);
        this.f80849H1 += iRotateLeft45;
        this.f80850H2 += iRotateLeft48;
        this.f80851H3 += iRotateLeft47;
        this.f80852H4 += iRotateLeft46;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f80853X;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f80853X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f80853X;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr[i2] = Pack.littleEndianToInt(bArr, i);
        if (this.xOff == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f80849H1 = 1732584193;
        this.f80850H2 = -271733879;
        this.f80851H3 = -1732584194;
        this.f80852H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f80853X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD4Digest) memoable);
    }
}
