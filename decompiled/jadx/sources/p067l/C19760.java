package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19760 implements Predicate {
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
    public /* synthetic */ Predicate m44903or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        char c;
        C11043 c11043 = (C11043) obj;
        return (c11043.f30588 == 65535 || (c = c11043.f30587) == 65535 || c <= 0) ? false : true;
    }
}
