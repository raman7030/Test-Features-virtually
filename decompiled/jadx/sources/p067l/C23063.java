package p067l;

/* JADX INFO: renamed from: l.᩸ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A01 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23063 extends AbstractC19039 {

    /* JADX INFO: renamed from: ܿۧ */
    public final int f72463;

    /* JADX INFO: renamed from: ᩳۧ */
    public InterfaceC23282 f72464;

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        return 2;
    }

    public C23063(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341);
        this.f72463 = i;
        m43257((byte) 5);
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final InterfaceC23282 m51453() throws C20777 {
        if (!InterfaceC2493.class.isAssignableFrom(this.f72464.getClass())) {
            throw new C20777("Incompatible file information class");
        }
        return this.f72464;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) {
        InterfaceC23282 c7188;
        int iMo4913;
        int i3 = this.f72463;
        if (i3 == 4) {
            c7188 = new C7188();
        } else if (i3 != 5) {
            c7188 = i3 != 6 ? null : new C21271();
        } else {
            c7188 = new C5177();
        }
        if (c7188 != null) {
            iMo4913 = c7188.mo4913(i, m43255(), bArr) + i;
            this.f72464 = c7188;
        } else {
            iMo4913 = i;
        }
        return iMo4913 - i;
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("Trans2QueryPathInformationResponse["), super.toString(), "]"));
    }
}
