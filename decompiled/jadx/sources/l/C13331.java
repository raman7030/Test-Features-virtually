package l;

/* JADX INFO: renamed from: l.۬᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13331 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f39890;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6276 f39891;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f39891.compareTo(((C13331) obj).f39891);
    }

    public C13331(C3454 c3454) {
        super(c3454);
        this.f39890 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13331 m32313(C3454 c3454, C6276 c6276) {
        C13331 c13331 = new C13331(c3454);
        c13331.f39890 = 0;
        c13331.f39891 = c6276;
        return (C13331) c3454.f10949.m25237(c13331);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        this.f39891 = new C6276(this.f16031, c10720);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return this.f39891.mo5433(i);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        this.f39891.mo5434(c1547);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return C13540.m32584(new StringBuilder("encoded_array @0x"), this.f16030);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6276 m32314() {
        return this.f39891;
    }

    public final int hashCode() {
        if (this.f39890 == 0) {
            this.f39890 = this.f39891.hashCode();
        }
        return this.f39890;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C13331.class.equals(obj.getClass()) && this.f39891.compareTo(((C13331) obj).f39891) == 0;
    }
}
