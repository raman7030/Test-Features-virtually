package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public class C5283 extends AbstractC18689 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f16515;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f16516;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5557 f16517;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f16518;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f16519;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
    }

    @Override // l.AbstractC18689
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo15215() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15214() {
        C3872 c3872 = (C3872) this.f59097.m43516();
        while (c3872 != null) {
            AbstractC5144 abstractC5144 = c3872.f12387;
            boolean z = c3872 instanceof C0343;
            C10222 c10222 = this.f16518;
            if (z) {
                AbstractC4308 abstractC4308 = ((C0343) c3872).f1755;
                C5557 c5557 = this.f16517;
                if (c5557 != null && c5557.f16085 == abstractC5144.f16085) {
                    C22364 c22364 = c10222.f30706;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(abstractC5144, new C12281("compiler", "unreported.exception.default.constructor", abstractC4308));
                } else if (abstractC5144.m14709(EnumC18550.f57578)) {
                    C9378 c9378 = (C9378) abstractC5144;
                    if (c9378.f28489.m29422()) {
                        C22364 c22365 = c10222.f30706;
                        AbstractC10370 abstractC10370 = c9378.f28489.f17562;
                        C12281 c12282 = C6241.f19132;
                        c22365.m7273(abstractC5144, new C12281("compiler", "unreported.exception.implicit.close", abstractC4308, abstractC10370));
                    } else {
                        C22364 c22366 = c10222.f30706;
                        C12281 c12283 = C6241.f19132;
                        c22366.m7273(abstractC5144, new C12281("compiler", "unreported.exception.need.to.catch.or.throw", abstractC4308));
                    }
                } else {
                    C22364 c22367 = c10222.f30706;
                    C12281 c12284 = C6241.f19132;
                    c22367.m7273(abstractC5144, new C12281("compiler", "unreported.exception.need.to.catch.or.throw", abstractC4308));
                }
            } else {
                C22364 c22368 = c10222.f30706;
                abstractC5144.getClass();
                C12171.m29642(c22368.m50116(abstractC5144));
            }
            c3872 = (C3872) this.f59097.m43516();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15213(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144) {
        boolean zM36184;
        C10222 c10222 = this.f16518;
        C15240 c15240 = c10222.f30707;
        c15240.getClass();
        boolean z = true;
        try {
            zM36184 = c15240.m36184(abstractC4308);
        } catch (C20515 e) {
            c15240.m36110(abstractC5144, e);
            zM36184 = true;
        }
        if (zM36184) {
            return;
        }
        C15240 c15241 = c10222.f30707;
        C2609 c2609 = this.f16515;
        if (!c15241.m36184(abstractC4308) && !c15241.m36200(abstractC4308, c2609)) {
            z = false;
        }
        if (!z) {
            C18837 c18837 = this.f59097;
            C0343 c0343 = new C0343(abstractC5144);
            c0343.f1755 = abstractC4308;
            c18837.m43511(c0343);
        }
        this.f16516 = c10222.f30707.m36172(abstractC4308, this.f16516);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1215(C5557 c5557) {
        if (c5557.f17186 == null) {
            return;
        }
        C5557 c5558 = this.f16517;
        C2609 c2609M36194 = this.f16516;
        C2609 c2609 = this.f16515;
        C18837 c18837 = this.f59097;
        C10222 c10222 = this.f16518;
        C4824 c4824 = c10222.f30708;
        boolean z = c5557.f17180 == c10222.f30702.f18867;
        this.f59097 = new C18837();
        if (!z) {
            this.f16515 = C2609.m8239();
        }
        this.f16517 = c5557;
        this.f16516 = C2609.m8239();
        c10222.f30708 = c10222.f30708.m14053(c5557.f17186);
        try {
            for (C2609 c26010 = c5557.f17179; c26010.m8249(); c26010 = c26010.f8241) {
                if (!((AbstractC5144) c26010.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26010.f8240) & 8) != 0) {
                    mo10758((AbstractC5144) c26010.f8240);
                    m15214();
                }
            }
            if (!z) {
                boolean z2 = true;
                for (C2609 c26011 = c5557.f17179; c26011.m8249(); c26011 = c26011.f8241) {
                    if (C7260.m19469((AbstractC5144) c26011.f8240)) {
                        C2609 c2609Mo12930 = ((C8526) c26011.f8240).f26045.f17560.mo12930();
                        if (z2) {
                            this.f16515 = c2609Mo12930;
                            z2 = false;
                        } else {
                            this.f16515 = c10222.f30707.m36187(c2609Mo12930, this.f16515);
                        }
                    }
                }
            }
            for (C2609 c26012 = c5557.f17179; c26012.m8249(); c26012 = c26012.f8241) {
                if (!((AbstractC5144) c26012.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26012.f8240) & 8) == 0) {
                    mo10758((AbstractC5144) c26012.f8240);
                    m15214();
                }
            }
            if (z) {
                for (C2609 c26013 = c5557.f17179; c26013.m8249(); c26013 = c26013.f8241) {
                    if (C7260.m19463((AbstractC5144) c26013.f8240)) {
                        C8526 c8526 = (C8526) c26013.f8240;
                        mo10758(c8526);
                        c8526.f26042 = c10222.f30711.m39967(this.f16516);
                        c8526.f26045.f17560 = c10222.f30703.m17524(c8526.f26045.f17560, this.f16516);
                    }
                }
                c2609M36194 = c10222.f30707.m36194(this.f16516, c2609M36194);
            }
            for (C2609 c26014 = c5557.f17179; c26014.m8249(); c26014 = c26014.f8241) {
                if ((!z || !C7260.m19463((AbstractC5144) c26014.f8240)) && ((AbstractC5144) c26014.f8240).m14709(EnumC18550.f57511)) {
                    mo10758((AbstractC5144) c26014.f8240);
                    m15214();
                }
            }
            this.f16516 = c2609M36194;
        } finally {
            this.f59097 = c18837;
            this.f16515 = c2609;
            this.f16517 = c5558;
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        boolean z;
        if (c8526.f26043 == null) {
            return;
        }
        C2609 c2609 = this.f16515;
        C2609 c2609Mo12930 = c8526.f26045.f17560.mo12930();
        C10222 c10222 = this.f16518;
        C4824 c4824 = c10222.f30708;
        c10222.f30708 = c10222.f30708.m14053(c8526.f26045);
        C12171.m29642(this.f59097.isEmpty());
        try {
            for (C2609 c26010 = c8526.f26048; c26010.m8249(); c26010 = c26010.f8241) {
                mo10758((C9378) c26010.f8240);
            }
            if (C7260.m19469(c8526)) {
                this.f16515 = c10222.f30707.m36194(this.f16515, c2609Mo12930);
            } else if ((c8526.f26045.f17563 & 1048584) != 1048576) {
                this.f16515 = c2609Mo12930;
            }
            mo10758(c8526.f26043);
            C2609 c2609M43517 = this.f59097.m43517();
            this.f59097 = new C18837();
            while (c2609M43517.m8249()) {
                C3872 c3872 = (C3872) c2609M43517.f8240;
                c2609M43517 = c2609M43517.f8241;
                if (!(c3872 instanceof C0343)) {
                    if (!c3872.f12387.m14709(EnumC18550.f57530)) {
                        C22364 c22364 = c10222.f30706;
                        AbstractC5144 abstractC5144 = c3872.f12387;
                        abstractC5144.getClass();
                        z = c22364.m50116(abstractC5144);
                    }
                    C12171.m29642(z);
                } else {
                    this.f59097.m43511(c3872);
                }
            }
        } finally {
            this.f16515 = c2609;
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        if (c9378.f28487 != null) {
            C10222 c10222 = this.f16518;
            C4824 c4824 = c10222.f30708;
            c10222.f30708 = c10222.f30708.m14053(c9378.f28489);
            try {
                mo10758(c9378.f28487);
            } finally {
                c10222.f30708 = c4824;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        m33860(c2735.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c20374.f65770);
        m43307(c20374);
        mo10758(c20374.f65771);
        m43303(c20374, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c8672.f26445);
        mo10758(c8672.f26444);
        m43307(c8672);
        m43303(c8672, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C18837 c18837 = this.f59097;
        m33860(c11907.f35587);
        this.f59097 = new C18837();
        AbstractC12612 abstractC12612 = c11907.f35588;
        if (abstractC12612 != null) {
            mo10758(abstractC12612);
        }
        mo10758(c11907.f35585);
        m43307(c11907);
        m33860(c11907.f35586);
        m43303(c11907, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        mo1392(c4851.f15325);
        C18837 c18837 = this.f59097;
        mo10758(c4851.f15326);
        this.f59097 = new C18837();
        mo10758(c4851.f15324);
        m43307(c4851);
        m43303(c4851, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c17698.f54159);
        m43303(c17698, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m15210(c22637, c22637.f73103, c22637.f73102);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m15210(c13464, c13464.f40197, c13464.f40199);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15210(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(abstractC12612);
        while (c2609.m8249()) {
            C18963 c18963 = (C18963) c2609.f8240;
            m33860(c18963.f59815);
            m33860(c18963.f59814);
            c2609 = c2609.f8241;
        }
        if (abstractC5144.m14709(EnumC18550.f57555)) {
            m43306(abstractC5144, c18837);
        } else {
            m43303(abstractC5144, c18837);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C10222 c10222;
        C2609 c2609Of;
        C2609 c2609;
        Iterator it;
        C2609 c26010;
        C2609 c26011;
        boolean zM36184;
        C11076 c11076;
        C2609<AbstractC4308> c2609Of2;
        C2609 c2609Of3;
        C2609 c26012 = this.f16515;
        C2609 c26013 = this.f16516;
        this.f16516 = C2609.m8239();
        C2609 c26014 = c10789.f32449;
        while (true) {
            boolean zM8249 = c26014.m8249();
            c10222 = this.f16518;
            if (!zM8249) {
                break;
            }
            if (((C0617) c26014.f8240).f2373.f28488.m14709(EnumC18550.f57503)) {
                c2609Of3 = ((C23488) ((C0617) c26014.f8240).f2373.f28488).f75416;
            } else {
                c2609Of3 = C2609.of((Object) ((C0617) c26014.f8240).f2373.f28488);
            }
            Iterator it2 = c2609Of3.iterator();
            while (it2.hasNext()) {
                this.f16515 = c10222.f30707.m36172(((AbstractC12612) it2.next()).f16086, this.f16515);
            }
            c26014 = c26014.f8241;
        }
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        for (AbstractC5144 abstractC5144 : c10789.f32446) {
            if (abstractC5144 instanceof C9378) {
                mo1392((C9378) abstractC5144);
            } else if (abstractC5144 instanceof AbstractC12612) {
                mo10758((AbstractC12612) abstractC5144);
            } else {
                throw new AssertionError(c10789);
            }
        }
        Iterator it3 = c10789.f32446.iterator();
        while (true) {
            boolean z = false;
            if (!it3.hasNext()) {
                break;
            }
            AbstractC5144 abstractC5145 = (AbstractC5144) it3.next();
            if (abstractC5145.f16086.mo5146()) {
                c2609Of2 = c10222.f30703.m17510(abstractC5145.f16086).m8246(c10222.f30703.m17562(abstractC5145.f16086));
            } else {
                c2609Of2 = C2609.of((Object) abstractC5145.f16086);
            }
            for (AbstractC4308 abstractC4308 : c2609Of2) {
                if (c10222.f30703.m17527(c10222.f30704.f66531.f13890, abstractC4308) != null) {
                    C22406 c22406 = c10222.f30710;
                    C1755 c1755 = c10222.f30705;
                    AbstractC4308 abstractC4308M17526 = c10222.f30703.m17526(abstractC4308, z);
                    AbstractC10370 abstractC10370 = c10222.f30702.f18851;
                    C2609 c2609M8239 = C2609.m8239();
                    C2609 c2609M82310 = C2609.m8239();
                    c22406.getClass();
                    AbstractC5144 abstractC5146 = abstractC5145;
                    AbstractC5698 abstractC5698M50313 = c22406.m50313(c10789, c1755, abstractC4308M17526.f13890, abstractC4308M17526, abstractC10370, c2609M8239, c2609M82310);
                    AbstractC4308 abstractC4308M17543 = c10222.f30703.m17543(abstractC5698M50313, abstractC5146.f16086);
                    if (abstractC5698M50313.f17559 == EnumC1296.f4571) {
                        Iterator it4 = abstractC4308M17543.mo12930().iterator();
                        while (it4.hasNext()) {
                            m15213((AbstractC4308) it4.next(), abstractC5146);
                        }
                    }
                    abstractC5145 = abstractC5146;
                    z = false;
                }
            }
        }
        mo10758(c10789.f32445);
        C2609 c2609M36194 = c10222.f30707.m36194(this.f16516, C2609.of((Object) c10222.f30704.f66453, (Object) c10222.f30704.f66492));
        this.f16516 = c26013;
        this.f16515 = c26012;
        C2609 c2609M82311 = C2609.m8239();
        C2609 c26015 = c10789.f32449;
        while (c26015.m8249()) {
            C9378 c9378 = ((C0617) c26015.f8240).f2373;
            if (c9378.f28488.m14709(EnumC18550.f57503)) {
                c2609Of = ((C23488) ((C0617) c26015.f8240).f2373.f28488).f75416;
            } else {
                c2609Of = C2609.of((Object) ((C0617) c26015.f8240).f2373.f28488);
            }
            C2609 c2609M82312 = C2609.m8239();
            C2609 c2609M36171 = c10222.f30707.m36171(c2609M36194, c2609M82311);
            Iterator it5 = c2609Of.iterator();
            C2609 c2609M36172 = c2609M82311;
            C2609 c26016 = c2609M82312;
            while (it5.hasNext()) {
                AbstractC5144 abstractC5147 = (AbstractC12612) it5.next();
                AbstractC4308 abstractC4309 = abstractC5147.f16086;
                if (abstractC4309 != c10222.f30704.f66519) {
                    C2609 c2609M8242 = c26016.m8242(abstractC4309);
                    it = it5;
                    if (c10222.f30703.m17550(abstractC4309, c10222.f30704.f66526)) {
                        c2609 = c2609Of;
                        c26010 = c26013;
                        c26016 = c2609M8242;
                    } else {
                        if (c2609Of.m8245() <= 1) {
                            abstractC5147 = (C0617) c26015.f8240;
                            abstractC5147.getClass();
                        }
                        if (c10222.f30707.m36200(abstractC4309, c2609M36172)) {
                            C22364 c22364 = c10222.f30706;
                            C12281 c12281 = C6241.f19132;
                            c2609 = c2609Of;
                            c26011 = c2609M8242;
                            c26010 = c26013;
                            c22364.m7273(abstractC5147, new C12281("compiler", "except.already.caught", abstractC4309));
                        } else {
                            c2609 = c2609Of;
                            c26010 = c26013;
                            c26011 = c2609M8242;
                            C15240 c15240 = c10222.f30707;
                            c15240.getClass();
                            try {
                                zM36184 = c15240.m36184(abstractC4309);
                            } catch (C20515 e) {
                                c15240.m36110(abstractC5147, e);
                                zM36184 = true;
                            }
                            if (!zM36184 && !m15211(abstractC4309) && !c10222.f30707.m36193(abstractC4309, c2609M36194)) {
                                C22364 c22365 = c10222.f30706;
                                C12281 c12282 = C6241.f19132;
                                c22365.m7273(abstractC5147, new C12281("compiler", "except.never.thrown.in.try", abstractC4309));
                            } else {
                                C2609 c2609M36187 = c10222.f30707.m36187(C2609.of((Object) abstractC4309), c2609M36194);
                                if (c10222.f30707.m36171(c2609M36187, c2609M36172).isEmpty() && !m15211(abstractC4309)) {
                                    if (c2609M36187.m8245() == 1) {
                                        C11076 c11077 = C14001.f42334;
                                        c11076 = new C11076("compiler", "unreachable.catch", c2609M36187);
                                    } else {
                                        C11076 c11078 = C14001.f42334;
                                        c11076 = new C11076("compiler", "unreachable.catch.1", c2609M36187);
                                    }
                                    c10222.f30706.m7285(abstractC5147, c11076);
                                }
                            }
                        }
                        c2609M36172 = c10222.f30707.m36172(abstractC4309, c2609M36172);
                        c26016 = c26011;
                    }
                } else {
                    c2609 = c2609Of;
                    it = it5;
                    c26010 = c26013;
                }
                it5 = it;
                c2609Of = c2609;
                c26013 = c26010;
            }
            mo10758(c9378);
            this.f16519.put(c9378.f28489, c10222.f30707.m36187(c26016, c2609M36171));
            mo10758(((C0617) c26015.f8240).f2372);
            this.f16519.remove(c9378.f28489);
            c26015 = c26015.f8241;
            c2609M82311 = c2609M36172;
        }
        C2609 c26017 = c26013;
        if (c10789.f32448 != null) {
            C2609 c26018 = this.f16516;
            this.f16516 = C2609.m8239();
            C18837 c18838 = this.f59097;
            this.f59097 = c18837;
            mo10758(c10789.f32448);
            if (!c10789.f32447) {
                this.f16516 = c10222.f30707.m36194(this.f16516, c26017);
                return;
            }
            this.f16516 = c10222.f30707.m36194(this.f16516, c10222.f30707.m36171(c2609M36194, c2609M82311));
            this.f16516 = c10222.f30707.m36194(this.f16516, c26018);
            while (c18838.m43518()) {
                this.f59097.m43511((C3872) c18838.m43516());
            }
            return;
        }
        this.f16516 = c10222.f30707.m36194(this.f16516, c10222.f30707.m36171(c2609M36194, c2609M82311));
        C18837 c18839 = this.f59097;
        this.f59097 = c18837;
        while (c18839.m43518()) {
            this.f59097.m43511((C3872) c18839.m43516());
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        mo10758(c1470.f5225);
        mo10758(c1470.f5226);
        AbstractC11349 abstractC11349 = c1470.f5227;
        if (abstractC11349 != null) {
            mo10758(abstractC11349);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15211(AbstractC4308 abstractC4308) {
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        C10222 c10222 = this.f16518;
        return abstractC19810 == c10222.f30704.f66479.f13890 || abstractC4308.f13890 == c10222.f30704.f66490.f13890;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        m43304(new C3872(c4146));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        mo10758(c2322.f7456);
        m43304(new C3872(c2322));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        m43304(new C3872(c15433));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        mo10758(c9938.f30017);
        m43304(new C3872(c9938));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        mo10758(c1616.f5680);
        AbstractC5698 abstractC5698M19472 = C7260.m19472(c1616.f5680);
        if (abstractC5698M19472 != null && abstractC5698M19472.f17559 == EnumC1296.f4567 && (abstractC5698M19472.mo16084() & 2199023255568L) != 0 && this.f16519.get(abstractC5698M19472) != null) {
            Iterator it = ((C2609) this.f16519.get(abstractC5698M19472)).iterator();
            while (it.hasNext()) {
                m15213((AbstractC4308) it.next(), c1616);
            }
            return;
        }
        m15213(c1616.f5680.f16086, c1616);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        mo10758(c15580.f48011);
        m33860(c15580.f48012);
        for (C2609 c2609Mo12930 = c15580.f48011.f16086.mo12930(); c2609Mo12930.m8249(); c2609Mo12930 = c2609Mo12930.f8241) {
            m15213((AbstractC4308) c2609Mo12930.f8240, c15580);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        mo10758(c19110.f60199);
        m33860(c19110.f60197);
        for (C2609 c2609Mo12930 = c19110.f60192.mo12930(); c2609Mo12930.m8249(); c2609Mo12930 = c2609Mo12930.f8241) {
            m15213((AbstractC4308) c2609Mo12930.f8240, c19110);
        }
        C2609 c2609 = this.f16515;
        try {
            if (c19110.f60195 != null) {
                for (C2609 c2609Mo12931 = c19110.f60194.f17560.mo12930(); c2609Mo12931.m8249(); c2609Mo12931 = c2609Mo12931.f8241) {
                    this.f16515 = this.f16518.f30707.m36172((AbstractC4308) c2609Mo12931.f8240, this.f16515);
                }
            }
            mo10758(c19110.f60195);
        } finally {
            this.f16515 = c2609;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1217(C14169 c14169) {
        boolean z;
        C10222 c10222 = this.f16518;
        AbstractC4308 abstractC4308 = c14169.f16086;
        if (abstractC4308 == null || !abstractC4308.mo12948()) {
            C2609 c2609 = this.f16515;
            C2609 c26010 = this.f16516;
            C18837 c18837 = this.f59097;
            try {
                this.f59097 = new C18837();
                this.f16515 = c14169.m51449(c10222.f30703).mo12930();
                this.f16516 = C2609.m8239();
                mo10758(c14169.f42776);
                C2609 c2609M43517 = this.f59097.m43517();
                this.f59097 = new C18837();
                while (c2609M43517.m8249()) {
                    C3872 c3872 = (C3872) c2609M43517.f8240;
                    c2609M43517 = c2609M43517.f8241;
                    if (!(c3872 instanceof C0343)) {
                        if (!c3872.f12387.m14709(EnumC18550.f57530)) {
                            C22364 c22364 = c10222.f30706;
                            AbstractC5144 abstractC5144 = c3872.f12387;
                            abstractC5144.getClass();
                            z = c22364.m50116(abstractC5144);
                        }
                        C12171.m29642(z);
                    } else {
                        this.f59097.m43511(c3872);
                    }
                }
                m15214();
            } finally {
                this.f59097 = c18837;
                this.f16515 = c2609;
                this.f16516 = c26010;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15212(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        C10222 c10222 = this.f16518;
        try {
            c10222.f30705 = c1755;
            c10222.f30711 = c17013;
            this.f59097 = new C18837();
            this.f16519 = new HashMap();
            this.f16515 = null;
            this.f16516 = null;
            this.f16517 = null;
            mo10758(abstractC5144);
        } finally {
            this.f59097 = null;
            c10222.f30711 = null;
            this.f16515 = null;
            this.f16516 = null;
            this.f16517 = null;
        }
    }

    public C5283(C10222 c10222) {
        this.f16518 = c10222;
    }
}
