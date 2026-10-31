package l;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.ۖ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2390 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f7628;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f7629;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f7631;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f7632;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f7633;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f7634;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f7636;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f7637;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f7638;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f7639;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f7640;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f7641;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static float f7627 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final float[] f7625 = new float[101];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final float[] f7626 = new float[101];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f7642 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f7630 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f7635 = true;

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
                f7625[i] = (((f4 * 0.5f) + f2) * f5) + f6;
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
                f7626[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                i++;
            } else {
                float[] fArr = f7625;
                f7626[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public C2390(Context context) {
        this.f7641 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7748(float f) {
        long j = this.f7636;
        this.f7634 = j + ((long) Math.round(f * (this.f7638 - j)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7741(long j, long j2, long j3) {
        float fAbs = Math.abs((j3 - j) / (j2 - j));
        int i = (int) (fAbs * 100.0f);
        if (i < 100) {
            float f = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f7626;
            float f2 = fArr[i];
            this.f7639 = (int) (this.f7639 * C20382.m46695(fArr[i2], f2, (fAbs - f) / ((i2 / 100.0f) - f), f2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7749(long j, long j2) {
        this.f7635 = false;
        this.f7636 = j;
        this.f7634 = j;
        this.f7638 = j + j2;
        this.f7629 = AnimationUtils.currentAnimationTimeMillis();
        this.f7639 = 250;
        this.f7637 = 0.0f;
        this.f7640 = 0L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7752() {
        this.f7634 = this.f7638;
        this.f7635 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m7743(long j, long j2) {
        this.f7635 = false;
        this.f7630 = 1;
        this.f7636 = j;
        this.f7634 = j;
        this.f7638 = j2;
        long j3 = j - j2;
        this.f7637 = j3 > 0 ? -2000.0f : 2000.0f;
        this.f7640 = -j3;
        this.f7631 = Math.abs(j3);
        this.f7639 = (int) (Math.sqrt((j3 * (-2.0d)) / ((double) this.f7637)) * 1000.0d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7750(long j, long j2, long j3, long j4, long j5) {
        double dExp;
        long j6 = j4;
        this.f7631 = j5;
        this.f7635 = false;
        this.f7640 = j2;
        float f = j2;
        this.f7628 = f;
        this.f7632 = 0;
        this.f7639 = 0;
        this.f7629 = AnimationUtils.currentAnimationTimeMillis();
        this.f7636 = j;
        this.f7634 = j;
        float f2 = f7627;
        float f3 = this.f7641;
        float f4 = this.f7642;
        if (j <= j6 && j >= j3) {
            this.f7630 = 0;
            if (j2 != 0) {
                int iExp = (int) (Math.exp(Math.log((Math.abs(j2) * 0.35f) / (f4 * f3)) / (((double) f2) - 1.0d)) * 1000.0d);
                this.f7632 = iExp;
                this.f7639 = iExp;
                float f5 = f4 * f3;
                double d = f2;
                dExp = Math.exp((d / (d - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / f5)) * ((double) f5);
            } else {
                dExp = 0.0d;
            }
            long jSignum = (int) (dExp * ((double) Math.signum(f)));
            this.f7633 = jSignum;
            long j7 = jSignum + j;
            this.f7638 = j7;
            if (j7 < j3) {
                m7741(this.f7636, j7, j3);
                this.f7638 = j3;
            }
            long j8 = this.f7638;
            if (j8 > j4) {
                m7741(this.f7636, j8, j4);
                this.f7638 = j4;
                return;
            }
            return;
        }
        if (j > j3 && j < j6) {
            this.f7635 = true;
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
                m7750(j, j2, j11, j6, this.f7631);
                return;
            }
            m7743(j, j9);
            return;
        }
        if (j2 != 0) {
            j10 = j2;
        }
        float f7 = j10 > 0 ? -2000.0f : 2000.0f;
        this.f7637 = f7;
        float f8 = (-j2) / f7;
        float fSqrt = (float) Math.sqrt((((double) ((((f * f) / 2.0f) / Math.abs(f7)) + Math.abs(j9 - j))) * 2.0d) / ((double) Math.abs(this.f7637)));
        this.f7629 -= (long) ((int) ((fSqrt - f8) * 1000.0f));
        this.f7636 = j9;
        this.f7634 = j9;
        this.f7640 = (int) ((-this.f7637) * fSqrt);
        m7746();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m7746() {
        long j = this.f7640;
        float f = j * j;
        float fAbs = f / (Math.abs(this.f7637) * 2.0f);
        float fSignum = Math.signum(this.f7640);
        long j2 = this.f7631;
        if (fAbs > j2) {
            this.f7637 = ((-fSignum) * f) / (j2 * 2.0f);
            fAbs = j2;
        }
        this.f7631 = (int) fAbs;
        this.f7630 = 2;
        long j3 = this.f7636;
        long j4 = this.f7640;
        if (j4 <= 0) {
            fAbs = -fAbs;
        }
        this.f7638 = j3 + ((long) ((int) fAbs));
        this.f7639 = -((int) ((j4 * 1000.0f) / this.f7637));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7751() {
        int i = this.f7630;
        if (i == 0) {
            int i2 = this.f7639;
            if (i2 >= this.f7632) {
                return false;
            }
            long j = this.f7638;
            this.f7636 = j;
            this.f7634 = j;
            long j2 = (int) this.f7628;
            this.f7640 = j2;
            this.f7637 = j2 > 0 ? -2000.0f : 2000.0f;
            this.f7629 += (long) i2;
            m7746();
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                this.f7629 += (long) this.f7639;
                m7743(this.f7638, this.f7636);
            }
        }
        m7753();
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m7753() {
        float fM46695;
        float f;
        double d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f7629;
        if (jCurrentAnimationTimeMillis == 0) {
            return this.f7639 > 0;
        }
        int i = this.f7639;
        if (jCurrentAnimationTimeMillis > i) {
            return false;
        }
        int i2 = this.f7630;
        if (i2 == 0) {
            float f2 = this.f7632;
            float f3 = jCurrentAnimationTimeMillis / f2;
            int i3 = (int) (f3 * 100.0f);
            if (i3 < 100) {
                float f4 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = f7625;
                float f5 = fArr[i3];
                f = (fArr[i4] - f5) / ((i4 / 100.0f) - f4);
                fM46695 = C20382.m46695(f3, f4, f, f5);
            } else {
                fM46695 = 1.0f;
                f = 0.0f;
            }
            float f6 = this.f7633;
            this.f7628 = ((f * f6) / f2) * 1000.0f;
            d = fM46695 * f6;
        } else if (i2 == 1) {
            float f7 = jCurrentAnimationTimeMillis / i;
            float f8 = f7 * f7;
            float fSignum = Math.signum(this.f7640) * this.f7631;
            this.f7628 = ((-f7) + f8) * fSignum * 6.0f;
            d = ((3.0f * f8) - ((2.0f * f7) * f8)) * fSignum;
        } else if (i2 != 2) {
            d = 0.0d;
        } else {
            float f9 = jCurrentAnimationTimeMillis / 1000.0f;
            float f10 = this.f7640;
            float f11 = this.f7637 * f9;
            this.f7628 = f11 + f10;
            d = ((f11 * f9) / 2.0f) + (f10 * f9);
        }
        this.f7634 = this.f7636 + ((long) ((int) Math.round(d)));
        return true;
    }
}
