package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֨ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3373 extends Animation {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14102 f6668;

    public C3373(C14102 c14102) {
        this.f6668 = c14102;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C14102 c14102 = this.f6668;
        c14102.f39977.setScaleX(f);
        c14102.f39977.setScaleY(f);
    }
}
