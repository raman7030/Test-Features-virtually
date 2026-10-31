package l;

/* JADX INFO: renamed from: l.᩹᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5YG */
/* JADX INFO: loaded from: classes.dex */
public final class C22567 extends AbstractC16859 implements InterfaceC16901 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f72961 = new C21862();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte f72962;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f72963;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f72964;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f72965;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f72966;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte f72967;

    public C22567(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(c3454, enumC23915, bArr, i);
        if (this.f72966 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f72966 = C11807.m28858(bArr[i2]);
        this.f72964 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f72965 = (byte) (b & 15);
        this.f72963 = C11807.m28858(b);
        byte b2 = bArr[i + 5];
        this.f72967 = (byte) (b2 & 15);
        this.f72962 = C11807.m28858(b2);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300((this.f72966 << 4) | this.f72964);
        c1547.m5304(m39631().m14661());
        c1547.m5300((this.f72963 << 4) | this.f72965);
        c1547.m5300((this.f72962 << 4) | this.f72967);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format35s;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ᩻ */
    public final byte mo4894() {
        return this.f72966;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ֫ */
    public final byte mo4889() {
        return this.f72964;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܽ */
    public final byte mo4892() {
        return this.f72965;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܳ */
    public final byte mo4891() {
        return this.f72963;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ܿ */
    public final byte mo4893() {
        return this.f72967;
    }

    @Override // l.InterfaceC16901
    /* JADX INFO: renamed from: ۧ */
    public final byte mo4890() {
        return this.f72962;
    }
}
