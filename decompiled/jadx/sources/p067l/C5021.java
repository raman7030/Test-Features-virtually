package p067l;

/* JADX INFO: renamed from: l.ۖ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K5L0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5021 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f11499 = new C17760();

    /* JADX INFO: renamed from: ۧ */
    public byte f11500;

    /* JADX INFO: renamed from: ܽ */
    public byte f11501;

    public C5021(EnumC25097 enumC25097, byte b, byte b2) {
        super(enumC25097);
        if (b >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (b2 < -8 || b2 >= 8) {
            throw new RuntimeException("The literal value must be between -8 and 7 inclusive");
        }
        this.f11501 = b;
        this.f11500 = b2;
    }

    public C5021(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        byte b = bArr[i + 1];
        this.f11501 = (byte) (b & 15);
        this.f11500 = (byte) (b >> 4);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f11500 << 4) | this.f11501);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format11n;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f11501;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f11500;
    }
}
