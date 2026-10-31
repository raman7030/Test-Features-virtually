package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ᩴۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18536 extends Animation {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57444;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f57446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f57447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f57448;

    public C18536(C3013 c3013, int i, int i2, float f, float f2) {
        this.f57447 = c3013;
        this.f57444 = i;
        this.f57445 = i2;
        this.f57448 = f;
        this.f57446 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f57444;
        int i2 = this.f57445;
        C3013 c3013 = this.f57447;
        C3013.m9212(c3013.f9524, ((int) (f * (i - i2))) + i2);
        if (c3013.m9214()) {
            c3013.f9524.setX(this.f57448);
            c3013.f9498.setX(0.0f);
            c3013.f9499.setX(0.0f);
        } else {
            c3013.f9524.setX(this.f57446 - c3013.f9524.getWidth());
            c3013.f9498.setX(c3013.f9524.getWidth() - i2);
            c3013.f9499.setX(c3013.f9524.getWidth() - i);
        }
    }
}
