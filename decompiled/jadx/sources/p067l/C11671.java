package p067l;

/* JADX INFO: renamed from: l.ۢ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11671 extends AbstractC25081 {

    /* JADX INFO: renamed from: ۖ */
    public C10309 f32554;

    /* JADX INFO: renamed from: ۘ */
    public double f32555;

    /* JADX INFO: renamed from: ۜ */
    public double f32556;

    /* JADX INFO: renamed from: ۡ */
    public double f32557;

    /* JADX INFO: renamed from: ۢ */
    public C17013 f32558;

    /* JADX INFO: renamed from: ܳ */
    public C10309 f32559;

    /* JADX INFO: renamed from: ܺ */
    public boolean f32560;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f32561;

    /* JADX INFO: renamed from: ᩵ */
    public double f32562;

    /* JADX INFO: renamed from: ᩷ */
    public C20368 f32563;

    /* JADX INFO: renamed from: ᩻ */
    public double f32564;

    public C11671() {
        C20368 c20368 = new C20368();
        this.f32563 = c20368;
        m55058(c20368);
        C10309 c10309 = new C10309(1, "Amplitude", 1.0d);
        this.f32559 = c10309;
        m55058(c10309);
        C10309 c103010 = new C10309(1, "Rate", 1.0d);
        this.f32554 = c103010;
        m55058(c103010);
        C17013 c17013 = new C17013(0);
        this.f32558 = c17013;
        m55058(c17013);
        this.f32561 = true;
        this.f32564 = 1.0d;
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        C20368 c20368;
        double[] dArrM40212 = this.f32559.m40212();
        double[] dArrM40213 = this.f32554.m40212();
        double[] dArrM40214 = this.f32558.m40212();
        int i = 0;
        while (true) {
            c20368 = this.f32563;
            if (i >= 8) {
                break;
            }
            if (this.f32557 >= 1.0d) {
                while (true) {
                    double d = this.f32557;
                    if (d >= 1.0d) {
                        this.f32555 = this.f32562;
                        this.f32557 = d - 1.0d;
                        this.f32564 = m26826();
                    }
                }
            } else if (i == 0 && (this.f32561 || !c20368.m45974())) {
                double d2 = this.f32556;
                this.f32562 = d2;
                this.f32555 = d2;
                this.f32557 = 0.0d;
                this.f32564 = m26826();
            }
            double d3 = this.f32562;
            double d4 = this.f32555;
            double d5 = this.f32557;
            double d6 = ((d3 - d4) * d5) + d4;
            this.f32556 = d6;
            dArrM40214[i] = d6 * dArrM40212[i];
            this.f32557 = (this.f32564 * dArrM40213[i]) + d5;
            i++;
        }
        if (this.f32560) {
            this.f32560 = false;
            c20368.getClass();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private double m26826() {
        C20368 c20368 = this.f32563;
        c20368.m45976();
        if (c20368.m45978()) {
            this.f32561 = false;
            this.f32562 = c20368.m45970(this.f80012.m21261());
            return c20368.m45975() * this.f80012.m21261();
        }
        this.f32561 = true;
        this.f32560 = true;
        this.f32557 = 0.0d;
        return 0.0d;
    }
}
