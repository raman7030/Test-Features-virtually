package l;

/* JADX INFO: renamed from: l.֨᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L58X */
/* JADX INFO: loaded from: classes3.dex */
public final class C1400 extends AbstractC16859 implements InterfaceC16901 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f5045 = new C5634();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte f5046;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f5047;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f5048;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f5049;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f5050;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte f5051;

    public C1400(EnumC23915 enumC23915, int i, byte b, byte b2, byte b3, byte b4, byte b5, AbstractC5116 abstractC5116) {
        super(enumC23915, abstractC5116);
        if (i > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        if (b >= 16 || b2 >= 16 || b3 >= 16 || b4 >= 16 || b5 >= 16) {
            throw new RuntimeException("All register args must fit in 4 bits");
        }
        this.f5050 = (byte) i;
        this.f5048 = b5;
        this.f5049 = b;
        this.f5047 = b2;
        this.f5051 = b3;
        this.f5046 = b4;
    }

    public C1400(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(c3454, enumC23915, bArr, i);
        if (this.f5050 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f5050 = C11807.m28858(bArr[i2]);
        this.f5048 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f5049 = (byte) (b & 15);
        this.f5047 = C11807.m28858(b);
        byte b2 = bArr[i + 5];
        this.f5051 = (byte) (b2 & 15);
        this.f5046 = C11807.m28858(b2);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f5050 << 4) | this.f5048);
        c1547.m5304(m39631().m14661());
        c1547.m5300((this.f5047 << 4) | this.f5049);
        c1547.m5300((this.f5046 << 4) | this.f5051);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format35c;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte mo4894() {
        return this.f5050;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte mo4889() {
        return this.f5048;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte mo4892() {
        return this.f5049;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte mo4891() {
        return this.f5047;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte mo4893() {
        return this.f5051;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte mo4890() {
        return this.f5046;
    }
}
