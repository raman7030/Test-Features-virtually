package p067l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15530 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f44391;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f44392;

    public /* synthetic */ C15530(int i, Object obj) {
        this.f44391 = i;
        this.f44392 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f44391) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m35326or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f44391) {
            case 0:
                return ((C3088) obj) != ((C12004) this.f44392).f33479;
            default:
                return ((Set) this.f44392).contains(((AbstractC7257) obj).mo3383());
        }
    }
}
