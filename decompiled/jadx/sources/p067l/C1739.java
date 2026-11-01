package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ᩳܰ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public class C1739 {

    /* JADX INFO: renamed from: ֫ */
    public final long f59526;

    /* JADX INFO: renamed from: ۧ */
    public float f59527;

    /* JADX INFO: renamed from: ܽ */
    public final Interpolator f59528;

    /* JADX INFO: renamed from: ᩳ */
    public final int f59529;

    public C1739(int i, Interpolator interpolator, long j) {
        this.f59529 = i;
        this.f59528 = interpolator;
        this.f59526 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo41427() {
        return this.f59529;
    }

    /* JADX INFO: renamed from: ۧ */
    public float mo41426() {
        Interpolator interpolator = this.f59528;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f59527);
        }
        return this.f59527;
    }

    /* JADX INFO: renamed from: ֫ */
    public long mo41424() {
        return this.f59526;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo41425(float f) {
        this.f59527 = f;
    }
}
