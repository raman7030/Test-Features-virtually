package l;

/* JADX INFO: renamed from: l.ᩳۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9J0 */
/* JADX INFO: loaded from: classes5.dex */
public class C18026 extends AbstractC7859 {
    public C18026(byte[] bArr) {
        super(new C23670(), bArr);
    }

    public C18026(C0097 c0097) {
        super(new C23670(), c0097);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m42074() {
        return C15262.m36280(((C23670) m21061()).m52208(), EnumC1798.SMB2_FLAGS_ASYNC_COMMAND) && ((C23670) m21061()).m52202() == EnumC7462.STATUS_PENDING.getValue();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m42076() {
        return ((C23670) m21061()).m52201() == -1 && ((C23670) m21061()).m52217() == EnumC22799.SMB2_OPLOCK_BREAK;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18026 mo42075() {
        if (((C23670) m21061()).m52216() != 0) {
            return new C18026(this.f24359);
        }
        return null;
    }

    public final String toString() {
        return ((C23670) m21061()).m52217() + " with message id << " + ((C23670) m21061()).m52201() + " >>";
    }
}
