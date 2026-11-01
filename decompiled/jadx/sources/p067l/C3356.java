package p067l;

/* JADX INFO: renamed from: l.֨ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3356 extends EnumC10062 {
    public /* synthetic */ C3356() {
        this("FORMAT_22X", 8);
    }

    public C3356(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        return new C14085(this, EnumC10062.m23455(i), 0, 0, 0L, EnumC10062.m23482(i), interfaceC17752.read());
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        EnumC10062.m23480(abstractC6354.m14525(), abstractC6354.mo5044());
        int iMo5045 = abstractC6354.mo5045();
        if (((-65536) & iMo5045) == 0) {
            interfaceC5013.m10654();
            return;
        }
        throw new C2724("Register B out of range: ".concat(C16351.m37151(iMo5045)), null);
    }
}
