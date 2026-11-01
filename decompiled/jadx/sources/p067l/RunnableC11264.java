package p067l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۢۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11264 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5899 f31369;

    public RunnableC11264(C5899 c5899) {
        this.f31369 = c5899;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5899 c5899 = this.f31369;
        ValueAnimator valueAnimator = c5899.f14521;
        int i = c5899.f14522;
        if (i == 1) {
            valueAnimator.cancel();
        } else if (i != 2) {
            return;
        }
        c5899.f14522 = 3;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
