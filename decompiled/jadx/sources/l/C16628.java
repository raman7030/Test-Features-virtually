package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16628 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51069;

    public /* synthetic */ C16628(int i) {
        this.f51069 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f51069) {
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
        switch (this.f51069) {
            case 0:
                return ((C24032) obj).f77861 == 1;
            default:
                return ((AbstractC19669) obj) instanceof AbstractC12612;
        }
    }
}
