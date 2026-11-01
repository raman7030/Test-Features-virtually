package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۨ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13708 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9684 f38685;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24436 f38686;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ View f38687;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ViewPropertyAnimator f38688;

    public C13708(C9684 c9684, C24436 c24436, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f38685 = c9684;
        this.f38686 = c24436;
        this.f38688 = viewPropertyAnimator;
        this.f38687 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC5462 abstractC5462 = this.f38686.f77368;
        this.f38685.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38688.setListener(null);
        View view = this.f38687;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C24436 c24436 = this.f38686;
        AbstractC5462 abstractC5462 = c24436.f77368;
        C9684 c9684 = this.f38685;
        c9684.m53109(abstractC5462);
        c9684.f26687.remove(c24436.f77368);
        c9684.m22574();
    }
}
