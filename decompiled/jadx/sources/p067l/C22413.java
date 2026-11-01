package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩷᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9XY */
/* JADX INFO: loaded from: classes5.dex */
public final class C22413 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public final int f70692;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f70693;

    /* JADX INFO: renamed from: ۡ֫ */
    public long f70694;

    /* JADX INFO: renamed from: ۢ֫ */
    public byte[] f70695;

    /* JADX INFO: renamed from: ܺ֫ */
    public final byte[] f70696;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f70697;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C22413(InterfaceC3341 interfaceC3341, byte[] bArr, byte[] bArr2, int i) {
        super(interfaceC3341, 8);
        this.f70695 = bArr;
        this.f70696 = bArr2;
        this.f70692 = i;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C11684(this.f70692, interfaceC20106.mo29602(), this.f70696);
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f70695 = bArr;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m50316(int i) {
        this.f70693 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m50317(long j) {
        this.f70694 = j;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m50315(int i) {
        this.f70697 = i;
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return AbstractC5628.m12467(UMErrorCode.E_UM_BE_RAW_OVERSIZE);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(49L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C3775.m7366(this.f70693, i + 4, bArr);
        C3775.m7368(this.f70694, i + 8, bArr);
        System.arraycopy(this.f70695, 0, bArr, i + 16, 16);
        long j = 0;
        C3775.m7366(j, i + 32, bArr);
        C3775.m7366(j, i + 36, bArr);
        C3775.m7366(this.f70697, i + 40, bArr);
        C3775.m7364(0L, i + 44, bArr);
        C3775.m7364(0L, i + 46, bArr);
        bArr[i + 48] = 0;
        return (i + 49) - i;
    }
}
