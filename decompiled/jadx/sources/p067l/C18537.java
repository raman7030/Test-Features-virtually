package p067l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18537 {

    /* JADX INFO: renamed from: ᩻ */
    public static final C6468 f55348 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public C19208 f55349;

    /* JADX INFO: renamed from: ۧ */
    public C8200 f55350;

    /* JADX INFO: renamed from: ܳ */
    public C8374 f55351;

    /* JADX INFO: renamed from: ܽ */
    public int f55352;

    /* JADX INFO: renamed from: ܿ */
    public C3626 f55353;

    /* JADX INFO: renamed from: ᩳ */
    public C22004 f55354;

    /* JADX INFO: renamed from: ֫ */
    public static C18537 m42139(C5127 c5127) {
        C6468 c6468 = f55348;
        C18537 c18537 = (C18537) c5127.m10905(c6468);
        if (c18537 != null) {
            return c18537;
        }
        C18537 c18538 = new C18537();
        c18538.f55352 = -1;
        c18538.f55349 = new C19208(c18538);
        c5127.m10908(c6468, c18538);
        c18538.f55352 = -1;
        c18538.f55353 = null;
        c18538.f55350 = C8200.m18988(c5127);
        c18538.f55354 = C22004.m49577(c5127);
        c18538.f55351 = C8374.m19396(c5127);
        return c18538;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18537 m42174(C3626 c3626) {
        C8200 c8200 = this.f55350;
        C8374 c8374 = this.f55351;
        C22004 c22004 = this.f55354;
        C18537 c18537 = new C18537();
        c18537.f55349 = new C19208(c18537);
        c18537.f55352 = 0;
        c18537.f55353 = c3626;
        c18537.f55350 = c8200;
        c18537.f55351 = c8374;
        c18537.f55354 = c22004;
        return c18537;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42188(int i) {
        this.f55352 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42189(InterfaceC5323 interfaceC5323) {
        this.f55352 = interfaceC5323 == null ? -1 : interfaceC5323.mo11526();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C3626 m42213(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            final AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
            C1446.m31705((abstractC7257 instanceof C7650) || (abstractC7257 instanceof C9800) || (abstractC7257 instanceof C12483) || (abstractC7257 instanceof C5777) || (abstractC7257 instanceof C7789) || (abstractC7257 instanceof C5638) || ((abstractC7257 instanceof C12344) && (((C12344) abstractC7257).f34446 instanceof C5638)), new Supplier() { // from class: l.֫֨۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC7257.getClass().getSimpleName();
                }
            });
        }
        C3626 c3626 = new C3626();
        c3626.f7512 = null;
        c3626.f7515 = null;
        c3626.f7514 = null;
        c3626.f7509 = c4848;
        c3626.f18924 = this.f55352;
        return c3626;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7650 m42151(C4436 c4436, AbstractC12224 abstractC12224, C4848 c4848, AbstractC14355 abstractC14355, C4848 c4849, C4848 c48410) {
        return m42152(c4436, abstractC12224, c4848, abstractC14355, c4849, C4848.m10283(), c48410);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7650 m42152(C4436 c4436, AbstractC12224 abstractC12224, C4848 c4848, AbstractC14355 abstractC14355, C4848 c4849, C4848 c48410, C4848 c48411) {
        C7650 c7650 = new C7650();
        c7650.f20022 = c4436;
        c7650.f20021 = abstractC12224;
        c7650.f20026 = c4848;
        c7650.f20025 = abstractC14355;
        c7650.f20024 = c4849;
        c7650.f20023 = c48410;
        c7650.f20020 = c48411;
        c7650.f20027 = null;
        c7650.f18924 = this.f55352;
        return c7650;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10471 m42160(C4436 c4436, AbstractC12224 abstractC12224, AbstractC14355 abstractC14355, C4848 c4848, C11281 c11281, C4848 c4849, C4848 c48410, C4968 c4968, AbstractC14355 abstractC14356) {
        C10471 c10471 = new C10471(c4436, abstractC12224, abstractC14355, c4848, c11281, c4849, c48410, c4968, abstractC14356, null);
        c10471.f18924 = this.f55352;
        return c10471;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11281 m42163(C4436 c4436, AbstractC12224 abstractC12224, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        C11281 c11281 = new C11281(c4436, abstractC12224, abstractC14355, abstractC14356, null, false);
        c11281.f18924 = this.f55352;
        return c11281;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11281 m42164(C4436 c4436, AbstractC12224 abstractC12224, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356, boolean z) {
        C11281 c11281 = new C11281(c4436, abstractC12224, abstractC14355, abstractC14356, null, z);
        c11281.f18924 = this.f55352;
        return c11281;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11281 m42165(C4436 c4436, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        C11281 c11281 = new C11281(c4436, null, abstractC14356, null, null, false);
        c11281.f31432 = abstractC14355;
        if (abstractC14355.m16617(EnumC19998.f60790)) {
            c11281.f31433 = ((C9661) abstractC14355).f26610;
        } else {
            c11281.f31433 = ((C8320) abstractC14355).f22259;
        }
        c11281.f18924 = this.f55352;
        return c11281;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C7789 m42206() {
        C7789 c7789 = new C7789();
        c7789.f18924 = this.f55352;
        return c7789;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4968 m42145(long j, C4848 c4848) {
        C4968 c4968 = new C4968();
        c4968.f11315 = -1;
        c4968.f11316 = c4848;
        c4968.f11317 = j;
        c4968.f18924 = this.f55352;
        return c4968;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13685 m42169(C4848 c4848, AbstractC14355 abstractC14355, C4848 c4849, AbstractC13154 abstractC13154) {
        C13685 c13685 = new C13685();
        c13685.f38597 = c4848;
        c13685.f38598 = abstractC14355;
        c13685.f38596 = c4849;
        c13685.f38595 = abstractC13154;
        c13685.f18924 = this.f55352;
        return c13685;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C23882 m42215(AbstractC14355 abstractC14355, C4848 c4848) {
        C23882 c23882 = new C23882();
        c23882.f75832 = -1;
        c23882.f75829 = abstractC14355;
        c23882.f75828 = c4848;
        c23882.f18924 = this.f55352;
        return c23882;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20391 m42181(EnumC8690 enumC8690, C4848 c4848, C4848 c4849, AbstractC7257 abstractC7257) {
        C20391 c20391 = new C20391(enumC8690, c4848, c4849, abstractC7257);
        c20391.f18924 = this.f55352;
        return c20391;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C15164 m42211(AbstractC14355 abstractC14355, C4848 c4848) {
        C15164 c15164 = new C15164();
        c15164.f43268 = -1;
        c15164.f43267 = abstractC14355;
        c15164.f43269 = c4848;
        c15164.f18924 = this.f55352;
        return c15164;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12622 m42168(C4848 c4848, C4968 c4968, C4848 c4849, C4968 c4969) {
        C12622 c12622 = new C12622();
        c12622.f35421 = c4968;
        c12622.f35425 = c4849;
        c12622.f35424 = c4969;
        c12622.f35422 = c4848;
        c12622.f18924 = this.f55352;
        return c12622;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2955 m42140(C11281 c11281, C4968 c4968) {
        C2955 c2955 = new C2955();
        c2955.f5147 = c11281;
        c2955.f5146 = c4968;
        c2955.f18924 = this.f55352;
        return c2955;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10332 m42159(AbstractC14355 abstractC14355, AbstractC14355 abstractC14356, AbstractC14355 abstractC14357) {
        C10332 c10332 = new C10332();
        c10332.f28614 = abstractC14355;
        c10332.f28612 = abstractC14356;
        c10332.f28613 = abstractC14357;
        c10332.f18924 = this.f55352;
        return c10332;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3765 m42141(AbstractC14355 abstractC14355, AbstractC13154 abstractC13154, AbstractC13154 abstractC13155) {
        C3765 c3765 = new C3765();
        c3765.f7998 = abstractC14355;
        c3765.f7999 = abstractC13154;
        c3765.f8000 = abstractC13155;
        c3765.f18924 = this.f55352;
        return c3765;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12344 m42196(AbstractC14355 abstractC14355) {
        C12344 c12344 = new C12344();
        c12344.f34446 = abstractC14355;
        c12344.f18924 = this.f55352;
        return c12344;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6309 m42149(AbstractC12224 abstractC12224) {
        C6309 c6309 = new C6309();
        c6309.f16359 = abstractC12224;
        c6309.f16360 = null;
        c6309.f18924 = this.f55352;
        return c6309;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C4575 m42202(AbstractC14355 abstractC14355) {
        C4575 c4575 = new C4575();
        c4575.f10248 = abstractC14355;
        c4575.f10247 = null;
        c4575.f18924 = this.f55352;
        return c4575;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C11813 m42207(AbstractC14355 abstractC14355) {
        C11813 c11813 = new C11813();
        c11813.f32975 = abstractC14355;
        c11813.f18924 = this.f55352;
        return c11813;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C3904 m42214(AbstractC14355 abstractC14355) {
        C3904 c3904 = new C3904();
        c3904.f8460 = abstractC14355;
        c3904.f18924 = this.f55352;
        return c3904;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17175 m42172(AbstractC14355 abstractC14355, C4848 c4848, C4848 c4849) {
        C17175 c17175 = new C17175();
        if (c4848 == null) {
            c4848 = C4848.m10283();
        }
        c17175.f51142 = c4848;
        c17175.f51143 = abstractC14355;
        c17175.f51144 = c4849;
        c17175.f18924 = this.f55352;
        return c17175;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20530 m42182(AbstractC14355 abstractC14355, C4848 c4848, AbstractC14355 abstractC14356, C4848 c4849, C7650 c7650, boolean z) {
        C20530 c20530;
        if (z) {
            c20530 = new C12503(abstractC14355, c4848, abstractC14356, c4849, c7650);
        } else {
            c20530 = new C20530(abstractC14355, c4848, abstractC14356, c4849, c7650);
        }
        c20530.f18924 = this.f55352;
        return c20530;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19859 m42201(AbstractC14355 abstractC14355, C4848 c4848, C4848 c4849) {
        C19859 c19859 = new C19859();
        c19859.f60358 = abstractC14355;
        c19859.f60360 = c4848;
        c19859.f60357 = C4848.m10283();
        c19859.f60361 = C4848.m10283();
        c19859.f60359 = c4849;
        c19859.f18924 = this.f55352;
        return c19859;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15834 m42198(AbstractC7257 abstractC7257, C4848 c4848) {
        C15834 c15834 = new C15834();
        c15834.f45862 = true;
        c15834.f45863 = c4848;
        c15834.f45864 = abstractC7257;
        if (c4848.isEmpty() || ((C11281) c4848.f11034).f31437 != null) {
            c15834.f45861 = EnumC18517.EXPLICIT;
        } else {
            c15834.f45861 = EnumC18517.IMPLICIT;
        }
        c15834.f18924 = this.f55352;
        return c15834;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22403 m42184(AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        C22403 c22403 = new C22403();
        c22403.f70670 = abstractC14355;
        c22403.f70671 = abstractC14356;
        c22403.f18924 = this.f55352;
        return c22403;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11674 m42167(EnumC19998 enumC19998, AbstractC7257 abstractC7257, AbstractC7257 abstractC7258) {
        C11674 c11674 = new C11674();
        c11674.f5601 = enumC19998;
        c11674.f32571 = (AbstractC14355) abstractC7257;
        c11674.f32570 = (AbstractC14355) abstractC7258;
        c11674.f5602 = null;
        c11674.f18924 = this.f55352;
        return c11674;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8598 m42156(EnumC19998 enumC19998, AbstractC14355 abstractC14355) {
        C8598 c8598 = new C8598();
        c8598.f5601 = enumC19998;
        c8598.f23105 = abstractC14355;
        c8598.f18924 = this.f55352;
        return c8598;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11003 m42162(EnumC19998 enumC19998, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        C11003 c11003 = new C11003();
        c11003.f5601 = enumC19998;
        c11003.f30470 = abstractC14355;
        c11003.f30469 = abstractC14356;
        c11003.f5602 = null;
        c11003.f18924 = this.f55352;
        return c11003;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19327 m42179(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355) {
        C19327 c19327 = new C19327();
        c19327.f57709 = abstractC7257;
        c19327.f57710 = abstractC14355;
        c19327.f18924 = this.f55352;
        return c19327;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23073 m42185() {
        C23073 c23073 = new C23073();
        c23073.f18924 = this.f55352;
        return c23073;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16366 m42199(AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        C16366 c16366 = new C16366(abstractC14355, abstractC14356);
        c16366.f18924 = this.f55352;
        return c16366;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8320 m42155(AbstractC14355 abstractC14355, AbstractC12224 abstractC12224) {
        C8320 c8320 = new C8320(abstractC14355, abstractC12224, null);
        c8320.f18924 = this.f55352;
        return c8320;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9661 m42194(AbstractC12224 abstractC12224) {
        C9661 c9661 = new C9661(abstractC12224, null);
        c9661.f18924 = this.f55352;
        return c9661;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24552 m42187(EnumC11353 enumC11353, Object obj) {
        C24552 c24552 = new C24552();
        c24552.f77743 = enumC11353;
        c24552.f77744 = obj;
        c24552.f18924 = this.f55352;
        return c24552;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5107 m42146(EnumC11353 enumC11353) {
        C5107 c5107 = new C5107();
        c5107.f11988 = enumC11353;
        c5107.f18924 = this.f55352;
        return c5107;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C25084 m42212(AbstractC14355 abstractC14355) {
        C25084 c25084 = new C25084();
        c25084.f80025 = abstractC14355;
        c25084.f18924 = this.f55352;
        return c25084;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C17985 m42203(AbstractC14355 abstractC14355, C4848 c4848) {
        C17985 c17985 = new C17985();
        c17985.f53722 = abstractC14355;
        c17985.f53721 = c4848;
        c17985.f18924 = this.f55352;
        return c17985;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17314 m42173(C20669 c20669, AbstractC7257 abstractC7257) {
        C17314 c17314 = new C17314();
        C1446.m31699(c20669);
        c17314.f51642 = c20669;
        c17314.f51641 = abstractC7257;
        c17314.f18924 = this.f55352;
        return c17314;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20669 m42183(EnumC17268 enumC17268) {
        C20669 c20669 = new C20669();
        c20669.f63851 = enumC17268;
        c20669.f18924 = this.f55352;
        return c20669;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19049 m42175(AbstractC7257 abstractC7257, C4848 c4848) {
        C19049 c19049 = new C19049(EnumC19998.f60714, abstractC7257, c4848);
        c19049.f18924 = this.f55352;
        return c19049;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C19049 m42209(AbstractC7257 abstractC7257, C4848 c4848) {
        C19049 c19049 = new C19049(EnumC19998.f60707, abstractC7257, c4848);
        c19049.f18924 = this.f55352;
        return c19049;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4436 m42190(long j, C4848 c4848) {
        C4436 c4436 = new C4436();
        c4436.f9954 = j;
        c4436.f9953 = c4848;
        c4436.f18924 = ((j & (-4611677222334353921L)) == 0 && c4848.isEmpty()) ? -1 : this.f55352;
        return c4436;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4436 m42142(long j) {
        return m42190(j, C4848.m10283());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5777 m42147(C4436 c4436, EnumC8885 enumC8885, AbstractC14355 abstractC14355, C4848 c4848) {
        C5777 c5777 = new C5777(c4436, enumC8885, abstractC14355, c4848);
        c5777.f18924 = this.f55352;
        return c5777;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19720 m42180(AbstractC14355 abstractC14355, C4848 c4848) {
        C19720 c19720 = new C19720();
        C1446.m31704(c4848 != null && c4848.m10293());
        c19720.f59995 = c4848;
        c19720.f59996 = abstractC14355;
        c19720.f18924 = this.f55352;
        return c19720;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5638 m42191() {
        return m42192(C4848.m10283());
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5638 m42192(C4848 c4848) {
        C5638 c5638 = new C5638();
        c5638.f13677 = c4848;
        c5638.f18924 = this.f55352;
        return c5638;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C5916 m42205(AbstractC14355 abstractC14355, C4848 c4848) {
        C5916 c5916 = new C5916(abstractC14355, c4848);
        c5916.f18924 = this.f55352;
        return c5916;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7650 m42150(C4436 c4436, C4848 c4848) {
        return m42151(c4436, this.f55350.f21725, C4848.m10283(), (AbstractC14355) null, C4848.m10283(), c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5916 m42148(C11281 c11281, AbstractC14355 abstractC14355) {
        C5916 c5916 = new C5916(abstractC14355, C4848.m10276of((Object) c11281));
        c5916.f18924 = this.f55352;
        return c5916;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9661 m42157(AbstractC7783 abstractC7783) {
        AbstractC12224 abstractC12224Mo18002 = abstractC7783.f20408;
        if (abstractC12224Mo18002 == this.f55350.f21725) {
            abstractC12224Mo18002 = abstractC7783.mo18002();
        }
        C9661 c9661 = new C9661(abstractC12224Mo18002, abstractC7783);
        c9661.f18924 = this.f55352;
        c9661.f18925 = abstractC7783.f20406;
        return c9661;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8320 m42154(AbstractC14355 abstractC14355, AbstractC7783 abstractC7783) {
        C8320 c8320 = new C8320(abstractC14355, abstractC7783.f20408, abstractC7783);
        c8320.f18924 = this.f55352;
        c8320.f18925 = abstractC7783.f20406;
        return c8320;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m42204(C4848 c4848) {
        C20271 c20271 = new C20271();
        while (c4848.m10293()) {
            c20271.m45777(m42157((AbstractC7783) ((C11281) c4848.f11034).f31438));
            c4848 = c4848.f11035;
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9661 m42193(AbstractC6462 abstractC6462) {
        return m42157((AbstractC7783) new C13818(16L, this.f55350.f21744, abstractC6462, abstractC6462.f16705));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8320 m42153(AbstractC6462 abstractC6462) {
        return m42154(m42208(abstractC6462), new C13818(16L, this.f55350.f21744, abstractC6462, abstractC6462.f16705));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9661 m42158(C15828 c15828, AbstractC6462 abstractC6462) {
        return m42157((AbstractC7783) new C13818(16L, this.f55350.f21756, abstractC6462, c15828));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17175 m42200(AbstractC14355 abstractC14355, C4848 c4848) {
        C17175 c17175M42172 = m42172(abstractC14355, (C4848) null, c4848);
        c17175M42172.f18925 = abstractC14355.f18925.mo14787();
        return c17175M42172;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17175 m42171(AbstractC14355 abstractC14355) {
        C17175 c17175M42172 = m42172(abstractC14355, (C4848) null, C4848.m10283());
        c17175M42172.f18925 = abstractC14355.f18925.mo14787();
        return c17175M42172;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14355 m42208(AbstractC6462 abstractC6462) {
        AbstractC14355 abstractC14355;
        AbstractC14355 abstractC14355M42146;
        AbstractC14355 abstractC14355M42197;
        if (abstractC6462 == null) {
            return null;
        }
        switch (C17866.f53336[abstractC6462.mo5577().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                abstractC14355M42146 = m42146(abstractC6462.mo5577());
                break;
            case 10:
                abstractC14355M42146 = m42157((AbstractC7783) abstractC6462.f16705);
                break;
            case 11:
                C21215 c21215 = (C21215) abstractC6462;
                EnumC17268 enumC17268 = c21215.f66702;
                abstractC14355M42146 = m42173(m42183(enumC17268), (AbstractC7257) (enumC17268 != EnumC17268.UNBOUND ? m42208(c21215.f66703) : null));
                break;
            case 12:
                int i = C17866.f53337[abstractC6462.mo5575().ordinal()];
                if (i == 1) {
                    C20271 c20271 = new C20271();
                    Iterator it = ((C9814) abstractC6462).m22895().iterator();
                    while (it.hasNext()) {
                        c20271.m45777(m42208((AbstractC6462) it.next()));
                    }
                    C4848 c4848M45783 = c20271.m45783();
                    C24691 c24691 = new C24691();
                    c24691.f78164 = c4848M45783;
                    c24691.f18924 = this.f55352;
                    abstractC14355 = c24691;
                } else if (i == 2) {
                    C20271 c20272 = new C20271();
                    Iterator it2 = ((C7921) abstractC6462).m18291().iterator();
                    while (it2.hasNext()) {
                        c20272.m45777(m42208((AbstractC6462) it2.next()));
                    }
                    C4848 c4848M45784 = c20272.m45783();
                    C18656 c18656 = new C18656();
                    c18656.f55708 = c4848M45784;
                    c18656.f18924 = this.f55352;
                    abstractC14355 = c18656;
                } else {
                    AbstractC6462 abstractC6462Mo7201 = abstractC6462.mo7201();
                    if (abstractC6462Mo7201.m14777(EnumC11353.CLASS) && abstractC6462.f16705.f20407.f20405 == EnumC3600.f7354) {
                        abstractC14355M42197 = m42154(m42208(abstractC6462Mo7201), abstractC6462.f16705);
                    } else {
                        abstractC14355M42197 = m42197(abstractC6462.f16705);
                    }
                    abstractC14355M42146 = abstractC14355M42197;
                    if (!abstractC6462.mo14802().isEmpty()) {
                        abstractC14355M42146 = m42203(abstractC14355M42197, m42210(abstractC6462.mo14802()));
                    }
                }
                abstractC14355M42146 = abstractC14355;
                break;
            case 13:
                abstractC14355M42146 = m42212(m42208(this.f55351.m19455(abstractC6462)));
                break;
            case 14:
                abstractC14355M42146 = m42146(EnumC11353.ERROR);
                break;
            default:
                throw new AssertionError("unexpected type: " + abstractC6462);
        }
        return abstractC14355M42146.mo32947(abstractC6462);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m42210(C4848 c4848) {
        C20271 c20271 = new C20271();
        while (c4848.m10293()) {
            c20271.m45777(m42208((AbstractC6462) c4848.f11034));
            c4848 = c4848.f11035;
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11281 m42166(C13818 c13818, AbstractC14355 abstractC14355) {
        C11281 c11281 = new C11281(m42190(c13818.f20409, m42143(c13818.mo17987())), c13818.f20408, m42208(c13818.f20406), abstractC14355, c13818, false);
        c11281.f18924 = this.f55352;
        c11281.f18925 = c13818.f20406;
        return c11281;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m42143(C4848 c4848) {
        if (c4848 == null) {
            return C4848.m10283();
        }
        C20271 c20271 = new C20271();
        while (c4848.m10293()) {
            c20271.m45777(m42177((AbstractC10564) c4848.f11034));
            c4848 = c4848.f11035;
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24552 m42186(Object obj) {
        C24552 c24552M42187;
        AbstractC6462 abstractC6462Mo5576;
        C22004 c22004 = this.f55354;
        if (obj instanceof String) {
            c24552M42187 = m42187(EnumC11353.CLASS, obj);
            abstractC6462Mo5576 = c22004.f69215.mo5576(obj);
        } else if (obj instanceof Integer) {
            c24552M42187 = m42187(EnumC11353.INT, obj);
            abstractC6462Mo5576 = c22004.f69134.mo5576(obj);
        } else if (obj instanceof Long) {
            c24552M42187 = m42187(EnumC11353.LONG, obj);
            abstractC6462Mo5576 = c22004.f69152.mo5576(obj);
        } else if (obj instanceof Byte) {
            c24552M42187 = m42187(EnumC11353.BYTE, obj);
            abstractC6462Mo5576 = c22004.f69184.mo5576(obj);
        } else if (obj instanceof Character) {
            char cCharAt = ((Character) obj).toString().charAt(0);
            c24552M42187 = m42187(EnumC11353.CHAR, Integer.valueOf(cCharAt));
            abstractC6462Mo5576 = c22004.f69136.mo5576(Integer.valueOf(cCharAt));
        } else if (obj instanceof Double) {
            c24552M42187 = m42187(EnumC11353.DOUBLE, obj);
            abstractC6462Mo5576 = c22004.f69181.mo5576(obj);
        } else if (obj instanceof Float) {
            c24552M42187 = m42187(EnumC11353.FLOAT, obj);
            abstractC6462Mo5576 = c22004.f69165.mo5576(obj);
        } else if (obj instanceof Short) {
            c24552M42187 = m42187(EnumC11353.SHORT, obj);
            abstractC6462Mo5576 = c22004.f69195.mo5576(obj);
        } else if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            c24552M42187 = m42187(EnumC11353.BOOLEAN, Integer.valueOf(zBooleanValue ? 1 : 0));
            abstractC6462Mo5576 = c22004.f69151.mo5576(Integer.valueOf(zBooleanValue ? 1 : 0));
        } else {
            throw new AssertionError(obj);
        }
        c24552M42187.f18925 = abstractC6462Mo5576;
        return c24552M42187;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19049 m42177(AbstractC10564 abstractC10564) {
        return this.f55349.m43743((C17939) abstractC10564);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19049 m42176(C8552 c8552) {
        return this.f55349.m43742(c8552);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10471 m42161(C5771 c5771, AbstractC6462 abstractC6462, C4968 c4968) {
        C4436 c4436M42190 = m42190(c5771.f20409, m42143(c5771.mo17987()));
        AbstractC12224 abstractC12224 = c5771.f20408;
        AbstractC14355 abstractC14355M42208 = abstractC12224 != this.f55350.f21737 ? m42208(abstractC6462.mo14787()) : null;
        C20271 c20271 = new C20271();
        for (C4848 c4848Mo14802 = abstractC6462.mo14802(); c4848Mo14802.m10293(); c4848Mo14802 = c4848Mo14802.f11035) {
            Object obj = c4848Mo14802.f11034;
            AbstractC12224 abstractC12225 = ((AbstractC6462) obj).f16705.f20408;
            C10485 c10485 = (C10485) obj;
            C4848 c4848M42210 = m42210(this.f55351.m19424(c10485));
            C4848 c4848M10283 = C4848.m10283();
            C15973 c15973 = new C15973();
            c15973.f46261 = abstractC12225;
            c15973.f46262 = c4848M42210;
            c15973.f46260 = c4848M10283;
            c15973.f18924 = this.f55352;
            c15973.f18925 = c10485;
            c20271.m45777(c15973);
        }
        C10471 c10471 = new C10471(c4436M42190, abstractC12224, abstractC14355M42208, c20271.m45783(), null, m42144(abstractC6462.mo14797(), c5771), m42210(abstractC6462.mo14794()), c4968, null, c5771);
        c10471.f18924 = this.f55352;
        c10471.f18925 = abstractC6462;
        return c10471;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m42144(C4848 c4848, C5771 c5771) {
        C20271 c20271 = new C20271();
        C5771 c5772 = c5771.f20405 == EnumC3600.f7343 ? c5771 : null;
        if (c5772 != null && c5772.f14172 != null && c4848.m10289() == c5772.f14172.m10289()) {
            Iterator it = c5771.f14172.iterator();
            while (it.hasNext()) {
                c20271.m45777(m42166((C13818) it.next(), (AbstractC14355) null));
            }
        } else {
            int i = 0;
            while (c4848.m10293()) {
                c20271.m45777(m42166(new C13818(8589934592L, m42195(i), (AbstractC6462) c4848.f11034, c5771), (AbstractC14355) null));
                c4848 = c4848.f11035;
                i++;
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16366 m42170(C13818 c13818, C17175 c17175) {
        C16366 c16366 = new C16366(m42197(c13818), c17175);
        c16366.f18925 = ((C7251) c13818.f20406).f18916;
        return c16366;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19327 m42178(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        C19327 c19327M42179 = m42179((AbstractC7257) m42208(abstractC6462), abstractC14355);
        c19327M42179.f18925 = abstractC6462;
        return c19327M42179;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r0.hasNext() == false) goto L39;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC14355 m42197(AbstractC7783 abstractC7783) {
        AbstractC7783 abstractC7784;
        EnumC3600 enumC3600;
        C3626 c3626 = this.f55353;
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        if (abstractC12224 != this.f55350.f21725 && (abstractC7784 = abstractC7783.f20407) != null && abstractC7784 != this.f55354.f69155 && (enumC3600 = abstractC7784.f20405) != EnumC3600.f7343 && enumC3600 != EnumC3600.f7339) {
            if (abstractC7783.f20405 == EnumC3600.f7354 && c3626 != null) {
                Iterator it = c3626.f7513.m22456(abstractC12224).iterator();
                if (it.hasNext()) {
                    if (((AbstractC7783) it.next()) == abstractC7783) {
                    }
                } else {
                    C9794 c9794 = c3626.f7517;
                    c9794.mo18020();
                    Iterator it2 = c9794.f27061.m22456(abstractC7783.f20408).iterator();
                    if (it2.hasNext()) {
                        if (((AbstractC7783) it2.next()) == abstractC7783) {
                        }
                    } else {
                        Iterator it3 = c3626.f7511.m22456(abstractC7783.f20408).iterator();
                        if (it3.hasNext()) {
                            if (((AbstractC7783) it3.next()) == abstractC7783) {
                            }
                        }
                    }
                }
            }
            return m42154(m42197(abstractC7783.f20407), abstractC7783);
        }
        return m42157(abstractC7783);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12224 m42195(int i) {
        C8200 c8200 = this.f55350;
        return c8200.f21738.m32717(C20778.m46922(i, "x"));
    }
}
