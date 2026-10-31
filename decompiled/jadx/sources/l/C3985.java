package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۘܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3985 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5396 f12635;

    public C3985(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f12635 = viewOnClickListenerC5396;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f12635;
        viewOnClickListenerC5396.f16765.setVisibility(8);
        viewOnClickListenerC5396.f16782 = null;
    }
}
