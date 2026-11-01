package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ᩳ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19408 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22091 f57959;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9823 f57960;

    public C19408(C22091 c22091, C9823 c9823) {
        this.f57959 = c22091;
        this.f57960 = c9823;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f57959.m49716(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C22091 c22091 = this.f57959;
        c22091.m49716(2);
        if (c22091.f69490) {
            this.f57960.post(c22091.f69514);
            c22091.f69490 = false;
        }
    }
}
