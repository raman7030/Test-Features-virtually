package p067l;

/* JADX INFO: renamed from: l.۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6WD */
/* JADX INFO: loaded from: classes2.dex */
public final class C9347 {

    /* JADX INFO: renamed from: ֫ */
    public final float f25473;

    /* JADX INFO: renamed from: ۧ */
    public final float f25474;

    /* JADX INFO: renamed from: ܽ */
    public final float f25475;

    /* JADX INFO: renamed from: ᩳ */
    public final float f25476;

    public C9347(float[] fArr) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        float f = fArr[0];
        float f2 = fArr[5];
        float f3 = fArr[10];
        double d8 = f + f2 + f3;
        if (d8 > 0.0d) {
            double dSqrt = Math.sqrt(d8 + 1.0d) * 2.0d;
            d = dSqrt / 4.0d;
            d6 = ((double) (fArr[6] - fArr[9])) / dSqrt;
            d7 = ((double) (fArr[8] - fArr[2])) / dSqrt;
            d5 = ((double) (fArr[1] - fArr[4])) / dSqrt;
        } else if (f <= f2 || f <= f3) {
            if (f2 > f3) {
                double dSqrt2 = Math.sqrt(((f2 + 1.0f) - f) - f3) * 2.0d;
                d = ((double) (fArr[8] - fArr[2])) / dSqrt2;
                d2 = ((double) (fArr[4] + fArr[1])) / dSqrt2;
                d3 = dSqrt2 / 4.0d;
                d4 = ((double) (fArr[9] + fArr[6])) / dSqrt2;
            } else {
                double dSqrt3 = Math.sqrt(((f3 + 1.0f) - f) - f2) * 2.0d;
                d = ((double) (fArr[1] - fArr[4])) / dSqrt3;
                d2 = ((double) (fArr[8] + fArr[2])) / dSqrt3;
                d3 = ((double) (fArr[9] + fArr[6])) / dSqrt3;
                d4 = dSqrt3 / 4.0d;
            }
            double d9 = d2;
            d5 = d4;
            d6 = d9;
            d7 = d3;
        } else {
            double dSqrt4 = Math.sqrt(((f + 1.0f) - f2) - f3) * 2.0d;
            d = ((double) (fArr[6] - fArr[9])) / dSqrt4;
            d6 = dSqrt4 / 4.0d;
            double d10 = ((double) (fArr[4] + fArr[1])) / dSqrt4;
            d5 = ((double) (fArr[8] + fArr[2])) / dSqrt4;
            d7 = d10;
        }
        if (d < 0.0d) {
            d = -d;
            d6 = -d6;
            d7 = -d7;
            d5 = -d5;
        }
        double dSqrt5 = Math.sqrt((d5 * d5) + (d7 * d7) + (d6 * d6));
        if (dSqrt5 < 1.0E-8d) {
            this.f25474 = 0.0f;
            this.f25475 = 1.0f;
            this.f25476 = 0.0f;
            this.f25473 = 0.0f;
            return;
        }
        this.f25474 = (float) (d6 / dSqrt5);
        this.f25475 = (float) (d7 / dSqrt5);
        this.f25476 = (float) (d5 / dSqrt5);
        this.f25473 = (float) Math.toDegrees(Math.atan2(dSqrt5, d) * 2.0d);
    }
}
