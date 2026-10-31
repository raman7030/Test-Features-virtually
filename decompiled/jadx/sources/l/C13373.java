package l;

/* JADX INFO: renamed from: l.۬᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13373 extends AbstractC2043 implements InterfaceC14742, InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f39998 = new C3496();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f39999;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f40000;

    public C13373(EnumC23915 enumC23915, short s, short s2) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (s2 == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f39999 = (byte) s;
        this.f40000 = s2;
    }

    public C13373(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f39999 = bArr[i + 1];
        this.f40000 = C11807.m28870(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f39999);
        c1547.m5304(this.f40000);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format21t;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f39999 & 255;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4860() {
        return this.f40000;
    }
}
