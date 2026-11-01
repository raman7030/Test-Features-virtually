package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۘ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class InterpolatorC5981 implements Interpolator {

    /* JADX INFO: renamed from: ֫ */
    public static final float f14794;

    /* JADX INFO: renamed from: ۧ */
    public static final float f14795;

    static {
        float fM13407 = 1.0f / m13407(1.0f);
        f14794 = fM13407;
        f14795 = 1.0f - (fM13407 * m13407(1.0f));
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m13407(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return C21740.m49018(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fM13407 = f14794 * m13407(f);
        return fM13407 > 0.0f ? fM13407 + f14795 : fM13407;
    }
}
