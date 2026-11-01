package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15637 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f44746;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f44747;

    public /* synthetic */ C15637(int i, Object obj) {
        this.f44746 = i;
        this.f44747 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f44746) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m35531or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f44746) {
            case 0:
                String str = (String) obj;
                Iterator it = ((List) this.f44747).iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                return (abstractC7783 == ((AbstractC7783) this.f44747) || abstractC7783.f20406.mo14812()) ? false : true;
            default:
                return C5473.m12078((C5473) this.f44747, (C2417) obj);
        }
    }
}
