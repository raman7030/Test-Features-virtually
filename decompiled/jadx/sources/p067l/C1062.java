package p067l;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: l.ۙۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1062 implements InterfaceC1832 {

    /* JADX INFO: renamed from: ۧ */
    public static C1062 f16988 = new C1062();

    /* JADX INFO: renamed from: ֫ */
    public VelocityTracker f16989;

    /* JADX INFO: renamed from: ֫ */
    public static C1062 m15031() {
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        C1062 c1062 = f16988;
        c1062.f16989 = velocityTrackerObtain;
        return c1062;
    }
}
