package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩹ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes.dex */
public final class C23490 extends Animation {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14102 f74840;

    public C23490(C14102 c14102) {
        this.f74840 = c14102;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C14102 c14102 = this.f74840;
        c14102.getClass();
        int iAbs = c14102.f39960 - Math.abs(c14102.f39989);
        int i = c14102.f39992;
        c14102.m32021((i + ((int) ((iAbs - i) * f))) - c14102.f39977.getTop());
        c14102.f39982.m46974(1.0f - f);
    }
}
