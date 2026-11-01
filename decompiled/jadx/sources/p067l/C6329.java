package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6329 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16408;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f16408) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m14482or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f16408) {
            case 0:
                return true;
            default:
                return (((C11281) obj).f31435.f9954 & 2305843009213693952L) == 2305843009213693952L;
        }
    }
}
