package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֡ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0190 extends Animation {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1419;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f1420;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f1421;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f1422;

    public C0190(C3013 c3013, float f, float f2, int i) {
        this.f1421 = c3013;
        this.f1422 = f;
        this.f1420 = f2;
        this.f1419 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f1422;
        float fM46695 = C20382.m46695(this.f1420, f2, f, f2);
        C3013 c3013 = this.f1421;
        c3013.f9512.setX(fM46695 + (c3013.m9214() ? 0.0f : c3013.f9524.getWidth() - this.f1419));
    }
}
