package l;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: l.ܰ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V82C */
/* JADX INFO: loaded from: classes4.dex */
public final class C14143 extends AbstractC8333 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f42687 = new C23316();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 f42688;

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        this.f42688.mo2845(c23525, (Timestamp) obj);
    }

    public C14143(AbstractC8333 abstractC8333) {
        this.f42688 = abstractC8333;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        Date date = (Date) this.f42688.mo2844(c17175);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
