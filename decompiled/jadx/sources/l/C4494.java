package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4494 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3083 f14302;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4308 f14303;

    public /* synthetic */ C4494(AbstractC3083 abstractC3083, AbstractC4308 abstractC4308) {
        this.f14302 = abstractC3083;
        this.f14303 = abstractC4308;
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
        return this.f14302.f9657.f30518.m17550((AbstractC4308) ((C0758) obj).f17560.mo12933().f8240, this.f14303);
    }
}
