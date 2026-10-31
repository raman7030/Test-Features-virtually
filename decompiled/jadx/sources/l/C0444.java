package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0444 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1936;

    public /* synthetic */ C0444(int i) {
        this.f1936 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f1936) {
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
        switch (this.f1936) {
            case 0:
                return (((C0052) obj).f17563 & 9007199254740992L) != 0;
            default:
                return ((C0779) obj).m2971() != null;
        }
    }
}
