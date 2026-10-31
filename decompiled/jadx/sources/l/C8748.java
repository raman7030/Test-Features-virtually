package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ۡ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8748 implements BiPredicate {
    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C14344.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C14344.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C14344.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return ((AbstractC4308) obj).f13890 == ((AbstractC4308) obj2).f13890;
    }
}
