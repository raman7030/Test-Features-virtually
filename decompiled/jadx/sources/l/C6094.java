package l;

/* JADX INFO: renamed from: l.ۛܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6094 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double f18672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double f18673;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f18674;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f18675;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double f18676;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f18677;

    public C6094(int i, int i2, double d, double d2, double d3, float f) {
        this.f18677 = i;
        this.f18675 = i2;
        this.f18676 = d;
        this.f18672 = d2;
        this.f18673 = d3;
        this.f18674 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17004() {
        int i;
        int i2 = this.f18677;
        if (i2 <= 0 || (i = this.f18675) <= 0) {
            return false;
        }
        double d = this.f18676;
        if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
            return false;
        }
        double d2 = this.f18672 * ((double) i2) * 8.0d * 2.0d;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return false;
        }
        double d3 = this.f18673 * ((double) i) * 8.0d * 2.0d;
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            return false;
        }
        float f = this.f18674;
        return f >= -180.0f && f < 180.0f;
    }
}
