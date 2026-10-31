package l;

/* JADX INFO: renamed from: l.ۨᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8CH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11883 extends AbstractC17548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8355 f35427;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22466 f35429;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f35430;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f35432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f35433;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f35428 = 0.0d;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f35431 = 1.0d;

    public C11883() {
        C8355 c8355 = new C8355("Time");
        this.f35427 = c8355;
        m52649(c8355);
        C22466 c22466 = new C22466("Current");
        this.f35429 = c22466;
        m52649(c22466);
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        double[] dArrM38021 = this.f53643.m38021();
        int i = 0;
        double d = this.f53642.m38021()[0];
        C22466 c22466 = this.f35429;
        double dM50405 = c22466.m50405();
        if (d != this.f35432) {
            this.f35430 = dM50405;
            this.f35433 = 0.0d;
            this.f35432 = d;
        }
        if (dM50405 == this.f35432) {
            while (i < 8) {
                dArrM38021[i] = dM50405;
                i++;
            }
        } else {
            double d2 = this.f35427.m38021()[0];
            if (d2 != this.f35428) {
                this.f35431 = d2 < this.f77261.m19314() ? 1.0d : this.f77261.m19313() / d2;
                this.f35428 = d2;
            }
            while (i < 8) {
                double d3 = this.f35433;
                if (d3 < 1.0d) {
                    double d4 = this.f35430;
                    double d5 = ((this.f35432 - d4) * d3) + d4;
                    this.f35433 = d3 + this.f35431;
                    dM50405 = d5;
                } else {
                    dM50405 = this.f35432;
                }
                dArrM38021[i] = dM50405;
                i++;
            }
        }
        c22466.m50404(dM50405);
    }
}
