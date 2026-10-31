package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public class C14454 extends AbstractC18689 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC3166 f44296;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f44297;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
    }

    @Override // l.AbstractC18689
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15215() {
        this.f44296 = EnumC3166.f9966;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34513(AbstractC5144 abstractC5144) {
        m34512(abstractC5144);
        if (abstractC5144 != null && abstractC5144.m14709(EnumC18550.f57550) && this.f44296 == EnumC3166.f9966) {
            this.f44297.f30706.m7273(abstractC5144, C6241.f19172);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34512(AbstractC5144 abstractC5144) {
        if (this.f44296 == EnumC3166.f9966 && abstractC5144 != null) {
            this.f44297.f30706.m7273(abstractC5144, C6241.f19285);
            if (!abstractC5144.m14709(EnumC18550.f57540)) {
                this.f44296 = EnumC3166.f9965;
            }
        }
        mo10758(abstractC5144);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34511(C2609 c2609) {
        if (c2609 != null) {
            while (c2609.m8249()) {
                m34512((AbstractC5144) c2609.f8240);
                c2609 = c2609.f8241;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1215(C5557 c5557) {
        if (c5557.f17186 == null) {
            return;
        }
        EnumC3166 enumC3166 = this.f44296;
        C18837 c18837 = this.f59097;
        C10222 c10222 = this.f44297;
        C4824 c4824 = c10222.f30708;
        this.f59097 = new C18837();
        c10222.f30708 = c10222.f30708.m14053(c5557.f17186);
        try {
            for (C2609 c2609 = c5557.f17179; c2609.m8249(); c2609 = c2609.f8241) {
                if (!((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57511) && (8 & C7260.m19473((AbstractC5144) c2609.f8240)) != 0) {
                    m34513((AbstractC5144) c2609.f8240);
                    m34506(false);
                }
            }
            for (C2609 c26010 = c5557.f17179; c26010.m8249(); c26010 = c26010.f8241) {
                if (!((AbstractC5144) c26010.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26010.f8240) & 8) == 0) {
                    m34513((AbstractC5144) c26010.f8240);
                    m34506(false);
                }
            }
            for (C2609 c26011 = c5557.f17179; c26011.m8249(); c26011 = c26011.f8241) {
                if (((AbstractC5144) c26011.f8240).m14709(EnumC18550.f57511)) {
                    mo10758((AbstractC5144) c26011.f8240);
                }
            }
        } finally {
            this.f59097 = c18837;
            this.f44296 = enumC3166;
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        if (c8526.f26043 == null) {
            return;
        }
        C10222 c10222 = this.f44297;
        C4824 c4824 = c10222.f30708;
        c10222.f30708 = c10222.f30708.m14053(c8526.f26045);
        C12171.m29642(this.f59097.isEmpty());
        try {
            EnumC3166 enumC3166 = EnumC3166.f9968;
            this.f44296 = enumC3166;
            m34512(c8526.f26043);
            EnumC3166 enumC3167 = this.f44296;
            c8526.f26050 = enumC3167 != EnumC3166.f9966;
            if (enumC3167 == enumC3166 && !c8526.f26045.f17560.mo12923().m12913(EnumC9454.VOID)) {
                c10222.f30706.m7273(C7260.m19464(c8526.f26043), C6241.f19206);
            }
            m34506(true);
        } finally {
            c10222.f30708 = c4824;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34506(boolean z) {
        boolean z2;
        C2609 c2609M43517 = this.f59097.m43517();
        this.f59097 = new C18837();
        while (c2609M43517.m8249()) {
            C3872 c3872 = (C3872) c2609M43517.f8240;
            c2609M43517 = c2609M43517.f8241;
            if (z && c3872.f12387.m14709(EnumC18550.f57530)) {
                z2 = true;
            } else {
                C22364 c22364 = this.f44297.f30706;
                AbstractC5144 abstractC5144 = c3872.f12387;
                abstractC5144.getClass();
                if (c22364.m50116(abstractC5144)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C12171.m29642(z2);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        if (c9378.f28487 != null) {
            C10222 c10222 = this.f44297;
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
        m34511(c2735.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1421(C20374 c20374) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        m34512(c20374.f65770);
        this.f44296 = this.f44296.mo9717(m43307(c20374));
        mo10758(c20374.f65771);
        EnumC3166 enumC3166M9716 = this.f44296.m9716(!c20374.f65771.f16086.mo12935());
        this.f44296 = enumC3166M9716;
        this.f44296 = enumC3166M9716.mo9717(m43303(c20374, c18837));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1389(C8672 c8672) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c8672.f26445);
        this.f44296 = EnumC3166.m9714(!c8672.f26445.f16086.mo12942());
        m34512(c8672.f26444);
        this.f44296 = this.f44296.mo9717(m43307(c8672));
        this.f44296 = m43303(c8672, c18837).m9718(!c8672.f26445.f16086.mo12935());
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1397(C11907 c11907) {
        C18837 c18837 = this.f59097;
        m34511(c11907.f35587);
        this.f59097 = new C18837();
        AbstractC12612 abstractC12612 = c11907.f35588;
        if (abstractC12612 != null) {
            mo10758(abstractC12612);
            this.f44296 = EnumC3166.m9714(!c11907.f35588.f16086.mo12942());
        } else {
            this.f44296 = EnumC3166.f9968;
        }
        m34512(c11907.f35585);
        this.f44296 = this.f44296.mo9717(m43307(c11907));
        m33860(c11907.f35586);
        EnumC3166 enumC3166M43303 = m43303(c11907, c18837);
        AbstractC12612 abstractC12613 = c11907.f35588;
        this.f44296 = enumC3166M43303.m9718((abstractC12613 == null || abstractC12613.f16086.mo12935()) ? false : true);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1378(C4851 c4851) {
        mo1392(c4851.f15325);
        C18837 c18837 = this.f59097;
        mo10758(c4851.f15326);
        this.f59097 = new C18837();
        m34512(c4851.f15324);
        this.f44296 = this.f44296.mo9717(m43307(c4851));
        m43303(c4851, c18837);
        this.f44296 = EnumC3166.f9968;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1414(C17698 c17698) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        m34512(c17698.f54159);
        this.f44296 = this.f44296.mo9717(m43303(c17698, c18837));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        C10222 c10222;
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c22637.f73103);
        boolean z = c22637.f73104 || C5378.stream(c22637.f73102).flatMap(new C16571(0)).anyMatch(new C0065(7));
        HashSet hashSet = z ? new HashSet() : null;
        C2609 c2609 = c22637.f73102;
        while (true) {
            boolean zM8249 = c2609.m8249();
            c10222 = this.f44297;
            if (!zM8249) {
                break;
            }
            this.f44296 = EnumC3166.f9968;
            C18963 c18963 = (C18963) c2609.f8240;
            for (AbstractC19669 abstractC19669 : c18963.f59815) {
                mo10758(abstractC19669);
                m34505(hashSet, abstractC19669);
            }
            m34511(c18963.f59814);
            EnumC3166 enumC3166 = this.f44296;
            EnumC3166 enumC3167 = EnumC3166.f9966;
            if (enumC3166 != enumC3167 && c18963.f59817 == C18963.f59811) {
                m43305(c22637, c10222.f30711);
                this.f44296 = enumC3167;
            }
            if (this.f44296 == EnumC3166.f9968) {
                C4824 c4824 = c10222.f30708;
                EnumC20347 enumC20347 = EnumC20347.FALLTHROUGH;
                if (c4824.m14055(enumC20347) && c18963.f59814.m8249() && c2609.f8241.m8249()) {
                    C22364 c22364 = c10222.f30706;
                    C18963 c18964 = (C18963) c2609.f8241.f8240;
                    c18964.getClass();
                    c22364.m7286(enumC20347, c18964, C14001.f42336);
                }
            }
            c2609 = c2609.f8241;
        }
        if (!c22637.f73105 && z && !C7260.m19448(c22637.f73103, c22637.f73102) && (hashSet == null || !m34507(c22637.f73103.f16086, hashSet))) {
            c10222.f30706.m7273(c22637, C6241.f19238);
        }
        if (!c22637.f73105) {
            this.f44296 = EnumC3166.f9968;
        }
        this.f44296 = this.f44296.mo9717(m43303(c22637, c18837));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        C10222 c10222;
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c13464.f40197);
        HashSet hashSet = new HashSet();
        EnumC3166 enumC3166 = this.f44296;
        C2609 c2609 = c13464.f40199;
        while (true) {
            boolean zM8249 = c2609.m8249();
            c10222 = this.f44297;
            if (!zM8249) {
                break;
            }
            this.f44296 = EnumC3166.f9968;
            C18963 c18963 = (C18963) c2609.f8240;
            for (AbstractC19669 abstractC19669 : c18963.f59815) {
                mo10758(abstractC19669);
                m34505(hashSet, abstractC19669);
            }
            m34511(c18963.f59814);
            if (this.f44296 == EnumC3166.f9968) {
                if (c18963.f59817 == C18963.f59811) {
                    c10222.f30706.m7273(C7260.m19464(c18963.f59813), C6241.f19197);
                } else if (c2609.f8241.isEmpty()) {
                    c10222.f30706.m7273(C7260.m19464((AbstractC5144) c13464), C6241.f19239);
                }
            }
            c2609 = c2609.f8241;
        }
        if (!c13464.f40196 && !C7260.m19448(c13464.f40197, c13464.f40199) && !m34507(c13464.f40197.f16086, hashSet)) {
            c10222.f30706.m7273(c13464, C6241.f19184);
        }
        this.f44296 = enumC3166;
        this.f44296 = enumC3166.mo9717(m43306(c13464, c18837));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34505(HashSet hashSet, AbstractC19669 abstractC19669) {
        if (hashSet != null) {
            if (abstractC19669.mo30871()) {
                AbstractC12612 abstractC12612 = (AbstractC12612) abstractC19669;
                if (abstractC12612.m14709(EnumC18550.f57566)) {
                    C7673 c7673 = (C7673) abstractC12612;
                    if (c7673.f23697.m16090()) {
                        hashSet.add(c7673.f23697);
                        return;
                    }
                    return;
                }
                return;
            }
            if (abstractC19669.mo30872()) {
                C10083 c10083M19457 = C7260.m19457((AbstractC21932) abstractC19669);
                if (c10083M19457.m25341()) {
                    hashSet.add(c10083M19457.m25340().f13890);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m34507(AbstractC4308 abstractC4308, final HashSet hashSet) {
        C2609 c2609M8235 = C2609.m8235((Iterable) hashSet);
        while (c2609M8235.m8249()) {
            AbstractC5698 abstractC5698 = (AbstractC5698) c2609M8235.f8240;
            c2609M8235 = c2609M8235.f8241;
            int i = C10928.f32839[abstractC5698.f17559.ordinal()];
            if (i == 1) {
                AbstractC14016 abstractC14016Mo16064 = abstractC5698.f17561.mo16064();
                C17378 c17378 = new C17378(1);
                abstractC14016Mo16064.getClass();
                if (C14841.stream(C19846.spliterator(abstractC14016Mo16064.mo20475(c17378, EnumC1317.RECURSIVE)), false).allMatch(new Predicate() { // from class: l.ܿۤ֨
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
                        return hashSet.contains((AbstractC5698) obj);
                    }
                }) && hashSet.add(abstractC5698.f17561)) {
                    c2609M8235 = c2609M8235.m8246(abstractC5698.f17561);
                }
            } else if (i == 2) {
                for (AbstractC4308 abstractC4309 : this.f44297.f30703.m17565(abstractC5698.f17560)) {
                    AbstractC19810 abstractC19810 = abstractC4309.f13890;
                    if (abstractC19810.f17559 == EnumC1296.f4582 && (abstractC19810.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 && abstractC19810.m16100() && C5378.stream(((C14163) abstractC4309.f13890).f42765).allMatch(new Predicate() { // from class: l.ܿۤ֨
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
                            return hashSet.contains((AbstractC5698) obj);
                        }
                    }) && hashSet.add(abstractC4309.f13890)) {
                        c2609M8235 = c2609M8235.m8246(abstractC4309.f13890);
                    }
                }
            }
        }
        int i2 = C10928.f32840[abstractC4308.mo3258().ordinal()];
        if (i2 == 1) {
            if (!abstractC4308.mo5146()) {
                return hashSet.contains(abstractC4308.f13890);
            }
            if (abstractC4308 instanceof C5843) {
                C5843 c5843 = (C5843) abstractC4308;
                return C5378.stream(c5843.f64620.m8246(c5843.f64618)).anyMatch(new Predicate() { // from class: l.ᩳۤ֨
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
                        HashSet hashSet2 = hashSet;
                        return this.f56088.m34507((AbstractC4308) obj, hashSet2);
                    }
                });
            }
        } else if (i2 == 2) {
            return m34507(((C8541) abstractC4308).mo12939(), hashSet);
        }
        return false;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
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
        m34512(c10789.f32445);
        EnumC3166 enumC3166Mo9717 = this.f44296;
        for (C2609 c2609 = c10789.f32449; c2609.m8249(); c2609 = c2609.f8241) {
            this.f44296 = EnumC3166.f9968;
            mo10758(((C0617) c2609.f8240).f2373);
            m34512(((C0617) c2609.f8240).f2372);
            enumC3166Mo9717 = enumC3166Mo9717.mo9717(this.f44296);
        }
        C2735 c2735 = c10789.f32448;
        if (c2735 != null) {
            C18837 c18838 = this.f59097;
            this.f59097 = c18837;
            this.f44296 = EnumC3166.f9968;
            m34512(c2735);
            EnumC3166 enumC3166 = this.f44296;
            EnumC3166 enumC3167 = EnumC3166.f9966;
            c10789.f32447 = enumC3166 != enumC3167;
            if (enumC3166 == enumC3167) {
                C10222 c10222 = this.f44297;
                C4824 c4824 = c10222.f30708;
                EnumC20347 enumC20347 = EnumC20347.FINALLY;
                if (c4824.m14055(enumC20347)) {
                    c10222.f30706.m7286(enumC20347, C7260.m19464(c10789.f32448), C14001.f42355);
                    return;
                }
                return;
            }
            while (c18838.m43518()) {
                this.f59097.m43511((C3872) c18838.m43516());
            }
            this.f44296 = enumC3166Mo9717;
            return;
        }
        this.f44296 = enumC3166Mo9717;
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
        m34512(c1470.f5226);
        AbstractC11349 abstractC11349 = c1470.f5227;
        if (abstractC11349 != null) {
            EnumC3166 enumC3166 = this.f44296;
            this.f44296 = EnumC3166.f9968;
            m34512(abstractC11349);
            this.f44296 = this.f44296.mo9717(enumC3166);
            return;
        }
        this.f44296 = EnumC3166.f9968;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1377(C4146 c4146) {
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
    public void mo1216(C9938 c9938) {
        mo10758(c9938.f30017);
        m43304(new C3872(c9938));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        mo10758(c1616.f5680);
        this.f44296 = EnumC3166.f9966;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        mo10758(c15580.f48011);
        m33860(c15580.f48012);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        mo10758(c19110.f60199);
        m33860(c19110.f60197);
        C5557 c5557 = c19110.f60195;
        if (c5557 != null) {
            mo10758(c5557);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1217(C14169 c14169) {
        AbstractC4308 abstractC4308 = c14169.f16086;
        if (abstractC4308 == null || !abstractC4308.mo12948()) {
            C18837 c18837 = this.f59097;
            EnumC3166 enumC3166 = this.f44296;
            try {
                this.f59097 = new C18837();
                this.f44296 = EnumC3166.f9968;
                m34512(c14169.f42776);
                c14169.f42774 = this.f44296 != EnumC3166.f9966;
            } finally {
                this.f59097 = c18837;
                this.f44296 = enumC3166;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34510(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        C10222 c10222 = this.f44297;
        try {
            c10222.f30705 = c1755;
            c10222.f30711 = c17013;
            this.f59097 = new C18837();
            this.f44296 = EnumC3166.f9968;
            mo10758(abstractC5144);
        } finally {
            this.f59097 = null;
            c10222.f30711 = null;
        }
    }

    public C14454(C10222 c10222) {
        this.f44297 = c10222;
    }
}
