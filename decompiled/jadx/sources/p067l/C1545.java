package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ֡ */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes3.dex */
public final class C1545 {

    /* JADX INFO: renamed from: ֨ */
    public static double[] f45829 = new double[91];

    /* JADX INFO: renamed from: ֡ */
    public double f45830;

    /* JADX INFO: renamed from: ֫ */
    public boolean f45831;

    /* JADX INFO: renamed from: ۖ */
    public double f45832;

    /* JADX INFO: renamed from: ۘ */
    public boolean f45833;

    /* JADX INFO: renamed from: ۚ */
    public double f45834;

    /* JADX INFO: renamed from: ۜ */
    public double[] f45835;

    /* JADX INFO: renamed from: ۡ */
    public double f45836;

    /* JADX INFO: renamed from: ۢ */
    public double f45837;

    /* JADX INFO: renamed from: ۧ */
    public double f45838;

    /* JADX INFO: renamed from: ܳ */
    public double f45839;

    /* JADX INFO: renamed from: ܺ */
    public double f45840;

    /* JADX INFO: renamed from: ܽ */
    public double f45841;

    /* JADX INFO: renamed from: ܿ */
    public double f45842;

    /* JADX INFO: renamed from: ᩳ */
    public double f45843;

    /* JADX INFO: renamed from: ᩴ */
    public double f45844;

    /* JADX INFO: renamed from: ᩵ */
    public double f45845;

    /* JADX INFO: renamed from: ᩷ */
    public double f45846;

    /* JADX INFO: renamed from: ᩻ */
    public double f45847;

    public C1545(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        double[] dArr;
        double dHypot;
        double d7 = d3;
        this.f45831 = false;
        boolean z = i == 1;
        this.f45833 = z;
        this.f45837 = d;
        this.f45836 = d2;
        double d8 = d2 - d;
        double d9 = 1.0d / d8;
        this.f45846 = d9;
        if (3 == i) {
            this.f45831 = true;
        }
        double d10 = d5 - d7;
        double d11 = d6 - d4;
        if (this.f45831 || Math.abs(d10) < 0.001d || Math.abs(d11) < 0.001d) {
            this.f45831 = true;
            this.f45844 = d7;
            this.f45845 = d5;
            this.f45830 = d4;
            this.f45834 = d6;
            double dHypot2 = Math.hypot(d11, d10);
            this.f45838 = dHypot2;
            this.f45841 = dHypot2 * d9;
            this.f45839 = d10 / d8;
            this.f45847 = d11 / d8;
            return;
        }
        double[] dArr2 = new double[101];
        this.f45835 = dArr2;
        this.f45843 = ((double) (z ? -1 : 1)) * d10;
        this.f45842 = d11 * ((double) (z ? 1 : -1));
        this.f45839 = z ? d5 : d7;
        this.f45847 = z ? d4 : d6;
        double d12 = d4 - d6;
        int i2 = 0;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (true) {
            dArr = f45829;
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
        this.f45838 = d13;
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
        this.f45841 = this.f45838 * this.f45846;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35931(double d) {
        double d2 = (this.f45833 ? this.f45836 - d : d - this.f45837) * this.f45846;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f45835;
                double length = d2 * ((double) (dArr.length - 1));
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f45832 = Math.sin(d5);
        this.f45840 = Math.cos(d5);
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m35928() {
        double d = this.f45843 * this.f45840;
        double dHypot = this.f45841 / Math.hypot(d, (-this.f45842) * this.f45832);
        return this.f45833 ? (-d) * dHypot : d * dHypot;
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m35929(double d) {
        double d2 = (d - this.f45837) * this.f45846;
        double d3 = this.f45845;
        double d4 = this.f45844;
        return ((d3 - d4) * d2) + d4;
    }

    /* JADX INFO: renamed from: ۧ */
    public final double m35930(double d) {
        double d2 = (d - this.f45837) * this.f45846;
        double d3 = this.f45834;
        double d4 = this.f45830;
        return ((d3 - d4) * d2) + d4;
    }
}
