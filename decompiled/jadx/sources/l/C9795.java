package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۢ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9795 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19673 f29622;

    public C9795(ViewOnClickListenerC19673 viewOnClickListenerC19673) {
        this.f29622 = viewOnClickListenerC19673;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f29622.f63544.setVisibility(8);
    }
}
