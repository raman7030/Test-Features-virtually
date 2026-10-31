package l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3379 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10677;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10678;

    public /* synthetic */ C3379(int i, Object obj) {
        this.f10677 = i;
        this.f10678 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f10677) {
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
        switch (this.f10677) {
            case 0:
                return ((Set) this.f10678).contains((String) obj);
            case 1:
                return C7260.m19439((AbstractC5698) this.f10678, (AbstractC12612) obj, true) != null;
            case 2:
                return C15240.m36079((C15240) this.f10678, (C16384) obj);
            default:
                return !((C2609) this.f10678).contains((AbstractC4308) obj);
        }
    }
}
