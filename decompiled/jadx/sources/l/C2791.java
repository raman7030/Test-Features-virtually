package l;

/* JADX INFO: renamed from: l.ۖ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K5L0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2791 extends AbstractC2043 implements InterfaceC21094, InterfaceC18271 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f8705 = new C16195();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f8706;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f8707;

    public C2791(EnumC23915 enumC23915, byte b, byte b2) {
        super(enumC23915);
        if (b >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (b2 < -8 || b2 >= 8) {
            throw new RuntimeException("The literal value must be between -8 and 7 inclusive");
        }
        this.f8707 = b;
        this.f8706 = b2;
    }

    public C2791(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        byte b = bArr[i + 1];
        this.f8707 = (byte) (b & 15);
        this.f8706 = (byte) (b >> 4);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f8706 << 4) | this.f8707);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format11n;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f8707;
    }

    @Override // l.InterfaceC18271
    /* JADX INFO: renamed from: ۜ */
    public final long mo6990() {
        return this.f8706;
    }
}
