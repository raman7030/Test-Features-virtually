package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۙܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4763 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f15124;

    public C4763(AbstractC8333 abstractC8333) {
        this.f15124 = abstractC8333;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        this.f15124.mo2845(c23525, Long.valueOf(((AtomicLong) obj).get()));
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        return new AtomicLong(((Number) this.f15124.mo2844(c17175)).longValue());
    }
}
