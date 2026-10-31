package l;

/* JADX INFO: renamed from: l.᩻᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23911 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public byte f77309;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public byte f77310;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public byte[] f77311;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22005 f77312;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C23911(InterfaceC1023 interfaceC1023) {
        this(interfaceC1023, C10485.f31453);
    }

    public C23911(InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023, 17);
        this.f77311 = bArr;
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫ */
    public final void mo8489(byte[] bArr) {
        this.f77311 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52666(InterfaceC22005 interfaceC22005) {
        this.f77309 = (byte) 1;
        this.f77310 = interfaceC22005.mo9011();
        this.f77312 = interfaceC22005;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C6978(interfaceC18663.mo27540());
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return AbstractC3429.m10428(this.f77312.size() + 96);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(33L, i, bArr);
        bArr[i + 2] = this.f77309;
        bArr[i + 3] = this.f77310;
        C1480.m5124(0, i + 12, bArr);
        System.arraycopy(this.f77311, 0, bArr, i + 16, 16);
        int i2 = i + 32;
        C1480.m5122(i2 - m10453(), i + 8, bArr);
        int iMo9010 = this.f77312.mo9010(i2, bArr);
        C1480.m5124(iMo9010, i + 4, bArr);
        return (i2 + iMo9010) - i;
    }
}
