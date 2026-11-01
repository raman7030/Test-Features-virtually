package p067l;

/* JADX INFO: renamed from: l.ۡۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10733 extends EnumC10062 {
    public /* synthetic */ C10733() {
        this("FORMAT_SPARSE_SWITCH_PAYLOAD", 34);
    }

    public C10733(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        int iM25456 = interfaceC17752.m25456() - 1;
        int i2 = interfaceC17752.read();
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = interfaceC17752.readInt();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            iArr2[i4] = interfaceC17752.readInt() + iM25456;
        }
        return new C5368(this, i, iArr, iArr2);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        C5368 c5368 = (C5368) abstractC6354;
        int[] iArrM11630 = c5368.m11630();
        int[] iArrM11629 = c5368.m11629();
        interfaceC5013.m25456();
        interfaceC5013.m10649();
        EnumC10062.m23460(iArrM11629.length);
        interfaceC5013.m10649();
        for (int i : iArrM11630) {
            interfaceC5013.m10651();
        }
        for (int i2 : iArrM11629) {
            interfaceC5013.m10651();
        }
    }
}
