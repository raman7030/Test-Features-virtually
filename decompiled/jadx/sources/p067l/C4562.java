package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۖۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4562 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5232 f10225;

    public C4562(C5232 c5232) {
        this.f10225 = c5232;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5232 c5232 = this.f10225;
        try {
            c5232.f12300.dismiss();
        } catch (Exception unused) {
        }
        c5232.f12322.removeAllViews();
    }
}
