package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۛ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class C8343 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9684 f22309;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24436 f22310;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ViewPropertyAnimator f22311;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View f22312;

    public C8343(C9684 c9684, C24436 c24436, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f22309 = c9684;
        this.f22310 = c24436;
        this.f22311 = viewPropertyAnimator;
        this.f22312 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC5462 abstractC5462 = this.f22310.f77370;
        this.f22309.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22311.setListener(null);
        View view = this.f22312;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C24436 c24436 = this.f22310;
        AbstractC5462 abstractC5462 = c24436.f77370;
        C9684 c9684 = this.f22309;
        c9684.m53109(abstractC5462);
        c9684.f26687.remove(c24436.f77370);
        c9684.m22574();
    }
}
