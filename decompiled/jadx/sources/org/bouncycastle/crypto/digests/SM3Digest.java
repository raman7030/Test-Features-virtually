package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import p067l.C20780;

/* JADX INFO: loaded from: classes2.dex */
public class SM3Digest extends GeneralDigest {
    public static final int BLOCK_SIZE = 16;
    public static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: T */
    public static final int[] f80924T = new int[64];

    /* JADX INFO: renamed from: V */
    public int[] f80925V;

    /* JADX INFO: renamed from: W */
    public int[] f80926W;
    public int[] inwords;
    public int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            f80924T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            f80924T[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f80925V = new int[8];
        this.inwords = new int[16];
        this.f80926W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.f80925V = new int[8];
        this.inwords = new int[16];
        this.f80926W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* JADX INFO: renamed from: P0 */
    private int m55361P0(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    /* JADX INFO: renamed from: P1 */
    private int m55362P1(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.f80925V;
        int[] iArr2 = this.f80925V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f80925V, bArr, i);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            this.f80926W[i2] = this.inwords[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.f80926W;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            iArr[i3] = (m55362P1(((i4 >>> 17) | (i4 << 15)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9])) ^ ((i5 >>> 25) | (i5 << 7))) ^ this.f80926W[i3 - 6];
        }
        int[] iArr2 = this.f80925V;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int iM55361P0 = iArr2[4];
        int i10 = iArr2[5];
        int i11 = iArr2[6];
        int i12 = iArr2[7];
        int i13 = 0;
        for (i = 16; i13 < i; i = 16) {
            int i14 = (i6 << 12) | (i6 >>> 20);
            int i15 = i14 + iM55361P0 + f80924T[i13];
            int i16 = (i15 << 7) | (i15 >>> 25);
            int[] iArr3 = this.f80926W;
            int i17 = iArr3[i13];
            int iM46927 = C20780.m46927(FF0(i6, i7, i8), i9, i14 ^ i16, iArr3[i13 + 4] ^ i17);
            int iM46928 = C20780.m46927(GG0(iM55361P0, i10, i11), i12, i16, i17);
            int i18 = (i10 << 19) | (i10 >>> 13);
            i13++;
            i10 = iM55361P0;
            iM55361P0 = m55361P0(iM46928);
            i12 = i11;
            i11 = i18;
            i9 = i8;
            i8 = (i7 >>> 23) | (i7 << 9);
            i7 = i6;
            i6 = iM46927;
        }
        int i19 = 16;
        int i20 = i6;
        int i21 = i12;
        int i22 = i11;
        int i23 = i10;
        int iM55361P1 = iM55361P0;
        int i24 = i9;
        int i25 = i8;
        int i26 = i7;
        int i27 = i20;
        while (i19 < 64) {
            int i28 = (i27 << 12) | (i27 >>> 20);
            int i29 = i28 + iM55361P1 + f80924T[i19];
            int i30 = (i29 >>> 25) | (i29 << 7);
            int[] iArr4 = this.f80926W;
            int i31 = iArr4[i19];
            int iM46929 = C20780.m46927(FF1(i27, i26, i25), i24, i28 ^ i30, iArr4[i19 + 4] ^ i31);
            int iM469210 = C20780.m46927(GG1(iM55361P1, i23, i22), i21, i30, i31);
            int i32 = (i26 >>> 23) | (i26 << 9);
            int i33 = (i23 << 19) | (i23 >>> 13);
            i19++;
            i23 = iM55361P1;
            iM55361P1 = m55361P0(iM469210);
            i21 = i22;
            i22 = i33;
            i26 = i27;
            i27 = iM46929;
            i24 = i25;
            i25 = i32;
        }
        int[] iArr5 = this.f80925V;
        iArr5[0] = i27 ^ iArr5[0];
        iArr5[1] = i26 ^ iArr5[1];
        iArr5[2] = iArr5[2] ^ i25;
        iArr5[3] = iArr5[3] ^ i24;
        iArr5[4] = iArr5[4] ^ iM55361P1;
        iArr5[5] = iArr5[5] ^ i23;
        iArr5[6] = i22 ^ iArr5[6];
        iArr5[7] = i21 ^ iArr5[7];
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            if (i2 >= 14) {
                int[] iArr = this.inwords;
                int i3 = i2 + 1;
                this.xOff = i3;
                iArr[i2] = (int) (j >>> 32);
                this.xOff = i2 + 2;
                iArr[i3] = (int) j;
                return;
            }
            this.inwords[i2] = 0;
            this.xOff = i2 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.inwords;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr[i2] = Pack.bigEndianToInt(bArr, i);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.f80925V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
