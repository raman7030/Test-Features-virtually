package p067l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۛۚ */
/* JADX INFO: compiled from: B19H */
/* JADX INFO: loaded from: classes2.dex */
public final class C1132 implements Comparable {

    /* JADX INFO: renamed from: ۧ֫ */
    public static String[] f20762 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: ֫֫ */
    public float f20763;

    /* JADX INFO: renamed from: ۙ */
    public C1265 f20765;

    /* JADX INFO: renamed from: ۟ */
    public float f20767;

    /* JADX INFO: renamed from: ۨ */
    public float f20769;

    /* JADX INFO: renamed from: ܰ */
    public float f20772;

    /* JADX INFO: renamed from: ᩹ */
    public float f20775;

    /* JADX INFO: renamed from: ᩺ */
    public float f20776;

    /* JADX INFO: renamed from: ᩶ */
    public int f20773 = 0;

    /* JADX INFO: renamed from: ۫ */
    public float f20770 = Float.NaN;

    /* JADX INFO: renamed from: ۬ */
    public int f20771 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public LinkedHashMap f20774 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۗ */
    public int f20764 = 0;

    /* JADX INFO: renamed from: ۛ */
    public double[] f20766 = new double[18];

    /* JADX INFO: renamed from: ۤ */
    public double[] f20768 = new double[18];

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f20769, ((C1132) obj).f20769);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18286(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18287(C1132 c1132, boolean[] zArr, boolean z) {
        zArr[0] = zArr[0] | m18286(this.f20769, c1132.f20769);
        zArr[1] = zArr[1] | m18286(this.f20767, c1132.f20767) | z;
        zArr[2] = z | m18286(this.f20763, c1132.f20763) | zArr[2];
        zArr[3] = zArr[3] | m18286(this.f20772, c1132.f20772);
        zArr[4] = m18286(this.f20775, c1132.f20775) | zArr[4];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18289(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f20767;
        float f2 = this.f20763;
        float f3 = this.f20772;
        float f4 = this.f20775;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18285(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18288(C1890 c1890) {
        this.f20765 = C1265.m24178(c1890.f70845.f30618);
        C1295 c1295 = c1890.f70845;
        this.f20771 = c1295.f30616;
        this.f20770 = c1295.f30614;
        this.f20773 = c1295.f30615;
        float f = c1890.f70844.f53037;
        for (String str : c1890.f70841.keySet()) {
            C1531 c1531 = (C1531) c1890.f70841.get(str);
            if (c1531.m35411() != EnumC1986.STRING_TYPE) {
                this.f20774.put(str, c1531);
            }
        }
    }
}
