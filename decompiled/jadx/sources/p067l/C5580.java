package p067l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5580 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13484;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f13485;

    public /* synthetic */ C5580(int i, Object obj) {
        this.f13484 = i;
        this.f13485 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f13484) {
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
    public /* synthetic */ Predicate m12349or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f13484) {
            case 0:
                return ((Set) this.f13485).contains((String) obj);
            case 1:
                return C9268.m21405((AbstractC7783) this.f13485, (AbstractC14355) obj, true) != null;
            case 2:
                return C16852.m38240((C16852) this.f13485, (C17939) obj);
            default:
                return !((C4848) this.f13485).contains((AbstractC6462) obj);
        }
    }
}
