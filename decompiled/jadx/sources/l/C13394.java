package l;

/* JADX INFO: renamed from: l.۬᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L69I */
/* JADX INFO: loaded from: classes4.dex */
public final class C13394 extends AbstractC2043 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f40018 = new C3517();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f40019;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f40020;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f40021;

    public C13394(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f40020 = (byte) (bArr[i + 1] & 255);
        this.f40019 = (short) C11807.m28871(i + 2, bArr);
        this.f40021 = (short) C11807.m28871(i + 4, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f40020);
        c1547.m5304(this.f40019);
        c1547.m5304(this.f40021);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format3rms;
    }
}
