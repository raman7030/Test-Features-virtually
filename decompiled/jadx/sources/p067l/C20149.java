package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20149 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62372;

    public /* synthetic */ C20149(int i) {
        this.f62372 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f62372) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m45589or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f62372) {
            case 0:
                return C12826.nonNull((AbstractC5396) obj);
            default:
                return ((AbstractC7783) obj).f20405 == EnumC3600.f7354;
        }
    }
}
