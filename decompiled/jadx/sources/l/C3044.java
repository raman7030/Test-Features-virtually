package l;

/* JADX INFO: renamed from: l.ۗۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9JB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3044 implements InterfaceC4455 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9581;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f9582;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9583;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9297(C3044 c3044, C0097 c0097) {
        String strM26073;
        int iM26083 = c0097.m26083() + c0097.m26099();
        c0097.m26096(4);
        c0097.m26096(4);
        c0097.m26096(2);
        c3044.f9583 = c0097.m26100();
        int iM26100 = c0097.m26100();
        int iM26101 = c0097.m26100();
        int iM26102 = c0097.m26100();
        int iM26103 = c0097.m26100();
        c3044.f9581 = c0097.m26082() == 0;
        int iM26084 = c0097.m26083();
        if (iM26101 > 0) {
            c0097.m26097(iM26100 + iM26084);
            strM26073 = c0097.m26073(iM26101 / 2, C8208.f25222);
        } else {
            strM26073 = null;
        }
        c0097.m26097(iM26084);
        c3044.f9582 = strM26073;
        int iM26085 = c0097.m26083();
        if (iM26103 > 0) {
            c0097.m26097(iM26102 + iM26085);
            c0097.m26073(iM26103 / 2, C8208.f25222);
        }
        c0097.m26097(iM26085);
        c0097.m26097(iM26083);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m9300() {
        return this.f9581;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9299() {
        return this.f9583;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m9298() {
        return this.f9582;
    }
}
