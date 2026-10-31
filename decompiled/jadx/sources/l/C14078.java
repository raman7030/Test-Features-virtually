package l;

/* JADX INFO: renamed from: l.ܰ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14078 extends AbstractC2043 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f42525 = new C23251();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f42526;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f42527;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f42528;

    public C14078(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        byte b = bArr[i + 1];
        this.f42527 = (byte) (b & 15);
        this.f42528 = C11807.m28858(b);
        this.f42526 = (short) C11807.m28871(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f42528 << 4) | this.f42527);
        c1547.m5304(this.f42526);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format22cs;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f42527;
    }
}
