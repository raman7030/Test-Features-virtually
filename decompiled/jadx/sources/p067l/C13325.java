package p067l;

/* JADX INFO: renamed from: l.ۨۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S1S1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13325 {

    /* JADX INFO: renamed from: ᩷ */
    public static final int[] f37414 = new int[256];

    /* JADX INFO: renamed from: ֫ */
    public final int[] f37415;

    /* JADX INFO: renamed from: ܳ */
    public final int f37418;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f37419;

    /* JADX INFO: renamed from: ܿ */
    public final int f37420;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f37422;

    /* JADX INFO: renamed from: ۧ */
    public int f37417 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f37421 = 0;

    /* JADX INFO: renamed from: ۜ */
    public int f37416 = 0;

    public C13325(int i, C6422 c6422) {
        this.f37415 = c6422.mo7200(1024, true);
        this.f37419 = c6422.mo7200(65536, true);
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | 65535;
        i6 = i6 > 16777216 ? i6 >>> 1 : i6;
        int i7 = i6 + 1;
        this.f37418 = i7;
        this.f37422 = c6422.mo7200(i7, true);
        this.f37420 = i6;
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 != 0) {
                    i2 ^= -306674912;
                }
            }
            f37414[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30417(C6422 c6422) {
        c6422.mo7198(this.f37422);
        c6422.mo7198(this.f37419);
        c6422.mo7198(this.f37415);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30416(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int[] iArr = f37414;
        int i3 = iArr[i2] ^ (bArr[i + 1] & 255);
        this.f37417 = i3 & 1023;
        int i4 = i3 ^ ((bArr[i + 2] & 255) << 8);
        this.f37421 = 65535 & i4;
        this.f37416 = ((iArr[bArr[i + 3] & 255] << 5) ^ i4) & this.f37420;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30414() {
        return this.f37415[this.f37417];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m30418() {
        return this.f37419[this.f37421];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m30420() {
        return this.f37422[this.f37416];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30419(int i) {
        this.f37415[this.f37417] = i;
        this.f37419[this.f37421] = i;
        this.f37422[this.f37416] = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30415(int i) {
        AbstractC15335.m34894(1024, i, this.f37415);
        AbstractC15335.m34894(65536, i, this.f37419);
        AbstractC15335.m34894(this.f37418, i, this.f37422);
    }
}
