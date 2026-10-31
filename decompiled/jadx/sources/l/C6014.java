package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ۛۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6014 implements BiPredicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11659 f18461;

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
        C2609 c2609 = (C2609) obj2;
        if (obj instanceof AbstractC4308) {
            return ((AbstractC4308) obj).m12928(c2609);
        }
        if (obj instanceof C16719) {
            return C16958.of(((C16719) obj).m39354()).anyMatch(new C11922(1, this.f18461, c2609));
        }
        return false;
    }
}
