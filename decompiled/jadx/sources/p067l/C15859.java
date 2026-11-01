package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15859 {

    /* JADX INFO: renamed from: ֫ */
    public float f45934;

    /* JADX INFO: renamed from: ۧ */
    public float f45935;

    /* JADX INFO: renamed from: ܽ */
    public boolean f45936 = false;

    /* JADX INFO: renamed from: ܿ */
    public float f45937;

    /* JADX INFO: renamed from: ᩳ */
    public float f45938;

    public C15859(float f, float f2, float f3, float f4) {
        this.f45934 = 0.0f;
        this.f45935 = 0.0f;
        this.f45938 = f;
        this.f45937 = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.f45934 = (float) (((double) f3) / dSqrt);
            this.f45935 = (float) (((double) f4) / dSqrt);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35995(float f, float f2) {
        float f3 = f - this.f45938;
        float f4 = f2 - this.f45937;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.f45934;
        if (f3 == (-f5) && f4 == (-this.f45935)) {
            this.f45936 = true;
            this.f45934 = -f4;
            this.f45935 = f3;
        } else {
            this.f45934 = f5 + f3;
            this.f45935 += f4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35996(C15859 c15859) {
        float f = c15859.f45934;
        float f2 = this.f45934;
        if (f == (-f2)) {
            float f3 = c15859.f45935;
            if (f3 == (-this.f45935)) {
                this.f45936 = true;
                this.f45934 = -f3;
                this.f45935 = c15859.f45934;
                return;
            }
        }
        this.f45934 = f2 + f;
        this.f45935 += c15859.f45935;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f45938 + "," + this.f45937 + " " + this.f45934 + "," + this.f45935 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
