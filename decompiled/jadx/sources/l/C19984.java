package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩶ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19984 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16620 f64701;

    public C19984(AbstractC16620 abstractC16620) {
        this.f64701 = abstractC16620;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f64701.end();
        animator.removeListener(this);
    }
}
