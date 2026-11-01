package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9635 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC7783 f26525;

    public /* synthetic */ C9635(AbstractC7783 abstractC7783) {
        this.f26525 = abstractC7783;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m22422or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((AbstractC7783) obj) == this.f26525;
    }
}
