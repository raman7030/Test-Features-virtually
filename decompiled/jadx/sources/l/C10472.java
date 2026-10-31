package l;

/* JADX INFO: renamed from: l.ۤᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C10472 extends AbstractC17548 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f31429;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8355 f31431;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22466 f31432;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f31427 = 0.0d;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f31430 = 1.0d;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f31428 = 1.0E-5d;

    public C10472() {
        C8355 c8355 = new C8355("Time");
        this.f31431 = c8355;
        m52649(c8355);
        this.f53642.m21953(1.0E-5d, 1.0d, 1.0d);
        C22466 c22466 = new C22466();
        this.f31432 = c22466;
        m52649(c22466);
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        double[] dArrM38021 = this.f53643.m38021();
        int i = 0;
        double d = this.f53642.m38021()[0];
        double d2 = this.f31431.m38021()[0];
        C22466 c22466 = this.f31432;
        double dM50405 = c22466.m50405();
        double d3 = this.f31428;
        double dMax = Math.max(d3, d);
        double dMax2 = Math.max(d3, dM50405);
        if (d2 != this.f31427) {
            this.f31430 = Math.pow(dMax / dMax2, 1.0d / (((double) this.f77261.m19315()) * d2));
            this.f31427 = d2;
        }
        if (dMax != this.f31429) {
            this.f31430 = Math.pow(dMax / dMax2, 1.0d / (d2 * ((double) this.f77261.m19315())));
            this.f31429 = dMax;
        }
        double d4 = this.f31429;
        if (dMax2 < d4) {
            while (i < 8) {
                dMax2 *= this.f31430;
                double d5 = this.f31429;
                if (dMax2 > d5) {
                    this.f31430 = 1.0d;
                    dMax2 = d5;
                }
                dArrM38021[i] = dMax2;
                i++;
            }
        } else if (dMax2 > d4) {
            while (i < 8) {
                dMax2 *= this.f31430;
                double d6 = this.f31429;
                if (dMax2 < d6) {
                    this.f31430 = 1.0d;
                    dMax2 = d6;
                }
                dArrM38021[i] = dMax2;
                i++;
            }
        } else if (dMax2 == d4) {
            while (i < 8) {
                dArrM38021[i] = this.f31429;
                i++;
            }
        }
        c22466.m50404(dMax2);
    }
}
