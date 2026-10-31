package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۖۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2308 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f7439;

    public C2308(C3013 c3013) {
        this.f7439 = c3013;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3013 c3013 = this.f7439;
        try {
            c3013.f9502.dismiss();
        } catch (Exception unused) {
        }
        c3013.f9524.removeAllViews();
    }
}
