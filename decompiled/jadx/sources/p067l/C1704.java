package p067l;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܿܰ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C1704 {

    /* JADX INFO: renamed from: ֫ */
    public C1739 f56378;

    public C1704(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f56378 = new C1669(C1542.m35855(i, interpolator, j));
        } else {
            this.f56378 = new C1997(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m42977() {
        return this.f56378.mo41427();
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m42976() {
        return this.f56378.mo41426();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m42974() {
        return this.f56378.mo41424();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42975(float f) {
        this.f56378.mo41425(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1704 m42973(WindowInsetsAnimation windowInsetsAnimation) {
        C1704 c1704 = new C1704(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            c1704.f56378 = new C1669(windowInsetsAnimation);
        }
        return c1704;
    }
}
