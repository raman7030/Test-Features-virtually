package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6667 {

    /* JADX INFO: renamed from: ֫ */
    public int f17195;

    /* JADX INFO: renamed from: ۜ */
    public int f17196;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C5326 f17197;

    /* JADX INFO: renamed from: ۧ */
    public int f17198;

    /* JADX INFO: renamed from: ܳ */
    public int f17199;

    /* JADX INFO: renamed from: ܽ */
    public int f17200;

    /* JADX INFO: renamed from: ܿ */
    public int f17201;

    /* JADX INFO: renamed from: ᩳ */
    public int f17202;

    /* JADX INFO: renamed from: ᩷ */
    public int f17203;

    /* JADX INFO: renamed from: ᩻ */
    public int f17204;

    public C6667(C5326 c5326, int i, int i2) {
        this.f17197 = c5326;
        this.f17195 = i;
        this.f17203 = i2;
        m15178();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m15181() {
        return ((this.f17198 - this.f17201) + 1) * ((this.f17200 - this.f17199) + 1) * ((this.f17202 - this.f17204) + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15177() {
        return (this.f17203 + 1) - this.f17195 > 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15178() {
        C5326 c5326 = this.f17197;
        int[] iArr = c5326.f12526;
        int[] iArr2 = c5326.f12528;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f17195; i8 <= this.f17203; i8++) {
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
        this.f17204 = i;
        this.f17202 = i4;
        this.f17199 = i2;
        this.f17200 = i5;
        this.f17201 = i3;
        this.f17198 = i6;
        this.f17196 = i7;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C6667 m15180() {
        int i;
        if (!m15177()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f17202 - this.f17204;
        int i3 = this.f17200 - this.f17199;
        int i4 = this.f17198 - this.f17201;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C5326 c5326 = this.f17197;
        int[] iArr = c5326.f12526;
        int[] iArr2 = c5326.f12528;
        int i5 = this.f17203;
        int iMin = this.f17195;
        C5326.m11528(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f17203 + 1);
        C5326.m11528(i, iMin, this.f17203, iArr);
        int i6 = this.f17196 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f17203;
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
        C6667 c6667 = new C6667(c5326, iMin + 1, this.f17203);
        this.f17203 = iMin;
        m15178();
        return c6667;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C8008 m15179() {
        C5326 c5326 = this.f17197;
        int[] iArr = c5326.f12526;
        int[] iArr2 = c5326.f12528;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f17195; i5 <= this.f17203; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C8008(C5326.m11527(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
