package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23087 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72533;

    public /* synthetic */ C23087(int i) {
        this.f72533 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f72533) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m51488or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f72533) {
            case 0:
                return ((AbstractC6462) obj).f16705.m18019();
            default:
                return !(((AbstractC10564) obj) instanceof C18610);
        }
    }
}
