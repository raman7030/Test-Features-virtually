package l;

/* JADX INFO: renamed from: l.᩹᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V5CD */
/* JADX INFO: loaded from: classes.dex */
public final class C22546 extends AbstractC2043 implements InterfaceC21094, InterfaceC18271 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f72938 = new C21841();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f72939;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f72940;

    public C22546(EnumC23915 enumC23915, short s, short s2) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f72940 = (byte) s;
        this.f72939 = s2;
    }

    public C22546(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f72940 = bArr[i + 1];
        this.f72939 = C11807.m28870(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f72940);
        c1547.m5304(this.f72939);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format21h;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f72940 & 255;
    }

    @Override // l.InterfaceC18271
    /* JADX INFO: renamed from: ۜ */
    public final long mo6990() {
        return this.f72939;
    }
}
