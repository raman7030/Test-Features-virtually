package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ֡ */
/* JADX INFO: compiled from: 91C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1020 {

    /* JADX INFO: renamed from: ֫ */
    public double[] f14165;

    /* JADX INFO: renamed from: ۧ */
    public float[] f14166 = new float[0];

    /* JADX INFO: renamed from: ܽ */
    public double[] f14167 = new double[0];

    /* JADX INFO: renamed from: ᩳ */
    public int f14168;

    public final String toString() {
        return "pos =" + Arrays.toString(this.f14167) + " period=" + Arrays.toString(this.f14166);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12927(int i) {
        this.f14168 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12926(double d, float f) {
        int length = this.f14166.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f14167, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f14167 = Arrays.copyOf(this.f14167, length);
        this.f14166 = Arrays.copyOf(this.f14166, length);
        this.f14165 = new double[length];
        double[] dArr = this.f14167;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f14167[iBinarySearch] = d;
        this.f14166[iBinarySearch] = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12925() {
        int i = 0;
        double d = 0.0d;
        while (true) {
            float[] fArr = this.f14166;
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
            float[] fArr2 = this.f14166;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            float f = (fArr2[i4] + fArr2[i3]) / 2.0f;
            double[] dArr = this.f14167;
            d2 += (dArr[i3] - dArr[i4]) * ((double) f);
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.f14166;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = (float) (((double) fArr3[i5]) * (d / d2));
            i5++;
        }
        this.f14165[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.f14166;
            if (i2 >= fArr4.length) {
                return;
            }
            int i6 = i2 - 1;
            float f2 = (fArr4[i6] + fArr4[i2]) / 2.0f;
            double[] dArr2 = this.f14167;
            double d3 = dArr2[i2] - dArr2[i6];
            double[] dArr3 = this.f14165;
            dArr3[i2] = (d3 * ((double) f2)) + dArr3[i6];
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final double m12928(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f14167, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f14166;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f14167;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return ((((d * d) - (d3 * d3)) * d4) / 2.0d) + ((d - d3) * (((double) f2) - (d4 * d3))) + this.f14165[i3];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final double m12930(double d) {
        double dAbs;
        switch (this.f14168) {
            case 1:
                return Math.signum(0.5d - (m12928(d) % 1.0d));
            case 2:
                dAbs = Math.abs((((m12928(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m12928(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((m12928(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(m12928(d) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((m12928(d) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(m12928(d) * 6.283185307179586d);
        }
        return 1.0d - dAbs;
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m12924(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f14167, d);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f14166;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f14167;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return (((double) f2) - (d4 * d3)) + (d * d4);
    }

    /* JADX INFO: renamed from: ܽ */
    public final double m12929(double d) {
        switch (this.f14168) {
            case 1:
                return 0.0d;
            case 2:
                return Math.signum((((m12928(d) * 4.0d) + 3.0d) % 4.0d) - 2.0d) * m12924(d) * 4.0d;
            case 3:
                return m12924(d) * 2.0d;
            case 4:
                return (-m12924(d)) * 2.0d;
            case 5:
                return Math.sin(m12928(d) * 6.283185307179586d) * m12924(d) * (-6.283185307179586d);
            case 6:
                return ((((m12928(d) * 4.0d) + 2.0d) % 4.0d) - 2.0d) * m12924(d) * 4.0d;
            default:
                return Math.cos(m12928(d) * 6.283185307179586d) * m12924(d) * 6.283185307179586d;
        }
    }
}
