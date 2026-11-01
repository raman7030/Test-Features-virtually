package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8572 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23049;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f23050;

    public /* synthetic */ C8572(int i, Object obj) {
        this.f23049 = i;
        this.f23050 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f23049) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m19987or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f23049) {
            case 0:
                return ((AbstractC6462) obj).m14792(((C2733) this.f23050).f4594);
            default:
                return ((C2417) obj) != ((C3626) this.f23050).f7510;
        }
    }
}
