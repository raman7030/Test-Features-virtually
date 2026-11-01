package p067l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۙܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6895 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC10288 f17954;

    public C6895(AbstractC10288 abstractC10288) {
        this.f17954 = abstractC10288;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        this.f17954.mo5174(c24726, Long.valueOf(((AtomicLong) obj).get()));
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        return new AtomicLong(((Number) this.f17954.mo5173(c18691)).longValue());
    }
}
