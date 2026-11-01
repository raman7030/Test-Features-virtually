package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6814 extends AbstractC2562 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C5473 f17695;

    /* JADX INFO: renamed from: ܿ */
    public final C2417 f17697;

    /* JADX INFO: renamed from: ᩳ */
    public final C4036 f17698;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f17694 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f17693 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public HashMap f17696 = new HashMap();

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        boolean z;
        C4848 c4848M10283 = C4848.m10283();
        C2417 c2417 = this.f17697;
        c2417.f3696 = c4848M10283;
        c2417.f3701 = C4848.m10283();
        c2417.f3693 = C4848.m10283();
        C21230.forEach(c5777.f14181, new C21510(1, this));
        c2417.f3696 = c2417.f3696.m10294();
        c2417.f3701 = c2417.f3701.m10294();
        c2417.f3693 = c2417.f3693.m10294();
        if (c2417.f3705.m10293() && ((C11648) c2417.f3705.f11034).f32493.contains(EnumC10977.MANDATED)) {
            c2417.f3696 = c2417.f3696.m10290((AbstractC4942) c2417.f3705.f11034);
        }
        C4848 c4848 = c2417.f3696;
        C5473 c5473 = this.f17695;
        C4848 c4848M10279 = C4848.m10279((Iterable) C15525.getOrDefault(c5473.f13086, c2417, Collections.EMPTY_SET));
        c4848.getClass();
        c2417.f3696 = c4848M10279.m10292(c4848);
        for (C22377 c22377 : c2417.f3701) {
            C14494 c14494 = (C14494) this.f17696.get(c22377);
            C4848 c4849 = c22377.f70595;
            C15828 c15828 = c22377.f70596;
            Iterator it = c4849.iterator();
            while (it.hasNext()) {
                C9794 c9794M18008 = ((C15828) it.next()).m18008();
                if (c9794M18008.f27063 != c2417) {
                    C23623 c23623 = c5473.f13091;
                    c14494.getClass();
                    C2417 c2418 = c9794M18008.f27063;
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(c14494, new C14040("compiler", "service.implementation.not.in.right.module", c2418));
                }
                C9794 c9794M18009 = c15828.m18008();
                boolean z2 = c9794M18009.f27063 == c2417;
                boolean z3 = c2417.f3689.get(c9794M18009.f27059) == c9794M18009;
                if (z2 && !z3) {
                    Iterator it2 = c2417.f3697.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (c9794M18009 == ((C19023) it2.next()).f56714) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        Iterator it3 = c2417.f3693.iterator();
                        while (it3.hasNext()) {
                            if (c15828 == ((C17681) it3.next()).f52813) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        C23623 c23624 = c5473.f13091;
                        c14494.getClass();
                        C12895 c12895 = C15675.f45417;
                        c23624.m9364(c14494, new C12895("compiler", "service.provided.but.not.exported.or.used", c15828));
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3813(C15025 c15025) {
        boolean z;
        C5473 c5473;
        C9794 c9794 = c15025.f42931.f56714;
        c9794.mo18020();
        AbstractC15689 abstractC15689 = c9794.f27061;
        abstractC15689.getClass();
        Iterable iterableMo22455 = abstractC15689.mo22455((Predicate) null, EnumC3620.RECURSIVE);
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = ((C21726) iterableMo22455).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
            if (abstractC7783.f20405 == EnumC3600.f7354) {
                C15828 c15828 = (C15828) abstractC7783;
                if (abstractC7783.f20410.mo9173() || c15828.f45854.mo23287() == EnumC18398.CLASS) {
                    c4848M10283 = C4848.m10283();
                    z = true;
                    break;
                } else if (c15828.f45854.mo23287() == EnumC18398.SOURCE) {
                    c4848M10283 = c4848M10283.m10290(c15828.f45854);
                }
            }
        }
        Iterator it2 = c4848M10283.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c5473 = this.f17695;
            if (!zHasNext) {
                break;
            } else if (C6684.m15205((C6684) c5473.f13088.f45697, (InterfaceC19740) it2.next()) == c15025.f42931.f56714.f27059) {
                z = true;
                break;
            }
        }
        if (!z) {
            C23623 c23623 = c5473.f13091;
            AbstractC14355 abstractC14355 = c15025.f42932;
            abstractC14355.getClass();
            C9794 c9795 = c15025.f42931.f56714;
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "package.empty.or.not.found", c9795));
        }
        C2417 c2417 = this.f17697;
        c2417.f3696 = c2417.f3696.m10290(c15025.f42931);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3778(C2423 c2423) {
        this.f17695.f13074.m38289((InterfaceC5323) c2423.f3722, c2423.f3721.f79951);
        C2417 c2417 = this.f17697;
        c2417.f3696 = c2417.f3696.m10290(c2423.f3721);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3812(C14494 c14494) {
        C5771 c5771;
        C5771 c5772;
        C5473 c5473 = this.f17695;
        C11216 c11216 = c5473.f13090;
        AbstractC14355 abstractC14355 = c14494.f41389;
        AbstractC6462 abstractC6462 = c5473.f13069.f69208;
        C4036 c4036 = this.f17698;
        AbstractC6462 abstractC6462M25963 = c11216.m25963(abstractC14355, c4036, abstractC6462);
        C15828 c15828 = (C15828) abstractC6462M25963.f16705;
        HashMap map = this.f17693;
        boolean z = true;
        if (map.containsKey(c15828)) {
            C23623 c23623 = c5473.f13091;
            abstractC14355.getClass();
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "repeated.provides.for.service", c15828));
        }
        C20271 c20271 = new C20271();
        for (AbstractC14355 abstractC14356 : c14494.f41388) {
            Object obj = c4036.f8849;
            Object obj2 = c4036.f8849;
            boolean z2 = ((C10545) obj).f29198;
            try {
                ((C10545) obj).f29198 = z;
                AbstractC6462 abstractC6462M25964 = c5473.f13090.m25963(abstractC14356, c4036, c5473.f13069.f69208);
                ((C10545) obj2).f29198 = z2;
                C15828 c15829 = (C15828) abstractC6462M25964.f16705;
                if ((c15829.f20409 & 1) == 0) {
                    C23623 c23624 = c5473.f13091;
                    abstractC14356.getClass();
                    AbstractC7783 abstractC7783M17991 = c15829.m17991();
                    C14040 c14041 = C8300.f21997;
                    c23624.m9352(abstractC14356, new C14040("compiler", "not.def.public", c15829, abstractC7783M17991));
                }
                c15829.mo18020();
                AbstractC15689 abstractC15689 = c15829.f45850;
                AbstractC12224 abstractC12224 = c5473.f13065.f21714;
                C6611 c6611 = new C6611(4);
                abstractC15689.getClass();
                Iterator it = abstractC15689.mo22457(abstractC12224, c6611, EnumC3620.RECURSIVE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c5771 = null;
                        break;
                    }
                    c5771 = (C5771) ((AbstractC7783) it.next());
                    if (c5771.mo17483() && (c5771.f20409 & 1) != 0 && c5771.m12939().isEmpty()) {
                        break;
                    }
                }
                if (c5771 != null) {
                    if (!c5473.f13080.m19486(c5771.f20406.mo14787(), abstractC6462M25963, true)) {
                        C23623 c23625 = c5473.f13091;
                        abstractC14356.getClass();
                        c23625.m9352(abstractC14356, C8300.f22019);
                    }
                } else if (!c5473.f13080.m19486(abstractC6462M25964, abstractC6462M25963, true)) {
                    C23623 c23626 = c5473.f13091;
                    abstractC14356.getClass();
                    c23626.m9352(abstractC14356, C8300.f22008);
                } else {
                    c15829.mo18020();
                    if ((c15829.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        C23623 c23627 = c5473.f13091;
                        abstractC14356.getClass();
                        C14040 c14042 = C8300.f21997;
                        c23627.m9352(abstractC14356, new C14040("compiler", "service.implementation.is.abstract", c15829));
                    } else if (c15829.m17988()) {
                        C23623 c23628 = c5473.f13091;
                        abstractC14356.getClass();
                        C14040 c14043 = C8300.f21997;
                        c23628.m9352(abstractC14356, new C14040("compiler", "service.implementation.is.inner", c15829));
                    } else {
                        c15829.mo18020();
                        Iterator it2 = c15829.f45850.m22456(c5473.f13065.f21737).iterator();
                        do {
                            if (!it2.hasNext()) {
                                c5772 = null;
                                break;
                            }
                            c5772 = (C5771) ((AbstractC7783) it2.next());
                        } while (!c5772.m12939().isEmpty());
                        if (c5772 == null) {
                            C23623 c23629 = c5473.f13091;
                            abstractC14356.getClass();
                            C14040 c14044 = C8300.f21997;
                            c23629.m9352(abstractC14356, new C14040("compiler", "service.implementation.doesnt.have.a.no.args.constructor", c15829));
                        } else if ((c5772.f20409 & 1) == 0) {
                            C23623 c236210 = c5473.f13091;
                            abstractC14356.getClass();
                            C14040 c14045 = C8300.f21997;
                            c236210.m9352(abstractC14356, new C14040("compiler", "service.implementation.no.args.constructor.not.public", c15829));
                        }
                    }
                }
                if (abstractC6462M25964.m14777(EnumC11353.CLASS)) {
                    if (((Set) C15525.computeIfAbsent(map, c15828, new C10842(4))).add(c15829)) {
                        c20271.m45777(c15829);
                    } else {
                        C23623 c236211 = c5473.f13091;
                        abstractC14356.getClass();
                        C14040 c14046 = C8300.f21997;
                        c236211.m9352(abstractC14356, new C14040("compiler", "duplicate.provides", c15828, c15829));
                    }
                }
                z = true;
                c4036 = c4036;
            } catch (Throwable th) {
                ((C10545) obj2).f29198 = z2;
                throw th;
            }
        }
        if (!abstractC6462M25963.m14777(EnumC11353.CLASS) || c20271.isEmpty()) {
            return;
        }
        C22377 c22377 = new C22377(c15828, c20271.m45783());
        C2417 c2417 = this.f17697;
        c2417.f3701 = c2417.f3701.m10290(c22377);
        c2417.f3696 = c2417.f3696.m10290(c22377);
        this.f17696.put(c22377, c14494);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3811(C13824 c13824) {
        C11648 c11648 = c13824.f39062;
        AbstractC14355 abstractC14355 = c13824.f39063;
        if (c11648 != null) {
            C5473 c5473 = this.f17695;
            if (c5473.m12097().contains(c13824.f39062.f32494)) {
                C16852 c16852 = c5473.f13074;
                abstractC14355.getClass();
                C2417 c2417 = c13824.f39062.f32494;
                c16852.getClass();
                C19536 c19536 = new C19536(abstractC14355);
                C2417 c2418 = this.f17697;
                c16852.m38277(c19536, c2418, c2417);
                c5473.f13074.m38288(abstractC14355, c2418, c13824.f39062.f32494);
                c5473.f13074.m38290(abstractC14355, c13824.f39062);
                c2418.f3696 = c2418.f3696.m10290(c13824.f39062);
            }
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3835(C22010 c22010) {
        C5473 c5473 = this.f17695;
        C11216 c11216 = c5473.f13090;
        AbstractC14355 abstractC14355 = c22010.f69239;
        AbstractC6462 abstractC6462M25963 = c11216.m25963(abstractC14355, this.f17698, c5473.f13069.f69208);
        if ((C9268.m21438(abstractC14355).mo18003() & 16384) != 0) {
            C23623 c23623 = c5473.f13091;
            abstractC14355.getClass();
            AbstractC21195 abstractC21195 = abstractC6462M25963.f16705;
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "service.definition.is.enum", abstractC21195));
            return;
        }
        if (abstractC6462M25963.m14777(EnumC11353.CLASS)) {
            C15828 c15828 = (C15828) abstractC6462M25963.f16705;
            if (this.f17694.add(c15828)) {
                C17681 c17681 = new C17681(c15828);
                C2417 c2417 = this.f17697;
                c2417.f3693 = c2417.f3693.m10290(c17681);
                c2417.f3696 = c2417.f3696.m10290(c17681);
                return;
            }
            C23623 c23624 = c5473.f13091;
            C14040 c14041 = C8300.f21997;
            c23624.m9352(c22010, new C14040("compiler", "duplicate.uses", c15828));
        }
    }

    public C6814(C5473 c5473, C2417 c2417, C4036 c4036) {
        this.f17695 = c5473;
        this.f17697 = c2417;
        this.f17698 = c4036;
    }
}
