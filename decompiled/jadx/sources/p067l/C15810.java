package p067l;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: l.ܰ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V82C */
/* JADX INFO: loaded from: classes4.dex */
public final class C15810 extends AbstractC10288 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC16992 f45776 = new C24528();

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 f45777;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        this.f45777.mo5174(c24726, (Timestamp) obj);
    }

    public C15810(AbstractC10288 abstractC10288) {
        this.f45777 = abstractC10288;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        Date date = (Date) this.f45777.mo5173(c18691);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
