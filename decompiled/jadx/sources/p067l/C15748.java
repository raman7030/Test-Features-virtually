package p067l;

/* JADX INFO: renamed from: l.ܰ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15748 extends AbstractC4310 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f45611 = new C24466();

    /* JADX INFO: renamed from: ۧ */
    public short f45612;

    /* JADX INFO: renamed from: ܽ */
    public byte f45613;

    /* JADX INFO: renamed from: ᩳ */
    public byte f45614;

    public C15748(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        byte b = bArr[i + 1];
        this.f45613 = (byte) (b & 15);
        this.f45614 = C13590.m30907(b);
        this.f45612 = (short) C13590.m30920(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f45614 << 4) | this.f45613);
        c3838.m7533(this.f45612);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format22cs;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f45613;
    }
}
