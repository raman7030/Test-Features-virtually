package p067l;

/* JADX INFO: renamed from: l.᩹ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB34 */
/* JADX INFO: loaded from: classes.dex */
public final class C23658 {

    /* JADX INFO: renamed from: ֫ */
    public double f75282;

    /* JADX INFO: renamed from: ۜ */
    public double f75283;

    /* JADX INFO: renamed from: ۢ */
    public double f75284;

    /* JADX INFO: renamed from: ۧ */
    public double f75285;

    /* JADX INFO: renamed from: ܳ */
    public boolean f75286;

    /* JADX INFO: renamed from: ܽ */
    public double f75287;

    /* JADX INFO: renamed from: ܿ */
    public double f75288;

    /* JADX INFO: renamed from: ᩳ */
    public double f75289;

    /* JADX INFO: renamed from: ᩷ */
    public double f75290;

    /* JADX INFO: renamed from: ᩻ */
    public final C20306 f75291;

    public C23658() {
        this.f75283 = Math.sqrt(1500.0d);
        this.f75285 = 0.5d;
        this.f75286 = false;
        this.f75287 = Double.MAX_VALUE;
        this.f75291 = new C20306();
    }

    public C23658(float f) {
        this.f75283 = Math.sqrt(1500.0d);
        this.f75285 = 0.5d;
        this.f75286 = false;
        this.f75291 = new C20306();
        this.f75287 = f;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52607(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f75283 = Math.sqrt(f);
        this.f75286 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52604(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f75285 = f;
        this.f75286 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52606(float f) {
        this.f75287 = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m52601() {
        return (float) this.f75287;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52605(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f75284 && ((double) Math.abs(f - ((float) this.f75287))) < this.f75290;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20306 m52602(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f75286) {
            if (this.f75287 == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f75285;
            if (d3 > 1.0d) {
                double d4 = this.f75283;
                this.f75288 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f75285;
                double d6 = this.f75283;
                this.f75289 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f75282 = Math.sqrt(1.0d - (d3 * d3)) * this.f75283;
            }
            this.f75286 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f75287;
        double d9 = this.f75285;
        if (d9 > 1.0d) {
            double d10 = this.f75289;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f75288);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f75288 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f75289;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f75288;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.f75283;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f75283) * d7) * d17;
            double d18 = -this.f75283;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.f75282;
            double d20 = this.f75283;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.f75282 * d7) * d21) + (Math.cos(this.f75282 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f75283;
            double d23 = this.f75285;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f75282;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f75282;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f75287);
        C20306 c20306 = this.f75291;
        c20306.f62736 = f;
        c20306.f62737 = (float) dCos;
        return c20306;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52603(double d) {
        double dAbs = Math.abs(d);
        this.f75290 = dAbs;
        this.f75284 = dAbs * 62.5d;
    }
}
