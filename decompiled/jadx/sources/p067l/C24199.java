package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes.dex */
public final class C24199 extends AnimatorListenerAdapter implements InterfaceC7949 {

    /* JADX INFO: renamed from: ۧ */
    public final int f76701;

    /* JADX INFO: renamed from: ܳ */
    public final View f76702;

    /* JADX INFO: renamed from: ܽ */
    public boolean f76703;

    /* JADX INFO: renamed from: ᩳ */
    public final ViewGroup f76705;

    /* JADX INFO: renamed from: ֫ */
    public boolean f76700 = false;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f76704 = true;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
    }

    public C24199(int i, View view) {
        this.f76702 = view;
        this.f76701 = i;
        this.f76705 = (ViewGroup) view.getParent();
        m53503(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f76700 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            C22859.m51061(this.f76702, 0);
            ViewGroup viewGroup = this.f76705;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        abstractC18164.removeListener(this);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
        m53503(false);
        if (this.f76700) {
            return;
        }
        C22859.m51061(this.f76702, this.f76701);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
        m53503(true);
        if (this.f76700) {
            return;
        }
        C22859.m51061(this.f76702, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f76700) {
            C22859.m51061(this.f76702, this.f76701);
            ViewGroup viewGroup = this.f76705;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m53503(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f76700) {
            C22859.m51061(this.f76702, this.f76701);
            ViewGroup viewGroup = this.f76705;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m53503(false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53503(boolean z) {
        ViewGroup viewGroup;
        if (!this.f76704 || this.f76703 == z || (viewGroup = this.f76705) == null) {
            return;
        }
        this.f76703 = z;
        C3412.m6043(viewGroup, z);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
        onTransitionEnd(abstractC18164);
    }
}
