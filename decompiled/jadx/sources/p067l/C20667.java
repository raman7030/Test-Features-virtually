package p067l;

/* JADX INFO: renamed from: l.᩵ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20667 extends EnumC24018 {
    public /* synthetic */ C20667() {
        this("Initial", 0);
    }

    public C20667(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        if (EnumC24018.m53202(abstractC4454)) {
            return true;
        }
        if (abstractC4454.m9333()) {
            c18654.m42423((C15852) abstractC4454);
            return true;
        }
        if (!abstractC4454.m9335()) {
            c18654.m42457(EnumC24018.f76274);
            return c18654.mo4525(abstractC4454);
        }
        C24570 c24570 = (C24570) abstractC4454;
        C9798 c9798 = new C9798(c18654.f4875.m7398(c24570.f77786.toString()), c24570.f77788.toString(), c24570.f77784.toString());
        c9798.m22867(c24570.f77785);
        c18654.f4881.m47895(c9798);
        c18654.m4522(c9798, abstractC4454);
        if (c24570.f77787) {
            c18654.f4881.m5237(EnumC7116.quirks);
        }
        c18654.m42457(EnumC24018.f76274);
        return true;
    }
}
