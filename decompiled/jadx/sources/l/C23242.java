package l;

/* JADX INFO: renamed from: l.᩺᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes.dex */
public final enum C23242 extends EnumC8095 {
    public /* synthetic */ C23242() {
        this("FORMAT_31T", 22);
    }

    public C23242(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int iM23503 = interfaceC16186.m23503() - 1;
        int iM21487 = EnumC8095.m21487(i);
        int iM21514 = EnumC8095.m21514(i);
        int i2 = interfaceC16186.readInt() + iM23503;
        if (iM21487 == 43 || iM21487 == 44) {
            interfaceC16186.m23504();
        }
        return new C22206(this, iM21487, 0, i2, 0L, iM21514);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int iM12641 = abstractC4193.m12641(interfaceC2782.m23503());
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2705());
        EnumC8095.m21520(iM12641);
        EnumC8095.m21516(iM12641);
        interfaceC2782.m8589();
    }
}
