package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18172 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54250;

    public /* synthetic */ C18172(int i) {
        this.f54250 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f54250) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m41391or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f54250) {
            case 0:
                return ((C25209) obj).f80613 == 1;
            default:
                return ((AbstractC21062) obj) instanceof AbstractC14355;
        }
    }
}
