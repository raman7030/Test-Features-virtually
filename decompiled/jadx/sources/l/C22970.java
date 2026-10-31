package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes.dex */
public final class C22970 extends AnimatorListenerAdapter implements InterfaceC5872 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f73970;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f73971;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f73972;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f73974;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f73969 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f73973 = true;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
    }

    public C22970(int i, View view) {
        this.f73971 = view;
        this.f73970 = i;
        this.f73974 = (ViewGroup) view.getParent();
        m51111(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f73969 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            C21560.m48716(this.f73971, 0);
            ViewGroup viewGroup = this.f73974;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        abstractC16620.removeListener(this);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
        m51111(false);
        if (this.f73969) {
            return;
        }
        C21560.m48716(this.f73971, this.f73970);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
        m51111(true);
        if (this.f73969) {
            return;
        }
        C21560.m48716(this.f73971, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f73969) {
            C21560.m48716(this.f73971, this.f73970);
            ViewGroup viewGroup = this.f73974;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m51111(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f73969) {
            C21560.m48716(this.f73971, this.f73970);
            ViewGroup viewGroup = this.f73974;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m51111(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51111(boolean z) {
        ViewGroup viewGroup;
        if (!this.f73973 || this.f73972 == z || (viewGroup = this.f73974) == null) {
            return;
        }
        this.f73972 = z;
        C1098.m3770(viewGroup, z);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
        onTransitionEnd(abstractC16620);
    }
}
