package l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13849 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41312;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41313;

    public /* synthetic */ C13849(int i, Object obj) {
        this.f41312 = i;
        this.f41313 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f41312) {
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
        switch (this.f41312) {
            case 0:
                return ((C0758) obj) != ((C10139) this.f41313).f30517;
            default:
                return ((Set) this.f41313).contains(((AbstractC5144) obj).mo989());
        }
    }
}
