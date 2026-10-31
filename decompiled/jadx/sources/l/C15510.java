package l;

/* JADX INFO: renamed from: l.ܶ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15510 extends AbstractC2043 implements InterfaceC16901 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f47404 = new C8456();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte f47405;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f47406;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f47407;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f47408;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f47409;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f47410;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte f47411;

    public C15510(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        int i2 = i + 1;
        this.f47410 = C11807.m28858(bArr[i2]);
        this.f47408 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f47409 = (byte) (b & 15);
        this.f47407 = C11807.m28858(b);
        byte b2 = bArr[i + 5];
        this.f47411 = (byte) (b2 & 15);
        this.f47405 = C11807.m28858(b2);
        this.f47406 = (short) C11807.m28871(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f47410 << 4) | this.f47408);
        c1547.m5304(this.f47406);
        c1547.m5300((this.f47407 << 4) | this.f47409);
        c1547.m5300((this.f47405 << 4) | this.f47411);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format35ms;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ᩻ */
    public final byte mo4894() {
        return this.f47410;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ֫ */
    public final byte mo4889() {
        return this.f47408;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܽ */
    public final byte mo4892() {
        return this.f47409;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܳ */
    public final byte mo4891() {
        return this.f47407;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܿ */
    public final byte mo4893() {
        return this.f47411;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ۧ */
    public final byte mo4890() {
        return this.f47405;
    }
}
