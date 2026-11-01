package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֨ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3220 extends Animation {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f6241;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f6242;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f6243;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ float f6244;

    public C3220(C5232 c5232, int i, int i2, float f) {
        this.f6243 = c5232;
        this.f6241 = i;
        this.f6242 = i2;
        this.f6244 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f6241;
        int i2 = this.f6242;
        int i3 = (int) (f * (i - i2));
        C5232 c5232 = this.f6243;
        C5232.m11246(c5232.f12322, i2 + i3);
        if (c5232.f12293) {
            c5232.f12322.setY(this.f6244 - c5232.f12322.getHeight());
            C5232.m11273(c5232);
        }
    }
}
