package p067l;

/* JADX INFO: renamed from: l.ۡۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10608 extends EnumC24018 {
    public /* synthetic */ C10608() {
        this("InCell", 14);
    }

    public C10608(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.m9336()) {
            String str = ((C21889) abstractC4454).f29037;
            if (C21869.m49328(str, C13290.f37310)) {
                if (c18654.m42455(str)) {
                    c18654.m42449(false);
                    if (!c18654.m4524(str)) {
                        c18654.m42427(this);
                    }
                    c18654.m42432(str);
                    c18654.m42462();
                    c18654.m42457(EnumC24018.f76284);
                    return true;
                }
                c18654.m42427(this);
                c18654.m42457(EnumC24018.f76284);
                return false;
            }
            if (C21869.m49328(str, C13290.f37333)) {
                c18654.m42427(this);
                return false;
            }
            if (C21869.m49328(str, C13290.f37303)) {
                if (!c18654.m42455(str)) {
                    c18654.m42427(this);
                    return false;
                }
                m24425(c18654);
                return c18654.mo4525(abstractC4454);
            }
            return m24426(abstractC4454, c18654);
        }
        if (abstractC4454.m9334() && C21869.m49328(((C11160) abstractC4454).f29037, C13290.f37302)) {
            if (!c18654.m42455("td") && !c18654.m42455("th")) {
                c18654.m42427(this);
                return false;
            }
            m24425(c18654);
            return c18654.mo4525(abstractC4454);
        }
        return m24426(abstractC4454, c18654);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m24426(AbstractC4454 abstractC4454, C18654 c18654) {
        EnumC24018 enumC24018 = EnumC24018.f76276;
        c18654.f4878 = abstractC4454;
        return enumC24018.mo3774(abstractC4454, c18654);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24425(C18654 c18654) {
        if (c18654.m42455("td")) {
            c18654.m4530("td");
        } else {
            c18654.m4530("th");
        }
    }
}
