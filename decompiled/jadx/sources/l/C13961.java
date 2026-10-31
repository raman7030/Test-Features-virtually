package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13961 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41666;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41667;

    public /* synthetic */ C13961(int i, Object obj) {
        this.f41666 = i;
        this.f41667 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f41666) {
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
        switch (this.f41666) {
            case 0:
                String str = (String) obj;
                Iterator it = ((List) this.f41667).iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                return (abstractC5698 == ((AbstractC5698) this.f41667) || abstractC5698.f17560.mo12948()) ? false : true;
            default:
                return C3267.m10045((C3267) this.f41667, (C0052) obj);
        }
    }
}
