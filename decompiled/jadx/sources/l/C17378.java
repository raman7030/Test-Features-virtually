package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17378 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53193;

    public /* synthetic */ C17378(int i) {
        this.f53193 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f53193) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f53193) {
            case 0:
                return ((C0052) obj).f915.contains(EnumC19104.WARN_INCUBATING);
            default:
                AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                return abstractC5698.m16090() && abstractC5698.f17559 == EnumC1296.f4567;
        }
    }
}
