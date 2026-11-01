package p067l;

/* JADX INFO: renamed from: l.ۘۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5914 extends EnumC24018 {
    public /* synthetic */ C5914() {
        this("InTemplate", 17);
    }

    public C5914(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        switch (C22678.f71538[abstractC4454.f9999.ordinal()]) {
            case 1:
            case 2:
            case 5:
                c18654.m42420(abstractC4454, EnumC24018.f76276);
                return true;
            case 3:
                String str = ((C11160) abstractC4454).f29037;
                if (C21869.m49328(str, C13290.f37328)) {
                    c18654.m42420(abstractC4454, EnumC24018.f76275);
                    return true;
                }
                if (C21869.m49328(str, C13290.f37331)) {
                    c18654.m42417();
                    EnumC24018 enumC24018 = EnumC24018.f76290;
                    c18654.m42448(enumC24018);
                    c18654.m42457(enumC24018);
                    return c18654.mo4525(abstractC4454);
                }
                if (str.equals("col")) {
                    c18654.m42417();
                    EnumC24018 enumC24019 = EnumC24018.f76271;
                    c18654.m42448(enumC24019);
                    c18654.m42457(enumC24019);
                    return c18654.mo4525(abstractC4454);
                }
                if (str.equals("tr")) {
                    c18654.m42417();
                    EnumC24018 enumC240110 = EnumC24018.f76270;
                    c18654.m42448(enumC240110);
                    c18654.m42457(enumC240110);
                    return c18654.mo4525(abstractC4454);
                }
                if (str.equals("td") || str.equals("th")) {
                    c18654.m42417();
                    EnumC24018 enumC240111 = EnumC24018.f76284;
                    c18654.m42448(enumC240111);
                    c18654.m42457(enumC240111);
                    return c18654.mo4525(abstractC4454);
                }
                c18654.m42417();
                EnumC24018 enumC240112 = EnumC24018.f76276;
                c18654.m42448(enumC240112);
                c18654.m42457(enumC240112);
                return c18654.mo4525(abstractC4454);
            case 4:
                if (((C21889) abstractC4454).f29037.equals("template")) {
                    c18654.m42420(abstractC4454, EnumC24018.f76275);
                    return true;
                }
                c18654.m42427(this);
                return false;
            case 6:
                if (c18654.m42431("template")) {
                    c18654.m42427(this);
                    c18654.m42432("template");
                    c18654.m42462();
                    c18654.m42417();
                    c18654.m42470();
                    if (c18654.m42466() != EnumC24018.f76273 && c18654.m42434() < 12) {
                        return c18654.mo4525(abstractC4454);
                    }
                }
                return true;
            default:
                return true;
        }
    }
}
