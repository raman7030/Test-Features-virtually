package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۛ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6286 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f19446;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23219 f19447;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f19448;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f19449;

    public C6286(C7697 c7697, C23219 c23219, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f19446 = c7697;
        this.f19447 = c23219;
        this.f19448 = viewPropertyAnimator;
        this.f19449 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC3255 abstractC3255 = this.f19447.f74627;
        this.f19446.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19448.setListener(null);
        View view = this.f19449;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C23219 c23219 = this.f19447;
        AbstractC3255 abstractC3255 = c23219.f74627;
        C7697 c7697 = this.f19446;
        c7697.m50783(abstractC3255);
        c7697.f23774.remove(c23219.f74627);
        c7697.m20594();
    }
}
