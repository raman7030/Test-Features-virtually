package p067l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩻֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 19LE */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24603 implements IntPredicate {
    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C10638.$default$and(this, intPredicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return C10638.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ IntPredicate m54237or(IntPredicate intPredicate) {
        return C10638.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return i == -65536;
    }
}
