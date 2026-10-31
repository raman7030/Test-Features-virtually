package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۤ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10520 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f31539;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f31540;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f31541;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31542;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3255 f31543;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31544;

    public C10520(C7697 c7697, AbstractC3255 abstractC3255, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31539 = c7697;
        this.f31543 = abstractC3255;
        this.f31542 = i;
        this.f31541 = view;
        this.f31544 = i2;
        this.f31540 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f31539.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f31542;
        View view = this.f31541;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f31544 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31540.setListener(null);
        C7697 c7697 = this.f31539;
        AbstractC3255 abstractC3255 = this.f31543;
        c7697.m50783(abstractC3255);
        c7697.f23775.remove(abstractC3255);
        c7697.m20594();
    }
}
