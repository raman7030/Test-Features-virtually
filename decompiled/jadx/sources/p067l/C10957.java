package p067l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10957 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30345;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f30345) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m25234or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f30345) {
            case 0:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return ((InterfaceC10057) obj) != null;
        }
    }
}
