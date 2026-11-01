package p067l;

/* JADX INFO: renamed from: l.֡ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2560 extends EnumC24018 {
    public /* synthetic */ C2560() {
        this("InFrameset", 19);
    }

    public C2560(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        EnumC24018 enumC24018;
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
        if (abstractC4454.m9334()) {
            C11160 c11160 = (C11160) abstractC4454;
            String str = c11160.f29037;
            str.getClass();
            switch (str) {
                case "frameset":
                    c18654.m42418(c11160);
                    return true;
                case "html":
                    enumC24018 = EnumC24018.f76276;
                    break;
                case "frame":
                    c18654.m42446(c11160);
                    return true;
                case "noframes":
                    enumC24018 = EnumC24018.f76275;
                    break;
                default:
                    c18654.m42427(this);
                    return false;
            }
            c18654.f4878 = c11160;
            return enumC24018.mo3774((AbstractC4454) c11160, c18654);
        }
        if (abstractC4454.m9336() && ((C21889) abstractC4454).f29037.equals("frameset")) {
            if (c18654.m4524("html")) {
                c18654.m42427(this);
                return false;
            }
            c18654.m42435();
            if (!c18654.m42433() && !c18654.m4524("frameset")) {
                c18654.m42457(EnumC24018.f76267);
                return true;
            }
        } else if (abstractC4454.m9337()) {
            if (!c18654.m4524("html")) {
                c18654.m42427(this);
            }
        } else {
            c18654.m42427(this);
            return false;
        }
        return true;
    }
}
