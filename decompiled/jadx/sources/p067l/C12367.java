package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۤ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12367 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9684 f34501;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewPropertyAnimator f34502;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ View f34503;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ int f34504;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractC5462 f34505;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ int f34506;

    public C12367(C9684 c9684, AbstractC5462 abstractC5462, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f34501 = c9684;
        this.f34505 = abstractC5462;
        this.f34504 = i;
        this.f34503 = view;
        this.f34506 = i2;
        this.f34502 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f34501.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f34504;
        View view = this.f34503;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f34506 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f34502.setListener(null);
        C9684 c9684 = this.f34501;
        AbstractC5462 abstractC5462 = this.f34505;
        c9684.m53109(abstractC5462);
        c9684.f26688.remove(abstractC5462);
        c9684.m22574();
    }
}
