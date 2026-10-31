package l;

/* JADX INFO: renamed from: l.᩸ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes5.dex */
public final class C21345 extends AbstractC5116 {
    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "map_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return C20094.m46314(this.f16031.m10581().length, 2, 12, i + 4);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        int iM26904 = c10720.m26904();
        for (int i = 0; i < iM26904; i++) {
            EnumC14993 enumC14993M35519 = EnumC14993.m35519(c10720.m26907());
            c10720.m26907();
            c12172.m29648(enumC14993M35519, c10720.m26904(), c10720.m26904());
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        C3454 c3454 = this.f16031;
        AbstractC10056[] abstractC10056ArrM10581 = c3454.m10581();
        Integer.toHexString(abstractC10056ArrM10581.length + 2);
        Integer.toString(abstractC10056ArrM10581.length + 2);
        c1547.m5302(abstractC10056ArrM10581.length + 2);
        c1547.m5299();
        m48378(c1547, EnumC14993.TYPE_HEADER_ITEM, 1, 0);
        c1547.m5295();
        for (AbstractC10056 abstractC10056 : c3454.m10581()) {
            c1547.m5299();
            m48378(c1547, abstractC10056.f30233, abstractC10056.f30234.size(), abstractC10056.f30236);
            c1547.m5295();
        }
        c1547.m5299();
        m48378(c1547, EnumC14993.TYPE_MAP_LIST, 1, c3454.f10942.f16030);
        c1547.m5295();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48378(C1547 c1547, EnumC14993 enumC14993, int i, int i2) {
        c1547.m5304(enumC14993.f45742);
        c1547.m5304(0);
        c1547.m5302(i);
        c1547.m5302(i2);
    }
}
