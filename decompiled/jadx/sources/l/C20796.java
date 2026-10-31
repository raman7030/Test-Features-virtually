package l;

/* JADX INFO: renamed from: l.᩷ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20796 extends EnumC8095 {
    public /* synthetic */ C20796() {
        this("FORMAT_4RCC", 32);
    }

    public C20796(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int iM21487 = EnumC8095.m21487(i);
        if (iM21487 != 251) {
            throw new UnsupportedOperationException(String.valueOf(iM21487));
        }
        int iM21514 = EnumC8095.m21514(i);
        int i2 = interfaceC16186.read();
        int i3 = interfaceC16186.read();
        int i4 = interfaceC16186.read();
        C9838.m24906(iM21487);
        return new C21501(this, iM21487, i2, i3, iM21514, i4);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2709());
        int iMo2707 = abstractC4193.mo2707();
        if (((-65536) & iMo2707) != 0) {
            throw new C0374("Register C out of range: ".concat(C14712.m35004(iMo2707)), null);
        }
        abstractC4193.mo12643();
        interfaceC2782.m8592();
    }
}
