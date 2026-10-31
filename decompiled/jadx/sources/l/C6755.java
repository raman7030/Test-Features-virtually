package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public class C6755 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f20966 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C1386 f20967;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0384 f20968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC16761 f20969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC13829 f20970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6755 f20971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f20972;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12399 f20973;

    public C6755(C12399 c12399, EnumC13829 enumC13829, AbstractC5698 abstractC5698, EnumC16761 enumC16761, C0384 c0384, C6755 c6755, C1386 c1386) {
        this.f20973 = c12399;
        this.f20970 = enumC13829;
        this.f20972 = abstractC5698;
        this.f20969 = enumC16761;
        this.f20971 = c6755;
        this.f20967 = c1386;
        this.f20968 = c0384;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo18376(C1110 c1110, C23420 c23420, InterfaceC19456 interfaceC19456) {
        this.f20966.add(new C18750(this.f20973, c1110, c23420, interfaceC19456));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo18375() {
        C0384 c0384;
        while (true) {
            ArrayList arrayList = this.f20966;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = C2609.m8235((Iterable) arrayList).iterator();
            boolean z = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                c0384 = this.f20968;
                if (zHasNext) {
                    C18750 c18750 = (C18750) it.next();
                    C12399 c12399 = c18750.f59255;
                    C23420 c23420 = c18750.f59254;
                    C1110 c1110 = c18750.f59253;
                    AbstractC12612 abstractC12612 = c1110.f4048;
                    InterfaceC19456 interfaceC19456 = c18750.f59252;
                    int iOrdinal = this.f20970.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            if (interfaceC19456.mo28592()) {
                                C13124 c13124 = c12399.f37355;
                                C6755 c6755 = this.f20971;
                                if (c6755 != c13124 && AbstractC4308.m12903(c6755.f20968.f1817, C2609.m8235((Iterable) interfaceC19456.mo28594()))) {
                                    c6755.mo18376(c1110, c23420.mo38522(new C15926(c23420.f75215, this)), interfaceC19456);
                                    abstractC12612.f16086 = AbstractC4308.f13886;
                                }
                            } else {
                                C12171.m29641("attribution shouldn't be happening here", !m18377());
                                c1110.m3819(c23420.mo38523(c0384.m1859(c23420.f75219)), c12399.f37344);
                            }
                        } else {
                            throw new AssertionError("Bad mode");
                        }
                    } else if (interfaceC19456.mo28592()) {
                        C3933 c3933 = new C3933(c18750);
                        c3933.f12550 = c23420;
                        c3933.f12549 = c0384;
                        c3933.f12548 = c1110.f4049;
                        abstractC12612.mo988(c3933);
                        c1110.f4052.m15289(c12399.f37354, c23420);
                    } else {
                        C12171.m29640("Cannot get here");
                        throw null;
                    }
                    arrayList.remove(c18750);
                    z = true;
                }
            }
            if (!z) {
                if (m18377()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C18750) it2.next()).f59253.f4048.f16086 = AbstractC4308.f13885;
                    }
                    return;
                }
                try {
                    c0384.m1869(C2609.m8235((Iterable) m18378().f59252.mo28594()), this.f20967);
                    c0384.m1872();
                } catch (C0925 unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18377() {
        if (this == this.f20973.f37355) {
            return false;
        }
        if (this.f20970 == EnumC13829.SPECULATIVE) {
            return true;
        }
        return this.f20971.m18377();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18750 m18378() {
        C19271 c19271;
        C12399 c12399 = this.f20973;
        C6735 c6735 = c12399.f37349;
        C1386 c1386 = this.f20967;
        C0384 c0384 = this.f20968;
        c6735.m18349(c0384, c1386);
        C6735 c6736 = c12399.f37349;
        C11003.requireNonNull(c6736);
        final C0219 c0219 = new C0219(new C5159(c6736, c0384, c12399.f37343.f19598));
        ArrayList arrayList = this.f20966;
        C2609<C23688> c2609 = (C2609) C5378.stream(arrayList).map(new C18044()).collect(C2609.m8240());
        for (C23688 c23688 : c2609) {
            for (C23688 c23689 : c2609) {
                if (c23688 != c23689) {
                    Set setMo28593 = ((C18750) c23689.f28700).f59252.mo28593();
                    for (AbstractC4308 abstractC4308 : ((C18750) c23688.f28700).f59252.mo28594()) {
                        Iterator it = c0219.f1475.iterator();
                        do {
                            if (!it.hasNext()) {
                                c19271 = null;
                                break;
                            }
                            c19271 = (C19271) it.next();
                        } while (!((C18837) c19271.f28700).contains(abstractC4308));
                        if (c19271 != null) {
                            final HashSet hashSetM44455 = c19271.m44455();
                            if (C5378.stream(setMo28593).map(new Function() { // from class: l.ܿ۫֨
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo22274andThen(Function function) {
                                    return C20696.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C20696.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    AbstractC4308 abstractC4309 = (AbstractC4308) obj;
                                    for (C19271 c19272 : c0219.f1475) {
                                        if (((C18837) c19272.f28700).contains(abstractC4309)) {
                                            return c19272;
                                        }
                                    }
                                    return null;
                                }
                            }).anyMatch(new Predicate() { // from class: l.ܳ۫֨
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
                                    return hashSetM44455.contains((C19271) obj);
                                }
                            })) {
                                c23688.f76719.add(c23689);
                                break;
                            }
                        }
                    }
                }
            }
        }
        C2609 c26010 = (C2609) C5226.m15019(c2609).get(0);
        return (C18750) (c26010.m8245() == 1 ? ((C23688) c26010.get(0)).f28700 : arrayList.get(0));
    }
}
