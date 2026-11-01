package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13699 implements Predicate {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f38648;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f38649;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f38650;

    public /* synthetic */ C13699(int i, Object obj, Object obj2) {
        this.f38649 = i;
        this.f38650 = obj;
        this.f38648 = obj2;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f38649) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m31136or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f38649) {
            case 0:
                C11216 c11216 = (C11216) this.f38650;
                AbstractC6462 abstractC6462 = (AbstractC6462) this.f38648;
                AbstractC6462 abstractC6463 = (AbstractC6462) obj;
                c11216.getClass();
                if (abstractC6463.m14777(EnumC11353.INT)) {
                    C8374 c8374 = c11216.f31200;
                    if (c8374.m19471(abstractC6463, abstractC6462, c8374.f22469)) {
                        return true;
                    }
                }
                return false;
            default:
                C13449 c13449 = (C13449) this.f38650;
                return c13449.f37762.test(obj, (C4848) this.f38648);
        }
    }
}
