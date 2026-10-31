package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩻۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23573 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f75659;

    public C23573(C20752 c20752) {
        this.f75659 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C20752 c20752 = this.f75659;
        if (c20752.f66834 != null) {
            c20752.f66834.setVisibility(0);
            c20752.f66834.setTranslationX(c20752.f66834.getWidth());
            c20752.f66834.scrollTo(c20752.f66834.getWidth(), 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C20752 c20752 = this.f75659;
        if (c20752.f66819 != null) {
            c20752.f66819.setVisibility(4);
        }
    }
}
