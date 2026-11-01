package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10629 {

    /* JADX INFO: renamed from: ֫ */
    public final double[] f29398;

    /* JADX INFO: renamed from: ۜ */
    public final int[] f29399;

    /* JADX INFO: renamed from: ۧ */
    public double f29400;

    /* JADX INFO: renamed from: ܳ */
    public final double[] f29401;

    /* JADX INFO: renamed from: ܽ */
    public int f29402;

    /* JADX INFO: renamed from: ܿ */
    public double f29403;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f29404;

    /* JADX INFO: renamed from: ᩻ */
    public int f29405;

    public C10629(int i) {
        this.f29399 = new int[i];
        this.f29404 = new int[i];
        this.f29398 = new double[i];
        this.f29401 = new double[i + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24434() {
        return this.f29399.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24435(double d) {
        int[] iArr = this.f29399;
        int i = 0;
        double d2 = 0.0d;
        for (int iHighestOneBit = Integer.highestOneBit(iArr.length); iHighestOneBit != 0; iHighestOneBit >>= 1) {
            int i2 = i + iHighestOneBit;
            if (i2 <= iArr.length) {
                double d3 = this.f29401[i2];
                if (d2 + d3 <= d) {
                    d2 += d3;
                    i = i2;
                }
            }
        }
        return Math.min(iArr.length - 1, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final double m24439() {
        return Math.max(0.0d, m24441(this.f29399.length) - this.f29400);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m24444(int i) {
        return this.f29399[i] > 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m24445(int i) {
        return this.f29399[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24436(int i) {
        return this.f29404[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24437(int i, float f, int i2) {
        this.f29405 = i;
        this.f29402 = i2;
        this.f29400 = 2.0f * f;
        this.f29403 = Math.max(f * 48.0f, ((double) i2) / 24.0d);
        double[] dArr = this.f29401;
        Arrays.fill(dArr, 0.0d);
        int i3 = 0;
        while (i3 < this.f29399.length) {
            double dM24433 = m24433(i3);
            double[] dArr2 = this.f29398;
            dArr2[i3] = dM24433;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m24438(int i, int i2, int i3) {
        this.f29399[i] = i2;
        this.f29404[i] = i3;
        double dM24433 = m24433(i);
        double[] dArr = this.f29398;
        double d = dM24433 - dArr[i];
        dArr[i] = dM24433;
        int i4 = i + 1;
        while (true) {
            double[] dArr2 = this.f29401;
            if (i4 >= dArr2.length) {
                return;
            }
            dArr2[i4] = dArr2[i4] + d;
            i4 += (-i4) & i4;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private double m24433(int i) {
        return (m24444(i) ? Math.max(this.f29403, ((double) this.f29404[i]) * m24443(i)) : Math.max(1, this.f29402)) + this.f29400;
    }

    /* JADX INFO: renamed from: ܿ */
    public final double m24443(int i) {
        if (m24444(i)) {
            return Math.min(4.0d, ((double) this.f29405) / ((double) this.f29399[i]));
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: ܽ */
    public final double m24442(int i) {
        return this.f29398[i] - this.f29400;
    }

    /* JADX INFO: renamed from: ۧ */
    public final double m24440(int i) {
        return (m24442(i) - (((double) this.f29404[i]) * m24443(i))) / 2.0d;
    }

    /* JADX INFO: renamed from: ܳ */
    public final double m24441(int i) {
        double d = 0.0d;
        while (i > 0) {
            d += this.f29401[i];
            i -= (-i) & i;
        }
        return d;
    }
}
