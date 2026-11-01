package p067l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ۛۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8084 implements BiPredicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13449 f21316;

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C16001.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C16001.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ BiPredicate m18754or(BiPredicate biPredicate) {
        return C16001.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C4848 c4848 = (C4848) obj2;
        if (obj instanceof AbstractC6462) {
            return ((AbstractC6462) obj).m14792(c4848);
        }
        if (obj instanceof C18258) {
            return C18486.m42024of(((C18258) obj).m41590()).anyMatch(new C13699(1, this.f21316, c4848));
        }
        return false;
    }
}
