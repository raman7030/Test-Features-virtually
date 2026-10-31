package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C22406 {

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f72572 = new C4314();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C19914 f72574;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f72577;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6235 f72580;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f72581;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7898 f72583;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet f72584;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C6735 f72586;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f72587;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f72590;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C6136 f72594;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19585 f72595;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C6319 f72597;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22364 f72598;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15240 f72599;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f72600;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f72602;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C8295 f72603;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f72604;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C20661 f72605;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12399 f72606;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C5931 f72607;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8295 f72611;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f72612;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9310 f72613;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C8295 f72614;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4203 f72575 = new C2218(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3629 f72593 = new C3629();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18446 f72596 = new C18446(this);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C5040 f72585 = new C5040(this);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1386 f72592 = new C1386();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5905 f72582 = new C5905();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20996 f72573 = new C19858(this);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11550 f72578 = new InterfaceC20996() { // from class: l.ۨ۟֨
        @Override // l.InterfaceC20996
        /* JADX INFO: renamed from: ֫ */
        public final AbstractC5698 mo16565(C1755 c1755, final AbstractC10370 abstractC10370) {
            AbstractC5698 abstractC5698Mo20478 = c1755.f6075.f4742.mo20478(C12780.m31093(abstractC10370), new Predicate() { // from class: l.ۧ֫۠
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
                    AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                    return abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.mo16083() == abstractC10370;
                }
            });
            if (abstractC5698Mo20478 != null) {
                return new C19421(this.f34477, c1755, true, abstractC5698Mo20478);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22838 f72591 = new InterfaceC20996() { // from class: l.᩺۟֨
        @Override // l.InterfaceC20996
        /* JADX INFO: renamed from: ֫ */
        public final AbstractC5698 mo16565(C1755 c1755, AbstractC10370 abstractC10370) {
            C22406 c22406 = this.f73722;
            AbstractC5698 abstractC5698Mo20478 = c1755.f6075.f4740.mo20478(C12780.m31093(abstractC10370), new C7291(1, abstractC10370));
            if (abstractC5698Mo20478 == null) {
                return null;
            }
            try {
                return new C19421(c22406, c1755, true, c22406.f72574.m45829(abstractC5698Mo20478.m16089().f24147, abstractC10370));
            } catch (C20515 unused) {
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC0369 f72609 = new C4335();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C2924 f72576 = new C2924();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12801 f72610 = new C12801(this);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9274 f72588 = new C9274(this);

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C8568 f72601 = new C8568(this);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12111 f72589 = new C12111();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2609 f72608 = C2609.of((Object) EnumC16761.f51454, (Object) EnumC16761.f51453, (Object) EnumC16761.f51455);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12364 f72579 = null;

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ۨ۟֨] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.᩺۟֨] */
    public C22406(C2903 c2903) {
        c2903.m8841(f72572, this);
        C20661 c20661M47250 = C20661.m47250(c2903);
        this.f72605 = c20661M47250;
        this.f72614 = new C8295(this, EnumC1296.f4570);
        C8295 c8295 = new C8295(this, EnumC1296.f4574);
        this.f72611 = c8295;
        this.f72603 = new C8295(this, EnumC1296.f4573);
        this.f72595 = C19585.m45021(c8295);
        this.f72594 = C6136.m17057(c2903);
        this.f72598 = C22364.m50099(c2903);
        this.f72613 = C9310.m23901(c2903);
        C7898 c7898 = (C7898) c2903.m8838(C7898.f24468);
        this.f72583 = c7898 == null ? new C7898(c2903) : c7898;
        this.f72606 = C12399.m30567(c2903);
        this.f72599 = C15240.m36054(c2903);
        this.f72586 = C6735.m18336(c2903);
        this.f72574 = C19914.m45820(c2903);
        this.f72580 = C6235.m17162(c2903);
        this.f72597 = C6319.m17456(c2903);
        this.f72607 = C5931.m16615(c2903);
        C23168.m51341(c2903);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        EnumC0121 enumC0121 = EnumC0121.f1151;
        this.f72577 = c11781M28823.m28829(enumC0121, "compact") || (c11781M28823.m28836(enumC0121) && c11781M28823.m28835("rawDiagnostics"));
        this.f72584 = EnumC21701.m48990(c11781M28823);
        EnumC10892.m27201(c2903);
        this.f72590 = EnumC10637.f31977.m26686(enumC16280M38301);
        this.f72600 = EnumC10637.f32000.m26686(enumC16280M38301);
        this.f72602 = EnumC10637.f32008.m26686(enumC16280M38301);
        this.f72587 = EnumC10637.f31978.m26686(enumC16280M38301);
        this.f72612 = AbstractC14016.m33607(c20661M47250.f66475);
        this.f72604 = EnumC10637.f32009.m26686(enumC16280M38301);
        EnumC10637.f32007.m26686(enumC16280M38301);
        this.f72581 = c11781M28823.m28831("debug.dumpMethodReferenceSearchResults");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22406 m50289(C2903 c2903) {
        C22406 c22406 = (C22406) c2903.m8838(f72572);
        return c22406 == null ? new C22406(c2903) : c22406;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m50293(AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        return abstractC5698.f17559.m4390(abstractC5699.f17559) ? abstractC5698 : abstractC5699;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50291(C1755 c1755) {
        C1755 c1756 = c1755.f6076;
        return c1756 != null && ((C8604) c1755.f6073).f26297 > ((C8604) c1756.f6073).f26297;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50330(C1755 c1755, AbstractC19810 abstractC19810, boolean z) {
        boolean z2;
        C0052 c0052;
        C7814 c7814;
        C8526 c8526 = c1755.f6077;
        if ((c8526 == null || (c8526.f26046.f7169 & 536870912) == 0) && (!((C8604) c1755.f6073).f26282 || c1755.f6075.f4739 != abstractC19810.m16089().f24147)) {
            short sMo16084 = (short) (abstractC19810.mo16084() & 7);
            if (sMo16084 == 0) {
                C7814 c7815 = c1755.f6075.f4746;
                if (c7815 == abstractC19810.f17561 || c7815 == abstractC19810.m16089()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (sMo16084 == 1) {
                if (this.f72604) {
                    C0052 c0053 = c1755.f6075.f4739;
                    c0053.mo16101();
                    C7814 c7814M16089 = abstractC19810.m16089();
                    if (c0053 != c7814M16089.f24147 && c0053.f913.get(c7814M16089.f24143) != c7814M16089) {
                        C20661 c20661 = this.f72605;
                        if (c7814M16089 != c20661.f66473 && ((c0052 = c7814M16089.f24147) != c20661.f66447 || !c0053.f922.contains(c0052))) {
                            z2 = false;
                        }
                    }
                }
                z2 = true;
            } else if (sMo16084 == 2) {
                if (c1755.f6079.f17186.mo955() == abstractC19810.f17561.mo955()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                if (sMo16084 == 4 && (c7814 = c1755.f6075.f4746) != abstractC19810.f17561 && c7814 != abstractC19810.m16089()) {
                    C14163 c14163M16071 = c1755.f6079.f17186;
                    AbstractC5698 abstractC5698 = abstractC19810.f17561;
                    while (c14163M16071 != null && !c14163M16071.mo16080(abstractC5698, this.f72597)) {
                        c14163M16071 = c14163M16071.f17561.m16071();
                    }
                    if (c14163M16071 == null) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (!z || abstractC19810.f17560.mo4958() == AbstractC4308.f13885) {
                return z2;
            }
            if (!z2 || !m50329(c1755, abstractC19810.f17560.mo4958(), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50329(final C1755 c1755, AbstractC4308 abstractC4308, final boolean z) {
        if (abstractC4308.m12913(EnumC9454.ARRAY)) {
            return m50329(c1755, C6319.m17473(this.f72597.m17515(abstractC4308)), false);
        }
        return abstractC4308 instanceof C7835 ? C14841.stream(C19846.spliterator(((C7835) abstractC4308).m20930()), false).allMatch(new Predicate() { // from class: l.֫֫۠
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
                return this.f5371.m50330(c1755, ((AbstractC4308) obj).f13890, z);
            }
        }) : m50330(c1755, abstractC4308.f13890, z);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50328(C1755 c1755, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        if (abstractC5698.f17562 != this.f72594.f18879 || abstractC5698.f17561 == abstractC4308.f13890) {
            C8526 c8526 = c1755.f6077;
            Object obj = c1755.f6073;
            if (c8526 != null && (c8526.f26046.f7169 & 536870912) != 0) {
                return true;
            }
            C8604 c8604 = (C8604) obj;
            if (c8604.f26282 && c1755.f6075.f4739 == abstractC5698.m16089().f24147) {
                return true;
            }
            short sMo16084 = (short) (abstractC5698.mo16084() & 7);
            C6319 c6319 = this.f72597;
            if (sMo16084 == 0) {
                C7814 c7814 = c1755.f6075.f4746;
                if ((c7814 == abstractC5698.f17561.f17561 || c7814 == abstractC5698.m16089()) && m50329(c1755, abstractC4308, false) && abstractC5698.mo10961((AbstractC5698) abstractC4308.f13890, c6319) && m50295(abstractC5698, abstractC4308)) {
                    return true;
                }
            } else if (sMo16084 == 2) {
                C14163 c14163 = c1755.f6079.f17186;
                if ((c14163 == abstractC5698.f17561 || c14163.mo955() == abstractC5698.f17561.mo955()) && abstractC5698.mo10961((AbstractC5698) abstractC4308.f13890, c6319)) {
                    return true;
                }
            } else if (sMo16084 == 4) {
                C7814 c7815 = c1755.f6075.f4746;
                if (c7815 == abstractC5698.f17561.f17561 || c7815 == abstractC5698.m16089()) {
                    if (!m50329(c1755, abstractC4308, false) && m50295(abstractC5698, abstractC4308)) {
                        return true;
                    }
                } else {
                    C14163 c14163M16071 = c1755.f6079.f17186;
                    AbstractC4308 abstractC4308Mo12939 = abstractC4308.m12913(EnumC9454.TYPEVAR) ? abstractC4308.mo12939() : abstractC4308;
                    while (c14163M16071 != null) {
                        if (c14163M16071.mo16080(abstractC5698.f17561, c6319)) {
                            c14163M16071.mo16101();
                            if ((c14163M16071.f17563 & 512) == 0 && ((abstractC5698.mo16084() & 8) != 0 || abstractC5698.f17559 == EnumC1296.f4582 || abstractC4308Mo12939.f13890.mo16080((AbstractC5698) c14163M16071, c6319))) {
                                break;
                            }
                        }
                        c14163M16071 = c14163M16071.f17561.m16071();
                    }
                    if (c14163M16071 != null || (c8604.f26296 && (abstractC5698.mo16084() & 8) == 0 && abstractC5698.f17559 != EnumC1296.f4582)) {
                        if (!m50329(c1755, abstractC4308, false)) {
                        }
                    }
                }
            } else if (m50329(c1755, abstractC4308, false) && m50295(abstractC5698, abstractC4308)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m50295(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        if (abstractC5698.f17559 == EnumC1296.f4571 && !abstractC5698.m16075() && !abstractC5698.mo15572()) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            C6319 c6319 = this.f72597;
            C3581 c3581M10959 = ((C3581) abstractC5698).m10959(abstractC19810, c6319, true);
            if (c3581M10959 != null && c3581M10959 != abstractC5698 && abstractC5698.f17561 != c3581M10959.f17561 && c6319.m17532(c6319.m17543(c3581M10959, abstractC4308), c6319.m17543(abstractC5698, abstractC4308), true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m50331(C1755 c1755, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C23420 c23420, C2609 c2609, C2609 c26010, C1386 c1386) {
        C6319 c6319 = this.f72597;
        AbstractC4308 abstractC4308M17543 = c6319.m17543(abstractC5698, abstractC4308);
        C2609 c2609M8239 = C2609.m8239();
        C2609 c2609M82310 = c26010 == null ? C2609.m8239() : c26010;
        EnumC9454 enumC9454 = EnumC9454.FORALL;
        if (abstractC4308M17543.m12913(enumC9454) || !c2609M82310.m8249()) {
            if (abstractC4308M17543.m12913(enumC9454) && c2609M82310.m8249()) {
                C10077 c10077 = (C10077) abstractC4308M17543;
                C2609 c26011 = c10077.f30362;
                int iM8245 = c2609M82310.m8245();
                int iM8246 = c26011.m8245();
                C5931 c5931 = this.f72607;
                if (iM8245 != iM8246) {
                    String string = Integer.toString(c26011.m8245());
                    C11576 c11576 = C11886.f35440;
                    throw new C23653(c5931.m16617(new C11576("compiler", "wrong.number.type.args", string)));
                }
                C2609 c26012 = c26011;
                for (C2609 c26013 = c2609M82310; c26012.m8249() && c26013.m8249(); c26013 = c26013.f8241) {
                    for (C2609 c2609M17481 = c6319.m17481(c6319.m17484((C8541) c26012.f8240), c26011, c2609M82310); c2609M17481.m8249(); c2609M17481 = c2609M17481.f8241) {
                        if (!c6319.m17551((AbstractC4308) c26013.f8240, (AbstractC4308) c2609M17481.f8240, c1386)) {
                            AbstractC4308 abstractC4309 = (AbstractC4308) c26013.f8240;
                            C11576 c11577 = C11886.f35440;
                            throw new C23653(c5931.m16617(new C11576("compiler", "explicit.param.do.not.conform.to.bounds", abstractC4309, c2609M17481)));
                        }
                    }
                    c26012 = c26012.f8241;
                }
                abstractC4308M17543 = c6319.m17488(c10077.f14167, c26011, c2609M82310);
            } else if (abstractC4308M17543.m12913(enumC9454)) {
                C10077 c10078 = (C10077) abstractC4308M17543;
                C2609 c26014 = c10078.f30362;
                C2609 c2609M17564 = c6319.m17564(c26014);
                c2609M8239.getClass();
                c2609M8239 = c2609M17564.m8248(c2609M8239);
                abstractC4308M17543 = c6319.m17488(c10078.f14167, c26014, c2609M17564);
            }
        }
        AbstractC4308 abstractC43010 = abstractC4308M17543;
        C2609 c26015 = c2609M8239;
        boolean z = c26015.f8241 != null;
        for (C2609 c26016 = c2609; c26016.f8241 != null && !z; c26016 = c26016.f8241) {
            if (((AbstractC4308) c26016.f8240).m12913(EnumC9454.FORALL)) {
                z = true;
            }
        }
        if (z) {
            return this.f72586.m18348(c1755, c26015, (C10658) abstractC43010, c23420, (C3581) abstractC5698, c2609, this.f72579, c1386);
        }
        C6755 c6755M29997 = this.f72579.m29997(abstractC5698, this.f72586.f20931, c23420, c1386);
        this.f72579.f37062.mo11113(c1755, c6755M29997, c2609, abstractC43010.mo12933(), c1386);
        c6755M29997.mo18375();
        return abstractC43010;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m50301(C1755 c1755, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C23420 c23420, C2609 c2609, C2609 c26010, C1386 c1386) {
        C12364 c12364 = this.f72579;
        try {
            C12364 c12365 = new C12364(this);
            this.f72579 = c12365;
            c12365.f37057 = c23420.f75219 == C6735.f20919 ? EnumC13829.SPECULATIVE : EnumC13829.CHECK;
            if (c1755.f6074.m14709(EnumC18550.f57524)) {
                this.f72579.f37062 = new C20126(this, c23420.f75215.mo3857());
            }
            C12364 c12366 = this.f72579;
            EnumC16761 enumC16761 = ((C8604) c1755.f6073).f26288;
            c12366.f37061 = enumC16761;
            enumC16761.m39435();
            enumC16761.m39436();
            return m50331(c1755, abstractC4308, abstractC5698, c23420, c2609, c26010, c1386);
        } finally {
            this.f72579 = c12364;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50307(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        while (abstractC19810.f17560.m12913(EnumC9454.TYPEVAR)) {
            abstractC19810 = abstractC19810.f17560.mo12939().f13890;
        }
        for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(abstractC10370)) {
            if (abstractC5698.f17559 == EnumC1296.f4567 && (abstractC5698.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                return m50328(c1755, abstractC4308, abstractC5698) ? abstractC5698 : new C5746(this, c1755, abstractC4308, abstractC5698);
            }
        }
        AbstractC4308 abstractC4309 = abstractC19810.f17560;
        C6319 c6319 = this.f72597;
        AbstractC4308 abstractC4308M17562 = c6319.m17562(abstractC4309);
        AbstractC5698 abstractC5698M50293 = this.f72614;
        if (abstractC4308M17562 != null && (abstractC4308M17562.m12913(EnumC9454.CLASS) || abstractC4308M17562.m12913(EnumC9454.TYPEVAR))) {
            abstractC5698M50293 = m50293(abstractC5698M50293, m50307(c1755, abstractC4308, abstractC10370, abstractC4308M17562.f13890));
        }
        for (C2609 c2609M17510 = c6319.m17510(abstractC19810.f17560); abstractC5698M50293.f17559 != EnumC1296.f4566 && c2609M17510.m8249(); c2609M17510 = c2609M17510.f8241) {
            AbstractC5698 abstractC5698M50307 = m50307(c1755, abstractC4308, abstractC10370, ((AbstractC4308) c2609M17510.f8240).f13890);
            if (abstractC5698M50293.mo15574() && abstractC5698M50307.mo15574() && abstractC5698M50307.f17561 != abstractC5698M50293.f17561) {
                abstractC5698M50293 = new C11391(this, abstractC5698M50293, abstractC5698M50307);
            } else {
                abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50307);
            }
        }
        return abstractC5698M50293;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50304(C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699, boolean z) {
        if (abstractC5698.f17559 != EnumC1296.f4581) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            AbstractC5698 abstractC56910 = abstractC5698.f17561;
            C6319 c6319 = this.f72597;
            if ((abstractC19810 == abstractC56910 || abstractC5698.mo10961((AbstractC5698) abstractC19810, c6319)) && m50295(abstractC5698, abstractC4308)) {
                if (z && (abstractC5698.mo16084() & 17179869184L) == 0) {
                    if (!abstractC5699.f17559.m4393()) {
                        return abstractC5699;
                    }
                    AbstractC5473 abstractC5473 = (AbstractC5473) abstractC5699.mo7048();
                    C16597 c16597 = new C16597(this, abstractC5473.f17559, "badVarargs");
                    c16597.f50996 = abstractC5473;
                    return c16597;
                }
                C12171.m29642(!abstractC5698.f17559.m4393());
                try {
                    c6319.f19598.m4869();
                    this.f72579.m29999(abstractC5698, m50331(c1755, abstractC4308, abstractC5698, null, c2609, c26010, c6319.f19598));
                    if (m50328(c1755, abstractC4308, abstractC5698)) {
                        return (!abstractC5699.f17559.m4393() || abstractC5699.f17559 == EnumC1296.f4566) ? m50320(abstractC5698, abstractC5699, abstractC4308, c1755, c2609, z) : abstractC5698;
                    }
                    C5746 c5746 = new C5746(this, c1755, abstractC4308, abstractC5698);
                    EnumC12986 enumC12986 = EnumC12986.FRAGMENT;
                    C16719 c16719Mo4076 = c5746.mo4076(enumC12986, null, null, abstractC4308, null, c2609, c26010);
                    EnumC1296 enumC1296 = abstractC5699.f17559;
                    if (enumC1296 == EnumC1296.f4574) {
                        return c5746;
                    }
                    if (enumC1296 == EnumC1296.f4580) {
                        this.f72579.m30000(abstractC5698, c16719Mo4076);
                        return new C8837(this, this.f72579);
                    }
                    if (enumC1296 == EnumC1296.f4569) {
                        this.f72579.m30000(abstractC5698, c16719Mo4076);
                        return abstractC5699;
                    }
                    if (enumC1296 != EnumC1296.f4575 || !(abstractC5699 instanceof C5746)) {
                        return abstractC5699;
                    }
                    C5746 c5747 = (C5746) abstractC5699;
                    this.f72579.m30000(c5747.f59170, c5747.mo4076(enumC12986, null, null, abstractC4308, null, c2609, c26010));
                    this.f72579.m30000(abstractC5698, c16719Mo4076);
                    return new C8837(this, this.f72579);
                } catch (C23653 e) {
                    this.f72579.m30000(abstractC5698, e.mo31425());
                    int i = C15622.f48100[abstractC5699.f17559.ordinal()];
                    if (i == 1) {
                        return new C6720(this, this.f72579);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            return abstractC5699;
                        }
                    } else {
                        if (!(abstractC5699 instanceof C5746)) {
                            return abstractC5699;
                        }
                        C5746 c5748 = (C5746) abstractC5699;
                        this.f72579.m30000(c5748.f59170, c5748.mo4076(EnumC12986.FRAGMENT, null, null, abstractC4308, null, c2609, c26010));
                    }
                    return new C8837(this, this.f72579);
                }
            }
        }
        return abstractC5699;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50320(AbstractC5698 abstractC5698, AbstractC5698 abstractC5699, AbstractC4308 abstractC4308, C1755 c1755, C2609 c2609, boolean z) {
        int i = C15622.f48100[abstractC5699.f17559.ordinal()];
        if (i != 4) {
            if (i == 5) {
                C11391 c11391 = (C11391) abstractC5699.mo7048();
                boolean z2 = true;
                boolean z3 = true;
                for (AbstractC5698 abstractC56910 : c11391.f34081) {
                    AbstractC5698 abstractC5698M50320 = m50320(abstractC5698, abstractC56910, abstractC4308, c1755, c2609, z);
                    z2 &= abstractC5698M50320 == abstractC5698;
                    z3 &= abstractC5698M50320 == abstractC56910;
                }
                if (!z2) {
                    if (!z3) {
                        c11391.f34081 = c11391.f34081.m8246(abstractC5698);
                    }
                    return c11391;
                }
            } else {
                throw new AssertionError();
            }
        } else if (abstractC5698 != abstractC5699) {
            boolean zM50296 = m50296(abstractC5698, abstractC5699, abstractC4308, c1755, c2609, z);
            boolean zM50297 = m50296(abstractC5699, abstractC5698, abstractC4308, c1755, c2609, z);
            if (!zM50296 || !zM50297) {
                if (!zM50296) {
                    if (!zM50297) {
                        return m50319(abstractC5698, abstractC5699);
                    }
                }
            }
            C6319 c6319 = this.f72597;
            if (!c6319.m17516(c6319.m17543(abstractC5698, abstractC4308), c6319.m17543(abstractC5699, abstractC4308))) {
                return m50319(abstractC5698, abstractC5699);
            }
            if ((abstractC5698.mo16084() & 2147483648L) != (abstractC5699.mo16084() & 2147483648L)) {
                return (abstractC5698.mo16084() & 2147483648L) != 0 ? abstractC5699 : abstractC5698;
            }
            if (abstractC5698.mo7048() != abstractC5699.mo7048()) {
                AbstractC19810 abstractC19810 = (AbstractC19810) abstractC5698.f17561;
                AbstractC19810 abstractC19811 = (AbstractC19810) abstractC5699.f17561;
                if (abstractC19810 != abstractC19811) {
                    if (c6319.m17527(abstractC19811, abstractC19810.f17560) == null || (((abstractC5698.f17561.f17563 & 512) != 0 && (abstractC5699.f17561.f17563 & 512) == 0) || !abstractC5698.mo10962(abstractC5699, abstractC19810, c6319, false))) {
                        if (c6319.m17527(abstractC19810, abstractC19811.f17560) == null || (((abstractC5699.f17561.f17563 & 512) != 0 && (512 & abstractC5698.f17561.f17563) == 0) || !abstractC5699.mo10962(abstractC5698, abstractC19811, c6319, false))) {
                        }
                    }
                }
                boolean z4 = (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0;
                boolean z5 = (abstractC5699.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0;
                if (!z4 || z5) {
                    if (!z5 || z4) {
                        return m50319(abstractC5698, abstractC5699);
                    }
                }
            }
        }
        return abstractC5698;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m50296(AbstractC5698 abstractC5698, AbstractC5698 abstractC5699, AbstractC4308 abstractC4308, C1755 c1755, C2609 c2609, boolean z) {
        AbstractC4308 abstractC4308M50331;
        C1386 c1386 = this.f72592;
        c1386.m4869();
        int iMax = Math.max(Math.max(abstractC5698.f17560.mo12933().m8245(), c2609.m8245()), abstractC5699.f17560.mo12933().m8245());
        C12364 c12364 = this.f72579;
        try {
            C12364 c12365 = new C12364(this);
            this.f72579 = c12365;
            c12365.f37061 = c12364.f37061;
            c12365.f37062 = c12364.f37062.mo11112(c2609);
            C6319 c6319 = this.f72597;
            try {
                abstractC4308M50331 = m50331(c1755, abstractC4308, abstractC5699, null, m50299(c6319.m17479(c6319.m17543(abstractC5698, abstractC4308).mo12933()), abstractC5698, iMax, z), null, c1386);
            } catch (C23653 unused) {
                abstractC4308M50331 = null;
            }
            return (abstractC4308M50331 == null || c1386.m4870(EnumC20347.UNCHECKED)) ? false : true;
        } finally {
            this.f72579 = c12364;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m50299(C2609 c2609, AbstractC5698 abstractC5698, int i, boolean z) {
        if ((abstractC5698.mo16084() & 17179869184L) == 0 || !z) {
            return c2609;
        }
        AbstractC4308 abstractC4308M17515 = this.f72597.m17515((AbstractC4308) c2609.last());
        if (abstractC4308M17515 == null) {
            C12171.m29640("Bad varargs = " + c2609.last() + " " + abstractC5698);
            throw null;
        }
        C2609 c2609M8250 = c2609.m8250().f8241.m8246(abstractC4308M17515).m8250();
        while (c2609M8250.m8245() < i) {
            c2609M8250 = c2609M8250.m8242((AbstractC4308) c2609M8250.last());
        }
        return c2609M8250;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50319(AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        if (((abstractC5698.mo16084() | abstractC5699.mo16084()) & 4398046511104L) != 0) {
            return (abstractC5698.mo16084() & 4398046511104L) == 0 ? abstractC5698 : abstractC5699;
        }
        return new C11391(this, abstractC5698, abstractC5699);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50305(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010, AbstractC14016 abstractC14016, AbstractC5698 abstractC5698, boolean z, boolean z2) {
        C5309 c5309 = new C5309();
        c5309.f16557 = z2;
        abstractC14016.getClass();
        Iterator it = abstractC14016.mo20477(abstractC10370, c5309, EnumC1317.RECURSIVE).iterator();
        AbstractC5698 abstractC5698M50304 = abstractC5698;
        while (it.hasNext()) {
            abstractC5698M50304 = m50304(c1755, abstractC4308, c2609, c26010, (AbstractC5698) it.next(), abstractC5698M50304, z);
        }
        return abstractC5698M50304;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50306(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010, boolean z) {
        AbstractC4308 abstractC4309 = abstractC4308.f13890.f17560;
        C2609[] c2609Arr = new C2609[2];
        c2609Arr[0] = C2609.m8239();
        c2609Arr[1] = C2609.m8239();
        EnumC3898 enumC3898 = EnumC3898.f12471;
        C0806 c0806 = new C0806(this, abstractC4309);
        AbstractC5698 abstractC5698 = this.f72611;
        EnumC3898 enumC3898Mo7977 = enumC3898;
        AbstractC5698 abstractC5698M50305 = abstractC5698;
        while (true) {
            boolean zHasNext = c0806.hasNext();
            C6319 c6319 = this.f72597;
            if (zHasNext) {
                AbstractC19810 abstractC19810 = (AbstractC19810) c0806.next();
                C0806 c0807 = c0806;
                abstractC5698M50305 = m50305(c1755, abstractC4308, abstractC10370, c2609, c26010, abstractC19810.mo16064(), abstractC5698M50305, z, true);
                if (abstractC10370 == this.f72594.f18879) {
                    return abstractC5698M50305;
                }
                enumC3898Mo7977 = enumC3898Mo7977 == null ? null : enumC3898Mo7977.mo7977(abstractC19810, this);
                if (enumC3898Mo7977 != null) {
                    Iterator it = c6319.m17510(abstractC19810.f17560).iterator();
                    while (it.hasNext()) {
                        c2609Arr[enumC3898Mo7977.ordinal()] = c6319.m17533(c6319.m17547((AbstractC4308) it.next()), c2609Arr[enumC3898Mo7977.ordinal()]);
                    }
                }
                c0806 = c0807;
            } else {
                if (abstractC5698M50305.f17559.m4396() && (abstractC5698M50305.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                    abstractC5698 = abstractC5698M50305;
                }
                EnumC3898[] enumC3898ArrValues = EnumC3898.values();
                int length = enumC3898ArrValues.length;
                AbstractC5698 abstractC5699 = abstractC5698M50305;
                int i = 0;
                while (i < length) {
                    EnumC3898 enumC3899 = enumC3898ArrValues[i];
                    AbstractC5698 abstractC56910 = abstractC5699;
                    for (AbstractC4308 abstractC43010 : c2609Arr[enumC3899.ordinal()]) {
                        if (abstractC43010.mo12925() && (enumC3899 != EnumC3898.f12469 || (abstractC43010.f13890.mo16084() & 8796093022208L) != 0)) {
                            EnumC3898 enumC38910 = enumC3899;
                            int i2 = i;
                            int i3 = length;
                            AbstractC5698 abstractC5698M50306 = m50305(c1755, abstractC4308, abstractC10370, c2609, c26010, abstractC43010.f13890.mo16064(), abstractC56910, z, true);
                            abstractC56910 = (abstractC5698 != abstractC5698M50306 && abstractC5698.f17559.m4396() && abstractC5698M50306.f17559.m4396() && c6319.m17532(abstractC5698.f17560, abstractC5698M50306.f17560, true)) ? abstractC5698 : abstractC5698M50306;
                            i = i2;
                            enumC3899 = enumC38910;
                            length = i3;
                        }
                    }
                    i++;
                    abstractC5699 = abstractC56910;
                }
                return abstractC5699;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50310(C1755 c1755, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010, boolean z) {
        boolean z2 = false;
        C1755 c1756 = c1755;
        AbstractC5698 abstractC5698M50293 = this.f72611;
        while (true) {
            C1755 c1757 = c1756.f6076;
            Object obj = c1756.f6073;
            if (c1757 != null) {
                boolean z3 = m50291(c1756) ? true : z2;
                C8604 c8604 = (C8604) obj;
                C12171.m29642(c8604.f26292 == null);
                c8604.f26292 = c1755.f6074;
                try {
                    AbstractC5698 abstractC5698M50306 = m50306(c1756, c1756.f6079.f17186.f17560, abstractC10370, c2609, c26010, z);
                    if (abstractC5698M50306.mo15574()) {
                        if (!z3 || abstractC5698M50306.f17559 != EnumC1296.f4571 || abstractC5698M50306.f17561.f17559 != EnumC1296.f4582 || (8 & abstractC5698M50306.mo16084()) != 0) {
                            c8604.f26292 = null;
                            return abstractC5698M50306;
                        }
                        C1239 c1239 = new C1239(abstractC5698M50306, this);
                        c8604.f26292 = null;
                        return c1239;
                    }
                    abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50306);
                    c8604.f26292 = null;
                    C14163 c14163 = c1756.f6079.f17186;
                    c14163.mo16101();
                    z2 = (c14163.f17563 & 8) != 0 ? true : z3;
                    c1756 = c1756.f6076;
                } catch (Throwable th) {
                    c8604.f26292 = null;
                    throw th;
                }
            } else {
                AbstractC5698 abstractC5698M50307 = m50306(c1755, this.f72605.f66458.f17560, abstractC10370, c2609, c26010, z);
                if (abstractC5698M50307.mo15574()) {
                    return abstractC5698M50307;
                }
                AbstractC5698 abstractC5698M50304 = abstractC5698M50293;
                for (AbstractC5698 abstractC5698Mo7177 : c1755.f6075.f4742.m20476(abstractC10370)) {
                    AbstractC5698 abstractC5698 = c1755.f6075.f4742.mo20479(abstractC5698Mo7177).f23673;
                    if (abstractC5698Mo7177.f17559 == EnumC1296.f4571) {
                        if (abstractC5698Mo7177.f17561.f17560 != abstractC5698.f17560) {
                            abstractC5698Mo7177 = abstractC5698Mo7177.mo7177(abstractC5698);
                        }
                        abstractC5698M50304 = m50304(c1755, abstractC5698.f17560, c2609, c26010, !m50328(c1755, abstractC5698.f17560, abstractC5698Mo7177) ? new C5746(this, c1755, abstractC5698.f17560, abstractC5698Mo7177) : abstractC5698Mo7177, abstractC5698M50304, z);
                    }
                }
                if (abstractC5698M50304.mo15574()) {
                    return abstractC5698M50304;
                }
                for (AbstractC5698 abstractC5698Mo7178 : c1755.f6075.f4740.m20476(abstractC10370)) {
                    AbstractC5698 abstractC5699 = c1755.f6075.f4740.mo20479(abstractC5698Mo7178).f23673;
                    if (abstractC5698Mo7178.f17559 == EnumC1296.f4571) {
                        if (abstractC5698Mo7178.f17561.f17560 != abstractC5699.f17560) {
                            abstractC5698Mo7178 = abstractC5698Mo7178.mo7177(abstractC5699);
                        }
                        abstractC5698M50304 = m50304(c1755, abstractC5699.f17560, c2609, c26010, !m50328(c1755, abstractC5699.f17560, abstractC5698Mo7178) ? new C5746(this, c1755, abstractC5699.f17560, abstractC5698Mo7178) : abstractC5698Mo7178, abstractC5698M50304, z);
                    }
                }
                return abstractC5698M50304;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50311(C1755 c1755, AbstractC10370 abstractC10370, InterfaceC20996 interfaceC20996) {
        try {
            C14163 c14163M45829 = this.f72574.m45829(c1755.f6075.f4739, abstractC10370);
            return m50330(c1755, (AbstractC19810) c14163M45829, false) ? c14163M45829 : new C5746(this, c1755, null, c14163M45829);
        } catch (C21325 e) {
            return new C13506(this, e);
        } catch (C20515 unused) {
            AbstractC5698 abstractC5698Mo16565 = interfaceC20996.mo16565(c1755, abstractC10370);
            return abstractC5698Mo16565 != null ? abstractC5698Mo16565 : this.f72603;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50309(C1755 c1755, AbstractC10370 abstractC10370) {
        C0052 c0052 = c1755.f6075.f4739;
        final C20661 c20661 = this.f72605;
        C7814 c7814M47272 = c20661.m47272(c0052, abstractC10370);
        if (this.f72604 && c1755.f6074.m14709(EnumC18550.f57491)) {
            AbstractC5144 abstractC5144 = ((C10643) c1755.f6074).f32021;
            if (abstractC5144.m14709(EnumC18550.f57581) && C7260.m19462(abstractC5144) == this.f72594.f18835 && C7260.m19452(((C6262) abstractC5144).f19397) == abstractC10370) {
                c7814M47272.mo16101();
                if (c7814M47272.f24145.m20480()) {
                    return m50284(c1755, abstractC10370, new Function() { // from class: l.ܰ۟֨
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo22274andThen(Function function) {
                            return C20696.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return c20661.m47273((AbstractC10370) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C20696.$default$compose(this, function);
                        }
                    }, new BiFunction() { // from class: l.۟۟֨
                        public /* synthetic */ BiFunction andThen(Function function) {
                            return C17167.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return c20661.m47266((C0052) obj, (AbstractC10370) obj2);
                        }
                    }, new C23134(4), c7814M47272);
                }
            }
        }
        return c7814M47272;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 m50284(C1755 c1755, AbstractC10370 abstractC10370, Function function, BiFunction biFunction, Predicate predicate, AbstractC5698 abstractC5698) {
        AbstractC5698 abstractC5699;
        for (AbstractC5698 abstractC56910 : (Iterable) function.apply(abstractC10370)) {
            if (predicate.test(abstractC56910)) {
                C0052 c0052 = c1755.f6075.f4739;
                C7814 c7814M16089 = abstractC56910.m16089();
                if (c0052 == c7814M16089.f24147 || c0052.f913.containsKey(c7814M16089.f24143)) {
                    return new C5746(this, c1755, null, abstractC56910);
                }
                return new C19421(this, c1755, false, abstractC56910);
            }
        }
        C20661 c20661 = this.f72605;
        HashSet<C0052> hashSet = new HashSet(c20661.m47257());
        hashSet.add(c20661.f66447);
        hashSet.remove(c1755.f6075.f4739);
        for (C0052 c0053 : hashSet) {
            if (c0053.f927 == null) {
                if (c0053.f914 == null) {
                    this.f72580.m17171(c0053);
                }
                if (c0053.f17559 != EnumC1296.f4581 && (abstractC5699 = (AbstractC5698) biFunction.apply(c0053, abstractC10370)) != null && predicate.test(abstractC5699)) {
                    C0052 c0054 = c1755.f6075.f4739;
                    C7814 c7814M160810 = abstractC5699.m16089();
                    if (c0054 == c7814M160810.f24147 || c0054.f913.containsKey(c7814M160810.f24143)) {
                        return new C5746(this, c1755, null, abstractC5699);
                    }
                    return new C19421(this, c1755, false, abstractC5699);
                }
            }
        }
        return abstractC5698;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50332(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(abstractC10370)) {
            if (abstractC5698.f17559 == EnumC1296.f4582) {
                return m50328(c1755, abstractC4308, abstractC5698) ? abstractC5698 : new C5746(this, c1755, abstractC4308, abstractC5698);
            }
        }
        return this.f72603;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50333(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        AbstractC4308 abstractC4309 = abstractC19810.f17560;
        C6319 c6319 = this.f72597;
        AbstractC4308 abstractC4308M17562 = c6319.m17562(abstractC4309);
        AbstractC5698 abstractC5698M50293 = this.f72603;
        if (abstractC4308M17562 != null && abstractC4308M17562.m12913(EnumC9454.CLASS)) {
            abstractC5698M50293 = m50293(abstractC5698M50293, m50334(c1755, abstractC4308, abstractC10370, abstractC4308M17562.f13890));
        }
        for (C2609 c2609M17510 = c6319.m17510(abstractC19810.f17560); abstractC5698M50293.f17559 != EnumC1296.f4566 && c2609M17510.m8249(); c2609M17510 = c2609M17510.f8241) {
            AbstractC5698 abstractC5698M50334 = m50334(c1755, abstractC4308, abstractC10370, ((AbstractC4308) c2609M17510.f8240).f13890);
            if (!abstractC5698M50293.f17559.m4393() && !abstractC5698M50334.f17559.m4393() && abstractC5698M50334.f17561 != abstractC5698M50293.f17561) {
                abstractC5698M50293 = new C11391(this, abstractC5698M50293, abstractC5698M50334);
            } else {
                abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50334);
            }
        }
        return abstractC5698M50293;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50334(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        AbstractC5698 abstractC5698M50332 = m50332(c1755, abstractC4308, abstractC10370, abstractC19810);
        return abstractC5698M50332 != this.f72603 ? abstractC5698M50332 : m50333(c1755, abstractC4308, abstractC10370, abstractC19810);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50308(C1755 c1755, AbstractC7667 abstractC7667, AbstractC10370 abstractC10370, InterfaceC20996 interfaceC20996) {
        Iterator it = abstractC7667.m20476(abstractC10370).iterator();
        AbstractC5698 abstractC5698M50293 = this.f72603;
        while (it.hasNext()) {
            AbstractC5698 abstractC5698M50311 = m50311(c1755, ((AbstractC5698) it.next()).mo16083(), interfaceC20996);
            EnumC1296 enumC1296 = abstractC5698M50293.f17559;
            EnumC1296 enumC1297 = EnumC1296.f4582;
            if (enumC1296 == enumC1297 && abstractC5698M50311.f17559 == enumC1297 && abstractC5698M50293 != abstractC5698M50311) {
                return new C11391(this, abstractC5698M50293, abstractC5698M50311);
            }
            abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50311);
        }
        return abstractC5698M50293;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:133:0x023a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0242  */
    /* JADX WARN: Code duplicated, block: B:136:0x0247  */
    /* JADX WARN: Code duplicated, block: B:139:0x0257  */
    /* JADX WARN: Code duplicated, block: B:179:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0258 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50322(C7673 c7673, C1755 c1755, AbstractC10370 abstractC10370, C15406 c15406) {
        long j;
        AbstractC5698 abstractC5698M50293;
        AbstractC5698 abstractC5698M50309;
        AbstractC5698 c1239;
        C5557 c5557;
        C14163 c14163;
        boolean zM36457 = c15406.m36457(C15406.f47181);
        AbstractC5698 abstractC5698M50308 = this.f72603;
        if (zM36457) {
            AbstractC5698 c5746 = this.f72614;
            boolean z = false;
            C1755 c1756 = c1755;
            while (true) {
                if (c1756.f6076 != null) {
                    Iterator it = ((C8604) c1756.f6073).f26285.m20476(abstractC10370).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                            j = 0;
                            if (abstractC5698.f17559 == EnumC1296.f4567 && (abstractC5698.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                if (z) {
                                    c5746 = new C1239(abstractC5698, this);
                                } else {
                                    abstractC5698M50309 = abstractC5698;
                                }
                                abstractC5698M50309 = c5746;
                                break;
                            }
                        } else {
                            j = 0;
                            abstractC5698M50309 = null;
                        }
                        if (m50291(c1756)) {
                            z = true;
                        }
                        if (abstractC5698M50309 == null) {
                            C14163 c14164 = c1756.f6079.f17186;
                            abstractC5698M50309 = m50307(c1756, c14164.f17560, abstractC10370, c14164);
                        }
                        if (abstractC5698M50309.mo15574()) {
                            if (!z || abstractC5698M50309.f17559 != EnumC1296.f4567 || abstractC5698M50309.f17561.f17559 != EnumC1296.f4582 || (abstractC5698M50309.mo16084() & 8) != j) {
                                break;
                            }
                            c5746 = new C1239(abstractC5698M50309, this);
                            abstractC5698M50309 = c5746;
                            break;
                            abstractC5698M50308 = abstractC5698M50309;
                            return m50285(c7673, abstractC5698M50308, abstractC10370);
                        }
                        c5746 = m50293(c5746, abstractC5698M50309);
                        C14163 c14165 = c1756.f6079.f17186;
                        c14165.mo16101();
                        if ((c14165.f17563 & 8) != j) {
                            z = true;
                        }
                        c1756 = c1756.f6076;
                    }
                } else {
                    C14163 c14166 = this.f72605.f66458;
                    AbstractC5698 abstractC5698M50307 = m50307(c1755, c14166.f17560, abstractC10370, c14166);
                    if (!abstractC5698M50307.mo15574()) {
                        if (!c5746.mo15574()) {
                            C1323 c1323 = c1755.f6075;
                            int i = 2;
                            AbstractC7667[] abstractC7667Arr = {c1323.f4742, c1323.f4740};
                            int i2 = 0;
                            AbstractC5698 abstractC5699 = null;
                            while (true) {
                                if (i2 < i) {
                                    AbstractC7667 abstractC7667 = abstractC7667Arr[i2];
                                    Iterator it2 = abstractC7667.m20476(abstractC10370).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            AbstractC5698 abstractC56910 = (AbstractC5698) it2.next();
                                            EnumC1296 enumC1296 = abstractC56910.f17559;
                                            EnumC1296 enumC1297 = EnumC1296.f4567;
                                            if (enumC1296 == enumC1297) {
                                                if (!c5746.f17559.m4393() && abstractC56910.f17561 != c5746.f17561) {
                                                    abstractC5698M50309 = new C11391(this, c5746, abstractC56910);
                                                } else if (!c5746.f17559.m4390(enumC1297)) {
                                                    AbstractC5698 abstractC56911 = abstractC7667.mo20479(abstractC56910).f23673;
                                                    if (m50328(c1755, abstractC56911.f17560, abstractC56910)) {
                                                        abstractC5699 = abstractC56911;
                                                        c5746 = abstractC56910;
                                                    } else {
                                                        abstractC5699 = abstractC56911;
                                                        c5746 = new C5746(this, c1755, abstractC56911.f17560, abstractC56910);
                                                    }
                                                }
                                            }
                                        } else if (!c5746.mo15574()) {
                                            i2++;
                                            i = 2;
                                        }
                                        j = 0;
                                        break;
                                    }
                                }
                                AbstractC5698 abstractC56912 = abstractC5699;
                                abstractC5698M50309 = c5746;
                                if (abstractC5698M50309.f17559 == EnumC1296.f4567 && abstractC5698M50309.f17561.f17560 != abstractC56912.f17560) {
                                    abstractC5698M50309 = abstractC5698M50309.mo7177(abstractC56912);
                                }
                                j = 0;
                                break;
                            }
                        }
                    } else {
                        c5746 = abstractC5698M50307;
                    }
                    j = 0;
                    abstractC5698M50309 = c5746;
                    break;
                }
            }
            if (abstractC5698M50309.mo15574()) {
                abstractC5698M50308 = abstractC5698M50309;
            } else {
                abstractC5698M50293 = m50293(abstractC5698M50308, abstractC5698M50309);
            }
            return m50285(c7673, abstractC5698M50308, abstractC10370);
        }
        j = 0;
        abstractC5698M50293 = abstractC5698M50308;
        if (c15406.m36457(C15406.f47189)) {
            if (abstractC10370 != this.f72594.f18867) {
                boolean z2 = false;
                C1755 c1757 = c1755;
                AbstractC5698 abstractC5698M50294 = abstractC5698M50308;
                while (true) {
                    if (c1757.f6076 != null) {
                        Iterator it3 = ((C8604) c1757.f6073).f26285.m20476(abstractC10370).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                c1239 = abstractC5698M50308;
                                break;
                            }
                            c1239 = (AbstractC5698) it3.next();
                            EnumC1296 enumC1298 = c1239.f17559;
                            EnumC1296 enumC1299 = EnumC1296.f4582;
                            if (enumC1298 == enumC1299) {
                                if (!c1239.f17560.m12913(EnumC9454.TYPEVAR) || (!z2 && (!m50291(c1757) || c1239.f17561.f17559 != enumC1299))) {
                                    break;
                                    break;
                                    break;
                                }
                                c1239 = new C1239(c1239, this);
                                break;
                            }
                        }
                        if (m50291(c1757)) {
                            z2 = true;
                        }
                        C14163 c14167 = c1757.f6079.f17186;
                        AbstractC5698 abstractC5698M50332 = m50332(c1757, c14167.f17560, abstractC10370, c14167);
                        if (c1239 != abstractC5698M50308 && (c1755.f6078 || abstractC5698M50332 == abstractC5698M50308 || (c1239.f17559 == EnumC1296.f4582 && c1239.mo15574() && c1239.f17561.f17559 == EnumC1296.f4571))) {
                            abstractC5698M50308 = c1239;
                            break;
                        }
                        if (abstractC5698M50332 == abstractC5698M50308) {
                            C14163 c14168 = c1757.f6079.f17186;
                            abstractC5698M50332 = m50333(c1757, c14168.f17560, abstractC10370, c14168);
                        }
                        if (z2 && abstractC5698M50332.f17559 == EnumC1296.f4582) {
                            AbstractC4308 abstractC4308 = abstractC5698M50332.f17560;
                            EnumC9454 enumC9454 = EnumC9454.CLASS;
                            if (abstractC4308.m12913(enumC9454) && abstractC5698M50332.f17560.mo4958().m12913(enumC9454) && c1757.f6079.f17186.f17560.mo12917() && abstractC5698M50332.f17560.mo4958().mo12917()) {
                                abstractC5698M50308 = new C1239(abstractC5698M50332, this);
                                break;
                            }
                            if (abstractC5698M50332.mo15574()) {
                                abstractC5698M50308 = abstractC5698M50332;
                                break;
                            }
                            abstractC5698M50294 = m50293(abstractC5698M50294, abstractC5698M50332);
                            if (c1757.f6078) {
                                c5557 = (C5557) c1757.f6074;
                            } else {
                                c5557 = c1757.f6079;
                            }
                            c14163 = c5557.f17186;
                            c14163.mo16101();
                            if ((c14163.f17563 & 8) != j) {
                                z2 = true;
                            }
                            c1757 = c1757.f6076;
                        } else {
                            if (abstractC5698M50332.mo15574()) {
                                abstractC5698M50308 = abstractC5698M50332;
                                break;
                            }
                            abstractC5698M50294 = m50293(abstractC5698M50294, abstractC5698M50332);
                            if (c1757.f6078) {
                                c5557 = (C5557) c1757.f6074;
                            } else {
                                c5557 = c1757.f6079;
                            }
                            c14163 = c5557.f17186;
                            c14163.mo16101();
                            if ((c14163.f17563 & 8) != j) {
                                z2 = true;
                            }
                            c1757 = c1757.f6076;
                        }
                    } else {
                        if (!c1755.f6074.m14709(EnumC18550.f57491)) {
                            abstractC5698M50308 = m50308(c1755, c1755.f6075.f4742, abstractC10370, this.f72578);
                            if (!abstractC5698M50308.mo15574()) {
                                AbstractC5698 abstractC5698M50295 = m50293(abstractC5698M50294, abstractC5698M50308);
                                AbstractC14016 abstractC14016 = c1755.f6075.f4737;
                                C5905 c5905 = this.f72582;
                                abstractC5698M50308 = m50308(c1755, abstractC14016, abstractC10370, c5905);
                                if (!abstractC5698M50308.mo15574()) {
                                    AbstractC5698 abstractC5698M50296 = m50293(abstractC5698M50295, abstractC5698M50308);
                                    C7814 c7814 = c1755.f6075.f4746;
                                    c7814.mo16101();
                                    abstractC5698M50308 = m50308(c1755, c7814.f24145, abstractC10370, c5905);
                                    if (!abstractC5698M50308.mo15574()) {
                                        AbstractC5698 abstractC5698M50297 = m50293(abstractC5698M50296, abstractC5698M50308);
                                        abstractC5698M50308 = m50308(c1755, c1755.f6075.f4740, abstractC10370, this.f72591);
                                        if (!abstractC5698M50308.mo15574()) {
                                            abstractC5698M50308 = m50293(abstractC5698M50297, abstractC5698M50308);
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
                        abstractC5698M50308 = abstractC5698M50294;
                        break;
                    }
                }
            }
            if (!abstractC5698M50308.mo15574()) {
                abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50308);
            }
            return m50285(c7673, abstractC5698M50308, abstractC10370);
        }
        abstractC5698M50309 = abstractC5698M50293;
        if (c15406.m36457(C15406.f47190)) {
            abstractC5698M50309 = m50309(c1755, abstractC10370);
        }
        abstractC5698M50308 = abstractC5698M50309;
        return m50285(c7673, abstractC5698M50308, abstractC10370);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50321(C6262 c6262, C1755 c1755, AbstractC19810 abstractC19810, AbstractC10370 abstractC10370, C15406 c15406) {
        AbstractC5698 abstractC5698M50309;
        AbstractC10370 abstractC10370M45553 = AbstractC19810.m45553(abstractC10370, abstractC19810);
        boolean zM36457 = c15406.m36457(C15406.f47189);
        AbstractC5698 abstractC5698M50293 = this.f72603;
        if (zM36457) {
            abstractC5698M50309 = m50311(c1755, abstractC10370M45553, (!this.f72604 || c15406.m36457(C15406.f47190) || abstractC19810.mo15574() || ((C8604) c1755.f6073).f26283.f23066) ? this.f72582 : this.f72573);
            if (abstractC5698M50309.mo15574()) {
                if (abstractC10370 != abstractC5698M50309.f17562) {
                }
            } else {
                abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50309);
            }
            if (c15406.m36457(C15406.f47190)) {
                abstractC5698M50309 = m50309(c1755, abstractC10370M45553);
            } else {
                abstractC5698M50309 = abstractC5698M50293;
            }
        } else if (c15406.m36457(C15406.f47190)) {
            abstractC5698M50309 = m50309(c1755, abstractC10370M45553);
        } else {
            abstractC5698M50309 = abstractC5698M50293;
        }
        return m50285(c6262, abstractC5698M50309, abstractC10370);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50315(AbstractC5144 abstractC5144, C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C15406 c15406) {
        AbstractC5698 abstractC5698M50334;
        boolean zM36457 = c15406.m36457(C15406.f47181);
        AbstractC5698 abstractC5698M50293 = this.f72603;
        if (zM36457) {
            abstractC5698M50334 = m50307(c1755, abstractC4308, abstractC10370, abstractC4308.f13890);
            if (!abstractC5698M50334.mo15574()) {
                abstractC5698M50293 = m50293(abstractC5698M50293, abstractC5698M50334);
                if (c15406.m36457(C15406.f47189)) {
                    abstractC5698M50334 = m50334(c1755, abstractC4308, abstractC10370, abstractC4308.f13890);
                    if (!abstractC5698M50334.mo15574()) {
                        abstractC5698M50334 = m50293(abstractC5698M50293, abstractC5698M50334);
                    }
                } else {
                    abstractC5698M50334 = abstractC5698M50293;
                }
            }
        } else if (c15406.m36457(C15406.f47189)) {
            abstractC5698M50334 = m50334(c1755, abstractC4308, abstractC10370, abstractC4308.f13890);
            if (!abstractC5698M50334.mo15574()) {
                abstractC5698M50334 = m50293(abstractC5698M50293, abstractC5698M50334);
            }
        } else {
            abstractC5698M50334 = abstractC5698M50293;
        }
        return m50285(abstractC5144, abstractC5698M50334, abstractC10370);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m50285(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC10370 abstractC10370) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4582 || enumC1296 == EnumC1296.f4573) {
            boolean z = this.f72600;
            C6136 c6136 = this.f72594;
            if (z && abstractC10370.equals(c6136.f18888)) {
                return new C10954(this, c6136.f18888);
            }
            AbstractC10370 abstractC10371 = c6136.f18799;
            AbstractC10370 abstractC10372 = c6136.f18799;
            if (abstractC10370.equals(abstractC10371)) {
                if (this.f72602) {
                    return new C10954(this, abstractC10372);
                }
                if (interfaceC3109 != null) {
                    C11076 c11076 = C14001.f42334;
                    this.f72598.m7285(interfaceC3109, new C11076("compiler", "illegal.ref.to.restricted.type", abstractC10372));
                }
            }
        }
        return abstractC5698;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50317(AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5699, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, boolean z, C2609 c2609, C2609 c26010, InterfaceC0369 interfaceC0369) {
        C16719 c16719Mo4076;
        if (!abstractC5698.f17559.m4393()) {
            return abstractC5698;
        }
        AbstractC5473 abstractC5473 = (AbstractC5473) abstractC5698.mo7048();
        AbstractC5698 abstractC5698Mo15573 = abstractC5473.mo15573(abstractC10370, z ? abstractC4308.f13890 : this.f72605.f66475);
        C2609 c2609Mo1822 = interfaceC0369.mo1822(abstractC5698Mo15573, c2609);
        if (interfaceC0369.mo1823(abstractC4308, c2609Mo1822, c26010) && (c16719Mo4076 = abstractC5473.mo4076(EnumC12986.ERROR, interfaceC3109, abstractC5699, abstractC4308, abstractC10370, c2609Mo1822, c26010)) != null) {
            c16719Mo4076.m39351(EnumC20043.RESOLVE_ERROR);
            this.f72598.mo7277(c16719Mo4076);
        }
        return abstractC5698Mo15573;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50316(AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5699, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, boolean z) {
        return m50317(abstractC5698, interfaceC3109, abstractC5699, abstractC4308, abstractC10370, z, C2609.m8239(), (C2609) null, this.f72609);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50326(AbstractC12612 abstractC12612, AbstractC5698 abstractC5698) {
        if ((abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (abstractC5698.mo16084() & 8796093022208L) != 0) {
            return;
        }
        EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698);
        AbstractC5698 abstractC5698M16072 = abstractC5698.m16072();
        C12281 c12281 = C6241.f19132;
        this.f72598.m7273(abstractC12612, new C12281("compiler", "abstract.cant.be.accessed.directly", enumC8352M49076, abstractC5698, abstractC5698M16072));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50313(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        return m50303(c1755, interfaceC3109, abstractC5698, new C12364(this), new C17034(this, abstractC10370, abstractC4308, c2609, c26010));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50318(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        AbstractC14016 abstractC14016 = this.f72612;
        Iterator it = abstractC14016.m20476(abstractC10370).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C6319 c6319 = this.f72597;
            if (zHasNext) {
                AbstractC5698 abstractC5699 = (AbstractC5698) it.next();
                if (c6319.m17550(abstractC4308, abstractC5699.f17560) && abstractC5698.f17561 == abstractC5699.f17561) {
                    return abstractC5699;
                }
            } else {
                AbstractC4308 abstractC4308Mo12923 = abstractC5698.f17560.mo12923();
                C20661 c20661 = this.f72605;
                if (!c6319.m17550(abstractC4308Mo12923, c20661.f66526) && !c6319.m17550(abstractC4308Mo12923, abstractC4308.mo12923())) {
                    abstractC4308 = new C10658(abstractC4308.mo12933(), abstractC4308Mo12923, abstractC4308.mo12930(), c20661.f66481);
                }
                C14211 c14211 = new C14211((abstractC5698.mo16084() & 15) | 137438954496L, abstractC5698.f17562, abstractC4308, abstractC5698.f17561, abstractC5698);
                if (!abstractC4308.mo12948()) {
                    abstractC14016.mo26382(c14211);
                }
                return c14211;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m50300(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        C12364 c12364 = new C12364(this);
        c12364.f37060 = true;
        AbstractC5698 abstractC5698M50303 = m50303(c1755, interfaceC3109, abstractC4308.f13890, c12364, new C17034(this, abstractC10370, abstractC4308, c2609, c26010));
        if (abstractC5698M50303.f17559 == EnumC1296.f4571) {
            return (C3581) abstractC5698M50303;
        }
        C11576 c11576 = C11886.f35440;
        throw new C23570(this.f72607.m16617(new C11576("compiler", "fatal.err.cant.locate.meth", abstractC10370)).toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50312(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010) {
        return m50303(c1755, interfaceC3109, abstractC4308.f13890, new C12364(this), new C23384(this, this.f72594.f18879, abstractC4308, c2609, c26010, interfaceC3109));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m50288(C22406 c22406, C19110 c19110, C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010, boolean z) {
        AbstractC5698 abstractC5698M50282 = c22406.m50282(c1755, abstractC4308, c2609, c26010, z);
        C15240 c15240 = c22406.f72599;
        AbstractC5698 abstractC5698 = ((C8604) c1755.f6073).f26285.f23673;
        c15240.getClass();
        c15240.m36116(new C18064(c19110), abstractC5698, abstractC5698M50282);
        c15240.m36127(c19110, ((C8604) c1755.f6073).f26285.f23673, abstractC5698M50282);
        return abstractC5698M50282;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 m50282(C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010, boolean z) {
        C2609 c2609M8239;
        AbstractC14016 abstractC14016Mo16064 = (abstractC4308.f13890.m16070() ? this.f72605.f66526.f13890 : abstractC4308.f13890).mo16064();
        C6136 c6136 = this.f72594;
        AbstractC5698 abstractC5698M50304 = this.f72611;
        for (AbstractC5698 abstractC5698 : abstractC14016Mo16064.m20476(c6136.f18879)) {
            if (abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                if (abstractC5698.f17560.m12913(EnumC9454.FORALL)) {
                    c2609M8239 = ((C10077) abstractC5698.f17560).f30362;
                } else {
                    c2609M8239 = C2609.m8239();
                }
                C2609 c2609Mo12938 = abstractC4308.f13890.f17560.mo12938();
                c2609Mo12938.getClass();
                abstractC5698M50304 = m50304(c1755, abstractC4308, c2609, c26010, new C20563(abstractC5698.mo16084(), c6136.f18879, new C10077(this.f72597.m17542(abstractC5698.f17560.mo12945(), abstractC4308), c2609M8239.m8248(c2609Mo12938)), abstractC4308.f13890, abstractC5698), abstractC5698M50304, z);
            }
        }
        return abstractC5698M50304;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9001 m50323(AbstractC4308 abstractC4308, EnumC16761 enumC16761, C9232 c9232, C2609 c2609, C2609 c26010, AbstractC10370 abstractC10370) {
        if (!abstractC10370.equals(this.f72594.f18879)) {
            return new C3192(this, c9232, abstractC10370, abstractC4308, c2609, c26010, enumC16761);
        }
        if (abstractC4308.m12913(EnumC9454.ARRAY)) {
            return new C22679(this, c9232, abstractC4308, c2609, c26010, enumC16761);
        }
        return new C17303(this, c9232, abstractC4308, c2609, c26010, enumC16761);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23069 m50325(C1755 c1755, C9232 c9232, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010, AbstractC4308 abstractC4309, AbstractC9980 abstractC9980, C0384 c0384, AbstractC9707 abstractC9707) {
        C19585 c19585;
        C19585 c19586;
        C19585 c19585Mo22279;
        EnumC16761 enumC16761;
        AbstractC9001 abstractC9001M50323 = m50323(abstractC4308, EnumC16761.f51455, c9232, c2609, c26010, abstractC10370);
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        C1755 c1755M5877 = c1755.m5877(abstractC5144, c8604.m22358(c8604.f26285));
        C12364 c12364 = new C12364(this);
        c12364.f37062 = abstractC9980;
        AbstractC5144 abstractC5145 = c1755.f6074;
        abstractC5145.getClass();
        AbstractC5698 abstractC5698M50303 = m50303(c1755M5877, abstractC5145, abstractC4308.f13890, c12364, abstractC9001M50323);
        C19585 c19587 = new C19585(abstractC5698M50303, c12364);
        boolean z = this.f72581;
        if (z) {
            m50290(c9232, c12364, abstractC5698M50303, true);
        }
        C1755 c1755M5878 = c1755.m5877(c1755.f6074, c8604.m22358(c8604.f26285));
        AbstractC9001 abstractC9001Mo9814 = abstractC9001M50323.mo9814(c0384);
        if (abstractC9001Mo9814 == null) {
            c19585 = c19587;
            c19586 = this.f72595;
        } else {
            C12364 c12365 = new C12364(this);
            c12365.f37062 = abstractC9980;
            AbstractC5144 abstractC5146 = c1755.f6074;
            abstractC5146.getClass();
            c19585 = c19587;
            AbstractC5698 abstractC5698M50304 = m50303(c1755M5878, abstractC5146, abstractC4308.f13890, c12365, abstractC9001Mo9814);
            c19586 = new C19585(abstractC5698M50304, c12365);
            if (z) {
                m50290(c9232, c12365, abstractC5698M50304, false);
            }
        }
        if (c19586 != abstractC9707.f29391.f72595) {
            c19585Mo22279 = abstractC9707.mo22280(c19585, c19586);
        } else {
            c19585Mo22279 = abstractC9707.mo22279(c19585);
        }
        AbstractC5698 abstractC5698 = c19585Mo22279.f63278;
        if (c19585Mo22279 == c19586) {
            abstractC9001M50323 = abstractC9001Mo9814;
        }
        C23069 c23069 = new C23069(abstractC5698, abstractC9001M50323);
        if (c19585Mo22279 == c19586) {
            enumC16761 = ((C8604) c1755M5878.f6073).f26288;
        } else {
            enumC16761 = ((C8604) c1755M5877.f6073).f26288;
        }
        c8604.f26288 = enumC16761;
        if (!abstractC5698.f17559.m4393()) {
            C3581 c3581 = (C3581) abstractC5698;
            if ((c3581.f17563 & 70368744177664L) != 0) {
                c8604.f26288 = EnumC16761.f51454;
                return new C23069(m50318(c3581, abstractC4309), abstractC9001M50323);
            }
        }
        return c23069;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50290(C9232 c9232, C12364 c12364, AbstractC5698 abstractC5698, boolean z) {
        C5931 c5931;
        C16719 c16719M16617;
        C18837 c18837 = new C18837();
        Iterator it = c12364.f37058.iterator();
        char c = 0;
        int i = -1;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c5931 = this.f72607;
            if (!zHasNext) {
                break;
            }
            C13069 c13069 = (C13069) it.next();
            EnumC16761 enumC16761 = c12364.f37061;
            EnumC16761 enumC16762 = c13069.f39141;
            AbstractC5698 abstractC5699 = c13069.f39142;
            if (enumC16761 == enumC16762 && c13069.m31667()) {
                if (abstractC5699.f17560.m12913(EnumC9454.FORALL)) {
                    AbstractC4308 abstractC4308 = c13069.f39140;
                    C11576 c11576 = C11886.f35440;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC4308;
                    c16719M16617 = c5931.m16617(new C11576("compiler", "partial.inst.sig", objArr));
                } else {
                    c16719M16617 = null;
                }
                c18837.m43511(c5931.m16622(c16719M16617 == null ? "applicable.method.found.2" : "applicable.method.found.3", Integer.valueOf(i2), abstractC5699.mo15572() ? C11886.f35511 : C11886.f35454, abstractC5699, c16719M16617));
                if (abstractC5699 == abstractC5698) {
                    i = i2;
                }
                i2++;
            }
            c = 0;
        }
        C22364 c22364 = this.f72598;
        c22364.mo7277(new C22864(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c22364.m7266(), c9232, c5931.m16623("method.ref.search.results.multi", z ? C11886.f35491 : C11886.f35514, c9232.toString(), Integer.valueOf(i))), c18837.m43517()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50303(C1755 c1755, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, C12364 c12364, AbstractC1075 abstractC1075) {
        EnumC1296 enumC1296;
        C12364 c12365 = this.f72579;
        try {
            AbstractC5698 abstractC5699 = this.f72611;
            this.f72579 = c12364;
            for (EnumC16761 enumC16761 : this.f72608) {
                if (enumC16761.ordinal() > abstractC1075.f3937.ordinal() || !abstractC5699.f17559.m4393() || (enumC1296 = abstractC5699.f17559) == EnumC1296.f4566 || enumC1296 == EnumC1296.f4576) {
                    break;
                    break;
                    break;
                    break;
                }
                C12364 c12366 = this.f72579;
                EnumC16761 enumC16762 = c12366.f37061;
                c12366.f37061 = enumC16761;
                AbstractC5698 abstractC5698Mo3659 = abstractC1075.mo3659(c1755, enumC16761);
                abstractC1075.mo3660(interfaceC3109, abstractC5698Mo3659);
                AbstractC5698 abstractC5698Mo27547 = enumC16761.mo27547(abstractC5699, abstractC5698Mo3659);
                C8604 c8604 = (C8604) c1755.f6073;
                if (abstractC5699 == abstractC5698Mo27547) {
                    enumC16761 = enumC16762;
                }
                c8604.f26288 = enumC16761;
                abstractC5699 = abstractC5698Mo27547;
            }
            return abstractC1075.mo3658(c1755, interfaceC3109, abstractC5698, abstractC5699);
        } finally {
            this.f72579 = c12365;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50314(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC19810 abstractC19810, AbstractC10370 abstractC10370) {
        AbstractC5698 abstractC5698Mo20478;
        boolean z = false;
        for (C1755 c1756 = c1755; c1756.f6076 != null; c1756 = c1756.f6076) {
            if (m50291(c1756)) {
                z = true;
            }
            if (c1756.f6079.f17186 == abstractC19810 && (abstractC5698Mo20478 = ((C8604) c1756.f6073).f26285.mo20478(abstractC10370, (Predicate) null)) != null) {
                AbstractC5698 c1239 = z ? new C1239(abstractC5698Mo20478, this) : abstractC5698Mo20478;
                AbstractC4308 abstractC4308 = c1755.f6079.f17186.f17560;
                return m50316(c1239, interfaceC3109, (AbstractC5698) abstractC4308.f13890, abstractC4308, abstractC10370, true);
            }
            C14163 c14163 = c1756.f6079.f17186;
            c14163.mo16101();
            if ((c14163.f17563 & 8) != 0) {
                z = true;
            }
        }
        boolean zM16070 = abstractC19810.m16070();
        C20661 c20661 = this.f72605;
        C22364 c22364 = this.f72598;
        if (zM16070) {
            C6136 c6136 = this.f72594;
            if (abstractC10370 == c6136.f18898 && !m50291(c1755)) {
                C14163 c14164 = c1755.f6079.f17186;
                C6319 c6319 = this.f72597;
                if (c6319.m17509(abstractC19810, (AbstractC19810) c14164)) {
                    AbstractC4308 abstractC4309 = c1755.f6079.f16086;
                    C18837 c18837 = new C18837();
                    for (AbstractC4308 abstractC43010 : c6319.m17510(abstractC4309)) {
                        boolean z2 = true;
                        for (AbstractC4308 abstractC43011 : c6319.m17565(abstractC4309)) {
                            if (abstractC43010 != abstractC43011 && !abstractC43011.m12913(EnumC9454.ERROR) && c6319.m17546(abstractC43011, abstractC43010, false)) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            c18837.m43511(abstractC43010);
                        }
                    }
                    for (AbstractC4308 abstractC43012 : c18837.m43517()) {
                        if (abstractC43012.f13890 == abstractC19810) {
                            ((C8604) c1755.f6073).f26290 = abstractC43012;
                            return new C12048(0L, c6136.f18898, c6319.m17527(abstractC19810, c1755.f6079.f16086), c1755.f6079.f17186);
                        }
                    }
                    for (AbstractC4308 abstractC43013 : c6319.m17565(c1755.f6079.f16086)) {
                        if (abstractC43013.f13890.mo16080((AbstractC5698) abstractC19810, c6319) && abstractC43013.f13890 != abstractC19810) {
                            C11576 c11576 = C11886.f35440;
                            C11576 c11577 = new C11576("compiler", "redundant.supertype", abstractC19810, abstractC43013);
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(interfaceC3109, new C12281("compiler", "illegal.default.super.call", abstractC19810, c11577));
                            return c20661.f66462;
                        }
                    }
                    C12171.m29636();
                    throw null;
                }
            }
        }
        C12281 c12282 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "not.encl.class", abstractC19810));
        return c20661.f66462;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50327(C1755 c1755, AbstractC4308 abstractC4308) {
        AbstractC5698 abstractC5698M50283;
        EnumC9454 enumC9454 = EnumC9454.CLASS;
        return abstractC4308.m12913(enumC9454) && abstractC4308.mo4958().m12913(enumC9454) && ((abstractC5698M50283 = m50283(c1755, (AbstractC5698) abstractC4308.f13890, false)) == null || abstractC5698M50283.f17559.m4393());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m50283(C1755 c1755, AbstractC5698 abstractC5698, boolean z) {
        AbstractC5698 abstractC5698Mo20478;
        AbstractC10370 abstractC10370 = this.f72594.f18886;
        if (z) {
            c1755 = c1755.f6076;
        }
        if (c1755 != null) {
            boolean z2 = false;
            while (c1755 != null && c1755.f6076 != null) {
                if (m50291(c1755)) {
                    z2 = true;
                }
                if (c1755.f6079.f17186.mo16080((AbstractC5698) abstractC5698.f17561.m16071(), this.f72597) && (abstractC5698Mo20478 = ((C8604) c1755.f6073).f26285.mo20478(abstractC10370, (Predicate) null)) != null) {
                    return z2 ? new C1239(abstractC5698Mo20478, this) : abstractC5698Mo20478;
                }
                C14163 c14163 = c1755.f6079.f17186;
                c14163.mo16101();
                if ((c14163.f17563 & 8) != 0) {
                    z2 = true;
                }
                c1755 = c1755.f6076;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m50302(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308, boolean z) {
        AbstractC5698 abstractC5698M50316;
        boolean zM4391 = abstractC4308.f13890.f17561.f17559.m4391(C15406.f47185);
        C22364 c22364 = this.f72598;
        if (zM4391) {
            abstractC5698M50316 = m50314(interfaceC3109, c1755, abstractC4308.mo4958().f13890, this.f72594.f18886);
        } else {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            AbstractC5698 abstractC5698M50283 = m50283(c1755, (AbstractC5698) abstractC19810, z);
            if (abstractC5698M50283 == null) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(interfaceC3109, new C12281("compiler", "encl.class.required", abstractC19810));
                abstractC5698M50316 = this.f72605.f66462;
            } else {
                AbstractC4308 abstractC4309 = c1755.f6079.f17186.f17560;
                abstractC5698M50316 = m50316(abstractC5698M50283, interfaceC3109, (AbstractC5698) abstractC4309.f13890, abstractC4309, abstractC5698M50283.f17562, true);
            }
        }
        AbstractC4308 abstractC43010 = abstractC5698M50316.f17560;
        if (((C8604) c1755.f6073).f26299 && abstractC43010.f13890 == c1755.f6079.f17186) {
            C12281 c12282 = C6241.f19132;
            c22364.m7273(interfaceC3109, new C12281("compiler", "cant.ref.before.ctor.called", "this"));
        }
        return abstractC43010;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50298(C2609 c2609) {
        if (c2609 == null || c2609.isEmpty()) {
            return this.f72589;
        }
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
            if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
                c18837.m43511(((C1110) abstractC4308).f4048);
            } else {
                c18837.m43511(abstractC4308);
            }
        }
        return c18837;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m50324(C1755 c1755, final C7814 c7814) {
        boolean zContains = c1755.f6075.f4739.f922.contains(c7814.f24147);
        C20661 c20661 = this.f72605;
        C5931 c5931 = this.f72607;
        if (!zContains) {
            C0052 c0052 = c7814.f24147;
            C0052 c0053 = c20661.f66447;
            if (c0052 != c0053) {
                C0052 c0054 = c1755.f6075.f4739;
                if (c0054 != c0053) {
                    C11576 c11576 = C11886.f35440;
                    return c5931.m16617(new C11576("compiler", "not.def.access.does.not.read", c0054, c7814, c0052));
                }
                C11576 c11577 = C11886.f35440;
                return c5931.m16617(new C11576("compiler", "not.def.access.does.not.read.from.unnamed", c7814, c0052));
            }
            C0052 c0055 = c1755.f6075.f4739;
            C11576 c11578 = C11886.f35440;
            return c5931.m16617(new C11576("compiler", "not.def.access.does.not.read.unnamed", c7814, c0055));
        }
        if (C5378.stream(c7814.m16089().f24147.f921).anyMatch(new Predicate() { // from class: l.ܽ֫۠
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
                return ((C17524) obj).f53523 == c7814;
            }
        })) {
            C0052 c0056 = c1755.f6075.f4739;
            if (c0056 != c20661.f66447) {
                C0052 c0057 = c7814.f24147;
                C11576 c11579 = C11886.f35440;
                return c5931.m16617(new C11576("compiler", "not.def.access.not.exported.to.module", c7814, c0057, c0056));
            }
            C0052 c0058 = c7814.f24147;
            C11576 c115710 = C11886.f35440;
            return c5931.m16617(new C11576("compiler", "not.def.access.not.exported.to.module.from.unnamed", c7814, c0058));
        }
        if (c1755.f6075.f4739 != c20661.f66447) {
            C0052 c0059 = c7814.f24147;
            C11576 c115711 = C11886.f35440;
            return c5931.m16617(new C11576("compiler", "not.def.access.not.exported", c7814, c0059));
        }
        C0052 c00510 = c7814.f24147;
        C11576 c115712 = C11886.f35440;
        return c5931.m16617(new C11576("compiler", "not.def.access.not.exported.from.unnamed", c7814, c00510));
    }
}
