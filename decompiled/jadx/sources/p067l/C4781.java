package p067l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4781 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10848;

    public /* synthetic */ C4781(int i) {
        this.f10848 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f10848) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m10079or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f10848) {
            case 0:
                int i = ActivityC18686.f55776;
                return ((AbstractC16003) obj) instanceof C18229;
            case 1:
                return false;
            case 2:
                return ((int[]) ((Map.Entry) obj).getValue())[0] != -1;
            default:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
        }
    }
}
