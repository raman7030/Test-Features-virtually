package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܿ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18737 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22091 f56022;

    public C18737(C22091 c22091) {
        this.f56022 = c22091;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f56022.m49716(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f56022.m49716(0);
    }
}
