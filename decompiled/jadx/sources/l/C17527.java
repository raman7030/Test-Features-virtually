package l;

/* JADX INFO: renamed from: l.ܿᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78BU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17527 extends C6944 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f53532;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double[] f53533;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f53534;

    public C17527(C8355 c8355, double d) {
        super(c8355, d);
        this.f53533 = new double[8];
        this.f53532 = c8355;
    }

    @Override // l.C6944
    /* JADX INFO: renamed from: ᩳ */
    public final double mo18768() {
        return this.f53534;
    }

    @Override // l.C6944
    /* JADX INFO: renamed from: ֫ */
    public final void mo18762(double d) {
        this.f53534 = d;
        super.mo18762(d);
    }

    @Override // l.C6944
    /* JADX INFO: renamed from: ܿ */
    public final double[] mo18767() {
        double[] dArrMo18767;
        int i;
        double[] dArr;
        double[] dArrMo18768;
        int iM18766 = m18766();
        if (iM18766 == 0) {
            dArrMo18768 = super.mo18767();
        } else {
            if (this.f53532.m21957()) {
                dArrMo18767 = super.mo18767();
                i = 0;
            } else {
                dArrMo18767 = m18760(0).mo18767();
                i = 1;
            }
            int i2 = 0;
            while (true) {
                dArr = this.f53533;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArrMo18767[i2];
                i2++;
            }
            while (i < iM18766) {
                double[] dArrMo18769 = m18760(i).mo18767();
                for (int i3 = 0; i3 < dArr.length; i3++) {
                    dArr[i3] = dArr[i3] + dArrMo18769[i3];
                }
                i++;
            }
            dArrMo18768 = dArr;
        }
        this.f53534 = dArrMo18768[0];
        return dArrMo18768;
    }
}
