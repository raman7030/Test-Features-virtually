package p067l;

/* JADX INFO: renamed from: l.᩷֡ */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1860 {
    /* JADX INFO: renamed from: ֫ */
    public abstract double mo9247(double d);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9248(double d, double[] dArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9249(double d, float[] fArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract double[] mo9250();

    /* JADX INFO: renamed from: ۧ */
    public abstract double mo9251(double d);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9252(double d, double[] dArr);

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC1860 m49310(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C0950(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            C1160 c1160 = new C1160();
            c1160.f22681 = d;
            c1160.f22682 = dArr3;
            return c1160;
        }
        return new C1615(dArr, dArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC1860 m49311(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C2000(iArr, dArr, dArr2);
    }
}
