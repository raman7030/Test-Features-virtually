package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۤ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12030 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8006 f33532;

    public C12030(C8006 c8006) {
        this.f33532 = c8006;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C8006 c8006 = this.f33532;
        if (c8006.f21055 != animator) {
            return;
        }
        c8006.f21055 = null;
        c8006.m18571();
    }
}
