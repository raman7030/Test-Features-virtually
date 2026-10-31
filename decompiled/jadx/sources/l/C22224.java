package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩹ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes.dex */
public final class C22224 extends Animation {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12346 f72120;

    public C22224(C12346 c12346) {
        this.f72120 = c12346;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C12346 c12346 = this.f72120;
        c12346.getClass();
        int iAbs = c12346.f36947 - Math.abs(c12346.f36976);
        int i = c12346.f36979;
        c12346.m29961((i + ((int) ((iAbs - i) * f))) - c12346.f36964.getTop());
        c12346.f36969.m44680(1.0f - f);
    }
}
