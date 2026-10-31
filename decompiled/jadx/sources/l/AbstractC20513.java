package l;

/* JADX INFO: renamed from: l.᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20513 {
    /* JADX INFO: renamed from: ֫ */
    public abstract double mo7168(double d);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7169(double d, double[] dArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7170(double d, float[] fArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract double[] mo7171();

    /* JADX INFO: renamed from: ۧ */
    public abstract double mo7172(double d);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7173(double d, double[] dArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC20513 m46987(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C2168(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            C6401 c6401 = new C6401();
            c6401.f19809 = d;
            c6401.f19810 = dArr3;
            return c6401;
        }
        return new C15572(dArr, dArr2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC20513 m46988(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C23334(iArr, dArr, dArr2);
    }
}
