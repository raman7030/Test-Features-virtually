package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes4.dex */
public final class C13797 extends AnimatorListenerAdapter implements InterfaceC5872 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f41119 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f41120;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View f41121;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2136 f41122;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f41123;

    @Override // l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
    }

    public C13797(AbstractC2136 abstractC2136, ViewGroup viewGroup, View view, View view2) {
        this.f41122 = abstractC2136;
        this.f41120 = viewGroup;
        this.f41121 = view;
        this.f41123 = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f41120.getOverlay().remove(this.f41121);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f41121;
        if (view.getParent() == null) {
            this.f41120.getOverlay().add(view);
        } else {
            this.f41122.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f41123;
            View view2 = this.f41121;
            view.setTag(R.id.MT_Protector, view2);
            this.f41120.getOverlay().add(view2);
            this.f41119 = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m33111();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m33111();
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        abstractC16620.removeListener(this);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
        if (this.f41119) {
            m33111();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33111() {
        this.f41123.setTag(R.id.MT_Protector, null);
        this.f41120.getOverlay().remove(this.f41121);
        this.f41119 = false;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
        onTransitionEnd(abstractC16620);
    }
}
