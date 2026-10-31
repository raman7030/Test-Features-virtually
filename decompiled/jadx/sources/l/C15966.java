package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15966 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49275;

    public /* synthetic */ C15966(int i) {
        this.f49275 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f49275) {
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
        switch (this.f49275) {
            case 0:
                return (((C0052) obj).f17563 & 4503599627370496L) != 0;
            default:
                return ((C0779) obj).m2971() == null;
        }
    }
}
