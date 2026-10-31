package l;

/* JADX INFO: renamed from: l.۠ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8368 extends AbstractC17540 {

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f25679;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC23100 f25680;

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        return 0;
    }

    public C8368(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023);
        this.f25679 = i;
        mo10459(50);
        m41012((byte) 3);
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23100 m21970() throws C19369 {
        if (InterfaceC23100.class.isAssignableFrom(this.f25680.getClass())) {
            return this.f25680;
        }
        throw new C19369("Incompatible file information class");
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) {
        InterfaceC23100 c12127;
        int iMo2557;
        int i3 = this.f25679;
        if (i3 == -1) {
            c12127 = new C12127();
        } else if (i3 == 3) {
            c12127 = new C21300();
        } else {
            c12127 = i3 != 7 ? null : new C14948();
        }
        if (c12127 != null) {
            iMo2557 = c12127.mo2557(i, m41010(), bArr) + i;
            this.f25680 = c12127;
        } else {
            iMo2557 = i;
        }
        return iMo2557 - i;
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("Trans2QueryFSInformationResponse["), super.toString(), "]"));
    }
}
