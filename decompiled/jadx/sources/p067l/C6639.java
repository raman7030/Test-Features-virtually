package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6639 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC5298 f17129;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC6462 f17130;

    public /* synthetic */ C6639(AbstractC5298 abstractC5298, AbstractC6462 abstractC6462) {
        this.f17129 = abstractC5298;
        this.f17130 = abstractC6462;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m15124or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f17129.f12460.f33480.m19490((AbstractC6462) ((C3088) obj).f20406.mo14797().f11034, this.f17130);
    }
}
