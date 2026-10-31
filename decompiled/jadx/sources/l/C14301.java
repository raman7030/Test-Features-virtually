package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ܳۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14301 extends Animation {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f43122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f43123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f43124;

    public C14301(C3013 c3013, float f, float f2, int i) {
        this.f43123 = c3013;
        this.f43124 = f;
        this.f43122 = f2;
        this.f43121 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f43124;
        float fM46695 = C20382.m46695(this.f43122, f2, f, f2);
        C3013 c3013 = this.f43123;
        c3013.f9512.setX(fM46695 + (c3013.m9214() ? 0.0f : c3013.f9524.getWidth() - this.f43121));
    }
}
