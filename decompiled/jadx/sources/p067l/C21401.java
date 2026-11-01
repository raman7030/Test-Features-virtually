package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21401 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17898 f67490;

    public /* synthetic */ C21401(C17898 c17898) {
        this.f67490 = c17898;
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
    public /* synthetic */ Predicate m48470or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f67490.m40704((AbstractC17043) obj);
    }
}
