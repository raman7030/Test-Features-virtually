package l;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۠ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8138 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f25114;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C8138(TextView textView) {
        this.f25114 = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f25114;
        textView.setVisibility(0);
        textView.setAlpha(0.0f);
    }
}
