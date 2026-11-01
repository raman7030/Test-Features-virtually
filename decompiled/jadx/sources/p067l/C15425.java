package p067l;

/* JADX INFO: renamed from: l.ܰۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15425 extends C19034 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C15425 f44095 = new C15425(0);

    /* JADX INFO: renamed from: ֫ */
    public static C15425 m35151(C15425 c15425, C15425 c15426) {
        int size = c15425.size();
        if (size != c15426.size()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C15425 c15427 = new C15425(size);
        for (int i = 0; i < size; i++) {
            C24143 c24143 = (C24143) c15425.m43238(i);
            C24143 c24144 = (C24143) c15426.m43238(i);
            C24143 c24145 = new C24143();
            c24145.m53387(c24143);
            c24145.m53387(c24144);
            c24145.mo22326();
            c24145.m45999();
            c15427.m43241(i, (Object) c24145);
        }
        c15427.mo22326();
        return c15427;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35152(int i, C24143 c24143) {
        c24143.m45999();
        m43241(i, (Object) c24143);
    }
}
