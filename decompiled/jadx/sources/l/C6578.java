package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6578 extends AnimatorListenerAdapter implements InterfaceC5872 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f20280 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f20281;

    @Override // l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
    }

    public C6578(View view) {
        this.f20281 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f20281;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f20280 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f20280;
        View view = this.f20281;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C21560.m48715(view, 1.0f);
        C21560.m48714();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C21560.m48715(this.f20281, 1.0f);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
        View view = this.f20281;
        view.setTag(R.id.MT_Protector, Float.valueOf(view.getVisibility() == 0 ? C21560.m48713(view) : 0.0f));
    }

    @Override // l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
        this.f20281.setTag(R.id.MT_Protector, null);
    }
}
