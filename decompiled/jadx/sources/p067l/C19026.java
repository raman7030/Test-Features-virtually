package p067l;

/* JADX INFO: renamed from: l.ܿᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78BU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19026 extends C8968 {

    /* JADX INFO: renamed from: ܳ */
    public C10309 f56723;

    /* JADX INFO: renamed from: ܿ */
    public double[] f56724;

    /* JADX INFO: renamed from: ᩳ */
    public double f56725;

    public C19026(C10309 c10309, double d) {
        super(c10309, d);
        this.f56724 = new double[8];
        this.f56723 = c10309;
    }

    @Override // p067l.C8968
    /* JADX INFO: renamed from: ᩳ */
    public final double mo20722() {
        return this.f56725;
    }

    @Override // p067l.C8968
    /* JADX INFO: renamed from: ֫ */
    public final void mo20716(double d) {
        this.f56725 = d;
        super.mo20716(d);
    }

    @Override // p067l.C8968
    /* JADX INFO: renamed from: ܿ */
    public final double[] mo20721() {
        double[] dArrMo20721;
        int i;
        double[] dArr;
        double[] dArrMo20722;
        int iM20720 = m20720();
        if (iM20720 == 0) {
            dArrMo20722 = super.mo20721();
        } else {
            if (this.f56723.m23927()) {
                dArrMo20721 = super.mo20721();
                i = 0;
            } else {
                dArrMo20721 = m20714(0).mo20721();
                i = 1;
            }
            int i2 = 0;
            while (true) {
                dArr = this.f56724;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArrMo20721[i2];
                i2++;
            }
            while (i < iM20720) {
                double[] dArrMo20723 = m20714(i).mo20721();
                for (int i3 = 0; i3 < dArr.length; i3++) {
                    dArr[i3] = dArr[i3] + dArrMo20723[i3];
                }
                i++;
            }
            dArrMo20722 = dArr;
        }
        this.f56725 = dArrMo20722[0];
        return dArrMo20722;
    }
}
