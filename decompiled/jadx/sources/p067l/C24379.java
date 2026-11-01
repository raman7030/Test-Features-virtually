package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24379 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f77190;

    public /* synthetic */ C24379(int i) {
        this.f77190 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f77190) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m53735or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f77190) {
            case 0:
                return C12826.nonNull((C23198) obj);
            case 1:
                return C5830.f14302.matcher((String) obj).matches();
            default:
                return ((AbstractC21062) obj).m16617(EnumC19998.f60790);
        }
    }
}
