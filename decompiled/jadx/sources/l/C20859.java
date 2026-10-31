package l;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: l.᩷ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YALU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20859 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f67514;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C20859(View view) {
        this.f67514 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f67514.setVisibility(8);
    }
}
