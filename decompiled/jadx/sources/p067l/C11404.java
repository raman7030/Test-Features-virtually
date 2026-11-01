package p067l;

/* JADX INFO: renamed from: l.ۢۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C11404 extends EnumC10062 {
    public /* synthetic */ C11404() {
        this("FORMAT_PACKED_SWITCH_PAYLOAD", 33);
    }

    public C11404(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        int iM25456 = interfaceC17752.m25456() - 1;
        int i2 = interfaceC17752.read();
        int i3 = interfaceC17752.readInt();
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = interfaceC17752.readInt() + iM25456;
        }
        return new C21462(this, i, i3, iArr);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        int[] iArrM48624 = ((C21462) abstractC6354).m48624();
        interfaceC5013.m25456();
        interfaceC5013.m10649();
        EnumC10062.m23460(iArrM48624.length);
        interfaceC5013.m10649();
        interfaceC5013.m10651();
        for (int i : iArrM48624) {
            interfaceC5013.m10651();
        }
    }
}
