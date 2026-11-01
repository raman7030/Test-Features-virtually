package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܽ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18066 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22091 f53933;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9823 f53934;

    public C18066(C22091 c22091, C9823 c9823) {
        this.f53933 = c22091;
        this.f53934 = c9823;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f53933.m49716(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C22091 c22091 = this.f53933;
        c22091.m49716(2);
        if (c22091.f69490) {
            this.f53934.post(c22091.f69514);
            c22091.f69490 = false;
        }
    }
}
