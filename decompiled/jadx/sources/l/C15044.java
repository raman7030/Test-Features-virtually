package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15044 implements Predicate {
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
        return C11003.nonNull((C4462) obj);
    }
}
