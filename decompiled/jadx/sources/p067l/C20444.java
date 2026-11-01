package p067l;

/* JADX INFO: renamed from: l.ᩴ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5L5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20444 extends AbstractC4310 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC9734 f63157 = new C6362();

    /* JADX INFO: renamed from: ۧ */
    public byte f63158;

    public C20444(EnumC25097 enumC25097, short s) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f63158 = (byte) s;
    }

    public C20444(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f63158 = (byte) (bArr[i + 1] & 255);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f63158);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format11x;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f63158 & 255;
    }
}
