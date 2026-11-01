package p067l;

/* JADX INFO: renamed from: l.֡ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2945 extends AbstractC19710 {

    /* JADX INFO: renamed from: ܳۧ */
    public final C18563 f5124;

    /* JADX INFO: renamed from: ܿۧ */
    public int f5125;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    public C2945(String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 50, (byte) 16);
        this.f5125 = 3;
        this.f5124 = new C18563(str);
        this.f59926 = 0;
        this.f59920 = 0;
        this.f59934 = 4096;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        return this.f5124.mo11078(0, bArr);
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2GetDfsReferral[");
        sb.append(super.toString());
        sb.append(",maxReferralLevel=0x");
        sb.append(this.f5125);
        sb.append(",filename=");
        return new String(C10965.m25286(sb, this.f37152, "]"));
    }
}
