package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۖܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2574 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5396 f8133;

    public C2574(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f8133 = viewOnClickListenerC5396;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f8133;
        viewOnClickListenerC5396.f16776.setVisibility(0);
        viewOnClickListenerC5396.f16782 = null;
    }
}
