package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۘ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class InterpolatorC3801 implements Interpolator {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final float f11988;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final float f11989;

    static {
        float fM11471 = 1.0f / m11471(1.0f);
        f11988 = fM11471;
        f11989 = 1.0f - (fM11471 * m11471(1.0f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m11471(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return C20382.m46695(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fM11471 = f11988 * m11471(f);
        return fM11471 > 0.0f ? fM11471 + f11989 : fM11471;
    }
}
