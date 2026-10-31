package l;

/* JADX INFO: renamed from: l.᩸ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21497 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69147;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f69148;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f69149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f69150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f69151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f69152;

    public C21497(float f, float f2, float f3, float f4, int i, float f5) {
        this.f69151 = f;
        this.f69149 = f2;
        this.f69150 = f3;
        this.f69152 = f4;
        int i2 = f <= ((float) i) / 2.0f ? -1 : 1;
        if (i2 < 0 && f3 > f5) {
            this.f69147 = 1;
        } else if (i2 > 0 && f3 < (-f5)) {
            this.f69147 = -1;
        } else {
            this.f69147 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48665(int i, float f, int i2) {
        if (this.f69148) {
            return true;
        }
        this.f69150 = (this.f69147 * i * 6.0f * f) + this.f69150;
        float fExp = (float) Math.exp((-3.5f) * f);
        float f2 = this.f69150 * fExp;
        this.f69150 = f2;
        float f3 = this.f69152 * fExp;
        this.f69152 = f3;
        float f4 = (f2 * f) + this.f69151;
        this.f69151 = f4;
        float f5 = (f3 * f) + this.f69149;
        this.f69149 = f5;
        if (f4 <= 0.0f || f4 >= i) {
            this.f69151 = f4 <= 0.0f ? 0.0f : i;
            this.f69150 = 0.0f;
            this.f69152 = 0.0f;
            this.f69148 = true;
        }
        if (f5 <= 0.0f) {
            this.f69149 = 0.0f;
            this.f69152 = 0.0f;
        } else {
            float f6 = i2;
            if (f5 >= f6) {
                this.f69149 = f6;
                this.f69152 = 0.0f;
            }
        }
        return this.f69148;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48664(int i) {
        this.f69151 = this.f69147 < 0 ? 0.0f : i;
        this.f69150 = 0.0f;
        this.f69152 = 0.0f;
        this.f69148 = true;
    }
}
