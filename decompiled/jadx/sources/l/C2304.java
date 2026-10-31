package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۖۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2304 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3715 f7435;

    public C2304(C3715 c3715) {
        this.f7435 = c3715;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C3715 c3715 = this.f7435;
        c3715.f11742.setAlpha(iFloatValue);
        c3715.f11733.setAlpha(iFloatValue);
        c3715.m11300();
    }
}
