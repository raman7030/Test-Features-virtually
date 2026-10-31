package l;

/* JADX INFO: renamed from: l.ۚᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5546 extends AbstractC17540 {

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final C2249 f17152;

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean mo15687() {
        return true;
    }

    public C5546(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
        this.f17152 = new C2249();
        m41012((byte) 16);
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C2249 m15686() {
        return this.f17152;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) {
        return (this.f17152.mo2557(i, i2, bArr) + i) - i;
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",buffer=" + this.f17152 + "]");
    }
}
