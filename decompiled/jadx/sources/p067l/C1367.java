package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: l.ۤ᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1367 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1704 f34769;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f34770;

    public C1367(View view, C1704 c1704) {
        this.f34769 = c1704;
        this.f34770 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1704 c1704 = this.f34769;
        c1704.m42975(1.0f);
        C1997.m54007(this.f34770, c1704);
    }
}
