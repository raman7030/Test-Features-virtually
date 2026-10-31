package l;

/* JADX INFO: renamed from: l.֡ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0606 extends AbstractC18246 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final C17040 f2350;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f2351;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    public C0606(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 50, (byte) 16);
        this.f2351 = 3;
        this.f2350 = new C17040(str);
        this.f56708 = 0;
        this.f56702 = 0;
        this.f56716 = 4096;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo2485(int i, byte[] bArr) {
        bArr[i] = m42528();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo2484(byte[] bArr) {
        return this.f2350.mo9010(0, bArr);
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2GetDfsReferral[");
        sb.append(super.toString());
        sb.append(",maxReferralLevel=0x");
        sb.append(this.f2351);
        sb.append(",filename=");
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
