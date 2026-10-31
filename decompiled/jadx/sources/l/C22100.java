package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩹ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22100 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16620 f71762;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2727 f71763;

    public C22100(AbstractC16620 abstractC16620, C2727 c2727) {
        this.f71762 = abstractC16620;
        this.f71763 = c2727;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f71762.mCurrentAnimators.add(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f71763.remove(animator);
        this.f71762.mCurrentAnimators.remove(animator);
    }
}
