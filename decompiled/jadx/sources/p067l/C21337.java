package p067l;

/* JADX INFO: renamed from: l.᩶ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21337 extends EnumC24018 {
    public /* synthetic */ C21337() {
        this("BeforeHead", 2);
    }

    public C21337(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (EnumC24018.m53202(abstractC4454)) {
            abstractC4454.getClass();
            c18654.m42424((C18535) abstractC4454);
            return true;
        }
        if (abstractC4454.m9333()) {
            c18654.m42423((C15852) abstractC4454);
            return true;
        }
        if (abstractC4454.m9335()) {
            c18654.m42427(this);
            return false;
        }
        if (abstractC4454.m9334() && ((C11160) abstractC4454).f29037.equals("html")) {
            return EnumC24018.f76276.mo3774(abstractC4454, c18654);
        }
        if (abstractC4454.m9334()) {
            C11160 c11160 = (C11160) abstractC4454;
            if (c11160.f29037.equals("head")) {
                c18654.m42441(c18654.m42418(c11160));
                c18654.m42457(EnumC24018.f76275);
                return true;
            }
        }
        if (abstractC4454.m9336() && C21869.m49328(((C21889) abstractC4454).f29037, C13290.f37318)) {
            c18654.m4531("head");
            return c18654.mo4525(abstractC4454);
        }
        if (abstractC4454.m9336()) {
            c18654.m42427(this);
            return false;
        }
        c18654.m4531("head");
        return c18654.mo4525(abstractC4454);
    }
}
