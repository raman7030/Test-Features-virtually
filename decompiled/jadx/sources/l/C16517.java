package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܽ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16517 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f50755;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f50756;

    public C16517(C20752 c20752, C7844 c7844) {
        this.f50755 = c20752;
        this.f50756 = c7844;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f50755.m47389(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C20752 c20752 = this.f50755;
        c20752.m47389(2);
        if (c20752.f66806) {
            this.f50756.post(c20752.f66830);
            c20752.f66806 = false;
        }
    }
}
