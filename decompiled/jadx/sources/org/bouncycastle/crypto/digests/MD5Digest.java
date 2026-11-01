package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class MD5Digest extends GeneralDigest implements EncodableDigest {
    public static final int DIGEST_LENGTH = 16;
    public static final int S11 = 7;
    public static final int S12 = 12;
    public static final int S13 = 17;
    public static final int S14 = 22;
    public static final int S21 = 5;
    public static final int S22 = 9;
    public static final int S23 = 14;
    public static final int S24 = 20;
    public static final int S31 = 4;
    public static final int S32 = 11;
    public static final int S33 = 16;
    public static final int S34 = 23;
    public static final int S41 = 6;
    public static final int S42 = 10;
    public static final int S43 = 15;
    public static final int S44 = 21;

    /* JADX INFO: renamed from: H1 */
    public int f80854H1;

    /* JADX INFO: renamed from: H2 */
    public int f80855H2;

    /* JADX INFO: renamed from: H3 */
    public int f80856H3;

    /* JADX INFO: renamed from: H4 */
    public int f80857H4;

    /* JADX INFO: renamed from: X */
    public int[] f80858X;
    public int xOff;

    public MD5Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public MD5Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80858X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, cryptoServicePurpose));
        reset();
    }

    public MD5Digest(MD5Digest mD5Digest) {
        super(mD5Digest);
        this.f80858X = new int[16];
        copyIn(mD5Digest);
    }

    public MD5Digest(byte[] bArr) {
        super(bArr);
        this.f80858X = new int[16];
        this.f80854H1 = Pack.bigEndianToInt(bArr, 16);
        this.f80855H2 = Pack.bigEndianToInt(bArr, 20);
        this.f80856H3 = Pack.bigEndianToInt(bArr, 24);
        this.f80857H4 = Pack.bigEndianToInt(bArr, 28);
        this.xOff = Pack.bigEndianToInt(bArr, 32);
        for (int i = 0; i != this.xOff; i++) {
            this.f80858X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 36);
        }
    }

    /* JADX INFO: renamed from: F */
    private int m55322F(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* JADX INFO: renamed from: G */
    private int m55323G(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* JADX INFO: renamed from: H */
    private int m55324H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: K */
    private int m55325K(int i, int i2, int i3) {
        return (i | (~i3)) ^ i2;
    }

    private void copyIn(MD5Digest mD5Digest) {
        super.copyIn((GeneralDigest) mD5Digest);
        this.f80854H1 = mD5Digest.f80854H1;
        this.f80855H2 = mD5Digest.f80855H2;
        this.f80856H3 = mD5Digest.f80856H3;
        this.f80857H4 = mD5Digest.f80857H4;
        int[] iArr = mD5Digest.f80858X;
        System.arraycopy(iArr, 0, this.f80858X, 0, iArr.length);
        this.xOff = mD5Digest.xOff;
    }

    private int rotateLeft(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD5Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToLittleEndian(this.f80854H1, bArr, i);
        Pack.intToLittleEndian(this.f80855H2, bArr, i + 4);
        Pack.intToLittleEndian(this.f80856H3, bArr, i + 8);
        Pack.intToLittleEndian(this.f80857H4, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        int i = this.xOff * 4;
        byte[] bArr = new byte[i + 37];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f80854H1, bArr, 16);
        Pack.intToBigEndian(this.f80855H2, bArr, 20);
        Pack.intToBigEndian(this.f80856H3, bArr, 24);
        Pack.intToBigEndian(this.f80857H4, bArr, 28);
        Pack.intToBigEndian(this.xOff, bArr, 32);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.f80858X[i2], bArr, (i2 * 4) + 36);
        }
        bArr[i + 36] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f80854H1;
        int i2 = this.f80855H2;
        int i3 = this.f80856H3;
        int i4 = this.f80857H4;
        int iRotateLeft = rotateLeft(((i + m55322F(i2, i3, i4)) + this.f80858X[0]) - 680876936, 7) + i2;
        int iRotateLeft2 = rotateLeft(((i4 + m55322F(iRotateLeft, i2, i3)) + this.f80858X[1]) - 389564586, 12) + iRotateLeft;
        int iRotateLeft3 = rotateLeft(i3 + m55322F(iRotateLeft2, iRotateLeft, i2) + this.f80858X[2] + 606105819, 17) + iRotateLeft2;
        int iRotateLeft4 = rotateLeft(((i2 + m55322F(iRotateLeft3, iRotateLeft2, iRotateLeft)) + this.f80858X[3]) - 1044525330, 22) + iRotateLeft3;
        int iRotateLeft5 = rotateLeft(((iRotateLeft + m55322F(iRotateLeft4, iRotateLeft3, iRotateLeft2)) + this.f80858X[4]) - 176418897, 7) + iRotateLeft4;
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m55322F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f80858X[5] + 1200080426, 12) + iRotateLeft5;
        int iRotateLeft7 = rotateLeft(((iRotateLeft3 + m55322F(iRotateLeft6, iRotateLeft5, iRotateLeft4)) + this.f80858X[6]) - 1473231341, 17) + iRotateLeft6;
        int iRotateLeft8 = rotateLeft(((iRotateLeft4 + m55322F(iRotateLeft7, iRotateLeft6, iRotateLeft5)) + this.f80858X[7]) - 45705983, 22) + iRotateLeft7;
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m55322F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f80858X[8] + 1770035416, 7) + iRotateLeft8;
        int iRotateLeft10 = rotateLeft(((iRotateLeft6 + m55322F(iRotateLeft9, iRotateLeft8, iRotateLeft7)) + this.f80858X[9]) - 1958414417, 12) + iRotateLeft9;
        int iRotateLeft11 = rotateLeft(((iRotateLeft7 + m55322F(iRotateLeft10, iRotateLeft9, iRotateLeft8)) + this.f80858X[10]) - 42063, 17) + iRotateLeft10;
        int iRotateLeft12 = rotateLeft(((iRotateLeft8 + m55322F(iRotateLeft11, iRotateLeft10, iRotateLeft9)) + this.f80858X[11]) - 1990404162, 22) + iRotateLeft11;
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m55322F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f80858X[12] + 1804603682, 7) + iRotateLeft12;
        int iRotateLeft14 = rotateLeft(((iRotateLeft10 + m55322F(iRotateLeft13, iRotateLeft12, iRotateLeft11)) + this.f80858X[13]) - 40341101, 12) + iRotateLeft13;
        int iRotateLeft15 = rotateLeft(((iRotateLeft11 + m55322F(iRotateLeft14, iRotateLeft13, iRotateLeft12)) + this.f80858X[14]) - 1502002290, 17) + iRotateLeft14;
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m55322F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f80858X[15] + 1236535329, 22) + iRotateLeft15;
        int iRotateLeft17 = rotateLeft(((iRotateLeft13 + m55323G(iRotateLeft16, iRotateLeft15, iRotateLeft14)) + this.f80858X[1]) - 165796510, 5) + iRotateLeft16;
        int iRotateLeft18 = rotateLeft(((iRotateLeft14 + m55323G(iRotateLeft17, iRotateLeft16, iRotateLeft15)) + this.f80858X[6]) - 1069501632, 9) + iRotateLeft17;
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m55323G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f80858X[11] + 643717713, 14) + iRotateLeft18;
        int iRotateLeft20 = rotateLeft(((iRotateLeft16 + m55323G(iRotateLeft19, iRotateLeft18, iRotateLeft17)) + this.f80858X[0]) - 373897302, 20) + iRotateLeft19;
        int iRotateLeft21 = rotateLeft(((iRotateLeft17 + m55323G(iRotateLeft20, iRotateLeft19, iRotateLeft18)) + this.f80858X[5]) - 701558691, 5) + iRotateLeft20;
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m55323G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f80858X[10] + 38016083, 9) + iRotateLeft21;
        int iRotateLeft23 = rotateLeft(((iRotateLeft19 + m55323G(iRotateLeft22, iRotateLeft21, iRotateLeft20)) + this.f80858X[15]) - 660478335, 14) + iRotateLeft22;
        int iRotateLeft24 = rotateLeft(((iRotateLeft20 + m55323G(iRotateLeft23, iRotateLeft22, iRotateLeft21)) + this.f80858X[4]) - 405537848, 20) + iRotateLeft23;
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m55323G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f80858X[9] + 568446438, 5) + iRotateLeft24;
        int iRotateLeft26 = rotateLeft(((iRotateLeft22 + m55323G(iRotateLeft25, iRotateLeft24, iRotateLeft23)) + this.f80858X[14]) - 1019803690, 9) + iRotateLeft25;
        int iRotateLeft27 = rotateLeft(((iRotateLeft23 + m55323G(iRotateLeft26, iRotateLeft25, iRotateLeft24)) + this.f80858X[3]) - 187363961, 14) + iRotateLeft26;
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m55323G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f80858X[8] + 1163531501, 20) + iRotateLeft27;
        int iRotateLeft29 = rotateLeft(((iRotateLeft25 + m55323G(iRotateLeft28, iRotateLeft27, iRotateLeft26)) + this.f80858X[13]) - 1444681467, 5) + iRotateLeft28;
        int iRotateLeft30 = rotateLeft(((iRotateLeft26 + m55323G(iRotateLeft29, iRotateLeft28, iRotateLeft27)) + this.f80858X[2]) - 51403784, 9) + iRotateLeft29;
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m55323G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f80858X[7] + 1735328473, 14) + iRotateLeft30;
        int iRotateLeft32 = rotateLeft(((iRotateLeft28 + m55323G(iRotateLeft31, iRotateLeft30, iRotateLeft29)) + this.f80858X[12]) - 1926607734, 20) + iRotateLeft31;
        int iRotateLeft33 = rotateLeft(((iRotateLeft29 + m55324H(iRotateLeft32, iRotateLeft31, iRotateLeft30)) + this.f80858X[5]) - 378558, 4) + iRotateLeft32;
        int iRotateLeft34 = rotateLeft(((iRotateLeft30 + m55324H(iRotateLeft33, iRotateLeft32, iRotateLeft31)) + this.f80858X[8]) - 2022574463, 11) + iRotateLeft33;
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m55324H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f80858X[11] + 1839030562, 16) + iRotateLeft34;
        int iRotateLeft36 = rotateLeft(((iRotateLeft32 + m55324H(iRotateLeft35, iRotateLeft34, iRotateLeft33)) + this.f80858X[14]) - 35309556, 23) + iRotateLeft35;
        int iRotateLeft37 = rotateLeft(((iRotateLeft33 + m55324H(iRotateLeft36, iRotateLeft35, iRotateLeft34)) + this.f80858X[1]) - 1530992060, 4) + iRotateLeft36;
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m55324H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f80858X[4] + 1272893353, 11) + iRotateLeft37;
        int iRotateLeft39 = rotateLeft(((iRotateLeft35 + m55324H(iRotateLeft38, iRotateLeft37, iRotateLeft36)) + this.f80858X[7]) - 155497632, 16) + iRotateLeft38;
        int iRotateLeft40 = rotateLeft(((iRotateLeft36 + m55324H(iRotateLeft39, iRotateLeft38, iRotateLeft37)) + this.f80858X[10]) - 1094730640, 23) + iRotateLeft39;
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m55324H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f80858X[13] + 681279174, 4) + iRotateLeft40;
        int iRotateLeft42 = rotateLeft(((iRotateLeft38 + m55324H(iRotateLeft41, iRotateLeft40, iRotateLeft39)) + this.f80858X[0]) - 358537222, 11) + iRotateLeft41;
        int iRotateLeft43 = rotateLeft(((iRotateLeft39 + m55324H(iRotateLeft42, iRotateLeft41, iRotateLeft40)) + this.f80858X[3]) - 722521979, 16) + iRotateLeft42;
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m55324H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f80858X[6] + 76029189, 23) + iRotateLeft43;
        int iRotateLeft45 = rotateLeft(((iRotateLeft41 + m55324H(iRotateLeft44, iRotateLeft43, iRotateLeft42)) + this.f80858X[9]) - 640364487, 4) + iRotateLeft44;
        int iRotateLeft46 = rotateLeft(((iRotateLeft42 + m55324H(iRotateLeft45, iRotateLeft44, iRotateLeft43)) + this.f80858X[12]) - 421815835, 11) + iRotateLeft45;
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m55324H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f80858X[15] + 530742520, 16) + iRotateLeft46;
        int iRotateLeft48 = rotateLeft(((iRotateLeft44 + m55324H(iRotateLeft47, iRotateLeft46, iRotateLeft45)) + this.f80858X[2]) - 995338651, 23) + iRotateLeft47;
        int iRotateLeft49 = rotateLeft(((iRotateLeft45 + m55325K(iRotateLeft48, iRotateLeft47, iRotateLeft46)) + this.f80858X[0]) - 198630844, 6) + iRotateLeft48;
        int iRotateLeft50 = rotateLeft(iRotateLeft46 + m55325K(iRotateLeft49, iRotateLeft48, iRotateLeft47) + this.f80858X[7] + 1126891415, 10) + iRotateLeft49;
        int iRotateLeft51 = rotateLeft(((iRotateLeft47 + m55325K(iRotateLeft50, iRotateLeft49, iRotateLeft48)) + this.f80858X[14]) - 1416354905, 15) + iRotateLeft50;
        int iRotateLeft52 = rotateLeft(((iRotateLeft48 + m55325K(iRotateLeft51, iRotateLeft50, iRotateLeft49)) + this.f80858X[5]) - 57434055, 21) + iRotateLeft51;
        int iRotateLeft53 = rotateLeft(iRotateLeft49 + m55325K(iRotateLeft52, iRotateLeft51, iRotateLeft50) + this.f80858X[12] + 1700485571, 6) + iRotateLeft52;
        int iRotateLeft54 = rotateLeft(((iRotateLeft50 + m55325K(iRotateLeft53, iRotateLeft52, iRotateLeft51)) + this.f80858X[3]) - 1894986606, 10) + iRotateLeft53;
        int iRotateLeft55 = rotateLeft(((iRotateLeft51 + m55325K(iRotateLeft54, iRotateLeft53, iRotateLeft52)) + this.f80858X[10]) - 1051523, 15) + iRotateLeft54;
        int iRotateLeft56 = rotateLeft(((iRotateLeft52 + m55325K(iRotateLeft55, iRotateLeft54, iRotateLeft53)) + this.f80858X[1]) - 2054922799, 21) + iRotateLeft55;
        int iRotateLeft57 = rotateLeft(iRotateLeft53 + m55325K(iRotateLeft56, iRotateLeft55, iRotateLeft54) + this.f80858X[8] + 1873313359, 6) + iRotateLeft56;
        int iRotateLeft58 = rotateLeft(((iRotateLeft54 + m55325K(iRotateLeft57, iRotateLeft56, iRotateLeft55)) + this.f80858X[15]) - 30611744, 10) + iRotateLeft57;
        int iRotateLeft59 = rotateLeft(((iRotateLeft55 + m55325K(iRotateLeft58, iRotateLeft57, iRotateLeft56)) + this.f80858X[6]) - 1560198380, 15) + iRotateLeft58;
        int iRotateLeft60 = rotateLeft(iRotateLeft56 + m55325K(iRotateLeft59, iRotateLeft58, iRotateLeft57) + this.f80858X[13] + 1309151649, 21) + iRotateLeft59;
        int iRotateLeft61 = rotateLeft(((iRotateLeft57 + m55325K(iRotateLeft60, iRotateLeft59, iRotateLeft58)) + this.f80858X[4]) - 145523070, 6) + iRotateLeft60;
        int iRotateLeft62 = rotateLeft(((iRotateLeft58 + m55325K(iRotateLeft61, iRotateLeft60, iRotateLeft59)) + this.f80858X[11]) - 1120210379, 10) + iRotateLeft61;
        int iRotateLeft63 = rotateLeft(iRotateLeft59 + m55325K(iRotateLeft62, iRotateLeft61, iRotateLeft60) + this.f80858X[2] + 718787259, 15) + iRotateLeft62;
        int iRotateLeft64 = rotateLeft(((iRotateLeft60 + m55325K(iRotateLeft63, iRotateLeft62, iRotateLeft61)) + this.f80858X[9]) - 343485551, 21) + iRotateLeft63;
        this.f80854H1 += iRotateLeft61;
        this.f80855H2 += iRotateLeft64;
        this.f80856H3 += iRotateLeft63;
        this.f80857H4 += iRotateLeft62;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f80858X;
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
        int[] iArr = this.f80858X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f80858X;
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
        this.f80854H1 = 1732584193;
        this.f80855H2 = -271733879;
        this.f80856H3 = -1732584194;
        this.f80857H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f80858X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD5Digest) memoable);
    }
}
