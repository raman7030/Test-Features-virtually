package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA04 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17561 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f53672;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public byte f53673;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public byte[] f53674;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public byte f53675;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C17561(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, 16);
        C13722 c13722 = (C13722) interfaceC1023;
        this.f53672 = (Math.min(c13722.m33009(), c13722.m33001()) - 72) & (-8);
        this.f53674 = C10485.f31453;
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫ */
    public final void mo8489(byte[] bArr) {
        this.f53674 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41053(byte b) {
        this.f53675 = (byte) 2;
        this.f53673 = b;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C14738(interfaceC18663.mo27540(), this.f53675, this.f53673);
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return AbstractC3429.m10428(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(41L, i, bArr);
        bArr[i + 2] = this.f53675;
        bArr[i + 3] = this.f53673;
        C1480.m5124(this.f53672, i + 4, bArr);
        long j = 0;
        C1480.m5124(j, i + 16, bArr);
        C1480.m5124(j, i + 20, bArr);
        System.arraycopy(this.f53674, 0, bArr, i + 24, 16);
        C1480.m5122(0L, i + 8, bArr);
        C1480.m5124(0L, i + 12, bArr);
        return (i + 40) - i;
    }
}
