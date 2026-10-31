package l;

/* JADX INFO: renamed from: l.ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6401 extends AbstractC20513 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f19809;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double[] f19810;

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ۧ */
    public final double mo7172(double d) {
        return 0.0d;
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final void mo7169(double d, double[] dArr) {
        double[] dArr2 = this.f19810;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final void mo7170(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f19810;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final double mo7168(double d) {
        return this.f19810[0];
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ۧ */
    public final void mo7173(double d, double[] dArr) {
        for (int i = 0; i < this.f19810.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final double[] mo7171() {
        return new double[]{this.f19809};
    }
}
