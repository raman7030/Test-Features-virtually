package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;

/* JADX INFO: renamed from: l.ۛۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7925 extends EnumC24018 {
    public /* synthetic */ C7925() {
        this("InTable", 8);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.f9999 == EnumC17193.Character && C21869.m49328(c18654.m4520().m47899(), C13290.f37313)) {
            c18654.m42465();
            c18654.m42464();
            c18654.m42457(EnumC24018.f76286);
            return c18654.mo4525(abstractC4454);
        }
        if (abstractC4454.m9333()) {
            c18654.m42423((C15852) abstractC4454);
            return true;
        }
        if (abstractC4454.m9335()) {
            c18654.m42427(this);
            return false;
        }
        if (abstractC4454.m9334()) {
            C11160 c11160 = (C11160) abstractC4454;
            String str = c11160.f29037;
            if (str.equals("caption")) {
                c18654.m42451();
                c18654.m42430();
                c18654.m42418(c11160);
                c18654.m42457(EnumC24018.f76289);
                return true;
            }
            if (str.equals("colgroup")) {
                c18654.m42451();
                c18654.m42418(c11160);
                c18654.m42457(EnumC24018.f76271);
                return true;
            }
            if (str.equals("col")) {
                c18654.m42451();
                c18654.m4531("colgroup");
                return c18654.mo4525(abstractC4454);
            }
            if (C21869.m49328(str, C13290.f37305)) {
                c18654.m42451();
                c18654.m42418(c11160);
                c18654.m42457(EnumC24018.f76270);
                return true;
            }
            if (C21869.m49328(str, C13290.f37317)) {
                c18654.m42451();
                c18654.m4531("tbody");
                return c18654.mo4525(abstractC4454);
            }
            if (str.equals("table")) {
                c18654.m42427(this);
                if (c18654.m42455(str)) {
                    c18654.m42432(str);
                    if (!c18654.m42470()) {
                        c18654.m42418(c11160);
                        return true;
                    }
                    return c18654.mo4525(abstractC4454);
                }
            } else {
                if (C21869.m49328(str, C13290.f37319)) {
                    EnumC24018 enumC24018 = EnumC24018.f76275;
                    c18654.f4878 = abstractC4454;
                    return enumC24018.mo3774(abstractC4454, c18654);
                }
                if (str.equals("input")) {
                    if (!c11160.m24220() || !c11160.f29033.get("type").equalsIgnoreCase("hidden")) {
                        return m18298(abstractC4454, c18654);
                    }
                    c18654.m42446(c11160);
                    return true;
                }
                if (str.equals(C0172c.f707c)) {
                    c18654.m42427(this);
                    if (c18654.m42443() == null && !c18654.m42431("template")) {
                        c18654.m42421(c11160, false, false);
                        return true;
                    }
                } else {
                    return m18298(abstractC4454, c18654);
                }
            }
            return false;
        }
        if (abstractC4454.m9336()) {
            String str2 = ((C21889) abstractC4454).f29037;
            if (str2.equals("table")) {
                if (!c18654.m42455(str2)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42432("table");
                c18654.m42470();
                return true;
            }
            if (C21869.m49328(str2, C13290.f37338)) {
                c18654.m42427(this);
                return false;
            }
            if (str2.equals("template")) {
                c18654.m42420(abstractC4454, EnumC24018.f76275);
                return true;
            }
            return m18298(abstractC4454, c18654);
        }
        if (abstractC4454.m9337()) {
            if (c18654.m4524("html")) {
                c18654.m42427(this);
            }
            return true;
        }
        return m18298(abstractC4454, c18654);
    }

    public C7925(String str, int i) {
        super(str, i, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m18298(AbstractC4454 abstractC4454, C18654 c18654) {
        c18654.m42427(this);
        c18654.m42458(true);
        c18654.m42420(abstractC4454, EnumC24018.f76276);
        c18654.m42458(false);
        return true;
    }
}
