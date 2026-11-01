package p067l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ۚۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7285 implements BiPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BiPredicate f19018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BiPredicate f19019c;

    public /* synthetic */ C7285(BiPredicate biPredicate, BiPredicate biPredicate2, int i) {
        this.f19017a = i;
        this.f19018b = biPredicate;
        this.f19019c = biPredicate2;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        switch (this.f19017a) {
            case 0:
                break;
        }
        return C16001.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        switch (this.f19017a) {
            case 0:
                break;
        }
        return C16001.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ BiPredicate m16736or(BiPredicate biPredicate) {
        switch (this.f19017a) {
            case 0:
                break;
        }
        return C16001.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        switch (this.f19017a) {
            case 0:
                return this.f19018b.test(obj, obj2) || this.f19019c.test(obj, obj2);
            default:
                return this.f19018b.test(obj, obj2) && this.f19019c.test(obj, obj2);
        }
    }
}
