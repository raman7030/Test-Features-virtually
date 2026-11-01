package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩹ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23372 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC18164 f74482;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C0977 f74483;

    public C23372(AbstractC18164 abstractC18164, C0977 c0977) {
        this.f74482 = abstractC18164;
        this.f74483 = c0977;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f74482.mCurrentAnimators.add(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f74483.remove(animator);
        this.f74482.mCurrentAnimators.remove(animator);
    }
}
