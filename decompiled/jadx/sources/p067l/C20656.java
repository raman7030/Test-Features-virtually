package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩵ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20656 extends Animation {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f63790;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ float f63791;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f63792;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f63793;

    public C20656(C5232 c5232, int i, int i2, float f) {
        this.f63792 = c5232;
        this.f63790 = i;
        this.f63793 = i2;
        this.f63791 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f63790;
        int i2 = this.f63793;
        int i3 = (int) (f * (i - i2));
        C5232 c5232 = this.f63792;
        C5232.m11246(c5232.f12322, i3 + i2);
        if (c5232.f12293) {
            c5232.f12322.setY(this.f63791 - (c5232.f12322.getHeight() - i2));
            C5232.m11273(c5232);
        }
    }
}
