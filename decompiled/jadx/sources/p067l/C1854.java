package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩶᩷ */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public final class C1854 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1364 f68521;

    public C1854(C1364 c1364) {
        this.f68521 = c1364;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1364 c1364 = this.f68521;
        c1364.f34540 = null;
        c1364.f34530 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C1364 c1364 = this.f68521;
        c1364.f34540 = null;
        c1364.f34530 = false;
    }
}
