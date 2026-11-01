package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18884 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56379;

    public /* synthetic */ C18884(int i) {
        this.f56379 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f56379) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m42978or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f56379) {
            case 0:
                return ((C2417) obj).f3691.contains(EnumC20524.WARN_INCUBATING);
            default:
                AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                return abstractC7783.m18009() && abstractC7783.f20405 == EnumC3600.f7339;
        }
    }
}
