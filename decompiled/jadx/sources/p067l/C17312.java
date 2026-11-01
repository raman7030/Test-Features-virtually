package p067l;

/* JADX INFO: renamed from: l.ܺۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17312 extends EnumC24018 {
    public /* synthetic */ C17312() {
        this("InSelect", 15);
    }

    public C17312(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        switch (C22678.f71538[abstractC4454.f9999.ordinal()]) {
            case 1:
                c18654.m42423((C15852) abstractC4454);
                return true;
            case 2:
                c18654.m42427(this);
                return false;
            case 3:
                C11160 c11160 = (C11160) abstractC4454;
                String str = c11160.f29037;
                if (str.equals("html")) {
                    EnumC24018 enumC24018 = EnumC24018.f76276;
                    c18654.f4878 = c11160;
                    return enumC24018.mo3774((AbstractC4454) c11160, c18654);
                }
                if (str.equals("option")) {
                    if (c18654.m4524("option")) {
                        c18654.m4530("option");
                    }
                    c18654.m42418(c11160);
                } else if (str.equals("optgroup")) {
                    if (c18654.m4524("option")) {
                        c18654.m4530("option");
                    }
                    if (c18654.m4524("optgroup")) {
                        c18654.m4530("optgroup");
                    }
                    c18654.m42418(c11160);
                } else {
                    if (str.equals("select")) {
                        c18654.m42427(this);
                        return c18654.m4530("select");
                    }
                    if (C21869.m49328(str, C13290.f37322)) {
                        c18654.m42427(this);
                        if (!c18654.m42442("select")) {
                            return false;
                        }
                        c18654.m4530("select");
                        return c18654.mo4525((AbstractC4454) c11160);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        EnumC24018 enumC24019 = EnumC24018.f76275;
                        c18654.f4878 = abstractC4454;
                        return enumC24019.mo3774(abstractC4454, c18654);
                    }
                    return m39283(abstractC4454, c18654);
                }
                return true;
            case 4:
                String str2 = ((C21889) abstractC4454).f29037;
                str2.getClass();
                switch (str2) {
                    case "template":
                        EnumC24018 enumC240110 = EnumC24018.f76275;
                        c18654.f4878 = abstractC4454;
                        return enumC240110.mo3774(abstractC4454, c18654);
                    case "option":
                        if (c18654.m4524("option")) {
                            c18654.m42435();
                        } else {
                            c18654.m42427(this);
                        }
                        return true;
                    case "select":
                        if (!c18654.m42442(str2)) {
                            c18654.m42427(this);
                            return false;
                        }
                        c18654.m42432(str2);
                        c18654.m42470();
                        return true;
                    case "optgroup":
                        if (c18654.m4524("option") && c18654.m42419(c18654.m4520()) != null && c18654.m42419(c18654.m4520()).m47899().equals("optgroup")) {
                            c18654.m4530("option");
                        }
                        if (c18654.m4524("optgroup")) {
                            c18654.m42435();
                        } else {
                            c18654.m42427(this);
                        }
                        return true;
                    default:
                        return m39283(abstractC4454, c18654);
                }
            case 5:
                C18535 c18535 = (C18535) abstractC4454;
                if (c18535.m42138().equals(EnumC24018.f76266)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42424(c18535);
                return true;
            case 6:
                if (!c18654.m4524("html")) {
                    c18654.m42427(this);
                }
                return true;
            default:
                return m39283(abstractC4454, c18654);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m39283(AbstractC4454 abstractC4454, C18654 c18654) {
        c18654.m42427(this);
        return false;
    }
}
