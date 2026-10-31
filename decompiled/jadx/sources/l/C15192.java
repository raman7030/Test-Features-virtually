package l;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15192 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f46408;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C15192(TextView textView) {
        this.f46408 = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f46408.setVisibility(8);
    }
}
