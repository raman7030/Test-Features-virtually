package p067l;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10736 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ TextView f29734;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C10736(TextView textView) {
        this.f29734 = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.f29734;
        textView.setText("");
        textView.setAlpha(1.0f);
    }
}
