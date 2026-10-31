package l;

/* JADX INFO: renamed from: l.ܶ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M59E */
/* JADX INFO: loaded from: classes5.dex */
public final class C15489 extends AbstractC16859 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f47373 = new C8435();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f47374;

    public C15489(EnumC23915 enumC23915, short s, AbstractC5116 abstractC5116) {
        super(enumC23915, abstractC5116);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (enumC23915 == EnumC23915.f77375 && ((C22755) abstractC5116).m50835().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f47374 = (byte) s;
    }

    public C15489(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(c3454, enumC23915, bArr, i);
        if (enumC23915 == EnumC23915.f77375 && ((C22755) m39631()).m50835().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f47374 = bArr[i + 1];
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        EnumC23915 enumC23915 = EnumC23915.f77518;
        EnumC23915 enumC23916 = this.f6840;
        if (enumC23916 == enumC23915 && m39631().m14661() > 65535) {
            throw new RuntimeException("String offset is too large for const-string. Use string-const/jumbo instead.");
        }
        c1547.m5300(enumC23916.f77583);
        c1547.m5300(this.f47374);
        c1547.m5304(m39631().m14661());
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format21c;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f47374 & 255;
    }
}
