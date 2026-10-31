package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22988 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74012;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f74013;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13815 f74014;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74015;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74016;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74017;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74018;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f74019;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74020;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74021;

    public C22988(C13815 c13815, int i, int i2) {
        this.f74014 = c13815;
        this.f74012 = i;
        this.f74020 = i2;
        m51141();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m51144() {
        return ((this.f74015 - this.f74018) + 1) * ((this.f74017 - this.f74016) + 1) * ((this.f74019 - this.f74021) + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51140() {
        return (this.f74020 + 1) - this.f74012 > 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51141() {
        C13815 c13815 = this.f74014;
        int[] iArr = c13815.f41214;
        int[] iArr2 = c13815.f41215;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f74012; i8 <= this.f74020; i8++) {
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
        this.f74021 = i;
        this.f74019 = i4;
        this.f74016 = i2;
        this.f74017 = i5;
        this.f74018 = i3;
        this.f74015 = i6;
        this.f74013 = i7;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22988 m51143() {
        int i;
        if (!m51140()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f74019 - this.f74021;
        int i3 = this.f74017 - this.f74016;
        int i4 = this.f74015 - this.f74018;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C13815 c13815 = this.f74014;
        int[] iArr = c13815.f41214;
        int[] iArr2 = c13815.f41215;
        int i5 = this.f74020;
        int iMin = this.f74012;
        C13815.m33171(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f74020 + 1);
        C13815.m33171(i, iMin, this.f74020, iArr);
        int i6 = this.f74013 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f74020;
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
        C22988 c22988 = new C22988(c13815, iMin + 1, this.f74020);
        this.f74020 = iMin;
        m51141();
        return c22988;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5934 m51142() {
        C13815 c13815 = this.f74014;
        int[] iArr = c13815.f41214;
        int[] iArr2 = c13815.f41215;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f74012; i5 <= this.f74020; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C5934(C13815.m33170(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
