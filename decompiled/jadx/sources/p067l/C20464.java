package p067l;

/* JADX INFO: renamed from: l.ᩴ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E67Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20464 extends AbstractC4310 implements InterfaceC16379, InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f63199 = new C6382();

    /* JADX INFO: renamed from: ۧ */
    public byte f63200;

    /* JADX INFO: renamed from: ܽ */
    public int f63201;

    public C20464(EnumC25097 enumC25097, short s, int i) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f63200 = (byte) s;
        this.f63201 = i;
    }

    public C20464(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f63200 = bArr[i + 1];
        this.f63201 = C13590.m30908(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f63200);
        int i2 = this.f63201;
        c3838.m7531(((i + i2) % 2) + i2);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format31t;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f63200 & 255;
    }

    @Override // p067l.InterfaceC16379
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7098() {
        return this.f63201;
    }
}
