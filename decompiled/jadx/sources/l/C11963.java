package l;

/* JADX INFO: renamed from: l.ۨ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 25GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11963 extends AbstractC16859 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f35829 = new C6318();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f35830;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f35831;

    public C11963(EnumC23915 enumC23915, byte b, byte b2, AbstractC5116 abstractC5116) {
        super(enumC23915, abstractC5116);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f35830 = b;
        this.f35831 = b2;
    }

    public C11963(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(c3454, enumC23915, bArr, i);
        byte b = bArr[i + 1];
        this.f35830 = (byte) (b & 15);
        this.f35831 = C11807.m28858(b);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f35831 << 4) | this.f35830);
        c1547.m5304(m39631().m14661());
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format22c;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f35830;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m29241() {
        return this.f35831;
    }
}
