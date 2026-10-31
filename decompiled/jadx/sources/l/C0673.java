package l;

/* JADX INFO: renamed from: l.֡᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 55LT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0673 extends AbstractC2043 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f2594 = new C19725();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2595;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f2596;

    public C0673(EnumC23915 enumC23915, byte b, byte b2) {
        super(enumC23915);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f2595 = b;
        this.f2596 = b2;
    }

    public C0673(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        byte b = bArr[i + 1];
        this.f2595 = (byte) (b & 15);
        this.f2596 = C11807.m28858(b);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f2596 << 4) | this.f2595);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format12x;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo2740() {
        return this.f2595;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m2741() {
        return this.f2596;
    }
}
