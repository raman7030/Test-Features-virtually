package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ܳۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C15960 extends Animation {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f46213;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ float f46214;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f46215;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ float f46216;

    public C15960(C5232 c5232, float f, float f2, int i) {
        this.f46215 = c5232;
        this.f46216 = f;
        this.f46214 = f2;
        this.f46213 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f46216;
        float fM49018 = C21740.m49018(this.f46214, f2, f, f2);
        C5232 c5232 = this.f46215;
        c5232.f12310.setX(fM49018 + (c5232.m11265() ? 0.0f : c5232.f12322.getWidth() - this.f46213));
    }
}
