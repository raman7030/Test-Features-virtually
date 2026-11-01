package p067l;

/* JADX INFO: renamed from: l.ܺ֡ */
/* JADX INFO: compiled from: O19T */
/* JADX INFO: loaded from: classes4.dex */
public final class C1615 extends AbstractC1860 {

    /* JADX INFO: renamed from: ֫ */
    public double[] f51114;

    /* JADX INFO: renamed from: ۧ */
    public double[][] f51115;

    public C1615(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f51114 = dArr;
        this.f51115 = dArr2;
        if (length2 > 2) {
            double d = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d2 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d2 - d, d2 - d);
                }
                i++;
                d = d2;
            }
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final void mo9248(double d, double[] dArr) {
        double[] dArr2 = this.f51114;
        int length = dArr2.length;
        double[][] dArr3 = this.f51115;
        int i = 0;
        int length2 = dArr3[0].length;
        if (d <= dArr2[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = dArr3[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr2[i3]) {
            while (i < length2) {
                dArr[i] = dArr3[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d2 = dArr2[i6];
            if (d < d2) {
                double d3 = dArr2[i4];
                double d4 = (d - d3) / (d2 - d3);
                while (i < length2) {
                    dArr[i] = (dArr3[i6][i] * d4) + ((1.0d - d4) * dArr3[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final void mo9249(double d, float[] fArr) {
        double[] dArr = this.f51114;
        int length = dArr.length;
        double[][] dArr2 = this.f51115;
        int i = 0;
        int length2 = dArr2[0].length;
        if (d <= dArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) dArr2[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            while (i < length2) {
                fArr[i] = (float) dArr2[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == dArr[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr2[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d2 = dArr[i6];
            if (d < d2) {
                double d3 = dArr[i4];
                double d4 = (d - d3) / (d2 - d3);
                while (i < length2) {
                    fArr[i] = (float) ((dArr2[i6][i] * d4) + ((1.0d - d4) * dArr2[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final double mo9247(double d) {
        double[] dArr = this.f51114;
        int length = dArr.length;
        double d2 = dArr[0];
        double[][] dArr2 = this.f51115;
        if (d <= d2) {
            return dArr2[0][0];
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return dArr2[i][0];
        }
        int i2 = 0;
        while (i2 < i) {
            double d3 = dArr[i2];
            if (d == d3) {
                return dArr2[i2][0];
            }
            int i3 = i2 + 1;
            double d4 = dArr[i3];
            if (d < d4) {
                double d5 = (d - d3) / (d4 - d3);
                return (dArr2[i3][0] * d5) + ((1.0d - d5) * dArr2[i2][0]);
            }
            i2 = i3;
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ۧ */
    public final void mo9252(double d, double[] dArr) {
        double[] dArr2 = this.f51114;
        int length = dArr2.length;
        double[][] dArr3 = this.f51115;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            d = d2;
        } else {
            d2 = dArr2[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d <= d3) {
                double d4 = d3 - dArr2[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ۧ */
    public final double mo9251(double d) {
        double[] dArr = this.f51114;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d < d2) {
            d = d2;
        } else {
            d2 = dArr[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d <= d3) {
                double d4 = d3 - dArr[i];
                double[][] dArr2 = this.f51115;
                return (dArr2[i2][0] - dArr2[i][0]) / d4;
            }
            i = i2;
        }
        return 0.0d;
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final double[] mo9250() {
        return this.f51114;
    }
}
