package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8692 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double[] f26473;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f26474;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f26475;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double[] f26476;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26477;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f26478;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f26479;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f26480;

    public C8692(int i) {
        this.f26474 = new int[i];
        this.f26479 = new int[i];
        this.f26473 = new double[i];
        this.f26476 = new double[i + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22465() {
        return this.f26474.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22466(double d) {
        int[] iArr = this.f26474;
        int i = 0;
        double d2 = 0.0d;
        for (int iHighestOneBit = Integer.highestOneBit(iArr.length); iHighestOneBit != 0; iHighestOneBit >>= 1) {
            int i2 = i + iHighestOneBit;
            if (i2 <= iArr.length) {
                double d3 = this.f26476[i2];
                if (d2 + d3 <= d) {
                    d2 += d3;
                    i = i2;
                }
            }
        }
        return Math.min(iArr.length - 1, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double m22470() {
        return Math.max(0.0d, m22472(this.f26474.length) - this.f26475);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m22475(int i) {
        return this.f26474[i] > 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m22476(int i) {
        return this.f26474[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22467(int i) {
        return this.f26479[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22468(int i, float f, int i2) {
        this.f26480 = i;
        this.f26477 = i2;
        this.f26475 = 2.0f * f;
        this.f26478 = Math.max(f * 48.0f, ((double) i2) / 24.0d);
        double[] dArr = this.f26476;
        Arrays.fill(dArr, 0.0d);
        int i3 = 0;
        while (i3 < this.f26474.length) {
            double dM22464 = m22464(i3);
            double[] dArr2 = this.f26473;
            dArr2[i3] = dM22464;
            int i4 = i3 + 1;
            double d = dArr[i4] + dArr2[i3];
            dArr[i4] = d;
            int i5 = ((-i4) & i4) + i4;
            if (i5 < dArr.length) {
                dArr[i5] = dArr[i5] + d;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22469(int i, int i2, int i3) {
        this.f26474[i] = i2;
        this.f26479[i] = i3;
        double dM22464 = m22464(i);
        double[] dArr = this.f26473;
        double d = dM22464 - dArr[i];
        dArr[i] = dM22464;
        int i4 = i + 1;
        while (true) {
            double[] dArr2 = this.f26476;
            if (i4 >= dArr2.length) {
                return;
            }
            dArr2[i4] = dArr2[i4] + d;
            i4 += (-i4) & i4;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private double m22464(int i) {
        return (m22475(i) ? Math.max(this.f26478, ((double) this.f26479[i]) * m22474(i)) : Math.max(1, this.f26477)) + this.f26475;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double m22474(int i) {
        if (m22475(i)) {
            return Math.min(4.0d, ((double) this.f26480) / ((double) this.f26474[i]));
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final double m22473(int i) {
        return this.f26473[i] - this.f26475;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double m22471(int i) {
        return (m22473(i) - (((double) this.f26479[i]) * m22474(i))) / 2.0d;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m22472(int i) {
        double d = 0.0d;
        while (i > 0) {
            d += this.f26476[i];
            i -= (-i) & i;
        }
        return d;
    }
}
