package p067l;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: l.ᩴۨ */
/* JADX INFO: compiled from: V32V */
/* JADX INFO: loaded from: classes4.dex */
public final class C1771 {
    /* JADX INFO: renamed from: ۧ */
    public static boolean m45619(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m45618(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m45617(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }
}
