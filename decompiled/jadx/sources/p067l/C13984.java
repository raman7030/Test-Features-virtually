package p067l;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: renamed from: l.۫ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13984 {
    /* JADX INFO: renamed from: ֫ */
    public static long m31780(Animator animator) {
        return animator.getTotalDuration();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31781(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
