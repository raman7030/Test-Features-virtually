package p067l;

/* JADX INFO: renamed from: l.ۢ֡ */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1300 extends C1265 {

    /* JADX INFO: renamed from: ܳ */
    public double f30868;

    /* JADX INFO: renamed from: ܿ */
    public double f30869;

    /* JADX INFO: renamed from: ᩳ */
    public double f30870;

    /* JADX INFO: renamed from: ᩻ */
    public double f30871;

    public C1300(String str) {
        this.f28951 = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f30870 = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.f30868 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.f30869 = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.f30871 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    /* JADX INFO: renamed from: ܽ */
    private double m25665(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f30869 * d5) + (this.f30870 * d4) + (d * d * d);
    }

    /* JADX INFO: renamed from: ᩳ */
    private double m25666(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f30871 * d5) + (this.f30868 * d4) + (d * d * d);
    }

    @Override // p067l.C1265
    /* JADX INFO: renamed from: ۧ */
    public final double mo24180(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m25665(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m25666(d5) - m25666(d4)) / (m25665(d5) - m25665(d4));
    }

    @Override // p067l.C1265
    /* JADX INFO: renamed from: ֫ */
    public final double mo24179(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = m25665(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dM25665 = m25665(d4);
        double d5 = d3 + d2;
        double dM25666 = m25665(d5);
        double dM25667 = m25666(d4);
        return (((d - dM25665) * (m25666(d5) - dM25667)) / (dM25666 - dM25665)) + dM25667;
    }
}
