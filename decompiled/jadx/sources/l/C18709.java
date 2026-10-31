package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18709 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59148;

    public /* synthetic */ C18709(int i) {
        this.f59148 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f59148) {
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
        switch (this.f59148) {
            case 0:
                return C11003.nonNull((AbstractC3186) obj);
            default:
                return ((AbstractC5698) obj).f17559 == EnumC1296.f4582;
        }
    }
}
