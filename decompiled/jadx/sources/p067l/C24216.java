package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24216 {

    /* JADX INFO: renamed from: ֫ */
    public int f76747;

    /* JADX INFO: renamed from: ۜ */
    public int f76748;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C15498 f76749;

    /* JADX INFO: renamed from: ۧ */
    public int f76750;

    /* JADX INFO: renamed from: ܳ */
    public int f76751;

    /* JADX INFO: renamed from: ܽ */
    public int f76752;

    /* JADX INFO: renamed from: ܿ */
    public int f76753;

    /* JADX INFO: renamed from: ᩳ */
    public int f76754;

    /* JADX INFO: renamed from: ᩷ */
    public int f76755;

    /* JADX INFO: renamed from: ᩻ */
    public int f76756;

    public C24216(C15498 c15498, int i, int i2) {
        this.f76749 = c15498;
        this.f76747 = i;
        this.f76755 = i2;
        m53534();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m53537() {
        return ((this.f76750 - this.f76753) + 1) * ((this.f76752 - this.f76751) + 1) * ((this.f76754 - this.f76756) + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53533() {
        return (this.f76755 + 1) - this.f76747 > 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53534() {
        C15498 c15498 = this.f76749;
        int[] iArr = c15498.f44292;
        int[] iArr2 = c15498.f44293;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f76747; i8 <= this.f76755; i8++) {
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
        this.f76756 = i;
        this.f76754 = i4;
        this.f76751 = i2;
        this.f76752 = i5;
        this.f76753 = i3;
        this.f76750 = i6;
        this.f76748 = i7;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C24216 m53536() {
        int i;
        if (!m53533()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f76754 - this.f76756;
        int i3 = this.f76752 - this.f76751;
        int i4 = this.f76750 - this.f76753;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C15498 c15498 = this.f76749;
        int[] iArr = c15498.f44292;
        int[] iArr2 = c15498.f44293;
        int i5 = this.f76755;
        int iMin = this.f76747;
        C15498.m35288(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f76755 + 1);
        C15498.m35288(i, iMin, this.f76755, iArr);
        int i6 = this.f76748 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f76755;
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
        C24216 c24216 = new C24216(c15498, iMin + 1, this.f76755);
        this.f76755 = iMin;
        m53534();
        return c24216;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C8008 m53535() {
        C15498 c15498 = this.f76749;
        int[] iArr = c15498.f44292;
        int[] iArr2 = c15498.f44293;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f76747; i5 <= this.f76755; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C8008(C15498.m35287(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
