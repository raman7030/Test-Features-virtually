package l;

/* JADX INFO: renamed from: l.ۡ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C9162 extends AbstractC16859 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f27730 = new C9868();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f27731;

    public C9162(EnumC23915 enumC23915, short s, C11467 c11467) {
        super(enumC23915, c11467);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f27731 = (byte) s;
    }

    public C9162(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(c3454, enumC23915, bArr, i);
        this.f27731 = bArr[i + 1];
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f27731);
        c1547.m5302(m39631().m14661());
    }

    @Override // l.AbstractC16859
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo23572(int i, byte[] bArr) {
        return C11807.m28859(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format31c;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f27731 & 255;
    }
}
