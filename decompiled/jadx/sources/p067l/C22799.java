package p067l;

/* JADX INFO: renamed from: l.᩸ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C22799 {

    /* JADX INFO: renamed from: ֫ */
    public final int f71844;

    /* JADX INFO: renamed from: ۧ */
    public boolean f71845;

    /* JADX INFO: renamed from: ܳ */
    public float f71846;

    /* JADX INFO: renamed from: ܽ */
    public float f71847;

    /* JADX INFO: renamed from: ܿ */
    public float f71848;

    /* JADX INFO: renamed from: ᩳ */
    public float f71849;

    public C22799(float f, float f2, float f3, float f4, int i, float f5) {
        this.f71848 = f;
        this.f71846 = f2;
        this.f71847 = f3;
        this.f71849 = f4;
        int i2 = f <= ((float) i) / 2.0f ? -1 : 1;
        if (i2 < 0 && f3 > f5) {
            this.f71844 = 1;
        } else if (i2 > 0 && f3 < (-f5)) {
            this.f71844 = -1;
        } else {
            this.f71844 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51002(int i, float f, int i2) {
        if (this.f71845) {
            return true;
        }
        this.f71847 = (this.f71844 * i * 6.0f * f) + this.f71847;
        float fExp = (float) Math.exp((-3.5f) * f);
        float f2 = this.f71847 * fExp;
        this.f71847 = f2;
        float f3 = this.f71849 * fExp;
        this.f71849 = f3;
        float f4 = (f2 * f) + this.f71848;
        this.f71848 = f4;
        float f5 = (f3 * f) + this.f71846;
        this.f71846 = f5;
        if (f4 <= 0.0f || f4 >= i) {
            this.f71848 = f4 <= 0.0f ? 0.0f : i;
            this.f71847 = 0.0f;
            this.f71849 = 0.0f;
            this.f71845 = true;
        }
        if (f5 <= 0.0f) {
            this.f71846 = 0.0f;
            this.f71849 = 0.0f;
        } else {
            float f6 = i2;
            if (f5 >= f6) {
                this.f71846 = f6;
                this.f71849 = 0.0f;
            }
        }
        return this.f71845;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51001(int i) {
        this.f71848 = this.f71844 < 0 ? 0.0f : i;
        this.f71847 = 0.0f;
        this.f71849 = 0.0f;
        this.f71845 = true;
    }
}
