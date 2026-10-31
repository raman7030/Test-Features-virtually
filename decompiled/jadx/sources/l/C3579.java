package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 91C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3579 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double[] f11360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float[] f11361 = new float[0];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double[] f11362 = new double[0];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f11363;

    public final String toString() {
        return "pos =" + Arrays.toString(this.f11362) + " period=" + Arrays.toString(this.f11361);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10951(int i) {
        this.f11363 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10950(double d, float f) {
        int length = this.f11361.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f11362, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f11362 = Arrays.copyOf(this.f11362, length);
        this.f11361 = Arrays.copyOf(this.f11361, length);
        this.f11360 = new double[length];
        double[] dArr = this.f11362;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f11362[iBinarySearch] = d;
        this.f11361[iBinarySearch] = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10949() {
        int i = 0;
        double d = 0.0d;
        while (true) {
            float[] fArr = this.f11361;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        int i2 = 1;
        int i3 = 1;
        double d2 = 0.0d;
        while (true) {
            float[] fArr2 = this.f11361;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            float f = (fArr2[i4] + fArr2[i3]) / 2.0f;
            double[] dArr = this.f11362;
            d2 += (dArr[i3] - dArr[i4]) * ((double) f);
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.f11361;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = (float) (((double) fArr3[i5]) * (d / d2));
            i5++;
        }
        this.f11360[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.f11361;
            if (i2 >= fArr4.length) {
                return;
            }
            int i6 = i2 - 1;
            float f2 = (fArr4[i6] + fArr4[i2]) / 2.0f;
            double[] dArr2 = this.f11362;
            double d3 = dArr2[i2] - dArr2[i6];
            double[] dArr3 = this.f11360;
            dArr3[i2] = (d3 * ((double) f2)) + dArr3[i6];
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double m10952(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f11362, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f11361;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f11362;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return ((((d * d) - (d3 * d3)) * d4) / 2.0d) + ((d - d3) * (((double) f2) - (d4 * d3))) + this.f11360[i3];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final double m10954(double d) {
        double dAbs;
        switch (this.f11363) {
            case 1:
                return Math.signum(0.5d - (m10952(d) % 1.0d));
            case 2:
                dAbs = Math.abs((((m10952(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m10952(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((m10952(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(m10952(d) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((m10952(d) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(m10952(d) * 6.283185307179586d);
        }
        return 1.0d - dAbs;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m10948(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f11362, d);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f11361;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f11362;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return (((double) f2) - (d4 * d3)) + (d * d4);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final double m10953(double d) {
        switch (this.f11363) {
            case 1:
                return 0.0d;
            case 2:
                return Math.signum((((m10952(d) * 4.0d) + 3.0d) % 4.0d) - 2.0d) * m10948(d) * 4.0d;
            case 3:
                return m10948(d) * 2.0d;
            case 4:
                return (-m10948(d)) * 2.0d;
            case 5:
                return Math.sin(m10952(d) * 6.283185307179586d) * m10948(d) * (-6.283185307179586d);
            case 6:
                return ((((m10952(d) * 4.0d) + 2.0d) % 4.0d) - 2.0d) * m10948(d) * 4.0d;
            default:
                return Math.cos(m10952(d) * 6.283185307179586d) * m10948(d) * 6.283185307179586d;
        }
    }
}
