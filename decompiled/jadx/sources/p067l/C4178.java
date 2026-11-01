package p067l;

/* JADX INFO: renamed from: l.֫ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6W6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4178 {

    /* JADX INFO: renamed from: ۜ */
    public static final double f9199 = Math.sqrt(0.85d);

    /* JADX INFO: renamed from: ֫ */
    public boolean f9200;

    /* JADX INFO: renamed from: ۧ */
    public float f9201;

    /* JADX INFO: renamed from: ܳ */
    public float f9202;

    /* JADX INFO: renamed from: ܽ */
    public float f9203;

    /* JADX INFO: renamed from: ܿ */
    public float f9204;

    /* JADX INFO: renamed from: ᩳ */
    public float f9205;

    /* JADX INFO: renamed from: ᩻ */
    public float f9206;

    /* JADX INFO: renamed from: ֫ */
    public final void m8458(float f, float f2) {
        this.f9201 += f;
        this.f9203 += f2;
        this.f9200 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8457(float f) {
        float fMax = Math.max(f * 60.0f, 0.001f);
        if (this.f9200) {
            this.f9205 = this.f9201 / fMax;
            this.f9204 = this.f9203 / fMax;
            this.f9203 = 0.0f;
            this.f9201 = 0.0f;
            this.f9200 = false;
            this.f9206 = 0.0f;
            this.f9202 = 0.0f;
            return;
        }
        double d = f9199;
        double dPow = Math.pow(d, fMax);
        float f2 = (float) (((1.0d - dPow) * d) / (1.0d - d));
        float f3 = this.f9205;
        this.f9202 = f3 * f2;
        float f4 = this.f9204;
        this.f9206 = f2 * f4;
        this.f9205 = (float) (((double) f3) * dPow);
        this.f9204 = (float) (((double) f4) * dPow);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8459() {
        return this.f9200 || Math.hypot((double) this.f9205, (double) this.f9204) >= 0.004999999888241291d;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8460() {
        this.f9200 = false;
        this.f9206 = 0.0f;
        this.f9202 = 0.0f;
        this.f9204 = 0.0f;
        this.f9205 = 0.0f;
        this.f9203 = 0.0f;
        this.f9201 = 0.0f;
    }
}
