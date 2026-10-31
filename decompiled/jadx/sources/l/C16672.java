package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܽܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W447 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16672 extends AbstractC0204 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C4314 f51176 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13395 f51177;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20661 f51178;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9310 f51179;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1755 f51180;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15240 f51181;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13809 f51182;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18230 f51183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6319 f51184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C22364 f51185;

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16672 m39193(C2903 c2903) {
        C16672 c16672 = (C16672) c2903.m8838(f51176);
        return c16672 == null ? new C16672(c2903) : c16672;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m39196(C3581 c3581, C2609 c2609, C2609 c26010, AbstractC5144 abstractC5144, C9378 c9378, C2609 c26011, C1755 c1755) {
        AbstractC4308 abstractC4308;
        C2609 c2609M33124 = this.f51182.m33124(c2609, c1755);
        C9310 c9310 = this.f51179;
        c9310.m23943(c2609, c1755, true);
        C18837 c18837 = new C18837();
        for (C2609 c26012 = c26010; c26012.m8249(); c26012 = c26012.f8241) {
            m39197((AbstractC5144) c26012.f8240, c1755);
            c18837.m43511(((C9378) c26012.f8240).f28488.f16086);
        }
        C20661 c20661 = this.f51178;
        AbstractC4308 abstractC4308M23954 = abstractC5144 == null ? c20661.f66501 : c9310.m23954(abstractC5144, c1755, AbstractC4308.f13885);
        if (c9378 != null) {
            m39197((AbstractC5144) c9378, c1755);
            abstractC4308 = c9378.f28488.f16086;
        } else {
            abstractC4308 = null;
        }
        C18837 c18838 = new C18837();
        for (C2609 c26013 = c26011; c26013.m8249(); c26013 = c26013.f8241) {
            AbstractC4308 abstractC4308M23955 = c9310.m23954((AbstractC5144) c26013.f8240, c1755, AbstractC4308.f13885);
            if (!abstractC4308M23955.m12913(EnumC9454.TYPEVAR)) {
                AbstractC12612 abstractC12612 = (AbstractC12612) c26013.f8240;
                abstractC12612.getClass();
                abstractC4308M23955 = this.f51181.m36173(abstractC12612, abstractC4308M23955);
            } else {
                AbstractC19810 abstractC19810 = abstractC4308M23955.f13890;
                if (abstractC19810.f17561 == c3581) {
                    abstractC19810.f17563 |= 140737488355328L;
                }
            }
            c18838.m43511(abstractC4308M23955);
        }
        C10658 c10658 = new C10658(c18837.m43517(), abstractC4308M23954, c18838.m43517(), c20661.f66481);
        c10658.f32058 = abstractC4308;
        return c2609M33124.isEmpty() ? c10658 : new C10077(c10658, c2609M33124);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39197(AbstractC5144 abstractC5144, C1755 c1755) {
        C1755 c1756 = this.f51180;
        try {
            this.f51180 = c1755;
            abstractC5144.mo988(this);
        } catch (C20515 e) {
            C15240 c15240 = this.f51181;
            abstractC5144.getClass();
            c15240.m36110(abstractC5144, e);
        } finally {
            this.f51180 = c1756;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) throws Throwable {
        InterfaceC3109 interfaceC3109;
        C1755 c1755 = this.f51180;
        this.f51182.getClass();
        AbstractC14016 abstractC14016M33122 = C13809.m33122(c1755);
        C3581 c3581 = new C3581(0L, c8526.f26044, null, abstractC14016M33122.f23673);
        c3581.f17563 = this.f51181.m36100(c8526, c8526.f26046.f7169, c3581, c8526);
        c8526.f26045 = c3581;
        if ((c8526.f26046.f7169 & 8796093022208L) != 0) {
            c3581.f17561.f17563 |= 8796093022208L;
        }
        C1755 c1755M39195 = m39195(c8526, this.f51180);
        C18230 c18230 = this.f51183;
        InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) c8526);
        try {
            interfaceC3109 = interfaceC3109M42471;
            try {
                c3581.f17560 = m39196(c3581, c8526.f26047, c8526.f26048, c8526.f26051, c8526.f26052, c8526.f26042, c1755M39195);
                c18230.m42471(interfaceC3109);
                if (this.f51184.m17503(c3581)) {
                    c3581.f17563 |= 70368744177664L;
                }
                C18837 c18837 = new C18837();
                C9378 c9378 = null;
                for (C2609 c2609 = c8526.f26048; c2609.m8249(); c2609 = c2609.f8241) {
                    c9378 = (C9378) c2609.f8240;
                    C12048 c12048 = c9378.f28489;
                    C12171.m29637(c12048);
                    c18837.m43511(c12048);
                }
                c3581.f11367 = c18837.m43517();
                if (c9378 != null && (c9378.f28486.f7169 & 17179869184L) != 0) {
                    c3581.f17563 |= 17179869184L;
                }
                ((C8604) c1755M39195.f6073).f26285.mo26377();
                if (this.f51181.m36162(c8526, c3581, abstractC14016M33122)) {
                    abstractC14016M33122.mo26382(c3581);
                }
                C2609 c26010 = c8526.f26046.f7168;
                C13395 c13395 = this.f51177;
                c13395.m32406(c26010, c1755M39195, c3581, c8526);
                c13395.m32408(c8526, c1755M39195, c3581, c8526);
                if (c8526.f26049 != null) {
                    c3581.f11370 = c13395.m32416();
                    AbstractC12612 abstractC12612 = c8526.f26049;
                    c13395.m32405(new RunnableC0789(c13395, c1755M39195, c8526, abstractC12612, c3581, 1));
                    c13395.m32411(new RunnableC22003(c13395, c1755M39195, abstractC12612, 2));
                }
            } catch (Throwable th) {
                th = th;
                c18230.m42471(interfaceC3109);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC3109 = interfaceC3109M42471;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m39195(C8526 c8526, C1755 c1755) {
        C8604 c8604 = (C8604) c1755.f6073;
        C1755 c1755M5877 = c1755.m5877(c8526, c8604.m22358(c8604.f26285.mo26383(c8526.f26045)));
        Object obj = c1755M5877.f6073;
        c1755M5877.f6077 = c8526;
        if (c8526.f26045.f17560 != null) {
            C9310 c9310 = this.f51179;
            C11003.requireNonNull(c9310);
            ((C8604) obj).f26284 = new C23420(c9310, C15406.f47181, c8526.f26045.f17560.mo12923());
        }
        if ((c8526.f26046.f7169 & 8) != 0) {
            ((C8604) obj).f26297++;
        }
        ((C8604) obj).f26286 = null;
        return c1755M5877;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(final C9378 c9378) {
        AbstractC4308 abstractC4308;
        C1755 c1755M5877 = this.f51180;
        boolean z = true;
        if ((c9378.f28486.f7169 & 8) != 0 || (((C8604) c1755M5877.f6073).f26285.f23673.mo16084() & 512) != 0) {
            C1755 c1755 = this.f51180;
            C8604 c8604 = (C8604) c1755.f6073;
            c1755M5877 = c1755.m5877(c9378, c8604.m22358(c8604.f26285));
            ((C8604) c1755M5877.f6073).f26297++;
        }
        C1755 c1756 = c1755M5877;
        C18230 c18230 = this.f51183;
        InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) c9378);
        try {
            boolean zM19450 = C7260.m19450(c9378);
            C9310 c9310 = this.f51179;
            if (zM19450) {
                C7673 c7673 = (C7673) c9378.f28488;
                c9310.getClass();
                C9310.m23897(c1756, c7673);
            } else if (!c9378.m24209()) {
                AbstractC12612 abstractC12612 = c9378.f28488;
                c9310.getClass();
                c9310.m23954(abstractC12612, c1756, AbstractC4308.f13885);
                if (!c9378.m14709(EnumC18550.f57578) || c9378.f28483 == null) {
                    z = false;
                }
                if (z) {
                    m39199(c9378, c1756);
                }
            }
            c18230.m42471(interfaceC3109M42471);
            if ((c9378.f28486.f7169 & 17179869184L) != 0) {
                AbstractC12612 abstractC12613 = c9378.f28488;
                abstractC12613.f16086 = ((C5138) abstractC12613.f16086).m14698();
            }
            C1755 c1757 = this.f51180;
            this.f51182.getClass();
            AbstractC14016 abstractC14016M33122 = C13809.m33122(c1757);
            if (c9378.m24209()) {
                abstractC4308 = ((C8604) this.f51180.f6073).f26285.f23673.f17559 == EnumC1296.f4571 ? AbstractC4308.f13885 : this.f51178.f66457;
            } else {
                abstractC4308 = c9378.f28488.f16086;
            }
            final C12048 c12048 = new C12048(0L, c9378.f28484, abstractC4308, abstractC14016M33122.f23673);
            long jM36100 = this.f51181.m36100(c9378, c9378.f28486.f7169, c12048, c9378);
            c12048.f17563 = jM36100;
            c9378.f28489 = c12048;
            AbstractC12612 abstractC12614 = c9378.f28487;
            if (abstractC12614 != null) {
                long j = jM36100 | 262144;
                c12048.f17563 = j;
                if ((j & 16) != 0) {
                    C11029 c11029 = new C11029();
                    abstractC12614.mo988(c11029);
                    if (c11029.f33159) {
                        C15658 c15658M39194 = m39194(c9378, this.f51180);
                        ((C8604) c15658M39194.f6073).f26293 = c12048;
                        final C15658 c15658M39195 = m39194(c9378, c15658M39194);
                        final C1755 c1758 = this.f51180;
                        final C9310 c9311 = this.f51179;
                        c12048.m29421(new Callable() { // from class: l.ۗ֡֨
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return c9311.m23921(c15658M39195, c1758, c9378, c12048.f17560);
                            }
                        });
                    }
                }
            }
            C15240 c15240 = this.f51181;
            if (c15240.m36162((InterfaceC3109) c9378, (AbstractC5698) c12048, abstractC14016M33122)) {
                c15240.m36131((InterfaceC3109) c9378, c12048, abstractC14016M33122);
                abstractC14016M33122.mo26382(c12048);
            } else if (c12048.f17561.f17559 == EnumC1296.f4571 || (c12048.f17563 & 2305843009230471186L) != 0) {
                abstractC14016M33122.mo26382(c12048);
            }
            C2609 c2609 = c9378.f28486.f7168;
            C13395 c13395 = this.f51177;
            c13395.m32406(c2609, c1756, c12048, c9378);
            if (!c9378.m24209()) {
                c13395.m32408(c9378.f28488, c1756, c12048, c9378);
            }
            c12048.f36040 = c9378.f16085;
        } catch (Throwable th) {
            c18230.m42471(interfaceC3109M42471);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39198(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, C12281 c12281) {
        if (abstractC5144.f16086.mo12948() || this.f51184.m17550(abstractC5144.f16086, abstractC4308)) {
            return;
        }
        this.f51185.m7273(abstractC5144, c12281);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39199(C9378 c9378, C1755 c1755) {
        AbstractC12612 abstractC12612 = c9378.f28483;
        C9310 c9310 = this.f51179;
        c9310.m23930(abstractC12612, c1755, c9310.f28228);
        C3581 c3581 = c1755.f6077.f26045;
        if (c3581.m16075()) {
            AbstractC4308 abstractC4308 = c3581.f17561.f17561.f17560;
            if (abstractC4308.m12913(EnumC9454.METHOD)) {
                abstractC4308 = c3581.f17561.f17561.f17561.f17560;
            }
            if (abstractC4308.m12913(EnumC9454.CLASS)) {
                AbstractC12612 abstractC12613 = c9378.f28488;
                AbstractC4308 abstractC4309 = abstractC12613.f16086;
                C12281 c12281 = C6241.f19132;
                m39198(abstractC12613, abstractC4308, new C12281("compiler", "incorrect.constructor.receiver.type", abstractC4308, abstractC4309));
                AbstractC12612 abstractC12614 = c9378.f28483;
                m39198(abstractC12614, abstractC4308, new C12281("compiler", "incorrect.constructor.receiver.name", abstractC4308, abstractC12614.f16086));
                return;
            }
            this.f51185.m7273(c9378, C6241.f19227);
            return;
        }
        AbstractC12612 abstractC12615 = c9378.f28488;
        AbstractC4308 abstractC43010 = c3581.f17561.f17560;
        AbstractC4308 abstractC43011 = abstractC12615.f16086;
        C12281 c12282 = C6241.f19132;
        m39198(abstractC12615, abstractC43010, new C12281("compiler", "incorrect.receiver.type", abstractC43010, abstractC43011));
        AbstractC12612 abstractC12616 = c9378.f28483;
        AbstractC4308 abstractC43012 = c3581.f17561.f17560;
        m39198(abstractC12616, abstractC43012, new C12281("compiler", "incorrect.receiver.name", abstractC43012, abstractC12616.f16086));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15658 m39194(C9378 c9378, C1755 c1755) {
        C8604 c8604 = (C8604) c1755.f6073;
        C8604 c8604M22358 = c8604.m22358(c8604.f26285);
        C15658 c15658 = new C15658(c9378, c8604M22358);
        c15658.f6072 = c1755;
        c15658.f6076 = c1755.f6076;
        c15658.f6075 = c1755.f6075;
        c15658.f6079 = c1755.f6079;
        c15658.f6077 = c1755.f6077;
        C12048 c12048 = c9378.f28489;
        if (c12048.f17561.f17559 == EnumC1296.f4582) {
            c8604M22358.f26285 = ((C8604) c1755.f6073).f26285.mo26383(c12048);
        }
        if ((c9378.f28486.f7169 & 8) == 0) {
            C14163 c14163 = c1755.f6079.f17186;
            c14163.mo16101();
            if ((c14163.f17563 & 512) == 0 || c1755.f6077 != null) {
                return c15658;
            }
        }
        c8604M22358.f26297++;
        return c15658;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1374(C3440 c3440) {
        C2609 c2609 = c3440.f10874;
        if (c2609 != null) {
            C1755 c1755 = this.f51180;
            while (c2609.m8249()) {
                m39197((AbstractC5144) c2609.f8240, c1755);
                c2609 = c2609.f8241;
            }
        }
    }

    public C16672(C2903 c2903) {
        c2903.m8841(f51176, this);
        this.f51182 = C13809.m33121(c2903);
        this.f51185 = C22364.m50099(c2903);
        this.f51181 = C15240.m36054(c2903);
        this.f51179 = C9310.m23901(c2903);
        this.f51178 = C20661.m47250(c2903);
        this.f51177 = C13395.m32391(c2903);
        this.f51184 = C6319.m17456(c2903);
        this.f51183 = C18230.m42469(c2903);
    }
}
