package p067l;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13645 extends AbstractC3586 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C12955 f38395;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13645(C12955 c12955) {
        super(c12955, EnumC13844.MEMBERS_PHASE, null);
        this.f38395 = c12955;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(final C4036 c4036) {
        boolean z;
        C16996 c9621;
        long j;
        C10471 c10471M29711;
        C4848 c4848M10292;
        C10471 c10471;
        C20530 c20530;
        AbstractC7783 abstractC7783;
        C7650 c7650 = c4036.f8855;
        C15828 c15828 = c7650.f20027;
        c15828.mo18020();
        if ((c15828.f20409 & 512) != 0) {
            z = false;
            break;
        }
        C4848 c4848 = c7650.f20020;
        while (true) {
            if (!c4848.m10293()) {
                z = true;
                break;
            } else {
                if (C9268.m21429((AbstractC7257) c4848.f11034)) {
                    z = false;
                    break;
                }
                c4848 = c4848.f11035;
            }
        }
        boolean zM35942 = c15828.m35942();
        C12955 c12955 = this.f38395;
        if (!z || zM35942) {
            c9621 = null;
        } else {
            c9621 = new C16996(c12955, c15828);
            if (c15828.f20408.isEmpty() && (abstractC7783 = (c20530 = (C20530) c4036.f8848.f8850).f63427) != null) {
                if (abstractC7783.f20405 != EnumC3600.f7353) {
                    c9621 = new C10292(c12955, c15828, (C5771) abstractC7783, c20530.f63432);
                } else {
                    c9621 = null;
                }
            }
        }
        if (zM35942) {
            if (z) {
                j = 2305843009213693952L;
                c10471 = null;
            } else {
                C7650 c7651 = c4036.f8855;
                C4848 c4848M19460 = c12955.f36442.m19460(C9268.m21402(c7651).m10287((Function) new C15868(7)));
                Iterator it = c7651.f20020.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 2305843009213693952L;
                        c10471 = null;
                        break;
                    }
                    AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
                    if (C9268.m21429(abstractC7257)) {
                        c10471 = (C10471) abstractC7257;
                        j = 2305843009213693952L;
                        if (c12955.f36442.m19489(c12955.f36442.m19460((C4848) C7480.stream(c10471.f28963).map(new C22964(6)).collect(C4848.m10284())), c4848M19460)) {
                            break;
                        }
                    }
                }
                if (c10471 == null) {
                }
                if (c10471 != null) {
                    c10471.f28960.f20409 |= j;
                }
            }
            c9621 = new C9621(c12955, c15828, C9268.m21402(c7650));
            if (c10471 != null) {
                c10471.f28960.f20409 |= j;
            }
        } else {
            j = 2305843009213693952L;
        }
        if (c9621 != null) {
            c12955.f36426.m38343(c15828, (InterfaceC5323) c7650);
            C18537 c18537 = c12955.f36425;
            c18537.f55352 = c7650.f18924;
            c10471M29711 = c12955.m29711(c18537, c9621);
            c7650.f20020 = c7650.f20020.m10290(c10471M29711);
        } else {
            c10471M29711 = null;
        }
        if (!c15828.m35942()) {
            m6590(c15828, c4036);
        }
        if (!c7650.f20026.isEmpty()) {
            for (C15973 c15973 : c7650.f20026) {
                c12955.f36426.m38320(c15973, (C10485) c15973.f18925);
            }
        }
        if ((c7650.f20022.f9954 & 16384) != 0 && !c7650.f20027.f20406.m14777(EnumC11353.ERROR) && (c12955.f36442.m19502(c7650.f20027.f20406).f16705.mo18003() & 16384) == 0) {
            c12955.f36432.m41432((AbstractC7257) c12955.f36425.m42160(c12955.f36425.m42142(9L), c12955.f36438.f21758, c12955.f36425.m42208(new C7251(c7650.f20027.f20406, c12955.f36440.f69187)), C4848.m10283(), null, C4848.m10283(), C4848.m10283(), null, null), c4036);
            C18537 c18538 = c12955.f36425;
            C4436 c4436M42142 = c12955.f36425.m42142(9L);
            AbstractC12224 abstractC12224 = c12955.f36438.f21754;
            AbstractC14355 abstractC14355M42208 = c12955.f36425.m42208(c7650.f20027.f20406);
            C4848 c4848M10283 = C4848.m10283();
            C18537 c18539 = c12955.f36425;
            C4436 c4436M42143 = c12955.f36425.m42142(8589967360L);
            AbstractC14235 abstractC14235 = c12955.f36438.f21738;
            abstractC14235.getClass();
            char[] charArray = "name".toCharArray();
            c12955.f36432.m41432((AbstractC7257) c18538.m42160(c4436M42142, abstractC12224, abstractC14355M42208, c4848M10283, null, C4848.m10276of((Object) c18539.m42163(c4436M42143, abstractC14235.mo17848(charArray, charArray.length), c12955.f36425.m42208(c12955.f36440.f69215), (AbstractC14355) null)), C4848.m10283(), null, null), c4036);
        }
        boolean z2 = (c7650.f20027.f20409 & j) != 0;
        if (z2) {
            C4848 c4848M21402 = C9268.m21402(c7650);
            if (c4848M21402 == null) {
                c4848M21402 = null;
            } else {
                Iterator it2 = c4848M21402.iterator();
                while (it2.hasNext()) {
                    AbstractC7257.class.cast(it2.next());
                }
            }
            c4848M10292 = c4848M21402.m10292((C4848) C7480.stream(c7650.f20020).filter(new C17050(3, c10471M29711)).collect(C4848.m10284()));
        } else {
            c4848M10292 = null;
        }
        C18213 c18213 = c12955.f36432;
        c18213.getClass();
        for (C4848 c4848M10288 = z2 ? c7650.f20020.m10288(c4848M10292) : c7650.f20020; c4848M10288.m10293(); c4848M10288 = c4848M10288.f11035) {
            c18213.m41432((AbstractC7257) c4848M10288.f11034, c4036);
        }
        if (z2) {
            if (C12955.m29690(c12955, c7650.f20027, c12955.f36438.f21641, C4848.m10283()) == null) {
                c12955.f36432.m41432((AbstractC7257) c12955.f36425.m42160(c12955.f36425.m42142(2305843009230471185L), c12955.f36438.f21641, c12955.f36425.m42208(c12955.f36440.f69215), C4848.m10283(), null, C4848.m10283(), C4848.m10283(), null, null), c4036);
            }
            if (C12955.m29690(c12955, c7650.f20027, c12955.f36438.f21652, C4848.m10283()) == null) {
                c12955.f36432.m41432((AbstractC7257) c12955.f36425.m42160(c12955.f36425.m42142(2305843009230471185L), c12955.f36438.f21652, c12955.f36425.m42208(c12955.f36440.f69134), C4848.m10283(), null, C4848.m10283(), C4848.m10283(), null, null), c4036);
            }
            if (C12955.m29690(c12955, c7650.f20027, c12955.f36438.f21729, C4848.m10276of((Object) c12955.f36440.f69208)) == null) {
                C18537 c185310 = c12955.f36425;
                C4436 c4436M42144 = c12955.f36425.m42142(2305843009230471185L);
                AbstractC12224 abstractC12225 = c12955.f36438.f21729;
                AbstractC14355 abstractC14355M42209 = c12955.f36425.m42208(c12955.f36440.f69151);
                C4848 c4848M10284 = C4848.m10283();
                C18537 c185311 = c12955.f36425;
                C4436 c4436M42145 = c12955.f36425.m42142(8589934592L);
                AbstractC14235 abstractC14236 = c12955.f36438.f21738;
                abstractC14236.getClass();
                char[] charArray2 = "o".toCharArray();
                c12955.f36432.m41432((AbstractC7257) c185310.m42160(c4436M42144, abstractC12225, abstractC14355M42209, c4848M10284, null, C4848.m10276of((Object) c185311.m42163(c4436M42145, abstractC14236.mo17848(charArray2, charArray2.length), c12955.f36425.m42208(c12955.f36440.f69208), (AbstractC14355) null)), C4848.m10283(), null, null), c4036);
            }
            C4848<C11281> c4848M21403 = C9268.m21402(c7650);
            for (C11281 c11281 : c4848M21403) {
                c11281.f31435.f9954 &= -17179869185L;
                c11281.f31438.f20409 &= -17179869185L;
            }
            C7480.stream(c4848M21403).filter(new Predicate() { // from class: l.ۤᩳ۠
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
                public /* synthetic */ Predicate m28337or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C12955 c12956 = this.f34349.f38395;
                    return C12955.m29690(c12956, c12956.f36440.f69208.f16705, ((C11281) obj).f31433, C4848.m10283()) == null;
                }
            }).forEach(new Consumer() { // from class: l.ۛᩳ۠
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    C13645.m31022(this.f21927, c4036, (C11281) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        }
        if (c7650.f20027.mo35946()) {
            C1446.m31704(c7650.f20027.f20410.mo9173());
            C15828 c15829 = c7650.f20027;
            c15829.m35937(new C23147(c15829, c12955.f36441.m34505()));
        }
        if (c12955.f36444) {
            c12955.f36446.m42757(c4036, (C7650) c4036.f8850);
            c12955.f36446.m42759(c4036, (C7650) c4036.f8850);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31022(C13645 c13645, C4036 c4036, C11281 c11281) {
        C4848 c4848M48354;
        C12955 c12955 = c13645.f38395;
        C5771 c5771M29690 = C12955.m29690(c12955, c4036.f8855.f20027, c11281.f31438.f20408, C4848.m10283());
        C13818 c13818 = c11281.f31438;
        C22536 c22536M35935 = ((C15828) c13818.f20407).m35935(c13818);
        if (c5771M29690 == null || (c5771M29690.f20409 & 16777216) != 0) {
            C18537 c18537 = c12955.f36425;
            c18537.f55352 = c11281.f18924;
            C21339 c21339 = new C21339(c18537);
            if (!c22536M35935.m50507().isEmpty()) {
                c4848M48354 = c21339.m48354((Object) null, c22536M35935.m50507());
            } else {
                c4848M48354 = c22536M35935.m50507();
            }
            C11281 c11282 = (C11281) C7480.stream(C9268.m21402((C7650) c4036.f8850)).filter(new C13898(1, c11281)).findAny().get();
            C18537 c18538 = c12955.f36425;
            c18538.f55352 = c11281.f18924;
            C10471 c10471M42160 = c18538.m42160(c12955.f36425.m42190(16777217L, c4848M48354), c11281.f31438.f20408, (AbstractC14355) c21339.mo10751(c11282.f31437, (Object) null), C4848.m10283(), null, C4848.m10283(), C4848.m10283(), null, null);
            c12955.f36432.m41432((AbstractC7257) c10471M42160, c4036);
            c22536M35935.f71074 = c10471M42160.f28960;
            c22536M35935.f71072 = c10471M42160;
            return;
        }
        c22536M35935.f71074 = c5771M29690;
    }
}
