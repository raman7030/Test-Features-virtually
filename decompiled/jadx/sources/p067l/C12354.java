package p067l;

/* JADX INFO: renamed from: l.ۤ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A3D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12354 extends AbstractC15015 {

    /* JADX INFO: renamed from: ۖ֫ */
    public byte[] f34469;

    /* JADX INFO: renamed from: ۡ֫ */
    public long f34470;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f34471;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f34472;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C12354(InterfaceC20106 interfaceC20106, int i, int i2, long j, byte[] bArr) {
        super(interfaceC20106.mo29602(), 1);
        this.f34472 = i;
        this.f34471 = i2;
        this.f34470 = j;
        this.f34469 = bArr;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C8330(interfaceC20106.mo29602());
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12477(AbstractC5628 abstractC5628) {
        abstractC5628.mo12487(-1L);
        return super.mo12477(abstractC5628);
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        byte[] bArr = this.f34469;
        return AbstractC5628.m12467((bArr != null ? bArr.length : 0) + 88);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(25L, i, bArr);
        bArr[i + 2] = (byte) 0;
        bArr[i + 3] = (byte) this.f34472;
        C3775.m7366(this.f34471, i + 4, bArr);
        C3775.m7366(0L, i + 8, bArr);
        int i2 = i + 12;
        int i3 = i + 14;
        byte[] bArr2 = this.f34469;
        C3775.m7364(bArr2 != null ? bArr2.length : 0L, i3, bArr);
        C3775.m7368(this.f34470, i + 16, bArr);
        int i4 = i + 24;
        C3775.m7364(i4 - m12492(), i2, bArr);
        int iM12507 = i4 + m12507(i4);
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, iM12507, bArr2.length);
            iM12507 += bArr2.length;
        }
        return iM12507 - i;
    }
}
