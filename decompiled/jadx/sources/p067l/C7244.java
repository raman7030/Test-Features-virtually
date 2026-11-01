package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۚۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C7244 extends Animation {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f18890;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f18891;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ float f18892;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f18893;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ float f18894;

    public C7244(C5232 c5232, int i, int i2, float f, float f2) {
        this.f18893 = c5232;
        this.f18890 = i;
        this.f18891 = i2;
        this.f18894 = f;
        this.f18892 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f18890;
        int i2 = this.f18891;
        C5232 c5232 = this.f18893;
        C5232.m11263(c5232.f12322, ((int) (f * (i - i2))) + i2);
        if (c5232.m11265()) {
            c5232.f12322.setX(this.f18894);
            c5232.f12296.setX(0.0f);
            c5232.f12297.setX(0.0f);
        } else {
            c5232.f12322.setX(this.f18892 - c5232.f12322.getWidth());
            c5232.f12296.setX(c5232.f12322.getWidth() - i);
            c5232.f12297.setX(c5232.f12322.getWidth() - i2);
        }
    }
}
