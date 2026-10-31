package l;

/* JADX INFO: renamed from: l.ۛᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8CV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6238 extends AbstractC17548 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f19105;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f19106;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f19107;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f19108;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f19109;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8355 f19110;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public double f19111;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f19112;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f19113;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f19114;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8355 f19115;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f19116;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8355 f19117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f19118;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f19119;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f19120;

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        double d = this.f19117.m38021()[0];
        double d2 = this.f19110.m38021()[0];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        if (d2 < 1.0E-5d) {
            d2 = 1.0E-5d;
        }
        if (d != this.f19109 || d2 != this.f19106) {
            this.f19109 = d;
            this.f19106 = d2;
            double dM19313 = this.f77261.m19313() * d;
            if (dM19313 >= 0.499d) {
                dM19313 = 0.499d;
            }
            double d3 = dM19313 * 6.283185307179586d;
            this.f19105 = d3;
            this.f19116 = Math.cos(d3);
            double dSin = Math.sin(this.f19105) / (d2 * 2.0d);
            double d4 = 1.0d / (dSin + 1.0d);
            double d5 = this.f19116;
            double d6 = 1.0d - d5;
            double d7 = 0.5d * d6 * d4;
            this.f19118 = d7;
            this.f19113 = d6 * d4;
            this.f19112 = d7;
            this.f19107 = d5 * (-2.0d) * d4;
            this.f19108 = (1.0d - dSin) * d4;
        }
        double[] dArrM38021 = this.f53642.m38021();
        double[] dArrM38022 = this.f19115.m38021();
        double[] dArrM38023 = this.f53643.m38021();
        double d8 = this.f19111;
        double d9 = this.f19114;
        double d10 = this.f19119;
        double d11 = this.f19120;
        double d12 = this.f19118;
        double d13 = this.f19113;
        double d14 = this.f19112;
        double d15 = this.f19107;
        double d16 = d10;
        double d17 = this.f19108;
        int i = 0;
        double d18 = d9;
        double d19 = d11;
        double d20 = d8;
        while (i < 8) {
            double d21 = dArrM38021[i];
            d19 = (((d18 * d14) + ((d13 * d20) + (d12 * d21))) - (d15 * d16)) - (d19 * d17);
            dArrM38023[i] = dArrM38022[i] * d19;
            int i2 = i + 1;
            double d22 = dArrM38021[i2];
            d16 = (((d20 * d14) + ((d13 * d21) + (d12 * d22))) - (d15 * d19)) - (d16 * d17);
            dArrM38023[i2] = dArrM38022[i2] * d16;
            i += 2;
            d18 = d21;
            d20 = d22;
        }
        this.f19111 = d20;
        this.f19114 = d18;
        this.f19119 = d16 + 1.0E-26d;
        this.f19120 = d19 - 1.0E-26d;
    }
}
