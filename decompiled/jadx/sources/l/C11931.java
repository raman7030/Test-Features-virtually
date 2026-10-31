package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۨ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11931 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f35676;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23219 f35677;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f35678;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f35679;

    public C11931(C7697 c7697, C23219 c23219, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f35676 = c7697;
        this.f35677 = c23219;
        this.f35679 = viewPropertyAnimator;
        this.f35678 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC3255 abstractC3255 = this.f35677.f74625;
        this.f35676.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35679.setListener(null);
        View view = this.f35678;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C23219 c23219 = this.f35677;
        AbstractC3255 abstractC3255 = c23219.f74625;
        C7697 c7697 = this.f35676;
        c7697.m50783(abstractC3255);
        c7697.f23774.remove(c23219.f74625);
        c7697.m20594();
    }
}
