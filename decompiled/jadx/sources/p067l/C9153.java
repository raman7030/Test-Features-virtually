package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.۟֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C9153 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22091 f24801;

    public C9153(C22091 c22091) {
        this.f24801 = c22091;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C22091 c22091 = this.f24801;
        if (!(c22091.f69505 instanceof C9271) || c22091.f69512) {
            return;
        }
        ((C9271) c22091.f69505).m21464();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C22091 c22091 = this.f24801;
        if (c22091.f69510 != null) {
            c22091.f69510.setVisibility(4);
        }
        if (c22091.f69511 != null) {
            c22091.f69511.setVisibility(4);
        }
        if (c22091.f69513 != null) {
            c22091.f69513.setVisibility(4);
        }
    }
}
