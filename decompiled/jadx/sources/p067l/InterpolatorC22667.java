package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.᩸ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class InterpolatorC22667 implements Interpolator {

    /* JADX INFO: renamed from: ֫ */
    public static final float f71498 = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f)))) * f71498);
    }
}
