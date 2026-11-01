package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩻۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24772 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22091 f78405;

    public C24772(C22091 c22091) {
        this.f78405 = c22091;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C22091 c22091 = this.f78405;
        if (c22091.f69518 != null) {
            c22091.f69518.setVisibility(0);
            c22091.f69518.setTranslationX(c22091.f69518.getWidth());
            c22091.f69518.scrollTo(c22091.f69518.getWidth(), 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C22091 c22091 = this.f78405;
        if (c22091.f69503 != null) {
            c22091.f69503.setVisibility(4);
        }
    }
}
