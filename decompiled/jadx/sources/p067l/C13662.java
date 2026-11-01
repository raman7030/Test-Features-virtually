package p067l;

/* JADX INFO: renamed from: l.ۨᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8CH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13662 extends AbstractC19046 {

    /* JADX INFO: renamed from: ۖ */
    public C10309 f38437;

    /* JADX INFO: renamed from: ۜ */
    public C23720 f38439;

    /* JADX INFO: renamed from: ۡ */
    public double f38440;

    /* JADX INFO: renamed from: ܺ */
    public double f38442;

    /* JADX INFO: renamed from: ᩷ */
    public double f38443;

    /* JADX INFO: renamed from: ۘ */
    public double f38438 = 0.0d;

    /* JADX INFO: renamed from: ۢ */
    public double f38441 = 1.0d;

    public C13662() {
        C10309 c10309 = new C10309("Time");
        this.f38437 = c10309;
        m55058(c10309);
        C23720 c23720 = new C23720("Current");
        this.f38439 = c23720;
        m55058(c23720);
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f56833.m40212();
        int i = 0;
        double d = this.f56832.m40212()[0];
        C23720 c23720 = this.f38439;
        double dM52746 = c23720.m52746();
        if (d != this.f38442) {
            this.f38440 = dM52746;
            this.f38443 = 0.0d;
            this.f38442 = d;
        }
        if (dM52746 == this.f38442) {
            while (i < 8) {
                dArrM40212[i] = dM52746;
                i++;
            }
        } else {
            double d2 = this.f38437.m40212()[0];
            if (d2 != this.f38438) {
                this.f38441 = d2 < this.f80012.m21262() ? 1.0d : this.f80012.m21261() / d2;
                this.f38438 = d2;
            }
            while (i < 8) {
                double d3 = this.f38443;
                if (d3 < 1.0d) {
                    double d4 = this.f38440;
                    double d5 = ((this.f38442 - d4) * d3) + d4;
                    this.f38443 = d3 + this.f38441;
                    dM52746 = d5;
                } else {
                    dM52746 = this.f38442;
                }
                dArrM40212[i] = dM52746;
                i++;
            }
        }
        c23720.m52745(dM52746);
    }
}
