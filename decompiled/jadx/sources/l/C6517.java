package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۜۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes2.dex */
public final class C6517 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9340 f20128;

    public C6517(C9340 c9340) {
        this.f20128 = c9340;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9340 c9340 = this.f20128;
        c9340.f28345.setVisibility(8);
        c9340.f28345.setAlpha(1.0f);
    }
}
