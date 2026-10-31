package l;

/* JADX INFO: renamed from: l.ۜۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C6720 extends AbstractC5473 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f20860;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12364 f20861;

    @Override // l.AbstractC5473, l.AbstractC5698
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo15574() {
        return true;
    }

    @Override // l.AbstractC5473, l.AbstractC5698
    public final String toString() {
        return this.f17001;
    }

    public C6720(C22406 c22406, C12364 c12364) {
        this(c22406, EnumC1296.f4580, "inapplicable symbol error", c12364);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6720(C22406 c22406, EnumC1296 enumC1296, String str, C12364 c12364) {
        super(c22406, enumC1296, str);
        this.f20860 = c22406;
        this.f20861 = c12364;
    }

    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        C16719 c16719M6407;
        C22406 c22406 = this.f20860;
        C6136 c6136 = c22406.f72594;
        C22364 c22364 = c22406.f72598;
        if (abstractC10370 == c6136.f18855) {
            return null;
        }
        C23069 c23069Mo1315 = mo1315();
        if (c22406.f72577 && (c16719M6407 = C1945.m6407(c22406.f72607, interfaceC3109, c22364.m7266(), enumC12986, (C16719) c23069Mo1315.f74208)) != null) {
            return c16719M6407;
        }
        AbstractC5698 abstractC5698Mo10960 = ((AbstractC5698) c23069Mo1315.f74207).mo10960(abstractC4308, c22406.f72597);
        C5931 c5931 = c22406.f72607;
        C14397 c14397M7266 = c22364.m7266();
        EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698Mo10960);
        AbstractC10370 abstractC10371 = abstractC5698Mo10960.f17562;
        if (abstractC10371 == c22406.f72594.f18879) {
            abstractC10371 = abstractC5698Mo10960.f17561.f17562;
        }
        return c5931.m16619(enumC12986, c14397M7266, interfaceC3109, "cant.apply.symbol", enumC8352M49076, abstractC10371, c22406.m50298(abstractC5698Mo10960.f17560.mo12933()), c22406.m50298(c2609), C21758.m49076(abstractC5698Mo10960.f17561), abstractC5698Mo10960.f17561.f17560, c23069Mo1315.f74208);
    }

    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo15573(AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        C23069 c23069Mo1315 = mo1315();
        C22406 c22406 = this.f20860;
        C6319 c6319 = c22406.f72597;
        AbstractC4308 abstractC4308 = (c23069Mo1315 != null ? (AbstractC5698) c23069Mo1315.f74207 : c22406.f72605.f66462).f17560;
        c6319.getClass();
        AbstractC19810 abstractC19811 = C6319.m17457(abstractC10370, abstractC19810, abstractC4308).f13890;
        if (c23069Mo1315 != null) {
            C7898 c7898 = c22406.f72583;
            AbstractC5698 abstractC5698 = (AbstractC5698) c23069Mo1315.f74207;
            C16719 c16719 = (C16719) c23069Mo1315.f74208;
            c7898.getClass();
            C2609 c2609Of = C2609.of((Object) c16719);
            while (c2609Of.m8249()) {
                C16719 c167110 = (C16719) c2609Of.f8240;
                c2609Of = c2609Of.f8241;
                String strMo29298 = c167110.mo29298();
                strMo29298.getClass();
                switch (strMo29298) {
                    case "compiler.misc.infer.arg.length.mismatch":
                    case "compiler.misc.missing.ret.val":
                    case "compiler.misc.unexpected.ret.val":
                    case "compiler.misc.arg.length.mismatch":
                        abstractC19811.f17560 = new C0842((C12193) abstractC19811.f17560, abstractC5698);
                        abstractC19811.f17563 |= 1099511627776L;
                        break;
                    default:
                        for (Object obj : c167110.m39354()) {
                            if (obj instanceof C16719) {
                                c2609Of = c2609Of.m8246((C16719) obj);
                            }
                        }
                        break;
                }
            }
        }
        return abstractC19811;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public C23069 mo1315() {
        C13069 c13069 = null;
        for (C13069 c130610 : this.f20861.f37058) {
            if (!c130610.m31667()) {
                c13069 = c130610;
            }
        }
        C12171.m29637(c13069);
        return new C23069(c13069.f39142, c13069.f39139);
    }
}
