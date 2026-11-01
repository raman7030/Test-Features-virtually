package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8620 extends AnimatorListenerAdapter implements InterfaceC7949 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f23158 = false;

    /* JADX INFO: renamed from: ۧ */
    public final View f23159;

    @Override // p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
    }

    public C8620(View view) {
        this.f23159 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f23159;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f23158 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f23158;
        View view = this.f23159;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C22859.m51060(view, 1.0f);
        C22859.m51059();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C22859.m51060(this.f23159, 1.0f);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
        View view = this.f23159;
        view.setTag(R.id.MT_Protector, Float.valueOf(view.getVisibility() == 0 ? C22859.m51058(view) : 0.0f));
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
        this.f23159.setTag(R.id.MT_Protector, null);
    }
}
