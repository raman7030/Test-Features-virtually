package p067l;

/* JADX INFO: renamed from: l.ۗۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C5243 extends EnumC24018 {
    public /* synthetic */ C5243() {
        this("InHeadNoscript", 4);
    }

    public C5243(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.m9335()) {
            c18654.m42427(this);
            return true;
        }
        if (abstractC4454.m9334() && ((C11160) abstractC4454).f29037.equals("html")) {
            EnumC24018 enumC24018 = EnumC24018.f76276;
            c18654.f4878 = abstractC4454;
            return enumC24018.mo3774(abstractC4454, c18654);
        }
        if (abstractC4454.m9336() && ((C21889) abstractC4454).f29037.equals("noscript")) {
            c18654.m42435();
            c18654.m42457(EnumC24018.f76275);
            return true;
        }
        if (EnumC24018.m53202(abstractC4454) || abstractC4454.m9333() || (abstractC4454.m9334() && C21869.m49328(((C11160) abstractC4454).f29037, C13290.f37336))) {
            EnumC24018 enumC24019 = EnumC24018.f76275;
            c18654.f4878 = abstractC4454;
            return enumC24019.mo3774(abstractC4454, c18654);
        }
        if (abstractC4454.m9336() && ((C21889) abstractC4454).f29037.equals("br")) {
            return m11315(abstractC4454, c18654);
        }
        if ((!abstractC4454.m9334() || !C21869.m49328(((C11160) abstractC4454).f29037, C13290.f37337)) && !abstractC4454.m9336()) {
            return m11315(abstractC4454, c18654);
        }
        c18654.m42427(this);
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m11315(AbstractC4454 abstractC4454, C18654 c18654) {
        c18654.m42427(this);
        C18535 c18535 = new C18535();
        c18535.m42137(abstractC4454.toString());
        c18654.m42424(c18535);
        return true;
    }
}
