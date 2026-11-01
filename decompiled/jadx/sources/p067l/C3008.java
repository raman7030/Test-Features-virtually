package p067l;

/* JADX INFO: renamed from: l.֡᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 55LT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3008 extends AbstractC4310 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f5367 = new C21115();

    /* JADX INFO: renamed from: ۧ */
    public int f5368;

    /* JADX INFO: renamed from: ܽ */
    public int f5369;

    public C3008(EnumC25097 enumC25097, byte b, byte b2) {
        super(enumC25097);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f5368 = b;
        this.f5369 = b2;
    }

    public C3008(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        byte b = bArr[i + 1];
        this.f5368 = (byte) (b & 15);
        this.f5369 = C13590.m30907(b);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f5369 << 4) | this.f5368);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format12x;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f5368;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m5080() {
        return this.f5369;
    }
}
