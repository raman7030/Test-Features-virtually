package p067l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩶ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21567 extends AbstractC2562 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C5473 f68010;

    /* JADX INFO: renamed from: ᩳ */
    public C2417 f68011;

    /* JADX INFO: renamed from: ܽ */
    public final HashSet f68009 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f68007 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f68008 = new HashMap();

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3812(C14494 c14494) {
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3835(C22010 c22010) {
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        C2417 c2417 = c5777.f14182;
        C1446.m31699(c2417);
        this.f68011 = c2417;
        if (c5777.mo12958() == EnumC8885.OPEN) {
            this.f68011.f3692.add(EnumC19853.OPEN);
        }
        C2417 c2418 = this.f68011;
        c2418.f20409 |= c5777.f14184.f9954 & 131072;
        c2418.f3705 = C4848.m10283();
        this.f68011.f3697 = C4848.m10283();
        this.f68011.f3695 = C4848.m10283();
        C21230.forEach(c5777.f14181, new C23521(1, this));
        C2417 c2419 = this.f68011;
        c2419.f3705 = c2419.f3705.m10294();
        C2417 c24110 = this.f68011;
        c24110.f3697 = c24110.f3697.m10294();
        C2417 c24111 = this.f68011;
        c24111.f3695 = c24111.f3695.m10294();
        AbstractC12224 abstractC12224 = this.f68011.f20408;
        C5473 c5473 = this.f68010;
        if (abstractC12224 == c5473.f13065.f21668) {
            return;
        }
        Iterator it = this.f68011.f3705.iterator();
        while (it.hasNext()) {
            if (((C11648) it.next()).f32494.f20408 == c5473.f13065.f21668) {
                return;
            }
        }
        C11648 c11648 = new C11648(c5473.f13069.m49585(c5473.f13065.f21668), EnumSet.of(EnumC10977.MANDATED));
        C2417 c24112 = this.f68011;
        c24112.f3705 = c24112.f3705.m10290(c11648);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3811(C13824 c13824) {
        AbstractC14355 abstractC14355 = c13824.f39063;
        AbstractC12224 abstractC12224M21418 = C9268.m21418(abstractC14355);
        C5473 c5473 = this.f68010;
        C2417 c2417M19107 = c5473.f13089.m19107(abstractC12224M21418);
        C9268.m21425(c2417M19107, abstractC14355);
        if (c2417M19107.f20405 != EnumC3600.f7340) {
            C23623 c23623 = c5473.f13091;
            abstractC14355.getClass();
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "module.not.found", c2417M19107));
            ((HashSet) c5473.f13071).add(c2417M19107);
            return;
        }
        HashSet hashSet = this.f68009;
        if (hashSet.contains(c2417M19107)) {
            C23623 c23624 = c5473.f13091;
            abstractC14355.getClass();
            C14040 c14041 = C8300.f21997;
            c23624.m9352(abstractC14355, new C14040("compiler", "duplicate.requires", c2417M19107));
            return;
        }
        hashSet.add(c2417M19107);
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC10977.class);
        if (c13824.f39064) {
            if (c2417M19107 == c5473.f13069.f69191 && c5473.f13075.compareTo(EnumC17840.JDK10) >= 0) {
                C23623 c23625 = c5473.f13091;
                AbstractC12224 abstractC12224 = c5473.f13065.f21669;
                C14040 c14042 = C8300.f21997;
                c23625.m9352(c13824, new C14040("compiler", "modifier.not.allowed.here", abstractC12224));
            } else {
                enumSetNoneOf.add(EnumC10977.TRANSITIVE);
            }
        }
        if (c13824.f39065) {
            if (c2417M19107 == c5473.f13069.f69191 && c5473.f13075.compareTo(EnumC17840.JDK10) >= 0) {
                C23623 c23626 = c5473.f13091;
                EnumSet enumSetOf = EnumSet.of(EnumC20365.f62910);
                C14040 c14043 = C8300.f21997;
                c23626.m9352(c13824, new C14040("compiler", "mod.not.allowed.here", enumSetOf));
            } else {
                enumSetNoneOf.add(EnumC10977.STATIC_PHASE);
            }
        }
        C11648 c11648 = new C11648(c2417M19107, enumSetNoneOf);
        c13824.f39062 = c11648;
        C2417 c2417 = this.f68011;
        c2417.f3705 = c2417.f3705.m10290(c11648);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3813(C15025 c15025) {
        C4848 c4848M10279;
        AbstractC14355 abstractC14355 = c15025.f42932;
        C4848 c4848 = c15025.f42933;
        AbstractC12224 abstractC12224M21418 = C9268.m21418(abstractC14355);
        C5473 c5473 = this.f68010;
        C9794 c9794M49593 = c5473.f13069.m49593(this.f68011, abstractC12224M21418);
        c5473.f13090.getClass();
        new C7231(c9794M49593).mo12739(abstractC14355);
        C23578 c23578 = new C23578();
        HashMap map = this.f68007;
        C4848<C19023> c4849 = (C4848) C15525.computeIfAbsent(map, c9794M49593, c23578);
        for (C19023 c19023 : c4849) {
            C23623 c23623 = c5473.f13091;
            abstractC14355.getClass();
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "conflicting.exports", c9794M49593));
        }
        if (c4848 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c4848.iterator();
            while (it.hasNext()) {
                AbstractC14355 abstractC14356 = (AbstractC14355) it.next();
                C2417 c2417M19107 = c5473.f13089.m19107(C9268.m21418(abstractC14356));
                C9268.m21425(c2417M19107, abstractC14356);
                C16852 c16852 = c5473.f13074;
                abstractC14356.getClass();
                c16852.m38314(abstractC14356, c2417M19107);
                Iterator it2 = c4849.iterator();
                while (it2.hasNext()) {
                    C4848 c48410 = ((C19023) it2.next()).f56713;
                    if (c48410 != null) {
                        Iterator it3 = c48410.iterator();
                        while (it3.hasNext()) {
                            if (c2417M19107 == ((C2417) it3.next())) {
                                C23623 c23624 = c5473.f13091;
                                C14040 c14041 = C8300.f21997;
                                c23624.m9352(abstractC14356, new C14040("compiler", "conflicting.exports.to.module", c2417M19107));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c2417M19107)) {
                    C23623 c23625 = c5473.f13091;
                    C14040 c14042 = C8300.f21997;
                    c23625.m9352(abstractC14356, new C14040("compiler", "conflicting.exports.to.module", c2417M19107));
                }
                it = it4;
            }
            c4848M10279 = C4848.m10279((Iterable) linkedHashSet);
        } else {
            c4848M10279 = null;
        }
        if (c4848M10279 == null || !c4848M10279.isEmpty()) {
            C19023 c19024 = new C19023(c9794M49593, c4848M10279, EnumSet.noneOf(EnumC16340.class));
            C2417 c2417 = this.f68011;
            c2417.f3697 = c2417.f3697.m10290(c19024);
            c15025.f42931 = c19024;
            map.put(c9794M49593, c4849.m10290(c19024));
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3778(C2423 c2423) {
        C4848 c4848M10279;
        AbstractC14355 abstractC14355 = c2423.f3722;
        C4848 c4848 = c2423.f3723;
        AbstractC12224 abstractC12224M21418 = C9268.m21418(abstractC14355);
        C5473 c5473 = this.f68010;
        C9794 c9794M49593 = c5473.f13069.m49593(this.f68011, abstractC12224M21418);
        c5473.f13090.getClass();
        new C7231(c9794M49593).mo12739(abstractC14355);
        if (this.f68011.f3692.contains(EnumC19853.OPEN)) {
            c5473.f13091.m9352(c2423, C8300.f22054);
        }
        C20002 c20002 = new C20002(8);
        HashMap map = this.f68008;
        C4848<C25058> c4849 = (C4848) C15525.computeIfAbsent(map, c9794M49593, c20002);
        for (C25058 c25058 : c4849) {
            C23623 c23623 = c5473.f13091;
            abstractC14355.getClass();
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "conflicting.opens", c9794M49593));
        }
        if (c4848 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c4848.iterator();
            while (it.hasNext()) {
                AbstractC14355 abstractC14356 = (AbstractC14355) it.next();
                C2417 c2417M19107 = c5473.f13089.m19107(C9268.m21418(abstractC14356));
                C9268.m21425(c2417M19107, abstractC14356);
                C16852 c16852 = c5473.f13074;
                abstractC14356.getClass();
                c16852.m38314(abstractC14356, c2417M19107);
                Iterator it2 = c4849.iterator();
                while (it2.hasNext()) {
                    C4848 c48410 = ((C25058) it2.next()).f79950;
                    if (c48410 != null) {
                        Iterator it3 = c48410.iterator();
                        while (it3.hasNext()) {
                            if (c2417M19107 == ((C2417) it3.next())) {
                                C23623 c23624 = c5473.f13091;
                                C14040 c14041 = C8300.f21997;
                                c23624.m9352(abstractC14356, new C14040("compiler", "conflicting.opens.to.module", c2417M19107));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c2417M19107)) {
                    C23623 c23625 = c5473.f13091;
                    C14040 c14042 = C8300.f21997;
                    c23625.m9352(abstractC14356, new C14040("compiler", "conflicting.opens.to.module", c2417M19107));
                }
                it = it4;
            }
            c4848M10279 = C4848.m10279((Iterable) linkedHashSet);
        } else {
            c4848M10279 = null;
        }
        if (c4848M10279 == null || !c4848M10279.isEmpty()) {
            C25058 c25059 = new C25058(c9794M49593, c4848M10279, EnumSet.noneOf(EnumC8965.class));
            C2417 c2417 = this.f68011;
            c2417.f3695 = c2417.f3695.m10290(c25059);
            c2423.f3721 = c25059;
            map.put(c9794M49593, c4849.m10290(c25059));
        }
    }

    public C21567(C5473 c5473) {
        this.f68010 = c5473;
    }
}
