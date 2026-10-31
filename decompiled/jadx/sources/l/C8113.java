package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8113 extends Animation {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12346 f25072;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = 1.0f - f;
        C12346 c12346 = this.f25072;
        c12346.f36964.setScaleX(f2);
        c12346.f36964.setScaleY(f2);
    }

    public C8113(C12346 c12346) {
        this.f25072 = c12346;
    }
}
