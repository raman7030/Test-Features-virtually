package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes3.dex */
public final class C14161 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static double[] f42741 = new double[91];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f42742;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f42743;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f42744;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f42745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f42746;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double[] f42747;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f42748;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f42749;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f42750;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f42751;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f42752;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f42753;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f42754;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f42755;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f42756;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f42757;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f42758;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f42759;

    public C14161(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        double[] dArr;
        double dHypot;
        double d7 = d3;
        this.f42743 = false;
        boolean z = i == 1;
        this.f42745 = z;
        this.f42749 = d;
        this.f42748 = d2;
        double d8 = d2 - d;
        double d9 = 1.0d / d8;
        this.f42758 = d9;
        if (3 == i) {
            this.f42743 = true;
        }
        double d10 = d5 - d7;
        double d11 = d6 - d4;
        if (this.f42743 || Math.abs(d10) < 0.001d || Math.abs(d11) < 0.001d) {
            this.f42743 = true;
            this.f42756 = d7;
            this.f42757 = d5;
            this.f42742 = d4;
            this.f42746 = d6;
            double dHypot2 = Math.hypot(d11, d10);
            this.f42750 = dHypot2;
            this.f42753 = dHypot2 * d9;
            this.f42751 = d10 / d8;
            this.f42759 = d11 / d8;
            return;
        }
        double[] dArr2 = new double[101];
        this.f42747 = dArr2;
        this.f42755 = ((double) (z ? -1 : 1)) * d10;
        this.f42754 = d11 * ((double) (z ? 1 : -1));
        this.f42751 = z ? d5 : d7;
        this.f42759 = z ? d4 : d6;
        double d12 = d4 - d6;
        int i2 = 0;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (true) {
            dArr = f42741;
            if (i2 >= 91) {
                break;
            }
            double d16 = d13;
            double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) 90));
            double dSin = Math.sin(radians) * d10;
            double dCos = Math.cos(radians) * d12;
            if (i2 > 0) {
                dHypot = d16 + Math.hypot(dSin - d14, dCos - d15);
                dArr[i2] = dHypot;
            } else {
                dHypot = d16;
            }
            i2++;
            d15 = dCos;
            d13 = dHypot;
            d14 = dSin;
        }
        this.f42750 = d13;
        for (int i3 = 0; i3 < 91; i3++) {
            dArr[i3] = dArr[i3] / d13;
        }
        for (int i4 = 0; i4 < 101; i4++) {
            double d17 = ((double) i4) / ((double) 100);
            int iBinarySearch = Arrays.binarySearch(dArr, d17);
            if (iBinarySearch >= 0) {
                dArr2[i4] = iBinarySearch / 90;
            } else if (iBinarySearch == -1) {
                dArr2[i4] = 0.0d;
            } else {
                int i5 = -iBinarySearch;
                int i6 = i5 - 2;
                double d18 = dArr[i6];
                dArr2[i4] = (((d17 - d18) / (dArr[i5 - 1] - d18)) + ((double) i6)) / ((double) 90);
            }
        }
        this.f42753 = this.f42750 * this.f42758;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33799(double d) {
        double d2 = (this.f42745 ? this.f42748 - d : d - this.f42749) * this.f42758;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f42747;
                double length = d2 * ((double) (dArr.length - 1));
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f42744 = Math.sin(d5);
        this.f42752 = Math.cos(d5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m33796() {
        double d = this.f42755 * this.f42752;
        double dHypot = this.f42753 / Math.hypot(d, (-this.f42754) * this.f42744);
        return this.f42745 ? (-d) * dHypot : d * dHypot;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m33797(double d) {
        double d2 = (d - this.f42749) * this.f42758;
        double d3 = this.f42757;
        double d4 = this.f42756;
        return ((d3 - d4) * d2) + d4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double m33798(double d) {
        double d2 = (d - this.f42749) * this.f42758;
        double d3 = this.f42746;
        double d4 = this.f42742;
        return ((d3 - d4) * d2) + d4;
    }
}
