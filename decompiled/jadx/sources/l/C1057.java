package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֨ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057 extends Animation {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12346 f3897;

    public C1057(C12346 c12346) {
        this.f3897 = c12346;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C12346 c12346 = this.f3897;
        c12346.f36964.setScaleX(f);
        c12346.f36964.setScaleY(f);
    }
}
