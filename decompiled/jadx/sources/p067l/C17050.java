package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17050 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f50434;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f50435;

    public /* synthetic */ C17050(int i, Object obj) {
        this.f50434 = i;
        this.f50435 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f50434) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m38702or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f50434) {
            case 0:
                return ((AbstractC6462) obj).f16705 == ((C15828) this.f50435);
            case 1:
                return !((C23531) this.f50435).mo6048(Integer.valueOf(((InterfaceC16706) obj).getPosition()));
            case 2:
                return ((String) obj).contains(((EnumC22620) this.f50435).m50679());
            default:
                AbstractC7257 abstractC7257 = (AbstractC7257) obj;
                return C9268.m21429(abstractC7257) && abstractC7257 != ((AbstractC7257) this.f50435);
        }
    }
}
