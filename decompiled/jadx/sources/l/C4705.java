package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۙܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4705 implements IntPredicate {
    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C8701.$default$and(this, intPredicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return C8701.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C8701.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return i != -1;
    }
}
