package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16591 implements Predicate {
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
        InterfaceC17482 interfaceC17482 = (InterfaceC17482) obj;
        return interfaceC17482 != null && interfaceC17482.mo4066();
    }
}
