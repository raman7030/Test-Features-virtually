package l;

/* JADX INFO: renamed from: l.ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15012 extends AbstractInterpolatorC5136 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f45786;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10075 f45787;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f45785 = 0.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f45784 = 0.0f;

    public C15012(C10075 c10075) {
        this.f45787 = c10075;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.f45785;
        C10075 c10075 = this.f45787;
        if (f2 > 0.0f) {
            float f3 = this.f45786;
            if (f2 / f3 < f) {
                f = f2 / f3;
            }
            c10075.f30341 = f2 - (f3 * f);
            return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f45784;
        }
        float f4 = this.f45786;
        if ((-f2) / f4 < f) {
            f = (-f2) / f4;
        }
        c10075.f30341 = (f4 * f) + f2;
        return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f45784;
    }

    @Override // l.AbstractInterpolatorC5136
    /* JADX INFO: renamed from: ֫ */
    public final float mo14697() {
        return this.f45787.f30341;
    }
}
