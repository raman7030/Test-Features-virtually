package p067l;

/* JADX INFO: renamed from: l.ۡ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C11076 extends AbstractC18391 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f30670 = new C11747();

    /* JADX INFO: renamed from: ܽ */
    public byte f30671;

    public C11076(EnumC25097 enumC25097, short s, C13266 c13266) {
        super(enumC25097, c13266);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f30671 = (byte) s;
    }

    public C11076(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(c5651, enumC25097, bArr, i);
        this.f30671 = bArr[i + 1];
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f30671);
        c3838.m7531(m41867().m16569());
    }

    @Override // p067l.AbstractC18391
    /* JADX INFO: renamed from: ֫ */
    public final int mo25523(int i, byte[] bArr) {
        return C13590.m30908(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format31c;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f30671 & 255;
    }
}
