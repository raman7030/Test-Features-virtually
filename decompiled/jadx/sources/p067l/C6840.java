package p067l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۙܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6840 implements IntPredicate {
    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C10638.$default$and(this, intPredicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return C10638.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ IntPredicate m15653or(IntPredicate intPredicate) {
        return C10638.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return i != -1;
    }
}
