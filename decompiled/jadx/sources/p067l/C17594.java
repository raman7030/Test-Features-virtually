package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17594 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52586;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f52587;

    public /* synthetic */ C17594(String str, int i) {
        this.f52586 = i;
        this.f52587 = str;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f52586) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m40058or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f52586) {
            case 0:
                return ((C6196) obj).f15598.equals(this.f52587);
            default:
                return C18524.m42115((String) obj, this.f52587);
        }
    }
}
