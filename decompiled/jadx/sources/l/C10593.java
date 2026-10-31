package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: l.ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10593 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17376 f31798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f31799;

    public C10593(View view, C17376 c17376) {
        this.f31798 = c17376;
        this.f31799 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C17376 c17376 = this.f31798;
        c17376.m40723(1.0f);
        C23292.m51611(this.f31799, c17376);
    }
}
