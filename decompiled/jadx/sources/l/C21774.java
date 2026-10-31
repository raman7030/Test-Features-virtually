package l;

/* JADX INFO: renamed from: l.᩸ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A01 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21774 extends AbstractC17540 {

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final int f69755;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22005 f69756;

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        return 2;
    }

    public C21774(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023);
        this.f69755 = i;
        m41012((byte) 5);
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22005 m49103() throws C19369 {
        if (!InterfaceC0131.class.isAssignableFrom(this.f69756.getClass())) {
            throw new C19369("Incompatible file information class");
        }
        return this.f69756;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) {
        InterfaceC22005 c5071;
        int iMo2557;
        int i3 = this.f69755;
        if (i3 == 4) {
            c5071 = new C5071();
        } else if (i3 != 5) {
            c5071 = i3 != 6 ? null : new C19889();
        } else {
            c5071 = new C2955();
        }
        if (c5071 != null) {
            iMo2557 = c5071.mo2557(i, m41010(), bArr) + i;
            this.f69756 = c5071;
        } else {
            iMo2557 = i;
        }
        return iMo2557 - i;
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("Trans2QueryPathInformationResponse["), super.toString(), "]"));
    }
}
