package l;

/* JADX INFO: renamed from: l.ۢ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9788 extends AbstractC23898 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8355 f29602;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f29603;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f29604;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f29605;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15409 f29606;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f29607;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f29608;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f29609;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f29610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18939 f29611;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f29612;

    public C9788() {
        C18939 c18939 = new C18939();
        this.f29611 = c18939;
        m52649(c18939);
        C8355 c8355 = new C8355(1, "Amplitude", 1.0d);
        this.f29607 = c8355;
        m52649(c8355);
        C8355 c8356 = new C8355(1, "Rate", 1.0d);
        this.f29602 = c8356;
        m52649(c8356);
        C15409 c15409 = new C15409(0);
        this.f29606 = c15409;
        m52649(c15409);
        this.f29609 = true;
        this.f29612 = 1.0d;
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        C18939 c18939;
        double[] dArrM38021 = this.f29607.m38021();
        double[] dArrM38022 = this.f29602.m38021();
        double[] dArrM38023 = this.f29606.m38021();
        int i = 0;
        while (true) {
            c18939 = this.f29611;
            if (i >= 8) {
                break;
            }
            if (this.f29605 >= 1.0d) {
                while (true) {
                    double d = this.f29605;
                    if (d >= 1.0d) {
                        this.f29603 = this.f29610;
                        this.f29605 = d - 1.0d;
                        this.f29612 = m24811();
                    }
                }
            } else if (i == 0 && (this.f29609 || !c18939.m43708())) {
                double d2 = this.f29604;
                this.f29610 = d2;
                this.f29603 = d2;
                this.f29605 = 0.0d;
                this.f29612 = m24811();
            }
            double d3 = this.f29610;
            double d4 = this.f29603;
            double d5 = this.f29605;
            double d6 = ((d3 - d4) * d5) + d4;
            this.f29604 = d6;
            dArrM38023[i] = d6 * dArrM38021[i];
            this.f29605 = (this.f29612 * dArrM38022[i]) + d5;
            i++;
        }
        if (this.f29608) {
            this.f29608 = false;
            c18939.getClass();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private double m24811() {
        C18939 c18939 = this.f29611;
        c18939.m43710();
        if (c18939.m43712()) {
            this.f29609 = false;
            this.f29610 = c18939.m43704(this.f77261.m19313());
            return c18939.m43709() * this.f77261.m19313();
        }
        this.f29609 = true;
        this.f29608 = true;
        this.f29605 = 0.0d;
        return 0.0d;
    }
}
