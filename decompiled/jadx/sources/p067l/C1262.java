package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: l.۠᩺ */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes3.dex */
public final class C1262 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC1927 f28826;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f28827;

    public C1262(InterfaceC1927 interfaceC1927, View view) {
        this.f28826 = interfaceC1927;
        this.f28827 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f28826.onAnimationCancel();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f28826.onAnimationEnd();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f28826.mo5940();
    }
}
