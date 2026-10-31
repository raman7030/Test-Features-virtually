package l;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11865 extends AbstractC1281 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f35386;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11865(C11139 c11139) {
        super(c11139, EnumC12075.MEMBERS_PHASE, null);
        this.f35386 = c11139;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ֫ */
    public final void mo6476(final C1755 c1755) {
        boolean z;
        C15391 c7631;
        long j;
        C8526 c8526M27649;
        C2609 c2609M8248;
        C8526 c8526;
        C19110 c19110;
        AbstractC5698 abstractC5698;
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        c14163.mo16101();
        if ((c14163.f17563 & 512) != 0) {
            z = false;
            break;
        }
        C2609 c2609 = c5557.f17179;
        while (true) {
            if (!c2609.m8249()) {
                z = true;
                break;
            } else {
                if (C7260.m19463((AbstractC5144) c2609.f8240)) {
                    z = false;
                    break;
                }
                c2609 = c2609.f8241;
            }
        }
        boolean zM33810 = c14163.m33810();
        C11139 c11139 = this.f35386;
        if (!z || zM33810) {
            c7631 = null;
        } else {
            c7631 = new C15391(c11139, c14163);
            if (c14163.f17562.isEmpty() && (abstractC5698 = (c19110 = (C19110) c1755.f6072.f6074).f60194) != null) {
                if (abstractC5698.f17559 != EnumC1296.f4581) {
                    c7631 = new C8337(c11139, c14163, (C3581) abstractC5698, c19110.f60199);
                } else {
                    c7631 = null;
                }
            }
        }
        if (zM33810) {
            if (z) {
                j = 2305843009213693952L;
                c8526 = null;
            } else {
                C5557 c5558 = c1755.f6079;
                C2609 c2609M17520 = c11139.f33442.m17520(C7260.m19436(c5558).m8243((Function) new C14205(7)));
                Iterator it = c5558.f17179.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 2305843009213693952L;
                        c8526 = null;
                        break;
                    }
                    AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
                    if (C7260.m19463(abstractC5144)) {
                        c8526 = (C8526) abstractC5144;
                        j = 2305843009213693952L;
                        if (c11139.f33442.m17549(c11139.f33442.m17520((C2609) C5378.stream(c8526.f26048).map(new C21670(6)).collect(C2609.m8240())), c2609M17520)) {
                            break;
                        }
                    }
                }
                if (c8526 == null) {
                }
                if (c8526 != null) {
                    c8526.f26045.f17563 |= j;
                }
            }
            c7631 = new C7631(c11139, c14163, C7260.m19436(c5557));
            if (c8526 != null) {
                c8526.f26045.f17563 |= j;
            }
        } else {
            j = 2305843009213693952L;
        }
        if (c7631 != null) {
            c11139.f33426.m36182(c14163, (InterfaceC3109) c5557);
            C17013 c17013 = c11139.f33425;
            c17013.f52172 = c5557.f16085;
            c8526M27649 = c11139.m27649(c17013, c7631);
            c5557.f17179 = c5557.f17179.m8246(c8526M27649);
        } else {
            c8526M27649 = null;
        }
        if (!c14163.m33810()) {
            m4344(c14163, c1755);
        }
        if (!c5557.f17185.isEmpty()) {
            for (C14315 c14315 : c5557.f17185) {
                c11139.f33426.m36159(c14315, (C8541) c14315.f16086);
            }
        }
        if ((c5557.f17181.f7169 & 16384) != 0 && !c5557.f17186.f17560.m12913(EnumC9454.ERROR) && (c11139.f33442.m17562(c5557.f17186.f17560).f13890.mo16084() & 16384) == 0) {
            c11139.f33432.m39197((AbstractC5144) c11139.f33425.m39917(c11139.f33425.m39899(9L), c11139.f33438.f18900, c11139.f33425.m39965(new C5138(c5557.f17186.f17560, c11139.f33440.f66505)), C2609.m8239(), null, C2609.m8239(), C2609.m8239(), null, null), c1755);
            C17013 c17014 = c11139.f33425;
            C2176 c2176M39899 = c11139.f33425.m39899(9L);
            AbstractC10370 abstractC10370 = c11139.f33438.f18896;
            AbstractC12612 abstractC12612M39965 = c11139.f33425.m39965(c5557.f17186.f17560);
            C2609 c2609M8239 = C2609.m8239();
            C17013 c17015 = c11139.f33425;
            C2176 c2176M398910 = c11139.f33425.m39899(8589967360L);
            AbstractC12486 abstractC12486 = c11139.f33438.f18880;
            abstractC12486.getClass();
            char[] charArray = "name".toCharArray();
            c11139.f33432.m39197((AbstractC5144) c17014.m39917(c2176M39899, abstractC10370, abstractC12612M39965, c2609M8239, null, C2609.of((Object) c17015.m39920(c2176M398910, abstractC12486.mo15927(charArray, charArray.length), c11139.f33425.m39965(c11139.f33440.f66533), (AbstractC12612) null)), C2609.m8239(), null, null), c1755);
        }
        boolean z2 = (c5557.f17186.f17563 & j) != 0;
        if (z2) {
            C2609 c2609M19436 = C7260.m19436(c5557);
            if (c2609M19436 == null) {
                c2609M19436 = null;
            } else {
                Iterator it2 = c2609M19436.iterator();
                while (it2.hasNext()) {
                    AbstractC5144.class.cast(it2.next());
                }
            }
            c2609M8248 = c2609M19436.m8248((C2609) C5378.stream(c5557.f17179).filter(new C15448(3, c8526M27649)).collect(C2609.m8240()));
        } else {
            c2609M8248 = null;
        }
        C16672 c16672 = c11139.f33432;
        c16672.getClass();
        for (C2609 c2609M8244 = z2 ? c5557.f17179.m8244(c2609M8248) : c5557.f17179; c2609M8244.m8249(); c2609M8244 = c2609M8244.f8241) {
            c16672.m39197((AbstractC5144) c2609M8244.f8240, c1755);
        }
        if (z2) {
            if (C11139.m27628(c11139, c5557.f17186, c11139.f33438.f18783, C2609.m8239()) == null) {
                c11139.f33432.m39197((AbstractC5144) c11139.f33425.m39917(c11139.f33425.m39899(2305843009230471185L), c11139.f33438.f18783, c11139.f33425.m39965(c11139.f33440.f66533), C2609.m8239(), null, C2609.m8239(), C2609.m8239(), null, null), c1755);
            }
            if (C11139.m27628(c11139, c5557.f17186, c11139.f33438.f18794, C2609.m8239()) == null) {
                c11139.f33432.m39197((AbstractC5144) c11139.f33425.m39917(c11139.f33425.m39899(2305843009230471185L), c11139.f33438.f18794, c11139.f33425.m39965(c11139.f33440.f66452), C2609.m8239(), null, C2609.m8239(), C2609.m8239(), null, null), c1755);
            }
            if (C11139.m27628(c11139, c5557.f17186, c11139.f33438.f18871, C2609.of((Object) c11139.f33440.f66526)) == null) {
                C17013 c17016 = c11139.f33425;
                C2176 c2176M398911 = c11139.f33425.m39899(2305843009230471185L);
                AbstractC10370 abstractC10371 = c11139.f33438.f18871;
                AbstractC12612 abstractC12612M39966 = c11139.f33425.m39965(c11139.f33440.f66469);
                C2609 c2609M82310 = C2609.m8239();
                C17013 c17017 = c11139.f33425;
                C2176 c2176M398912 = c11139.f33425.m39899(8589934592L);
                AbstractC12486 abstractC12487 = c11139.f33438.f18880;
                abstractC12487.getClass();
                char[] charArray2 = "o".toCharArray();
                c11139.f33432.m39197((AbstractC5144) c17016.m39917(c2176M398911, abstractC10371, abstractC12612M39966, c2609M82310, null, C2609.of((Object) c17017.m39920(c2176M398912, abstractC12487.mo15927(charArray2, charArray2.length), c11139.f33425.m39965(c11139.f33440.f66526), (AbstractC12612) null)), C2609.m8239(), null, null), c1755);
            }
            C2609<C9378> c2609M19437 = C7260.m19436(c5557);
            for (C9378 c9378 : c2609M19437) {
                c9378.f28486.f7169 &= -17179869185L;
                c9378.f28489.f17563 &= -17179869185L;
            }
            C5378.stream(c2609M19437).filter(new Predicate() { // from class: l.ۤᩳ۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C11139 c111310 = this.f31386.f35386;
                    return C11139.m27628(c111310, c111310.f33440.f66526.f13890, ((C9378) obj).f28484, C2609.m8239()) == null;
                }
            }).forEach(new Consumer() { // from class: l.ۛᩳ۠
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C11865.m28971(this.f19064, c1755, (C9378) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
        if (c5557.f17186.mo33814()) {
            C12171.m29642(c5557.f17186.f17564.mo7078());
            C14163 c14164 = c5557.f17186;
            c14164.m33805(new C21863(c14164, c11139.f33441.m32403()));
        }
        if (c11139.f33444) {
            c11139.f33446.m40510(c1755, (C5557) c1755.f6074);
            c11139.f33446.m40512(c1755, (C5557) c1755.f6074);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28971(C11865 c11865, C1755 c1755, C9378 c9378) {
        C2609 c2609M46040;
        C11139 c11139 = c11865.f35386;
        C3581 c3581M27628 = C11139.m27628(c11139, c1755.f6079.f17186, c9378.f28489.f17562, C2609.m8239());
        C12048 c12048 = c9378.f28489;
        C21221 c21221M33803 = ((C14163) c12048.f17561).m33803(c12048);
        if (c3581M27628 == null || (c3581M27628.f17563 & 16777216) != 0) {
            C17013 c17013 = c11139.f33425;
            c17013.f52172 = c9378.f16085;
            C19961 c19961 = new C19961(c17013);
            if (!c21221M33803.m48176().isEmpty()) {
                c2609M46040 = c19961.m46040((Object) null, c21221M33803.m48176());
            } else {
                c2609M46040 = c21221M33803.m48176();
            }
            C9378 c9379 = (C9378) C5378.stream(C7260.m19436((C5557) c1755.f6074)).filter(new C12132(1, c9378)).findAny().get();
            C17013 c17014 = c11139.f33425;
            c17014.f52172 = c9378.f16085;
            C8526 c8526M39917 = c17014.m39917(c11139.f33425.m39947(16777217L, c2609M46040), c9378.f28489.f17562, (AbstractC12612) c19961.mo8690(c9379.f28488, (Object) null), C2609.m8239(), null, C2609.m8239(), C2609.m8239(), null, null);
            c11139.f33432.m39197((AbstractC5144) c8526M39917, c1755);
            c21221M33803.f68391 = c8526M39917.f26045;
            c21221M33803.f68389 = c8526M39917;
            return;
        }
        c21221M33803.f68391 = c3581M27628;
    }
}
