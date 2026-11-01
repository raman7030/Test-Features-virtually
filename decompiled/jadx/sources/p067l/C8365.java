package p067l;

/* JADX INFO: renamed from: l.ۛ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8365 extends EnumC10062 {
    public /* synthetic */ C8365() {
        this("FORMAT_32X", 20);
    }

    public C8365(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        return new C14085(this, EnumC10062.m23455(i), 0, 0, EnumC10062.m23482(i), interfaceC17752.read(), interfaceC17752.read());
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        abstractC6354.getClass();
        int iMo5044 = abstractC6354.mo5044();
        if ((iMo5044 & (-65536)) != 0) {
            throw new C2724("Register A out of range: ".concat(C16351.m37151(iMo5044)), null);
        }
        int iMo5045 = abstractC6354.mo5045();
        if ((iMo5045 & (-65536)) != 0) {
            throw new C2724("Register B out of range: ".concat(C16351.m37151(iMo5045)), null);
        }
        interfaceC5013.m10652();
    }
}
