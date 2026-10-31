package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.֨۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1138 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4113 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f4111 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4114 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4116 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4112 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Interpolator f4115 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3873(int i) {
        this.f4113 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3876() {
        return this.f4113 >= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3875(C13132 c13132) {
        int i = this.f4113;
        if (i >= 0) {
            this.f4113 = -1;
            c13132.jumpToPositionForSmoothScroller(i);
            this.f4111 = false;
        } else if (this.f4111) {
            Interpolator interpolator = this.f4115;
            if (interpolator != null && this.f4112 < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f4112;
            if (i2 >= 1) {
                c13132.mViewFlinger.m13723(this.f4114, this.f4116, interpolator, i2);
                this.f4111 = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3874(int i, int i2, Interpolator interpolator, int i3) {
        this.f4114 = i;
        this.f4116 = i2;
        this.f4112 = i3;
        this.f4115 = interpolator;
        this.f4111 = true;
    }
}
