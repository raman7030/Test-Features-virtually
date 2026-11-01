package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15453 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f44146;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f44146) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m35202or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f44146) {
            case 0:
                return ((AbstractC11588) obj).mo6310();
            default:
                return ((Long) obj).longValue() != -1;
        }
    }
}
