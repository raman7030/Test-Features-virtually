package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֡ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2549 extends Animation {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f4193;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ float f4194;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f4195;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ float f4196;

    public C2549(C5232 c5232, float f, float f2, int i) {
        this.f4195 = c5232;
        this.f4196 = f;
        this.f4194 = f2;
        this.f4193 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f4196;
        float fM49018 = C21740.m49018(this.f4194, f2, f, f2);
        C5232 c5232 = this.f4195;
        c5232.f12310.setX(fM49018 + (c5232.m11265() ? 0.0f : c5232.f12322.getWidth() - this.f4193));
    }
}
