package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B19H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5841 implements Comparable {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static String[] f17910 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f17911;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8518 f17913;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f17915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f17917;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f17920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f17923;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f17924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17921 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f17918 = Float.NaN;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17919 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f17922 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f17912 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public double[] f17914 = new double[18];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public double[] f17916 = new double[18];

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f17917, ((C5841) obj).f17917);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16361(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16362(C5841 c5841, boolean[] zArr, boolean z) {
        zArr[0] = zArr[0] | m16361(this.f17917, c5841.f17917);
        zArr[1] = zArr[1] | m16361(this.f17915, c5841.f17915) | z;
        zArr[2] = z | m16361(this.f17911, c5841.f17911) | zArr[2];
        zArr[3] = zArr[3] | m16361(this.f17920, c5841.f17920);
        zArr[4] = m16361(this.f17923, c5841.f17923) | zArr[4];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16364(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f17915;
        float f2 = this.f17911;
        float f3 = this.f17920;
        float f4 = this.f17923;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16360(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16363(C21135 c21135) {
        this.f17913 = C8518.m22210(c21135.f68163.f27678);
        C9140 c9140 = c21135.f68163;
        this.f17919 = c9140.f27676;
        this.f17918 = c9140.f27674;
        this.f17921 = c9140.f27675;
        float f = c21135.f68162.f49871;
        for (String str : c21135.f68159.keySet()) {
            C13888 c13888 = (C13888) c21135.f68159.get(str);
            if (c13888.m33292() != EnumC23061.STRING_TYPE) {
                this.f17922.put(str, c13888);
            }
        }
    }
}
