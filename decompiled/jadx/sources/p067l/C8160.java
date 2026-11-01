package p067l;

/* JADX INFO: renamed from: l.ۛܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes2.dex */
public final class C8160 {

    /* JADX INFO: renamed from: ֫ */
    public final double f21528;

    /* JADX INFO: renamed from: ۧ */
    public final double f21529;

    /* JADX INFO: renamed from: ܳ */
    public final float f21530;

    /* JADX INFO: renamed from: ܽ */
    public final int f21531;

    /* JADX INFO: renamed from: ܿ */
    public final double f21532;

    /* JADX INFO: renamed from: ᩳ */
    public final int f21533;

    public C8160(int i, int i2, double d, double d2, double d3, float f) {
        this.f21533 = i;
        this.f21531 = i2;
        this.f21532 = d;
        this.f21528 = d2;
        this.f21529 = d3;
        this.f21530 = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18935() {
        int i;
        int i2 = this.f21533;
        if (i2 <= 0 || (i = this.f21531) <= 0) {
            return false;
        }
        double d = this.f21532;
        if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
            return false;
        }
        double d2 = this.f21528 * ((double) i2) * 8.0d * 2.0d;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return false;
        }
        double d3 = this.f21529 * ((double) i) * 8.0d * 2.0d;
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            return false;
        }
        float f = this.f21530;
        return f >= -180.0f && f < 180.0f;
    }
}
