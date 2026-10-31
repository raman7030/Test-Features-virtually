package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2538 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8058;

    public /* synthetic */ C2538(int i) {
        this.f8058 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f8058) {
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
        switch (this.f8058) {
            case 0:
                int i = ActivityC17169.f52595;
                return ((AbstractC14346) obj) instanceof C16688;
            case 1:
                return false;
            case 2:
                return ((int[]) ((Map.Entry) obj).getValue())[0] != -1;
            default:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
        }
    }
}
