package p067l;

/* JADX INFO: renamed from: l.۠ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10322 extends AbstractC19039 {

    /* JADX INFO: renamed from: ܿۧ */
    public int f28592;

    /* JADX INFO: renamed from: ᩳۧ */
    public InterfaceC24323 f28593;

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        return 0;
    }

    public C10322(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341);
        this.f28592 = i;
        mo12498(50);
        m43257((byte) 3);
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final InterfaceC24323 m23941() throws C20777 {
        if (InterfaceC24323.class.isAssignableFrom(this.f28593.getClass())) {
            return this.f28593;
        }
        throw new C20777("Incompatible file information class");
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) {
        InterfaceC24323 c13894;
        int iMo4913;
        int i3 = this.f28592;
        if (i3 == -1) {
            c13894 = new C13894();
        } else if (i3 == 3) {
            c13894 = new C22612();
        } else {
            c13894 = i3 != 7 ? null : new C16575();
        }
        if (c13894 != null) {
            iMo4913 = c13894.mo4913(i, m43255(), bArr) + i;
            this.f28593 = c13894;
        } else {
            iMo4913 = i;
        }
        return iMo4913 - i;
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("Trans2QueryFSInformationResponse["), super.toString(), "]"));
    }
}
