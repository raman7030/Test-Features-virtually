package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18709 implements Predicate {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC6462 f55896;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC16026 f55897;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC6462 f55898;

    public /* synthetic */ C18709(AbstractC16026 abstractC16026, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        this.f55897 = abstractC16026;
        this.f55898 = abstractC6462;
        this.f55896 = abstractC6463;
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
    public /* synthetic */ Predicate m42690or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC16026 abstractC16026 = this.f55897;
        abstractC16026.getClass();
        C4848 c4848Mo14797 = ((C3088) obj).f20406.mo14797();
        C12004 c12004 = abstractC16026.f46405;
        return c12004.f33480.m19490((AbstractC6462) c4848Mo14797.f11034, this.f55898) && c12004.f33480.m19490((AbstractC6462) c4848Mo14797.f11035.f11034, this.f55896);
    }
}
