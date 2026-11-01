package p067l;

/* JADX INFO: renamed from: l.۠ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9937 extends EnumC24018 {
    public /* synthetic */ C9937() {
        this("AfterAfterFrameset", 22);
    }

    public C9937(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.m9333()) {
            c18654.m42423((C15852) abstractC4454);
            return true;
        }
        if (abstractC4454.m9335() || EnumC24018.m53202(abstractC4454) || (abstractC4454.m9334() && ((C11160) abstractC4454).f29037.equals("html"))) {
            EnumC24018 enumC24018 = EnumC24018.f76276;
            c18654.f4878 = abstractC4454;
            return enumC24018.mo3774(abstractC4454, c18654);
        }
        if (abstractC4454.m9337()) {
            return true;
        }
        if (abstractC4454.m9334() && ((C11160) abstractC4454).f29037.equals("noframes")) {
            EnumC24018 enumC24019 = EnumC24018.f76275;
            c18654.f4878 = abstractC4454;
            return enumC24019.mo3774(abstractC4454, c18654);
        }
        c18654.m42427(this);
        return false;
    }
}
