package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17194 implements Predicate {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4308 f52715;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14371 f52716;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4308 f52717;

    public /* synthetic */ C17194(AbstractC14371 abstractC14371, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        this.f52716 = abstractC14371;
        this.f52717 = abstractC4308;
        this.f52715 = abstractC4309;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC14371 abstractC14371 = this.f52716;
        abstractC14371.getClass();
        C2609 c2609Mo12933 = ((C0758) obj).f17560.mo12933();
        C10139 c10139 = abstractC14371.f43314;
        return c10139.f30518.m17550((AbstractC4308) c2609Mo12933.f8240, this.f52717) && c10139.f30518.m17550((AbstractC4308) c2609Mo12933.f8241.f8240, this.f52715);
    }
}
