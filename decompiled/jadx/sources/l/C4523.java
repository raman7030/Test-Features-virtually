package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4523 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f14368;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f14369;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3112 f14370;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14371;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f14372;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14373;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f14374;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f14375;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f14376;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f14377;

    public C4523(C3112 c3112, int i, int i2) {
        this.f14370 = c3112;
        this.f14368 = i;
        this.f14376 = i2;
        m13295();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13298() {
        return ((this.f14371 - this.f14374) + 1) * ((this.f14373 - this.f14372) + 1) * ((this.f14375 - this.f14377) + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13294() {
        return (this.f14376 + 1) - this.f14368 > 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13295() {
        C3112 c3112 = this.f14370;
        int[] iArr = c3112.f9723;
        int[] iArr2 = c3112.f9725;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f14368; i8 <= this.f14376; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        this.f14377 = i;
        this.f14375 = i4;
        this.f14372 = i2;
        this.f14373 = i5;
        this.f14374 = i3;
        this.f14371 = i6;
        this.f14369 = i7;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4523 m13297() {
        int i;
        if (!m13294()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f14375 - this.f14377;
        int i3 = this.f14373 - this.f14372;
        int i4 = this.f14371 - this.f14374;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C3112 c3112 = this.f14370;
        int[] iArr = c3112.f9723;
        int[] iArr2 = c3112.f9725;
        int i5 = this.f14376;
        int iMin = this.f14368;
        C3112.m9485(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f14376 + 1);
        C3112.m9485(i, iMin, this.f14376, iArr);
        int i6 = this.f14369 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f14376;
            if (i8 > i9) {
                break;
            }
            i7 += iArr2[iArr[i8]];
            if (i7 >= i6) {
                iMin = Math.min(i9 - 1, i8);
                break;
            }
            i8++;
        }
        C4523 c4523 = new C4523(c3112, iMin + 1, this.f14376);
        this.f14376 = iMin;
        m13295();
        return c4523;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5934 m13296() {
        C3112 c3112 = this.f14370;
        int[] iArr = c3112.f9723;
        int[] iArr2 = c3112.f9725;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f14368; i5 <= this.f14376; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C5934(C3112.m9484(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
