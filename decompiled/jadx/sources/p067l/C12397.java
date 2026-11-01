package p067l;

/* JADX INFO: renamed from: l.ۤ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X5BD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12397 extends AbstractC4310 implements InterfaceC22416, InterfaceC19733 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f34644 = new C14408();

    /* JADX INFO: renamed from: ۧ */
    public byte f34645;

    /* JADX INFO: renamed from: ܽ */
    public byte f34646;

    /* JADX INFO: renamed from: ᩳ */
    public byte f34647;

    public C12397(EnumC25097 enumC25097, short s, short s2, byte b) {
        super(enumC25097);
        if (s >= 256 || s2 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f34646 = (byte) s;
        this.f34647 = (byte) s2;
        this.f34645 = b;
    }

    public C12397(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f34646 = bArr[i + 1];
        this.f34647 = bArr[i + 2];
        this.f34645 = bArr[i + 3];
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f34646);
        c3838.m7529(this.f34647);
        c3838.m7529(this.f34645);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format22b;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f34646 & 255;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m28566() {
        return this.f34647 & 255;
    }

    @Override // p067l.InterfaceC19733
    /* JADX INFO: renamed from: ۜ */
    public final long mo9101() {
        return this.f34645;
    }
}
