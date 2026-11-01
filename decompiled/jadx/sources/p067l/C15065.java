package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0655am;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15065 extends AbstractC2562 {

    /* JADX INFO: renamed from: ܽ֫ */
    public static final C6468 f43006 = new C6468();

    /* JADX INFO: renamed from: ֡ */
    public final C24507 f43007;

    /* JADX INFO: renamed from: ֨ */
    public final C12497 f43008;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 f43009;

    /* JADX INFO: renamed from: ֫֫ */
    public final C8374 f43010;

    /* JADX INFO: renamed from: ۖ */
    public boolean f43011;

    /* JADX INFO: renamed from: ۗ */
    public final C23663 f43012;

    /* JADX INFO: renamed from: ۘ */
    public C16091 f43013;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9701 f43014;

    /* JADX INFO: renamed from: ۚ */
    public final C18537 f43015;

    /* JADX INFO: renamed from: ۛ */
    public C11714 f43016;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f43017;

    /* JADX INFO: renamed from: ۟ */
    public C3626 f43018;

    /* JADX INFO: renamed from: ۠ */
    public final C8200 f43019;

    /* JADX INFO: renamed from: ۡ */
    public C4036 f43020;

    /* JADX INFO: renamed from: ۢ */
    public AbstractC13884 f43021;

    /* JADX INFO: renamed from: ۤ */
    public C11714 f43022;

    /* JADX INFO: renamed from: ۧ */
    public final C15099 f43023;

    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean f43024;

    /* JADX INFO: renamed from: ۨ */
    public C4022 f43025;

    /* JADX INFO: renamed from: ۫ */
    public final EnumC21102 f43026;

    /* JADX INFO: renamed from: ۬ */
    public C4848 f43027;

    /* JADX INFO: renamed from: ܰ */
    public final EnumC12720 f43028;

    /* JADX INFO: renamed from: ܳ */
    public C3666 f43029;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f43031;

    /* JADX INFO: renamed from: ܽ */
    public C4036 f43032;

    /* JADX INFO: renamed from: ᩳ */
    public final C16852 f43034;

    /* JADX INFO: renamed from: ᩴ */
    public final boolean f43035;

    /* JADX INFO: renamed from: ᩵ */
    public final C23623 f43036;

    /* JADX INFO: renamed from: ᩶ */
    public HashMap f43037;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f43038;

    /* JADX INFO: renamed from: ᩸ */
    public final C14080 f43039;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC6462 f43040;

    /* JADX INFO: renamed from: ᩺ */
    public final C22004 f43041;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC4002 f43042;

    /* JADX INFO: renamed from: ܶ */
    public int f43030 = 0;

    /* JADX INFO: renamed from: ܿ */
    public C21772 f43033 = new C21772(this);

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3793(C7789 c7789) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15065 m34431(C5127 c5127) {
        C15065 c15065 = (C15065) c5127.m10905(f43006);
        return c15065 == null ? new C15065(c5127) : c15065;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34428(int i) {
        int i2 = 3;
        if (i != 0) {
            if (i == 1) {
                i2 = 9;
            } else if (i == 2) {
                i2 = 11;
            } else if (i == 3) {
                i2 = 14;
            } else if (i != 5 && i != 6 && i != 7) {
                throw new AssertionError("zero");
            }
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m34448(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        boolean zM14777 = abstractC6462.m14777(EnumC11353.ARRAY);
        C22004 c22004 = this.f43041;
        if (!zM14777) {
            return (abstractC7783.f20407 == abstractC6462.f16705 || (abstractC7783.mo18003() & 4104) == 4104 || abstractC7783.f20407 == c22004.f69208.f16705) ? abstractC7783 : abstractC7783.mo9256(abstractC6462.f16705);
        }
        if (abstractC7783 == c22004.f69214 || abstractC7783.f20407 != c22004.f69187) {
            return abstractC7783;
        }
        HashMap map = this.f43037;
        AbstractC7783 c15828 = (AbstractC7783) map.get(abstractC6462);
        if (c15828 == null) {
            c15828 = new C15828(1L, abstractC6462.f16705.f20408, abstractC6462, c22004.f69157);
            map.put(abstractC6462, c15828);
        }
        return abstractC7783.mo9256(c15828);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34445(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        m34438(interfaceC5323, abstractC6462);
        return this.f43039.m31949(abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m34438(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        int i = C23783.f75636[abstractC6462.mo5577().ordinal()];
        if (i == 1) {
            m34438(interfaceC5323, abstractC6462.mo14787());
            for (C4848 c4848Mo14797 = abstractC6462.mo14797(); c4848Mo14797.m10293(); c4848Mo14797 = c4848Mo14797.f11035) {
                m34438(interfaceC5323, (AbstractC6462) c4848Mo14797.f11034);
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C8374 c8374 = this.f43010;
        c8374.getClass();
        int i2 = 0;
        while (abstractC6462.m14777(EnumC11353.ARRAY)) {
            i2++;
            abstractC6462 = c8374.m19455(abstractC6462);
        }
        if (i2 > 255) {
            this.f43036.m9352(interfaceC5323, C8300.f22022);
            this.f43030++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4022 m34446(AbstractC6462 abstractC6462) {
        C13818 c13818 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, this.f43019.f21725, abstractC6462, this.f43020.f8853.f28960);
        this.f43029.m7037(c13818);
        return this.f43013.m36599(c13818);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34462(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, boolean z) {
        C5771 c5771M52640 = this.f43012.m52640(abstractC7257, this.f43032, abstractC6462, abstractC12224, c4848, (C4848) null);
        if (z) {
            C16091 c16091 = this.f43013;
            c16091.getClass();
            C8374 c8374 = c16091.f47350;
            C3666.m7020(c5771M52640.mo18010(c8374));
            C12497 c12497 = (C12497) c5771M52640.mo18010(c8374);
            int iM7020 = C3666.m7020(c12497.f35031);
            c16091.f47348.m7064(c5771M52640, c12497);
            AbstractC9701 abstractC9701 = c16091.f47349[iM7020];
            return;
        }
        C16091 c16092 = this.f43013;
        boolean z2 = abstractC12224 == this.f43019.f21737;
        c16092.getClass();
        C8374 c8375 = c16092.f47350;
        C3666 c3666 = c16092.f47348;
        C3666.m7020(c5771M52640.mo18010(c8375));
        C12497 c12498 = (C12497) c5771M52640.m18015(c8375);
        int iM7021 = C3666.m7020(c12498.f35031);
        if ((c5771M52640.f20407.mo18003() & 512) != 0 && !z2) {
            c3666.m7045(c5771M52640, c12498);
        } else if (z2) {
            c3666.m7058(c5771M52640, c12498);
        } else {
            c3666.m7068(c5771M52640, c12498);
        }
        AbstractC9701 abstractC9702 = c16092.f47349[iM7021];
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m34442(C10471 c10471) {
        if ((c10471.f28961.f9954 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
            return false;
        }
        AbstractC12224 abstractC12224 = c10471.f28959;
        return abstractC12224.m28205(this.f43009) && (abstractC12224.mo5097(abstractC12224.mo5098() - 1) & 1) == 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34465(C4036 c4036) {
        AbstractC5678 abstractC5678;
        if (!this.f43029.m7069() || (abstractC5678 = ((C7019) c4036.f8849).f18285) == null) {
            return;
        }
        abstractC5678.mo12657();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34454(C4036 c4036) {
        C20271 c20271 = ((C7019) c4036.f8849).f18287;
        if (c20271 == null || c20271.m45780() % 2 != 1) {
            return;
        }
        ((C7019) c4036.f8849).f18287.m45777(Integer.valueOf(this.f43029.m7054()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34455(C4036 c4036, C4036 c4037) {
        C4036 c4038 = null;
        while (c4038 != c4037) {
            m34454(c4036);
            c4038 = c4036;
            c4036 = c4036.f8848;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m34447(C15828 c15828, C4848 c4848) {
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        C20271 c20273 = new C20271();
        C20271 c20274 = new C20271();
        C20271 c20275 = new C20271();
        C4848 c4849 = c4848;
        while (true) {
            boolean zM10293 = c4849.m10293();
            C18537 c18537 = this.f43015;
            if (!zM10293) {
                int iM45780 = c20271.m45780();
                C8200 c8200 = this.f43019;
                if (iM45780 != 0) {
                    C4848 c4848M45783 = c20271.m45783();
                    c20272.addAll(c15828.m18024());
                    C4848 c4848M45784 = c20272.m45783();
                    Iterator it = c20275.iterator();
                    while (it.hasNext()) {
                        C10471 c10471 = (C10471) ((AbstractC7257) it.next());
                        if (c10471.f28959 == c8200.f21737 && C9268.m21435(c10471)) {
                            C4848 c48410 = c10471.f28958.f11316;
                            C20271 c20276 = new C20271();
                            if (c48410.m10293()) {
                                while (C9268.m21396((AbstractC7257) c48410.f11034)) {
                                    c20276.m45777((AbstractC13154) c48410.f11034);
                                    c48410 = c48410.f11035;
                                }
                                c20276.m45777((AbstractC13154) c48410.f11034);
                                C4848 c48411 = c48410.f11035;
                                while (c48411.m10293() && C9268.m21396((AbstractC7257) c48411.f11034)) {
                                    c20276.m45777((AbstractC13154) c48411.f11034);
                                    c48411 = c48411.f11035;
                                }
                                c20276.m45778(c4848M45783);
                                while (c48411.m10293()) {
                                    c20276.m45777((AbstractC13154) c48411.f11034);
                                    c48411 = c48411.f11035;
                                }
                            }
                            c10471.f28958.f11316 = c20276.m45783();
                            C4968 c4968 = c10471.f28958;
                            if (c4968.f11315 == -1) {
                                c4968.f11315 = C9268.m21433((AbstractC7257) c4968.f11316.last());
                            }
                            c10471.f28960.m18016(c4848M45784);
                        }
                    }
                }
                if (c20273.m45780() != 0) {
                    c15828.mo18020();
                    long j = (c15828.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) | 8;
                    AbstractC12224 abstractC12224 = c8200.f21700;
                    C4848 c4848M10283 = C4848.m10283();
                    C22004 c22004 = this.f43041;
                    C5771 c5771 = new C5771(j, abstractC12224, new C12497(c4848M10283, c22004.f69183, C4848.m10283(), c22004.f69163), c15828);
                    c15828.mo18020();
                    c15828.f45850.mo28415(c5771);
                    C4848 c4848M45785 = c20273.m45783();
                    AbstractC13154 abstractC13154 = (AbstractC13154) c4848M45785.f11034;
                    abstractC13154.getClass();
                    c18537.m42189((InterfaceC5323) abstractC13154);
                    C4968 c4968M42145 = c18537.m42145(0L, c4848M45785);
                    c4968M42145.f11315 = C9268.m21433((AbstractC7257) c4848M45785.last());
                    c20275.m45777(c18537.m42161(c5771, c5771.f20406, c4968M42145));
                    if (!c20274.isEmpty()) {
                        c5771.m18016(c20274.m45783());
                    }
                    if (!c15828.m17992().isEmpty()) {
                        c5771.m18016(c15828.m17992());
                    }
                }
                return c20275.m45783();
            }
            AbstractC7257 abstractC7257 = (AbstractC7257) c4849.f11034;
            int i = C23783.f75637[abstractC7257.mo3383().ordinal()];
            if (i == 1) {
                C4968 c4969 = (C4968) abstractC7257;
                long j2 = c4969.f11317;
                if ((8 & j2) != 0) {
                    c20273.m45777(c4969);
                } else if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j2) == 0) {
                    c20271.m45777(c4969);
                }
            } else if (i == 2) {
                c20275.m45777(abstractC7257);
            } else {
                if (i != 3) {
                    C1446.m31698();
                    throw null;
                }
                C11281 c11281 = (C11281) abstractC7257;
                C13818 c13818 = c11281.f31438;
                m34438(c11281, c13818.f20406);
                if (c11281.f31436 != null) {
                    C20271 c20277 = c20274;
                    C20271 c20278 = c20275;
                    if ((c13818.f20409 & 8) == 0) {
                        c18537.m42189((InterfaceC5323) c11281);
                        C22403 c22403M42184 = c18537.m42184((AbstractC14355) c18537.m42157((AbstractC7783) c13818), c11281.f31436);
                        c22403M42184.f18925 = c13818.f20406;
                        C12344 c12344M42196 = c18537.m42196(c22403M42184);
                        c20271.m45777(c12344M42196);
                        this.f43021.mo8720(c11281, c12344M42196);
                        c20272.addAll(m34430(c13818));
                        c20274 = c20277;
                    } else if (c13818.m31487() == null) {
                        c18537.f55352 = c11281.f18924;
                        C22403 c22403M42185 = c18537.m42184((AbstractC14355) c18537.m42157((AbstractC7783) c13818), c11281.f31436);
                        c22403M42185.f18925 = c13818.f20406;
                        C12344 c12344M42197 = c18537.m42196(c22403M42185);
                        c20273.m45777(c12344M42197);
                        this.f43021.mo8720(c11281, c12344M42197);
                        c20274 = c20277;
                        c20274.addAll(m34430(c13818));
                    } else {
                        c20274 = c20277;
                        InterfaceC5323 interfaceC5323 = c11281.f31436;
                        interfaceC5323.getClass();
                        m34433(interfaceC5323, c13818.m31487());
                        c11281.f31436.mo3382(this.f43033);
                    }
                    c20275 = c20278;
                }
            }
            c4849 = c4849.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m34430(C13818 c13818) {
        C4848<C8552> c4848Mo18000 = c13818.mo18000();
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        for (C8552 c8552 : c4848Mo18000) {
            C1446.m31704(c8552.mo7612().f33002 != EnumC11275.UNKNOWN);
            if (c8552.mo7612().f33002 == EnumC11275.FIELD) {
                c20271.m45777(c8552);
            } else {
                c20272.m45777(c8552);
            }
        }
        c13818.m17993(c20271.m45783());
        return c20272.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34433(InterfaceC5323 interfaceC5323, Object obj) {
        if (this.f43030 != 0 || obj == null || !(obj instanceof String) || ((String) obj).length() < 65535) {
            return;
        }
        this.f43036.m9352(interfaceC5323, C8300.f22032);
        this.f43030++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34460(AbstractC7257 abstractC7257, C4036 c4036) {
        C4036 c4037 = this.f43020;
        try {
            this.f43020 = c4036;
            abstractC7257.mo3382(this);
        } catch (C21865 e) {
            C16852 c16852 = this.f43034;
            abstractC7257.getClass();
            c16852.m38271(abstractC7257, e);
        } finally {
            this.f43020 = c4037;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34461(AbstractC7257 abstractC7257, C4036 c4036, int i) {
        if (!this.f43031) {
            m34466(abstractC7257, c4036);
            return;
        }
        int iM7054 = this.f43029.m7054();
        m34466(abstractC7257, c4036);
        if (abstractC7257.m16617(EnumC19998.f60774)) {
            i |= 2;
        }
        C3666 c3666 = this.f43029;
        c3666.f7758.m30040(abstractC7257, i, iM7054, c3666.m7054());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34466(AbstractC7257 abstractC7257, C4036 c4036) {
        if (this.f43029.m7069()) {
            this.f43029.m7071(abstractC7257.f18924);
            m34460(abstractC7257, c4036);
        } else if (((C7019) c4036.f8849).f18286 && abstractC7257.m16617(EnumC19998.f60802)) {
            this.f43029.m7037(((C11281) abstractC7257).f31438);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34457(C4848 c4848, C4036 c4036) {
        while (c4848.m10293()) {
            m34461((AbstractC7257) c4848.f11034, c4036, 1);
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8360 m34449(AbstractC7257 abstractC7257, int i) {
        if (!this.f43031) {
            return m34450(abstractC7257, false);
        }
        int iM7054 = this.f43029.m7054();
        C8360 c8360M34450 = m34450(abstractC7257, (i & 8) != 0);
        C3666 c3666 = this.f43029;
        c3666.f7758.m30040(abstractC7257, i, iM7054, c3666.m7054());
        return c8360M34450;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8360 m34450(AbstractC7257 abstractC7257, boolean z) {
        AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC7257);
        if (abstractC7257M21437.m16617(EnumC19998.f60793)) {
            C10332 c10332 = (C10332) abstractC7257M21437;
            C8360 c8360M34449 = m34449(c10332.f28614, 8);
            boolean z2 = c8360M34449.f22361 == null && c8360M34449.f22363 == 167;
            C11714 c11714 = c8360M34449.f22364;
            if (z2) {
                this.f43029.m7049(c11714);
                C8360 c8360M344410 = m34449(c10332.f28612, 16);
                if (z) {
                    c8360M344410.f22360 = c10332.f28612;
                }
                return c8360M344410;
            }
            if (c8360M34449.m19299()) {
                this.f43029.m7049(c8360M34449.f22361);
                C8360 c8360M344411 = m34449(c10332.f28613, 16);
                if (z) {
                    c8360M344411.f22360 = c10332.f28613;
                }
                return c8360M344411;
            }
            C11714 c11714M19304 = c8360M34449.m19304();
            this.f43029.m7049(c11714);
            C8360 c8360M344412 = m34449(c10332.f28612, 16);
            if (z) {
                c8360M344412.f22360 = c10332.f28612;
            }
            C11714 c11714M19305 = c8360M344412.m19304();
            this.f43029.m7049(c8360M344412.f22364);
            C11714 c11714M7038 = this.f43029.m7038(167);
            this.f43029.m7049(c11714M19304);
            C8360 c8360M344413 = m34449(c10332.f28613, 16);
            C16091 c16091 = this.f43013;
            int i = c8360M344413.f22363;
            C11714 c11714M7021 = C3666.m7021(c11714M7038, c8360M344413.f22364);
            C11714 c11714M7022 = C3666.m7021(c11714M19305, c8360M344413.f22361);
            c16091.getClass();
            C8360 c8360 = new C8360(c16091, i, c11714M7021, c11714M7022);
            if (z) {
                c8360.f22360 = c10332.f28613;
            }
            return c8360;
        }
        if (abstractC7257M21437.m16617(EnumC19998.f60779)) {
            this.f43029.m7070();
            boolean z3 = this.f43011;
            C11714 c11715 = this.f43016;
            C11714 c11716 = this.f43022;
            try {
                this.f43011 = true;
                this.f43016 = null;
                this.f43022 = null;
                try {
                    m34440((C15164) abstractC7257M21437);
                } catch (C21865 e) {
                    this.f43034.m38271(abstractC7257, e);
                    this.f43029.f7742.f20157 = 1;
                }
                C16091 c16092 = this.f43013;
                C11714 c11717 = this.f43016;
                C11714 c11718 = this.f43022;
                c16092.getClass();
                C8360 c8361 = new C8360(c16092, 167, c11717, c11718);
                if (z) {
                    c8361.f22360 = abstractC7257;
                }
                this.f43011 = z3;
                this.f43016 = c11715;
                this.f43022 = c11716;
                return c8361;
            } catch (Throwable th) {
                this.f43011 = z3;
                this.f43016 = c11715;
                this.f43022 = c11716;
                throw th;
            }
        }
        if (abstractC7257M21437.m16617(EnumC19998.f60753)) {
            C5916 c5916 = (C5916) abstractC7257M21437;
            if (c5916.f14605) {
                this.f43029.m7070();
                C3666 c3666 = this.f43029;
                int i2 = c3666.f7755;
                int iM7052 = c3666.m7052(c3666.f7742.f20157);
                try {
                    m34457(c5916.f14604, this.f43020);
                    this.f43029.m7052(iM7052);
                    C8360 c8360M34450 = m34450(c5916.f14606, z);
                    this.f43029.m7065(i2);
                    return c8360M34450;
                } catch (Throwable th2) {
                    this.f43029.m7052(iM7052);
                    throw th2;
                }
            }
        }
        C8360 c8360Mo19303 = m34451(this.f43041.f69151, abstractC7257).mo19303();
        if (z) {
            c8360Mo19303.f22360 = abstractC7257;
        }
        return c8360Mo19303;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C3666 m34468() {
        return this.f43029;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C16091 m34467() {
        return this.f43013;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4036 m34469() {
        return this.f43032;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 m34451(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257) {
        AbstractC6462 abstractC6463 = this.f43040;
        try {
            if (abstractC7257.f18925.mo14779() != null) {
                abstractC7257.mo3382(this.f43033);
                m34433(abstractC7257, abstractC7257.f18925.mo14779());
                AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC7257);
                if (abstractC7783M21438 != null && m34436(abstractC7783M21438)) {
                    C16091 c16091 = this.f43013;
                    c16091.getClass();
                    this.f43014 = new C13725(c16091, abstractC7783M21438);
                } else {
                    C16091 c16092 = this.f43013;
                    AbstractC6462 abstractC6464 = abstractC7257.f18925;
                    Object objMo14779 = abstractC6464.mo14779();
                    c16092.getClass();
                    this.f43014 = new C24453(c16092, abstractC6464, objMo14779);
                }
            } else {
                this.f43040 = abstractC6462;
                abstractC7257.mo3382(this);
            }
            AbstractC9701 abstractC9701 = this.f43014;
            abstractC9701.getClass();
            return abstractC9701.mo22645(C3666.m7020(abstractC6462));
        } catch (C21865 e) {
            C16852 c16852 = this.f43034;
            abstractC7257.getClass();
            c16852.m38271(abstractC7257, e);
            this.f43029.f7742.f20157 = 1;
            return this.f43013.m36601(abstractC6462);
        } finally {
            this.f43040 = abstractC6463;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m34436(AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 != EnumC3600.f7339 || !(abstractC7783 instanceof C10465)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34458(C4848 c4848, C4848 c4849) {
        while (c4848.m10293()) {
            m34451((AbstractC6462) c4849.f11034, (AbstractC7257) c4848.f11034).mo8027();
            c4849 = c4849.f11035;
            c4848 = c4848.f11035;
        }
        C1446.m31704(c4849.isEmpty());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        C4036 c4036 = this.f43020;
        C4036 c4036M8087 = c4036.m8087(c10471, c4036.f8849);
        c4036M8087.f8853 = c10471;
        C5771 c5771 = c10471.f28960;
        C8374 c8374 = this.f43010;
        this.f43040 = c5771.mo18010(c8374).mo14787();
        m34438(c10471, c10471.f28960.mo18010(c8374));
        m34463(c10471, c4036M8087, false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX INFO: renamed from: ֫ */
    public final void m34463(C10471 c10471, C4036 c4036, boolean z) {
        int i;
        C13818 c13818;
        C5771 c5771 = c10471.f28960;
        if (c5771.m17994()) {
            if (!c5771.m17990().m17988() || c5771.m17990().mo17483()) {
                i = 1;
            } else {
                i = 2;
            }
        } else if ((c10471.f28961.f9954 & 8) == 0) {
            i = 1;
        } else {
            i = 0;
        }
        AbstractC6462 abstractC6462 = c4036.f8853.f28960.f20406;
        C8374 c8374 = this.f43010;
        int iM7019 = C3666.m7019(c8374.m19459(abstractC6462).mo14797()) + i;
        C23623 c23623 = this.f43036;
        if (iM7019 > 255) {
            c23623.m9352(c10471, C8300.f22086);
            this.f43030++;
            return;
        }
        if (c10471.f28958 != null) {
            C5771 c5772 = c10471.f28960;
            InterfaceC15575 interfaceC15575 = this.f43035 ? this.f43018.f7512 : null;
            boolean z2 = this.f43031;
            C3666 c3666 = new C3666(c5772, z, interfaceC15575, this.f43024, this.f43026, this.f43017, z2 ? new C13134(c10471, c4036.f8851.f7514) : null, this.f43041, this.f43010, this.f43039);
            this.f43029 = c3666;
            c5772.f14173 = c3666;
            C22004 c22004 = this.f43041;
            this.f43013 = new C16091(c3666, c22004, c8374);
            if (this.f43029.f7754) {
                System.err.println(c5772 + " for body " + c10471);
            }
            if ((c10471.f28961.f9954 & 8) == 0) {
                AbstractC6462 abstractC6462M41136 = c5772.f20407.f20406;
                if (c5772.m17994() && abstractC6462M41136 != c22004.f69208) {
                    abstractC6462M41136 = C18083.m41136(abstractC6462M41136);
                }
                AbstractC6462 abstractC6463 = abstractC6462M41136;
                C3666 c3667 = this.f43029;
                c3667.m7073(c3667.m7037(new C13818(16L, this.f43019.f21744, abstractC6463, c5772.f20407)));
            }
            for (C4848 c4848 = c10471.f28963; c4848.m10293(); c4848 = c4848.f11035) {
                C11281 c11281 = (C11281) c4848.f11034;
                c11281.getClass();
                m34438(c11281, ((C11281) c4848.f11034).f31438.f20406);
                C3666 c3668 = this.f43029;
                c3668.m7073(c3668.m7037(((C11281) c4848.f11034).f31438));
            }
            int iM7054 = z2 ? this.f43029.m7054() : 0;
            this.f43029.m7061();
            this.f43029.f7765 = false;
            m34466(c10471.f28958, c4036);
            C3666 c3669 = this.f43029;
            if (c3669.f7742.f20157 != 0) {
                C4968 c4968 = c10471.f28958;
                c4968.getClass();
                C5771 c5773 = c10471.f28960;
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c4968, new C14040("compiler", "stack.sim.error", c5773));
                throw new AssertionError();
            }
            if (c3669.m7069()) {
                this.f43029.m7071(C9268.m21433(c10471.f28958));
                C10471 c10472 = c4036.f8853;
                if (c10472 == null || c10472.f28960.f20406.mo14787().m14777(EnumC11353.VOID)) {
                    this.f43029.m7062(177);
                } else {
                    this.f43029.m7050(this.f43013.m36600(167).m19300(), this.f43029.m7061());
                }
            }
            if (z2) {
                C3666 c36610 = this.f43029;
                c36610.f7758.m30040(c10471.f28958, 2, iM7054, c36610.m7054());
            }
            this.f43029.m7065(0);
            C3666 c36611 = this.f43029;
            if (c36611.f7759 > 65535) {
                c23623.m9352(c10471, C8300.f22159);
            } else if (c36611.f7733 > 65535) {
                c23623.m9352(c10471, C8300.f22011);
            } else if (c36611.f7741 > 65535) {
                c23623.m9352(c10471, C8300.f22065);
            } else {
                if (!z && c36611.f7767) {
                    m34463(c10471, c4036, true);
                }
                if (this.f43026 == EnumC21102.f66305) {
                    C3666 c36612 = this.f43029;
                    c36612.f7747 = null;
                    c36612.f7763 = null;
                }
                C3666 c36613 = this.f43029;
                c36613.getClass();
                C20271 c20271 = new C20271();
                C4848 c4848M10283 = C4848.m10283();
                Iterator it = c36613.f7749.iterator();
                while (it.hasNext()) {
                    c4848M10283 = c4848M10283.m10290(Integer.valueOf(((char[]) it.next())[2]));
                }
                for (char[] cArr : c36613.f7749) {
                    char c = cArr[0];
                    char c2 = cArr[1];
                    if (c != c2 && (c != c2 - 1 || !c4848M10283.contains(Integer.valueOf(c)))) {
                        c20271.m45777(cArr);
                    }
                }
                c36613.f7749 = c20271;
                C3666 c36614 = this.f43029;
                for (int i2 = 0; i2 < c36614.f7744; i2++) {
                    C17747 c17747 = c36614.f7753[i2];
                    if (c17747 != null && (c13818 = c17747.f53006) != null && c13818.m18026() && c13818.m31485()) {
                        for (C8552 c8552 : c13818.mo18000()) {
                            C11827 c11827 = c8552.f53587;
                            if (c11827.m27123()) {
                                int iM27118 = c11827.m27118();
                                int iM27122 = c11827.m27122();
                                int iM45780 = c36614.f7749.m45780();
                                C4848 c4848M45783 = c36614.f7749.m45783();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iM45780) {
                                        i3 = -1;
                                        break;
                                    }
                                    char[] cArr2 = (char[]) c4848M45783.f11034;
                                    c4848M45783 = c4848M45783.f11035;
                                    char c3 = cArr2[3];
                                    char c4 = cArr2[0];
                                    if (iM27118 == c3 && c4 == iM27122) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (i3 == -1) {
                                    C1446.m31702("Could not find exception index for type annotation " + c8552 + " on exception parameter");
                                    throw null;
                                }
                                c11827.m27119(i3);
                            }
                        }
                    }
                }
                return;
            }
            this.f43030++;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C13818 c13818 = c11281.f31438;
        AbstractC14355 abstractC14355 = c11281.f31436;
        if (abstractC14355 != null) {
            m34433(abstractC14355, c13818.m31487());
            if (c13818.m31487() == null || this.f43024) {
                C1446.m31704(this.f43029.m7066());
                this.f43029.m7037(c13818);
                m34451(c13818.mo18010(this.f43010), c11281.f31436).mo8027();
                this.f43013.m36599(c13818).mo8025();
                C1446.m31704(this.f43029.m7066());
            }
        } else {
            this.f43029.m7037(c13818);
        }
        m34438(c11281, c13818.f20406);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        int i = this.f43029.f7755;
        m34457(c4968.f11316, this.f43020.m8087(c4968, new C7019()));
        if (this.f43020.f8850.m16617(EnumC19998.f60735)) {
            return;
        }
        this.f43029.m7071(c4968.f11315);
        this.f43029.m7065(i);
        this.f43029.f7762 = -1;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        m34435((AbstractC13154) c21732, c21732.f68446, c21732.f68447, C4848.m10283(), false);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        m34435((AbstractC13154) c10610, c10610.f29369, c10610.f29370, C4848.m10283(), true);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        int i = this.f43029.f7755;
        m34457(c13685.f38597, this.f43020);
        m34435((AbstractC13154) c13685, c13685.f38595, c13685.f38598, c13685.f38596, true);
        this.f43029.m7065(i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34435(AbstractC13154 abstractC13154, AbstractC13154 abstractC13155, AbstractC14355 abstractC14355, C4848 c4848, boolean z) {
        C8360 c8360M36600;
        C8360 c8360M36601;
        C4036 c4036M8087 = this.f43020.m8087(abstractC13154, new C7019());
        Object obj = c4036M8087.f8849;
        int iM7061 = this.f43029.m7061();
        if (z) {
            if (abstractC14355 != null) {
                this.f43029.m7071(abstractC14355.f18924);
                C1446.m31704(this.f43029.m7066());
                c8360M36601 = m34449(C9268.m21424(abstractC14355), 8);
            } else {
                c8360M36601 = this.f43013.m36600(167);
            }
            C11714 c11714M19304 = c8360M36601.m19304();
            this.f43029.m7049(c8360M36601.f22364);
            C1446.m31704(this.f43029.m7066());
            m34461(abstractC13155, c4036M8087, 17);
            this.f43029.m7049(((C7019) obj).f18283);
            m34457(c4848, c4036M8087);
            C3666 c3666 = this.f43029;
            c3666.m7050(c3666.m7038(167), iM7061);
            this.f43029.m7049(c11714M19304);
        } else {
            m34461(abstractC13155, c4036M8087, 17);
            this.f43029.m7049(((C7019) obj).f18283);
            m34457(c4848, c4036M8087);
            if (this.f43029.m7069()) {
                if (abstractC14355 != null) {
                    this.f43029.m7071(abstractC14355.f18924);
                    C1446.m31704(this.f43029.m7066());
                    c8360M36600 = m34449(C9268.m21424(abstractC14355), 8);
                } else {
                    c8360M36600 = this.f43013.m36600(167);
                }
                this.f43029.m7050(c8360M36600.m19300(), iM7061);
                C1446.m31704(this.f43029.m7066());
                this.f43029.m7049(c8360M36600.f22361);
            }
        }
        C11714 c11714 = ((C7019) obj).f18284;
        if (c11714 != null) {
            this.f43029.m7049(c11714);
            c11714.f32670.f20161.m22904(this.f43029.f7755);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        throw new AssertionError();
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        C4036 c4036M8087 = this.f43020.m8087(c19188, new C7019());
        m34461(c19188.f57351, c4036M8087, 1);
        C11714 c11714 = ((C7019) c4036M8087.f8849).f18284;
        if (c11714 != null) {
            this.f43029.m7049(c11714);
            c11714.f32670.f20161.m22904(this.f43029.f7755);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        m34434(c23882, c23882.f75829, c23882.f75828, c23882.f75830);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        this.f43029.m7070();
        boolean z = this.f43011;
        try {
            this.f43011 = false;
            m34440(c15164);
            this.f43011 = z;
            this.f43014 = this.f43013.m36601(this.f43040);
        } catch (Throwable th) {
            this.f43011 = z;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m34440(C15164 c15164) {
        EnumC12720 enumC12720 = this.f43028;
        C4848 c4848 = this.f43027;
        C4022 c4022 = this.f43025;
        int i = this.f43029.f7755;
        try {
            this.f43027 = C4848.m10283();
            this.f43025 = null;
            boolean[] zArr = new boolean[1];
            c15164.mo3382(new C10372(zArr));
            if (zArr[0]) {
                while (true) {
                    C7690 c7690 = this.f43029.f7742;
                    int i2 = c7690.f20157;
                    if (i2 <= 0) {
                        break;
                    }
                    AbstractC6462 abstractC6462 = c7690.f20158[i2 - 1];
                    C13818 c13818 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, this.f43019.f21738.m32717(enumC12720.m29249() + "stack" + enumC12720.m29249() + c15164.f18924 + enumC12720.m29249() + this.f43029.f7742.f20157), abstractC6462, this.f43020.f8853.f28960);
                    C16091 c16091 = this.f43013;
                    C12826.requireNonNull(c16091);
                    C4022 c4023 = new C4022(c16091, abstractC6462, this.f43029.m7037(c13818));
                    this.f43027 = this.f43027.m10290(c4023);
                    c4023.mo8025();
                }
                this.f43025 = m34446(c15164.f18925);
            }
            C3666 c3666 = this.f43029;
            int iM7052 = c3666.m7052(c3666.f7742.f20157);
            try {
                m34434(c15164, c15164.f43267, c15164.f43269, c15164.f43265);
                this.f43029.m7052(iM7052);
                this.f43027 = c4848;
                this.f43025 = c4022;
                this.f43029.m7065(i);
            } catch (Throwable th) {
                this.f43029.m7052(iM7052);
                throw th;
            }
        } catch (Throwable th2) {
            this.f43027 = c4848;
            this.f43025 = c4022;
            this.f43029.m7065(i);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34434(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355, C4848 c4848, boolean z) {
        int[] iArr;
        int i;
        int i2;
        int i3 = this.f43029.f7755;
        C1446.m31704(!abstractC14355.f18925.m14777(EnumC11353.CLASS));
        int iM7061 = z ? this.f43029.m7061() : -1;
        boolean z2 = this.f43031;
        int iM7054 = z2 ? this.f43029.m7054() : 0;
        C1446.m31704(this.f43029.m7066());
        AbstractC9701 abstractC9701M34451 = m34451(this.f43041.f69134, abstractC14355);
        if (c4848.isEmpty()) {
            abstractC9701M34451.mo8027().mo19298();
            if (z2) {
                this.f43029.f7758.m30040(C9268.m21424(abstractC14355), 8, iM7054, this.f43029.m7054());
            }
            i = i3;
        } else {
            abstractC9701M34451.mo8027();
            if (z2) {
                this.f43029.f7758.m30040(C9268.m21424(abstractC14355), 8, iM7054, this.f43029.m7054());
            }
            C4036 c4036M8087 = this.f43020.m8087(abstractC7257, new C7019());
            C7019 c7019 = (C7019) c4036M8087.f8849;
            c7019.f18286 = true;
            int iM10289 = c4848.m10289();
            int[] iArr2 = new int[iM10289];
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = -1;
            int i7 = 0;
            C4848 c4849 = c4848;
            for (int i8 = 0; i8 < iM10289; i8++) {
                if (((AbstractC21062) ((C20391) c4849.f11034).f63044.f11034).mo32948()) {
                    C1446.m31704(((C20391) c4849.f11034).f63044.m10289() == 1);
                    int iIntValue = ((Number) ((AbstractC14355) ((C20391) c4849.f11034).f63044.f11034).f18925.mo14779()).intValue();
                    iArr2[i8] = iIntValue;
                    if (iIntValue < i4) {
                        i4 = iIntValue;
                    }
                    if (i5 < iIntValue) {
                        i5 = iIntValue;
                    }
                    i7++;
                } else {
                    C1446.m31704(i6 == -1);
                    i6 = i8;
                }
                c4849 = c4849.f11035;
            }
            long j = i5;
            int i9 = iM7061;
            long j2 = i4;
            long j3 = j - j2;
            long j4 = i7;
            int i10 = (i7 <= 0 || j3 + 14 > (j4 * 3) + ((2 * j4) + 3)) ? 171 : 170;
            int iM7055 = this.f43029.m7054();
            this.f43029.m7062(i10);
            this.f43029.m7039();
            int iM7056 = this.f43029.m7054();
            int i11 = -1;
            this.f43029.m7055(-1);
            if (i10 == 170) {
                this.f43029.m7055(i4);
                this.f43029.m7055(i5);
                for (long j5 = j2; j5 <= j; j5++) {
                    this.f43029.m7055(-1);
                }
                iArr = null;
            } else {
                this.f43029.m7055(i7);
                int i12 = 0;
                while (i12 < i7) {
                    this.f43029.m7055(i11);
                    this.f43029.m7055(i11);
                    i12++;
                    i11 = -1;
                }
                iArr = new int[iM10289];
            }
            C7690 c7690M17803 = this.f43029.f7742.m17803();
            this.f43029.m7060();
            C4848 c48410 = c4848;
            int i13 = i7;
            int i14 = 0;
            while (i14 < iM10289) {
                int i15 = iM10289;
                C20391 c20391 = (C20391) c48410.f11034;
                C4848 c48411 = c48410.f11035;
                int iM7035 = this.f43029.m7035(c7690M17803);
                if (i14 != i6) {
                    i2 = i6;
                    if (i10 == 170) {
                        this.f43029.m7063((((iArr2[i14] - i4) + 3) * 4) + iM7056, iM7035 - iM7055);
                    } else {
                        iArr[i14] = iM7035 - iM7055;
                    }
                } else {
                    i2 = i6;
                    this.f43029.m7063(iM7056, iM7035 - iM7055);
                }
                C4848 c48412 = c20391.f63043;
                if (!z2) {
                    m34457(c48412, c4036M8087);
                } else {
                    if (c48412.m10289() == 1) {
                        m34461((AbstractC7257) c48412.f11034, c4036M8087, 17);
                    } else {
                        int iM7057 = this.f43029.m7054();
                        m34457(c48412, c4036M8087);
                        C3666 c3666 = this.f43029;
                        c3666.f7758.m30040(c48412, 16, iM7057, c3666.m7054());
                    }
                    i14++;
                    iM10289 = i15;
                    c48410 = c48411;
                    i6 = i2;
                    c4036M8087 = c4036M8087;
                    i4 = i4;
                }
                i14++;
                iM10289 = i15;
                c48410 = c48411;
                i6 = i2;
                c4036M8087 = c4036M8087;
                i4 = i4;
            }
            int i16 = iM10289;
            int i17 = i6;
            if (c7019.f18283 != null) {
                C1446.m31704(z);
                this.f43029.m7050(c7019.f18283, i9);
            }
            C11714 c11714 = c7019.f18284;
            if (c11714 != null) {
                this.f43029.m7049(c11714);
                i = i3;
                c11714.f32670.f20161.m22904(i);
            } else {
                i = i3;
            }
            if (this.f43029.m7059(iM7056) == -1) {
                C3666 c3667 = this.f43029;
                c3667.m7063(iM7056, c3667.m7035(c7690M17803) - iM7055);
            }
            if (i10 == 170) {
                int iM7059 = this.f43029.m7059(iM7056);
                for (long j6 = j2; j6 <= j; j6++) {
                    int i18 = (int) ((((j6 - j2) + 3) * 4) + ((long) iM7056));
                    if (this.f43029.m7059(i18) == -1) {
                        this.f43029.m7063(i18, iM7059);
                    }
                }
            } else {
                if (i17 >= 0) {
                    int i19 = i17;
                    while (i19 < i16 - 1) {
                        int i20 = i19 + 1;
                        iArr2[i19] = iArr2[i20];
                        iArr[i19] = iArr[i20];
                        i19 = i20;
                    }
                }
                if (i13 > 0) {
                    m34432(0, i13 - 1, iArr2, iArr);
                }
                int i21 = 0;
                while (i21 < i13) {
                    int i22 = i21 + 1;
                    int i23 = (i22 * 8) + iM7056;
                    this.f43029.m7063(i23, iArr2[i21]);
                    this.f43029.m7063(i23 + 4, iArr[i21]);
                    i21 = i22;
                }
            }
        }
        this.f43029.m7065(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34432(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int i4 = iArr[(i + i2) / 2];
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (iArr[i5] < i4) {
                i5++;
            } else {
                while (true) {
                    i3 = iArr[i6];
                    if (i4 >= i3) {
                        break;
                    } else {
                        i6--;
                    }
                }
                if (i5 <= i6) {
                    int i7 = iArr[i5];
                    iArr[i5] = i3;
                    iArr[i6] = i7;
                    int i8 = iArr2[i5];
                    iArr2[i5] = iArr2[i6];
                    iArr2[i6] = i8;
                    i5++;
                    i6--;
                }
                if (i5 > i6) {
                    break;
                }
            }
        }
        if (i < i6) {
            m34432(i, i6, iArr, iArr2);
        }
        if (i5 < i2) {
            m34432(i5, i2, iArr, iArr2);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3797(C9130 c9130) {
        int i = this.f43029.f7755;
        C4022 c4022M34446 = m34446(this.f43041.f69208);
        C1446.m31704(this.f43029.m7066());
        AbstractC14355 abstractC14355 = c9130.f24711;
        m34451(abstractC14355.f18925, abstractC14355).mo8027().mo19301();
        c4022M34446.mo8025();
        this.f43029.m7062(194);
        C7690 c7690 = this.f43029.f7742;
        int i2 = c4022M34446.f8792;
        int[] iArr = c7690.f20162;
        if (iArr == null) {
            c7690.f20162 = new int[20];
        } else {
            int i3 = c7690.f20160;
            if (i3 >= iArr.length) {
                int length = iArr.length;
                while (length < i3 + 1) {
                    length *= 2;
                }
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                iArr = iArr2;
            }
            c7690.f20162 = iArr;
        }
        int[] iArr3 = c7690.f20162;
        int i4 = c7690.f20160;
        iArr3[i4] = i2;
        c7690.f20160 = i4 + 1;
        C4036 c4036M8087 = this.f43020.m8087(c9130, new C7019());
        C7019 c7019 = (C7019) c4036M8087.f8849;
        c7019.f18285 = new C17076(this, c4036M8087, c4022M34446);
        c7019.f18287 = new C20271();
        m34456(c4036M8087, c9130.f24710, C4848.m10283());
        this.f43029.m7065(i);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        C4036 c4036M8087 = this.f43020.m8087(c12622, new C7019());
        C4036 c4036 = this.f43020;
        C7019 c7019 = (C7019) c4036M8087.f8849;
        c7019.f18285 = new C23113(this, c4036M8087, c12622, c4036);
        c7019.f18287 = new C20271();
        m34456(c4036M8087, c12622.f35421, c12622.f35425);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34456(C4036 c4036, AbstractC7257 abstractC7257, C4848 c4848) {
        C11714 c11714M7038;
        int i;
        int i2;
        C7690 c7690;
        boolean z;
        C7019 c7019;
        C11714 c11714;
        int i3;
        int i4;
        int i5;
        C7690 c7691;
        C4848 c4849;
        boolean z2;
        C7019 c70110;
        C11714 c11715;
        C4848 c48410;
        C4848 c48411;
        C4848 c4848M10276of;
        C3666 c3666 = this.f43029;
        int i6 = c3666.f7755;
        int iM7054 = c3666.m7054();
        C7690 c7690M17803 = this.f43029.f7742.m17803();
        m34461(abstractC7257, c4036, 2);
        int iM7055 = this.f43029.m7054();
        Object obj = c4036.f8849;
        C4848 c4848M45783 = ((C7019) obj).f18287.m45783();
        this.f43029.m7071(C9268.m21433(abstractC7257));
        m34465(c4036);
        this.f43029.m7071(C9268.m21433(c4036.f8850));
        boolean zM16617 = c4036.f8850.m16617(EnumC19998.f60795);
        if (iM7054 == iM7055 && zM16617) {
            c11714M7038 = this.f43029.m7038(168);
        } else {
            c11714M7038 = this.f43029.m7038(167);
        }
        m34454(c4036);
        C7019 c70111 = (C7019) obj;
        c70111.f18285.mo12656();
        AbstractC5678 abstractC5678 = c70111.f18285;
        boolean z3 = abstractC5678 != null && abstractC5678.mo12659();
        if (iM7054 != iM7055) {
            C4848 c48412 = c4848;
            C11714 c11714M7021 = c11714M7038;
            while (c48412.m10293()) {
                this.f43029.m7036(c7690M17803, ((C2955) c48412.f11034).f5147.f31438.f20406);
                C2955 c2955 = (C2955) c48412.f11034;
                if (iM7054 != iM7055) {
                    if (c2955.f5147.f31437.m16617(EnumC19998.f60727)) {
                        C11281 c11281 = c2955.f5147;
                        C24691 c24691 = (C24691) c11281.f31437;
                        C4848 c4848Mo18000 = c11281.f31438.mo18000();
                        C4848 c48413 = c24691.f78164;
                        C4848 c4848M10276of2 = C4848.m10276of((Object) new C24293(c4848Mo18000, (AbstractC14355) c48413.f11034));
                        C4848 c48414 = c48413.f11035;
                        while (c48414 != null) {
                            Object obj2 = c48414.f11034;
                            if (obj2 == null) {
                                break;
                            }
                            AbstractC14355 abstractC14355 = (AbstractC14355) obj2;
                            if (abstractC14355 instanceof C19720) {
                                C4848 c48415 = ((C19720) abstractC14355).f59995;
                                this.f43023.getClass();
                                c4848M10276of2 = c4848M10276of2.m10290(new C24293(C15099.m34491(c48415), abstractC14355));
                            } else {
                                c4848M10276of2 = c4848M10276of2.m10290(new C24293(C4848.m10283(), abstractC14355));
                            }
                            c48414 = c48414.f11035;
                            c48412 = c48412;
                        }
                        c48411 = c48412;
                        c4848M10276of = c4848M10276of2.m10294();
                    } else {
                        c48411 = c48412;
                        c4848M10276of = C4848.m10276of((Object) new C24293(c2955.f5147.f31438.mo18000(), c2955.f5147.f31437));
                    }
                    C4848<C24293> c48416 = c4848M10276of;
                    int iIntValue = iM7054;
                    C4848 c48417 = c4848M45783;
                    while (c48417.m10293()) {
                        for (C24293 c24293 : c48416) {
                            int iM34445 = m34445((InterfaceC5323) c2955, ((AbstractC14355) c24293.f76953).f18925);
                            C4848 c48418 = c4848M45783;
                            int i7 = i6;
                            C2955 c2956 = c2955;
                            C7690 c7692 = c7690M17803;
                            C7019 c70112 = c70111;
                            C11714 c11716 = c11714M7021;
                            int i8 = iIntValue;
                            boolean z4 = zM16617;
                            C4848 c48419 = c48411;
                            int i9 = iM7054;
                            C4848 c48420 = c48417;
                            m34459(c2955, iIntValue, ((Integer) c48417.f11034).intValue(), this.f43029.m7054(), iM34445);
                            Iterator it = ((C4848) c24293.f76952).iterator();
                            while (it.hasNext()) {
                                ((C8552) it.next()).f53587.m27120(iM34445, i8);
                            }
                            c2955 = c2956;
                            c48417 = c48420;
                            iIntValue = i8;
                            c11714M7021 = c11716;
                            iM7054 = i9;
                            c70111 = c70112;
                            c4848M45783 = c48418;
                            i6 = i7;
                            c7690M17803 = c7692;
                            c48411 = c48419;
                            zM16617 = z4;
                        }
                        C4848 c48421 = c48417.f11035;
                        iIntValue = ((Integer) c48421.f11034).intValue();
                        c48417 = c48421.f11035;
                        iM7054 = iM7054;
                        c70111 = c70111;
                        i6 = i6;
                        c48411 = c48411;
                        zM16617 = zM16617;
                    }
                    i4 = i6;
                    c7691 = c7690M17803;
                    c4849 = c4848M45783;
                    z2 = zM16617;
                    c70110 = c70111;
                    c48410 = c48411;
                    c11715 = c11714M7021;
                    C2955 c2957 = c2955;
                    int i10 = iIntValue;
                    i5 = iM7054;
                    if (i10 < iM7055) {
                        for (C24293 c24294 : c48416) {
                            int iM34446 = m34445((InterfaceC5323) c2957, ((AbstractC14355) c24294.f76953).f18925);
                            m34459(c2957, i10, iM7055, this.f43029.m7054(), iM34446);
                            Iterator it2 = ((C4848) c24294.f76952).iterator();
                            while (it2.hasNext()) {
                                ((C8552) it2.next()).f53587.m27120(iM34446, i10);
                            }
                        }
                    }
                    C13818 c13818 = c2957.f5147.f31438;
                    this.f43029.m7071(c2957.f18924);
                    this.f43029.m7072();
                    C3666 c3667 = this.f43029;
                    int i11 = c3667.f7755;
                    c3667.m7037(c13818);
                    this.f43013.m36599(c13818).mo8025();
                    this.f43029.m7071(C9268.m21427(c2957.f5146));
                    m34461(c2957.f5146, c4036, 2);
                    this.f43029.m7065(i11);
                    this.f43029.m7071(C9268.m21433(c2957.f5146));
                } else {
                    i4 = i6;
                    i5 = iM7054;
                    c7691 = c7690M17803;
                    c4849 = c4848M45783;
                    z2 = zM16617;
                    c70110 = c70111;
                    c11715 = c11714M7021;
                    c48410 = c48412;
                }
                m34465(c4036);
                if (z3 || c48410.f11035.m10293()) {
                    this.f43029.m7071(C9268.m21433(c4036.f8850));
                    c11714M7021 = C3666.m7021(c11715, this.f43029.m7038(167));
                } else {
                    c11714M7021 = c11715;
                }
                m34454(c4036);
                c48412 = c48410.f11035;
                iM7054 = i5;
                c70111 = c70110;
                zM16617 = z2;
                c4848M45783 = c4849;
                i6 = i4;
                c7690M17803 = c7691;
            }
            i = i6;
            i2 = iM7054;
            c7690 = c7690M17803;
            z = zM16617;
            c7019 = c70111;
            c11714 = c11714M7021;
        } else {
            i = i6;
            i2 = iM7054;
            c7690 = c7690M17803;
            z = zM16617;
            c7019 = c70111;
            c11714 = c11714M7038;
        }
        if (z3 && ((i3 = i2) != iM7055 || !z)) {
            C3666 c3668 = this.f43029;
            c3668.f7755 = c3668.f7733;
            C22004 c22004 = this.f43041;
            AbstractC6462 abstractC6462 = c22004.f69161;
            AbstractC6462 abstractC6463 = c22004.f69161;
            int iM7036 = c3668.m7036(c7690, abstractC6462);
            int iIntValue2 = i3;
            C7019 c70113 = c7019;
            while (c70113.f18287.m45784()) {
                m34459(abstractC7257, iIntValue2, ((Integer) c70113.f18287.m45782()).intValue(), iM7036, 0);
                iIntValue2 = ((Integer) c70113.f18287.m45782()).intValue();
            }
            C3666 c3669 = this.f43029;
            AbstractC7257 abstractC7258 = c4036.f8850;
            EnumC24020 enumC24020 = EnumC24020.FIRST_STAT_POS;
            c3669.m7071(C9268.m21398(abstractC7258, enumC24020));
            this.f43029.m7072();
            C4022 c4022M34446 = m34446(abstractC6463);
            c4022M34446.mo8025();
            m34465(c4036);
            this.f43029.m7070();
            this.f43029.m7071(C9268.m21398(c4036.f8850, EnumC24020.END_POS));
            this.f43029.m7072();
            c4022M34446.mo8027();
            m34459(abstractC7257, iIntValue2, ((Integer) c70113.f18287.m45782()).intValue(), iM7036, 0);
            this.f43029.m7062(191);
            this.f43029.m7060();
            C11714 c11717 = c70113.f18283;
            if (c11717 != null) {
                this.f43029.m7049(c11717);
                this.f43029.m7071(C9268.m21398(c4036.f8850, enumC24020));
                this.f43029.m7072();
                C4022 c4022M34447 = m34446(abstractC6463);
                c4022M34447.mo8025();
                c70113.f18285.mo12658();
                this.f43029.m7040(169, c4022M34447.f8792);
                this.f43029.m7060();
            }
        }
        this.f43029.m7049(c11714);
        this.f43029.m7065(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34459(AbstractC7257 abstractC7257, int i, int i2, int i3, int i4) {
        char c = (char) i;
        char c2 = (char) i2;
        char c3 = (char) i3;
        if (c == i && c2 == i2 && c3 == i3) {
            this.f43029.f7749.m45777(new char[]{c, c2, c3, (char) i4});
        } else {
            this.f43036.m9352(abstractC7257, C8300.f22143);
            this.f43030++;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        C11714 c11714M7038;
        C3666 c3666 = this.f43029;
        int i = c3666.f7755;
        C1446.m31704(c3666.m7066());
        C8360 c8360M34449 = m34449(C9268.m21424(c3765.f7998), 8);
        C11714 c11714M19304 = c8360M34449.m19304();
        C1446.m31704(this.f43029.m7066());
        if (c8360M34449.m19299()) {
            c11714M7038 = null;
        } else {
            this.f43029.m7049(c8360M34449.f22364);
            m34461(c3765.f7999, this.f43020, 17);
            c11714M7038 = this.f43029.m7038(167);
        }
        if (c11714M19304 != null) {
            this.f43029.m7049(c11714M19304);
            AbstractC13154 abstractC13154 = c3765.f8000;
            if (abstractC13154 != null) {
                m34461(abstractC13154, this.f43020, 17);
            }
        }
        this.f43029.m7049(c11714M7038);
        this.f43029.m7065(i);
        C1446.m31704(this.f43029.m7066());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3807(C12344 c12344) {
        AbstractC14355 abstractC14355 = c12344.f34446;
        int i = C23783.f75637[abstractC14355.mo3383().ordinal()];
        if (i == 4) {
            ((C8598) abstractC14355).m20016(EnumC19998.f60760);
        } else if (i == 5) {
            ((C8598) abstractC14355).m20016(EnumC19998.f60716);
        }
        C1446.m31704(this.f43029.m7066());
        AbstractC14355 abstractC14356 = c12344.f34446;
        m34451(abstractC14356.f18925, abstractC14356).mo19298();
        C1446.m31704(this.f43029.m7066());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        C1446.m31704(this.f43029.m7066());
        C4036 c4036M34443 = m34443(c6309.f16360);
        C7019 c7019 = (C7019) c4036M34443.f8849;
        c7019.f18284 = C3666.m7021(this.f43029.m7038(167), c7019.f18284);
        m34455(this.f43020, c4036M34443);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        C4036 c4036M34443;
        C1446.m31704(this.f43029.m7066());
        if (this.f43011) {
            C8360 c8360M34449 = m34449(c4575.f10248, 16);
            C11714 c11714M19304 = c8360M34449.m19304();
            this.f43029.m7049(c8360M34449.f22364);
            C4036 c4036M34444 = m34443(c4575.f10247);
            m34444();
            C11714 c11714M7038 = this.f43029.m7038(167);
            m34455(this.f43020, c4036M34444);
            this.f43029.m7049(c11714M19304);
            c4036M34443 = m34443(c4575.f10247);
            m34444();
            C11714 c11714M7039 = this.f43029.m7038(167);
            C11714 c11714 = this.f43016;
            if (c11714 == null) {
                this.f43016 = c11714M7038;
            } else {
                this.f43016 = C3666.m7021(c11714, c11714M7038);
            }
            C11714 c11715 = this.f43022;
            if (c11715 == null) {
                this.f43022 = c11714M7039;
            } else {
                this.f43022 = C3666.m7021(c11715, c11714M7039);
            }
        } else {
            m34451(this.f43040, c4575.f10248).mo8027();
            C4022 c4022 = this.f43025;
            if (c4022 != null) {
                c4022.mo8025();
            }
            C4036 c4036M34445 = m34443(c4575.f10247);
            if (this.f43029.m7069()) {
                m34444();
                C4022 c4023 = this.f43025;
                if (c4023 != null) {
                    c4023.mo8027();
                }
                this.f43029.f7742.m17805(c4575.f10247.f18925);
                C7019 c7019 = (C7019) c4036M34445.f8849;
                c7019.f18284 = C3666.m7021(this.f43029.m7038(167), c7019.f18284);
                this.f43029.m7060();
            }
            c4036M34443 = c4036M34445;
        }
        m34455(this.f43020, c4036M34443);
    }

    /* JADX INFO: renamed from: ܽ */
    private C4036 m34443(AbstractC7257 abstractC7257) {
        int i = this.f43029.f7762;
        C4036 c4036 = this.f43020;
        while (true) {
            m34465(c4036);
            if (c4036.f8850 != abstractC7257) {
                c4036 = c4036.f8848;
            } else {
                this.f43029.f7762 = i;
                return c4036;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m34444() {
        Iterator it = this.f43027.iterator();
        while (it.hasNext()) {
            ((C4022) it.next()).mo8027();
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        int i = this.f43029.f7762;
        AbstractC7257 abstractC7257 = c17036.f50377;
        C4036 c4036 = this.f43020;
        while (true) {
            m34465(c4036);
            if (c4036.f8850 != abstractC7257) {
                c4036 = c4036.f8848;
            } else {
                C3666 c3666 = this.f43029;
                c3666.f7762 = i;
                C1446.m31704(c3666.m7066());
                C7019 c7019 = (C7019) c4036.f8849;
                c7019.f18283 = C3666.m7021(this.f43029.m7038(167), c7019.f18283);
                m34455(this.f43020, c4036);
                return;
            }
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        C4036 c4036;
        C3666 c3666 = this.f43029;
        int i = c3666.f7755;
        int i2 = c3666.f7762;
        if (c11813.f32975 != null) {
            C1446.m31704(c3666.m7066());
            AbstractC9701 abstractC9701Mo8027 = m34451(this.f43040, c11813.f32975).mo8027();
            C4036 c4037 = this.f43020;
            C10471 c10471 = c4037.f8853;
            while (true) {
                AbstractC7257 abstractC7257 = c4037.f8850;
                if (abstractC7257 != c10471) {
                    if (!abstractC7257.m16617(EnumC19998.f60795) || !((C7019) c4037.f8849).f18285.mo12659()) {
                        c4037 = c4037.f8848;
                    } else {
                        abstractC9701Mo8027 = m34446(this.f43040);
                        abstractC9701Mo8027.mo8025();
                        break;
                    }
                } else {
                    break;
                }
            }
            c4036 = this.f43020;
            C10471 c10472 = c4036.f8853;
            while (true) {
                m34465(c4036);
                if (c4036.f8850 == c10472) {
                    break;
                } else {
                    c4036 = c4036.f8848;
                }
            }
            this.f43029.f7762 = i2;
            abstractC9701Mo8027.mo8027();
            this.f43029.m7062(C3666.m7033(C3666.m7020(this.f43040)) + 172);
        } else {
            C4036 c4038 = this.f43020;
            C10471 c10473 = c4038.f8853;
            while (true) {
                m34465(c4038);
                if (c4038.f8850 == c10473) {
                    break;
                } else {
                    c4038 = c4038.f8848;
                }
            }
            C3666 c3667 = this.f43029;
            c3667.f7762 = i2;
            c3667.m7062(177);
            c4036 = c4038;
        }
        m34455(this.f43020, c4036);
        this.f43029.m7065(i);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        C1446.m31704(this.f43029.m7066());
        AbstractC14355 abstractC14355 = c3904.f8460;
        m34451(abstractC14355.f18925, abstractC14355).mo8027();
        this.f43029.m7062(191);
        C1446.m31704(this.f43029.m7066());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        m34437(c17175.f18924);
        AbstractC9701 abstractC9701M34451 = m34451(this.f43008, c17175.f51143);
        C5771 c5771 = (C5771) C9268.m21438(c17175.f51143);
        m34458(c17175.f51144, c5771.m18015(this.f43010).mo14797());
        if (!(c5771 instanceof C11136)) {
            this.f43029.m7071(c17175.f18924);
        }
        this.f43014 = abstractC9701M34451.mo22646();
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        C11714 c11714M7038;
        this.f43029.m7071(c10332.f28614.f18924);
        C8360 c8360M34449 = m34449(c10332.f28614, 8);
        C11714 c11714M19304 = c8360M34449.m19304();
        boolean zM19299 = c8360M34449.m19299();
        boolean z = this.f43031;
        if (zM19299) {
            c11714M7038 = null;
        } else {
            this.f43029.m7049(c8360M34449.f22364);
            int iM7054 = z ? this.f43029.m7054() : 0;
            this.f43029.m7071(c10332.f28612.f18924);
            m34451(this.f43040, c10332.f28612).mo8027();
            this.f43029.f7742.m17805(c10332.f18925);
            if (z) {
                C3666 c3666 = this.f43029;
                c3666.f7758.m30040(c10332.f28612, 16, iM7054, c3666.m7054());
            }
            c11714M7038 = this.f43029.m7038(167);
        }
        if (c11714M19304 != null) {
            this.f43029.m7049(c11714M19304);
            int iM7055 = z ? this.f43029.m7054() : 0;
            this.f43029.m7071(c10332.f28613.f18924);
            m34451(this.f43040, c10332.f28613).mo8027();
            this.f43029.f7742.m17805(c10332.f18925);
            if (z) {
                C3666 c3667 = this.f43029;
                c3667.f7758.m30040(c10332.f28613, 16, iM7055, c3667.m7054());
            }
        }
        this.f43029.m7049(c11714M7038);
        this.f43014 = this.f43013.m36601(this.f43040);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m34437(int i) {
        C5771 c5771 = this.f43029.f7734;
        boolean z = c5771.mo3347() == EnumC24473.CONSTRUCTOR || this.f43029.f7734.mo3347() == EnumC24473.STATIC_INIT;
        for (C8552 c8552 : c5771.mo18000()) {
            if (c8552.m40799()) {
                c8552.m40801();
            }
            C11827 c11827 = c8552.f53587;
            if (c11827.f33009 == i) {
                c11827.f33013 = this.f43029.f7759;
                c11827.f33012 = true;
            }
        }
        if (z) {
            for (C8552 c8553 : c5771.f20407.mo18000()) {
                if (c8553.m40799()) {
                    c8553.m40801();
                }
                C11827 c11828 = c8553.f53587;
                if (c11828.f33009 == i) {
                    c11828.f33013 = this.f43029.f7759;
                    c11828.f33012 = true;
                }
            }
            C15828 c15828M17990 = c5771.m17990();
            c15828M17990.mo18020();
            for (AbstractC7783 abstractC7783 : new C9860(c15828M17990.f45850)) {
                if (abstractC7783.mo3347().m53975()) {
                    for (C8552 c8554 : abstractC7783.mo18000()) {
                        if (c8554.m40799()) {
                            c8554.m40801();
                        }
                        C11827 c11829 = c8554.f53587;
                        if (c11829.f33009 == i) {
                            c11829.f33013 = this.f43029.f7759;
                            c11829.f33012 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        C1446.m31704(c20530.f63432 == null && c20530.f63428 == null);
        m34437(c20530.f18924);
        C3666 c3666 = this.f43029;
        AbstractC6462 abstractC6462 = c20530.f18925;
        m34438(c20530, abstractC6462);
        c3666.m7043(187, c3666.f7740.m31949(abstractC6462), (InterfaceC22798) abstractC6462);
        this.f43029.m7062(89);
        m34458(c20530.f63430, c20530.f63427.m18015(this.f43010).mo14797());
        C16091 c16091 = this.f43013;
        AbstractC7783 abstractC7783 = c20530.f63427;
        c16091.getClass();
        C8374 c8374 = c16091.f47350;
        C3666.m7020(abstractC7783.mo18010(c8374));
        C12497 c12497 = (C12497) abstractC7783.m18015(c8374);
        int iM7020 = C3666.m7020(c12497.f35031);
        abstractC7783.f20407.mo18003();
        c16091.f47348.m7058(abstractC7783, c12497);
        AbstractC9701 abstractC9701 = c16091.f47349[iM7020];
        this.f43014 = this.f43013.m36601(c20530.f18925);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        m34437(c19859.f18924);
        C4848 c4848 = c19859.f60359;
        C22004 c22004 = this.f43041;
        if (c4848 == null) {
            for (C4848 c4849 = c19859.f60360; c4849.m10293(); c4849 = c4849.f11035) {
                m34451(c22004.f69134, (AbstractC7257) c4849.f11034).mo8027();
            }
            this.f43014 = m34453(c19859, c19859.f18925, c19859.f60360.m10289());
            return;
        }
        AbstractC6462 abstractC6462M19455 = this.f43010.m19455(c19859.f18925);
        int iM10289 = c19859.f60359.m10289();
        C16091 c16091 = this.f43013;
        C9262 c9262 = c22004.f69134;
        Integer numValueOf = Integer.valueOf(iM10289);
        c16091.getClass();
        new C24453(c16091, c9262, numValueOf).mo8027();
        AbstractC9701 abstractC9701M34453 = m34453(c19859, c19859.f18925, 1);
        int i = 0;
        for (C4848 c48410 = c19859.f60359; c48410.m10293(); c48410 = c48410.f11035) {
            abstractC9701M34453.mo19301();
            C16091 c16092 = this.f43013;
            C9262 c9263 = c22004.f69134;
            Integer numValueOf2 = Integer.valueOf(i);
            c16092.getClass();
            new C24453(c16092, c9263, numValueOf2).mo8027();
            i++;
            m34451(abstractC6462M19455, (AbstractC7257) c48410.f11034).mo8027();
            C16091 c16093 = this.f43013;
            c16093.getClass();
            c16093.f47348.m7062(C3666.m7020(abstractC6462M19455) + 79);
        }
        this.f43014 = abstractC9701M34453;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 m34453(C19859 c19859, AbstractC6462 abstractC6462, int i) {
        C8374 c8374 = this.f43010;
        AbstractC6462 abstractC6462M19455 = c8374.m19455(abstractC6462);
        int i2 = 0;
        int i3 = 0;
        for (AbstractC6462 abstractC6462M19456 = abstractC6462; abstractC6462M19456.m14777(EnumC11353.ARRAY); abstractC6462M19456 = c8374.m19455(abstractC6462M19456)) {
            i3++;
        }
        if (i3 > 255) {
            this.f43036.m9352(c19859, C8300.f22022);
            this.f43030++;
        }
        int i4 = C3666.f7732;
        switch (C22443.f70811[abstractC6462M19455.mo5577().ordinal()]) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 9;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 10;
                break;
            case 5:
                i2 = 11;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 4;
                break;
            case 9:
            default:
                throw new AssertionError("arraycode " + abstractC6462M19455);
            case 10:
                break;
            case 11:
                i2 = 1;
                break;
        }
        if (i2 == 0 || (i2 == 1 && i == 1)) {
            this.f43029.m7044(m34445((InterfaceC5323) c19859, abstractC6462M19455), abstractC6462);
        } else if (i2 == 1) {
            this.f43029.m7041(i, m34445((InterfaceC5323) c19859, abstractC6462), abstractC6462);
        } else {
            this.f43029.m7057(i2, abstractC6462);
        }
        return this.f43013.m36601(abstractC6462);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(C16505 c16505) {
        AbstractC14355 abstractC14355 = c16505.f48507;
        this.f43014 = m34451(abstractC14355.f18925, abstractC14355);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        AbstractC14355 abstractC14355 = c22403.f70670;
        AbstractC9701 abstractC9701M34451 = m34451(abstractC14355.f18925, abstractC14355);
        m34451(c22403.f70670.f18925, c22403.f70671).mo8027();
        if (c22403.f70671.f18925.m14777(EnumC11353.BOT)) {
            this.f43029.f7742.m17805(c22403.f70670.f18925);
        }
        C16091 c16091 = this.f43013;
        c16091.getClass();
        this.f43014 = new C12384(c16091, abstractC9701M34451);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        AbstractC9701 abstractC9701Mo7981;
        C3088 c3088 = c11674.f5602;
        if (c3088.f5586 == 256) {
            abstractC9701Mo7981 = this.f43042.mo7981(c11674);
        } else {
            AbstractC14355 abstractC14355 = c11674.f32571;
            AbstractC9701 abstractC9701M34451 = m34451(abstractC14355.f18925, abstractC14355);
            if ((c11674.m16617(EnumC19998.f60797) || c11674.m16617(EnumC19998.f60750)) && (abstractC9701M34451 instanceof C4022)) {
                C4022 c4022 = (C4022) abstractC9701M34451;
                EnumC11353 enumC11353Mo5577 = c11674.f32571.f18925.mo5577();
                EnumC11353 enumC11353 = EnumC11353.INT;
                if (enumC11353Mo5577.m26309(enumC11353) && c11674.f32570.f18925.mo5577().m26309(enumC11353) && c11674.f32570.f18925.mo14779() != null) {
                    int iIntValue = ((Number) c11674.f32570.f18925.mo14779()).intValue();
                    if (c11674.m16617(EnumC19998.f60750)) {
                        iIntValue = -iIntValue;
                    }
                    c4022.m8026(iIntValue);
                    this.f43014 = abstractC9701M34451;
                    return;
                }
            }
            abstractC9701M34451.mo19301();
            abstractC9701M34451.mo22645(C3666.m7020((AbstractC6462) c3088.f20406.mo14797().f11034)).mo8027();
            AbstractC9701 abstractC9701M34452 = m34452((AbstractC7257) c11674.f32570, c3088);
            AbstractC6462 abstractC6462 = c11674.f32571.f18925;
            abstractC9701M34452.getClass();
            abstractC9701M34452.mo22645(C3666.m7020(abstractC6462));
            abstractC9701Mo7981 = abstractC9701M34451;
        }
        C16091 c16091 = this.f43013;
        c16091.getClass();
        this.f43014 = new C12384(c16091, abstractC9701Mo7981);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        C3088 c3088 = c8598.f5602;
        if (c8598.m16617(EnumC19998.f60712)) {
            C8360 c8360M34450 = m34450((AbstractC7257) c8598.f23105, false);
            C8360 c8360 = new C8360(c8360M34450.f22362, C3666.m7025(c8360M34450.f22363), c8360M34450.f22361, c8360M34450.f22364);
            c8360.f22360 = c8360M34450.f22360;
            this.f43014 = c8360;
            return;
        }
        AbstractC14355 abstractC14355 = c8598.f23105;
        AbstractC6462 abstractC6462 = c3088.f20406;
        int i = c3088.f5586;
        AbstractC9701 abstractC9701M34451 = m34451((AbstractC6462) abstractC6462.mo14797().f11034, abstractC14355);
        switch (C23783.f75637[c8598.mo3383().ordinal()]) {
            case 4:
            case 5:
                abstractC9701M34451.mo19301();
                int i2 = abstractC9701M34451.f26759;
                if (abstractC9701M34451 instanceof C4022) {
                    C4022 c4022 = (C4022) abstractC9701M34451;
                    if (i == 96 || i == 100) {
                        AbstractC9701 abstractC9701Mo8027 = abstractC9701M34451.mo8027();
                        c4022.m8026(c8598.m16617(EnumC19998.f60723) ? 1 : -1);
                        this.f43014 = abstractC9701Mo8027;
                        return;
                    }
                }
                AbstractC9701 abstractC9701Mo8028 = abstractC9701M34451.mo8027();
                abstractC9701M34451.mo19302(i2);
                this.f43029.m7062(m34428(i2));
                this.f43029.m7062(i);
                if (i2 != 0 && C3666.m7033(i2) == 0) {
                    this.f43029.m7062(i2 + 140);
                }
                abstractC9701M34451.mo8025();
                this.f43014 = abstractC9701Mo8028;
                return;
            case 6:
                this.f43014 = abstractC9701M34451.mo8027();
                return;
            case 7:
                this.f43014 = abstractC9701M34451.mo8027();
                this.f43029.m7062(i);
                return;
            case 8:
                this.f43014 = abstractC9701M34451.mo8027();
                if (abstractC9701M34451.f26759 == 1) {
                    C16091 c16091 = this.f43013;
                    C9262 c9262 = this.f43041.f69152;
                    c16091.getClass();
                    new C24453(c16091, c9262, -1L).mo8027();
                } else {
                    this.f43029.m7062(2);
                }
                this.f43029.m7062(i);
                return;
            case 9:
            case 10:
                abstractC9701M34451.mo19301();
                int i3 = abstractC9701M34451.f26759;
                if (abstractC9701M34451 instanceof C4022) {
                    C4022 c4023 = (C4022) abstractC9701M34451;
                    if (i == 96 || i == 100) {
                        c4023.m8026(c8598.m16617(EnumC19998.f60760) ? 1 : -1);
                        this.f43014 = abstractC9701M34451;
                        return;
                    }
                }
                abstractC9701M34451.mo8027();
                this.f43029.m7062(m34428(i3));
                this.f43029.m7062(i);
                if (i3 != 0 && C3666.m7033(i3) == 0) {
                    this.f43029.m7062(i3 + 140);
                }
                C16091 c16092 = this.f43013;
                c16092.getClass();
                this.f43014 = new C12384(c16092, abstractC9701M34451);
                return;
            case 11:
                this.f43014 = abstractC9701M34451.mo8027();
                this.f43029.m7062(89);
                m34439(c8598);
                return;
            default:
                C1446.m31698();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m34439(AbstractC7257 abstractC7257) {
        this.f43029.m7071(abstractC7257.f18924);
        C22004 c22004 = this.f43041;
        m34462(abstractC7257, c22004.f69210, this.f43019.f21691, C4848.m10276of((Object) c22004.f69208), true);
        this.f43029.m7062(87);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        C3088 c3088 = c11003.f5602;
        if (c3088.f5586 == 256) {
            this.f43014 = this.f43042.mo7980(c11003);
            return;
        }
        if (c11003.m16617(EnumC19998.f60789)) {
            C8360 c8360M34449 = m34449(c11003.f30470, 8);
            if (!c8360M34449.m19299()) {
                C11714 c11714M19304 = c8360M34449.m19304();
                this.f43029.m7049(c8360M34449.f22364);
                C8360 c8360M344410 = m34449(c11003.f30469, 16);
                C16091 c16091 = this.f43013;
                int i = c8360M344410.f22363;
                C11714 c11714 = c8360M344410.f22364;
                C11714 c11714M7021 = C3666.m7021(c11714M19304, c8360M344410.f22361);
                c16091.getClass();
                this.f43014 = new C8360(c16091, i, c11714, c11714M7021);
                return;
            }
            this.f43014 = c8360M34449;
            return;
        }
        if (c11003.m16617(EnumC19998.f60703)) {
            C8360 c8360M344411 = m34449(c11003.f30470, 8);
            if (c8360M344411.f22361 != null || c8360M344411.f22363 != 167) {
                C11714 c11714M19300 = c8360M344411.m19300();
                this.f43029.m7049(c8360M344411.f22361);
                C8360 c8360M344412 = m34449(c11003.f30469, 16);
                C16091 c16092 = this.f43013;
                int i2 = c8360M344412.f22363;
                C11714 c11714M7022 = C3666.m7021(c11714M19300, c8360M344412.f22364);
                C11714 c11715 = c8360M344412.f22361;
                c16092.getClass();
                this.f43014 = new C8360(c16092, i2, c11714M7022, c11715);
                return;
            }
            this.f43014 = c8360M344411;
            return;
        }
        m34451((AbstractC6462) c3088.f20406.mo14797().f11034, c11003.f30470).mo8027();
        this.f43014 = m34452((AbstractC7257) c11003.f30469, c3088);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 m34452(AbstractC7257 abstractC7257, C3088 c3088) {
        AbstractC6462 abstractC6462;
        C12497 c12497 = (C12497) c3088.f20406;
        int i = c3088.f5586;
        if (i >= 159 && i <= 164) {
            Object objMo14779 = abstractC7257.f18925.mo14779();
            if ((objMo14779 instanceof Number) && ((Number) objMo14779).intValue() == 0) {
                i -= 6;
            } else if (i >= 165) {
                abstractC6462 = (AbstractC6462) c3088.mo18010(this.f43010).mo14797().f11035.f11034;
                if (i >= 270) {
                    i -= 150;
                    abstractC6462 = this.f43041.f69134;
                }
                m34451(abstractC6462, abstractC7257).mo8027();
                if (i >= 512) {
                    this.f43029.m7062(i >> 9);
                    i &= 255;
                }
            } else {
                abstractC6462 = (AbstractC6462) c3088.mo18010(this.f43010).mo14797().f11035.f11034;
                if (i >= 270) {
                    i -= 150;
                    abstractC6462 = this.f43041.f69134;
                }
                m34451(abstractC6462, abstractC7257).mo8027();
                if (i >= 512) {
                    this.f43029.m7062(i >> 9);
                    i &= 255;
                }
            }
        } else if (i >= 165 || i > 166 || !C9268.m21395(abstractC7257)) {
            abstractC6462 = (AbstractC6462) c3088.mo18010(this.f43010).mo14797().f11035.f11034;
            if (i >= 270 && i <= 275) {
                i -= 150;
                abstractC6462 = this.f43041.f69134;
            }
            m34451(abstractC6462, abstractC7257).mo8027();
            if (i >= 512) {
                this.f43029.m7062(i >> 9);
                i &= 255;
            }
        } else {
            i += 33;
        }
        if ((i >= 153 && i <= 166) || i == 198 || i == 199) {
            return this.f43013.m36600(i);
        }
        this.f43029.m7062(i);
        return this.f43013.m36601(c12497.f35031);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        this.f43014 = m34451(c19327.f57709.f18925, c19327.f57710).mo8027();
        m34437(c19327.f18924);
        if (c19327.f57709.f18925.mo14805()) {
            return;
        }
        AbstractC6462 abstractC6462 = c19327.f57710.f18925;
        AbstractC6462 abstractC6463 = c19327.f57709.f18925;
        C8374 c8374 = this.f43010;
        if (c8374.m19490(abstractC6462, abstractC6463)) {
            return;
        }
        if (c8374.m19467(c19327.f57709.f18925.f16705, c19327.f57710.f18925) == null) {
            C3666 c3666 = this.f43029;
            AbstractC6462 abstractC6464 = c19327.f57709.f18925;
            m34438(c19327, abstractC6464);
            c3666.m7043(192, c3666.f7740.m31949(abstractC6464), (InterfaceC22798) abstractC6464);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3821(C17314 c17314) {
        throw new AssertionError(C15065.class.getName());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        AbstractC14355 abstractC14355 = c17846.f53242;
        m34451(abstractC14355.f18925, abstractC14355).mo8027();
        m34437(c17846.f18924);
        this.f43029.m7043(193, m34445((InterfaceC5323) c17846, c17846.f53243.f18925), (InterfaceC22798) null);
        this.f43014 = this.f43013.m36601(this.f43041.f69151);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3817(C16366 c16366) {
        AbstractC14355 abstractC14355 = c16366.f48093;
        m34451(abstractC14355.f18925, abstractC14355).mo8027();
        m34451(this.f43041.f69134, c16366.f48092).mo8027();
        C16091 c16091 = this.f43013;
        AbstractC6462 abstractC6462 = c16366.f18925;
        c16091.getClass();
        this.f43014 = new C15735(c16091, abstractC6462);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        EnumC3600 enumC3600;
        AbstractC7783 abstractC7783M34448 = c9661.f26611;
        AbstractC12224 abstractC12224 = c9661.f26610;
        C8200 c8200 = this.f43019;
        AbstractC12224 abstractC12225 = c8200.f21744;
        if (abstractC12224 == abstractC12225 || abstractC12224 == c8200.f21756) {
            AbstractC9701 abstractC9701M36603 = abstractC12224 == abstractC12225 ? this.f43013.m36603() : this.f43013.m36602();
            if (abstractC7783M34448.f20405 == EnumC3600.f7343) {
                abstractC9701M36603.mo8027();
                C16091 c16091 = this.f43013;
                c16091.getClass();
                abstractC9701M36603 = new C12740(c16091, abstractC7783M34448, true);
            }
            this.f43014 = abstractC9701M36603;
            return;
        }
        EnumC3600 enumC3601 = abstractC7783M34448.f20405;
        EnumC3600 enumC3602 = EnumC3600.f7343;
        if ((enumC3601 == enumC3602 && (((C5771) abstractC7783M34448) instanceof C11136)) || m34436(abstractC7783M34448)) {
            if (m34436(abstractC7783M34448)) {
                m34437(c9661.f18924);
            }
            C16091 c16092 = this.f43013;
            c16092.getClass();
            this.f43014 = new C13725(c16092, abstractC7783M34448);
            return;
        }
        EnumC3600 enumC3603 = abstractC7783M34448.f20405;
        EnumC3600 enumC3604 = EnumC3600.f7339;
        if (enumC3603 == enumC3604 && ((enumC3600 = abstractC7783M34448.f20407.f20405) == enumC3602 || enumC3600 == enumC3604)) {
            this.f43014 = this.f43013.m36599((C13818) abstractC7783M34448);
            return;
        }
        if ((abstractC7783M34448.mo18003() & 8) != 0) {
            if (!m34442(this.f43020.f8853)) {
                abstractC7783M34448 = m34448(abstractC7783M34448, this.f43020.f8855.f18925);
            }
            C16091 c16093 = this.f43013;
            c16093.getClass();
            this.f43014 = new C18774(c16093, abstractC7783M34448);
            return;
        }
        this.f43013.m36603().mo8027();
        AbstractC7783 abstractC7783M34449 = m34448(abstractC7783M34448, this.f43020.f8855.f18925);
        C16091 c16094 = this.f43013;
        boolean zM34441 = m34441(abstractC7783M34449);
        c16094.getClass();
        this.f43014 = new C12740(c16094, abstractC7783M34449, zM34441);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m34441(AbstractC7783 abstractC7783) {
        return (!this.f43028.m29251() || this.f43038) && (abstractC7783.mo18003() & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        AbstractC9701 abstractC9701M34451;
        AbstractC7783 abstractC7783 = c8320.f22260;
        AbstractC12224 abstractC12224 = c8320.f22259;
        C8200 c8200 = this.f43019;
        if (abstractC12224 == c8200.f21752) {
            C3666 c3666 = this.f43029;
            AbstractC6462 abstractC6462 = c8320.f22261.f18925;
            m34438(c8320, abstractC6462);
            c3666.m7047((InterfaceC10057) abstractC6462);
            this.f43014 = this.f43013.m36601(this.f43040);
            return;
        }
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c8320.f22261);
        boolean z = abstractC7783M21438 != null && (abstractC7783M21438.f20405 == EnumC3600.f7354 || abstractC7783M21438.f20408 == c8200.f21756);
        boolean zM34442 = m34442(this.f43020.f8853);
        if (z) {
            abstractC9701M34451 = this.f43013.m36602();
        } else {
            AbstractC7257 abstractC7257 = c8320.f22261;
            abstractC9701M34451 = m34451(abstractC7257.f18925, abstractC7257);
        }
        if (abstractC7783.f20405 == EnumC3600.f7339) {
            C13818 c13818 = (C13818) abstractC7783;
            if (c13818.m31487() != null) {
                if ((abstractC7783.mo18003() & 8) != 0) {
                    if (!z && (abstractC7783M21438 == null || abstractC7783M21438.f20405 != EnumC3600.f7354)) {
                        abstractC9701M34451 = abstractC9701M34451.mo8027();
                    }
                    abstractC9701M34451.mo19298();
                } else {
                    abstractC9701M34451.mo8027();
                    m34439(c8320.f22261);
                }
                C16091 c16091 = this.f43013;
                AbstractC6462 abstractC6463 = abstractC7783.f20406;
                Object objM31487 = c13818.m31487();
                c16091.getClass();
                this.f43014 = new C24453(c16091, abstractC6463, objM31487);
                return;
            }
        }
        if (abstractC7783.f20405 == EnumC3600.f7343 && (((C5771) abstractC7783) instanceof C11136)) {
            C16091 c16092 = this.f43013;
            c16092.getClass();
            this.f43014 = new C13725(c16092, abstractC7783);
            return;
        }
        AbstractC7783 abstractC7783M34448 = m34448(abstractC7783, c8320.f22261.f18925);
        if ((abstractC7783M34448.mo18003() & 8) != 0) {
            if (!z && (abstractC7783M21438 == null || abstractC7783M21438.f20405 != EnumC3600.f7354)) {
                abstractC9701M34451 = abstractC9701M34451.mo8027();
            }
            abstractC9701M34451.mo19298();
            C16091 c16093 = this.f43013;
            c16093.getClass();
            this.f43014 = new C18774(c16093, abstractC7783M34448);
            return;
        }
        abstractC9701M34451.mo8027();
        C22004 c22004 = this.f43041;
        if (abstractC7783M34448 == c22004.f69214) {
            this.f43029.m7062(190);
            this.f43014 = this.f43013.m36601(c22004.f69134);
        } else {
            C16091 c16094 = this.f43013;
            boolean z2 = m34441(abstractC7783M34448) || z || zM34442;
            c16094.getClass();
            this.f43014 = new C12740(c16094, abstractC7783M34448, z2);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3840(C24552 c24552) {
        if (c24552.f18925.m14777(EnumC11353.BOT)) {
            this.f43029.m7062(1);
            this.f43014 = this.f43013.m36601(c24552.f18925);
            return;
        }
        C16091 c16091 = this.f43013;
        AbstractC6462 abstractC6462 = c24552.f18925;
        Object obj = c24552.f77744;
        c16091.getClass();
        this.f43014 = new C24453(c16091, abstractC6462, obj);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3789(C5916 c5916) {
        this.f43029.m7070();
        C3666 c3666 = this.f43029;
        int i = c3666.f7755;
        int iM7052 = c3666.m7052(c3666.f7742.f20157);
        try {
            m34457(c5916.f14604, this.f43020);
            this.f43029.m7052(iM7052);
            AbstractC14355 abstractC14355 = c5916.f14606;
            this.f43014 = m34451(abstractC14355.f18925, abstractC14355).mo8027();
            this.f43029.m7065(i);
        } catch (Throwable th) {
            this.f43029.m7052(iM7052);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m34464(C4036 c4036, C7650 c7650) {
        HashMap map = this.f43037;
        try {
            this.f43032 = c4036;
            C15828 c15828 = c7650.f20027;
            C3626 c3626 = c4036.f8851;
            this.f43018 = c3626;
            this.f43021 = c3626.f7514;
            c7650.f20020 = m34447(c15828, c7650.f20020);
            C4848 c4848 = (C4848) this.f43007.f77564.get(c15828);
            if (c4848 != null) {
                Iterator it = c4848.iterator();
                while (it.hasNext()) {
                    ((AbstractC7257) it.next()).mo3382(this.f43033);
                }
            }
            C4036 c4037 = new C4036(c7650, new C7019());
            c4037.f8851 = c4036.f8851;
            c4037.f8855 = c7650;
            for (C4848 c4849 = c7650.f20020; c4849.m10293(); c4849 = c4849.f11035) {
                m34460((AbstractC7257) c4849.f11034, c4037);
            }
            if (this.f43039.f39897.f42044 > 65535) {
                this.f43036.m9352(c7650, C8300.f22081);
                this.f43030++;
            }
            if (this.f43030 != 0) {
                for (C4848 c48410 = c7650.f20020; c48410.m10293(); c48410 = c48410.f11035) {
                    if (((AbstractC7257) c48410.f11034).m16617(EnumC19998.f60735)) {
                        ((C10471) c48410.f11034).f28960.f14173 = null;
                    }
                }
            }
            c7650.f20020 = C4848.m10283();
            return this.f43030 == 0;
        } finally {
            this.f43032 = null;
            this.f43020 = null;
            this.f43018 = null;
            this.f43021 = null;
            this.f43030 = 0;
            map.clear();
        }
    }

    public C15065(C5127 c5127) {
        boolean zM30877;
        c5127.m10908(f43006, this);
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f43019 = c8200M18988;
        this.f43036 = C23623.m52439(c5127);
        C22004 c22004M49577 = C22004.m49577(c5127);
        this.f43041 = c22004M49577;
        this.f43034 = C16852.m38215(c5127);
        this.f43012 = C23663.m52629(c5127);
        this.f43015 = C18537.m42139(c5127);
        EnumC12720 enumC12720M29246 = EnumC12720.m29246(c5127);
        this.f43028 = enumC12720M29246;
        C8374 c8374M19396 = C8374.m19396(c5127);
        this.f43010 = c8374M19396;
        AbstractC4002 c9386 = (AbstractC4002) c5127.m10905(AbstractC4002.f8726);
        if (c9386 == null) {
            EnumC12720 enumC12720M29247 = EnumC12720.m29246(c5127);
            String strM30872 = C13565.m30871(c5127).m30872("stringConcat");
            if (enumC12720M29247.m29256()) {
                if (strM30872 == null) {
                    strM30872 = "indyWithConstants";
                }
            } else {
                if (strM30872 != null && !"inline".equals(strM30872)) {
                    C1446.m31702("StringConcatFactory-based string concat is requested on a platform that does not support it.");
                    throw null;
                }
                strM30872 = "inline";
            }
            switch (strM30872) {
                case "inline":
                    c9386 = new C9386(c5127);
                    break;
                case "indy":
                    c9386 = new C15420(c5127);
                    break;
                case "indyWithConstants":
                    c9386 = new C24138(c5127);
                    break;
                default:
                    C1446.m31702("Unknown stringConcat: ".concat(strM30872));
                    throw null;
            }
        }
        this.f43042 = c9386;
        this.f43008 = new C12497(null, null, null, c22004M49577.f69163);
        this.f43009 = c8200M18988.f21738.m32717(C0655am.f2262Q + enumC12720M29246.m29249());
        this.f43007 = C24507.m54026(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        EnumC2483 enumC2483 = EnumC2483.f3978;
        this.f43035 = c13565M30871.m30884(enumC2483) || c13565M30871.m30877(enumC2483, "lines");
        if (c13565M30871.m30884(enumC2483)) {
            zM30877 = c13565M30871.m30880(EnumC2483.f3954);
        } else {
            zM30877 = c13565M30871.m30877(enumC2483, "vars");
        }
        this.f43024 = zM30877;
        this.f43031 = c13565M30871.m30880(EnumC2483.f3967);
        this.f43017 = c13565M30871.m30879("debug.code");
        this.f43038 = c13565M30871.m30879("disableVirtualizedPrivateInvoke");
        this.f43039 = new C14080(c8374M19396, c8200M18988);
        this.f43026 = EnumC21102.f66305;
        this.f43023 = C15099.m34493(c5127);
        this.f43037 = new HashMap();
    }
}
