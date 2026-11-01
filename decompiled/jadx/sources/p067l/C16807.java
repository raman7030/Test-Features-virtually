package p067l;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16807 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ TextView f49533;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C16807(TextView textView) {
        this.f49533 = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f49533.setVisibility(8);
    }
}
