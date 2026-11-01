package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 19LE */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21922 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f68934;

    public /* synthetic */ C21922(int i) {
        this.f68934 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f68934) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m49457or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f68934) {
            case 0:
                return ((C15885) obj).f45988 == 1649176686;
            default:
                return ((AbstractC7783) obj).f20405 == EnumC3600.f7343;
        }
    }
}
