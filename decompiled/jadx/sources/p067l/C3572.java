package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3572 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f7254;

    public /* synthetic */ C3572(int i) {
        this.f7254 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f7254) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m6573or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f7254) {
            case 0:
                return C12826.nonNull((String) obj);
            case 1:
                return C9268.m21395((AbstractC7257) ((C20391) obj).f63044.f11034);
            default:
                return ((AbstractC6462) obj).mo14778();
        }
    }
}
