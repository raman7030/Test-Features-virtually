package p067l;

/* JADX INFO: renamed from: l.ۤ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 764J */
/* JADX INFO: loaded from: classes4.dex */
public final class C12417 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f34696 = new C14428();

    /* JADX INFO: renamed from: ۧ */
    public long f34697;

    /* JADX INFO: renamed from: ܽ */
    public byte f34698;

    public C12417(EnumC25097 enumC25097, short s, long j) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f34698 = (byte) s;
        this.f34697 = j;
    }

    public C12417(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f34698 = (byte) (bArr[i + 1] & 255);
        this.f34697 = (((long) bArr[i + 9]) << 56) | (((long) bArr[i + 2]) & 255) | ((((long) bArr[i + 3]) & 255) << 8) | ((((long) bArr[i + 4]) & 255) << 16) | ((((long) bArr[i + 5]) & 255) << 24) | ((((long) bArr[i + 6]) & 255) << 32) | ((((long) bArr[i + 7]) & 255) << 40) | ((((long) bArr[i + 8]) & 255) << 48);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f34698);
        c3838.m7526(this.f34697);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format51l;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f34698 & 255;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f34697;
    }
}
