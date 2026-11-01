package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܽܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W447 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18213 extends AbstractC2562 {

    /* JADX INFO: renamed from: ۢ */
    public static final C6468 f54361 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C15099 f54362;

    /* JADX INFO: renamed from: ۜ */
    public final C22004 f54363;

    /* JADX INFO: renamed from: ۧ */
    public final C11216 f54364;

    /* JADX INFO: renamed from: ܳ */
    public C4036 f54365;

    /* JADX INFO: renamed from: ܽ */
    public final C16852 f54366;

    /* JADX INFO: renamed from: ܿ */
    public final C15492 f54367;

    /* JADX INFO: renamed from: ᩳ */
    public final C19694 f54368;

    /* JADX INFO: renamed from: ᩷ */
    public final C8374 f54369;

    /* JADX INFO: renamed from: ᩻ */
    public final C23623 f54370;

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18213 m41428(C5127 c5127) {
        C18213 c18213 = (C18213) c5127.m10905(f54361);
        return c18213 == null ? new C18213(c5127) : c18213;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m41431(C5771 c5771, C4848 c4848, C4848 c4849, AbstractC7257 abstractC7257, C11281 c11281, C4848 c48410, C4036 c4036) {
        AbstractC6462 abstractC6462;
        C4848 c4848M35241 = this.f54367.m35241(c4848, c4036);
        C11216 c11216 = this.f54364;
        c11216.m25952(c4848, c4036, true);
        C20271 c20271 = new C20271();
        for (C4848 c48411 = c4849; c48411.m10293(); c48411 = c48411.f11035) {
            m41432((AbstractC7257) c48411.f11034, c4036);
            c20271.m45777(((C11281) c48411.f11034).f31437.f18925);
        }
        C22004 c22004 = this.f54363;
        AbstractC6462 abstractC6462M25963 = abstractC7257 == null ? c22004.f69183 : c11216.m25963(abstractC7257, c4036, AbstractC6462.f16700);
        if (c11281 != null) {
            m41432((AbstractC7257) c11281, c4036);
            abstractC6462 = c11281.f31437.f18925;
        } else {
            abstractC6462 = null;
        }
        C20271 c20272 = new C20271();
        for (C4848 c48412 = c48410; c48412.m10293(); c48412 = c48412.f11035) {
            AbstractC6462 abstractC6462M25964 = c11216.m25963((AbstractC7257) c48412.f11034, c4036, AbstractC6462.f16700);
            if (!abstractC6462M25964.m14777(EnumC11353.TYPEVAR)) {
                AbstractC14355 abstractC14355 = (AbstractC14355) c48412.f11034;
                abstractC14355.getClass();
                abstractC6462M25964 = this.f54366.m38334(abstractC14355, abstractC6462M25964);
            } else {
                AbstractC21195 abstractC21195 = abstractC6462M25964.f16705;
                if (abstractC21195.f20407 == c5771) {
                    abstractC21195.f20409 |= 140737488355328L;
                }
            }
            c20272.m45777(abstractC6462M25964);
        }
        C12497 c12497 = new C12497(c20271.m45783(), abstractC6462M25963, c20272.m45783(), c22004.f69163);
        c12497.f35029 = abstractC6462;
        return c4848M35241.isEmpty() ? c12497 : new C11945(c12497, c4848M35241);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41432(AbstractC7257 abstractC7257, C4036 c4036) {
        C4036 c4037 = this.f54365;
        try {
            this.f54365 = c4036;
            abstractC7257.mo3382(this);
        } catch (C21865 e) {
            C16852 c16852 = this.f54366;
            abstractC7257.getClass();
            c16852.m38271(abstractC7257, e);
        } finally {
            this.f54365 = c4037;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) throws Throwable {
        InterfaceC5323 interfaceC5323;
        C4036 c4036 = this.f54365;
        this.f54367.getClass();
        AbstractC15689 abstractC15689M35239 = C15492.m35239(c4036);
        C5771 c5771 = new C5771(0L, c10471.f28959, null, abstractC15689M35239.f26587);
        c5771.f20409 = this.f54366.m38261(c10471, c10471.f28961.f9954, c5771, c10471);
        c10471.f28960 = c5771;
        if ((c10471.f28961.f9954 & 8796093022208L) != 0) {
            c5771.f20407.f20409 |= 8796093022208L;
        }
        C4036 c4036M41430 = m41430(c10471, this.f54365);
        C19694 c19694 = this.f54368;
        InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c10471);
        try {
            interfaceC5323 = interfaceC5323M44730;
            try {
                c5771.f20406 = m41431(c5771, c10471.f28962, c10471.f28963, c10471.f28966, c10471.f28967, c10471.f28957, c4036M41430);
                c19694.m44730(interfaceC5323);
                if (this.f54369.m19443(c5771)) {
                    c5771.f20409 |= 70368744177664L;
                }
                C20271 c20271 = new C20271();
                C11281 c11281 = null;
                for (C4848 c4848 = c10471.f28963; c4848.m10293(); c4848 = c4848.f11035) {
                    c11281 = (C11281) c4848.f11034;
                    C13818 c13818 = c11281.f31438;
                    C1446.m31699(c13818);
                    c20271.m45777(c13818);
                }
                c5771.f14172 = c20271.m45783();
                if (c11281 != null && (c11281.f31435.f9954 & 17179869184L) != 0) {
                    c5771.f20409 |= 17179869184L;
                }
                ((C10545) c4036M41430.f8849).f29201.mo28410();
                if (this.f54366.m38323(c10471, c5771, abstractC15689M35239)) {
                    abstractC15689M35239.mo28415(c5771);
                }
                C4848 c4849 = c10471.f28961.f9953;
                C15099 c15099 = this.f54362;
                c15099.m34508(c4849, c4036M41430, c5771, c10471);
                c15099.m34510(c10471, c4036M41430, c5771, c10471);
                if (c10471.f28964 != null) {
                    c5771.f14175 = c15099.m34518();
                    AbstractC14355 abstractC14355 = c10471.f28964;
                    c15099.m34507(new RunnableC3118(c15099, c4036M41430, c10471, abstractC14355, c5771, 1));
                    c15099.m34513(new RunnableC23280(c15099, c4036M41430, abstractC14355, 2));
                }
            } catch (Throwable th) {
                th = th;
                c19694.m44730(interfaceC5323);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC5323 = interfaceC5323M44730;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4036 m41430(C10471 c10471, C4036 c4036) {
        C10545 c10545 = (C10545) c4036.f8849;
        C4036 c4036M8087 = c4036.m8087(c10471, c10545.m24327(c10545.f29201.mo28416(c10471.f28960)));
        Object obj = c4036M8087.f8849;
        c4036M8087.f8853 = c10471;
        if (c10471.f28960.f20406 != null) {
            C11216 c11216 = this.f54364;
            C12826.requireNonNull(c11216);
            ((C10545) obj).f29200 = new C24626(c11216, C17010.f50311, c10471.f28960.f20406.mo14787());
        }
        if ((c10471.f28961.f9954 & 8) != 0) {
            ((C10545) obj).f29213++;
        }
        ((C10545) obj).f29202 = null;
        return c4036M8087;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(final C11281 c11281) {
        AbstractC6462 abstractC6462;
        C4036 c4036M8087 = this.f54365;
        boolean z = true;
        if ((c11281.f31435.f9954 & 8) != 0 || (((C10545) c4036M8087.f8849).f29201.f26587.mo18003() & 512) != 0) {
            C4036 c4036 = this.f54365;
            C10545 c10545 = (C10545) c4036.f8849;
            c4036M8087 = c4036.m8087(c11281, c10545.m24327(c10545.f29201));
            ((C10545) c4036M8087.f8849).f29213++;
        }
        C4036 c4037 = c4036M8087;
        C19694 c19694 = this.f54368;
        InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c11281);
        try {
            boolean zM21416 = C9268.m21416(c11281);
            C11216 c11216 = this.f54364;
            if (zM21416) {
                C9661 c9661 = (C9661) c11281.f31437;
                c11216.getClass();
                C11216.m25906(c4037, c9661);
            } else if (!c11281.m26219()) {
                AbstractC14355 abstractC14355 = c11281.f31437;
                c11216.getClass();
                c11216.m25963(abstractC14355, c4037, AbstractC6462.f16700);
                if (!c11281.m16617(EnumC19998.f60802) || c11281.f31432 == null) {
                    z = false;
                }
                if (z) {
                    m41434(c11281, c4037);
                }
            }
            c19694.m44730(interfaceC5323M44730);
            if ((c11281.f31435.f9954 & 17179869184L) != 0) {
                AbstractC14355 abstractC14356 = c11281.f31437;
                abstractC14356.f18925 = ((C7251) abstractC14356.f18925).m16606();
            }
            C4036 c4038 = this.f54365;
            this.f54367.getClass();
            AbstractC15689 abstractC15689M35239 = C15492.m35239(c4038);
            if (c11281.m26219()) {
                abstractC6462 = ((C10545) this.f54365.f8849).f29201.f26587.f20405 == EnumC3600.f7343 ? AbstractC6462.f16700 : this.f54363.f69139;
            } else {
                abstractC6462 = c11281.f31437.f18925;
            }
            final C13818 c13818 = new C13818(0L, c11281.f31433, abstractC6462, abstractC15689M35239.f26587);
            long jM38261 = this.f54366.m38261(c11281, c11281.f31435.f9954, c13818, c11281);
            c13818.f20409 = jM38261;
            c11281.f31438 = c13818;
            AbstractC14355 abstractC14357 = c11281.f31436;
            if (abstractC14357 != null) {
                long j = jM38261 | 262144;
                c13818.f20409 = j;
                if ((j & 16) != 0) {
                    C12850 c12850 = new C12850();
                    abstractC14357.mo3382(c12850);
                    if (c12850.f36154) {
                        C17249 c17249M41429 = m41429(c11281, this.f54365);
                        ((C10545) c17249M41429.f8849).f29209 = c13818;
                        final C17249 c17249M414210 = m41429(c11281, c17249M41429);
                        final C4036 c4039 = this.f54365;
                        final C11216 c11217 = this.f54364;
                        c13818.m31483(new Callable() { // from class: l.ۗ֡֨
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return c11217.m25930(c17249M414210, c4039, c11281, c13818.f20406);
                            }
                        });
                    }
                }
            }
            C16852 c16852 = this.f54366;
            if (c16852.m38323((InterfaceC5323) c11281, (AbstractC7783) c13818, abstractC15689M35239)) {
                c16852.m38292((InterfaceC5323) c11281, c13818, abstractC15689M35239);
                abstractC15689M35239.mo28415(c13818);
            } else if (c13818.f20407.f20405 == EnumC3600.f7343 || (c13818.f20409 & 2305843009230471186L) != 0) {
                abstractC15689M35239.mo28415(c13818);
            }
            C4848 c4848 = c11281.f31435.f9953;
            C15099 c15099 = this.f54362;
            c15099.m34508(c4848, c4037, c13818, c11281);
            if (!c11281.m26219()) {
                c15099.m34510(c11281.f31437, c4037, c13818, c11281);
            }
            c13818.f39051 = c11281.f18924;
        } catch (Throwable th) {
            c19694.m44730(interfaceC5323M44730);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41433(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, C14040 c14040) {
        if (abstractC7257.f18925.mo14812() || this.f54369.m19490(abstractC7257.f18925, abstractC6462)) {
            return;
        }
        this.f54370.m9352(abstractC7257, c14040);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41434(C11281 c11281, C4036 c4036) {
        AbstractC14355 abstractC14355 = c11281.f31432;
        C11216 c11216 = this.f54364;
        c11216.m25939(abstractC14355, c4036, c11216.f31177);
        C5771 c5771 = c4036.f8853.f28960;
        if (c5771.m17994()) {
            AbstractC6462 abstractC6462 = c5771.f20407.f20407.f20406;
            if (abstractC6462.m14777(EnumC11353.METHOD)) {
                abstractC6462 = c5771.f20407.f20407.f20407.f20406;
            }
            if (abstractC6462.m14777(EnumC11353.CLASS)) {
                AbstractC14355 abstractC14356 = c11281.f31437;
                AbstractC6462 abstractC6463 = abstractC14356.f18925;
                C14040 c14040 = C8300.f21997;
                m41433(abstractC14356, abstractC6462, new C14040("compiler", "incorrect.constructor.receiver.type", abstractC6462, abstractC6463));
                AbstractC14355 abstractC14357 = c11281.f31432;
                m41433(abstractC14357, abstractC6462, new C14040("compiler", "incorrect.constructor.receiver.name", abstractC6462, abstractC14357.f18925));
                return;
            }
            this.f54370.m9352(c11281, C8300.f22092);
            return;
        }
        AbstractC14355 abstractC14358 = c11281.f31437;
        AbstractC6462 abstractC6464 = c5771.f20407.f20406;
        AbstractC6462 abstractC6465 = abstractC14358.f18925;
        C14040 c14041 = C8300.f21997;
        m41433(abstractC14358, abstractC6464, new C14040("compiler", "incorrect.receiver.type", abstractC6464, abstractC6465));
        AbstractC14355 abstractC14359 = c11281.f31432;
        AbstractC6462 abstractC6466 = c5771.f20407.f20406;
        m41433(abstractC14359, abstractC6466, new C14040("compiler", "incorrect.receiver.name", abstractC6466, abstractC14359.f18925));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17249 m41429(C11281 c11281, C4036 c4036) {
        C10545 c10545 = (C10545) c4036.f8849;
        C10545 c10545M24327 = c10545.m24327(c10545.f29201);
        C17249 c17249 = new C17249(c11281, c10545M24327);
        c17249.f8848 = c4036;
        c17249.f8852 = c4036.f8852;
        c17249.f8851 = c4036.f8851;
        c17249.f8855 = c4036.f8855;
        c17249.f8853 = c4036.f8853;
        C13818 c13818 = c11281.f31438;
        if (c13818.f20407.f20405 == EnumC3600.f7354) {
            c10545M24327.f29201 = ((C10545) c4036.f8849).f29201.mo28416(c13818);
        }
        if ((c11281.f31435.f9954 & 8) == 0) {
            C15828 c15828 = c4036.f8855.f20027;
            c15828.mo18020();
            if ((c15828.f20409 & 512) == 0 || c4036.f8853 != null) {
                return c17249;
            }
        }
        c10545M24327.f29213++;
        return c17249;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3787(C5638 c5638) {
        C4848 c4848 = c5638.f13677;
        if (c4848 != null) {
            C4036 c4036 = this.f54365;
            while (c4848.m10293()) {
                m41432((AbstractC7257) c4848.f11034, c4036);
                c4848 = c4848.f11035;
            }
        }
    }

    public C18213(C5127 c5127) {
        c5127.m10908(f54361, this);
        this.f54367 = C15492.m35238(c5127);
        this.f54370 = C23623.m52439(c5127);
        this.f54366 = C16852.m38215(c5127);
        this.f54364 = C11216.m25910(c5127);
        this.f54363 = C22004.m49577(c5127);
        this.f54362 = C15099.m34493(c5127);
        this.f54369 = C8374.m19396(c5127);
        this.f54368 = C19694.m44728(c5127);
    }
}
