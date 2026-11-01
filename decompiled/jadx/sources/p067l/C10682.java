package p067l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ۡ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10682 implements BiPredicate {
    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C16001.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C16001.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ BiPredicate m24597or(BiPredicate biPredicate) {
        return C16001.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return ((AbstractC6462) obj).f16705 == ((AbstractC6462) obj2).f16705;
    }
}
