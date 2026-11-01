package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15971 extends EnumC24018 {
    public /* synthetic */ C15971() {
        this("InTableText", 9);
    }

    public C15971(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.f9999 == EnumC17193.Character) {
            C18535 c18535 = (C18535) abstractC4454;
            if (c18535.m42138().equals(EnumC24018.f76266)) {
                c18654.m42427(this);
                return false;
            }
            ((ArrayList) c18654.m42454()).add(c18535.m42138());
            return true;
        }
        if (((ArrayList) c18654.m42454()).size() > 0) {
            for (String str : (ArrayList) c18654.m42454()) {
                if (!EnumC24018.m53201(str)) {
                    c18654.m42427(this);
                    if (C21869.m49328(c18654.m4520().m47899(), C13290.f37313)) {
                        c18654.m42458(true);
                        C18535 c18536 = new C18535();
                        c18536.m42137(str);
                        c18654.m42420(c18536, EnumC24018.f76276);
                        c18654.m42458(false);
                    } else {
                        C18535 c18537 = new C18535();
                        c18537.m42137(str);
                        c18654.m42420(c18537, EnumC24018.f76276);
                    }
                } else {
                    C18535 c18538 = new C18535();
                    c18538.m42137(str);
                    c18654.m42424(c18538);
                }
            }
            c18654.m42465();
        }
        c18654.m42457(c18654.m42416());
        return c18654.mo4525(abstractC4454);
    }
}
