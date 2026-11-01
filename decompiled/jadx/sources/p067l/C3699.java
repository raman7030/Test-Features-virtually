package p067l;

/* JADX INFO: renamed from: l.֨᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L58X */
/* JADX INFO: loaded from: classes3.dex */
public final class C3699 extends AbstractC18391 implements InterfaceC18431 {

    /* JADX INFO: renamed from: ᩷ */
    public static final InterfaceC9734 f7816 = new C7723();

    /* JADX INFO: renamed from: ۜ */
    public byte f7817;

    /* JADX INFO: renamed from: ܳ */
    public byte f7818;

    /* JADX INFO: renamed from: ܽ */
    public byte f7819;

    /* JADX INFO: renamed from: ܿ */
    public byte f7820;

    /* JADX INFO: renamed from: ᩳ */
    public byte f7821;

    /* JADX INFO: renamed from: ᩻ */
    public byte f7822;

    public C3699(EnumC25097 enumC25097, int i, byte b, byte b2, byte b3, byte b4, byte b5, AbstractC7230 abstractC7230) {
        super(enumC25097, abstractC7230);
        if (i > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        if (b >= 16 || b2 >= 16 || b3 >= 16 || b4 >= 16 || b5 >= 16) {
            throw new RuntimeException("All register args must fit in 4 bits");
        }
        this.f7821 = (byte) i;
        this.f7819 = b5;
        this.f7820 = b;
        this.f7818 = b2;
        this.f7822 = b3;
        this.f7817 = b4;
    }

    public C3699(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(c5651, enumC25097, bArr, i);
        if (this.f7821 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f7821 = C13590.m30907(bArr[i2]);
        this.f7819 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f7820 = (byte) (b & 15);
        this.f7818 = C13590.m30907(b);
        byte b2 = bArr[i + 5];
        this.f7822 = (byte) (b2 & 15);
        this.f7817 = C13590.m30907(b2);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f7821 << 4) | this.f7819);
        c3838.m7533(m41867().m16569());
        c3838.m7529((this.f7818 << 4) | this.f7820);
        c3838.m7529((this.f7817 << 4) | this.f7822);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format35c;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ᩻ */
    public final byte mo7133() {
        return this.f7821;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ֫ */
    public final byte mo7128() {
        return this.f7819;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܽ */
    public final byte mo7131() {
        return this.f7820;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܳ */
    public final byte mo7130() {
        return this.f7818;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܿ */
    public final byte mo7132() {
        return this.f7822;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ۧ */
    public final byte mo7129() {
        return this.f7817;
    }
}
