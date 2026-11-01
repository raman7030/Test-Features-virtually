package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۢ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11678 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC21066 f32573;

    public C11678(ViewOnClickListenerC21066 viewOnClickListenerC21066) {
        this.f32573 = viewOnClickListenerC21066;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32573.f66165.setVisibility(8);
    }
}
