package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۖܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4815 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC7497 f10923;

    public C4815(ViewOnClickListenerC7497 viewOnClickListenerC7497) {
        this.f10923 = viewOnClickListenerC7497;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f10923;
        viewOnClickListenerC7497.f19612.setVisibility(0);
        viewOnClickListenerC7497.f19618 = null;
    }
}
