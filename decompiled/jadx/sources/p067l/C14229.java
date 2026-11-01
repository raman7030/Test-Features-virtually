package p067l;

import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C14229 {

    /* JADX INFO: renamed from: ֫ */
    public WeakHashMap f40529 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8374 f40530;

    public C14229(C8374 c8374) {
        this.f40530 = c8374;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14899 m32702(final AbstractC21195 abstractC21195) {
        C14899 c14899;
        WeakHashMap weakHashMap = this.f40529;
        C5512 c5512 = (C5512) weakHashMap.get(abstractC21195);
        C8374 c8374 = this.f40530;
        C8005 c8005 = c8374.f22472;
        C19043 c19043M19438 = c8374.m19438(abstractC21195.f20406, false);
        if (c5512 != null && c5512.f13178 == c19043M19438.mo29925()) {
            return c5512.f13177;
        }
        if (!abstractC21195.m17989() || (abstractC21195.mo18003() & 8192) != 0 || abstractC21195.m18019()) {
            C18258 c18258M18548 = c8374.f22472.m18548("not.a.functional.intf", abstractC21195);
            C8194 c8194 = new C8194();
            c8194.f21626 = c18258M18548;
            throw c8194;
        }
        C20271<AbstractC7783> c20271 = new C20271();
        for (final AbstractC7783 abstractC7783 : c19043M19438.mo22455(new C12218(abstractC21195, c8374), EnumC3620.RECURSIVE)) {
            final AbstractC6462 abstractC6462M19483 = c8374.m19483(abstractC7783, abstractC21195.f20406);
            if (c20271.isEmpty()) {
                c20271.m45777(abstractC7783);
            } else {
                if (abstractC7783.f20408 != ((AbstractC7783) c20271.first()).f20408 || !c8374.m19456(abstractC6462M19483, c8374.m19483((AbstractC7783) c20271.first(), abstractC21195.f20406))) {
                    EnumC10306 enumC10306M51425 = C23047.m51425(abstractC21195);
                    C13370 c13370 = C13665.f38450;
                    C18258 c18258M18549 = c8374.f22472.m18548("not.a.functional.intf.1", abstractC21195, c8005.m18543(new C13370("compiler", "incompatible.abstracts", enumC10306M51425, abstractC21195)));
                    C8194 c8195 = new C8194();
                    c8195.f21626 = c18258M18549;
                    throw c8195;
                }
                if (!C7480.stream(c20271).filter(new Predicate() { // from class: l.ܶܶ֨
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
                    public /* synthetic */ Predicate m38482or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C14229 c14229 = this.f50068;
                        c14229.getClass();
                        return ((AbstractC7783) obj).f20407.mo17999(abstractC7783.m17990(), c14229.f40530);
                    }
                }).map(new Function() { // from class: l.᩸ܶ֨
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
                        return this.f72190.f40530.m19483((AbstractC7783) obj, abstractC21195.f20406);
                    }
                }).anyMatch(new Predicate() { // from class: l.᩹ܶ֨
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
                    public /* synthetic */ Predicate m52436or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return this.f75170.f40530.m19472((AbstractC6462) obj, abstractC6462M19483, true);
                    }
                })) {
                    c20271.m45777(abstractC7783);
                }
            }
        }
        if (c20271.isEmpty()) {
            EnumC10306 enumC10306M51426 = C23047.m51425(abstractC21195);
            C13370 c13371 = C13665.f38450;
            C18258 c18258M185410 = c8374.f22472.m18548("not.a.functional.intf.1", abstractC21195, c8005.m18543(new C13370("compiler", "no.abstracts", enumC10306M51426, abstractC21195)));
            C8194 c8196 = new C8194();
            c8196.f21626 = c18258M185410;
            throw c8196;
        }
        if (c20271.size() == 1) {
            c14899 = new C14899(this, (AbstractC7783) c20271.first());
        } else {
            c14899 = (C14899) c8374.m19437(c20271.m45783(), abstractC21195.f20406, false).map(new Function() { // from class: l.᩶ܶ֨
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
                    AbstractC7783 abstractC7784 = (AbstractC7783) obj;
                    C14229 c14229 = this.f68098;
                    c14229.getClass();
                    return new C6853(c14229, abstractC7784.mo9143(), abstractC7784);
                }
            }).orElse(null);
            if (c14899 == null) {
                C20271 c20272 = new C20271();
                for (AbstractC7783 abstractC7784 : c20271) {
                    c20272.m45777(c8005.m18548(abstractC7784.f20406.mo14794().m10293() ? "descriptor.throws" : "descriptor", abstractC7784.f20408, abstractC7784.f20406.mo14797(), abstractC7784.f20406.mo14787(), abstractC7784.f20406.mo14794()));
                }
                EnumC10306 enumC10306M51427 = C23047.m51425(abstractC21195);
                C13370 c13372 = C13665.f38450;
                C24098 c24098 = new C24098(c8005.m18543(new C13370("compiler", "incompatible.descs.in.functional.intf", enumC10306M51427, abstractC21195)), c20272.m45783());
                C8194 c8197 = new C8194();
                c8197.f21626 = c24098;
                throw c8197;
            }
        }
        weakHashMap.put(abstractC21195, new C5512(c14899, c19043M19438.mo29925()));
        return c14899;
    }
}
