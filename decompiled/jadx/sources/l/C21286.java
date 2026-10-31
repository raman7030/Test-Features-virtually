package l;

/* JADX INFO: renamed from: l.᩸ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21286 extends AbstractC0823 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C7879[] f68638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f68639;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8270 f68640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5057 f68641;

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f68640;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f68640.getName();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ */
    public final String mo1141() {
        return this.f68639;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f68641;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21286(C8270 c8270, C5057 c5057) {
        super(0);
        this.f2993 = c5057;
        this.f68640 = c8270;
        this.f68639 = C21991.m49472(c5057, null, c8270.getName());
        this.f68641 = c5057;
        this.f68638 = new C7879[c8270.m21875()];
        for (int i = 0; i < c8270.m21875(); i++) {
            this.f68638[i] = new C7879(c8270.m21874(i), c5057, this);
        }
        c5057.f15895.m51849(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48309(C21286 c21286) {
        c21286.m3070(c21286.f68640.m21877().m50253());
        for (C7879 c7879 : c21286.f68638) {
            C7879.m21161(c7879);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48310(C21286 c21286) {
        for (C7879 c7879 : c21286.f68638) {
            C7879.m21162(c7879);
        }
    }
}
