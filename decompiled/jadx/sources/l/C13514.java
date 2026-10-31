package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13514 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40327;

    public /* synthetic */ C13514(int i) {
        this.f40327 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f40327) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f40327) {
            case 0:
                AbstractC15440 abstractC15440 = (AbstractC15440) obj;
                return abstractC15440.mo23119() && abstractC15440.getName().toLowerCase().endsWith(".mtd");
            default:
                return C11003.nonNull((C10384) obj);
        }
    }
}
