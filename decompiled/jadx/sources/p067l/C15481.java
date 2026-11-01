package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes4.dex */
public final class C15481 extends AnimatorListenerAdapter implements InterfaceC7949 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f44197 = true;

    /* JADX INFO: renamed from: ۧ */
    public final ViewGroup f44198;

    /* JADX INFO: renamed from: ܽ */
    public final View f44199;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractC4399 f44200;

    /* JADX INFO: renamed from: ᩳ */
    public final View f44201;

    @Override // p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
    }

    public C15481(AbstractC4399 abstractC4399, ViewGroup viewGroup, View view, View view2) {
        this.f44200 = abstractC4399;
        this.f44198 = viewGroup;
        this.f44199 = view;
        this.f44201 = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f44198.getOverlay().remove(this.f44199);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f44199;
        if (view.getParent() == null) {
            this.f44198.getOverlay().add(view);
        } else {
            this.f44200.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f44201;
            View view2 = this.f44199;
            view.setTag(R.id.MT_Protector, view2);
            this.f44198.getOverlay().add(view2);
            this.f44197 = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m35227();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m35227();
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        abstractC18164.removeListener(this);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
        if (this.f44197) {
            m35227();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35227() {
        this.f44201.setTag(R.id.MT_Protector, null);
        this.f44198.getOverlay().remove(this.f44199);
        this.f44197 = false;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
        onTransitionEnd(abstractC18164);
    }
}
