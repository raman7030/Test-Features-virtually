package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۧ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12703 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22091 f35642;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9823 f35643;

    public C12703(C22091 c22091, C9823 c9823) {
        this.f35642 = c22091;
        this.f35643 = c9823;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f35642.m49716(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C22091 c22091 = this.f35642;
        c22091.m49716(1);
        if (c22091.f69490) {
            this.f35643.post(c22091.f69514);
            c22091.f69490 = false;
        }
    }
}
