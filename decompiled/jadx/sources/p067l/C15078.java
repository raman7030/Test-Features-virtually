package p067l;

/* JADX INFO: renamed from: l.۬᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15078 extends AbstractC4310 implements InterfaceC16379, InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f43065 = new C5691();

    /* JADX INFO: renamed from: ۧ */
    public byte f43066;

    /* JADX INFO: renamed from: ܽ */
    public short f43067;

    public C15078(EnumC25097 enumC25097, short s, short s2) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (s2 == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f43066 = (byte) s;
        this.f43067 = s2;
    }

    public C15078(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f43066 = bArr[i + 1];
        this.f43067 = C13590.m30919(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f43066);
        c3838.m7533(this.f43067);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format21t;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f43066 & 255;
    }

    @Override // p067l.InterfaceC16379
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7098() {
        return this.f43067;
    }
}
