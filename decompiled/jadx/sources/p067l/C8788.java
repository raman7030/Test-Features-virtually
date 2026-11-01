package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public class C8788 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f23841 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public final C3686 f23842;

    /* JADX INFO: renamed from: ۧ */
    public final C2733 f23843;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC18298 f23844;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC15511 f23845;

    /* JADX INFO: renamed from: ܿ */
    public final C8788 f23846;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7783 f23847;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C14152 f23848;

    public C8788(C14152 c14152, EnumC15511 enumC15511, AbstractC7783 abstractC7783, EnumC18298 enumC18298, C2733 c2733, C8788 c8788, C3686 c3686) {
        this.f23848 = c14152;
        this.f23845 = enumC15511;
        this.f23847 = abstractC7783;
        this.f23844 = enumC18298;
        this.f23846 = c8788;
        this.f23842 = c3686;
        this.f23843 = c2733;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20324(C3423 c3423, C24626 c24626, InterfaceC20859 interfaceC20859) {
        this.f23841.add(new C20188(this.f23848, c3423, c24626, interfaceC20859));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20323() {
        C2733 c2733;
        while (true) {
            ArrayList arrayList = this.f23841;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = C4848.m10279((Iterable) arrayList).iterator();
            boolean z = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                c2733 = this.f23843;
                if (zHasNext) {
                    C20188 c20188 = (C20188) it.next();
                    C14152 c14152 = c20188.f62478;
                    C24626 c24626 = c20188.f62477;
                    C3423 c3423 = c20188.f62476;
                    AbstractC14355 abstractC14355 = c3423.f6819;
                    InterfaceC20859 interfaceC20859 = c20188.f62475;
                    int iOrdinal = this.f23845.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            if (interfaceC20859.mo30640()) {
                                C14841 c14841 = c14152.f40370;
                                C8788 c8788 = this.f23846;
                                if (c8788 != c14841 && AbstractC6462.m14767(c8788.f23843.f4594, C4848.m10279((Iterable) interfaceC20859.mo30642()))) {
                                    c8788.mo20324(c3423, c24626.mo40739(new C17504(c24626.f77961, this)), interfaceC20859);
                                    abstractC14355.f18925 = AbstractC6462.f16701;
                                }
                            } else {
                                C1446.m31703("attribution shouldn't be happening here", !m20325());
                                c3423.m6076(c24626.mo40740(c2733.m4250(c24626.f77965)), c14152.f40359);
                            }
                        } else {
                            throw new AssertionError("Bad mode");
                        }
                    } else if (interfaceC20859.mo30640()) {
                        C6106 c6106 = new C6106(c20188);
                        c6106.f15358 = c24626;
                        c6106.f15357 = c2733;
                        c6106.f15356 = c3423.f6820;
                        abstractC14355.mo3382(c6106);
                        c3423.f6823.m17197(c14152.f40369, c24626);
                    } else {
                        C1446.m31702("Cannot get here");
                        throw null;
                    }
                    arrayList.remove(c20188);
                    z = true;
                }
            }
            if (!z) {
                if (m20325()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C20188) it2.next()).f62476.f6819.f18925 = AbstractC6462.f16700;
                    }
                    return;
                }
                try {
                    c2733.m4260(C4848.m10279((Iterable) m20326().f62475.mo30642()), this.f23842);
                    c2733.m4263();
                } catch (C3247 unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20325() {
        if (this == this.f23848.f40370) {
            return false;
        }
        if (this.f23845 == EnumC15511.SPECULATIVE) {
            return true;
        }
        return this.f23846.m20325();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C20188 m20326() {
        C20683 c20683;
        C14152 c14152 = this.f23848;
        C8769 c8769 = c14152.f40364;
        C3686 c3686 = this.f23842;
        C2733 c2733 = this.f23843;
        c8769.m20297(c2733, c3686);
        C8769 c87610 = c14152.f40364;
        C12826.requireNonNull(c87610);
        final C2576 c2576 = new C2576(new C7271(c87610, c2733, c14152.f40358.f22469));
        ArrayList arrayList = this.f23841;
        C4848<C24881> c4848 = (C4848) C7480.stream(arrayList).map(new C19517()).collect(C4848.m10284());
        for (C24881 c24881 : c4848) {
            for (C24881 c24882 : c4848) {
                if (c24881 != c24882) {
                    Set setMo30641 = ((C20188) c24882.f31649).f62475.mo30641();
                    for (AbstractC6462 abstractC6462 : ((C20188) c24881.f31649).f62475.mo30642()) {
                        Iterator it = c2576.f4254.iterator();
                        do {
                            if (!it.hasNext()) {
                                c20683 = null;
                                break;
                            }
                            c20683 = (C20683) it.next();
                        } while (!((C20271) c20683.f31649).contains(abstractC6462));
                        if (c20683 != null) {
                            final HashSet hashSetM46749 = c20683.m46749();
                            if (C7480.stream(setMo30641).map(new Function() { // from class: l.ܿ۫֨
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo56417andThen(Function function) {
                                    return C22038.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C22038.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    AbstractC6462 abstractC6463 = (AbstractC6462) obj;
                                    for (C20683 c20684 : c2576.f4254) {
                                        if (((C20271) c20684.f31649).contains(abstractC6463)) {
                                            return c20684;
                                        }
                                    }
                                    return null;
                                }
                            }).anyMatch(new Predicate() { // from class: l.ܳ۫֨
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
                                public /* synthetic */ Predicate m36808or(Predicate predicate) {
                                    return C20697.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return hashSetM46749.contains((C20683) obj);
                                }
                            })) {
                                c24881.f79469.add(c24882);
                                break;
                            }
                        }
                    }
                }
            }
        }
        C4848 c4849 = (C4848) C7335.m16929(c4848).get(0);
        return (C20188) (c4849.m10289() == 1 ? ((C24881) c4849.get(0)).f31649 : arrayList.get(0));
    }
}
