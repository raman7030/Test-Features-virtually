package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public class C7389 extends AbstractC20130 {

    /* JADX INFO: renamed from: ۧ */
    public C4848 f19352;

    /* JADX INFO: renamed from: ܳ */
    public C4848 f19353;

    /* JADX INFO: renamed from: ܽ */
    public C7650 f19354;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12083 f19355;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f19356;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
    }

    @Override // p067l.AbstractC20130
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17118() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX INFO: renamed from: ܿ */
    public final void m17117() {
        C6048 c6048 = (C6048) this.f62320.m45782();
        while (c6048 != null) {
            AbstractC7257 abstractC7257 = c6048.f15194;
            boolean z = c6048 instanceof C2694;
            C12083 c12083 = this.f19355;
            if (z) {
                AbstractC6462 abstractC6462 = ((C2694) c6048).f4531;
                C7650 c7650 = this.f19354;
                if (c7650 != null && c7650.f18924 == abstractC7257.f18924) {
                    C23623 c23623 = c12083.f33667;
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(abstractC7257, new C14040("compiler", "unreported.exception.default.constructor", abstractC6462));
                } else if (abstractC7257.m16617(EnumC19998.f60802)) {
                    C11281 c11281 = (C11281) abstractC7257;
                    if (c11281.f31438.m31484()) {
                        C23623 c23624 = c12083.f33667;
                        AbstractC12224 abstractC12224 = c11281.f31438.f20408;
                        C14040 c14041 = C8300.f21997;
                        c23624.m9352(abstractC7257, new C14040("compiler", "unreported.exception.implicit.close", abstractC6462, abstractC12224));
                    } else {
                        C23623 c23625 = c12083.f33667;
                        C14040 c14042 = C8300.f21997;
                        c23625.m9352(abstractC7257, new C14040("compiler", "unreported.exception.need.to.catch.or.throw", abstractC6462));
                    }
                } else {
                    C23623 c23626 = c12083.f33667;
                    C14040 c14043 = C8300.f21997;
                    c23626.m9352(abstractC7257, new C14040("compiler", "unreported.exception.need.to.catch.or.throw", abstractC6462));
                }
            } else {
                C23623 c23627 = c12083.f33667;
                abstractC7257.getClass();
                C1446.m31704(c23627.m52456(abstractC7257));
            }
            c6048 = (C6048) this.f62320.m45782();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17116(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257) {
        boolean zM38345;
        C12083 c12083 = this.f19355;
        C16852 c16852 = c12083.f33668;
        c16852.getClass();
        boolean z = true;
        try {
            zM38345 = c16852.m38345(abstractC6462);
        } catch (C21865 e) {
            c16852.m38271(abstractC7257, e);
            zM38345 = true;
        }
        if (zM38345) {
            return;
        }
        C16852 c16853 = c12083.f33668;
        C4848 c4848 = this.f19352;
        if (!c16853.m38345(abstractC6462) && !c16853.m38361(abstractC6462, c4848)) {
            z = false;
        }
        if (!z) {
            C20271 c20271 = this.f62320;
            C2694 c2694 = new C2694(abstractC7257);
            c2694.f4531 = abstractC6462;
            c20271.m45777(c2694);
        }
        this.f19353 = c12083.f33668.m38333(abstractC6462, this.f19353);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3617(C7650 c7650) {
        if (c7650.f20027 == null) {
            return;
        }
        C7650 c7651 = this.f19354;
        C4848 c4848M38355 = this.f19353;
        C4848 c4848 = this.f19352;
        C20271 c20271 = this.f62320;
        C12083 c12083 = this.f19355;
        C6953 c6953 = c12083.f33669;
        boolean z = c7650.f20021 == c12083.f33663.f21725;
        this.f62320 = new C20271();
        if (!z) {
            this.f19352 = C4848.m10283();
        }
        this.f19354 = c7650;
        this.f19353 = C4848.m10283();
        c12083.f33669 = c12083.f33669.m15933(c7650.f20027);
        try {
            for (C4848 c4849 = c7650.f20020; c4849.m10293(); c4849 = c4849.f11035) {
                if (!((AbstractC7257) c4849.f11034).m16617(EnumC19998.f60735) && (C9268.m21439((AbstractC7257) c4849.f11034) & 8) != 0) {
                    mo12739((AbstractC7257) c4849.f11034);
                    m17117();
                }
            }
            if (!z) {
                boolean z2 = true;
                for (C4848 c48410 = c7650.f20020; c48410.m10293(); c48410 = c48410.f11035) {
                    if (C9268.m21435((AbstractC7257) c48410.f11034)) {
                        C4848 c4848Mo14794 = ((C10471) c48410.f11034).f28960.f20406.mo14794();
                        if (z2) {
                            this.f19352 = c4848Mo14794;
                            z2 = false;
                        } else {
                            this.f19352 = c12083.f33668.m38348(c4848Mo14794, this.f19352);
                        }
                    }
                }
            }
            for (C4848 c48411 = c7650.f20020; c48411.m10293(); c48411 = c48411.f11035) {
                if (!((AbstractC7257) c48411.f11034).m16617(EnumC19998.f60735) && (C9268.m21439((AbstractC7257) c48411.f11034) & 8) == 0) {
                    mo12739((AbstractC7257) c48411.f11034);
                    m17117();
                }
            }
            if (z) {
                for (C4848 c48412 = c7650.f20020; c48412.m10293(); c48412 = c48412.f11035) {
                    if (C9268.m21429((AbstractC7257) c48412.f11034)) {
                        C10471 c10471 = (C10471) c48412.f11034;
                        mo12739(c10471);
                        c10471.f28957 = c12083.f33672.m42210(this.f19353);
                        c10471.f28960.f20406 = c12083.f33664.m19464(c10471.f28960.f20406, this.f19353);
                    }
                }
                c4848M38355 = c12083.f33668.m38355(this.f19353, c4848M38355);
            }
            for (C4848 c48413 = c7650.f20020; c48413.m10293(); c48413 = c48413.f11035) {
                if ((!z || !C9268.m21429((AbstractC7257) c48413.f11034)) && ((AbstractC7257) c48413.f11034).m16617(EnumC19998.f60735)) {
                    mo12739((AbstractC7257) c48413.f11034);
                    m17117();
                }
            }
            this.f19353 = c4848M38355;
        } finally {
            this.f62320 = c20271;
            this.f19352 = c4848;
            this.f19354 = c7651;
            c12083.f33669 = c6953;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        boolean z;
        if (c10471.f28958 == null) {
            return;
        }
        C4848 c4848 = this.f19352;
        C4848 c4848Mo14794 = c10471.f28960.f20406.mo14794();
        C12083 c12083 = this.f19355;
        C6953 c6953 = c12083.f33669;
        c12083.f33669 = c12083.f33669.m15933(c10471.f28960);
        C1446.m31704(this.f62320.isEmpty());
        try {
            for (C4848 c4849 = c10471.f28963; c4849.m10293(); c4849 = c4849.f11035) {
                mo12739((C11281) c4849.f11034);
            }
            if (C9268.m21435(c10471)) {
                this.f19352 = c12083.f33668.m38355(this.f19352, c4848Mo14794);
            } else if ((c10471.f28960.f20409 & 1048584) != 1048576) {
                this.f19352 = c4848Mo14794;
            }
            mo12739(c10471.f28958);
            C4848 c4848M45783 = this.f62320.m45783();
            this.f62320 = new C20271();
            while (c4848M45783.m10293()) {
                C6048 c6048 = (C6048) c4848M45783.f11034;
                c4848M45783 = c4848M45783.f11035;
                if (!(c6048 instanceof C2694)) {
                    if (!c6048.f15194.m16617(EnumC19998.f60754)) {
                        C23623 c23623 = c12083.f33667;
                        AbstractC7257 abstractC7257 = c6048.f15194;
                        abstractC7257.getClass();
                        z = c23623.m52456(abstractC7257);
                    }
                    C1446.m31704(z);
                } else {
                    this.f62320.m45777(c6048);
                }
            }
        } finally {
            this.f19352 = c4848;
            c12083.f33669 = c6953;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        if (c11281.f31436 != null) {
            C12083 c12083 = this.f19355;
            C6953 c6953 = c12083.f33669;
            c12083.f33669 = c12083.f33669.m15933(c11281.f31438);
            try {
                mo12739(c11281.f31436);
            } finally {
                c12083.f33669 = c6953;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        m35992(c4968.f11316);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(c21732.f68446);
        m45573(c21732);
        mo12739(c21732.f68447);
        m45569(c21732, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(c10610.f29370);
        mo12739(c10610.f29369);
        m45573(c10610);
        m45569(c10610, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        C20271 c20271 = this.f62320;
        m35992(c13685.f38597);
        this.f62320 = new C20271();
        AbstractC14355 abstractC14355 = c13685.f38598;
        if (abstractC14355 != null) {
            mo12739(abstractC14355);
        }
        mo12739(c13685.f38595);
        m45573(c13685);
        m35992(c13685.f38596);
        m45569(c13685, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        mo3805(c6979.f18157);
        C20271 c20271 = this.f62320;
        mo12739(c6979.f18158);
        this.f62320 = new C20271();
        mo12739(c6979.f18156);
        m45573(c6979);
        m45569(c6979, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(c19188.f57351);
        m45569(c19188, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        m17113(c23882, c23882.f75829, c23882.f75828);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        m17113(c15164, c15164.f43267, c15164.f43269);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17113(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355, C4848 c4848) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(abstractC14355);
        while (c4848.m10293()) {
            C20391 c20391 = (C20391) c4848.f11034;
            m35992(c20391.f63044);
            m35992(c20391.f63043);
            c4848 = c4848.f11035;
        }
        if (abstractC7257.m16617(EnumC19998.f60779)) {
            m45572(abstractC7257, c20271);
        } else {
            m45569(abstractC7257, c20271);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        C12083 c12083;
        C4848 c4848M10276of;
        C4848 c4848;
        Iterator it;
        C4848 c4849;
        C4848 c48410;
        boolean zM38345;
        C12895 c12895;
        C4848<AbstractC6462> c4848M10276of2;
        C4848 c4848M10276of3;
        C4848 c48411 = this.f19352;
        C4848 c48412 = this.f19353;
        this.f19353 = C4848.m10283();
        C4848 c48413 = c12622.f35425;
        while (true) {
            boolean zM10293 = c48413.m10293();
            c12083 = this.f19355;
            if (!zM10293) {
                break;
            }
            if (((C2955) c48413.f11034).f5147.f31437.m16617(EnumC19998.f60727)) {
                c4848M10276of3 = ((C24691) ((C2955) c48413.f11034).f5147.f31437).f78164;
            } else {
                c4848M10276of3 = C4848.m10276of((Object) ((C2955) c48413.f11034).f5147.f31437);
            }
            Iterator it2 = c4848M10276of3.iterator();
            while (it2.hasNext()) {
                this.f19352 = c12083.f33668.m38333(((AbstractC14355) it2.next()).f18925, this.f19352);
            }
            c48413 = c48413.f11035;
        }
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        for (AbstractC7257 abstractC7257 : c12622.f35422) {
            if (abstractC7257 instanceof C11281) {
                mo3805((C11281) abstractC7257);
            } else if (abstractC7257 instanceof AbstractC14355) {
                mo12739((AbstractC14355) abstractC7257);
            } else {
                throw new AssertionError(c12622);
            }
        }
        Iterator it3 = c12622.f35422.iterator();
        while (true) {
            boolean z = false;
            if (!it3.hasNext()) {
                break;
            }
            AbstractC7257 abstractC7258 = (AbstractC7257) it3.next();
            if (abstractC7258.f18925.mo7388()) {
                c4848M10276of2 = c12083.f33664.m19450(abstractC7258.f18925).m10290(c12083.f33664.m19502(abstractC7258.f18925));
            } else {
                c4848M10276of2 = C4848.m10276of((Object) abstractC7258.f18925);
            }
            for (AbstractC6462 abstractC6462 : c4848M10276of2) {
                if (c12083.f33664.m19467(c12083.f33665.f69213.f16705, abstractC6462) != null) {
                    C23663 c23663 = c12083.f33671;
                    C4036 c4036 = c12083.f33666;
                    AbstractC6462 abstractC6462M19466 = c12083.f33664.m19466(abstractC6462, z);
                    AbstractC12224 abstractC12224 = c12083.f33663.f21709;
                    C4848 c4848M10283 = C4848.m10283();
                    C4848 c4848M10284 = C4848.m10283();
                    c23663.getClass();
                    AbstractC7257 abstractC7259 = abstractC7258;
                    AbstractC7783 abstractC7783M52653 = c23663.m52653(c12622, c4036, abstractC6462M19466.f16705, abstractC6462M19466, abstractC12224, c4848M10283, c4848M10284);
                    AbstractC6462 abstractC6462M19483 = c12083.f33664.m19483(abstractC7783M52653, abstractC7259.f18925);
                    if (abstractC7783M52653.f20405 == EnumC3600.f7343) {
                        Iterator it4 = abstractC6462M19483.mo14794().iterator();
                        while (it4.hasNext()) {
                            m17116((AbstractC6462) it4.next(), abstractC7259);
                        }
                    }
                    abstractC7258 = abstractC7259;
                    z = false;
                }
            }
        }
        mo12739(c12622.f35421);
        C4848 c4848M38355 = c12083.f33668.m38355(this.f19353, C4848.m10277of((Object) c12083.f33665.f69135, (Object) c12083.f33665.f69174));
        this.f19353 = c48412;
        this.f19352 = c48411;
        C4848 c4848M10285 = C4848.m10283();
        C4848 c48414 = c12622.f35425;
        while (c48414.m10293()) {
            C11281 c11281 = ((C2955) c48414.f11034).f5147;
            if (c11281.f31437.m16617(EnumC19998.f60727)) {
                c4848M10276of = ((C24691) ((C2955) c48414.f11034).f5147.f31437).f78164;
            } else {
                c4848M10276of = C4848.m10276of((Object) ((C2955) c48414.f11034).f5147.f31437);
            }
            C4848 c4848M10286 = C4848.m10283();
            C4848 c4848M38332 = c12083.f33668.m38332(c4848M38355, c4848M10285);
            Iterator it5 = c4848M10276of.iterator();
            C4848 c4848M38333 = c4848M10285;
            C4848 c48415 = c4848M10286;
            while (it5.hasNext()) {
                AbstractC7257 abstractC72510 = (AbstractC14355) it5.next();
                AbstractC6462 abstractC6463 = abstractC72510.f18925;
                if (abstractC6463 != c12083.f33665.f69201) {
                    C4848 c4848M10287 = c48415.m10286(abstractC6463);
                    it = it5;
                    if (c12083.f33664.m19490(abstractC6463, c12083.f33665.f69208)) {
                        c4848 = c4848M10276of;
                        c4849 = c48412;
                        c48415 = c4848M10287;
                    } else {
                        if (c4848M10276of.m10289() <= 1) {
                            abstractC72510 = (C2955) c48414.f11034;
                            abstractC72510.getClass();
                        }
                        if (c12083.f33668.m38361(abstractC6463, c4848M38333)) {
                            C23623 c23623 = c12083.f33667;
                            C14040 c14040 = C8300.f21997;
                            c4848 = c4848M10276of;
                            c48410 = c4848M10287;
                            c4849 = c48412;
                            c23623.m9352(abstractC72510, new C14040("compiler", "except.already.caught", abstractC6463));
                        } else {
                            c4848 = c4848M10276of;
                            c4849 = c48412;
                            c48410 = c4848M10287;
                            C16852 c16852 = c12083.f33668;
                            c16852.getClass();
                            try {
                                zM38345 = c16852.m38345(abstractC6463);
                            } catch (C21865 e) {
                                c16852.m38271(abstractC72510, e);
                                zM38345 = true;
                            }
                            if (!zM38345 && !m17114(abstractC6463) && !c12083.f33668.m38354(abstractC6463, c4848M38355)) {
                                C23623 c23624 = c12083.f33667;
                                C14040 c14041 = C8300.f21997;
                                c23624.m9352(abstractC72510, new C14040("compiler", "except.never.thrown.in.try", abstractC6463));
                            } else {
                                C4848 c4848M38348 = c12083.f33668.m38348(C4848.m10276of((Object) abstractC6463), c4848M38355);
                                if (c12083.f33668.m38332(c4848M38348, c4848M38333).isEmpty() && !m17114(abstractC6463)) {
                                    if (c4848M38348.m10289() == 1) {
                                        C12895 c12896 = C15675.f45417;
                                        c12895 = new C12895("compiler", "unreachable.catch", c4848M38348);
                                    } else {
                                        C12895 c12897 = C15675.f45417;
                                        c12895 = new C12895("compiler", "unreachable.catch.1", c4848M38348);
                                    }
                                    c12083.f33667.m9364(abstractC72510, c12895);
                                }
                            }
                        }
                        c4848M38333 = c12083.f33668.m38333(abstractC6463, c4848M38333);
                        c48415 = c48410;
                    }
                } else {
                    c4848 = c4848M10276of;
                    it = it5;
                    c4849 = c48412;
                }
                it5 = it;
                c4848M10276of = c4848;
                c48412 = c4849;
            }
            mo12739(c11281);
            this.f19356.put(c11281.f31438, c12083.f33668.m38348(c48415, c4848M38332));
            mo12739(((C2955) c48414.f11034).f5146);
            this.f19356.remove(c11281.f31438);
            c48414 = c48414.f11035;
            c4848M10285 = c4848M38333;
        }
        C4848 c48416 = c48412;
        if (c12622.f35424 != null) {
            C4848 c48417 = this.f19353;
            this.f19353 = C4848.m10283();
            C20271 c20272 = this.f62320;
            this.f62320 = c20271;
            mo12739(c12622.f35424);
            if (!c12622.f35423) {
                this.f19353 = c12083.f33668.m38355(this.f19353, c48416);
                return;
            }
            this.f19353 = c12083.f33668.m38355(this.f19353, c12083.f33668.m38332(c4848M38355, c4848M10285));
            this.f19353 = c12083.f33668.m38355(this.f19353, c48417);
            while (c20272.m45784()) {
                this.f62320.m45777((C6048) c20272.m45782());
            }
            return;
        }
        this.f19353 = c12083.f33668.m38355(this.f19353, c12083.f33668.m38332(c4848M38355, c4848M10285));
        C20271 c20273 = this.f62320;
        this.f62320 = c20271;
        while (c20273.m45784()) {
            this.f62320.m45777((C6048) c20273.m45782());
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        mo12739(c3765.f7998);
        mo12739(c3765.f7999);
        AbstractC13154 abstractC13154 = c3765.f8000;
        if (abstractC13154 != null) {
            mo12739(abstractC13154);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m17114(AbstractC6462 abstractC6462) {
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        C12083 c12083 = this.f19355;
        return abstractC21195 == c12083.f33665.f69161.f16705 || abstractC6462.f16705 == c12083.f33665.f69172.f16705;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        m45570(new C6048(c6309));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        mo12739(c4575.f10248);
        m45570(new C6048(c4575));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        m45570(new C6048(c17036));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        mo12739(c11813.f32975);
        m45570(new C6048(c11813));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        mo12739(c3904.f8460);
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c3904.f8460);
        if (abstractC7783M21438 != null && abstractC7783M21438.f20405 == EnumC3600.f7339 && (abstractC7783M21438.mo18003() & 2199023255568L) != 0 && this.f19356.get(abstractC7783M21438) != null) {
            Iterator it = ((C4848) this.f19356.get(abstractC7783M21438)).iterator();
            while (it.hasNext()) {
                m17116((AbstractC6462) it.next(), c3904);
            }
            return;
        }
        m17116(c3904.f8460.f18925, c3904);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        mo12739(c17175.f51143);
        m35992(c17175.f51144);
        for (C4848 c4848Mo14794 = c17175.f51143.f18925.mo14794(); c4848Mo14794.m10293(); c4848Mo14794 = c4848Mo14794.f11035) {
            m17116((AbstractC6462) c4848Mo14794.f11034, c17175);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        mo12739(c20530.f63432);
        m35992(c20530.f63430);
        for (C4848 c4848Mo14794 = c20530.f63425.mo14794(); c4848Mo14794.m10293(); c4848Mo14794 = c4848Mo14794.f11035) {
            m17116((AbstractC6462) c4848Mo14794.f11034, c20530);
        }
        C4848 c4848 = this.f19352;
        try {
            if (c20530.f63428 != null) {
                for (C4848 c4848Mo14795 = c20530.f63427.f20406.mo14794(); c4848Mo14795.m10293(); c4848Mo14795 = c4848Mo14795.f11035) {
                    this.f19352 = this.f19355.f33668.m38333((AbstractC6462) c4848Mo14795.f11034, this.f19352);
                }
            }
            mo12739(c20530.f63428);
        } finally {
            this.f19352 = c4848;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3619(C15834 c15834) {
        boolean z;
        C12083 c12083 = this.f19355;
        AbstractC6462 abstractC6462 = c15834.f18925;
        if (abstractC6462 == null || !abstractC6462.mo14812()) {
            C4848 c4848 = this.f19352;
            C4848 c4849 = this.f19353;
            C20271 c20271 = this.f62320;
            try {
                this.f62320 = new C20271();
                this.f19352 = c15834.m53845(c12083.f33664).mo14794();
                this.f19353 = C4848.m10283();
                mo12739(c15834.f45864);
                C4848 c4848M45783 = this.f62320.m45783();
                this.f62320 = new C20271();
                while (c4848M45783.m10293()) {
                    C6048 c6048 = (C6048) c4848M45783.f11034;
                    c4848M45783 = c4848M45783.f11035;
                    if (!(c6048 instanceof C2694)) {
                        if (!c6048.f15194.m16617(EnumC19998.f60754)) {
                            C23623 c23623 = c12083.f33667;
                            AbstractC7257 abstractC7257 = c6048.f15194;
                            abstractC7257.getClass();
                            z = c23623.m52456(abstractC7257);
                        }
                        C1446.m31704(z);
                    } else {
                        this.f62320.m45777(c6048);
                    }
                }
                m17117();
            } finally {
                this.f62320 = c20271;
                this.f19352 = c4848;
                this.f19353 = c4849;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m17115(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        C12083 c12083 = this.f19355;
        try {
            c12083.f33666 = c4036;
            c12083.f33672 = c18537;
            this.f62320 = new C20271();
            this.f19356 = new HashMap();
            this.f19352 = null;
            this.f19353 = null;
            this.f19354 = null;
            mo12739(abstractC7257);
        } finally {
            this.f62320 = null;
            c12083.f33672 = null;
            this.f19352 = null;
            this.f19353 = null;
            this.f19354 = null;
        }
    }

    public C7389(C12083 c12083) {
        this.f19355 = c12083;
    }
}
