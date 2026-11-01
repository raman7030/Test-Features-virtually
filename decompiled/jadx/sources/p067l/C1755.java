package p067l;

/* JADX INFO: renamed from: l.ᩴ֡ */
/* JADX INFO: compiled from: E1AS */
/* JADX INFO: loaded from: classes5.dex */
public final class C1755 extends AbstractInterpolatorC1097 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f60332 = false;

    /* JADX INFO: renamed from: ۖ */
    public float f60333;

    /* JADX INFO: renamed from: ۜ */
    public float f60334;

    /* JADX INFO: renamed from: ۡ */
    public float f60335;

    /* JADX INFO: renamed from: ۢ */
    public float f60336;

    /* JADX INFO: renamed from: ۧ */
    public float f60337;

    /* JADX INFO: renamed from: ܳ */
    public float f60338;

    /* JADX INFO: renamed from: ܺ */
    public float f60339;

    /* JADX INFO: renamed from: ܽ */
    public int f60340;

    /* JADX INFO: renamed from: ܿ */
    public float f60341;

    /* JADX INFO: renamed from: ᩳ */
    public float f60342;

    /* JADX INFO: renamed from: ᩷ */
    public float f60343;

    /* JADX INFO: renamed from: ᩻ */
    public float f60344;

    /* JADX INFO: renamed from: ֫ */
    public final float m45099(float f) {
        float f2;
        float f3;
        float f4 = this.f60342;
        if (f <= f4) {
            f2 = this.f60338;
            f3 = this.f60343;
        } else {
            int i = this.f60340;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f60344;
            if (f >= f4) {
                if (i == 2) {
                    return this.f60334;
                }
                float f5 = f - f4;
                float f6 = this.f60336;
                if (f5 < f6) {
                    float f7 = this.f60339;
                    return f7 - ((f5 * f7) / f6);
                }
                return this.f60335;
            }
            f2 = this.f60343;
            f3 = this.f60339;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f60342;
        if (f <= f3) {
            float f4 = this.f60338;
            f2 = ((((this.f60343 - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f60340;
            if (i == 1) {
                f2 = this.f60341;
            } else {
                float f5 = f - f3;
                float f6 = this.f60344;
                if (f5 < f6) {
                    float f7 = this.f60341;
                    float f8 = this.f60343;
                    f2 = ((((this.f60339 - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f60334;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f60336;
                    if (f9 < f10) {
                        float f11 = this.f60334;
                        float f12 = this.f60339 * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f60335;
                    }
                }
            }
        }
        this.f60337 = f;
        return this.f60332 ? this.f60333 - f2 : this.f60333 + f2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45100(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f60333 = f;
        boolean z = f > f2;
        this.f60332 = z;
        if (z) {
            m45098(-f3, f - f2, f5, f6, f4);
        } else {
            m45098(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // p067l.AbstractInterpolatorC1097
    /* JADX INFO: renamed from: ֫ */
    public final float mo16605() {
        return this.f60332 ? -m45099(this.f60337) : m45099(this.f60337);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45098(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f60338 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f60340 = 2;
                this.f60338 = f;
                this.f60343 = fSqrt;
                this.f60339 = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f60342 = f8;
                this.f60344 = fSqrt / f3;
                this.f60341 = ((f + fSqrt) * f8) / 2.0f;
                this.f60334 = f2;
                this.f60335 = f2;
                return;
            }
            this.f60340 = 3;
            this.f60338 = f;
            this.f60343 = f4;
            this.f60339 = f4;
            float f9 = (f4 - f) / f3;
            this.f60342 = f9;
            float f10 = f4 / f3;
            this.f60336 = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f60344 = ((f2 - f11) - f12) / f4;
            this.f60341 = f11;
            this.f60334 = f2 - f12;
            this.f60335 = f2;
            return;
        }
        if (f7 >= f2) {
            this.f60340 = 1;
            this.f60338 = f;
            this.f60343 = 0.0f;
            this.f60341 = f2;
            this.f60342 = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f60340 = 2;
            this.f60338 = f;
            this.f60343 = f;
            this.f60339 = 0.0f;
            this.f60341 = f13;
            this.f60334 = f2;
            this.f60342 = f14;
            this.f60344 = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f60342 = f15;
        float f16 = fSqrt2 / f3;
        this.f60344 = f16;
        if (fSqrt2 < f4) {
            this.f60340 = 2;
            this.f60338 = f;
            this.f60343 = fSqrt2;
            this.f60339 = 0.0f;
            this.f60342 = f15;
            this.f60344 = f16;
            this.f60341 = ((f + fSqrt2) * f15) / 2.0f;
            this.f60334 = f2;
            return;
        }
        this.f60340 = 3;
        this.f60338 = f;
        this.f60343 = f4;
        this.f60339 = f4;
        float f17 = (f4 - f) / f3;
        this.f60342 = f17;
        float f18 = f4 / f3;
        this.f60336 = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f60344 = ((f2 - f19) - f20) / f4;
        this.f60341 = f19;
        this.f60334 = f2 - f20;
        this.f60335 = f2;
    }
}
