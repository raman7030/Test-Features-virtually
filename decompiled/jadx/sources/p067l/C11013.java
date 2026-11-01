package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۡ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9XY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11013 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public byte[] f30501;

    /* JADX INFO: renamed from: ۘ֫ */
    public long f30502;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f30503;

    /* JADX INFO: renamed from: ۢ֫ */
    public byte[] f30504;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f30505;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f30506;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C11013(InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341, 9);
        this.f30501 = bArr;
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f30501 = bArr;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C17717(interfaceC20106.mo29602());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25414(int i, int i2, byte[] bArr) {
        this.f30504 = bArr;
        this.f30505 = i;
        this.f30503 = i2;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m25415(int i) {
        this.f30506 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m25416(long j) {
        this.f30502 = j;
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return AbstractC5628.m12467(this.f30503 + UMErrorCode.E_UM_BE_DEFLATE_FAILED);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(49L, i, bArr);
        C3775.m7366(this.f30503, i + 4, bArr);
        C3775.m7368(this.f30502, i + 8, bArr);
        System.arraycopy(this.f30501, 0, bArr, i + 16, 16);
        long j = 0;
        C3775.m7366(j, i + 32, bArr);
        C3775.m7366(this.f30506, i + 36, bArr);
        C3775.m7364(0L, i + 40, bArr);
        C3775.m7364(0L, i + 42, bArr);
        C3775.m7366(j, i + 44, bArr);
        int i2 = i + 48;
        C3775.m7364(i2 - m12492(), i + 2, bArr);
        int i3 = this.f30503;
        if (i2 + i3 > bArr.length) {
            throw new IllegalArgumentException(String.format("Data exceeds buffer size ( remain buffer: %d data length: %d)", Integer.valueOf(bArr.length - i2), Integer.valueOf(this.f30503)));
        }
        System.arraycopy(this.f30504, this.f30505, bArr, i2, i3);
        return (i2 + this.f30503) - i;
    }
}
