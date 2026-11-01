package p067l;

/* JADX INFO: renamed from: l.᩹᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5YG */
/* JADX INFO: loaded from: classes.dex */
public final class C23816 extends AbstractC18391 implements InterfaceC18431 {

    /* JADX INFO: renamed from: ᩷ */
    public static final InterfaceC9734 f75688 = new C23146();

    /* JADX INFO: renamed from: ۜ */
    public byte f75689;

    /* JADX INFO: renamed from: ܳ */
    public byte f75690;

    /* JADX INFO: renamed from: ܽ */
    public byte f75691;

    /* JADX INFO: renamed from: ܿ */
    public byte f75692;

    /* JADX INFO: renamed from: ᩳ */
    public byte f75693;

    /* JADX INFO: renamed from: ᩻ */
    public byte f75694;

    public C23816(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(c5651, enumC25097, bArr, i);
        if (this.f75693 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f75693 = C13590.m30907(bArr[i2]);
        this.f75691 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f75692 = (byte) (b & 15);
        this.f75690 = C13590.m30907(b);
        byte b2 = bArr[i + 5];
        this.f75694 = (byte) (b2 & 15);
        this.f75689 = C13590.m30907(b2);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f75693 << 4) | this.f75691);
        c3838.m7533(m41867().m16569());
        c3838.m7529((this.f75690 << 4) | this.f75692);
        c3838.m7529((this.f75689 << 4) | this.f75694);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format35s;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ᩻ */
    public final byte mo7133() {
        return this.f75693;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ֫ */
    public final byte mo7128() {
        return this.f75691;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܽ */
    public final byte mo7131() {
        return this.f75692;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܳ */
    public final byte mo7130() {
        return this.f75690;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ܿ */
    public final byte mo7132() {
        return this.f75694;
    }

    @Override // p067l.InterfaceC18431
    /* JADX INFO: renamed from: ۧ */
    public final byte mo7129() {
        return this.f75689;
    }
}
