package l;

/* JADX INFO: renamed from: l.ۢۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9507 extends EnumC8095 {
    public /* synthetic */ C9507() {
        this("FORMAT_PACKED_SWITCH_PAYLOAD", 33);
    }

    public C9507(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int iM23505 = interfaceC16186.m23505() - 1;
        int i2 = interfaceC16186.read();
        int i3 = interfaceC16186.readInt();
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = interfaceC16186.readInt() + iM23505;
        }
        return new C20090(this, i, i3, iArr);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int[] iArrM46308 = ((C20090) abstractC4193).m46308();
        interfaceC2782.m23505();
        interfaceC2782.m8586();
        EnumC8095.m21492(iArrM46308.length);
        interfaceC2782.m8586();
        interfaceC2782.m8588();
        for (int i : iArrM46308) {
            interfaceC2782.m8588();
        }
    }
}
