package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.۫᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14378 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9684 f41094;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewPropertyAnimator f41095;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractC5462 f41096;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View f41097;

    public C14378(View view, ViewPropertyAnimator viewPropertyAnimator, C9684 c9684, AbstractC5462 abstractC5462) {
        this.f41094 = c9684;
        this.f41096 = abstractC5462;
        this.f41097 = view;
        this.f41095 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f41094.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f41097.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f41095.setListener(null);
        C9684 c9684 = this.f41094;
        AbstractC5462 abstractC5462 = this.f41096;
        c9684.m53109(abstractC5462);
        c9684.f26685.remove(abstractC5462);
        c9684.m22574();
    }
}
