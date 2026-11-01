package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7744 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20293;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20294;

    public /* synthetic */ C7744(int i, Object obj) {
        this.f20293 = i;
        this.f20294 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f20293) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m17878or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f20293) {
            case 0:
                return ((C11281) obj).f31433 == ((C13818) this.f20294).f20408;
            default:
                C11748 c11748 = (C11748) this.f20294;
                c11748.getClass();
                if (((C18258) obj).m41589() == EnumC14710.ERROR) {
                    c11748.f32804 = true;
                }
                return true;
        }
    }
}
