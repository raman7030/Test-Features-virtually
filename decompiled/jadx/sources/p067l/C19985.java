package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ᩴۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19985 extends Animation {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f60665;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f60666;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ float f60667;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f60668;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ float f60669;

    public C19985(C5232 c5232, int i, int i2, float f, float f2) {
        this.f60668 = c5232;
        this.f60665 = i;
        this.f60666 = i2;
        this.f60669 = f;
        this.f60667 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f60665;
        int i2 = this.f60666;
        C5232 c5232 = this.f60668;
        C5232.m11263(c5232.f12322, ((int) (f * (i - i2))) + i2);
        if (c5232.m11265()) {
            c5232.f12322.setX(this.f60669);
            c5232.f12296.setX(0.0f);
            c5232.f12297.setX(0.0f);
        } else {
            c5232.f12322.setX(this.f60667 - c5232.f12322.getWidth());
            c5232.f12296.setX(c5232.f12322.getWidth() - i2);
            c5232.f12297.setX(c5232.f12322.getWidth() - i);
        }
    }
}
