package l;

/* JADX INFO: renamed from: l.ᩴ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5L5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19019 extends AbstractC2043 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f59928 = new C4202();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f59929;

    public C19019(EnumC23915 enumC23915, short s) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f59929 = (byte) s;
    }

    public C19019(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f59929 = (byte) (bArr[i + 1] & 255);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f59929);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format11x;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f59929 & 255;
    }
}
