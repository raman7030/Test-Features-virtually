package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16120 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f49663;

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
        return ((C4832) ((Map.Entry) obj).getValue()).f15267 <= this.f49663;
    }
}
