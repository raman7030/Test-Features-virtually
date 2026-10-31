package l;

/* JADX INFO: renamed from: l.ۡۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8801 extends EnumC8095 {
    public /* synthetic */ C8801() {
        this("FORMAT_SPARSE_SWITCH_PAYLOAD", 34);
    }

    public C8801(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int iM23505 = interfaceC16186.m23505() - 1;
        int i2 = interfaceC16186.read();
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = interfaceC16186.readInt();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            iArr2[i4] = interfaceC16186.readInt() + iM23505;
        }
        return new C3156(this, i, iArr, iArr2);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        C3156 c3156 = (C3156) abstractC4193;
        int[] iArrM9586 = c3156.m9586();
        int[] iArrM9585 = c3156.m9585();
        interfaceC2782.m23505();
        interfaceC2782.m8586();
        EnumC8095.m21492(iArrM9585.length);
        interfaceC2782.m8586();
        for (int i : iArrM9586) {
            interfaceC2782.m8588();
        }
        for (int i2 : iArrM9585) {
            interfaceC2782.m8588();
        }
    }
}
