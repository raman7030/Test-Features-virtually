package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܺۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15708 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48460 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3715 f48461;

    public C15708(C3715 c3715) {
        this.f48461 = c3715;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f48460) {
            this.f48460 = false;
            return;
        }
        C3715 c3715 = this.f48461;
        if (((Float) c3715.f11720.getAnimatedValue()).floatValue() == 0.0f) {
            c3715.f11721 = 0;
            c3715.m11301(0);
        } else {
            c3715.f11721 = 2;
            c3715.m11300();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f48460 = true;
    }
}
