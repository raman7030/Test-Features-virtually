package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۨۚ */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes3.dex */
public final class InterpolatorC1412 implements Interpolator {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1265 f37299;

    public InterpolatorC1412(C1265 c1265) {
        this.f37299 = c1265;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f37299.mo24179(f);
    }
}
