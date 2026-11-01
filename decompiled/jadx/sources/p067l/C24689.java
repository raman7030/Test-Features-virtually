package p067l;

/* JADX INFO: renamed from: l.᩻ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C24689 extends EnumC24018 {
    public /* synthetic */ C24689() {
        this("InCaption", 10);
    }

    public C24689(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.m9336()) {
            C21889 c21889 = (C21889) abstractC4454;
            if (c21889.f29037.equals("caption")) {
                if (!c18654.m42455(c21889.f29037)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42449(false);
                if (!c18654.m4524("caption")) {
                    c18654.m42427(this);
                }
                c18654.m42432("caption");
                c18654.m42462();
                c18654.m42457(EnumC24018.f76290);
                return true;
            }
        }
        if ((abstractC4454.m9334() && C21869.m49328(((C11160) abstractC4454).f29037, C13290.f37302)) || (abstractC4454.m9336() && ((C21889) abstractC4454).f29037.equals("table"))) {
            c18654.m42427(this);
            if (c18654.m4530("caption")) {
                return c18654.mo4525(abstractC4454);
            }
            return true;
        }
        if (abstractC4454.m9336() && C21869.m49328(((C21889) abstractC4454).f29037, C13290.f37332)) {
            c18654.m42427(this);
            return false;
        }
        EnumC24018 enumC24018 = EnumC24018.f76276;
        c18654.f4878 = abstractC4454;
        return enumC24018.mo3774(abstractC4454, c18654);
    }
}
