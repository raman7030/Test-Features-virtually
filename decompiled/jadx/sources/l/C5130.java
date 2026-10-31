package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۚۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5130 extends Animation {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16056;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f16058;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f16059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f16060;

    public C5130(C3013 c3013, int i, int i2, float f, float f2) {
        this.f16059 = c3013;
        this.f16056 = i;
        this.f16057 = i2;
        this.f16060 = f;
        this.f16058 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f16056;
        int i2 = this.f16057;
        C3013 c3013 = this.f16059;
        C3013.m9212(c3013.f9524, ((int) (f * (i - i2))) + i2);
        if (c3013.m9214()) {
            c3013.f9524.setX(this.f16060);
            c3013.f9498.setX(0.0f);
            c3013.f9499.setX(0.0f);
        } else {
            c3013.f9524.setX(this.f16058 - c3013.f9524.getWidth());
            c3013.f9498.setX(c3013.f9524.getWidth() - i);
            c3013.f9499.setX(c3013.f9524.getWidth() - i2);
        }
    }
}
