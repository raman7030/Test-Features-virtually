package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4678 extends AbstractC0204 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f14866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0052 f14868;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1755 f14869;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f14865 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f14864 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f14867 = new HashMap();

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        boolean z;
        C2609 c2609M8239 = C2609.m8239();
        C0052 c0052 = this.f14868;
        c0052.f920 = c2609M8239;
        c0052.f925 = C2609.m8239();
        c0052.f917 = C2609.m8239();
        C19846.forEach(c3587.f11376, new C20141(1, this));
        c0052.f920 = c0052.f920.m8250();
        c0052.f925 = c0052.f925.m8250();
        c0052.f917 = c0052.f917.m8250();
        if (c0052.f929.m8249() && ((C9764) c0052.f929.f8240).f29540.contains(EnumC9058.MANDATED)) {
            c0052.f920 = c0052.f920.m8246((AbstractC2708) c0052.f929.f8240);
        }
        C2609 c2609 = c0052.f920;
        C3267 c3267 = this.f14866;
        C2609 c2609M8235 = C2609.m8235((Iterable) C13843.getOrDefault(c3267.f10278, c0052, Collections.EMPTY_SET));
        c2609.getClass();
        c0052.f920 = c2609M8235.m8248(c2609);
        for (C21053 c21053 : c0052.f925) {
            C12759 c12759 = (C12759) this.f14867.get(c21053);
            C2609 c26010 = c21053.f67911;
            C14163 c14163 = c21053.f67912;
            Iterator it = c26010.iterator();
            while (it.hasNext()) {
                C7814 c7814M16089 = ((C14163) it.next()).m16089();
                if (c7814M16089.f24147 != c0052) {
                    C22364 c22364 = c3267.f10283;
                    c12759.getClass();
                    C0052 c0053 = c7814M16089.f24147;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c12759, new C12281("compiler", "service.implementation.not.in.right.module", c0053));
                }
                C7814 c7814M160810 = c14163.m16089();
                boolean z2 = c7814M160810.f24147 == c0052;
                boolean z3 = c0052.f913.get(c7814M160810.f24143) == c7814M160810;
                if (z2 && !z3) {
                    Iterator it2 = c0052.f921.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (c7814M160810 == ((C17524) it2.next()).f53523) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        Iterator it3 = c0052.f917.iterator();
                        while (it3.hasNext()) {
                            if (c14163 == ((C16112) it3.next()).f49647) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        C22364 c22365 = c3267.f10283;
                        c12759.getClass();
                        C11076 c11076 = C14001.f42334;
                        c22365.m7285(c12759, new C11076("compiler", "service.provided.but.not.exported.or.used", c14163));
                    }
                }
            }
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1400(C13317 c13317) {
        boolean z;
        C3267 c3267;
        C7814 c7814 = c13317.f39864.f53523;
        c7814.mo16101();
        AbstractC14016 abstractC14016 = c7814.f24145;
        abstractC14016.getClass();
        Iterable iterableMo20475 = abstractC14016.mo20475((Predicate) null, EnumC1317.RECURSIVE);
        C2609 c2609M8239 = C2609.m8239();
        Iterator it = ((C20368) iterableMo20475).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
            if (abstractC5698.f17559 == EnumC1296.f4582) {
                C14163 c14163 = (C14163) abstractC5698;
                if (abstractC5698.f17564.mo7078() || c14163.f42766.mo21321() == EnumC16866.CLASS) {
                    c2609M8239 = C2609.m8239();
                    z = true;
                    break;
                } else if (c14163.f42766.mo21321() == EnumC16866.SOURCE) {
                    c2609M8239 = c2609M8239.m8246(c14163.f42766);
                }
            }
        }
        Iterator it2 = c2609M8239.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c3267 = this.f14866;
            if (!zHasNext) {
                break;
            } else if (C4541.m13317((C4541) c3267.f10280.f42611, (InterfaceC18278) it2.next()) == c13317.f39864.f53523.f24143) {
                z = true;
                break;
            }
        }
        if (!z) {
            C22364 c22364 = c3267.f10283;
            AbstractC12612 abstractC12612 = c13317.f39865;
            abstractC12612.getClass();
            C7814 c7815 = c13317.f39864.f53523;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "package.empty.or.not.found", c7815));
        }
        C0052 c0052 = this.f14868;
        c0052.f920 = c0052.f920.m8246(c13317.f39864);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1365(C0058 c0058) {
        this.f14866.f10266.m36128((InterfaceC3109) c0058.f946, c0058.f945.f77199);
        C0052 c0052 = this.f14868;
        c0052.f920 = c0052.f920.m8246(c0058.f945);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1399(C12759 c12759) {
        C3581 c3581;
        C3581 c3582;
        C3267 c3267 = this.f14866;
        C9310 c9310 = c3267.f10282;
        AbstractC12612 abstractC12612 = c12759.f38349;
        AbstractC4308 abstractC4308 = c3267.f10261.f66526;
        C1755 c1755 = this.f14869;
        AbstractC4308 abstractC4308M23954 = c9310.m23954(abstractC12612, c1755, abstractC4308);
        C14163 c14163 = (C14163) abstractC4308M23954.f13890;
        HashMap map = this.f14864;
        boolean z = true;
        if (map.containsKey(c14163)) {
            C22364 c22364 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "repeated.provides.for.service", c14163));
        }
        C18837 c18837 = new C18837();
        for (AbstractC12612 abstractC12613 : c12759.f38348) {
            Object obj = c1755.f6073;
            Object obj2 = c1755.f6073;
            boolean z2 = ((C8604) obj).f26282;
            try {
                ((C8604) obj).f26282 = z;
                AbstractC4308 abstractC4308M23955 = c3267.f10282.m23954(abstractC12613, c1755, c3267.f10261.f66526);
                ((C8604) obj2).f26282 = z2;
                C14163 c14164 = (C14163) abstractC4308M23955.f13890;
                if ((c14164.f17563 & 1) == 0) {
                    C22364 c22365 = c3267.f10283;
                    abstractC12613.getClass();
                    AbstractC5698 abstractC5698M16072 = c14164.m16072();
                    C12281 c12282 = C6241.f19132;
                    c22365.m7273(abstractC12613, new C12281("compiler", "not.def.public", c14164, abstractC5698M16072));
                }
                c14164.mo16101();
                AbstractC14016 abstractC14016 = c14164.f42762;
                AbstractC10370 abstractC10370 = c3267.f10257.f18856;
                C4464 c4464 = new C4464(4);
                abstractC14016.getClass();
                Iterator it = abstractC14016.mo20477(abstractC10370, c4464, EnumC1317.RECURSIVE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c3581 = null;
                        break;
                    }
                    c3581 = (C3581) ((AbstractC5698) it.next());
                    if (c3581.mo15572() && (c3581.f17563 & 1) != 0 && c3581.m10963().isEmpty()) {
                        break;
                    }
                }
                if (c3581 != null) {
                    if (!c3267.f10272.m17546(c3581.f17560.mo12923(), abstractC4308M23954, true)) {
                        C22364 c22366 = c3267.f10283;
                        abstractC12613.getClass();
                        c22366.m7273(abstractC12613, C6241.f19154);
                    }
                } else if (!c3267.f10272.m17546(abstractC4308M23955, abstractC4308M23954, true)) {
                    C22364 c22367 = c3267.f10283;
                    abstractC12613.getClass();
                    c22367.m7273(abstractC12613, C6241.f19143);
                } else {
                    c14164.mo16101();
                    if ((c14164.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        C22364 c22368 = c3267.f10283;
                        abstractC12613.getClass();
                        C12281 c12283 = C6241.f19132;
                        c22368.m7273(abstractC12613, new C12281("compiler", "service.implementation.is.abstract", c14164));
                    } else if (c14164.m16069()) {
                        C22364 c22369 = c3267.f10283;
                        abstractC12613.getClass();
                        C12281 c12284 = C6241.f19132;
                        c22369.m7273(abstractC12613, new C12281("compiler", "service.implementation.is.inner", c14164));
                    } else {
                        c14164.mo16101();
                        Iterator it2 = c14164.f42762.m20476(c3267.f10257.f18879).iterator();
                        do {
                            if (!it2.hasNext()) {
                                c3582 = null;
                                break;
                            }
                            c3582 = (C3581) ((AbstractC5698) it2.next());
                        } while (!c3582.m10963().isEmpty());
                        if (c3582 == null) {
                            C22364 c223610 = c3267.f10283;
                            abstractC12613.getClass();
                            C12281 c12285 = C6241.f19132;
                            c223610.m7273(abstractC12613, new C12281("compiler", "service.implementation.doesnt.have.a.no.args.constructor", c14164));
                        } else if ((c3582.f17563 & 1) == 0) {
                            C22364 c223611 = c3267.f10283;
                            abstractC12613.getClass();
                            C12281 c12286 = C6241.f19132;
                            c223611.m7273(abstractC12613, new C12281("compiler", "service.implementation.no.args.constructor.not.public", c14164));
                        }
                    }
                }
                if (abstractC4308M23955.m12913(EnumC9454.CLASS)) {
                    if (((Set) C13843.computeIfAbsent(map, c14163, new C8916(4))).add(c14164)) {
                        c18837.m43511(c14164);
                    } else {
                        C22364 c223612 = c3267.f10283;
                        abstractC12613.getClass();
                        C12281 c12287 = C6241.f19132;
                        c223612.m7273(abstractC12613, new C12281("compiler", "duplicate.provides", c14163, c14164));
                    }
                }
                z = true;
                c1755 = c1755;
            } catch (Throwable th) {
                ((C8604) obj2).f26282 = z2;
                throw th;
            }
        }
        if (!abstractC4308M23954.m12913(EnumC9454.CLASS) || c18837.isEmpty()) {
            return;
        }
        C21053 c21053 = new C21053(c14163, c18837.m43517());
        C0052 c0052 = this.f14868;
        c0052.f925 = c0052.f925.m8246(c21053);
        c0052.f920 = c0052.f920.m8246(c21053);
        this.f14867.put(c21053, c12759);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1398(C12054 c12054) {
        C9764 c9764 = c12054.f36051;
        AbstractC12612 abstractC12612 = c12054.f36052;
        if (c9764 != null) {
            C3267 c3267 = this.f14866;
            if (c3267.m10064().contains(c12054.f36051.f29541)) {
                C15240 c15240 = c3267.f10266;
                abstractC12612.getClass();
                C0052 c0052 = c12054.f36051.f29541;
                c15240.getClass();
                C18064 c18064 = new C18064(abstractC12612);
                C0052 c0053 = this.f14868;
                c15240.m36116(c18064, c0053, c0052);
                c3267.f10266.m36127(abstractC12612, c0053, c12054.f36051.f29541);
                c3267.f10266.m36129(abstractC12612, c12054.f36051);
                c0053.f920 = c0053.f920.m8246(c12054.f36051);
            }
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1422(C20667 c20667) {
        C3267 c3267 = this.f14866;
        C9310 c9310 = c3267.f10282;
        AbstractC12612 abstractC12612 = c20667.f66557;
        AbstractC4308 abstractC4308M23954 = c9310.m23954(abstractC12612, this.f14869, c3267.f10261.f66526);
        if ((C7260.m19472(abstractC12612).mo16084() & 16384) != 0) {
            C22364 c22364 = c3267.f10283;
            abstractC12612.getClass();
            AbstractC19810 abstractC19810 = abstractC4308M23954.f13890;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "service.definition.is.enum", abstractC19810));
            return;
        }
        if (abstractC4308M23954.m12913(EnumC9454.CLASS)) {
            C14163 c14163 = (C14163) abstractC4308M23954.f13890;
            if (this.f14865.add(c14163)) {
                C16112 c16112 = new C16112(c14163);
                C0052 c0052 = this.f14868;
                c0052.f917 = c0052.f917.m8246(c16112);
                c0052.f920 = c0052.f920.m8246(c16112);
                return;
            }
            C22364 c22365 = c3267.f10283;
            C12281 c12282 = C6241.f19132;
            c22365.m7273(c20667, new C12281("compiler", "duplicate.uses", c14163));
        }
    }

    public C4678(C3267 c3267, C0052 c0052, C1755 c1755) {
        this.f14866 = c3267;
        this.f14868 = c0052;
        this.f14869 = c1755;
    }
}
