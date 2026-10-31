package l;

/* JADX INFO: renamed from: l.ۨۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11467 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5822 f34253;

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return i + 4;
    }

    public C11467(C3454 c3454, C5822 c5822) {
        super(c3454);
        this.f34253 = c5822;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11467 m28270(String str, C3454 c3454) {
        return (C11467) c3454.f10947.m25237(new C11467(c3454, C5822.m16320(str, c3454)));
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        this.f34253 = (C5822) c12172.m29647(EnumC14993.TYPE_STRING_DATA_ITEM, c10720.m26904());
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5302(this.f34253.f16030);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "string_id_item: " + C4303.m12898(this.f34253.m16322());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C11467 c11467) {
        return this.f34253.m16322().compareTo(c11467.f34253.m16322());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m28273() {
        return this.f34253.m16322();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28272(String str) {
        this.f34253.m16321(str);
    }

    public final int hashCode() {
        return this.f34253.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11467.class.equals(obj.getClass()) && this.f34253 == ((C11467) obj).f34253;
    }
}
