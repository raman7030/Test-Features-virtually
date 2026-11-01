package p067l;

/* JADX INFO: renamed from: l.᩸ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes5.dex */
public final class C22654 extends AbstractC7230 {
    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "map_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return C21466.m48630(this.f18865.m12589().length, 2, 12, i + 4);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        int iM28944 = c12556.m28944();
        for (int i = 0; i < iM28944; i++) {
            EnumC16617 enumC16617M37675 = EnumC16617.m37675(c12556.m28947());
            c12556.m28947();
            c13936.m31710(enumC16617M37675, c12556.m28944(), c12556.m28944());
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        C5651 c5651 = this.f18865;
        AbstractC11925[] abstractC11925ArrM12589 = c5651.m12589();
        Integer.toHexString(abstractC11925ArrM12589.length + 2);
        Integer.toString(abstractC11925ArrM12589.length + 2);
        c3838.m7531(abstractC11925ArrM12589.length + 2);
        c3838.m7528();
        m50713(c3838, EnumC16617.TYPE_HEADER_ITEM, 1, 0);
        c3838.m7524();
        for (AbstractC11925 abstractC11925 : c5651.m12589()) {
            c3838.m7528();
            m50713(c3838, abstractC11925.f33191, abstractC11925.f33192.size(), abstractC11925.f33194);
            c3838.m7524();
        }
        c3838.m7528();
        m50713(c3838, EnumC16617.TYPE_MAP_LIST, 1, c5651.f13743.f18864);
        c3838.m7524();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50713(C3838 c3838, EnumC16617 enumC16617, int i, int i2) {
        c3838.m7533(enumC16617.f48855);
        c3838.m7533(0);
        c3838.m7531(i);
        c3838.m7531(i2);
    }
}
