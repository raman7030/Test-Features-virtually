package p067l;

/* JADX INFO: renamed from: l.ᩳ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9V6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19198 extends AbstractC10481 {
    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ۧ */
    public final int mo12971(int i, byte[] bArr) {
        return 0;
    }

    public C19198(InterfaceC3341 interfaceC3341, C17856 c17856) {
        super(interfaceC3341);
        this.f28992 = c17856;
        this.f28986 = 32;
    }

    @Override // p067l.AbstractC10481
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("NameQueryRequest["), super.toString(), "]"));
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12972(int i, byte[] bArr) {
        int iM40548 = this.f28992.m40548(i, bArr) + i;
        AbstractC10481.m24185(this.f28986, iM40548, bArr);
        AbstractC10481.m24185(this.f29005, iM40548 + 2, bArr);
        return (iM40548 + 4) - i;
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ֫ */
    public final int mo12970(int i, byte[] bArr) {
        int iM40546 = this.f28992.m40546(i, bArr) + i;
        this.f28986 = AbstractC10481.m24187(iM40546, bArr);
        this.f29005 = AbstractC10481.m24187(iM40546 + 2, bArr);
        return (iM40546 + 4) - i;
    }
}
