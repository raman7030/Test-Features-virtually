package l;

/* JADX INFO: renamed from: l.᩹ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB34 */
/* JADX INFO: loaded from: classes.dex */
public final class C22401 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f72556;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f72557;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f72558;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f72559;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f72560;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f72561;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f72562;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f72563;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f72564;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18874 f72565;

    public C22401() {
        this.f72557 = Math.sqrt(1500.0d);
        this.f72559 = 0.5d;
        this.f72560 = false;
        this.f72561 = Double.MAX_VALUE;
        this.f72565 = new C18874();
    }

    public C22401(float f) {
        this.f72557 = Math.sqrt(1500.0d);
        this.f72559 = 0.5d;
        this.f72560 = false;
        this.f72565 = new C18874();
        this.f72561 = f;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50267(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f72557 = Math.sqrt(f);
        this.f72560 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50264(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f72559 = f;
        this.f72560 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50266(float f) {
        this.f72561 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m50261() {
        return (float) this.f72561;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50265(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f72558 && ((double) Math.abs(f - ((float) this.f72561))) < this.f72564;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18874 m50262(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f72560) {
            if (this.f72561 == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f72559;
            if (d3 > 1.0d) {
                double d4 = this.f72557;
                this.f72562 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f72559;
                double d6 = this.f72557;
                this.f72563 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f72556 = Math.sqrt(1.0d - (d3 * d3)) * this.f72557;
            }
            this.f72560 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f72561;
        double d9 = this.f72559;
        if (d9 > 1.0d) {
            double d10 = this.f72563;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f72562);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f72562 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f72563;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f72562;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.f72557;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f72557) * d7) * d17;
            double d18 = -this.f72557;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.f72556;
            double d20 = this.f72557;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.f72556 * d7) * d21) + (Math.cos(this.f72556 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f72557;
            double d23 = this.f72559;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f72556;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f72556;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f72561);
        C18874 c18874 = this.f72565;
        c18874.f59507 = f;
        c18874.f59508 = (float) dCos;
        return c18874;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50263(double d) {
        double dAbs = Math.abs(d);
        this.f72564 = dAbs;
        this.f72558 = dAbs * 62.5d;
    }
}
