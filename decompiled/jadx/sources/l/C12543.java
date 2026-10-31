package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12543 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37669;

    public /* synthetic */ C12543(int i) {
        this.f37669 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f37669) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f37669) {
            case 0:
                return ((Boolean) obj).booleanValue();
            case 1:
                return ((EnumC15657) obj).m36868();
            default:
                return (((C9378) obj).f28486.f7169 & 2305843009213693952L) == 2305843009213693952L;
        }
    }
}
