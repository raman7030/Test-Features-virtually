package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes4.dex */
public final class C16468 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22505 f48364;

    public C16468(C22505 c22505) {
        this.f48364 = c22505;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C22505 c22505 = this.f48364;
        ArrayList arrayList = new ArrayList(c22505.f70969);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC19822) arrayList.get(i)).onAnimationStart(c22505);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C22505 c22505 = this.f48364;
        ArrayList arrayList = new ArrayList(c22505.f70969);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC19822) arrayList.get(i)).onAnimationEnd(c22505);
        }
    }
}
