package p067l;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.ۖ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4640 {

    /* JADX INFO: renamed from: ֫ */
    public float f10419;

    /* JADX INFO: renamed from: ۖ */
    public long f10420;

    /* JADX INFO: renamed from: ۜ */
    public long f10422;

    /* JADX INFO: renamed from: ۡ */
    public int f10423;

    /* JADX INFO: renamed from: ۢ */
    public long f10424;

    /* JADX INFO: renamed from: ۧ */
    public long f10425;

    /* JADX INFO: renamed from: ܺ */
    public long f10427;

    /* JADX INFO: renamed from: ܽ */
    public float f10428;

    /* JADX INFO: renamed from: ܿ */
    public long f10429;

    /* JADX INFO: renamed from: ᩳ */
    public int f10430;

    /* JADX INFO: renamed from: ᩴ */
    public long f10431;

    /* JADX INFO: renamed from: ᩷ */
    public float f10432;

    /* JADX INFO: renamed from: ᩵ */
    public static float f10418 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ֡ */
    public static final float[] f10416 = new float[101];

    /* JADX INFO: renamed from: ۚ */
    public static final float[] f10417 = new float[101];

    /* JADX INFO: renamed from: ᩻ */
    public float f10433 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: ۘ */
    public int f10421 = 0;

    /* JADX INFO: renamed from: ܳ */
    public boolean f10426 = true;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                float f14 = i / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f2 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                    }
                    f13 = 1.0f;
                }
                f10416[i] = (((f4 * 0.5f) + f2) * f5) + f6;
                float f17 = 1.0f;
                while (true) {
                    f7 = ((f17 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f18 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f18 > f14) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                f10417[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                i++;
            } else {
                float[] fArr = f10416;
                f10417[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public C4640(Context context) {
        this.f10432 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9809(float f) {
        long j = this.f10427;
        this.f10425 = j + ((long) Math.round(f * (this.f10429 - j)));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m9802(long j, long j2, long j3) {
        float fAbs = Math.abs((j3 - j) / (j2 - j));
        int i = (int) (fAbs * 100.0f);
        if (i < 100) {
            float f = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f10417;
            float f2 = fArr[i];
            this.f10430 = (int) (this.f10430 * C21740.m49018(fArr[i2], f2, (fAbs - f) / ((i2 / 100.0f) - f), f2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9810(long j, long j2) {
        this.f10426 = false;
        this.f10427 = j;
        this.f10425 = j;
        this.f10429 = j + j2;
        this.f10420 = AnimationUtils.currentAnimationTimeMillis();
        this.f10430 = 250;
        this.f10428 = 0.0f;
        this.f10431 = 0L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9813() {
        this.f10425 = this.f10429;
        this.f10426 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m9804(long j, long j2) {
        this.f10426 = false;
        this.f10421 = 1;
        this.f10427 = j;
        this.f10425 = j;
        this.f10429 = j2;
        long j3 = j - j2;
        this.f10428 = j3 > 0 ? -2000.0f : 2000.0f;
        this.f10431 = -j3;
        this.f10422 = Math.abs(j3);
        this.f10430 = (int) (Math.sqrt((j3 * (-2.0d)) / ((double) this.f10428)) * 1000.0d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9811(long j, long j2, long j3, long j4, long j5) {
        double dExp;
        long j6 = j4;
        this.f10422 = j5;
        this.f10426 = false;
        this.f10431 = j2;
        float f = j2;
        this.f10419 = f;
        this.f10423 = 0;
        this.f10430 = 0;
        this.f10420 = AnimationUtils.currentAnimationTimeMillis();
        this.f10427 = j;
        this.f10425 = j;
        float f2 = f10418;
        float f3 = this.f10432;
        float f4 = this.f10433;
        if (j <= j6 && j >= j3) {
            this.f10421 = 0;
            if (j2 != 0) {
                int iExp = (int) (Math.exp(Math.log((Math.abs(j2) * 0.35f) / (f4 * f3)) / (((double) f2) - 1.0d)) * 1000.0d);
                this.f10423 = iExp;
                this.f10430 = iExp;
                float f5 = f4 * f3;
                double d = f2;
                dExp = Math.exp((d / (d - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / f5)) * ((double) f5);
            } else {
                dExp = 0.0d;
            }
            long jSignum = (int) (dExp * ((double) Math.signum(f)));
            this.f10424 = jSignum;
            long j7 = jSignum + j;
            this.f10429 = j7;
            if (j7 < j3) {
                m9802(this.f10427, j7, j3);
                this.f10429 = j3;
            }
            long j8 = this.f10429;
            if (j8 > j4) {
                m9802(this.f10427, j8, j4);
                this.f10429 = j4;
                return;
            }
            return;
        }
        if (j > j3 && j < j6) {
            this.f10426 = true;
            return;
        }
        boolean z = j > j6;
        long j9 = z ? j6 : j3;
        long j10 = j - j9;
        if (j10 * j2 < 0) {
            float f6 = f4 * f3;
            double d2 = f2;
            if (Math.exp((d2 / (d2 - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / f6)) * ((double) f6) > Math.abs(j10)) {
                long j11 = z ? j3 : j;
                if (z) {
                    j6 = j;
                }
                m9811(j, j2, j11, j6, this.f10422);
                return;
            }
            m9804(j, j9);
            return;
        }
        if (j2 != 0) {
            j10 = j2;
        }
        float f7 = j10 > 0 ? -2000.0f : 2000.0f;
        this.f10428 = f7;
        float f8 = (-j2) / f7;
        float fSqrt = (float) Math.sqrt((((double) ((((f * f) / 2.0f) / Math.abs(f7)) + Math.abs(j9 - j))) * 2.0d) / ((double) Math.abs(this.f10428)));
        this.f10420 -= (long) ((int) ((fSqrt - f8) * 1000.0f));
        this.f10427 = j9;
        this.f10425 = j9;
        this.f10431 = (int) ((-this.f10428) * fSqrt);
        m9807();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m9807() {
        long j = this.f10431;
        float f = j * j;
        float fAbs = f / (Math.abs(this.f10428) * 2.0f);
        float fSignum = Math.signum(this.f10431);
        long j2 = this.f10422;
        if (fAbs > j2) {
            this.f10428 = ((-fSignum) * f) / (j2 * 2.0f);
            fAbs = j2;
        }
        this.f10422 = (int) fAbs;
        this.f10421 = 2;
        long j3 = this.f10427;
        long j4 = this.f10431;
        if (j4 <= 0) {
            fAbs = -fAbs;
        }
        this.f10429 = j3 + ((long) ((int) fAbs));
        this.f10430 = -((int) ((j4 * 1000.0f) / this.f10428));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9812() {
        int i = this.f10421;
        if (i == 0) {
            int i2 = this.f10430;
            if (i2 >= this.f10423) {
                return false;
            }
            long j = this.f10429;
            this.f10427 = j;
            this.f10425 = j;
            long j2 = (int) this.f10419;
            this.f10431 = j2;
            this.f10428 = j2 > 0 ? -2000.0f : 2000.0f;
            this.f10420 += (long) i2;
            m9807();
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                this.f10420 += (long) this.f10430;
                m9804(this.f10429, this.f10427);
            }
        }
        m9814();
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m9814() {
        float fM49018;
        float f;
        double d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f10420;
        if (jCurrentAnimationTimeMillis == 0) {
            return this.f10430 > 0;
        }
        int i = this.f10430;
        if (jCurrentAnimationTimeMillis > i) {
            return false;
        }
        int i2 = this.f10421;
        if (i2 == 0) {
            float f2 = this.f10423;
            float f3 = jCurrentAnimationTimeMillis / f2;
            int i3 = (int) (f3 * 100.0f);
            if (i3 < 100) {
                float f4 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = f10416;
                float f5 = fArr[i3];
                f = (fArr[i4] - f5) / ((i4 / 100.0f) - f4);
                fM49018 = C21740.m49018(f3, f4, f, f5);
            } else {
                fM49018 = 1.0f;
                f = 0.0f;
            }
            float f6 = this.f10424;
            this.f10419 = ((f * f6) / f2) * 1000.0f;
            d = fM49018 * f6;
        } else if (i2 == 1) {
            float f7 = jCurrentAnimationTimeMillis / i;
            float f8 = f7 * f7;
            float fSignum = Math.signum(this.f10431) * this.f10422;
            this.f10419 = ((-f7) + f8) * fSignum * 6.0f;
            d = ((3.0f * f8) - ((2.0f * f7) * f8)) * fSignum;
        } else if (i2 != 2) {
            d = 0.0d;
        } else {
            float f9 = jCurrentAnimationTimeMillis / 1000.0f;
            float f10 = this.f10431;
            float f11 = this.f10428 * f9;
            this.f10419 = f11 + f10;
            d = ((f11 * f9) / 2.0f) + (f10 * f9);
        }
        this.f10425 = this.f10427 + ((long) ((int) Math.round(d)));
        return true;
    }
}
