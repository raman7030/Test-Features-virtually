package p067l;

/* JADX INFO: renamed from: l.ۛᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8CV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8297 extends AbstractC19046 {

    /* JADX INFO: renamed from: ֡ */
    public double f21970;

    /* JADX INFO: renamed from: ֨ */
    public double f21971;

    /* JADX INFO: renamed from: ۖ */
    public double f21972;

    /* JADX INFO: renamed from: ۘ */
    public double f21973;

    /* JADX INFO: renamed from: ۚ */
    public double f21974;

    /* JADX INFO: renamed from: ۜ */
    public C10309 f21975;

    /* JADX INFO: renamed from: ۠ */
    public double f21976;

    /* JADX INFO: renamed from: ۡ */
    public double f21977;

    /* JADX INFO: renamed from: ۢ */
    public double f21978;

    /* JADX INFO: renamed from: ܶ */
    public double f21979;

    /* JADX INFO: renamed from: ܺ */
    public C10309 f21980;

    /* JADX INFO: renamed from: ᩴ */
    public double f21981;

    /* JADX INFO: renamed from: ᩵ */
    public C10309 f21982;

    /* JADX INFO: renamed from: ᩷ */
    public double f21983;

    /* JADX INFO: renamed from: ᩸ */
    public double f21984;

    /* JADX INFO: renamed from: ᩹ */
    public double f21985;

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double d = this.f21982.m40212()[0];
        double d2 = this.f21975.m40212()[0];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        if (d2 < 1.0E-5d) {
            d2 = 1.0E-5d;
        }
        if (d != this.f21974 || d2 != this.f21971) {
            this.f21974 = d;
            this.f21971 = d2;
            double dM21261 = this.f80012.m21261() * d;
            if (dM21261 >= 0.499d) {
                dM21261 = 0.499d;
            }
            double d3 = dM21261 * 6.283185307179586d;
            this.f21970 = d3;
            this.f21981 = Math.cos(d3);
            double dSin = Math.sin(this.f21970) / (d2 * 2.0d);
            double d4 = 1.0d / (dSin + 1.0d);
            double d5 = this.f21981;
            double d6 = 1.0d - d5;
            double d7 = 0.5d * d6 * d4;
            this.f21983 = d7;
            this.f21978 = d6 * d4;
            this.f21977 = d7;
            this.f21972 = d5 * (-2.0d) * d4;
            this.f21973 = (1.0d - dSin) * d4;
        }
        double[] dArrM40212 = this.f56832.m40212();
        double[] dArrM40213 = this.f21980.m40212();
        double[] dArrM40214 = this.f56833.m40212();
        double d8 = this.f21976;
        double d9 = this.f21979;
        double d10 = this.f21984;
        double d11 = this.f21985;
        double d12 = this.f21983;
        double d13 = this.f21978;
        double d14 = this.f21977;
        double d15 = this.f21972;
        double d16 = d10;
        double d17 = this.f21973;
        int i = 0;
        double d18 = d9;
        double d19 = d11;
        double d20 = d8;
        while (i < 8) {
            double d21 = dArrM40212[i];
            d19 = (((d18 * d14) + ((d13 * d20) + (d12 * d21))) - (d15 * d16)) - (d19 * d17);
            dArrM40214[i] = dArrM40213[i] * d19;
            int i2 = i + 1;
            double d22 = dArrM40212[i2];
            d16 = (((d20 * d14) + ((d13 * d21) + (d12 * d22))) - (d15 * d19)) - (d16 * d17);
            dArrM40214[i2] = dArrM40213[i2] * d16;
            i += 2;
            d18 = d21;
            d20 = d22;
        }
        this.f21976 = d20;
        this.f21979 = d18;
        this.f21984 = d16 + 1.0E-26d;
        this.f21985 = d19 - 1.0E-26d;
    }
}
