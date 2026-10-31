package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1266 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4484;

    public /* synthetic */ C1266(int i) {
        this.f4484 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f4484) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f4484) {
            case 0:
                return C11003.nonNull((String) obj);
            case 1:
                return C7260.m19429((AbstractC5144) ((C18963) obj).f59815.f8240);
            default:
                return ((AbstractC4308) obj).mo12914();
        }
    }
}
