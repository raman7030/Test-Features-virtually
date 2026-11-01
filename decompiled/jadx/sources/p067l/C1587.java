package p067l;

/* JADX INFO: renamed from: l.ܶۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1587 extends AbstractInterpolatorC1097 {

    /* JADX INFO: renamed from: ܽ */
    public float f48903;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C1342 f48904;

    /* JADX INFO: renamed from: ۧ */
    public float f48902 = 0.0f;

    /* JADX INFO: renamed from: ֫ */
    public float f48901 = 0.0f;

    public C1587(C1342 c1342) {
        this.f48904 = c1342;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.f48902;
        C1342 c1342 = this.f48904;
        if (f2 > 0.0f) {
            float f3 = this.f48903;
            if (f2 / f3 < f) {
                f = f2 / f3;
            }
            c1342.f33302 = f2 - (f3 * f);
            return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f48901;
        }
        float f4 = this.f48903;
        if ((-f2) / f4 < f) {
            f = (-f2) / f4;
        }
        c1342.f33302 = (f4 * f) + f2;
        return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f48901;
    }

    @Override // p067l.AbstractInterpolatorC1097
    /* JADX INFO: renamed from: ֫ */
    public final float mo16605() {
        return this.f48904.f33302;
    }
}
