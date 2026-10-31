package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public final class C20408 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10530 f65845;

    public C20408(C10530 c10530) {
        this.f65845 = c10530;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C10530 c10530 = this.f65845;
        c10530.f31576 = null;
        c10530.f31566 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C10530 c10530 = this.f65845;
        c10530.f31576 = null;
        c10530.f31566 = false;
    }
}
