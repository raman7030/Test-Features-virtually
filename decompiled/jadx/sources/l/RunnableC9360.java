package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۢۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9360 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3715 f28420;

    public RunnableC9360(C3715 c3715) {
        this.f28420 = c3715;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3715 c3715 = this.f28420;
        ValueAnimator valueAnimator = c3715.f11720;
        int i = c3715.f11721;
        if (i == 1) {
            valueAnimator.cancel();
        } else if (i != 2) {
            return;
        }
        c3715.f11721 = 3;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
