package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes3.dex */
public final class InterpolatorC11486 implements Interpolator {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8518 f34302;

    public InterpolatorC11486(C8518 c8518) {
        this.f34302 = c8518;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f34302.mo22211(f);
    }
}
