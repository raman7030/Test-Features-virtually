package l;

/* JADX INFO: renamed from: l.ۖ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K69S */
/* JADX INFO: loaded from: classes2.dex */
public final class C2812 extends AbstractC2043 implements InterfaceC21094, InterfaceC18271 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f8784 = new C16216();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8785;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f8786;

    public C2812(EnumC23915 enumC23915, short s, int i) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f8786 = (byte) s;
        this.f8785 = i;
    }

    public C2812(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f8786 = (byte) (bArr[i + 1] & 255);
        this.f8785 = C11807.m28859(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f8786);
        c1547.m5302(this.f8785);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format31i;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f8786 & 255;
    }

    @Override // l.InterfaceC18271
    /* JADX INFO: renamed from: ۜ */
    public final long mo6990() {
        return this.f8785;
    }
}
