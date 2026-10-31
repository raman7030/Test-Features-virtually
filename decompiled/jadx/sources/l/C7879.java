package l;

/* JADX INFO: renamed from: l.۠ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7879 extends AbstractC0823 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14619 f24419;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f24420;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5057 f24421;

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f24419;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f24419.getName();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ */
    public final String mo1141() {
        return this.f24420;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21162(C7879 c7879) throws C6468 {
        C5057 c5057 = c7879.f24421;
        C23401 c23401 = c5057.f15895;
        C14619 c14619 = c7879.f24419;
        String strM34911 = c14619.m34911();
        EnumC14228 enumC14228 = EnumC14228.TYPES_ONLY;
        if (!(c23401.m51847(strM34911, c7879, enumC14228) instanceof C17757)) {
            throw new C6468(c7879, "\"" + c14619.m34911() + "\" is not a message type.", 0);
        }
        if (c5057.f15895.m51847(c14619.m34906(), c7879, enumC14228) instanceof C17757) {
            return;
        }
        throw new C6468(c7879, "\"" + c14619.m34906() + "\" is not a message type.", 0);
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f24421;
    }

    public C7879(C14619 c14619, C5057 c5057, C21286 c21286) {
        super(0);
        this.f2993 = c21286;
        this.f24419 = c14619;
        this.f24421 = c5057;
        this.f24420 = c21286.mo1141() + '.' + c14619.getName();
        c5057.f15895.m51849(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21161(C7879 c7879) {
        c7879.m3070(c7879.f24419.m34907().m23196());
    }
}
