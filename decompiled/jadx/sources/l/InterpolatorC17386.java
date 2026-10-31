package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܿܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes4.dex */
public final class InterpolatorC17386 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
