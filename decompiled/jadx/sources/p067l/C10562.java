package p067l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۡۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10562 {

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f29247 = {GCMSIVBlockCipher.MASK, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۧ */
    public long f29249;

    /* JADX INFO: renamed from: ܳ */
    public int f29250;

    /* JADX INFO: renamed from: ܽ */
    public int f29251;

    /* JADX INFO: renamed from: ܿ */
    public int f29252;

    /* JADX INFO: renamed from: ᩳ */
    public int f29253;

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f29248 = new byte[64];

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f29254 = new int[16];

    public C10562() {
        m24353();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24344(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM46927 = C20780.m46927((i3 & i2) | (i4 & (~i2)), i5, i7, i);
        return ((iM46927 >>> (32 - i6)) | (iM46927 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m24347(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM46927 = C20780.m46927((i3 & (~i4)) | (i2 & i4), i5, i7, i);
        return ((iM46927 >>> (32 - i6)) | (iM46927 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m24348(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM46927 = C20780.m46927((i3 ^ i2) ^ i4, i5, i7, i);
        return ((iM46927 >>> (32 - i6)) | (iM46927 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m24349(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM46927 = C20780.m46927(i3 ^ ((~i4) | i2), i5, i7, i);
        return ((iM46927 >>> (32 - i6)) | (iM46927 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24345(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24346(int i, byte[] bArr) {
        int i2 = this.f29251;
        int i3 = this.f29253;
        int i4 = this.f29252;
        int i5 = this.f29250;
        int i6 = i;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f29254;
            if (i7 < 16) {
                iArr[i7] = (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                i7++;
                i6 += 4;
            } else {
                int iM24344 = m24344(i2, i3, i4, i5, iArr[0], 7, -680876936);
                int iM24345 = m24344(i5, iM24344, i3, i4, iArr[1], 12, -389564586);
                int iM24346 = m24344(i4, iM24345, iM24344, i3, iArr[2], 17, 606105819);
                int iM24347 = m24344(i3, iM24346, iM24345, iM24344, iArr[3], 22, -1044525330);
                int iM24348 = m24344(iM24344, iM24347, iM24346, iM24345, iArr[4], 7, -176418897);
                int iM24349 = m24344(iM24345, iM24348, iM24347, iM24346, iArr[5], 12, 1200080426);
                int iM243410 = m24344(iM24346, iM24349, iM24348, iM24347, iArr[6], 17, -1473231341);
                int iM243411 = m24344(iM24347, iM243410, iM24349, iM24348, iArr[7], 22, -45705983);
                int iM243412 = m24344(iM24348, iM243411, iM243410, iM24349, iArr[8], 7, 1770035416);
                int iM243413 = m24344(iM24349, iM243412, iM243411, iM243410, iArr[9], 12, -1958414417);
                int iM243414 = m24344(iM243410, iM243413, iM243412, iM243411, iArr[10], 17, -42063);
                int iM243415 = m24344(iM243411, iM243414, iM243413, iM243412, iArr[11], 22, -1990404162);
                int iM243416 = m24344(iM243412, iM243415, iM243414, iM243413, iArr[12], 7, 1804603682);
                int iM243417 = m24344(iM243413, iM243416, iM243415, iM243414, iArr[13], 12, -40341101);
                int iM243418 = m24344(iM243414, iM243417, iM243416, iM243415, iArr[14], 17, -1502002290);
                int iM243419 = m24344(iM243415, iM243418, iM243417, iM243416, iArr[15], 22, 1236535329);
                int iM243420 = m24347(iM243416, iM243419, iM243418, iM243417, iArr[1], 5, -165796510);
                int iM243421 = m24347(iM243417, iM243420, iM243419, iM243418, iArr[6], 9, -1069501632);
                int iM243422 = m24347(iM243418, iM243421, iM243420, iM243419, iArr[11], 14, 643717713);
                int iM243423 = m24347(iM243419, iM243422, iM243421, iM243420, iArr[0], 20, -373897302);
                int iM243424 = m24347(iM243420, iM243423, iM243422, iM243421, iArr[5], 5, -701558691);
                int iM243425 = m24347(iM243421, iM243424, iM243423, iM243422, iArr[10], 9, 38016083);
                int iM243426 = m24347(iM243422, iM243425, iM243424, iM243423, iArr[15], 14, -660478335);
                int iM243427 = m24347(iM243423, iM243426, iM243425, iM243424, iArr[4], 20, -405537848);
                int iM243428 = m24347(iM243424, iM243427, iM243426, iM243425, iArr[9], 5, 568446438);
                int iM243429 = m24347(iM243425, iM243428, iM243427, iM243426, iArr[14], 9, -1019803690);
                int iM243430 = m24347(iM243426, iM243429, iM243428, iM243427, iArr[3], 14, -187363961);
                int iM243431 = m24347(iM243427, iM243430, iM243429, iM243428, iArr[8], 20, 1163531501);
                int iM243432 = m24347(iM243428, iM243431, iM243430, iM243429, iArr[13], 5, -1444681467);
                int iM243433 = m24347(iM243429, iM243432, iM243431, iM243430, iArr[2], 9, -51403784);
                int iM243434 = m24347(iM243430, iM243433, iM243432, iM243431, iArr[7], 14, 1735328473);
                int iM243435 = m24347(iM243431, iM243434, iM243433, iM243432, iArr[12], 20, -1926607734);
                int iM243436 = m24348(iM243432, iM243435, iM243434, iM243433, iArr[5], 4, -378558);
                int iM243437 = m24348(iM243433, iM243436, iM243435, iM243434, iArr[8], 11, -2022574463);
                int iM243438 = m24348(iM243434, iM243437, iM243436, iM243435, iArr[11], 16, 1839030562);
                int iM243439 = m24348(iM243435, iM243438, iM243437, iM243436, iArr[14], 23, -35309556);
                int iM243440 = m24348(iM243436, iM243439, iM243438, iM243437, iArr[1], 4, -1530992060);
                int iM243441 = m24348(iM243437, iM243440, iM243439, iM243438, iArr[4], 11, 1272893353);
                int iM243442 = m24348(iM243438, iM243441, iM243440, iM243439, iArr[7], 16, -155497632);
                int iM243443 = m24348(iM243439, iM243442, iM243441, iM243440, iArr[10], 23, -1094730640);
                int iM243444 = m24348(iM243440, iM243443, iM243442, iM243441, iArr[13], 4, 681279174);
                int iM243445 = m24348(iM243441, iM243444, iM243443, iM243442, iArr[0], 11, -358537222);
                int iM243446 = m24348(iM243442, iM243445, iM243444, iM243443, iArr[3], 16, -722521979);
                int iM243447 = m24348(iM243443, iM243446, iM243445, iM243444, iArr[6], 23, 76029189);
                int iM243448 = m24348(iM243444, iM243447, iM243446, iM243445, iArr[9], 4, -640364487);
                int iM243449 = m24348(iM243445, iM243448, iM243447, iM243446, iArr[12], 11, -421815835);
                int iM243450 = m24348(iM243446, iM243449, iM243448, iM243447, iArr[15], 16, 530742520);
                int iM243451 = m24348(iM243447, iM243450, iM243449, iM243448, iArr[2], 23, -995338651);
                int iM243452 = m24349(iM243448, iM243451, iM243450, iM243449, iArr[0], 6, -198630844);
                int iM243453 = m24349(iM243449, iM243452, iM243451, iM243450, iArr[7], 10, 1126891415);
                int iM243454 = m24349(iM243450, iM243453, iM243452, iM243451, iArr[14], 15, -1416354905);
                int iM243455 = m24349(iM243451, iM243454, iM243453, iM243452, iArr[5], 21, -57434055);
                int iM243456 = m24349(iM243452, iM243455, iM243454, iM243453, iArr[12], 6, 1700485571);
                int iM243457 = m24349(iM243453, iM243456, iM243455, iM243454, iArr[3], 10, -1894986606);
                int iM243458 = m24349(iM243454, iM243457, iM243456, iM243455, iArr[10], 15, -1051523);
                int iM243459 = m24349(iM243455, iM243458, iM243457, iM243456, iArr[1], 21, -2054922799);
                int iM243460 = m24349(iM243456, iM243459, iM243458, iM243457, iArr[8], 6, 1873313359);
                int iM243461 = m24349(iM243457, iM243460, iM243459, iM243458, iArr[15], 10, -30611744);
                int iM243462 = m24349(iM243458, iM243461, iM243460, iM243459, iArr[6], 15, -1560198380);
                int iM243463 = m24349(iM243459, iM243462, iM243461, iM243460, iArr[13], 21, 1309151649);
                int iM243464 = m24349(iM243460, iM243463, iM243462, iM243461, iArr[4], 6, -145523070);
                int iM243465 = m24349(iM243461, iM243464, iM243463, iM243462, iArr[11], 10, -1120210379);
                int iM243466 = m24349(iM243462, iM243465, iM243464, iM243463, iArr[2], 15, 718787259);
                int iM243467 = m24349(iM243463, iM243466, iM243465, iM243464, iArr[9], 21, -343485551);
                this.f29251 += iM243464;
                this.f29253 += iM243467;
                this.f29252 += iM243466;
                this.f29250 += iM243465;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24353() {
        this.f29249 = 0L;
        this.f29251 = 1732584193;
        this.f29253 = -271733879;
        this.f29252 = -1732584194;
        this.f29250 = 271733878;
        for (int i = 0; i < 16; i++) {
            this.f29254[i] = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24350(byte[] bArr, int i, int i2) {
        long j = this.f29249;
        int i3 = 64 - ((int) (63 & j));
        this.f29249 = j + ((long) i2);
        while (i2 > 0) {
            byte[] bArr2 = this.f29248;
            if (i2 < i3) {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i2);
                return;
            }
            if (i3 == 64) {
                m24346(i, bArr);
            } else {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i3);
                m24346(0, bArr2);
            }
            i += i3;
            i2 -= i3;
            i3 = 64;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24354(byte[] bArr) {
        m24350(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m24351() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[8];
        m24345(0, (int) (this.f29249 << 3), bArr2);
        m24345(4, (int) (this.f29249 >> 29), bArr2);
        int i = ((int) this.f29249) & 63;
        m24350(f29247, 0, i < 56 ? 56 - i : 120 - i);
        m24350(bArr2, 0, 8);
        m24345(0, this.f29251, bArr);
        m24345(4, this.f29253, bArr);
        m24345(8, this.f29252, bArr);
        m24345(12, this.f29250, bArr);
        m24353();
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m24352(byte[] bArr) {
        m24354(bArr);
        byte[] bArrM24351 = m24351();
        byte b = bArrM24351[0];
        if (b == 0) {
            bArrM24351[0] = 1;
            return bArrM24351;
        }
        if (b < 0) {
            byte b2 = (byte) (-b);
            bArrM24351[0] = b2 > 0 ? b2 : (byte) 1;
        }
        return bArrM24351;
    }
}
