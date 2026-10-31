package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21420 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68983;

    public /* synthetic */ C21420(int i) {
        this.f68983 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f68983) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f68983) {
            case 0:
                AbstractC15440 abstractC15440 = (AbstractC15440) obj;
                return abstractC15440.getName().endsWith(".mtsx") && abstractC15440.mo23119();
            case 1:
                return !((String) obj).isEmpty();
            case 2:
                return ((AbstractC4308) obj).m12913(EnumC9454.WILDCARD);
            default:
                return true;
        }
    }
}
