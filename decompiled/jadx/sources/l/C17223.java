package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܿ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17223 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f52840;

    public C17223(C20752 c20752) {
        this.f52840 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f52840.m47389(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f52840.m47389(0);
    }
}
