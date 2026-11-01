package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11149 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30920;

    public /* synthetic */ C11149(int i) {
        this.f30920 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f30920) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m25679or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f30920) {
            case 0:
                return true;
            case 1:
                return !((AbstractC21062) obj).m47512();
            default:
                return C9860.m23129((AbstractC7783) obj);
        }
    }
}
