package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SHA256Digest extends GeneralDigest implements SavableDigest {
    public static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: K */
    public static final int[] f80914K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: H1 */
    public int f80915H1;

    /* JADX INFO: renamed from: H2 */
    public int f80916H2;

    /* JADX INFO: renamed from: H3 */
    public int f80917H3;

    /* JADX INFO: renamed from: H4 */
    public int f80918H4;

    /* JADX INFO: renamed from: H5 */
    public int f80919H5;

    /* JADX INFO: renamed from: H6 */
    public int f80920H6;

    /* JADX INFO: renamed from: H7 */
    public int f80921H7;

    /* JADX INFO: renamed from: H8 */
    public int f80922H8;

    /* JADX INFO: renamed from: X */
    public int[] f80923X;
    public int xOff;

    public SHA256Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SHA256Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80923X = new int[64];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.f80923X = new int[64];
        copyIn(sHA256Digest);
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.f80923X = new int[64];
        this.f80915H1 = Pack.bigEndianToInt(bArr, 16);
        this.f80916H2 = Pack.bigEndianToInt(bArr, 20);
        this.f80917H3 = Pack.bigEndianToInt(bArr, 24);
        this.f80918H4 = Pack.bigEndianToInt(bArr, 28);
        this.f80919H5 = Pack.bigEndianToInt(bArr, 32);
        this.f80920H6 = Pack.bigEndianToInt(bArr, 36);
        this.f80921H7 = Pack.bigEndianToInt(bArr, 40);
        this.f80922H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            this.f80923X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 52);
        }
    }

    /* JADX INFO: renamed from: Ch */
    public static int m55360Ch(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    public static int Maj(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    public static int Sum0(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int Sum1(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    public static int Theta0(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    public static int Theta1(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private void copyIn(SHA256Digest sHA256Digest) {
        super.copyIn((GeneralDigest) sHA256Digest);
        this.f80915H1 = sHA256Digest.f80915H1;
        this.f80916H2 = sHA256Digest.f80916H2;
        this.f80917H3 = sHA256Digest.f80917H3;
        this.f80918H4 = sHA256Digest.f80918H4;
        this.f80919H5 = sHA256Digest.f80919H5;
        this.f80920H6 = sHA256Digest.f80920H6;
        this.f80921H7 = sHA256Digest.f80921H7;
        this.f80922H8 = sHA256Digest.f80922H8;
        int[] iArr = sHA256Digest.f80923X;
        System.arraycopy(iArr, 0, this.f80923X, 0, iArr.length);
        this.xOff = sHA256Digest.xOff;
    }

    public static SavableDigest newInstance() {
        return new SHA256Digest();
    }

    public static SavableDigest newInstance(CryptoServicePurpose cryptoServicePurpose) {
        return new SHA256Digest(cryptoServicePurpose);
    }

    public static SavableDigest newInstance(Digest digest) {
        if (digest instanceof SHA256Digest) {
            return new SHA256Digest((SHA256Digest) digest);
        }
        throw new IllegalArgumentException("receiver digest not available for input type ".concat(digest != null ? digest.getClass().getName() : "null"));
    }

    public static SavableDigest newInstance(byte[] bArr) {
        return new SHA256Digest(bArr);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA256Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f80915H1, bArr, i);
        Pack.intToBigEndian(this.f80916H2, bArr, i + 4);
        Pack.intToBigEndian(this.f80917H3, bArr, i + 8);
        Pack.intToBigEndian(this.f80918H4, bArr, i + 12);
        Pack.intToBigEndian(this.f80919H5, bArr, i + 16);
        Pack.intToBigEndian(this.f80920H6, bArr, i + 20);
        Pack.intToBigEndian(this.f80921H7, bArr, i + 24);
        Pack.intToBigEndian(this.f80922H8, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return XMSSKeyParameters.SHA_256;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        int i = this.xOff * 4;
        byte[] bArr = new byte[i + 53];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f80915H1, bArr, 16);
        Pack.intToBigEndian(this.f80916H2, bArr, 20);
        Pack.intToBigEndian(this.f80917H3, bArr, 24);
        Pack.intToBigEndian(this.f80918H4, bArr, 28);
        Pack.intToBigEndian(this.f80919H5, bArr, 32);
        Pack.intToBigEndian(this.f80920H6, bArr, 36);
        Pack.intToBigEndian(this.f80921H7, bArr, 40);
        Pack.intToBigEndian(this.f80922H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.f80923X[i2], bArr, (i2 * 4) + 52);
        }
        bArr[i + 52] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f80923X;
            int iTheta1 = Theta1(iArr[i - 2]);
            int[] iArr2 = this.f80923X;
            iArr[i] = iTheta1 + iArr2[i - 7] + Theta0(iArr2[i - 15]) + this.f80923X[i - 16];
        }
        int iSum0 = this.f80915H1;
        int iSum1 = this.f80916H2;
        int iSum2 = this.f80917H3;
        int iSum3 = this.f80918H4;
        int i2 = this.f80919H5;
        int i3 = this.f80920H6;
        int i4 = this.f80921H7;
        int i5 = this.f80922H8;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iSum4 = Sum1(i2) + m55360Ch(i2, i3, i4);
            int[] iArr3 = f80914K;
            int i8 = iSum4 + iArr3[i6] + this.f80923X[i6] + i5;
            int i9 = iSum3 + i8;
            int iSum5 = Sum0(iSum0) + Maj(iSum0, iSum1, iSum2) + i8;
            int i10 = i6 + 1;
            int iSum6 = Sum1(i9) + m55360Ch(i9, i2, i3) + iArr3[i10] + this.f80923X[i10] + i4;
            int i11 = iSum2 + iSum6;
            int iSum7 = Sum0(iSum5) + Maj(iSum5, iSum0, iSum1) + iSum6;
            int i12 = i6 + 2;
            int iSum8 = Sum1(i11) + m55360Ch(i11, i9, i2) + iArr3[i12] + this.f80923X[i12] + i3;
            int i13 = iSum1 + iSum8;
            int iSum9 = Sum0(iSum7) + Maj(iSum7, iSum5, iSum0) + iSum8;
            int i14 = i6 + 3;
            int iSum10 = Sum1(i13) + m55360Ch(i13, i11, i9) + iArr3[i14] + this.f80923X[i14] + i2;
            int i15 = iSum0 + iSum10;
            int iSum11 = Sum0(iSum9) + Maj(iSum9, iSum7, iSum5) + iSum10;
            int i16 = i6 + 4;
            int iSum12 = Sum1(i15) + m55360Ch(i15, i13, i11) + iArr3[i16] + this.f80923X[i16] + i9;
            i5 = iSum5 + iSum12;
            iSum3 = Sum0(iSum11) + Maj(iSum11, iSum9, iSum7) + iSum12;
            int i17 = i6 + 5;
            int iSum13 = Sum1(i5) + m55360Ch(i5, i15, i13) + iArr3[i17] + this.f80923X[i17] + i11;
            i4 = iSum7 + iSum13;
            iSum2 = Sum0(iSum3) + Maj(iSum3, iSum11, iSum9) + iSum13;
            int i18 = i6 + 6;
            int iSum14 = Sum1(i4) + m55360Ch(i4, i5, i15) + iArr3[i18] + this.f80923X[i18] + i13;
            i3 = iSum9 + iSum14;
            iSum1 = Sum0(iSum2) + Maj(iSum2, iSum3, iSum11) + iSum14;
            int i19 = i6 + 7;
            int iSum15 = Sum1(i3) + m55360Ch(i3, i4, i5) + iArr3[i19] + this.f80923X[i19] + i15;
            i2 = iSum11 + iSum15;
            iSum0 = Sum0(iSum1) + Maj(iSum1, iSum2, iSum3) + iSum15;
            i6 += 8;
        }
        this.f80915H1 += iSum0;
        this.f80916H2 += iSum1;
        this.f80917H3 += iSum2;
        this.f80918H4 += iSum3;
        this.f80919H5 += i2;
        this.f80920H6 += i3;
        this.f80921H7 += i4;
        this.f80922H8 += i5;
        this.xOff = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f80923X[i20] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f80923X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        this.f80923X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f80915H1 = 1779033703;
        this.f80916H2 = -1150833019;
        this.f80917H3 = 1013904242;
        this.f80918H4 = -1521486534;
        this.f80919H5 = 1359893119;
        this.f80920H6 = -1694144372;
        this.f80921H7 = 528734635;
        this.f80922H8 = 1541459225;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f80923X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA256Digest) memoable);
    }
}
