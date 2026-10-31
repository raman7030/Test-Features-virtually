package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۡۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes3.dex */
public final class C8621 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f26329 = {GCMSIVBlockCipher.MASK, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26331;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26332;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26333;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26334;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26335;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f26330 = new byte[64];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f26336 = new int[16];

    public C8621() {
        m22384();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22375(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM44633 = C19373.m44633((i3 & i2) | (i4 & (~i2)), i5, i7, i);
        return ((iM44633 >>> (32 - i6)) | (iM44633 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22378(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM44633 = C19373.m44633((i3 & (~i4)) | (i2 & i4), i5, i7, i);
        return ((iM44633 >>> (32 - i6)) | (iM44633 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m22379(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM44633 = C19373.m44633((i3 ^ i2) ^ i4, i5, i7, i);
        return ((iM44633 >>> (32 - i6)) | (iM44633 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m22380(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM44633 = C19373.m44633(i3 ^ ((~i4) | i2), i5, i7, i);
        return ((iM44633 >>> (32 - i6)) | (iM44633 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22376(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22377(int i, byte[] bArr) {
        int i2 = this.f26333;
        int i3 = this.f26335;
        int i4 = this.f26334;
        int i5 = this.f26332;
        int i6 = i;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f26336;
            if (i7 < 16) {
                iArr[i7] = (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                i7++;
                i6 += 4;
            } else {
                int iM22375 = m22375(i2, i3, i4, i5, iArr[0], 7, -680876936);
                int iM22376 = m22375(i5, iM22375, i3, i4, iArr[1], 12, -389564586);
                int iM22377 = m22375(i4, iM22376, iM22375, i3, iArr[2], 17, 606105819);
                int iM22378 = m22375(i3, iM22377, iM22376, iM22375, iArr[3], 22, -1044525330);
                int iM22379 = m22375(iM22375, iM22378, iM22377, iM22376, iArr[4], 7, -176418897);
                int iM223710 = m22375(iM22376, iM22379, iM22378, iM22377, iArr[5], 12, 1200080426);
                int iM223711 = m22375(iM22377, iM223710, iM22379, iM22378, iArr[6], 17, -1473231341);
                int iM223712 = m22375(iM22378, iM223711, iM223710, iM22379, iArr[7], 22, -45705983);
                int iM223713 = m22375(iM22379, iM223712, iM223711, iM223710, iArr[8], 7, 1770035416);
                int iM223714 = m22375(iM223710, iM223713, iM223712, iM223711, iArr[9], 12, -1958414417);
                int iM223715 = m22375(iM223711, iM223714, iM223713, iM223712, iArr[10], 17, -42063);
                int iM223716 = m22375(iM223712, iM223715, iM223714, iM223713, iArr[11], 22, -1990404162);
                int iM223717 = m22375(iM223713, iM223716, iM223715, iM223714, iArr[12], 7, 1804603682);
                int iM223718 = m22375(iM223714, iM223717, iM223716, iM223715, iArr[13], 12, -40341101);
                int iM223719 = m22375(iM223715, iM223718, iM223717, iM223716, iArr[14], 17, -1502002290);
                int iM223720 = m22375(iM223716, iM223719, iM223718, iM223717, iArr[15], 22, 1236535329);
                int iM223721 = m22378(iM223717, iM223720, iM223719, iM223718, iArr[1], 5, -165796510);
                int iM223722 = m22378(iM223718, iM223721, iM223720, iM223719, iArr[6], 9, -1069501632);
                int iM223723 = m22378(iM223719, iM223722, iM223721, iM223720, iArr[11], 14, 643717713);
                int iM223724 = m22378(iM223720, iM223723, iM223722, iM223721, iArr[0], 20, -373897302);
                int iM223725 = m22378(iM223721, iM223724, iM223723, iM223722, iArr[5], 5, -701558691);
                int iM223726 = m22378(iM223722, iM223725, iM223724, iM223723, iArr[10], 9, 38016083);
                int iM223727 = m22378(iM223723, iM223726, iM223725, iM223724, iArr[15], 14, -660478335);
                int iM223728 = m22378(iM223724, iM223727, iM223726, iM223725, iArr[4], 20, -405537848);
                int iM223729 = m22378(iM223725, iM223728, iM223727, iM223726, iArr[9], 5, 568446438);
                int iM223730 = m22378(iM223726, iM223729, iM223728, iM223727, iArr[14], 9, -1019803690);
                int iM223731 = m22378(iM223727, iM223730, iM223729, iM223728, iArr[3], 14, -187363961);
                int iM223732 = m22378(iM223728, iM223731, iM223730, iM223729, iArr[8], 20, 1163531501);
                int iM223733 = m22378(iM223729, iM223732, iM223731, iM223730, iArr[13], 5, -1444681467);
                int iM223734 = m22378(iM223730, iM223733, iM223732, iM223731, iArr[2], 9, -51403784);
                int iM223735 = m22378(iM223731, iM223734, iM223733, iM223732, iArr[7], 14, 1735328473);
                int iM223736 = m22378(iM223732, iM223735, iM223734, iM223733, iArr[12], 20, -1926607734);
                int iM223737 = m22379(iM223733, iM223736, iM223735, iM223734, iArr[5], 4, -378558);
                int iM223738 = m22379(iM223734, iM223737, iM223736, iM223735, iArr[8], 11, -2022574463);
                int iM223739 = m22379(iM223735, iM223738, iM223737, iM223736, iArr[11], 16, 1839030562);
                int iM223740 = m22379(iM223736, iM223739, iM223738, iM223737, iArr[14], 23, -35309556);
                int iM223741 = m22379(iM223737, iM223740, iM223739, iM223738, iArr[1], 4, -1530992060);
                int iM223742 = m22379(iM223738, iM223741, iM223740, iM223739, iArr[4], 11, 1272893353);
                int iM223743 = m22379(iM223739, iM223742, iM223741, iM223740, iArr[7], 16, -155497632);
                int iM223744 = m22379(iM223740, iM223743, iM223742, iM223741, iArr[10], 23, -1094730640);
                int iM223745 = m22379(iM223741, iM223744, iM223743, iM223742, iArr[13], 4, 681279174);
                int iM223746 = m22379(iM223742, iM223745, iM223744, iM223743, iArr[0], 11, -358537222);
                int iM223747 = m22379(iM223743, iM223746, iM223745, iM223744, iArr[3], 16, -722521979);
                int iM223748 = m22379(iM223744, iM223747, iM223746, iM223745, iArr[6], 23, 76029189);
                int iM223749 = m22379(iM223745, iM223748, iM223747, iM223746, iArr[9], 4, -640364487);
                int iM223750 = m22379(iM223746, iM223749, iM223748, iM223747, iArr[12], 11, -421815835);
                int iM223751 = m22379(iM223747, iM223750, iM223749, iM223748, iArr[15], 16, 530742520);
                int iM223752 = m22379(iM223748, iM223751, iM223750, iM223749, iArr[2], 23, -995338651);
                int iM22380 = m22380(iM223749, iM223752, iM223751, iM223750, iArr[0], 6, -198630844);
                int iM22381 = m22380(iM223750, iM22380, iM223752, iM223751, iArr[7], 10, 1126891415);
                int iM22382 = m22380(iM223751, iM22381, iM22380, iM223752, iArr[14], 15, -1416354905);
                int iM22383 = m22380(iM223752, iM22382, iM22381, iM22380, iArr[5], 21, -57434055);
                int iM22384 = m22380(iM22380, iM22383, iM22382, iM22381, iArr[12], 6, 1700485571);
                int iM22385 = m22380(iM22381, iM22384, iM22383, iM22382, iArr[3], 10, -1894986606);
                int iM22386 = m22380(iM22382, iM22385, iM22384, iM22383, iArr[10], 15, -1051523);
                int iM22387 = m22380(iM22383, iM22386, iM22385, iM22384, iArr[1], 21, -2054922799);
                int iM22388 = m22380(iM22384, iM22387, iM22386, iM22385, iArr[8], 6, 1873313359);
                int iM22389 = m22380(iM22385, iM22388, iM22387, iM22386, iArr[15], 10, -30611744);
                int iM223810 = m22380(iM22386, iM22389, iM22388, iM22387, iArr[6], 15, -1560198380);
                int iM223811 = m22380(iM22387, iM223810, iM22389, iM22388, iArr[13], 21, 1309151649);
                int iM223812 = m22380(iM22388, iM223811, iM223810, iM22389, iArr[4], 6, -145523070);
                int iM223813 = m22380(iM22389, iM223812, iM223811, iM223810, iArr[11], 10, -1120210379);
                int iM223814 = m22380(iM223810, iM223813, iM223812, iM223811, iArr[2], 15, 718787259);
                int iM223815 = m22380(iM223811, iM223814, iM223813, iM223812, iArr[9], 21, -343485551);
                this.f26333 += iM223812;
                this.f26335 += iM223815;
                this.f26334 += iM223814;
                this.f26332 += iM223813;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22384() {
        this.f26331 = 0L;
        this.f26333 = 1732584193;
        this.f26335 = -271733879;
        this.f26334 = -1732584194;
        this.f26332 = 271733878;
        for (int i = 0; i < 16; i++) {
            this.f26336[i] = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22381(byte[] bArr, int i, int i2) {
        long j = this.f26331;
        int i3 = 64 - ((int) (63 & j));
        this.f26331 = j + ((long) i2);
        while (i2 > 0) {
            byte[] bArr2 = this.f26330;
            if (i2 < i3) {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i2);
                return;
            }
            if (i3 == 64) {
                m22377(i, bArr);
            } else {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i3);
                m22377(0, bArr2);
            }
            i += i3;
            i2 -= i3;
            i3 = 64;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22385(byte[] bArr) {
        m22381(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m22382() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[8];
        m22376(0, (int) (this.f26331 << 3), bArr2);
        m22376(4, (int) (this.f26331 >> 29), bArr2);
        int i = ((int) this.f26331) & 63;
        m22381(f26329, 0, i < 56 ? 56 - i : 120 - i);
        m22381(bArr2, 0, 8);
        m22376(0, this.f26333, bArr);
        m22376(4, this.f26335, bArr);
        m22376(8, this.f26334, bArr);
        m22376(12, this.f26332, bArr);
        m22384();
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m22383(byte[] bArr) {
        m22385(bArr);
        byte[] bArrM22382 = m22382();
        byte b = bArrM22382[0];
        if (b == 0) {
            bArrM22382[0] = 1;
            return bArrM22382;
        }
        if (b < 0) {
            byte b2 = (byte) (-b);
            bArrM22382[0] = b2 > 0 ? b2 : (byte) 1;
        }
        return bArrM22382;
    }
}
