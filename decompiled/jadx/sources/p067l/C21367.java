package p067l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩶ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21367 implements IntPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67362a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntPredicate f67363b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IntPredicate f67364c;

    public /* synthetic */ C21367(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        this.f67362a = i;
        this.f67363b = intPredicate;
        this.f67364c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.f67362a) {
            case 0:
                break;
        }
        return C10638.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.f67362a) {
            case 0:
                break;
        }
        return C10638.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ IntPredicate m48406or(IntPredicate intPredicate) {
        switch (this.f67362a) {
            case 0:
                break;
        }
        return C10638.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.f67362a) {
            case 0:
                return this.f67363b.test(i) || this.f67364c.test(i);
            default:
                return this.f67363b.test(i) && this.f67364c.test(i);
        }
    }
}
