package l;

/* JADX INFO: renamed from: l.ۤ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 764J */
/* JADX INFO: loaded from: classes4.dex */
public final class C10573 extends AbstractC2043 implements InterfaceC21094, InterfaceC18271 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f31730 = new C12689();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f31731;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f31732;

    public C10573(EnumC23915 enumC23915, short s, long j) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f31732 = (byte) s;
        this.f31731 = j;
    }

    public C10573(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f31732 = (byte) (bArr[i + 1] & 255);
        this.f31731 = (((long) bArr[i + 9]) << 56) | (((long) bArr[i + 2]) & 255) | ((((long) bArr[i + 3]) & 255) << 8) | ((((long) bArr[i + 4]) & 255) << 16) | ((((long) bArr[i + 5]) & 255) << 24) | ((((long) bArr[i + 6]) & 255) << 32) | ((((long) bArr[i + 7]) & 255) << 40) | ((((long) bArr[i + 8]) & 255) << 48);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f31732);
        c1547.m5297(this.f31731);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format51l;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f31732 & 255;
    }

    @Override // l.InterfaceC18271
    /* JADX INFO: renamed from: ۜ */
    public final long mo6990() {
        return this.f31731;
    }
}
