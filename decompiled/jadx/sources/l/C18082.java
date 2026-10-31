package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public class C18082 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f56314;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f56315;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Interpolator f56316;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56317;

    public C18082(int i, Interpolator interpolator, long j) {
        this.f56317 = i;
        this.f56316 = interpolator;
        this.f56314 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo39192() {
        return this.f56317;
    }

    /* JADX INFO: renamed from: ۧ */
    public float mo39191() {
        Interpolator interpolator = this.f56316;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56315);
        }
        return this.f56315;
    }

    /* JADX INFO: renamed from: ֫ */
    public long mo39189() {
        return this.f56314;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo39190(float f) {
        this.f56315 = f;
    }
}
