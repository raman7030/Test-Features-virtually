package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13898 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39239;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f39240;

    public /* synthetic */ C13898(int i, Object obj) {
        this.f39239 = i;
        this.f39240 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f39239) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m31616or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f39239) {
            case 0:
                return C16852.m38239((C16852) this.f39240, (AbstractC12224) obj);
            default:
                return ((C11281) obj).f31433 == ((C11281) this.f39240).f31433;
        }
    }
}
