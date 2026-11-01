package p067l;

/* JADX INFO: renamed from: l.ۖۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C4573 extends EnumC24018 {
    public /* synthetic */ C4573() {
        this("InSelectInTable", 16);
    }

    public C4573(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        boolean zM9334 = abstractC4454.m9334();
        String[] strArr = C13290.f37321;
        if (zM9334 && C21869.m49328(((C11160) abstractC4454).f29037, strArr)) {
            c18654.m42427(this);
            c18654.m42432("select");
            c18654.m42470();
            return c18654.mo4525(abstractC4454);
        }
        if (abstractC4454.m9336()) {
            C21889 c21889 = (C21889) abstractC4454;
            if (C21869.m49328(c21889.f29037, strArr)) {
                c18654.m42427(this);
                if (!c18654.m42455(c21889.f29037)) {
                    return false;
                }
                c18654.m42432("select");
                c18654.m42470();
                return c18654.mo4525(abstractC4454);
            }
        }
        EnumC24018 enumC24018 = EnumC24018.f76283;
        c18654.f4878 = abstractC4454;
        return enumC24018.mo3774(abstractC4454, c18654);
    }
}
