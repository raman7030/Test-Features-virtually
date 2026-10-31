package l;

/* JADX INFO: renamed from: l.֫᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05H4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2106 extends AbstractC2043 implements InterfaceC21094, InterfaceC18271 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f7038 = new C7729();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f7039;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f7040;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f7041;

    public C2106(EnumC23915 enumC23915, byte b, byte b2, short s) {
        super(enumC23915);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f7040 = b;
        this.f7041 = b2;
        this.f7039 = s;
    }

    public C2106(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        byte b = bArr[i + 1];
        this.f7040 = (byte) (b & 15);
        this.f7041 = C11807.m28858(b);
        this.f7039 = C11807.m28870(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f7041 << 4) | this.f7040);
        c1547.m5304(this.f7039);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format22s;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f7040;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m6991() {
        return this.f7041;
    }

    @Override // l.InterfaceC18271
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long mo6990() {
        return this.f7039;
    }
}
