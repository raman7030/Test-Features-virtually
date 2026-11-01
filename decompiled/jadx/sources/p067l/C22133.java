package p067l;

/* JADX INFO: renamed from: l.᩷ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes5.dex */
public final enum C22133 extends EnumC10062 {
    public /* synthetic */ C22133() {
        this("FORMAT_4RCC", 32);
    }

    public C22133(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        int iM23455 = EnumC10062.m23455(i);
        if (iM23455 != 251) {
            throw new UnsupportedOperationException(String.valueOf(iM23455));
        }
        int iM23482 = EnumC10062.m23482(i);
        int i2 = interfaceC17752.read();
        int i3 = interfaceC17752.read();
        int i4 = interfaceC17752.read();
        C11719.m26921(iM23455);
        return new C22803(this, iM23455, i2, i3, iM23482, i4);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        EnumC10062.m23480(abstractC6354.m14525(), abstractC6354.mo5048());
        int iMo5046 = abstractC6354.mo5046();
        if (((-65536) & iMo5046) != 0) {
            throw new C2724("Register C out of range: ".concat(C16351.m37151(iMo5046)), null);
        }
        abstractC6354.mo14519();
        interfaceC5013.m10655();
    }
}
