package p067l;

/* JADX INFO: renamed from: l.ۤᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12321 extends AbstractC19046 {

    /* JADX INFO: renamed from: ۡ */
    public double f34394;

    /* JADX INFO: renamed from: ܺ */
    public C10309 f34396;

    /* JADX INFO: renamed from: ᩷ */
    public C23720 f34397;

    /* JADX INFO: renamed from: ۖ */
    public double f34392 = 0.0d;

    /* JADX INFO: renamed from: ۢ */
    public double f34395 = 1.0d;

    /* JADX INFO: renamed from: ۜ */
    public double f34393 = 1.0E-5d;

    public C12321() {
        C10309 c10309 = new C10309("Time");
        this.f34396 = c10309;
        m55058(c10309);
        this.f56832.m23923(1.0E-5d, 1.0d, 1.0d);
        C23720 c23720 = new C23720();
        this.f34397 = c23720;
        m55058(c23720);
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f56833.m40212();
        int i = 0;
        double d = this.f56832.m40212()[0];
        double d2 = this.f34396.m40212()[0];
        C23720 c23720 = this.f34397;
        double dM52746 = c23720.m52746();
        double d3 = this.f34393;
        double dMax = Math.max(d3, d);
        double dMax2 = Math.max(d3, dM52746);
        if (d2 != this.f34392) {
            this.f34395 = Math.pow(dMax / dMax2, 1.0d / (((double) this.f80012.m21263()) * d2));
            this.f34392 = d2;
        }
        if (dMax != this.f34394) {
            this.f34395 = Math.pow(dMax / dMax2, 1.0d / (d2 * ((double) this.f80012.m21263())));
            this.f34394 = dMax;
        }
        double d4 = this.f34394;
        if (dMax2 < d4) {
            while (i < 8) {
                dMax2 *= this.f34395;
                double d5 = this.f34394;
                if (dMax2 > d5) {
                    this.f34395 = 1.0d;
                    dMax2 = d5;
                }
                dArrM40212[i] = dMax2;
                i++;
            }
        } else if (dMax2 > d4) {
            while (i < 8) {
                dMax2 *= this.f34395;
                double d6 = this.f34394;
                if (dMax2 < d6) {
                    this.f34395 = 1.0d;
                    dMax2 = d6;
                }
                dArrM40212[i] = dMax2;
                i++;
            }
        } else if (dMax2 == d4) {
            while (i < 8) {
                dArrM40212[i] = this.f34394;
                i++;
            }
        }
        c23720.m52745(dMax2);
    }
}
