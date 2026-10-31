package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14835 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21187 f45248;

    public C14835(C21187 c21187) {
        this.f45248 = c21187;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C21187 c21187 = this.f45248;
        ArrayList arrayList = new ArrayList(c21187.f68287);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18364) arrayList.get(i)).onAnimationStart(c21187);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C21187 c21187 = this.f45248;
        ArrayList arrayList = new ArrayList(c21187.f68287);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18364) arrayList.get(i)).onAnimationEnd(c21187);
        }
    }
}
