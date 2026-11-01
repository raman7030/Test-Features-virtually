package p067l;

/* JADX INFO: renamed from: l.ۙۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6584 extends EnumC24018 {
    public /* synthetic */ C6584() {
        this("InHead", 3);
    }

    public C6584(String str, int i) {
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
        int i = C22678.f71538[abstractC4454.f9999.ordinal()];
        if (i == 1) {
            c18654.m42423((C15852) abstractC4454);
            return true;
        }
        if (i == 2) {
            c18654.m42427(this);
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                return m15042(abstractC4454, (AbstractC2833) c18654);
            }
            String str = ((C21889) abstractC4454).f29037;
            if (str.equals("head")) {
                c18654.m42435();
                c18654.m42457(EnumC24018.f76278);
                return true;
            }
            if (C21869.m49328(str, C13290.f37325)) {
                return m15042(abstractC4454, (AbstractC2833) c18654);
            }
            if (str.equals("template")) {
                if (!c18654.m42431(str)) {
                    c18654.m42427(this);
                    return true;
                }
                c18654.m42449(true);
                if (!str.equals(c18654.m4520().m47899())) {
                    c18654.m42427(this);
                }
                c18654.m42432(str);
                c18654.m42462();
                c18654.m42417();
                c18654.m42470();
                return true;
            }
            c18654.m42427(this);
            return false;
        }
        C11160 c11160 = (C11160) abstractC4454;
        String str2 = c11160.f29037;
        if (str2.equals("html")) {
            return EnumC24018.f76276.mo3774(abstractC4454, c18654);
        }
        if (C21869.m49328(str2, C13290.f37314)) {
            C21199 c21199M42446 = c18654.m42446(c11160);
            if (str2.equals("base") && c21199M42446.mo27069("href")) {
                c18654.m42461(c21199M42446);
            }
            return true;
        }
        if (str2.equals("meta")) {
            c18654.m42446(c11160);
            return true;
        }
        if (str2.equals("title")) {
            EnumC24018.m53204(c11160, c18654);
            return true;
        }
        if (C21869.m49328(str2, C13290.f37334)) {
            EnumC24018.m53203(c11160, c18654);
            return true;
        }
        if (str2.equals("noscript")) {
            c18654.m42418(c11160);
            c18654.m42457(EnumC24018.f76282);
            return true;
        }
        if (str2.equals("script")) {
            c18654.f4876.m46471(EnumC20940.f65745);
            c18654.m42464();
            c18654.m42457(EnumC24018.f76281);
            c18654.m42418(c11160);
            return true;
        }
        if (str2.equals("head")) {
            c18654.m42427(this);
            return false;
        }
        if (str2.equals("template")) {
            c18654.m42418(c11160);
            c18654.m42430();
            c18654.m42428(false);
            EnumC24018 enumC24018 = EnumC24018.f76273;
            c18654.m42457(enumC24018);
            c18654.m42448(enumC24018);
            return true;
        }
        return m15042(abstractC4454, (AbstractC2833) c18654);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m15042(AbstractC4454 abstractC4454, AbstractC2833 abstractC2833) {
        abstractC2833.m4530("head");
        return abstractC2833.mo4525(abstractC4454);
    }
}
