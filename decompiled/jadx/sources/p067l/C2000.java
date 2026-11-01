package p067l;

/* JADX INFO: renamed from: l.᩻֡ */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes.dex */
public final class C2000 extends AbstractC1860 {

    /* JADX INFO: renamed from: ֫ */
    public C1545[] f77738;

    /* JADX INFO: renamed from: ۧ */
    public final double[] f77739;

    public C2000(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f77739 = dArr;
        this.f77738 = new C1545[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C1545[] c1545Arr = this.f77738;
            if (i >= c1545Arr.length) {
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
            c1545Arr[i] = new C1545(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final void mo9248(double d, double[] dArr) {
        C1545[] c1545Arr = this.f77738;
        double d2 = c1545Arr[0].f45837;
        if (d < d2) {
            d = d2;
        }
        if (d > c1545Arr[c1545Arr.length - 1].f45836) {
            d = c1545Arr[c1545Arr.length - 1].f45836;
        }
        for (int i = 0; i < c1545Arr.length; i++) {
            C1545 c1545 = c1545Arr[i];
            if (d <= c1545.f45836) {
                if (c1545.f45831) {
                    dArr[0] = c1545.m35929(d);
                    dArr[1] = c1545Arr[i].m35930(d);
                    return;
                }
                c1545.m35931(d);
                C1545 c1546 = c1545Arr[i];
                dArr[0] = (c1546.f45843 * c1546.f45832) + c1546.f45839;
                dArr[1] = (c1546.f45842 * c1546.f45840) + c1546.f45847;
                return;
            }
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final void mo9249(double d, float[] fArr) {
        C1545[] c1545Arr = this.f77738;
        double d2 = c1545Arr[0].f45837;
        if (d < d2) {
            d = d2;
        } else if (d > c1545Arr[c1545Arr.length - 1].f45836) {
            d = c1545Arr[c1545Arr.length - 1].f45836;
        }
        for (int i = 0; i < c1545Arr.length; i++) {
            C1545 c1545 = c1545Arr[i];
            if (d <= c1545.f45836) {
                if (c1545.f45831) {
                    fArr[0] = (float) c1545.m35929(d);
                    fArr[1] = (float) c1545Arr[i].m35930(d);
                    return;
                }
                c1545.m35931(d);
                C1545 c1546 = c1545Arr[i];
                fArr[0] = (float) ((c1546.f45843 * c1546.f45832) + c1546.f45839);
                fArr[1] = (float) ((c1546.f45842 * c1546.f45840) + c1546.f45847);
                return;
            }
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ۧ */
    public final void mo9252(double d, double[] dArr) {
        C1545[] c1545Arr = this.f77738;
        double d2 = c1545Arr[0].f45837;
        if (d < d2) {
            d = d2;
        } else if (d > c1545Arr[c1545Arr.length - 1].f45836) {
            d = c1545Arr[c1545Arr.length - 1].f45836;
        }
        for (int i = 0; i < c1545Arr.length; i++) {
            C1545 c1545 = c1545Arr[i];
            if (d <= c1545.f45836) {
                if (c1545.f45831) {
                    dArr[0] = c1545.f45839;
                    dArr[1] = c1545.f45847;
                    return;
                }
                c1545.m35931(d);
                dArr[0] = c1545Arr[i].m35928();
                C1545 c1546 = c1545Arr[i];
                double d3 = c1546.f45843 * c1546.f45840;
                double d4 = (-c1546.f45842) * c1546.f45832;
                double dHypot = c1546.f45841 / Math.hypot(d3, d4);
                dArr[1] = c1546.f45833 ? (-d4) * dHypot : d4 * dHypot;
                return;
            }
        }
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final double mo9247(double d) {
        C1545[] c1545Arr = this.f77738;
        double d2 = c1545Arr[0].f45837;
        if (d < d2) {
            d = d2;
        } else if (d > c1545Arr[c1545Arr.length - 1].f45836) {
            d = c1545Arr[c1545Arr.length - 1].f45836;
        }
        for (int i = 0; i < c1545Arr.length; i++) {
            C1545 c1545 = c1545Arr[i];
            if (d <= c1545.f45836) {
                if (c1545.f45831) {
                    return c1545.m35929(d);
                }
                c1545.m35931(d);
                C1545 c1546 = c1545Arr[i];
                return (c1546.f45843 * c1546.f45832) + c1546.f45839;
            }
        }
        return Double.NaN;
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ۧ */
    public final double mo9251(double d) {
        C1545[] c1545Arr = this.f77738;
        double d2 = c1545Arr[0].f45837;
        if (d < d2) {
            d = d2;
        }
        if (d > c1545Arr[c1545Arr.length - 1].f45836) {
            d = c1545Arr[c1545Arr.length - 1].f45836;
        }
        for (int i = 0; i < c1545Arr.length; i++) {
            C1545 c1545 = c1545Arr[i];
            if (d <= c1545.f45836) {
                if (!c1545.f45831) {
                    c1545.m35931(d);
                    return c1545Arr[i].m35928();
                }
                return c1545.f45839;
            }
        }
        return Double.NaN;
    }

    @Override // p067l.AbstractC1860
    /* JADX INFO: renamed from: ֫ */
    public final double[] mo9250() {
        return this.f77739;
    }
}
