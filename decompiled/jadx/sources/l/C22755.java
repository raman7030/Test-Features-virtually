package l;

/* JADX INFO: renamed from: l.᩺ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes.dex */
public final class C22755 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11467 f73479;

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return i + 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22755 m50831(String str, C3454 c3454) {
        C11467 c11467M28270 = C11467.m28270(str, c3454);
        C22755 c22755 = new C22755(c3454);
        c22755.f73479 = c11467M28270;
        return (C22755) c3454.f10926.m25237(c22755);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        this.f73479 = (C11467) this.f16031.f10947.m1314(c10720.m26904());
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5302(this.f73479.f16032);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "type_id_item: " + this.f73479.m28273();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C22755 c22755) {
        return this.f73479.compareTo(c22755.f73479);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m50834() {
        String strM28273 = this.f73479.m28273();
        return strM28273.length() > 1 ? "L" : strM28273;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m50835() {
        return this.f73479.m28273();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m50836() {
        String strM28273 = this.f73479.m28273();
        return (strM28273.charAt(0) == 'J' || strM28273.charAt(0) == 'D') ? 2 : 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50833(String str) {
        this.f73479.m28272(str);
    }

    public final int hashCode() {
        return this.f73479.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C22755.class.equals(obj.getClass()) && this.f73479 == ((C22755) obj).f73479;
    }
}
