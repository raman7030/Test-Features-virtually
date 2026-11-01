package p067l;

/* JADX INFO: renamed from: l.֫᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05H4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4370 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f9823 = new C9714();

    /* JADX INFO: renamed from: ۧ */
    public short f9824;

    /* JADX INFO: renamed from: ܽ */
    public byte f9825;

    /* JADX INFO: renamed from: ᩳ */
    public byte f9826;

    public C4370(EnumC25097 enumC25097, byte b, byte b2, short s) {
        super(enumC25097);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f9825 = b;
        this.f9826 = b2;
        this.f9824 = s;
    }

    public C4370(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        byte b = bArr[i + 1];
        this.f9825 = (byte) (b & 15);
        this.f9826 = C13590.m30907(b);
        this.f9824 = C13590.m30919(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f9826 << 4) | this.f9825);
        c3838.m7533(this.f9824);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format22s;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f9825;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m9102() {
        return this.f9826;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f9824;
    }
}
