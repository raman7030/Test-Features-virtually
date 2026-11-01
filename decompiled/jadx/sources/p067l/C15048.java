package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.۬᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C15048 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9684 f42979;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewPropertyAnimator f42980;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractC5462 f42981;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View f42982;

    public C15048(View view, ViewPropertyAnimator viewPropertyAnimator, C9684 c9684, AbstractC5462 abstractC5462) {
        this.f42979 = c9684;
        this.f42981 = abstractC5462;
        this.f42980 = viewPropertyAnimator;
        this.f42982 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f42979.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f42980.setListener(null);
        this.f42982.setAlpha(1.0f);
        C9684 c9684 = this.f42979;
        AbstractC5462 abstractC5462 = this.f42981;
        c9684.m53109(abstractC5462);
        c9684.f26684.remove(abstractC5462);
        c9684.m22574();
    }
}
