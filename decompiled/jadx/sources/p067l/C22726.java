package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22726 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f71681;

    public /* synthetic */ C22726(int i) {
        this.f71681 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f71681) {
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
    public /* synthetic */ Predicate m50880or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f71681) {
            case 0:
                AbstractC17043 abstractC17043 = (AbstractC17043) obj;
                return abstractC17043.getName().endsWith(".mtsx") && abstractC17043.mo25093();
            case 1:
                return !((String) obj).isEmpty();
            case 2:
                return ((AbstractC6462) obj).m14777(EnumC11353.WILDCARD);
            default:
                return true;
        }
    }
}
