package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77E4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18792 implements Predicate {
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
    public /* synthetic */ Predicate m42820or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((C9286) obj).m20355().m15520(EnumC6799.f17647, EnumC6799.f17650);
    }
}
