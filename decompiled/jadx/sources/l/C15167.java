package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ܶۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15167 extends Animation {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46333;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12346 f46334;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46335;

    public C15167(C12346 c12346, int i, int i2) {
        this.f46334 = c12346;
        this.f46333 = i;
        this.f46335 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C19403 c19403 = this.f46334.f36969;
        int i = this.f46333;
        c19403.setAlpha((int) (((this.f46335 - i) * f) + i));
    }
}
