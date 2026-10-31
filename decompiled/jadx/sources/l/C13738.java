package l;

/* JADX INFO: renamed from: l.ܰۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13738 extends C17535 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13738 f41017 = new C13738(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13738 m33037(C13738 c13738, C13738 c13739) {
        int size = c13738.size();
        if (size != c13739.size()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C13738 c137310 = new C13738(size);
        for (int i = 0; i < size; i++) {
            C22911 c22911 = (C22911) c13738.m40978(i);
            C22911 c22912 = (C22911) c13739.m40978(i);
            C22911 c22913 = new C22911();
            c22913.m50996(c22911);
            c22913.m50996(c22912);
            c22913.mo20349();
            c22913.m43732();
            c137310.m40981(i, (Object) c22913);
        }
        c137310.mo20349();
        return c137310;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33038(int i, C22911 c22911) {
        c22911.m43732();
        m40981(i, (Object) c22911);
    }
}
