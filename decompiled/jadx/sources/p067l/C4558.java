package p067l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۖۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4558 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5899 f10221;

    public C4558(C5899 c5899) {
        this.f10221 = c5899;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C5899 c5899 = this.f10221;
        c5899.f14543.setAlpha(iFloatValue);
        c5899.f14534.setAlpha(iFloatValue);
        c5899.m13247();
    }
}
