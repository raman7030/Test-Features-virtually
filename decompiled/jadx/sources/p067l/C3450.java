package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.֨۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3450 {

    /* JADX INFO: renamed from: ܳ */
    public int f6882 = -1;

    /* JADX INFO: renamed from: ֫ */
    public boolean f6880 = false;

    /* JADX INFO: renamed from: ܽ */
    public int f6883 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f6885 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f6881 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܿ */
    public Interpolator f6884 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m6114(int i) {
        this.f6882 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6117() {
        return this.f6882 >= 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6116(C14849 c14849) {
        int i = this.f6882;
        if (i >= 0) {
            this.f6882 = -1;
            c14849.jumpToPositionForSmoothScroller(i);
            this.f6880 = false;
        } else if (this.f6880) {
            Interpolator interpolator = this.f6884;
            if (interpolator != null && this.f6881 < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f6881;
            if (i2 >= 1) {
                c14849.mViewFlinger.m15598(this.f6883, this.f6885, interpolator, i2);
                this.f6880 = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6115(int i, int i2, Interpolator interpolator, int i3) {
        this.f6883 = i;
        this.f6885 = i2;
        this.f6881 = i3;
        this.f6884 = interpolator;
        this.f6880 = true;
    }
}
