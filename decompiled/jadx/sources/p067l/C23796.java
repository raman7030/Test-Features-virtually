package p067l;

/* JADX INFO: renamed from: l.᩹᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V5CD */
/* JADX INFO: loaded from: classes.dex */
public final class C23796 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f75665 = new C23126();

    /* JADX INFO: renamed from: ۧ */
    public short f75666;

    /* JADX INFO: renamed from: ܽ */
    public byte f75667;

    public C23796(EnumC25097 enumC25097, short s, short s2) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f75667 = (byte) s;
        this.f75666 = s2;
    }

    public C23796(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f75667 = bArr[i + 1];
        this.f75666 = C13590.m30919(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f75667);
        c3838.m7533(this.f75666);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format21h;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f75667 & 255;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f75666;
    }
}
