package p067l;

/* JADX INFO: renamed from: l.ܽ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18451 extends AbstractC4310 implements InterfaceC16379, InterfaceC22416 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f55162 = new C13088();

    /* JADX INFO: renamed from: ۧ */
    public byte f55163;

    /* JADX INFO: renamed from: ܽ */
    public byte f55164;

    /* JADX INFO: renamed from: ᩳ */
    public short f55165;

    public C18451(EnumC25097 enumC25097, byte b, byte b2, short s) {
        super(enumC25097);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (s == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f55163 = b;
        this.f55164 = b2;
        this.f55165 = s;
    }

    public C18451(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        byte b = bArr[i + 1];
        this.f55163 = (byte) (b & 15);
        this.f55164 = C13590.m30907(b);
        this.f55165 = C13590.m30919(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529((this.f55164 << 4) | this.f55163);
        c3838.m7533(this.f55165);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format22t;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f55163;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m42010() {
        return this.f55164;
    }

    @Override // p067l.InterfaceC16379
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7098() {
        return this.f55165;
    }
}
