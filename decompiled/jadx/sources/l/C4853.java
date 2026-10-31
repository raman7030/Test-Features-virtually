package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4853 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f15330;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z;
        long j = this.f15330;
        C1472 c1472 = (C1472) ((Map.Entry) obj).getValue();
        synchronized (c1472) {
            z = c1472.f5239 && j - c1472.f5243 > 300000;
        }
        return z;
    }
}
