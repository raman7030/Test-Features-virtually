package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C23663 {

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C6468 f75298 = new C6468();

    /* JADX INFO: renamed from: ֨ */
    public C21294 f75300;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f75303;

    /* JADX INFO: renamed from: ۙ */
    public C8294 f75306;

    /* JADX INFO: renamed from: ۚ */
    public final boolean f75307;

    /* JADX INFO: renamed from: ۜ */
    public C9874 f75309;

    /* JADX INFO: renamed from: ۜ֫ */
    public final EnumSet f75310;

    /* JADX INFO: renamed from: ۠ */
    public C8769 f75312;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f75313;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f75316;

    /* JADX INFO: renamed from: ۬ */
    public C8200 f75320;

    /* JADX INFO: renamed from: ܰ */
    public final C20982 f75321;

    /* JADX INFO: renamed from: ܳ֫ */
    public C8374 f75323;

    /* JADX INFO: renamed from: ܶ */
    public C23623 f75324;

    /* JADX INFO: renamed from: ܺ */
    public C16852 f75325;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f75326;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f75328;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C10252 f75329;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f75330;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C22004 f75331;

    /* JADX INFO: renamed from: ᩴ */
    public C14152 f75332;

    /* JADX INFO: renamed from: ᩵ */
    public C8005 f75333;

    /* JADX INFO: renamed from: ᩹ */
    public final C10252 f75337;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC15689 f75338;

    /* JADX INFO: renamed from: ᩻ */
    public C11216 f75339;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C10252 f75340;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6363 f75301 = new C4476(this);

    /* JADX INFO: renamed from: ۫ */
    public C5817 f75319 = new C5817();

    /* JADX INFO: renamed from: ܳ */
    public C19899 f75322 = new C19899(this);

    /* JADX INFO: renamed from: ۟ */
    public C7158 f75311 = new C7158(this);

    /* JADX INFO: renamed from: ۨ */
    public C3686 f75318 = new C3686();

    /* JADX INFO: renamed from: ۛ */
    public final C7980 f75308 = new C7980();

    /* JADX INFO: renamed from: ֡ */
    public final InterfaceC22323 f75299 = new C21241(this);

    /* JADX INFO: renamed from: ۗ */
    public final C13345 f75304 = new InterfaceC22323() { // from class: l.ۨ۟֨
        @Override // p067l.InterfaceC22323
        /* JADX INFO: renamed from: ֫ */
        public final AbstractC7783 mo18491(C4036 c4036, final AbstractC12224 abstractC12224) {
            AbstractC7783 abstractC7783Mo22458 = c4036.f8851.f7513.mo22458(C14514.m33177(abstractC12224), new Predicate() { // from class: l.ۧ֫۠
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
                public /* synthetic */ Predicate m28852or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                    return abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.mo18002() == abstractC12224;
                }
            });
            if (abstractC7783Mo22458 != null) {
                return new C20826(this.f37474, c4036, true, abstractC7783Mo22458);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: ۧ֫ */
    public final C24073 f75317 = new InterfaceC22323() { // from class: l.᩺۟֨
        @Override // p067l.InterfaceC22323
        /* JADX INFO: renamed from: ֫ */
        public final AbstractC7783 mo18491(C4036 c4036, AbstractC12224 abstractC12224) {
            C23663 c23663 = this.f76454;
            AbstractC7783 abstractC7783Mo22458 = c4036.f8851.f7511.mo22458(C14514.m33177(abstractC12224), new C9298(1, abstractC12224));
            if (abstractC7783Mo22458 == null) {
                return null;
            }
            try {
                return new C20826(c23663, c4036, true, c23663.f75300.m48141(abstractC7783Mo22458.m18008().f27063, abstractC12224));
            } catch (C21865 unused) {
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC2719 f75335 = new C6488();

    /* JADX INFO: renamed from: ֫֫ */
    public C5147 f75302 = new C5147();

    /* JADX INFO: renamed from: ᩸ */
    public C14534 f75336 = new C14534(this);

    /* JADX INFO: renamed from: ۢ */
    public C11182 f75314 = new C11182(this);

    /* JADX INFO: renamed from: ܽ֫ */
    public C10511 f75327 = new C10511(this);

    /* JADX INFO: renamed from: ۤ */
    public final C13878 f75315 = new C13878();

    /* JADX INFO: renamed from: ᩶ */
    public final C4848 f75334 = C4848.m10278of((Object) EnumC18298.f54636, (Object) EnumC18298.f54635, (Object) EnumC18298.f54637);

    /* JADX INFO: renamed from: ۘ */
    public C14119 f75305 = null;

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ۨ۟֨] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.᩺۟֨] */
    public C23663(C5127 c5127) {
        c5127.m10908(f75298, this);
        C22004 c22004M49577 = C22004.m49577(c5127);
        this.f75331 = c22004M49577;
        this.f75340 = new C10252(this, EnumC3600.f7342);
        C10252 c10252 = new C10252(this, EnumC3600.f7346);
        this.f75337 = c10252;
        this.f75329 = new C10252(this, EnumC3600.f7345);
        this.f75321 = C20982.m47316(c10252);
        this.f75320 = C8200.m18988(c5127);
        this.f75324 = C23623.m52439(c5127);
        this.f75339 = C11216.m25910(c5127);
        C9874 c9874 = (C9874) c5127.m10905(C9874.f27384);
        this.f75309 = c9874 == null ? new C9874(c5127) : c9874;
        this.f75332 = C14152.m32631(c5127);
        this.f75325 = C16852.m38215(c5127);
        this.f75312 = C8769.m20284(c5127);
        this.f75300 = C21294.m48132(c5127);
        this.f75306 = C8294.m19100(c5127);
        this.f75323 = C8374.m19396(c5127);
        this.f75333 = C8005.m18541(c5127);
        C24387.m53737(c5127);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        EnumC2483 enumC2483 = EnumC2483.f3927;
        this.f75303 = c13565M30871.m30877(enumC2483, "compact") || (c13565M30871.m30884(enumC2483) && c13565M30871.m30883("rawDiagnostics"));
        this.f75310 = EnumC22993.m51339(c13565M30871);
        EnumC12720.m29246(c5127);
        this.f75316 = EnumC12477.f34948.m28726(enumC17840M40515);
        this.f75326 = EnumC12477.f34971.m28726(enumC17840M40515);
        this.f75328 = EnumC12477.f34979.m28726(enumC17840M40515);
        this.f75313 = EnumC12477.f34949.m28726(enumC17840M40515);
        this.f75338 = AbstractC15689.m35727(c22004M49577.f69157);
        this.f75330 = EnumC12477.f34980.m28726(enumC17840M40515);
        EnumC12477.f34978.m28726(enumC17840M40515);
        this.f75307 = c13565M30871.m30879("debug.dumpMethodReferenceSearchResults");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23663 m52629(C5127 c5127) {
        C23663 c23663 = (C23663) c5127.m10905(f75298);
        return c23663 == null ? new C23663(c5127) : c23663;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC7783 m52633(AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        return abstractC7783.f20405.m6622(abstractC7784.f20405) ? abstractC7783 : abstractC7784;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52631(C4036 c4036) {
        C4036 c4037 = c4036.f8852;
        return c4037 != null && ((C10545) c4036.f8849).f29213 > ((C10545) c4037.f8849).f29213;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m52670(C4036 c4036, AbstractC21195 abstractC21195, boolean z) {
        boolean z2;
        C2417 c2417;
        C9794 c9794;
        C10471 c10471 = c4036.f8853;
        if ((c10471 == null || (c10471.f28961.f9954 & 536870912) == 0) && (!((C10545) c4036.f8849).f29198 || c4036.f8851.f7510 != abstractC21195.m18008().f27063)) {
            short sMo18003 = (short) (abstractC21195.mo18003() & 7);
            if (sMo18003 == 0) {
                C9794 c9795 = c4036.f8851.f7517;
                if (c9795 == abstractC21195.f20407 || c9795 == abstractC21195.m18008()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (sMo18003 == 1) {
                if (this.f75330) {
                    C2417 c2418 = c4036.f8851.f7510;
                    c2418.mo18020();
                    C9794 c9794M18008 = abstractC21195.m18008();
                    if (c2418 != c9794M18008.f27063 && c2418.f3689.get(c9794M18008.f27059) != c9794M18008) {
                        C22004 c22004 = this.f75331;
                        if (c9794M18008 != c22004.f69155 && ((c2417 = c9794M18008.f27063) != c22004.f69129 || !c2418.f3698.contains(c2417))) {
                            z2 = false;
                        }
                    }
                }
                z2 = true;
            } else if (sMo18003 == 2) {
                if (c4036.f8855.f20027.mo3350() == abstractC21195.f20407.mo3350()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                if (sMo18003 == 4 && (c9794 = c4036.f8851.f7517) != abstractC21195.f20407 && c9794 != abstractC21195.m18008()) {
                    C15828 c15828M17990 = c4036.f8855.f20027;
                    AbstractC7783 abstractC7783 = abstractC21195.f20407;
                    while (c15828M17990 != null && !c15828M17990.mo17999(abstractC7783, this.f75323)) {
                        c15828M17990 = c15828M17990.f20407.m17990();
                    }
                    if (c15828M17990 == null) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (!z || abstractC21195.f20406.mo7201() == AbstractC6462.f16700) {
                return z2;
            }
            if (!z2 || !m52669(c4036, abstractC21195.f20406.mo7201(), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52669(final C4036 c4036, AbstractC6462 abstractC6462, final boolean z) {
        if (abstractC6462.m14777(EnumC11353.ARRAY)) {
            return m52669(c4036, C8374.m19413(this.f75323.m19455(abstractC6462)), false);
        }
        return abstractC6462 instanceof C9814 ? C16474.stream(C21230.spliterator(((C9814) abstractC6462).m22895()), false).allMatch(new Predicate() { // from class: l.֫֫۠
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
            public /* synthetic */ Predicate m7424or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f8152.m52670(c4036, ((AbstractC6462) obj).f16705, z);
            }
        }) : m52670(c4036, abstractC6462.f16705, z);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m52668(C4036 c4036, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783) {
        if (abstractC7783.f20408 != this.f75320.f21737 || abstractC7783.f20407 == abstractC6462.f16705) {
            C10471 c10471 = c4036.f8853;
            Object obj = c4036.f8849;
            if (c10471 != null && (c10471.f28961.f9954 & 536870912) != 0) {
                return true;
            }
            C10545 c10545 = (C10545) obj;
            if (c10545.f29198 && c4036.f8851.f7510 == abstractC7783.m18008().f27063) {
                return true;
            }
            short sMo18003 = (short) (abstractC7783.mo18003() & 7);
            C8374 c8374 = this.f75323;
            if (sMo18003 == 0) {
                C9794 c9794 = c4036.f8851.f7517;
                if ((c9794 == abstractC7783.f20407.f20407 || c9794 == abstractC7783.m18008()) && m52669(c4036, abstractC6462, false) && abstractC7783.mo12937((AbstractC7783) abstractC6462.f16705, c8374) && m52635(abstractC7783, abstractC6462)) {
                    return true;
                }
            } else if (sMo18003 == 2) {
                C15828 c15828 = c4036.f8855.f20027;
                if ((c15828 == abstractC7783.f20407 || c15828.mo3350() == abstractC7783.f20407.mo3350()) && abstractC7783.mo12937((AbstractC7783) abstractC6462.f16705, c8374)) {
                    return true;
                }
            } else if (sMo18003 == 4) {
                C9794 c9795 = c4036.f8851.f7517;
                if (c9795 == abstractC7783.f20407.f20407 || c9795 == abstractC7783.m18008()) {
                    if (!m52669(c4036, abstractC6462, false) && m52635(abstractC7783, abstractC6462)) {
                        return true;
                    }
                } else {
                    C15828 c15828M17990 = c4036.f8855.f20027;
                    AbstractC6462 abstractC6462Mo14803 = abstractC6462.m14777(EnumC11353.TYPEVAR) ? abstractC6462.mo14803() : abstractC6462;
                    while (c15828M17990 != null) {
                        if (c15828M17990.mo17999(abstractC7783.f20407, c8374)) {
                            c15828M17990.mo18020();
                            if ((c15828M17990.f20409 & 512) == 0 && ((abstractC7783.mo18003() & 8) != 0 || abstractC7783.f20405 == EnumC3600.f7354 || abstractC6462Mo14803.f16705.mo17999((AbstractC7783) c15828M17990, c8374))) {
                                break;
                            }
                        }
                        c15828M17990 = c15828M17990.f20407.m17990();
                    }
                    if (c15828M17990 != null || (c10545.f29212 && (abstractC7783.mo18003() & 8) == 0 && abstractC7783.f20405 != EnumC3600.f7354)) {
                        if (!m52669(c4036, abstractC6462, false)) {
                        }
                    }
                }
            } else if (m52669(c4036, abstractC6462, false) && m52635(abstractC7783, abstractC6462)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m52635(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        if (abstractC7783.f20405 == EnumC3600.f7343 && !abstractC7783.m17994() && !abstractC7783.mo17483()) {
            AbstractC21195 abstractC21195 = abstractC6462.f16705;
            C8374 c8374 = this.f75323;
            C5771 c5771M12935 = ((C5771) abstractC7783).m12935(abstractC21195, c8374, true);
            if (c5771M12935 != null && c5771M12935 != abstractC7783 && abstractC7783.f20407 != c5771M12935.f20407 && c8374.m19472(c8374.m19483(c5771M12935, abstractC6462), c8374.m19483(abstractC7783, abstractC6462), true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m52671(C4036 c4036, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C24626 c24626, C4848 c4848, C4848 c4849, C3686 c3686) {
        C8374 c8374 = this.f75323;
        AbstractC6462 abstractC6462M19483 = c8374.m19483(abstractC7783, abstractC6462);
        C4848 c4848M10283 = C4848.m10283();
        C4848 c4848M10284 = c4849 == null ? C4848.m10283() : c4849;
        EnumC11353 enumC11353 = EnumC11353.FORALL;
        if (abstractC6462M19483.m14777(enumC11353) || !c4848M10284.m10293()) {
            if (abstractC6462M19483.m14777(enumC11353) && c4848M10284.m10293()) {
                C11945 c11945 = (C11945) abstractC6462M19483;
                C4848 c48410 = c11945.f33323;
                int iM10289 = c4848M10284.m10289();
                int iM102810 = c48410.m10289();
                C8005 c8005 = this.f75333;
                if (iM10289 != iM102810) {
                    String string = Integer.toString(c48410.m10289());
                    C13370 c13370 = C13665.f38450;
                    throw new C24848(c8005.m18543(new C13370("compiler", "wrong.number.type.args", string)));
                }
                C4848 c48411 = c48410;
                for (C4848 c48412 = c4848M10284; c48411.m10293() && c48412.m10293(); c48412 = c48412.f11035) {
                    for (C4848 c4848M19421 = c8374.m19421(c8374.m19424((C10485) c48411.f11034), c48410, c4848M10284); c4848M19421.m10293(); c4848M19421 = c4848M19421.f11035) {
                        if (!c8374.m19491((AbstractC6462) c48412.f11034, (AbstractC6462) c4848M19421.f11034, c3686)) {
                            AbstractC6462 abstractC6463 = (AbstractC6462) c48412.f11034;
                            C13370 c13371 = C13665.f38450;
                            throw new C24848(c8005.m18543(new C13370("compiler", "explicit.param.do.not.conform.to.bounds", abstractC6463, c4848M19421)));
                        }
                    }
                    c48411 = c48411.f11035;
                }
                abstractC6462M19483 = c8374.m19428(c11945.f16992, c48410, c4848M10284);
            } else if (abstractC6462M19483.m14777(enumC11353)) {
                C11945 c11946 = (C11945) abstractC6462M19483;
                C4848 c48413 = c11946.f33323;
                C4848 c4848M19504 = c8374.m19504(c48413);
                c4848M10283.getClass();
                c4848M10283 = c4848M19504.m10292(c4848M10283);
                abstractC6462M19483 = c8374.m19428(c11946.f16992, c48413, c4848M19504);
            }
        }
        AbstractC6462 abstractC6464 = abstractC6462M19483;
        C4848 c48414 = c4848M10283;
        boolean z = c48414.f11035 != null;
        for (C4848 c48415 = c4848; c48415.f11035 != null && !z; c48415 = c48415.f11035) {
            if (((AbstractC6462) c48415.f11034).m14777(EnumC11353.FORALL)) {
                z = true;
            }
        }
        if (z) {
            return this.f75312.m20296(c4036, c48414, (C12497) abstractC6464, c24626, (C5771) abstractC7783, c4848, this.f75305, c3686);
        }
        C8788 c8788M32058 = this.f75305.m32058(abstractC7783, this.f75312.f23805, c24626, c3686);
        this.f75305.f40078.mo13089(c4036, c8788M32058, c4848, abstractC6464.mo14797(), c3686);
        c8788M32058.mo20323();
        return abstractC6464;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m52641(C4036 c4036, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C24626 c24626, C4848 c4848, C4848 c4849, C3686 c3686) {
        C14119 c14119 = this.f75305;
        try {
            C14119 c141110 = new C14119(this);
            this.f75305 = c141110;
            c141110.f40073 = c24626.f77965 == C8769.f23793 ? EnumC15511.SPECULATIVE : EnumC15511.CHECK;
            if (c4036.f8850.m16617(EnumC19998.f60748)) {
                this.f75305.f40078 = new C21496(this, c24626.f77961.mo6098());
            }
            C14119 c141111 = this.f75305;
            EnumC18298 enumC18298 = ((C10545) c4036.f8849).f29204;
            c141111.f40077 = enumC18298;
            enumC18298.m41671();
            enumC18298.m41672();
            return m52671(c4036, abstractC6462, abstractC7783, c24626, c4848, c4849, c3686);
        } finally {
            this.f75305 = c14119;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52647(C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        while (abstractC21195.f20406.m14777(EnumC11353.TYPEVAR)) {
            abstractC21195 = abstractC21195.f20406.mo14803().f16705;
        }
        for (AbstractC7783 abstractC7783 : abstractC21195.mo17983().m22456(abstractC12224)) {
            if (abstractC7783.f20405 == EnumC3600.f7339 && (abstractC7783.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                return m52668(c4036, abstractC6462, abstractC7783) ? abstractC7783 : new C7829(this, c4036, abstractC6462, abstractC7783);
            }
        }
        AbstractC6462 abstractC6463 = abstractC21195.f20406;
        C8374 c8374 = this.f75323;
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6463);
        AbstractC7783 abstractC7783M52633 = this.f75340;
        if (abstractC6462M19502 != null && (abstractC6462M19502.m14777(EnumC11353.CLASS) || abstractC6462M19502.m14777(EnumC11353.TYPEVAR))) {
            abstractC7783M52633 = m52633(abstractC7783M52633, m52647(c4036, abstractC6462, abstractC12224, abstractC6462M19502.f16705));
        }
        for (C4848 c4848M19450 = c8374.m19450(abstractC21195.f20406); abstractC7783M52633.f20405 != EnumC3600.f7338 && c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            AbstractC7783 abstractC7783M52647 = m52647(c4036, abstractC6462, abstractC12224, ((AbstractC6462) c4848M19450.f11034).f16705);
            if (abstractC7783M52633.mo17485() && abstractC7783M52647.mo17485() && abstractC7783M52647.f20407 != abstractC7783M52633.f20407) {
                abstractC7783M52633 = new C13194(this, abstractC7783M52633, abstractC7783M52647);
            } else {
                abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52647);
            }
        }
        return abstractC7783M52633;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52644(C4036 c4036, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784, boolean z) {
        if (abstractC7783.f20405 != EnumC3600.f7353) {
            AbstractC21195 abstractC21195 = abstractC6462.f16705;
            AbstractC7783 abstractC7785 = abstractC7783.f20407;
            C8374 c8374 = this.f75323;
            if ((abstractC21195 == abstractC7785 || abstractC7783.mo12937((AbstractC7783) abstractC21195, c8374)) && m52635(abstractC7783, abstractC6462)) {
                if (z && (abstractC7783.mo18003() & 17179869184L) == 0) {
                    if (!abstractC7784.f20405.m6625()) {
                        return abstractC7784;
                    }
                    AbstractC7570 abstractC7570 = (AbstractC7570) abstractC7784.mo9143();
                    C18142 c18142 = new C18142(this, abstractC7570.f20405, "badVarargs");
                    c18142.f54173 = abstractC7570;
                    return c18142;
                }
                C1446.m31704(!abstractC7783.f20405.m6625());
                try {
                    c8374.f22469.m7107();
                    this.f75305.m32060(abstractC7783, m52671(c4036, abstractC6462, abstractC7783, null, c4848, c4849, c8374.f22469));
                    if (m52668(c4036, abstractC6462, abstractC7783)) {
                        return (!abstractC7784.f20405.m6625() || abstractC7784.f20405 == EnumC3600.f7338) ? m52660(abstractC7783, abstractC7784, abstractC6462, c4036, c4848, z) : abstractC7783;
                    }
                    C7829 c7829 = new C7829(this, c4036, abstractC6462, abstractC7783);
                    EnumC14710 enumC14710 = EnumC14710.FRAGMENT;
                    C18258 c18258Mo6320 = c7829.mo6320(enumC14710, null, null, abstractC6462, null, c4848, c4849);
                    EnumC3600 enumC3600 = abstractC7784.f20405;
                    if (enumC3600 == EnumC3600.f7346) {
                        return c7829;
                    }
                    if (enumC3600 == EnumC3600.f7352) {
                        this.f75305.m32061(abstractC7783, c18258Mo6320);
                        return new C10767(this, this.f75305);
                    }
                    if (enumC3600 == EnumC3600.f7341) {
                        this.f75305.m32061(abstractC7783, c18258Mo6320);
                        return abstractC7784;
                    }
                    if (enumC3600 != EnumC3600.f7347 || !(abstractC7784 instanceof C7829)) {
                        return abstractC7784;
                    }
                    C7829 c78210 = (C7829) abstractC7784;
                    this.f75305.m32061(c78210.f62394, c78210.mo6320(enumC14710, null, null, abstractC6462, null, c4848, c4849));
                    this.f75305.m32061(abstractC7783, c18258Mo6320);
                    return new C10767(this, this.f75305);
                } catch (C24848 e) {
                    this.f75305.m32061(abstractC7783, e.mo33511());
                    int i = C17215.f51239[abstractC7784.f20405.ordinal()];
                    if (i == 1) {
                        return new C8755(this, this.f75305);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            return abstractC7784;
                        }
                    } else {
                        if (!(abstractC7784 instanceof C7829)) {
                            return abstractC7784;
                        }
                        C7829 c78211 = (C7829) abstractC7784;
                        this.f75305.m32061(c78211.f62394, c78211.mo6320(EnumC14710.FRAGMENT, null, null, abstractC6462, null, c4848, c4849));
                    }
                    return new C10767(this, this.f75305);
                }
            }
        }
        return abstractC7784;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52660(AbstractC7783 abstractC7783, AbstractC7783 abstractC7784, AbstractC6462 abstractC6462, C4036 c4036, C4848 c4848, boolean z) {
        int i = C17215.f51239[abstractC7784.f20405.ordinal()];
        if (i != 4) {
            if (i == 5) {
                C13194 c13194 = (C13194) abstractC7784.mo9143();
                boolean z2 = true;
                boolean z3 = true;
                for (AbstractC7783 abstractC7785 : c13194.f37079) {
                    AbstractC7783 abstractC7783M52660 = m52660(abstractC7783, abstractC7785, abstractC6462, c4036, c4848, z);
                    z2 &= abstractC7783M52660 == abstractC7783;
                    z3 &= abstractC7783M52660 == abstractC7785;
                }
                if (!z2) {
                    if (!z3) {
                        c13194.f37079 = c13194.f37079.m10290(abstractC7783);
                    }
                    return c13194;
                }
            } else {
                throw new AssertionError();
            }
        } else if (abstractC7783 != abstractC7784) {
            boolean zM52636 = m52636(abstractC7783, abstractC7784, abstractC6462, c4036, c4848, z);
            boolean zM52637 = m52636(abstractC7784, abstractC7783, abstractC6462, c4036, c4848, z);
            if (!zM52636 || !zM52637) {
                if (!zM52636) {
                    if (!zM52637) {
                        return m52659(abstractC7783, abstractC7784);
                    }
                }
            }
            C8374 c8374 = this.f75323;
            if (!c8374.m19456(c8374.m19483(abstractC7783, abstractC6462), c8374.m19483(abstractC7784, abstractC6462))) {
                return m52659(abstractC7783, abstractC7784);
            }
            if ((abstractC7783.mo18003() & 2147483648L) != (abstractC7784.mo18003() & 2147483648L)) {
                return (abstractC7783.mo18003() & 2147483648L) != 0 ? abstractC7784 : abstractC7783;
            }
            if (abstractC7783.mo9143() != abstractC7784.mo9143()) {
                AbstractC21195 abstractC21195 = (AbstractC21195) abstractC7783.f20407;
                AbstractC21195 abstractC21196 = (AbstractC21195) abstractC7784.f20407;
                if (abstractC21195 != abstractC21196) {
                    if (c8374.m19467(abstractC21196, abstractC21195.f20406) == null || (((abstractC7783.f20407.f20409 & 512) != 0 && (abstractC7784.f20407.f20409 & 512) == 0) || !abstractC7783.mo12938(abstractC7784, abstractC21195, c8374, false))) {
                        if (c8374.m19467(abstractC21195, abstractC21196.f20406) == null || (((abstractC7784.f20407.f20409 & 512) != 0 && (512 & abstractC7783.f20407.f20409) == 0) || !abstractC7784.mo12938(abstractC7783, abstractC21196, c8374, false))) {
                        }
                    }
                }
                boolean z4 = (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0;
                boolean z5 = (abstractC7784.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0;
                if (!z4 || z5) {
                    if (!z5 || z4) {
                        return m52659(abstractC7783, abstractC7784);
                    }
                }
            }
        }
        return abstractC7783;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m52636(AbstractC7783 abstractC7783, AbstractC7783 abstractC7784, AbstractC6462 abstractC6462, C4036 c4036, C4848 c4848, boolean z) {
        AbstractC6462 abstractC6462M52671;
        C3686 c3686 = this.f75318;
        c3686.m7107();
        int iMax = Math.max(Math.max(abstractC7783.f20406.mo14797().m10289(), c4848.m10289()), abstractC7784.f20406.mo14797().m10289());
        C14119 c14119 = this.f75305;
        try {
            C14119 c141110 = new C14119(this);
            this.f75305 = c141110;
            c141110.f40077 = c14119.f40077;
            c141110.f40078 = c14119.f40078.mo13088(c4848);
            C8374 c8374 = this.f75323;
            try {
                abstractC6462M52671 = m52671(c4036, abstractC6462, abstractC7784, null, m52639(c8374.m19419(c8374.m19483(abstractC7783, abstractC6462).mo14797()), abstractC7783, iMax, z), null, c3686);
            } catch (C24848 unused) {
                abstractC6462M52671 = null;
            }
            return (abstractC6462M52671 == null || c3686.m7108(EnumC21706.UNCHECKED)) ? false : true;
        } finally {
            this.f75305 = c14119;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m52639(C4848 c4848, AbstractC7783 abstractC7783, int i, boolean z) {
        if ((abstractC7783.mo18003() & 17179869184L) == 0 || !z) {
            return c4848;
        }
        AbstractC6462 abstractC6462M19455 = this.f75323.m19455((AbstractC6462) c4848.last());
        if (abstractC6462M19455 == null) {
            C1446.m31702("Bad varargs = " + c4848.last() + " " + abstractC7783);
            throw null;
        }
        C4848 c4848M10294 = c4848.m10294().f11035.m10290(abstractC6462M19455).m10294();
        while (c4848M10294.m10289() < i) {
            c4848M10294 = c4848M10294.m10286((AbstractC6462) c4848M10294.last());
        }
        return c4848M10294;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52659(AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        if (((abstractC7783.mo18003() | abstractC7784.mo18003()) & 4398046511104L) != 0) {
            return (abstractC7783.mo18003() & 4398046511104L) == 0 ? abstractC7783 : abstractC7784;
        }
        return new C13194(this, abstractC7783, abstractC7784);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52645(C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849, AbstractC15689 abstractC15689, AbstractC7783 abstractC7783, boolean z, boolean z2) {
        C7414 c7414 = new C7414();
        c7414.f19394 = z2;
        abstractC15689.getClass();
        Iterator it = abstractC15689.mo22457(abstractC12224, c7414, EnumC3620.RECURSIVE).iterator();
        AbstractC7783 abstractC7783M52644 = abstractC7783;
        while (it.hasNext()) {
            abstractC7783M52644 = m52644(c4036, abstractC6462, c4848, c4849, (AbstractC7783) it.next(), abstractC7783M52644, z);
        }
        return abstractC7783M52644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52646(C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849, boolean z) {
        AbstractC6462 abstractC6463 = abstractC6462.f16705.f20406;
        C4848[] c4848Arr = new C4848[2];
        c4848Arr[0] = C4848.m10283();
        c4848Arr[1] = C4848.m10283();
        EnumC6073 enumC6073 = EnumC6073.f15279;
        C3134 c3134 = new C3134(this, abstractC6463);
        AbstractC7783 abstractC7783 = this.f75337;
        EnumC6073 enumC6073Mo10025 = enumC6073;
        AbstractC7783 abstractC7783M52645 = abstractC7783;
        while (true) {
            boolean zHasNext = c3134.hasNext();
            C8374 c8374 = this.f75323;
            if (zHasNext) {
                AbstractC21195 abstractC21195 = (AbstractC21195) c3134.next();
                C3134 c3135 = c3134;
                abstractC7783M52645 = m52645(c4036, abstractC6462, abstractC12224, c4848, c4849, abstractC21195.mo17983(), abstractC7783M52645, z, true);
                if (abstractC12224 == this.f75320.f21737) {
                    return abstractC7783M52645;
                }
                enumC6073Mo10025 = enumC6073Mo10025 == null ? null : enumC6073Mo10025.mo10025(abstractC21195, this);
                if (enumC6073Mo10025 != null) {
                    Iterator it = c8374.m19450(abstractC21195.f20406).iterator();
                    while (it.hasNext()) {
                        c4848Arr[enumC6073Mo10025.ordinal()] = c8374.m19473(c8374.m19487((AbstractC6462) it.next()), c4848Arr[enumC6073Mo10025.ordinal()]);
                    }
                }
                c3134 = c3135;
            } else {
                if (abstractC7783M52645.f20405.m6628() && (abstractC7783M52645.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                    abstractC7783 = abstractC7783M52645;
                }
                EnumC6073[] enumC6073ArrValues = EnumC6073.values();
                int length = enumC6073ArrValues.length;
                AbstractC7783 abstractC7784 = abstractC7783M52645;
                int i = 0;
                while (i < length) {
                    EnumC6073 enumC6074 = enumC6073ArrValues[i];
                    AbstractC7783 abstractC7785 = abstractC7784;
                    for (AbstractC6462 abstractC6464 : c4848Arr[enumC6074.ordinal()]) {
                        if (abstractC6464.mo14789() && (enumC6074 != EnumC6073.f15277 || (abstractC6464.f16705.mo18003() & 8796093022208L) != 0)) {
                            EnumC6073 enumC6075 = enumC6074;
                            int i2 = i;
                            int i3 = length;
                            AbstractC7783 abstractC7783M52646 = m52645(c4036, abstractC6462, abstractC12224, c4848, c4849, abstractC6464.f16705.mo17983(), abstractC7785, z, true);
                            abstractC7785 = (abstractC7783 != abstractC7783M52646 && abstractC7783.f20405.m6628() && abstractC7783M52646.f20405.m6628() && c8374.m19472(abstractC7783.f20406, abstractC7783M52646.f20406, true)) ? abstractC7783 : abstractC7783M52646;
                            i = i2;
                            enumC6074 = enumC6075;
                            length = i3;
                        }
                    }
                    i++;
                    abstractC7784 = abstractC7785;
                }
                return abstractC7784;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52650(C4036 c4036, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849, boolean z) {
        boolean z2 = false;
        C4036 c4037 = c4036;
        AbstractC7783 abstractC7783M52633 = this.f75337;
        while (true) {
            C4036 c4038 = c4037.f8852;
            Object obj = c4037.f8849;
            if (c4038 != null) {
                boolean z3 = m52631(c4037) ? true : z2;
                C10545 c10545 = (C10545) obj;
                C1446.m31704(c10545.f29208 == null);
                c10545.f29208 = c4036.f8850;
                try {
                    AbstractC7783 abstractC7783M52646 = m52646(c4037, c4037.f8855.f20027.f20406, abstractC12224, c4848, c4849, z);
                    if (abstractC7783M52646.mo17485()) {
                        if (!z3 || abstractC7783M52646.f20405 != EnumC3600.f7343 || abstractC7783M52646.f20407.f20405 != EnumC3600.f7354 || (8 & abstractC7783M52646.mo18003()) != 0) {
                            c10545.f29208 = null;
                            return abstractC7783M52646;
                        }
                        C3546 c3546 = new C3546(abstractC7783M52646, this);
                        c10545.f29208 = null;
                        return c3546;
                    }
                    abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52646);
                    c10545.f29208 = null;
                    C15828 c15828 = c4037.f8855.f20027;
                    c15828.mo18020();
                    z2 = (c15828.f20409 & 8) != 0 ? true : z3;
                    c4037 = c4037.f8852;
                } catch (Throwable th) {
                    c10545.f29208 = null;
                    throw th;
                }
            } else {
                AbstractC7783 abstractC7783M52647 = m52646(c4036, this.f75331.f69140.f20406, abstractC12224, c4848, c4849, z);
                if (abstractC7783M52647.mo17485()) {
                    return abstractC7783M52647;
                }
                AbstractC7783 abstractC7783M52644 = abstractC7783M52633;
                for (AbstractC7783 abstractC7783Mo9256 : c4036.f8851.f7513.m22456(abstractC12224)) {
                    AbstractC7783 abstractC7783 = c4036.f8851.f7513.mo22459(abstractC7783Mo9256).f26587;
                    if (abstractC7783Mo9256.f20405 == EnumC3600.f7343) {
                        if (abstractC7783Mo9256.f20407.f20406 != abstractC7783.f20406) {
                            abstractC7783Mo9256 = abstractC7783Mo9256.mo9256(abstractC7783);
                        }
                        abstractC7783M52644 = m52644(c4036, abstractC7783.f20406, c4848, c4849, !m52668(c4036, abstractC7783.f20406, abstractC7783Mo9256) ? new C7829(this, c4036, abstractC7783.f20406, abstractC7783Mo9256) : abstractC7783Mo9256, abstractC7783M52644, z);
                    }
                }
                if (abstractC7783M52644.mo17485()) {
                    return abstractC7783M52644;
                }
                for (AbstractC7783 abstractC7783Mo9257 : c4036.f8851.f7511.m22456(abstractC12224)) {
                    AbstractC7783 abstractC7784 = c4036.f8851.f7511.mo22459(abstractC7783Mo9257).f26587;
                    if (abstractC7783Mo9257.f20405 == EnumC3600.f7343) {
                        if (abstractC7783Mo9257.f20407.f20406 != abstractC7784.f20406) {
                            abstractC7783Mo9257 = abstractC7783Mo9257.mo9256(abstractC7784);
                        }
                        abstractC7783M52644 = m52644(c4036, abstractC7784.f20406, c4848, c4849, !m52668(c4036, abstractC7784.f20406, abstractC7783Mo9257) ? new C7829(this, c4036, abstractC7784.f20406, abstractC7783Mo9257) : abstractC7783Mo9257, abstractC7783M52644, z);
                    }
                }
                return abstractC7783M52644;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52651(C4036 c4036, AbstractC12224 abstractC12224, InterfaceC22323 interfaceC22323) {
        try {
            C15828 c15828M48141 = this.f75300.m48141(c4036.f8851.f7510, abstractC12224);
            return m52670(c4036, (AbstractC21195) c15828M48141, false) ? c15828M48141 : new C7829(this, c4036, null, c15828M48141);
        } catch (C22635 e) {
            return new C15204(this, e);
        } catch (C21865 unused) {
            AbstractC7783 abstractC7783Mo18491 = interfaceC22323.mo18491(c4036, abstractC12224);
            return abstractC7783Mo18491 != null ? abstractC7783Mo18491 : this.f75329;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52649(C4036 c4036, AbstractC12224 abstractC12224) {
        C2417 c2417 = c4036.f8851.f7510;
        final C22004 c22004 = this.f75331;
        C9794 c9794M49599 = c22004.m49599(c2417, abstractC12224);
        if (this.f75330 && c4036.f8850.m16617(EnumC19998.f60715)) {
            AbstractC7257 abstractC7257 = ((C12483) c4036.f8850).f34992;
            if (abstractC7257.m16617(EnumC19998.f60805) && C9268.m21428(abstractC7257) == this.f75320.f21693 && C9268.m21418(((C8320) abstractC7257).f22261) == abstractC12224) {
                c9794M49599.mo18020();
                if (c9794M49599.f27061.m22460()) {
                    return m52624(c4036, abstractC12224, new Function() { // from class: l.ܰ۟֨
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo56417andThen(Function function) {
                            return C22038.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return c22004.m49600((AbstractC12224) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C22038.$default$compose(this, function);
                        }
                    }, new BiFunction() { // from class: l.۟۟֨
                        public /* synthetic */ BiFunction andThen(Function function) {
                            return C18684.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return c22004.m49593((C2417) obj, (AbstractC12224) obj2);
                        }
                    }, new C24355(4), c9794M49599);
                }
            }
        }
        return c9794M49599;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 m52624(C4036 c4036, AbstractC12224 abstractC12224, Function function, BiFunction biFunction, Predicate predicate, AbstractC7783 abstractC7783) {
        AbstractC7783 abstractC7784;
        for (AbstractC7783 abstractC7785 : (Iterable) function.apply(abstractC12224)) {
            if (predicate.test(abstractC7785)) {
                C2417 c2417 = c4036.f8851.f7510;
                C9794 c9794M18008 = abstractC7785.m18008();
                if (c2417 == c9794M18008.f27063 || c2417.f3689.containsKey(c9794M18008.f27059)) {
                    return new C7829(this, c4036, null, abstractC7785);
                }
                return new C20826(this, c4036, false, abstractC7785);
            }
        }
        C22004 c22004 = this.f75331;
        HashSet<C2417> hashSet = new HashSet(c22004.m49584());
        hashSet.add(c22004.f69129);
        hashSet.remove(c4036.f8851.f7510);
        for (C2417 c2418 : hashSet) {
            if (c2418.f3703 == null) {
                if (c2418.f3690 == null) {
                    this.f75306.m19109(c2418);
                }
                if (c2418.f20405 != EnumC3600.f7353 && (abstractC7784 = (AbstractC7783) biFunction.apply(c2418, abstractC12224)) != null && predicate.test(abstractC7784)) {
                    C2417 c2419 = c4036.f8851.f7510;
                    C9794 c9794M18009 = abstractC7784.m18008();
                    if (c2419 == c9794M18009.f27063 || c2419.f3689.containsKey(c9794M18009.f27059)) {
                        return new C7829(this, c4036, null, abstractC7784);
                    }
                    return new C20826(this, c4036, false, abstractC7784);
                }
            }
        }
        return abstractC7783;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7783 m52672(C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        for (AbstractC7783 abstractC7783 : abstractC21195.mo17983().m22456(abstractC12224)) {
            if (abstractC7783.f20405 == EnumC3600.f7354) {
                return m52668(c4036, abstractC6462, abstractC7783) ? abstractC7783 : new C7829(this, c4036, abstractC6462, abstractC7783);
            }
        }
        return this.f75329;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7783 m52673(C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        AbstractC6462 abstractC6463 = abstractC21195.f20406;
        C8374 c8374 = this.f75323;
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6463);
        AbstractC7783 abstractC7783M52633 = this.f75329;
        if (abstractC6462M19502 != null && abstractC6462M19502.m14777(EnumC11353.CLASS)) {
            abstractC7783M52633 = m52633(abstractC7783M52633, m52674(c4036, abstractC6462, abstractC12224, abstractC6462M19502.f16705));
        }
        for (C4848 c4848M19450 = c8374.m19450(abstractC21195.f20406); abstractC7783M52633.f20405 != EnumC3600.f7338 && c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            AbstractC7783 abstractC7783M52674 = m52674(c4036, abstractC6462, abstractC12224, ((AbstractC6462) c4848M19450.f11034).f16705);
            if (!abstractC7783M52633.f20405.m6625() && !abstractC7783M52674.f20405.m6625() && abstractC7783M52674.f20407 != abstractC7783M52633.f20407) {
                abstractC7783M52633 = new C13194(this, abstractC7783M52633, abstractC7783M52674);
            } else {
                abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52674);
            }
        }
        return abstractC7783M52633;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7783 m52674(C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        AbstractC7783 abstractC7783M52672 = m52672(c4036, abstractC6462, abstractC12224, abstractC21195);
        return abstractC7783M52672 != this.f75329 ? abstractC7783M52672 : m52673(c4036, abstractC6462, abstractC12224, abstractC21195);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52648(C4036 c4036, AbstractC9655 abstractC9655, AbstractC12224 abstractC12224, InterfaceC22323 interfaceC22323) {
        Iterator it = abstractC9655.m22456(abstractC12224).iterator();
        AbstractC7783 abstractC7783M52633 = this.f75329;
        while (it.hasNext()) {
            AbstractC7783 abstractC7783M52651 = m52651(c4036, ((AbstractC7783) it.next()).mo18002(), interfaceC22323);
            EnumC3600 enumC3600 = abstractC7783M52633.f20405;
            EnumC3600 enumC3601 = EnumC3600.f7354;
            if (enumC3600 == enumC3601 && abstractC7783M52651.f20405 == enumC3601 && abstractC7783M52633 != abstractC7783M52651) {
                return new C13194(this, abstractC7783M52633, abstractC7783M52651);
            }
            abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52651);
        }
        return abstractC7783M52633;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:133:0x023a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0242  */
    /* JADX WARN: Code duplicated, block: B:136:0x0247  */
    /* JADX WARN: Code duplicated, block: B:139:0x0257  */
    /* JADX WARN: Code duplicated, block: B:179:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0258 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52662(C9661 c9661, C4036 c4036, AbstractC12224 abstractC12224, C17010 c17010) {
        long j;
        AbstractC7783 abstractC7783M52633;
        AbstractC7783 abstractC7783M52649;
        AbstractC7783 c3546;
        C7650 c7650;
        C15828 c15828;
        boolean zM38615 = c17010.m38615(C17010.f50311);
        AbstractC7783 abstractC7783M52648 = this.f75329;
        if (zM38615) {
            AbstractC7783 c7829 = this.f75340;
            boolean z = false;
            C4036 c4037 = c4036;
            while (true) {
                if (c4037.f8852 != null) {
                    Iterator it = ((C10545) c4037.f8849).f29201.m22456(abstractC12224).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                            j = 0;
                            if (abstractC7783.f20405 == EnumC3600.f7339 && (abstractC7783.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                if (z) {
                                    c7829 = new C3546(abstractC7783, this);
                                } else {
                                    abstractC7783M52649 = abstractC7783;
                                }
                                abstractC7783M52649 = c7829;
                                break;
                            }
                        } else {
                            j = 0;
                            abstractC7783M52649 = null;
                        }
                        if (m52631(c4037)) {
                            z = true;
                        }
                        if (abstractC7783M52649 == null) {
                            C15828 c15829 = c4037.f8855.f20027;
                            abstractC7783M52649 = m52647(c4037, c15829.f20406, abstractC12224, c15829);
                        }
                        if (abstractC7783M52649.mo17485()) {
                            if (!z || abstractC7783M52649.f20405 != EnumC3600.f7339 || abstractC7783M52649.f20407.f20405 != EnumC3600.f7354 || (abstractC7783M52649.mo18003() & 8) != j) {
                                break;
                            }
                            c7829 = new C3546(abstractC7783M52649, this);
                            abstractC7783M52649 = c7829;
                            break;
                            abstractC7783M52648 = abstractC7783M52649;
                            return m52625(c9661, abstractC7783M52648, abstractC12224);
                        }
                        c7829 = m52633(c7829, abstractC7783M52649);
                        C15828 c158210 = c4037.f8855.f20027;
                        c158210.mo18020();
                        if ((c158210.f20409 & 8) != j) {
                            z = true;
                        }
                        c4037 = c4037.f8852;
                    }
                } else {
                    C15828 c158211 = this.f75331.f69140;
                    AbstractC7783 abstractC7783M52647 = m52647(c4036, c158211.f20406, abstractC12224, c158211);
                    if (!abstractC7783M52647.mo17485()) {
                        if (!c7829.mo17485()) {
                            C3626 c3626 = c4036.f8851;
                            int i = 2;
                            AbstractC9655[] abstractC9655Arr = {c3626.f7513, c3626.f7511};
                            int i2 = 0;
                            AbstractC7783 abstractC7784 = null;
                            while (true) {
                                if (i2 < i) {
                                    AbstractC9655 abstractC9655 = abstractC9655Arr[i2];
                                    Iterator it2 = abstractC9655.m22456(abstractC12224).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            AbstractC7783 abstractC7785 = (AbstractC7783) it2.next();
                                            EnumC3600 enumC3600 = abstractC7785.f20405;
                                            EnumC3600 enumC3601 = EnumC3600.f7339;
                                            if (enumC3600 == enumC3601) {
                                                if (!c7829.f20405.m6625() && abstractC7785.f20407 != c7829.f20407) {
                                                    abstractC7783M52649 = new C13194(this, c7829, abstractC7785);
                                                } else if (!c7829.f20405.m6622(enumC3601)) {
                                                    AbstractC7783 abstractC7786 = abstractC9655.mo22459(abstractC7785).f26587;
                                                    if (m52668(c4036, abstractC7786.f20406, abstractC7785)) {
                                                        abstractC7784 = abstractC7786;
                                                        c7829 = abstractC7785;
                                                    } else {
                                                        abstractC7784 = abstractC7786;
                                                        c7829 = new C7829(this, c4036, abstractC7786.f20406, abstractC7785);
                                                    }
                                                }
                                            }
                                        } else if (!c7829.mo17485()) {
                                            i2++;
                                            i = 2;
                                        }
                                        j = 0;
                                        break;
                                    }
                                }
                                AbstractC7783 abstractC7787 = abstractC7784;
                                abstractC7783M52649 = c7829;
                                if (abstractC7783M52649.f20405 == EnumC3600.f7339 && abstractC7783M52649.f20407.f20406 != abstractC7787.f20406) {
                                    abstractC7783M52649 = abstractC7783M52649.mo9256(abstractC7787);
                                }
                                j = 0;
                                break;
                            }
                        }
                    } else {
                        c7829 = abstractC7783M52647;
                    }
                    j = 0;
                    abstractC7783M52649 = c7829;
                    break;
                }
            }
            if (abstractC7783M52649.mo17485()) {
                abstractC7783M52648 = abstractC7783M52649;
            } else {
                abstractC7783M52633 = m52633(abstractC7783M52648, abstractC7783M52649);
            }
            return m52625(c9661, abstractC7783M52648, abstractC12224);
        }
        j = 0;
        abstractC7783M52633 = abstractC7783M52648;
        if (c17010.m38615(C17010.f50319)) {
            if (abstractC12224 != this.f75320.f21725) {
                boolean z2 = false;
                C4036 c4038 = c4036;
                AbstractC7783 abstractC7783M52634 = abstractC7783M52648;
                while (true) {
                    if (c4038.f8852 != null) {
                        Iterator it3 = ((C10545) c4038.f8849).f29201.m22456(abstractC12224).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                c3546 = abstractC7783M52648;
                                break;
                            }
                            c3546 = (AbstractC7783) it3.next();
                            EnumC3600 enumC3602 = c3546.f20405;
                            EnumC3600 enumC3603 = EnumC3600.f7354;
                            if (enumC3602 == enumC3603) {
                                if (!c3546.f20406.m14777(EnumC11353.TYPEVAR) || (!z2 && (!m52631(c4038) || c3546.f20407.f20405 != enumC3603))) {
                                    break;
                                    break;
                                    break;
                                }
                                c3546 = new C3546(c3546, this);
                                break;
                            }
                        }
                        if (m52631(c4038)) {
                            z2 = true;
                        }
                        C15828 c158212 = c4038.f8855.f20027;
                        AbstractC7783 abstractC7783M52672 = m52672(c4038, c158212.f20406, abstractC12224, c158212);
                        if (c3546 != abstractC7783M52648 && (c4036.f8854 || abstractC7783M52672 == abstractC7783M52648 || (c3546.f20405 == EnumC3600.f7354 && c3546.mo17485() && c3546.f20407.f20405 == EnumC3600.f7343))) {
                            abstractC7783M52648 = c3546;
                            break;
                        }
                        if (abstractC7783M52672 == abstractC7783M52648) {
                            C15828 c158213 = c4038.f8855.f20027;
                            abstractC7783M52672 = m52673(c4038, c158213.f20406, abstractC12224, c158213);
                        }
                        if (z2 && abstractC7783M52672.f20405 == EnumC3600.f7354) {
                            AbstractC6462 abstractC6462 = abstractC7783M52672.f20406;
                            EnumC11353 enumC11353 = EnumC11353.CLASS;
                            if (abstractC6462.m14777(enumC11353) && abstractC7783M52672.f20406.mo7201().m14777(enumC11353) && c4038.f8855.f20027.f20406.mo14781() && abstractC7783M52672.f20406.mo7201().mo14781()) {
                                abstractC7783M52648 = new C3546(abstractC7783M52672, this);
                                break;
                            }
                            if (abstractC7783M52672.mo17485()) {
                                abstractC7783M52648 = abstractC7783M52672;
                                break;
                            }
                            abstractC7783M52634 = m52633(abstractC7783M52634, abstractC7783M52672);
                            if (c4038.f8854) {
                                c7650 = (C7650) c4038.f8850;
                            } else {
                                c7650 = c4038.f8855;
                            }
                            c15828 = c7650.f20027;
                            c15828.mo18020();
                            if ((c15828.f20409 & 8) != j) {
                                z2 = true;
                            }
                            c4038 = c4038.f8852;
                        } else {
                            if (abstractC7783M52672.mo17485()) {
                                abstractC7783M52648 = abstractC7783M52672;
                                break;
                            }
                            abstractC7783M52634 = m52633(abstractC7783M52634, abstractC7783M52672);
                            if (c4038.f8854) {
                                c7650 = (C7650) c4038.f8850;
                            } else {
                                c7650 = c4038.f8855;
                            }
                            c15828 = c7650.f20027;
                            c15828.mo18020();
                            if ((c15828.f20409 & 8) != j) {
                                z2 = true;
                            }
                            c4038 = c4038.f8852;
                        }
                    } else {
                        if (!c4036.f8850.m16617(EnumC19998.f60715)) {
                            abstractC7783M52648 = m52648(c4036, c4036.f8851.f7513, abstractC12224, this.f75304);
                            if (!abstractC7783M52648.mo17485()) {
                                AbstractC7783 abstractC7783M52635 = m52633(abstractC7783M52634, abstractC7783M52648);
                                AbstractC15689 abstractC15689 = c4036.f8851.f7508;
                                C7980 c7980 = this.f75308;
                                abstractC7783M52648 = m52648(c4036, abstractC15689, abstractC12224, c7980);
                                if (!abstractC7783M52648.mo17485()) {
                                    AbstractC7783 abstractC7783M52636 = m52633(abstractC7783M52635, abstractC7783M52648);
                                    C9794 c9794 = c4036.f8851.f7517;
                                    c9794.mo18020();
                                    abstractC7783M52648 = m52648(c4036, c9794.f27061, abstractC12224, c7980);
                                    if (!abstractC7783M52648.mo17485()) {
                                        AbstractC7783 abstractC7783M52637 = m52633(abstractC7783M52636, abstractC7783M52648);
                                        abstractC7783M52648 = m52648(c4036, c4036.f8851.f7511, abstractC12224, this.f75317);
                                        if (!abstractC7783M52648.mo17485()) {
                                            abstractC7783M52648 = m52633(abstractC7783M52637, abstractC7783M52648);
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        abstractC7783M52648 = abstractC7783M52634;
                        break;
                    }
                }
            }
            if (!abstractC7783M52648.mo17485()) {
                abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52648);
            }
            return m52625(c9661, abstractC7783M52648, abstractC12224);
        }
        abstractC7783M52649 = abstractC7783M52633;
        if (c17010.m38615(C17010.f50320)) {
            abstractC7783M52649 = m52649(c4036, abstractC12224);
        }
        abstractC7783M52648 = abstractC7783M52649;
        return m52625(c9661, abstractC7783M52648, abstractC12224);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52661(C8320 c8320, C4036 c4036, AbstractC21195 abstractC21195, AbstractC12224 abstractC12224, C17010 c17010) {
        AbstractC7783 abstractC7783M52649;
        AbstractC12224 abstractC12224M47864 = AbstractC21195.m47864(abstractC12224, abstractC21195);
        boolean zM38615 = c17010.m38615(C17010.f50319);
        AbstractC7783 abstractC7783M52633 = this.f75329;
        if (zM38615) {
            abstractC7783M52649 = m52651(c4036, abstractC12224M47864, (!this.f75330 || c17010.m38615(C17010.f50320) || abstractC21195.mo17485() || ((C10545) c4036.f8849).f29199.f25979) ? this.f75308 : this.f75299);
            if (abstractC7783M52649.mo17485()) {
                if (abstractC12224 != abstractC7783M52649.f20408) {
                }
            } else {
                abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52649);
            }
            if (c17010.m38615(C17010.f50320)) {
                abstractC7783M52649 = m52649(c4036, abstractC12224M47864);
            } else {
                abstractC7783M52649 = abstractC7783M52633;
            }
        } else if (c17010.m38615(C17010.f50320)) {
            abstractC7783M52649 = m52649(c4036, abstractC12224M47864);
        } else {
            abstractC7783M52649 = abstractC7783M52633;
        }
        return m52625(c8320, abstractC7783M52649, abstractC12224);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52655(AbstractC7257 abstractC7257, C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C17010 c17010) {
        AbstractC7783 abstractC7783M52674;
        boolean zM38615 = c17010.m38615(C17010.f50311);
        AbstractC7783 abstractC7783M52633 = this.f75329;
        if (zM38615) {
            abstractC7783M52674 = m52647(c4036, abstractC6462, abstractC12224, abstractC6462.f16705);
            if (!abstractC7783M52674.mo17485()) {
                abstractC7783M52633 = m52633(abstractC7783M52633, abstractC7783M52674);
                if (c17010.m38615(C17010.f50319)) {
                    abstractC7783M52674 = m52674(c4036, abstractC6462, abstractC12224, abstractC6462.f16705);
                    if (!abstractC7783M52674.mo17485()) {
                        abstractC7783M52674 = m52633(abstractC7783M52633, abstractC7783M52674);
                    }
                } else {
                    abstractC7783M52674 = abstractC7783M52633;
                }
            }
        } else if (c17010.m38615(C17010.f50319)) {
            abstractC7783M52674 = m52674(c4036, abstractC6462, abstractC12224, abstractC6462.f16705);
            if (!abstractC7783M52674.mo17485()) {
                abstractC7783M52674 = m52633(abstractC7783M52633, abstractC7783M52674);
            }
        } else {
            abstractC7783M52674 = abstractC7783M52633;
        }
        return m52625(abstractC7257, abstractC7783M52674, abstractC12224);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC7783 m52625(InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC12224 abstractC12224) {
        EnumC3600 enumC3600 = abstractC7783.f20405;
        if (enumC3600 == EnumC3600.f7354 || enumC3600 == EnumC3600.f7345) {
            boolean z = this.f75326;
            C8200 c8200 = this.f75320;
            if (z && abstractC12224.equals(c8200.f21746)) {
                return new C12779(this, c8200.f21746);
            }
            AbstractC12224 abstractC12225 = c8200.f21657;
            AbstractC12224 abstractC12226 = c8200.f21657;
            if (abstractC12224.equals(abstractC12225)) {
                if (this.f75328) {
                    return new C12779(this, abstractC12226);
                }
                if (interfaceC5323 != null) {
                    C12895 c12895 = C15675.f45417;
                    this.f75324.m9364(interfaceC5323, new C12895("compiler", "illegal.ref.to.restricted.type", abstractC12226));
                }
            }
        }
        return abstractC7783;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52657(AbstractC7783 abstractC7783, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7784, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, boolean z, C4848 c4848, C4848 c4849, InterfaceC2719 interfaceC2719) {
        C18258 c18258Mo6320;
        if (!abstractC7783.f20405.m6625()) {
            return abstractC7783;
        }
        AbstractC7570 abstractC7570 = (AbstractC7570) abstractC7783.mo9143();
        AbstractC7783 abstractC7783Mo17484 = abstractC7570.mo17484(abstractC12224, z ? abstractC6462.f16705 : this.f75331.f69157);
        C4848 c4848Mo4223 = interfaceC2719.mo4223(abstractC7783Mo17484, c4848);
        if (interfaceC2719.mo4224(abstractC6462, c4848Mo4223, c4849) && (c18258Mo6320 = abstractC7570.mo6320(EnumC14710.ERROR, interfaceC5323, abstractC7784, abstractC6462, abstractC12224, c4848Mo4223, c4849)) != null) {
            c18258Mo6320.m41587(EnumC21417.RESOLVE_ERROR);
            this.f75324.mo9356(c18258Mo6320);
        }
        return abstractC7783Mo17484;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52656(AbstractC7783 abstractC7783, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7784, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, boolean z) {
        return m52657(abstractC7783, interfaceC5323, abstractC7784, abstractC6462, abstractC12224, z, C4848.m10283(), (C4848) null, this.f75335);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52666(AbstractC14355 abstractC14355, AbstractC7783 abstractC7783) {
        if ((abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (abstractC7783.mo18003() & 8796093022208L) != 0) {
            return;
        }
        EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783);
        AbstractC7783 abstractC7783M17991 = abstractC7783.m17991();
        C14040 c14040 = C8300.f21997;
        this.f75324.m9352(abstractC14355, new C14040("compiler", "abstract.cant.be.accessed.directly", enumC10306M51425, abstractC7783, abstractC7783M17991));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52653(InterfaceC5323 interfaceC5323, C4036 c4036, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        return m52643(c4036, interfaceC5323, abstractC7783, new C14119(this), new C18557(this, abstractC12224, abstractC6462, c4848, c4849));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52658(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        AbstractC15689 abstractC15689 = this.f75338;
        Iterator it = abstractC15689.m22456(abstractC12224).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C8374 c8374 = this.f75323;
            if (zHasNext) {
                AbstractC7783 abstractC7784 = (AbstractC7783) it.next();
                if (c8374.m19490(abstractC6462, abstractC7784.f20406) && abstractC7783.f20407 == abstractC7784.f20407) {
                    return abstractC7784;
                }
            } else {
                AbstractC6462 abstractC6462Mo14787 = abstractC7783.f20406.mo14787();
                C22004 c22004 = this.f75331;
                if (!c8374.m19490(abstractC6462Mo14787, c22004.f69208) && !c8374.m19490(abstractC6462Mo14787, abstractC6462.mo14787())) {
                    abstractC6462 = new C12497(abstractC6462.mo14797(), abstractC6462Mo14787, abstractC6462.mo14794(), c22004.f69163);
                }
                C15874 c15874 = new C15874((abstractC7783.mo18003() & 15) | 137438954496L, abstractC7783.f20408, abstractC6462, abstractC7783.f20407, abstractC7783);
                if (!abstractC6462.mo14812()) {
                    abstractC15689.mo28415(c15874);
                }
                return c15874;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m52640(InterfaceC5323 interfaceC5323, C4036 c4036, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        C14119 c14119 = new C14119(this);
        c14119.f40076 = true;
        AbstractC7783 abstractC7783M52643 = m52643(c4036, interfaceC5323, abstractC6462.f16705, c14119, new C18557(this, abstractC12224, abstractC6462, c4848, c4849));
        if (abstractC7783M52643.f20405 == EnumC3600.f7343) {
            return (C5771) abstractC7783M52643;
        }
        C13370 c13370 = C13665.f38450;
        throw new C24769(this.f75333.m18543(new C13370("compiler", "fatal.err.cant.locate.meth", abstractC12224)).toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52652(InterfaceC5323 interfaceC5323, C4036 c4036, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        return m52643(c4036, interfaceC5323, abstractC6462.f16705, new C14119(this), new C24592(this, this.f75320.f21737, abstractC6462, c4848, c4849, interfaceC5323));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7783 m52628(C23663 c23663, C20530 c20530, C4036 c4036, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849, boolean z) {
        AbstractC7783 abstractC7783M52622 = c23663.m52622(c4036, abstractC6462, c4848, c4849, z);
        C16852 c16852 = c23663.f75325;
        AbstractC7783 abstractC7783 = ((C10545) c4036.f8849).f29201.f26587;
        c16852.getClass();
        c16852.m38277(new C19536(c20530), abstractC7783, abstractC7783M52622);
        c16852.m38288(c20530, ((C10545) c4036.f8849).f29201.f26587, abstractC7783M52622);
        return abstractC7783M52622;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 m52622(C4036 c4036, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849, boolean z) {
        C4848 c4848M10283;
        AbstractC15689 abstractC15689Mo17983 = (abstractC6462.f16705.m17989() ? this.f75331.f69208.f16705 : abstractC6462.f16705).mo17983();
        C8200 c8200 = this.f75320;
        AbstractC7783 abstractC7783M52644 = this.f75337;
        for (AbstractC7783 abstractC7783 : abstractC15689Mo17983.m22456(c8200.f21737)) {
            if (abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                if (abstractC7783.f20406.m14777(EnumC11353.FORALL)) {
                    c4848M10283 = ((C11945) abstractC7783.f20406).f33323;
                } else {
                    c4848M10283 = C4848.m10283();
                }
                C4848 c4848Mo14802 = abstractC6462.f16705.f20406.mo14802();
                c4848Mo14802.getClass();
                abstractC7783M52644 = m52644(c4036, abstractC6462, c4848, c4849, new C21911(abstractC7783.mo18003(), c8200.f21737, new C11945(this.f75323.m19482(abstractC7783.f20406.mo14809(), abstractC6462), c4848M10283.m10292(c4848Mo14802)), abstractC6462.f16705, abstractC7783), abstractC7783M52644, z);
            }
        }
        return abstractC7783M52644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10923 m52663(AbstractC6462 abstractC6462, EnumC18298 enumC18298, C11142 c11142, C4848 c4848, C4848 c4849, AbstractC12224 abstractC12224) {
        if (!abstractC12224.equals(this.f75320.f21737)) {
            return new C5402(this, c11142, abstractC12224, abstractC6462, c4848, c4849, enumC18298);
        }
        if (abstractC6462.m14777(EnumC11353.ARRAY)) {
            return new C23922(this, c11142, abstractC6462, c4848, c4849, enumC18298);
        }
        return new C18813(this, c11142, abstractC6462, c4848, c4849, enumC18298);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24293 m52665(C4036 c4036, C11142 c11142, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849, AbstractC6462 abstractC6463, AbstractC11853 abstractC11853, C2733 c2733, AbstractC11594 abstractC11594) {
        C20982 c20982;
        C20982 c20983;
        C20982 c20982Mo24248;
        EnumC18298 enumC18298;
        AbstractC10923 abstractC10923M52663 = m52663(abstractC6462, EnumC18298.f54637, c11142, c4848, c4849, abstractC12224);
        AbstractC7257 abstractC7257 = c4036.f8850;
        C10545 c10545 = (C10545) c4036.f8849;
        C4036 c4036M8087 = c4036.m8087(abstractC7257, c10545.m24327(c10545.f29201));
        C14119 c14119 = new C14119(this);
        c14119.f40078 = abstractC11853;
        AbstractC7257 abstractC7258 = c4036.f8850;
        abstractC7258.getClass();
        AbstractC7783 abstractC7783M52643 = m52643(c4036M8087, abstractC7258, abstractC6462.f16705, c14119, abstractC10923M52663);
        C20982 c20984 = new C20982(abstractC7783M52643, c14119);
        boolean z = this.f75307;
        if (z) {
            m52630(c11142, c14119, abstractC7783M52643, true);
        }
        C4036 c4036M8088 = c4036.m8087(c4036.f8850, c10545.m24327(c10545.f29201));
        AbstractC10923 abstractC10923Mo11859 = abstractC10923M52663.mo11859(c2733);
        if (abstractC10923Mo11859 == null) {
            c20982 = c20984;
            c20983 = this.f75321;
        } else {
            C14119 c141110 = new C14119(this);
            c141110.f40078 = abstractC11853;
            AbstractC7257 abstractC7259 = c4036.f8850;
            abstractC7259.getClass();
            c20982 = c20984;
            AbstractC7783 abstractC7783M52644 = m52643(c4036M8088, abstractC7259, abstractC6462.f16705, c141110, abstractC10923Mo11859);
            c20983 = new C20982(abstractC7783M52644, c141110);
            if (z) {
                m52630(c11142, c141110, abstractC7783M52644, false);
            }
        }
        if (c20983 != abstractC11594.f32340.f75321) {
            c20982Mo24248 = abstractC11594.mo24249(c20982, c20983);
        } else {
            c20982Mo24248 = abstractC11594.mo24248(c20982);
        }
        AbstractC7783 abstractC7783 = c20982Mo24248.f65895;
        if (c20982Mo24248 == c20983) {
            abstractC10923M52663 = abstractC10923Mo11859;
        }
        C24293 c24293 = new C24293(abstractC7783, abstractC10923M52663);
        if (c20982Mo24248 == c20983) {
            enumC18298 = ((C10545) c4036M8088.f8849).f29204;
        } else {
            enumC18298 = ((C10545) c4036M8087.f8849).f29204;
        }
        c10545.f29204 = enumC18298;
        if (!abstractC7783.f20405.m6625()) {
            C5771 c5771 = (C5771) abstractC7783;
            if ((c5771.f20409 & 70368744177664L) != 0) {
                c10545.f29204 = EnumC18298.f54636;
                return new C24293(m52658(c5771, abstractC6463), abstractC10923M52663);
            }
        }
        return c24293;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52630(C11142 c11142, C14119 c14119, AbstractC7783 abstractC7783, boolean z) {
        C8005 c8005;
        C18258 c18258M18543;
        C20271 c20271 = new C20271();
        Iterator it = c14119.f40074.iterator();
        char c = 0;
        int i = -1;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c8005 = this.f75333;
            if (!zHasNext) {
                break;
            }
            C14789 c14789 = (C14789) it.next();
            EnumC18298 enumC18298 = c14119.f40077;
            EnumC18298 enumC18299 = c14789.f42189;
            AbstractC7783 abstractC7784 = c14789.f42190;
            if (enumC18298 == enumC18299 && c14789.m33755()) {
                if (abstractC7784.f20406.m14777(EnumC11353.FORALL)) {
                    AbstractC6462 abstractC6462 = c14789.f42188;
                    C13370 c13370 = C13665.f38450;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC6462;
                    c18258M18543 = c8005.m18543(new C13370("compiler", "partial.inst.sig", objArr));
                } else {
                    c18258M18543 = null;
                }
                c20271.m45777(c8005.m18548(c18258M18543 == null ? "applicable.method.found.2" : "applicable.method.found.3", Integer.valueOf(i2), abstractC7784.mo17483() ? C13665.f38521 : C13665.f38464, abstractC7784, c18258M18543));
                if (abstractC7784 == abstractC7783) {
                    i = i2;
                }
                i2++;
            }
            c = 0;
        }
        C23623 c23623 = this.f75324;
        c23623.mo9356(new C24098(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c23623.m9345(), c11142, c8005.m18549("method.ref.search.results.multi", z ? C13665.f38501 : C13665.f38524, c11142.toString(), Integer.valueOf(i))), c20271.m45783()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52643(C4036 c4036, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, C14119 c14119, AbstractC3390 abstractC3390) {
        EnumC3600 enumC3600;
        C14119 c141110 = this.f75305;
        try {
            AbstractC7783 abstractC7784 = this.f75337;
            this.f75305 = c14119;
            for (EnumC18298 enumC18298 : this.f75334) {
                if (enumC18298.ordinal() > abstractC3390.f6708.ordinal() || !abstractC7784.f20405.m6625() || (enumC3600 = abstractC7784.f20405) == EnumC3600.f7338 || enumC3600 == EnumC3600.f7348) {
                    break;
                    break;
                    break;
                    break;
                }
                C14119 c141111 = this.f75305;
                EnumC18298 enumC18299 = c141111.f40077;
                c141111.f40077 = enumC18298;
                AbstractC7783 abstractC7783Mo5930 = abstractC3390.mo5930(c4036, enumC18298);
                abstractC3390.mo5931(interfaceC5323, abstractC7783Mo5930);
                AbstractC7783 abstractC7783Mo29609 = enumC18298.mo29609(abstractC7784, abstractC7783Mo5930);
                C10545 c10545 = (C10545) c4036.f8849;
                if (abstractC7784 == abstractC7783Mo29609) {
                    enumC18298 = enumC18299;
                }
                c10545.f29204 = enumC18298;
                abstractC7784 = abstractC7783Mo29609;
            }
            return abstractC3390.mo5929(c4036, interfaceC5323, abstractC7783, abstractC7784);
        } finally {
            this.f75305 = c141110;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m52654(InterfaceC5323 interfaceC5323, C4036 c4036, AbstractC21195 abstractC21195, AbstractC12224 abstractC12224) {
        AbstractC7783 abstractC7783Mo22458;
        boolean z = false;
        for (C4036 c4037 = c4036; c4037.f8852 != null; c4037 = c4037.f8852) {
            if (m52631(c4037)) {
                z = true;
            }
            if (c4037.f8855.f20027 == abstractC21195 && (abstractC7783Mo22458 = ((C10545) c4037.f8849).f29201.mo22458(abstractC12224, (Predicate) null)) != null) {
                AbstractC7783 c3546 = z ? new C3546(abstractC7783Mo22458, this) : abstractC7783Mo22458;
                AbstractC6462 abstractC6462 = c4036.f8855.f20027.f20406;
                return m52656(c3546, interfaceC5323, (AbstractC7783) abstractC6462.f16705, abstractC6462, abstractC12224, true);
            }
            C15828 c15828 = c4037.f8855.f20027;
            c15828.mo18020();
            if ((c15828.f20409 & 8) != 0) {
                z = true;
            }
        }
        boolean zM17989 = abstractC21195.m17989();
        C22004 c22004 = this.f75331;
        C23623 c23623 = this.f75324;
        if (zM17989) {
            C8200 c8200 = this.f75320;
            if (abstractC12224 == c8200.f21756 && !m52631(c4036)) {
                C15828 c15829 = c4036.f8855.f20027;
                C8374 c8374 = this.f75323;
                if (c8374.m19449(abstractC21195, (AbstractC21195) c15829)) {
                    AbstractC6462 abstractC6463 = c4036.f8855.f18925;
                    C20271 c20271 = new C20271();
                    for (AbstractC6462 abstractC6464 : c8374.m19450(abstractC6463)) {
                        boolean z2 = true;
                        for (AbstractC6462 abstractC6465 : c8374.m19505(abstractC6463)) {
                            if (abstractC6464 != abstractC6465 && !abstractC6465.m14777(EnumC11353.ERROR) && c8374.m19486(abstractC6465, abstractC6464, false)) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            c20271.m45777(abstractC6464);
                        }
                    }
                    for (AbstractC6462 abstractC6466 : c20271.m45783()) {
                        if (abstractC6466.f16705 == abstractC21195) {
                            ((C10545) c4036.f8849).f29206 = abstractC6466;
                            return new C13818(0L, c8200.f21756, c8374.m19467(abstractC21195, c4036.f8855.f18925), c4036.f8855.f20027);
                        }
                    }
                    for (AbstractC6462 abstractC6467 : c8374.m19505(c4036.f8855.f18925)) {
                        if (abstractC6467.f16705.mo17999((AbstractC7783) abstractC21195, c8374) && abstractC6467.f16705 != abstractC21195) {
                            C13370 c13370 = C13665.f38450;
                            C13370 c13371 = new C13370("compiler", "redundant.supertype", abstractC21195, abstractC6467);
                            C14040 c14040 = C8300.f21997;
                            c23623.m9352(interfaceC5323, new C14040("compiler", "illegal.default.super.call", abstractC21195, c13371));
                            return c22004.f69144;
                        }
                    }
                    C1446.m31698();
                    throw null;
                }
            }
        }
        C14040 c14041 = C8300.f21997;
        c23623.m9352(interfaceC5323, new C14040("compiler", "not.encl.class", abstractC21195));
        return c22004.f69144;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52667(C4036 c4036, AbstractC6462 abstractC6462) {
        AbstractC7783 abstractC7783M52623;
        EnumC11353 enumC11353 = EnumC11353.CLASS;
        return abstractC6462.m14777(enumC11353) && abstractC6462.mo7201().m14777(enumC11353) && ((abstractC7783M52623 = m52623(c4036, (AbstractC7783) abstractC6462.f16705, false)) == null || abstractC7783M52623.f20405.m6625());
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC7783 m52623(C4036 c4036, AbstractC7783 abstractC7783, boolean z) {
        AbstractC7783 abstractC7783Mo22458;
        AbstractC12224 abstractC12224 = this.f75320.f21744;
        if (z) {
            c4036 = c4036.f8852;
        }
        if (c4036 != null) {
            boolean z2 = false;
            while (c4036 != null && c4036.f8852 != null) {
                if (m52631(c4036)) {
                    z2 = true;
                }
                if (c4036.f8855.f20027.mo17999((AbstractC7783) abstractC7783.f20407.m17990(), this.f75323) && (abstractC7783Mo22458 = ((C10545) c4036.f8849).f29201.mo22458(abstractC12224, (Predicate) null)) != null) {
                    return z2 ? new C3546(abstractC7783Mo22458, this) : abstractC7783Mo22458;
                }
                C15828 c15828 = c4036.f8855.f20027;
                c15828.mo18020();
                if ((c15828.f20409 & 8) != 0) {
                    z2 = true;
                }
                c4036 = c4036.f8852;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m52642(InterfaceC5323 interfaceC5323, C4036 c4036, AbstractC6462 abstractC6462, boolean z) {
        AbstractC7783 abstractC7783M52656;
        boolean zM6623 = abstractC6462.f16705.f20407.f20405.m6623(C17010.f50315);
        C23623 c23623 = this.f75324;
        if (zM6623) {
            abstractC7783M52656 = m52654(interfaceC5323, c4036, abstractC6462.mo7201().f16705, this.f75320.f21744);
        } else {
            AbstractC21195 abstractC21195 = abstractC6462.f16705;
            AbstractC7783 abstractC7783M52623 = m52623(c4036, (AbstractC7783) abstractC21195, z);
            if (abstractC7783M52623 == null) {
                C14040 c14040 = C8300.f21997;
                c23623.m9352(interfaceC5323, new C14040("compiler", "encl.class.required", abstractC21195));
                abstractC7783M52656 = this.f75331.f69144;
            } else {
                AbstractC6462 abstractC6463 = c4036.f8855.f20027.f20406;
                abstractC7783M52656 = m52656(abstractC7783M52623, interfaceC5323, (AbstractC7783) abstractC6463.f16705, abstractC6463, abstractC7783M52623.f20408, true);
            }
        }
        AbstractC6462 abstractC6464 = abstractC7783M52656.f20406;
        if (((C10545) c4036.f8849).f29215 && abstractC6464.f16705 == c4036.f8855.f20027) {
            C14040 c14041 = C8300.f21997;
            c23623.m9352(interfaceC5323, new C14040("compiler", "cant.ref.before.ctor.called", "this"));
        }
        return abstractC6464;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m52638(C4848 c4848) {
        if (c4848 == null || c4848.isEmpty()) {
            return this.f75315;
        }
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) it.next();
            if (abstractC6462.m14777(EnumC11353.DEFERRED)) {
                c20271.m45777(((C3423) abstractC6462).f6819);
            } else {
                c20271.m45777(abstractC6462);
            }
        }
        return c20271;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m52664(C4036 c4036, final C9794 c9794) {
        boolean zContains = c4036.f8851.f7510.f3698.contains(c9794.f27063);
        C22004 c22004 = this.f75331;
        C8005 c8005 = this.f75333;
        if (!zContains) {
            C2417 c2417 = c9794.f27063;
            C2417 c2418 = c22004.f69129;
            if (c2417 != c2418) {
                C2417 c2419 = c4036.f8851.f7510;
                if (c2419 != c2418) {
                    C13370 c13370 = C13665.f38450;
                    return c8005.m18543(new C13370("compiler", "not.def.access.does.not.read", c2419, c9794, c2417));
                }
                C13370 c13371 = C13665.f38450;
                return c8005.m18543(new C13370("compiler", "not.def.access.does.not.read.from.unnamed", c9794, c2417));
            }
            C2417 c24110 = c4036.f8851.f7510;
            C13370 c13372 = C13665.f38450;
            return c8005.m18543(new C13370("compiler", "not.def.access.does.not.read.unnamed", c9794, c24110));
        }
        if (C7480.stream(c9794.m18008().f27063.f3697).anyMatch(new Predicate() { // from class: l.ܽ֫۠
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
            public /* synthetic */ Predicate m40692or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C19023) obj).f56714 == c9794;
            }
        })) {
            C2417 c24111 = c4036.f8851.f7510;
            if (c24111 != c22004.f69129) {
                C2417 c24112 = c9794.f27063;
                C13370 c13373 = C13665.f38450;
                return c8005.m18543(new C13370("compiler", "not.def.access.not.exported.to.module", c9794, c24112, c24111));
            }
            C2417 c24113 = c9794.f27063;
            C13370 c13374 = C13665.f38450;
            return c8005.m18543(new C13370("compiler", "not.def.access.not.exported.to.module.from.unnamed", c9794, c24113));
        }
        if (c4036.f8851.f7510 != c22004.f69129) {
            C2417 c24114 = c9794.f27063;
            C13370 c13375 = C13665.f38450;
            return c8005.m18543(new C13370("compiler", "not.def.access.not.exported", c9794, c24114));
        }
        C2417 c24115 = c9794.f27063;
        C13370 c13376 = C13665.f38450;
        return c8005.m18543(new C13370("compiler", "not.def.access.not.exported.from.unnamed", c9794, c24115));
    }
}
