package l;

/* JADX INFO: renamed from: l.ۨۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S1S1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11529 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f34417 = new int[256];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f34418;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f34421;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f34422;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f34423;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f34425;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34420 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f34424 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f34419 = 0;

    public C11529(int i, C4265 c4265) {
        this.f34418 = c4265.mo4957(1024, true);
        this.f34422 = c4265.mo4957(65536, true);
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | 65535;
        i6 = i6 > 16777216 ? i6 >>> 1 : i6;
        int i7 = i6 + 1;
        this.f34421 = i7;
        this.f34425 = c4265.mo4957(i7, true);
        this.f34423 = i6;
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
            f34417[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28371(C4265 c4265) {
        c4265.mo4955(this.f34425);
        c4265.mo4955(this.f34422);
        c4265.mo4955(this.f34418);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28370(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int[] iArr = f34417;
        int i3 = iArr[i2] ^ (bArr[i + 1] & 255);
        this.f34420 = i3 & 1023;
        int i4 = i3 ^ ((bArr[i + 2] & 255) << 8);
        this.f34424 = 65535 & i4;
        this.f34419 = ((iArr[bArr[i + 3] & 255] << 5) ^ i4) & this.f34423;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28368() {
        return this.f34418[this.f34420];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m28372() {
        return this.f34422[this.f34424];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28374() {
        return this.f34425[this.f34419];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28373(int i) {
        this.f34418[this.f34420] = i;
        this.f34422[this.f34424] = i;
        this.f34425[this.f34419] = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28369(int i) {
        AbstractC13644.m32779(1024, i, this.f34418);
        AbstractC13644.m32779(65536, i, this.f34422);
        AbstractC13644.m32779(this.f34421, i, this.f34425);
    }
}
