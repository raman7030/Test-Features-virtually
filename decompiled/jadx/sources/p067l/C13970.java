package p067l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.۫ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13970 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC17874 f39441;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C13970(ActivityC17874 activityC17874) {
        this.f39441 = activityC17874;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f39441.f53416.setVisibility(8);
    }
}
