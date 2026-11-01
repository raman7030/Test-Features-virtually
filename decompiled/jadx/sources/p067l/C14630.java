package p067l;

/* JADX INFO: renamed from: l.۬ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14630 extends EnumC24018 {
    public /* synthetic */ C14630() {
        this("AfterHead", 5);
    }

    public C14630(String str, int i) {
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
            return true;
        }
        if (!abstractC4454.m9334()) {
            if (abstractC4454.m9336()) {
                String str = ((C21889) abstractC4454).f29037;
                if (C21869.m49328(str, C13290.f37304)) {
                    m33431(abstractC4454, c18654);
                    return true;
                }
                if (str.equals("template")) {
                    c18654.m42420(abstractC4454, EnumC24018.f76275);
                    return true;
                }
                c18654.m42427(this);
                return false;
            }
            m33431(abstractC4454, c18654);
            return true;
        }
        C11160 c11160 = (C11160) abstractC4454;
        String str2 = c11160.f29037;
        if (str2.equals("html")) {
            EnumC24018 enumC24018 = EnumC24018.f76276;
            c18654.f4878 = abstractC4454;
            return enumC24018.mo3774(abstractC4454, c18654);
        }
        if (str2.equals("body")) {
            c18654.m42418(c11160);
            c18654.m42428(false);
            c18654.m42457(EnumC24018.f76276);
            return true;
        }
        if (str2.equals("frameset")) {
            c18654.m42418(c11160);
            c18654.m42457(EnumC24018.f76265);
            return true;
        }
        if (C21869.m49328(str2, C13290.f37308)) {
            c18654.m42427(this);
            C21199 c21199M42440 = c18654.m42440();
            c18654.f4884.add(c21199M42440);
            c18654.m42420(abstractC4454, EnumC24018.f76275);
            c18654.m42444(c21199M42440);
            return true;
        }
        if (str2.equals("head")) {
            c18654.m42427(this);
            return false;
        }
        m33431(abstractC4454, c18654);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m33431(AbstractC4454 abstractC4454, C18654 c18654) {
        c18654.m4531("body");
        c18654.m42428(true);
        return c18654.mo4525(abstractC4454);
    }
}
