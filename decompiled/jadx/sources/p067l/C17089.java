package p067l;

/* JADX INFO: renamed from: l.ܶ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M59E */
/* JADX INFO: loaded from: classes5.dex */
public final class C17089 extends AbstractC18391 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f50504 = new C10385();

    /* JADX INFO: renamed from: ܽ */
    public byte f50505;

    public C17089(EnumC25097 enumC25097, short s, AbstractC7230 abstractC7230) {
        super(enumC25097, abstractC7230);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (enumC25097 == EnumC25097.f80126 && ((C23994) abstractC7230).m53168().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f50505 = (byte) s;
    }

    public C17089(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(c5651, enumC25097, bArr, i);
        if (enumC25097 == EnumC25097.f80126 && ((C23994) m41867()).m53168().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f50505 = bArr[i + 1];
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        EnumC25097 enumC25097 = EnumC25097.f80269;
        EnumC25097 enumC25098 = this.f9623;
        if (enumC25098 == enumC25097 && m41867().m16569() > 65535) {
            throw new RuntimeException("String offset is too large for const-string. Use string-const/jumbo instead.");
        }
        c3838.m7529(enumC25098.f80334);
        c3838.m7529(this.f50505);
        c3838.m7533(m41867().m16569());
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format21c;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f50505 & 255;
    }
}
