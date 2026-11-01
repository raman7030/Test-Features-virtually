package p067l;

/* JADX INFO: renamed from: l.᩷ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C22008 extends EnumC24018 {
    public /* synthetic */ C22008() {
        this("InTableBody", 12);
    }

    public C22008(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        int i = C22678.f71538[abstractC4454.f9999.ordinal()];
        if (i == 3) {
            C11160 c11160 = (C11160) abstractC4454;
            String str = c11160.f29037;
            if (str.equals("tr")) {
                c18654.m42459();
                c18654.m42418(c11160);
                c18654.m42457(EnumC24018.f76284);
                return true;
            }
            if (C21869.m49328(str, C13290.f37310)) {
                c18654.m42427(this);
                c18654.m4531("tr");
                return c18654.mo4525((AbstractC4454) c11160);
            }
            if (C21869.m49328(str, C13290.f37320)) {
                return m49609(abstractC4454, c18654);
            }
            return m49608(abstractC4454, c18654);
        }
        if (i == 4) {
            String str2 = ((C21889) abstractC4454).f29037;
            if (C21869.m49328(str2, C13290.f37323)) {
                if (!c18654.m42455(str2)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42459();
                c18654.m42435();
                c18654.m42457(EnumC24018.f76290);
                return true;
            }
            if (str2.equals("table")) {
                return m49609(abstractC4454, c18654);
            }
            if (C21869.m49328(str2, C13290.f37311)) {
                c18654.m42427(this);
                return false;
            }
            return m49608(abstractC4454, c18654);
        }
        return m49608(abstractC4454, c18654);
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m49609(AbstractC4454 abstractC4454, C18654 c18654) {
        if (!c18654.m42455("tbody") && !c18654.m42455("thead") && !c18654.m42445("tfoot")) {
            c18654.m42427(this);
            return false;
        }
        c18654.m42459();
        c18654.m4530(c18654.m4520().m47899());
        return c18654.mo4525(abstractC4454);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m49608(AbstractC4454 abstractC4454, C18654 c18654) {
        EnumC24018 enumC24018 = EnumC24018.f76290;
        c18654.f4878 = abstractC4454;
        return enumC24018.mo3774(abstractC4454, c18654);
    }
}
