package l;

/* JADX INFO: renamed from: l.ۤ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X5BD */
/* JADX INFO: loaded from: classes4.dex */
public final class C10552 extends AbstractC2043 implements InterfaceC21094, InterfaceC18271 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f31680 = new C12668();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f31681;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f31682;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f31683;

    public C10552(EnumC23915 enumC23915, short s, short s2, byte b) {
        super(enumC23915);
        if (s >= 256 || s2 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f31682 = (byte) s;
        this.f31683 = (byte) s2;
        this.f31681 = b;
    }

    public C10552(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f31682 = bArr[i + 1];
        this.f31683 = bArr[i + 2];
        this.f31681 = bArr[i + 3];
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f31682);
        c1547.m5300(this.f31683);
        c1547.m5300(this.f31681);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format22b;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f31682 & 255;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m26533() {
        return this.f31683 & 255;
    }

    @Override // l.InterfaceC18271
    /* JADX INFO: renamed from: ۜ */
    public final long mo6990() {
        return this.f31681;
    }
}
