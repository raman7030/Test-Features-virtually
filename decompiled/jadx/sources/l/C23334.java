package l;

/* JADX INFO: renamed from: l.᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes.dex */
public final class C23334 extends AbstractC20513 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14161[] f74991;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double[] f74992;

    public C23334(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f74992 = dArr;
        this.f74991 = new C14161[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C14161[] c14161Arr = this.f74991;
            if (i >= c14161Arr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (i4 == 2) {
                i2 = 2;
                i3 = 2;
            } else if (i4 == 3) {
                i2 = i2 == 1 ? 2 : 1;
                i3 = i2;
            }
            double d = dArr[i];
            int i5 = i + 1;
            double d2 = dArr[i5];
            double[] dArr3 = dArr2[i];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i5];
            c14161Arr[i] = new C14161(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final void mo7169(double d, double[] dArr) {
        C14161[] c14161Arr = this.f74991;
        double d2 = c14161Arr[0].f42749;
        if (d < d2) {
            d = d2;
        }
        if (d > c14161Arr[c14161Arr.length - 1].f42748) {
            d = c14161Arr[c14161Arr.length - 1].f42748;
        }
        for (int i = 0; i < c14161Arr.length; i++) {
            C14161 c14161 = c14161Arr[i];
            if (d <= c14161.f42748) {
                if (c14161.f42743) {
                    dArr[0] = c14161.m33797(d);
                    dArr[1] = c14161Arr[i].m33798(d);
                    return;
                }
                c14161.m33799(d);
                C14161 c14162 = c14161Arr[i];
                dArr[0] = (c14162.f42755 * c14162.f42744) + c14162.f42751;
                dArr[1] = (c14162.f42754 * c14162.f42752) + c14162.f42759;
                return;
            }
        }
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final void mo7170(double d, float[] fArr) {
        C14161[] c14161Arr = this.f74991;
        double d2 = c14161Arr[0].f42749;
        if (d < d2) {
            d = d2;
        } else if (d > c14161Arr[c14161Arr.length - 1].f42748) {
            d = c14161Arr[c14161Arr.length - 1].f42748;
        }
        for (int i = 0; i < c14161Arr.length; i++) {
            C14161 c14161 = c14161Arr[i];
            if (d <= c14161.f42748) {
                if (c14161.f42743) {
                    fArr[0] = (float) c14161.m33797(d);
                    fArr[1] = (float) c14161Arr[i].m33798(d);
                    return;
                }
                c14161.m33799(d);
                C14161 c14162 = c14161Arr[i];
                fArr[0] = (float) ((c14162.f42755 * c14162.f42744) + c14162.f42751);
                fArr[1] = (float) ((c14162.f42754 * c14162.f42752) + c14162.f42759);
                return;
            }
        }
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ۧ */
    public final void mo7173(double d, double[] dArr) {
        C14161[] c14161Arr = this.f74991;
        double d2 = c14161Arr[0].f42749;
        if (d < d2) {
            d = d2;
        } else if (d > c14161Arr[c14161Arr.length - 1].f42748) {
            d = c14161Arr[c14161Arr.length - 1].f42748;
        }
        for (int i = 0; i < c14161Arr.length; i++) {
            C14161 c14161 = c14161Arr[i];
            if (d <= c14161.f42748) {
                if (c14161.f42743) {
                    dArr[0] = c14161.f42751;
                    dArr[1] = c14161.f42759;
                    return;
                }
                c14161.m33799(d);
                dArr[0] = c14161Arr[i].m33796();
                C14161 c14162 = c14161Arr[i];
                double d3 = c14162.f42755 * c14162.f42752;
                double d4 = (-c14162.f42754) * c14162.f42744;
                double dHypot = c14162.f42753 / Math.hypot(d3, d4);
                dArr[1] = c14162.f42745 ? (-d4) * dHypot : d4 * dHypot;
                return;
            }
        }
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final double mo7168(double d) {
        C14161[] c14161Arr = this.f74991;
        double d2 = c14161Arr[0].f42749;
        if (d < d2) {
            d = d2;
        } else if (d > c14161Arr[c14161Arr.length - 1].f42748) {
            d = c14161Arr[c14161Arr.length - 1].f42748;
        }
        for (int i = 0; i < c14161Arr.length; i++) {
            C14161 c14161 = c14161Arr[i];
            if (d <= c14161.f42748) {
                if (c14161.f42743) {
                    return c14161.m33797(d);
                }
                c14161.m33799(d);
                C14161 c14162 = c14161Arr[i];
                return (c14162.f42755 * c14162.f42744) + c14162.f42751;
            }
        }
        return Double.NaN;
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ۧ */
    public final double mo7172(double d) {
        C14161[] c14161Arr = this.f74991;
        double d2 = c14161Arr[0].f42749;
        if (d < d2) {
            d = d2;
        }
        if (d > c14161Arr[c14161Arr.length - 1].f42748) {
            d = c14161Arr[c14161Arr.length - 1].f42748;
        }
        for (int i = 0; i < c14161Arr.length; i++) {
            C14161 c14161 = c14161Arr[i];
            if (d <= c14161.f42748) {
                if (!c14161.f42743) {
                    c14161.m33799(d);
                    return c14161Arr[i].m33796();
                }
                return c14161.f42751;
            }
        }
        return Double.NaN;
    }

    @Override // l.AbstractC20513
    /* JADX INFO: renamed from: ֫ */
    public final double[] mo7171() {
        return this.f74992;
    }
}
