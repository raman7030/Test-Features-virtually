package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import p067l.C20780;

/* JADX INFO: loaded from: classes2.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    public static final int DIGEST_LENGTH = 20;

    /* JADX INFO: renamed from: Y1 */
    public static final int f80894Y1 = 1518500249;

    /* JADX INFO: renamed from: Y2 */
    public static final int f80895Y2 = 1859775393;

    /* JADX INFO: renamed from: Y3 */
    public static final int f80896Y3 = -1894007588;

    /* JADX INFO: renamed from: Y4 */
    public static final int f80897Y4 = -899497514;

    /* JADX INFO: renamed from: H1 */
    public int f80898H1;

    /* JADX INFO: renamed from: H2 */
    public int f80899H2;

    /* JADX INFO: renamed from: H3 */
    public int f80900H3;

    /* JADX INFO: renamed from: H4 */
    public int f80901H4;

    /* JADX INFO: renamed from: H5 */
    public int f80902H5;

    /* JADX INFO: renamed from: X */
    public int[] f80903X;
    public int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80903X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f80903X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f80903X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.f80898H1 = Pack.bigEndianToInt(bArr, 16);
        this.f80899H2 = Pack.bigEndianToInt(bArr, 20);
        this.f80900H3 = Pack.bigEndianToInt(bArr, 24);
        this.f80901H4 = Pack.bigEndianToInt(bArr, 28);
        this.f80902H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.f80903X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f80898H1 = sHA1Digest.f80898H1;
        this.f80899H2 = sHA1Digest.f80899H2;
        this.f80900H3 = sHA1Digest.f80900H3;
        this.f80901H4 = sHA1Digest.f80901H4;
        this.f80902H5 = sHA1Digest.f80902H5;
        int[] iArr = sHA1Digest.f80903X;
        System.arraycopy(iArr, 0, this.f80903X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    /* JADX INFO: renamed from: f */
    private int m55356f(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* JADX INFO: renamed from: g */
    private int m55357g(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: h */
    private int m55358h(int i, int i2, int i3) {
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
        Pack.intToBigEndian(this.f80898H1, bArr, i);
        Pack.intToBigEndian(this.f80899H2, bArr, i + 4);
        Pack.intToBigEndian(this.f80900H3, bArr, i + 8);
        Pack.intToBigEndian(this.f80901H4, bArr, i + 12);
        Pack.intToBigEndian(this.f80902H5, bArr, i + 16);
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
        Pack.intToBigEndian(this.f80898H1, bArr, 16);
        Pack.intToBigEndian(this.f80899H2, bArr, 20);
        Pack.intToBigEndian(this.f80900H3, bArr, 24);
        Pack.intToBigEndian(this.f80901H4, bArr, 28);
        Pack.intToBigEndian(this.f80902H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.f80903X[i2], bArr, (i2 * 4) + 40);
        }
        bArr[i + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f80903X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iM46927 = this.f80898H1;
        int iM46928 = this.f80899H2;
        int i3 = this.f80900H3;
        int i4 = this.f80901H4;
        int i5 = this.f80902H5;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iM46929 = C20780.m46927(((iM46927 << 5) | (iM46927 >>> 27)) + m55356f(iM46928, i3, i4), this.f80903X[i6], f80894Y1, i5);
            int i8 = (iM46928 >>> 2) | (iM46928 << 30);
            int iM469210 = C20780.m46927(((iM46929 << 5) | (iM46929 >>> 27)) + m55356f(iM46927, i8, i3), this.f80903X[i6 + 1], f80894Y1, i4);
            int i9 = (iM46927 >>> 2) | (iM46927 << 30);
            int iM469211 = C20780.m46927(((iM469210 << 5) | (iM469210 >>> 27)) + m55356f(iM46929, i9, i8), this.f80903X[i6 + 2], f80894Y1, i3);
            i5 = (iM46929 >>> 2) | (iM46929 << 30);
            int i10 = i6 + 4;
            iM46928 = C20780.m46927(((iM469211 << 5) | (iM469211 >>> 27)) + m55356f(iM469210, i5, i9), this.f80903X[i6 + 3], f80894Y1, i8);
            i4 = (iM469210 >>> 2) | (iM469210 << 30);
            i6 += 5;
            iM46927 = C20780.m46927(((iM46928 << 5) | (iM46928 >>> 27)) + m55356f(iM469211, i4, i5), this.f80903X[i10], f80894Y1, i9);
            i3 = (iM469211 >>> 2) | (iM469211 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iM469212 = C20780.m46927(((iM46927 << 5) | (iM46927 >>> 27)) + m55358h(iM46928, i3, i4), this.f80903X[i6], f80895Y2, i5);
            int i12 = (iM46928 >>> 2) | (iM46928 << 30);
            int iM469213 = C20780.m46927(((iM469212 << 5) | (iM469212 >>> 27)) + m55358h(iM46927, i12, i3), this.f80903X[i6 + 1], f80895Y2, i4);
            int i13 = (iM46927 >>> 2) | (iM46927 << 30);
            int iM469214 = C20780.m46927(((iM469213 << 5) | (iM469213 >>> 27)) + m55358h(iM469212, i13, i12), this.f80903X[i6 + 2], f80895Y2, i3);
            i5 = (iM469212 >>> 2) | (iM469212 << 30);
            int i14 = i6 + 4;
            iM46928 = C20780.m46927(((iM469214 << 5) | (iM469214 >>> 27)) + m55358h(iM469213, i5, i13), this.f80903X[i6 + 3], f80895Y2, i12);
            i4 = (iM469213 >>> 2) | (iM469213 << 30);
            i6 += 5;
            iM46927 = C20780.m46927(((iM46928 << 5) | (iM46928 >>> 27)) + m55358h(iM469214, i4, i5), this.f80903X[i14], f80895Y2, i13);
            i3 = (iM469214 >>> 2) | (iM469214 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iM469215 = C20780.m46927(((iM46927 << 5) | (iM46927 >>> 27)) + m55357g(iM46928, i3, i4), this.f80903X[i6], f80896Y3, i5);
            int i16 = (iM46928 >>> 2) | (iM46928 << 30);
            int iM469216 = C20780.m46927(((iM469215 << 5) | (iM469215 >>> 27)) + m55357g(iM46927, i16, i3), this.f80903X[i6 + 1], f80896Y3, i4);
            int i17 = (iM46927 >>> 2) | (iM46927 << 30);
            int iM469217 = C20780.m46927(((iM469216 << 5) | (iM469216 >>> 27)) + m55357g(iM469215, i17, i16), this.f80903X[i6 + 2], f80896Y3, i3);
            i5 = (iM469215 >>> 2) | (iM469215 << 30);
            int i18 = i6 + 4;
            iM46928 = C20780.m46927(((iM469217 << 5) | (iM469217 >>> 27)) + m55357g(iM469216, i5, i17), this.f80903X[i6 + 3], f80896Y3, i16);
            i4 = (iM469216 >>> 2) | (iM469216 << 30);
            i6 += 5;
            iM46927 = C20780.m46927(((iM46928 << 5) | (iM46928 >>> 27)) + m55357g(iM469217, i4, i5), this.f80903X[i18], f80896Y3, i17);
            i3 = (iM469217 >>> 2) | (iM469217 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iM469218 = C20780.m46927(((iM46927 << 5) | (iM46927 >>> 27)) + m55358h(iM46928, i3, i4), this.f80903X[i6], f80897Y4, i5);
            int i20 = (iM46928 >>> 2) | (iM46928 << 30);
            int iM469219 = C20780.m46927(((iM469218 << 5) | (iM469218 >>> 27)) + m55358h(iM46927, i20, i3), this.f80903X[i6 + 1], f80897Y4, i4);
            int i21 = (iM46927 >>> 2) | (iM46927 << 30);
            int iM469220 = C20780.m46927(((iM469219 << 5) | (iM469219 >>> 27)) + m55358h(iM469218, i21, i20), this.f80903X[i6 + 2], f80897Y4, i3);
            i5 = (iM469218 >>> 2) | (iM469218 << 30);
            int i22 = i6 + 4;
            iM46928 = C20780.m46927(((iM469220 << 5) | (iM469220 >>> 27)) + m55358h(iM469219, i5, i21), this.f80903X[i6 + 3], f80897Y4, i20);
            i4 = (iM469219 >>> 2) | (iM469219 << 30);
            i6 += 5;
            iM46927 = C20780.m46927(((iM46928 << 5) | (iM46928 >>> 27)) + m55358h(iM469220, i4, i5), this.f80903X[i22], f80897Y4, i21);
            i3 = (iM469220 >>> 2) | (iM469220 << 30);
        }
        this.f80898H1 += iM46927;
        this.f80899H2 += iM46928;
        this.f80900H3 += i3;
        this.f80901H4 += i4;
        this.f80902H5 += i5;
        this.xOff = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.f80903X[i23] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f80903X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        this.f80903X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f80898H1 = 1732584193;
        this.f80899H2 = -271733879;
        this.f80900H3 = -1732584194;
        this.f80901H4 = 271733878;
        this.f80902H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f80903X;
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
