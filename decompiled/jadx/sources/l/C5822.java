package l;

/* JADX INFO: renamed from: l.ۛۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5822 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f17876;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17877;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17876.compareTo(((C5822) obj).f17876);
    }

    public C5822(C3454 c3454) {
        super(c3454);
        this.f17877 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5822 m16320(String str, C3454 c3454) {
        C5822 c5822 = new C5822(c3454);
        c5822.f17877 = 0;
        c5822.f17876 = str;
        return (C5822) c3454.f10946.m25237(c5822);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        c10720.m26903();
        this.f17876 = c10720.m26900();
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return C11166.m27697(this.f17876.length()) + i + C4303.m12899(this.f17876).length + 1;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        byte[] bArrM12899 = C4303.m12899(this.f17876);
        c1547.m5301(this.f17876.length());
        c1547.m5298(bArrM12899, 0, bArrM12899.length);
        c1547.m5300(0);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "string_data_item: \"" + C4303.m12898(this.f17876) + "\"";
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m16322() {
        return this.f17876;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16321(String str) {
        this.f17876 = str;
    }

    public final int hashCode() {
        if (this.f17877 == 0) {
            this.f17877 = this.f17876.hashCode();
        }
        return this.f17877;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5822.class.equals(obj.getClass())) {
            return false;
        }
        return this.f17876.equals(((C5822) obj).f17876);
    }
}
