package p067l;

/* JADX INFO: renamed from: l.ۖ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K69S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5041 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f11578 = new C17780();

    /* JADX INFO: renamed from: ۧ */
    public int f11579;

    /* JADX INFO: renamed from: ܽ */
    public byte f11580;

    public C5041(EnumC25097 enumC25097, short s, int i) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f11580 = (byte) s;
        this.f11579 = i;
    }

    public C5041(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f11580 = (byte) (bArr[i + 1] & 255);
        this.f11579 = C13590.m30908(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f11580);
        c3838.m7531(this.f11579);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format31i;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f11580 & 255;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f11579;
    }
}
