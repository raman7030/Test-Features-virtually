package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܺۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17297 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public boolean f51598 = false;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C5899 f51599;

    public C17297(C5899 c5899) {
        this.f51599 = c5899;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f51598) {
            this.f51598 = false;
            return;
        }
        C5899 c5899 = this.f51599;
        if (((Float) c5899.f14521.getAnimatedValue()).floatValue() == 0.0f) {
            c5899.f14522 = 0;
            c5899.m13248(0);
        } else {
            c5899.f14522 = 2;
            c5899.m13247();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f51598 = true;
    }
}
