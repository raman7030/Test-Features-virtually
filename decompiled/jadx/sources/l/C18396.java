package l;

/* JADX INFO: renamed from: l.ᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E1AS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18396 extends AbstractInterpolatorC5136 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f57112 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f57113;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f57114;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f57115;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f57116;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f57117;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f57118;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f57119;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f57120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f57121;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f57122;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f57123;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f57124;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m42827(float f) {
        float f2;
        float f3;
        float f4 = this.f57122;
        if (f <= f4) {
            f2 = this.f57118;
            f3 = this.f57123;
        } else {
            int i = this.f57120;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f57124;
            if (f >= f4) {
                if (i == 2) {
                    return this.f57114;
                }
                float f5 = f - f4;
                float f6 = this.f57116;
                if (f5 < f6) {
                    float f7 = this.f57119;
                    return f7 - ((f5 * f7) / f6);
                }
                return this.f57115;
            }
            f2 = this.f57123;
            f3 = this.f57119;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f57122;
        if (f <= f3) {
            float f4 = this.f57118;
            f2 = ((((this.f57123 - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f57120;
            if (i == 1) {
                f2 = this.f57121;
            } else {
                float f5 = f - f3;
                float f6 = this.f57124;
                if (f5 < f6) {
                    float f7 = this.f57121;
                    float f8 = this.f57123;
                    f2 = ((((this.f57119 - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f57114;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f57116;
                    if (f9 < f10) {
                        float f11 = this.f57114;
                        float f12 = this.f57119 * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f57115;
                    }
                }
            }
        }
        this.f57117 = f;
        return this.f57112 ? this.f57113 - f2 : this.f57113 + f2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42828(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f57113 = f;
        boolean z = f > f2;
        this.f57112 = z;
        if (z) {
            m42826(-f3, f - f2, f5, f6, f4);
        } else {
            m42826(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // l.AbstractInterpolatorC5136
    /* JADX INFO: renamed from: ֫ */
    public final float mo14697() {
        return this.f57112 ? -m42827(this.f57117) : m42827(this.f57117);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42826(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f57118 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f57120 = 2;
                this.f57118 = f;
                this.f57123 = fSqrt;
                this.f57119 = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f57122 = f8;
                this.f57124 = fSqrt / f3;
                this.f57121 = ((f + fSqrt) * f8) / 2.0f;
                this.f57114 = f2;
                this.f57115 = f2;
                return;
            }
            this.f57120 = 3;
            this.f57118 = f;
            this.f57123 = f4;
            this.f57119 = f4;
            float f9 = (f4 - f) / f3;
            this.f57122 = f9;
            float f10 = f4 / f3;
            this.f57116 = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f57124 = ((f2 - f11) - f12) / f4;
            this.f57121 = f11;
            this.f57114 = f2 - f12;
            this.f57115 = f2;
            return;
        }
        if (f7 >= f2) {
            this.f57120 = 1;
            this.f57118 = f;
            this.f57123 = 0.0f;
            this.f57121 = f2;
            this.f57122 = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f57120 = 2;
            this.f57118 = f;
            this.f57123 = f;
            this.f57119 = 0.0f;
            this.f57121 = f13;
            this.f57114 = f2;
            this.f57122 = f14;
            this.f57124 = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f57122 = f15;
        float f16 = fSqrt2 / f3;
        this.f57124 = f16;
        if (fSqrt2 < f4) {
            this.f57120 = 2;
            this.f57118 = f;
            this.f57123 = fSqrt2;
            this.f57119 = 0.0f;
            this.f57122 = f15;
            this.f57124 = f16;
            this.f57121 = ((f + fSqrt2) * f15) / 2.0f;
            this.f57114 = f2;
            return;
        }
        this.f57120 = 3;
        this.f57118 = f;
        this.f57123 = f4;
        this.f57119 = f4;
        float f17 = (f4 - f) / f3;
        this.f57122 = f17;
        float f18 = f4 / f3;
        this.f57116 = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f57124 = ((f2 - f19) - f20) / f4;
        this.f57121 = f19;
        this.f57114 = f2 - f20;
        this.f57115 = f2;
    }
}
