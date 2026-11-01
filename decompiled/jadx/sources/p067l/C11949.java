package p067l;

/* JADX INFO: renamed from: l.ۤۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C11949 extends EnumC24018 {
    public /* synthetic */ C11949() {
        this("Text", 7);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (abstractC4454.f9999 == EnumC17193.Character) {
            c18654.m42424((C18535) abstractC4454);
            return true;
        }
        if (abstractC4454.m9337()) {
            c18654.m42427(this);
            c18654.m42435();
            c18654.m42457(c18654.m42416());
            return c18654.mo4525(abstractC4454);
        }
        if (!abstractC4454.m9336()) {
            return true;
        }
        c18654.m42435();
        c18654.m42457(c18654.m42416());
        return true;
    }

    public C11949(String str, int i) {
        super(str, i, 0);
    }
}
