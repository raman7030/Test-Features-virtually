package p067l;

/* JADX INFO: renamed from: l.ۚᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7640 extends AbstractC19039 {

    /* JADX INFO: renamed from: ᩳۧ */
    public final C4506 f19993;

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo17602() {
        return true;
    }

    public C7640(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
        this.f19993 = new C4506();
        m43257((byte) 16);
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final C4506 m17601() {
        return this.f19993;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) {
        return (this.f19993.mo4913(i, i2, bArr) + i) - i;
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",buffer=" + this.f19993 + "]");
    }
}
