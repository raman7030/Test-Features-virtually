package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17542 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52433;

    public /* synthetic */ C17542(int i) {
        this.f52433 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f52433) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m39920or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f52433) {
            case 0:
                return (((C2417) obj).f20409 & 4503599627370496L) != 0;
            default:
                return ((C3108) obj).m5300() == null;
        }
    }
}
