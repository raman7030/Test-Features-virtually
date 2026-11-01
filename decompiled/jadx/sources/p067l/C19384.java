package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19384 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57867;

    public /* synthetic */ C19384(int i) {
        this.f57867 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f57867) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m44127or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f57867) {
            case 0:
                return false;
            default:
                return ((AbstractC7783) obj).f20405 == EnumC3600.f7343;
        }
    }
}
