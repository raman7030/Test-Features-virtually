package p067l;

/* JADX INFO: renamed from: l.ۜۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8596 extends EnumC24018 {
    public /* synthetic */ C8596() {
        this("InColumnGroup", 11);
    }

    public C8596(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (EnumC24018.m53202(abstractC4454)) {
            abstractC4454.getClass();
            c18654.m42424((C18535) abstractC4454);
            return true;
        }
        int i = C22678.f71538[abstractC4454.f9999.ordinal()];
        if (i == 1) {
            c18654.m42423((C15852) abstractC4454);
            return true;
        }
        if (i == 2) {
            c18654.m42427(this);
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 6) {
                    if (c18654.m4524("html")) {
                        return true;
                    }
                    return m20010(abstractC4454, c18654);
                }
                return m20010(abstractC4454, c18654);
            }
            String str = ((C21889) abstractC4454).f29037;
            str.getClass();
            if (str.equals("template")) {
                c18654.m42420(abstractC4454, EnumC24018.f76275);
                return true;
            }
            if (str.equals("colgroup")) {
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42435();
                c18654.m42457(EnumC24018.f76290);
                return true;
            }
            return m20010(abstractC4454, c18654);
        }
        C11160 c11160 = (C11160) abstractC4454;
        String str2 = c11160.f29037;
        str2.getClass();
        switch (str2) {
            case "template":
                c18654.m42420(abstractC4454, EnumC24018.f76275);
                return true;
            case "col":
                c18654.m42446(c11160);
                return true;
            case "html":
                EnumC24018 enumC24018 = EnumC24018.f76276;
                c18654.f4878 = abstractC4454;
                return enumC24018.mo3774(abstractC4454, c18654);
            default:
                return m20010(abstractC4454, c18654);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m20010(AbstractC4454 abstractC4454, C18654 c18654) {
        if (!c18654.m4524("colgroup")) {
            c18654.m42427(this);
            return false;
        }
        c18654.m42435();
        c18654.m42457(EnumC24018.f76290);
        c18654.mo4525(abstractC4454);
        return true;
    }
}
