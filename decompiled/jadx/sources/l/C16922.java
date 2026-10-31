package l;

/* JADX INFO: renamed from: l.ܽ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16922 extends AbstractC2043 implements InterfaceC14742, InterfaceC21094 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f51981 = new C11279();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f51982;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f51983;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f51984;

    public C16922(EnumC23915 enumC23915, byte b, byte b2, short s) {
        super(enumC23915);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (s == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f51982 = b;
        this.f51983 = b2;
        this.f51984 = s;
    }

    public C16922(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        byte b = bArr[i + 1];
        this.f51982 = (byte) (b & 15);
        this.f51983 = C11807.m28858(b);
        this.f51984 = C11807.m28870(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f51983 << 4) | this.f51982);
        c1547.m5304(this.f51984);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format22t;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f51982;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m39769() {
        return this.f51983;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4860() {
        return this.f51984;
    }
}
