package p067l;

/* JADX INFO: renamed from: l.ۢۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C11279 extends EnumC24018 {
    public /* synthetic */ C11279() {
        this("InRow", 13);
    }

    public C11279(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.m9334()) {
            C11160 c11160 = (C11160) abstractC4454;
            String str = c11160.f29037;
            if (C21869.m49328(str, C13290.f37310)) {
                c18654.m42474();
                c18654.m42418(c11160);
                c18654.m42457(EnumC24018.f76279);
                c18654.m42430();
                return true;
            }
            if (C21869.m49328(str, C13290.f37307)) {
                return m26214(abstractC4454, (AbstractC2833) c18654);
            }
            return m26215(abstractC4454, c18654);
        }
        if (abstractC4454.m9336()) {
            String str2 = ((C21889) abstractC4454).f29037;
            if (str2.equals("tr")) {
                if (!c18654.m42455(str2)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42474();
                c18654.m42435();
                c18654.m42457(EnumC24018.f76270);
                return true;
            }
            if (str2.equals("table")) {
                return m26214(abstractC4454, (AbstractC2833) c18654);
            }
            if (C21869.m49328(str2, C13290.f37305)) {
                if (!c18654.m42455(str2) || !c18654.m42455("tr")) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42474();
                c18654.m42435();
                c18654.m42457(EnumC24018.f76270);
                return true;
            }
            if (C21869.m49328(str2, C13290.f37309)) {
                c18654.m42427(this);
                return false;
            }
            return m26215(abstractC4454, c18654);
        }
        return m26215(abstractC4454, c18654);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m26215(AbstractC4454 abstractC4454, C18654 c18654) {
        EnumC24018 enumC24018 = EnumC24018.f76290;
        c18654.f4878 = abstractC4454;
        return enumC24018.mo3774(abstractC4454, c18654);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m26214(AbstractC4454 abstractC4454, AbstractC2833 abstractC2833) {
        if (abstractC2833.m4530("tr")) {
            return abstractC2833.mo4525(abstractC4454);
        }
        return false;
    }
}
