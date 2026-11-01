package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14289 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f40695;

    public /* synthetic */ C14289(int i) {
        this.f40695 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f40695) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m32853or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f40695) {
            case 0:
                return ((Boolean) obj).booleanValue();
            case 1:
                return ((EnumC17248) obj).m39034();
            default:
                return (((C11281) obj).f31435.f9954 & 2305843009213693952L) == 2305843009213693952L;
        }
    }
}
