package l;

/* JADX INFO: renamed from: l.۠֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 97SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7813 implements InterfaceC17006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13478 f24139;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C13478 f24140;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13478 f24141;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C13478 f24142;

    static {
        C22651 c22651M32514 = C13478.m32514();
        c22651M32514.m50654('0', '9');
        c22651M32514.m50654('A', 'F');
        c22651M32514.m50654('a', 'f');
        f24142 = c22651M32514.m50652();
        C22651 c22651M32515 = C13478.m32514();
        c22651M32515.m50654('0', '9');
        f24139 = c22651M32515.m50652();
        C22651 c22651M32516 = C13478.m32514();
        c22651M32516.m50654('A', 'Z');
        c22651M32516.m50654('a', 'z');
        C13478 c13478M50652 = c22651M32516.m50652();
        f24141 = c13478M50652;
        C22651 c22651M32517 = c13478M50652.m32515();
        c22651M32517.m50654('0', '9');
        f24140 = c22651M32517.m50652();
    }

    @Override // l.InterfaceC17006
    /* JADX INFO: renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        C9246 c9246M51434 = c23188.m51434();
        C20535 c20535M23724 = c9246M51434.m23724();
        c9246M51434.m23723();
        char cM23725 = c9246M51434.m23725();
        if (cM23725 == '#') {
            c9246M51434.m23723();
            if (c9246M51434.m23726('x') || c9246M51434.m23726('X')) {
                int iM23717 = c9246M51434.m23717(f24142);
                if (1 > iM23717 || iM23717 > 6 || !c9246M51434.m23726(';')) {
                    return null;
                }
                return m20878(c20535M23724, c9246M51434);
            }
            int iM23718 = c9246M51434.m23717(f24139);
            if (1 > iM23718 || iM23718 > 7 || !c9246M51434.m23726(';')) {
                return null;
            }
            return m20878(c20535M23724, c9246M51434);
        }
        if (!f24141.m32516(cM23725)) {
            return null;
        }
        c9246M51434.m23717(f24140);
        if (c9246M51434.m23726(';')) {
            return m20878(c20535M23724, c9246M51434);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4286 m20878(C20535 c20535, C9246 c9246) {
        return new C4286(new C12897(C9931.m25038(c9246.m23718(c20535, c9246.m23724()).m41444())), c9246.m23724());
    }
}
