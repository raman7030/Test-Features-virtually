package p067l;

/* JADX INFO: renamed from: l.᩺᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes.dex */
public final enum C24458 extends EnumC10062 {
    public /* synthetic */ C24458() {
        this("FORMAT_31T", 22);
    }

    public C24458(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        int iM25454 = interfaceC17752.m25454() - 1;
        int iM23455 = EnumC10062.m23455(i);
        int iM23482 = EnumC10062.m23482(i);
        int i2 = interfaceC17752.readInt() + iM25454;
        if (iM23455 == 43 || iM23455 == 44) {
            interfaceC17752.m25455();
        }
        return new C23473(this, iM23455, 0, i2, 0L, iM23482);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        int iM14517 = abstractC6354.m14517(interfaceC5013.m25454());
        EnumC10062.m23480(abstractC6354.m14525(), abstractC6354.mo5044());
        EnumC10062.m23488(iM14517);
        EnumC10062.m23484(iM14517);
        interfaceC5013.m10652();
    }
}
