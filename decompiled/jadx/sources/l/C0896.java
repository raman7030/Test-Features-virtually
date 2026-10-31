package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֨ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0896 extends Animation {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3468;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3469;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f3470;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f3471;

    public C0896(C3013 c3013, int i, int i2, float f) {
        this.f3470 = c3013;
        this.f3468 = i;
        this.f3469 = i2;
        this.f3471 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f3468;
        int i2 = this.f3469;
        int i3 = (int) (f * (i - i2));
        C3013 c3013 = this.f3470;
        C3013.m9195(c3013.f9524, i2 + i3);
        if (c3013.f9495) {
            c3013.f9524.setY(this.f3471 - c3013.f9524.getHeight());
            C3013.m9222(c3013);
        }
    }
}
