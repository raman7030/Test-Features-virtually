package p067l;

/* JADX INFO: renamed from: l.᩻᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 455Z */
/* JADX INFO: loaded from: classes.dex */
public final class C25157 extends AbstractC4310 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f80494 = new C16439();

    /* JADX INFO: renamed from: ۧ */
    public byte f80495;

    /* JADX INFO: renamed from: ܽ */
    public byte f80496;

    /* JADX INFO: renamed from: ᩳ */
    public byte f80497;

    public C25157(EnumC25097 enumC25097, short s, short s2, short s3) {
        super(enumC25097);
        if (s >= 256 || s2 >= 256 || s3 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f80495 = (byte) s;
        this.f80496 = (byte) s2;
        this.f80497 = (byte) s3;
    }

    public C25157(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f80495 = bArr[i + 1];
        this.f80496 = bArr[i + 2];
        this.f80497 = bArr[i + 3];
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f80495);
        c3838.m7529(this.f80496);
        c3838.m7529(this.f80497);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format23x;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f80495 & 255;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m55203() {
        return this.f80496 & 255;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m55204() {
        return this.f80497 & 255;
    }
}
