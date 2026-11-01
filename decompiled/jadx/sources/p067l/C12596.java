package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12596 implements Predicate {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC6462 f35379;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35380 = 1;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f35381;

    public /* synthetic */ C12596(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        this.f35379 = abstractC6462;
        this.f35381 = abstractC6463;
    }

    public /* synthetic */ C12596(C11216 c11216, AbstractC6462 abstractC6462) {
        this.f35381 = c11216;
        this.f35379 = abstractC6462;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f35380) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m29006or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f35380) {
            case 0:
                C8374 c8374 = ((C11216) this.f35381).f31200;
                return c8374.m19471((AbstractC6462) obj, this.f35379, c8374.f22469);
            default:
                return ((AbstractC16026) obj).test(this.f35379, (AbstractC6462) this.f35381);
        }
    }
}
