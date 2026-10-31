package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.۫᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12636 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f38068;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f38069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3255 f38070;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f38071;

    public C12636(View view, ViewPropertyAnimator viewPropertyAnimator, C7697 c7697, AbstractC3255 abstractC3255) {
        this.f38068 = c7697;
        this.f38070 = abstractC3255;
        this.f38071 = view;
        this.f38069 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f38068.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f38071.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38069.setListener(null);
        C7697 c7697 = this.f38068;
        AbstractC3255 abstractC3255 = this.f38070;
        c7697.m50783(abstractC3255);
        c7697.f23772.remove(abstractC3255);
        c7697.m20594();
    }
}
