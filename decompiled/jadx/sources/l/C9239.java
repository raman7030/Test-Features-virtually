package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9239 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27974;

    public /* synthetic */ C9239(int i) {
        this.f27974 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f27974) {
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
        switch (this.f27974) {
            case 0:
                return true;
            case 1:
                return !((AbstractC19669) obj).m45215();
            default:
                return C7883.m21164((AbstractC5698) obj);
        }
    }
}
