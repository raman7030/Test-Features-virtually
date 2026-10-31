package l;

/* JADX INFO: renamed from: l.ۤ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A3D */
/* JADX INFO: loaded from: classes4.dex */
public final class C10506 extends AbstractC13306 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public byte[] f31507;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public long f31508;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f31509;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f31510;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C10506(InterfaceC18663 interfaceC18663, int i, int i2, long j, byte[] bArr) {
        super(interfaceC18663.mo27540(), 1);
        this.f31510 = i;
        this.f31509 = i2;
        this.f31508 = j;
        this.f31507 = bArr;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C6272(interfaceC18663.mo27540());
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10438(AbstractC3429 abstractC3429) {
        abstractC3429.mo10448(-1L);
        return super.mo10438(abstractC3429);
    }

    @Override // l.InterfaceC7578
    public final int size() {
        byte[] bArr = this.f31507;
        return AbstractC3429.m10428((bArr != null ? bArr.length : 0) + 88);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(25L, i, bArr);
        bArr[i + 2] = (byte) 0;
        bArr[i + 3] = (byte) this.f31510;
        C1480.m5124(this.f31509, i + 4, bArr);
        C1480.m5124(0L, i + 8, bArr);
        int i2 = i + 12;
        int i3 = i + 14;
        byte[] bArr2 = this.f31507;
        C1480.m5122(bArr2 != null ? bArr2.length : 0L, i3, bArr);
        C1480.m5126(this.f31508, i + 16, bArr);
        int i4 = i + 24;
        C1480.m5122(i4 - m10453(), i2, bArr);
        int iM10468 = i4 + m10468(i4);
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, iM10468, bArr2.length);
            iM10468 += bArr2.length;
        }
        return iM10468 - i;
    }
}
