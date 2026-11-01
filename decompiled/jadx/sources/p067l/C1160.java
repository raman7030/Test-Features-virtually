package p067l;

/* JADX INFO: renamed from: l.ۜ֡ */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1160 extends AbstractC1860 {

    /* JADX INFO: renamed from: ֫ */
    public double f22681;

    /* JADX INFO: renamed from: ۧ */
    public double[] f22682;

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ۧ */
    public final double mo9251(double d) {
        return 0.0d;
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final void mo9248(double d, double[] dArr) {
        double[] dArr2 = this.f22682;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final void mo9249(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f22682;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final double mo9247(double d) {
        return this.f22682[0];
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ۧ */
    public final void mo9252(double d, double[] dArr) {
        for (int i = 0; i < this.f22682.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final double[] mo9250() {
        return new double[]{this.f22681};
    }
}
