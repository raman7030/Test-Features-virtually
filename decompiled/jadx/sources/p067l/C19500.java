package p067l;

/* JADX INFO: renamed from: l.ᩳۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9J0 */
/* JADX INFO: loaded from: classes5.dex */
public class C19500 extends AbstractC9837 {
    public C19500(byte[] bArr) {
        super(new C24864(), bArr);
    }

    public C19500(C2460 c2460) {
        super(new C24864(), c2460);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44325() {
        return C16873.m38441(((C24864) m23026()).m54611(), EnumC4077.SMB2_FLAGS_ASYNC_COMMAND) && ((C24864) m23026()).m54605() == EnumC9460.STATUS_PENDING.getValue();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m44327() {
        return ((C24864) m23026()).m54604() == -1 && ((C24864) m23026()).m54620() == EnumC24036.SMB2_OPLOCK_BREAK;
    }

    /* JADX INFO: renamed from: ܿ */
    public C19500 mo44326() {
        if (((C24864) m23026()).m54619() != 0) {
            return new C19500(this.f27275);
        }
        return null;
    }

    public final String toString() {
        return ((C24864) m23026()).m54620() + " with message id << " + ((C24864) m23026()).m54604() + " >>";
    }
}
