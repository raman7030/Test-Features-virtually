package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15532 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC18550 f47463;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47464;

    public /* synthetic */ C15532(EnumC18550 enumC18550, int i) {
        this.f47463 = enumC18550;
        this.f47464 = i;
    }

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
        return ((C0758) obj).m2898(this.f47463) == this.f47464;
    }
}
