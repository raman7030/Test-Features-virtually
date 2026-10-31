package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10948 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32981 = 1;

    public /* synthetic */ C10948() {
    }

    public /* synthetic */ C10948(C20826 c20826) {
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f32981) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f32981) {
            case 0:
                return C20826.m47636((InterfaceC17482) obj);
            default:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
        }
    }
}
