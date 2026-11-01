package p067l;

/* JADX INFO: renamed from: l.ܶ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17109 extends AbstractC4310 implements InterfaceC18431 {

    /* JADX INFO: renamed from: ᩷ */
    public static final InterfaceC9734 f50536 = new C10405();

    /* JADX INFO: renamed from: ۜ */
    public byte f50537;

    /* JADX INFO: renamed from: ۧ */
    public short f50538;

    /* JADX INFO: renamed from: ܳ */
    public byte f50539;

    /* JADX INFO: renamed from: ܽ */
    public byte f50540;

    /* JADX INFO: renamed from: ܿ */
    public byte f50541;

    /* JADX INFO: renamed from: ᩳ */
    public byte f50542;

    /* JADX INFO: renamed from: ᩻ */
    public byte f50543;

    public C17109(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        int i2 = i + 1;
        this.f50542 = C13590.m30907(bArr[i2]);
        this.f50540 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f50541 = (byte) (b & 15);
        this.f50539 = C13590.m30907(b);
        byte b2 = bArr[i + 5];
        this.f50543 = (byte) (b2 & 15);
        this.f50537 = C13590.m30907(b2);
        this.f50538 = (short) C13590.m30920(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f50542 << 4) | this.f50540);
        c3838.m7533(this.f50538);
        c3838.m7529((this.f50539 << 4) | this.f50541);
        c3838.m7529((this.f50537 << 4) | this.f50543);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format35ms;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ᩻ */
    public final byte mo7133() {
        return this.f50542;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ֫ */
    public final byte mo7128() {
        return this.f50540;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܽ */
    public final byte mo7131() {
        return this.f50541;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܳ */
    public final byte mo7130() {
        return this.f50539;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܿ */
    public final byte mo7132() {
        return this.f50543;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ۧ */
    public final byte mo7129() {
        return this.f50537;
    }
}
