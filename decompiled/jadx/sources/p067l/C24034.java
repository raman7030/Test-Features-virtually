package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final enum C24034 extends EnumC12793 {
    public /* synthetic */ C24034(EnumC20544 enumC20544) {
        this("THROWS", 2, enumC20544);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m53276(C2733 c2733, AbstractC6462 abstractC6462) {
        return !abstractC6462.m14792(c2733.f4594);
    }

    public C24034(String str, int i, EnumC20544 enumC20544) {
        super(str, i, enumC20544, 0);
    }

    @Override // p067l.EnumC12793
    /* JADX INFO: renamed from: ֫ */
    public boolean mo8179(C3108 c3108, final C2733 c2733) {
        if (!c3108.m5297()) {
            return false;
        }
        final C8374 c8374 = c2733.f4593;
        final C22004 c22004 = c2733.f4592.f23796;
        return C7480.stream(c3108.m5292(EnumC20544.f63504)).filter(new Predicate() { // from class: l.ۛۛ֨
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
            public /* synthetic */ Predicate m18350or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C24034.m53276(c2733, (AbstractC6462) obj);
            }
        }).allMatch(new Predicate() { // from class: l.ۨۛ֨
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
            public /* synthetic */ Predicate m30385or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C24034.m53277(c8374, c22004, (AbstractC6462) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m53277(C8374 c8374, C22004 c22004, AbstractC6462 abstractC6462) {
        return c8374.m19486(c22004.f69135, abstractC6462, true);
    }

    @Override // p067l.EnumC12793
    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 mo8180(C3108 c3108, C2733 c2733) {
        return c2733.f4592.f23796.f69135;
    }
}
