package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10079 extends Animation {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14102 f27981;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = 1.0f - f;
        C14102 c14102 = this.f27981;
        c14102.f39977.setScaleX(f2);
        c14102.f39977.setScaleY(f2);
    }

    public C10079(C14102 c14102) {
        this.f27981 = c14102;
    }
}
