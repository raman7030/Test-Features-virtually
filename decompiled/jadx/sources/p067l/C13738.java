package p067l;

/* JADX INFO: renamed from: l.ۨ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 25GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13738 extends AbstractC18391 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f38839 = new C8373();

    /* JADX INFO: renamed from: ܽ */
    public byte f38840;

    /* JADX INFO: renamed from: ᩳ */
    public byte f38841;

    public C13738(EnumC25097 enumC25097, byte b, byte b2, AbstractC7230 abstractC7230) {
        super(enumC25097, abstractC7230);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f38840 = b;
        this.f38841 = b2;
    }

    public C13738(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(c5651, enumC25097, bArr, i);
        byte b = bArr[i + 1];
        this.f38840 = (byte) (b & 15);
        this.f38841 = C13590.m30907(b);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f38841 << 4) | this.f38840);
        c3838.m7533(m41867().m16569());
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format22c;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f38840;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m31295() {
        return this.f38841;
    }
}
