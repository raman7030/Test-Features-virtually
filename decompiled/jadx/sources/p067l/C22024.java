package p067l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩷ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C22024 extends AbstractC22694 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C8769 f69323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22024(C8769 c8769, C3108 c3108, AbstractC6462 abstractC6462) {
        super(c8769, c3108, abstractC6462);
        this.f69323 = c8769;
    }

    @Override // p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22694 mo9673(C3108 c3108) {
        return new C22024(this.f69323, c3108, this.f71579);
    }

    @Override // p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final void mo36334(C2733 c2733, C3686 c3686) {
        EnumC20544[] enumC20544Arr = {EnumC20544.f63504};
        C3108 c3108 = this.f71581;
        InterfaceC19157 interfaceC19157Stream = C7480.stream(c3108.m5292(enumC20544Arr));
        C8769 c8769 = this.f69323;
        final C8374 c8374 = c8769.f23797;
        C12826.requireNonNull(c8374);
        for (AbstractC6462 abstractC6462 : (C4848) interfaceC19157Stream.collect(C12136.m28048of(new C5988(0, c8374, new BiPredicate() { // from class: l.ۜۛ֨
            public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return C16001.$default$and(this, biPredicate);
            }

            public /* synthetic */ BiPredicate negate() {
                return C16001.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ BiPredicate m20037or(BiPredicate biPredicate) {
                return C16001.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return c8374.m19490((AbstractC6462) obj, (AbstractC6462) obj2);
            }
        }), new C20070(), new C20741(), new C2634(), new EnumC8112[0]))) {
            AbstractC6462 abstractC6463 = this.f71579;
            if (abstractC6463 != abstractC6462 && abstractC6463 != abstractC6462) {
                EnumC11353 enumC11353 = EnumC11353.WILDCARD;
                if (!abstractC6463.m14777(enumC11353) && !abstractC6462.m14777(enumC11353)) {
                    for (C24293 c24293 : c8769.m20292(this.f71579, abstractC6462)) {
                        C4848 c4848Mo14798 = ((AbstractC6462) c24293.f76952).mo14798();
                        C4848 c4848Mo14799 = ((AbstractC6462) c24293.f76953).mo14798();
                        while (c4848Mo14798.m10293() && c4848Mo14799.m10293()) {
                            AbstractC6462 abstractC6464 = (AbstractC6462) c4848Mo14798.f11034;
                            EnumC11353 enumC11354 = EnumC11353.WILDCARD;
                            if (!abstractC6464.m14777(enumC11354) && !((AbstractC6462) c4848Mo14799.f11034).m14777(enumC11354)) {
                                if (!this.f71580.m20301(EnumC5259.f12381, c2733.m4259((AbstractC6462) c4848Mo14798.f11034), c2733.m4259((AbstractC6462) c4848Mo14799.f11034), (C3686) null)) {
                                    c8769.m20298(c3108, EnumC20544.f63504);
                                }
                            }
                            c4848Mo14798 = c4848Mo14798.f11035;
                            c4848Mo14799 = c4848Mo14799.f11035;
                        }
                        C1446.m31704(c4848Mo14798.isEmpty() && c4848Mo14799.isEmpty());
                    }
                }
            }
        }
    }
}
