package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.֫۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1701 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f5892;

    public C1701(C20752 c20752) {
        this.f5892 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C20752 c20752 = this.f5892;
        if (c20752.f66826 != null) {
            c20752.f66826.setVisibility(0);
        }
        if (c20752.f66827 != null) {
            c20752.f66827.setVisibility(0);
        }
        if (c20752.f66829 != null) {
            c20752.f66829.setVisibility(c20752.f66828 ? 0 : 4);
        }
        if (!(c20752.f66821 instanceof C7263) || c20752.f66828) {
            return;
        }
        ((C7263) c20752.f66821).m19502();
    }
}
