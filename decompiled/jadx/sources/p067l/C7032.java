package p067l;

/* JADX INFO: renamed from: l.ۙ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5OD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7032 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f18325 = new C21785();

    /* JADX INFO: renamed from: ۧ */
    public short f18326;

    /* JADX INFO: renamed from: ܽ */
    public byte f18327;

    public C7032(EnumC25097 enumC25097, short s, short s2) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f18327 = (byte) s;
        this.f18326 = s2;
    }

    public C7032(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f18327 = bArr[i + 1];
        this.f18326 = C13590.m30919(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f18327);
        c3838.m7533(this.f18326);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format21s;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f18327 & 255;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f18326;
    }
}
