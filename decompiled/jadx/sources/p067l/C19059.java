package p067l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA04 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19059 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public int f56862;

    /* JADX INFO: renamed from: ۡ֫ */
    public byte f56863;

    /* JADX INFO: renamed from: ۢ֫ */
    public byte[] f56864;

    /* JADX INFO: renamed from: ܺ֫ */
    public byte f56865;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C19059(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, 16);
        C15410 c15410 = (C15410) interfaceC3341;
        this.f56862 = (Math.min(c15410.m35123(), c15410.m35115()) - 72) & (-8);
        this.f56864 = C12334.f34417;
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f56864 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43299(byte b) {
        this.f56865 = (byte) 2;
        this.f56863 = b;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C16376(interfaceC20106.mo29602(), this.f56865, this.f56863);
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return AbstractC5628.m12467(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(41L, i, bArr);
        bArr[i + 2] = this.f56865;
        bArr[i + 3] = this.f56863;
        C3775.m7366(this.f56862, i + 4, bArr);
        long j = 0;
        C3775.m7366(j, i + 16, bArr);
        C3775.m7366(j, i + 20, bArr);
        System.arraycopy(this.f56864, 0, bArr, i + 24, 16);
        C3775.m7364(0L, i + 8, bArr);
        C3775.m7366(0L, i + 12, bArr);
        return (i + 40) - i;
    }
}
