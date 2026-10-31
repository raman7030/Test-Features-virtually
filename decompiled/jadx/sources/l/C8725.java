package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8725 implements Predicate {
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
        C2375 c2375 = (C2375) ((Map.Entry) obj).getValue();
        c2375.getClass();
        return System.currentTimeMillis() - c2375.f7583 > 10000;
    }
}
