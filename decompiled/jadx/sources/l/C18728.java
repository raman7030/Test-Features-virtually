package l;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: l.ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V32V */
/* JADX INFO: loaded from: classes4.dex */
public final class C18728 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43352(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m43351(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m43350(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }
}
