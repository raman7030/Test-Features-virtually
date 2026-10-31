package l;

/* JADX INFO: renamed from: l.ᩴ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E67Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C19040 extends AbstractC2043 implements InterfaceC14742, InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f59970 = new C4223();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f59971;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f59972;

    public C19040(EnumC23915 enumC23915, short s, int i) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f59971 = (byte) s;
        this.f59972 = i;
    }

    public C19040(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f59971 = bArr[i + 1];
        this.f59972 = C11807.m28859(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f59971);
        int i2 = this.f59972;
        c1547.m5302(((i + i2) % 2) + i2);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format31t;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f59971 & 255;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4860() {
        return this.f59972;
    }
}
