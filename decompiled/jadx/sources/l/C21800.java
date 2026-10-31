package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21800 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69825;

    public /* synthetic */ C21800(int i) {
        this.f69825 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f69825) {
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
        switch (this.f69825) {
            case 0:
                return ((AbstractC4308) obj).f13890.m16100();
            default:
                return !(((AbstractC8624) obj) instanceof C17090);
        }
    }
}
