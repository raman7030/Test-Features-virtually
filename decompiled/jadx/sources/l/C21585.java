package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21585 implements Predicate {
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
        InterfaceC0467 interfaceC0467 = (InterfaceC0467) obj;
        return interfaceC0467.mo15487() == interfaceC0467.mo15477() && interfaceC0467.mo15485() == interfaceC0467.mo15489() && interfaceC0467.mo2065() == interfaceC0467.mo2063() && interfaceC0467.mo2068() == interfaceC0467.mo2072();
    }
}
