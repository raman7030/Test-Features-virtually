package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7067 extends C23363 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2609 f21741;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2609 f21744;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f21745;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f21747;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f21746 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14827 f21743 = new C14827();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map f21742 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5557 m19050(C7067 c7067, C5557 c5557) {
        c7067.getClass();
        c7067.f21744 = C2609.m8239();
        c7067.f21741 = C2609.m8239();
        c7067.f21745 = new HashMap();
        return (C5557) c7067.mo23617(c5557);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        C9184 c9184 = this.f21747;
        C2609 c2609 = this.f21741;
        try {
            AbstractC10370 abstractC10370M19462 = C7260.m19462(c15580.f48011);
            if (abstractC10370M19462 == c9184.f27819.f18886 || abstractC10370M19462 == c9184.f27819.f18898) {
                this.f21741 = this.f21741.m8246(m19064());
            }
            super.mo1407(c15580);
        } finally {
            this.f21741 = c2609;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14163 m19064() {
        for (C11674 c11674 : this.f21744) {
            if (c11674.f34784.m14709(EnumC18550.f57582)) {
                return ((C5557) c11674.f34784).f17186;
            }
        }
        return null;
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C2609 c2609 = this.f21744;
        try {
            if (c2609.m8249() && ((C11674) this.f21744.f8240).f34784.m14709(EnumC18550.f57582)) {
                this.f21744 = this.f21744.m8246(new C11674(c2735));
            }
            super.mo1372(c2735);
        } finally {
            this.f21744 = c2609;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) throws Throwable {
        C2609 c2609 = this.f21744;
        int i = this.f21746;
        C14827 c14827 = this.f21743;
        Map map = this.f21742;
        C9184 c9184 = this.f21747;
        C14397 c14397M7266 = c9184.f27804.m7266();
        try {
            c9184.f27804.m7284(c5557.f17186.f42770);
            this.f21746 = 0;
            this.f21743 = new C14827();
            HashMap map2 = new HashMap();
            try {
                C14163 c14163 = c5557.f17186;
                if (c14163.f17561.f17559 == EnumC1296.f4571) {
                    this.f21745.put(c14163, c5557);
                }
                if (m19061() != null) {
                    c5557.f17186.f17561 = m19052(false);
                    if (c5557.f17186.m16087()) {
                        AbstractC19810 abstractC19810 = c5557.f17186.f17560.mo4958().f13890;
                        for (AbstractC24000 abstractC24000M19067 = m19067(); abstractC24000M19067 != null && !abstractC24000M19067.f77787.mo15572(); abstractC24000M19067 = abstractC24000M19067.f77789) {
                            if (abstractC24000M19067.f77786.m14709(EnumC18550.f57523)) {
                                if (m19048(abstractC24000M19067.f77785, abstractC19810) == null) {
                                    break;
                                } else {
                                    ((C18356) abstractC24000M19067).m42781(abstractC19810, EnumC21179.CAPTURED_THIS);
                                }
                            }
                        }
                    }
                }
                this.f21744 = this.f21744.m8246(new C11674(c5557));
                super.mo1215(c5557);
                c9184.f27804.m7284(c14397M7266.m34390());
                this.f21744 = c2609;
                this.f21746 = i;
                this.f21743 = c14827;
                this.f21742 = map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                c9184.f27804.m7284(c14397M7266.m34390());
                this.f21744 = c2609;
                this.f21746 = i;
                this.f21743 = c14827;
                this.f21742 = map;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        if (m19067() != null && m19055(c7673.f23697)) {
            AbstractC5698 abstractC5698 = c7673.f23697;
            if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && c7673.f16086.mo12915() == null) {
                for (AbstractC24000 abstractC24000M19067 = m19067(); abstractC24000M19067 != null; abstractC24000M19067 = abstractC24000M19067.f77789) {
                    if (abstractC24000M19067.f77786.mo989() == EnumC18550.f57523) {
                        if (m19048(abstractC24000M19067.f77785, c7673.f23697) == null) {
                            break;
                        } else {
                            ((C18356) abstractC24000M19067).m42781(c7673.f23697, EnumC21179.CAPTURED_VAR);
                        }
                    }
                }
            } else if (c7673.f23697.f17561.f17559 == EnumC1296.f4582) {
                for (AbstractC24000 abstractC24000M19068 = m19067(); abstractC24000M19068 != null && !abstractC24000M19068.f77787.mo15572(); abstractC24000M19068 = abstractC24000M19068.f77789) {
                    if (abstractC24000M19068.f77786.m14709(EnumC18550.f57523)) {
                        AbstractC5144 abstractC5144M19048 = m19048(abstractC24000M19068.f77785, c7673.f23697);
                        if (abstractC5144M19048 == null) {
                            break;
                        }
                        if (C4618.f14693[abstractC5144M19048.mo989().ordinal()] == 4) {
                            ((C18356) abstractC24000M19068).m42781(((C5557) abstractC5144M19048).f17186, EnumC21179.CAPTURED_THIS);
                        } else {
                            C12171.m29640("bad block kind");
                            throw null;
                        }
                    }
                }
            }
        }
        super.mo1385(c7673);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        m19053(c14169, "lambda.stat");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18356 m19053(C14169 c14169, String str) {
        C9184 c9184 = this.f21747;
        C2609 c2609 = this.f21744;
        try {
            C18356 c18356 = new C18356(this, c14169);
            this.f21744 = this.f21744.m8246(new C11674(c14169));
            for (C9378 c9378 : c14169.f42775) {
                c18356.m42781(c9378.f28489, EnumC21179.PARAM);
                C11674 c11674 = (C11674) this.f21744.f8240;
                C12048 c12048 = c9378.f28489;
                if (c11674.f34783 == null) {
                    c11674.f34783 = C2609.m8239();
                }
                c11674.f34783 = c11674.f34783.m8246(c12048);
            }
            c9184.f27812.put(c14169, c18356);
            super.mo1217(c14169);
            c18356.m42783();
            if (c9184.f27810) {
                c9184.f27804.m7274(c14169, c9184.f27820.m16623(str, Boolean.valueOf(c18356.m52837()), c18356.f57038));
            }
            return c18356;
        } finally {
            this.f21744 = c2609;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C2609 c2609 = this.f21744;
        try {
            this.f21744 = c2609.m8246(new C11674(c8526));
            super.mo1388(c8526);
        } finally {
            this.f21744 = c2609;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        boolean z;
        AbstractC19810 abstractC19810 = c19110.f16086.f13890;
        Iterator it = this.f21744.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C11674 c11674 = (C11674) it.next();
            if (c11674.f34784.m14709(EnumC18550.f57582) && ((C5557) c11674.f34784).f17186 == abstractC19810) {
                z = true;
                break;
            }
        }
        boolean zM16077 = abstractC19810.m16077();
        if ((z && zM16077) || m19058(m19067(), c19110)) {
            AbstractC19810 abstractC19811 = c19110.f16086.mo4958().f13890;
            for (AbstractC24000 abstractC24000M19067 = m19067(); abstractC24000M19067 != null && !abstractC24000M19067.f77787.mo15572(); abstractC24000M19067 = abstractC24000M19067.f77789) {
                if (abstractC24000M19067.f77786.m14709(EnumC18550.f57523)) {
                    if (abstractC19811 != null && m19048(abstractC24000M19067.f77785, abstractC19811) == null) {
                        break;
                    } else {
                        ((C18356) abstractC24000M19067).m42781(abstractC19811, EnumC21179.CAPTURED_THIS);
                    }
                }
            }
        }
        super.mo1419(c19110);
        if (m19067() == null || z || !zM16077) {
            return;
        }
        m19069(abstractC19810, (C18356) m19067());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19069(AbstractC5698 abstractC5698, C18356 c18356) {
        C5557 c5557 = (C5557) this.f21745.get(abstractC5698);
        if (c5557 == null || !c18356.f57040.add(abstractC5698)) {
            return;
        }
        C23294 c23294 = this.f21747.f27805;
        C11003.requireNonNull(c23294);
        new C6029(this, c23294, c18356).mo1215(c5557);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        boolean z;
        C17650 c17650 = new C17650(this, c9232);
        C9184 c9184 = this.f21747;
        c9184.f27812.put(c9232, c17650);
        C2609 c2609Mo12933 = c9232.m51449(c9184.f27821).mo12933();
        if ((c2609Mo12933.m8249() ? C17650.m41342((AbstractC4308) c2609Mo12933.f8240) : false) || c17650.f53964) {
            z = true;
        } else {
            if (c9232.f27948 != null) {
                z = true;
            } else {
                if (c9232.f27943.f17561 == c9184.f27808.f66505) {
                    z = true;
                } else {
                    boolean z2 = c9184.f27802;
                    AbstractC5698 abstractC5698 = c17650.f77787;
                    if (!z2) {
                        if (((c9232.f27943.mo16084() & 2) == 0 || c9184.f27821.m17550(c9184.f27821.m17519(c9232.f27943.m16071().f17560), c9184.f27821.m17519(abstractC5698.m16071().f17560))) ? false : true) {
                            z = true;
                        } else if (C9184.m23599(c9184, c9232.f27943, abstractC5698)) {
                            z = true;
                        } else {
                            z = true;
                        }
                    } else if (C9184.m23599(c9184, c9232.f27943, abstractC5698) || !c9232.f27946 || (c9232.f27940 == EnumC11091.NEW && c9232.f27942 != EnumC20521.f66118 && (c9232.f27943.f17561.m16077() || c9232.f27943.f17561.m16069()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            C9890 c9890 = new C9890(c9184, c9232, c17650, m19052(false));
            C14169 c14169M24987 = c9890.m24987();
            AbstractC12612 abstractC12612 = (AbstractC12612) mo23617(c9890.m24986());
            C18356 c18356M19053 = m19053(c14169M24987, "mref.stat.1");
            if (abstractC12612 != null) {
                c18356M19053.f57044 = abstractC12612;
                return;
            }
            return;
        }
        super.mo1391(c9232);
        if (c9184.f27810) {
            C22364 c22364 = c9184.f27804;
            boolean zM52837 = c17650.m52837();
            C13691 c13691 = C23174.f74467;
            c22364.m7274(c9232, new C13691("compiler", "mref.stat", Boolean.valueOf(zM52837), null));
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (m19067() != null) {
            AbstractC5698 abstractC5698 = c6262.f19396;
            if (abstractC5698.f17559 == EnumC1296.f4567) {
                AbstractC10370 abstractC10370 = abstractC5698.f17562;
                C9184 c9184 = this.f21747;
                if (abstractC10370 == c9184.f27819.f18886 || c6262.f19396.f17562 == c9184.f27819.f18898) {
                    for (AbstractC24000 abstractC24000M19067 = m19067(); abstractC24000M19067 != null && !abstractC24000M19067.f77787.mo15572(); abstractC24000M19067 = abstractC24000M19067.f77789) {
                        if (abstractC24000M19067.f77786.m14709(EnumC18550.f57523)) {
                            C5557 c5557 = (C5557) m19048(abstractC24000M19067.f77785, c6262.f19396);
                            if (c5557 == null) {
                                break;
                            } else {
                                ((C18356) abstractC24000M19067).m42781(c5557.f17186, EnumC21179.CAPTURED_THIS);
                            }
                        }
                    }
                }
            }
        }
        super.mo1381(c6262);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        AbstractC24000 abstractC24000M19067 = m19067();
        if (abstractC24000M19067 != null && (abstractC24000M19067 instanceof C18356)) {
            C18356 c18356 = (C18356) abstractC24000M19067;
            for (C11674 c11674 : this.f21744) {
                if (!c11674.f34784.m14709(EnumC18550.f57578)) {
                    if (!c11674.f34784.m14709(EnumC18550.f57523)) {
                        break;
                    } else {
                        c18356.m42781(c9378.f28489, EnumC21179.LOCAL_VAR);
                    }
                }
            }
            c9378.f28489.getClass();
        }
        C2609 c2609 = this.f21744;
        try {
            C12048 c12048 = c9378.f28489;
            if (c12048.f17561.f17559 == EnumC1296.f4571) {
                C11674 c11675 = (C11674) c2609.f8240;
                if (c11675.f34783 == null) {
                    c11675.f34783 = C2609.m8239();
                }
                c11675.f34783 = c11675.f34783.m8246(c12048);
            }
            this.f21744 = this.f21744.m8246(new C11674(c9378));
            super.mo1392(c9378);
        } finally {
            this.f21744 = c2609;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 m19052(boolean z) {
        C2609 c2609 = this.f21744;
        while (c2609.m8249()) {
            switch (C4618.f14693[((C11674) c2609.f8240).f34784.mo989().ordinal()]) {
                case 4:
                    return ((C5557) ((C11674) c2609.f8240).f34784).f17186;
                case 5:
                    if (((C9378) ((C11674) c2609.f8240).f34784).f28489.m16077()) {
                        c2609 = c2609.f8241;
                        continue;
                    } else {
                        return m19051(((C5557) ((C11674) c2609.f8241.f8240).f34784).f17186, ((C9378) ((C11674) c2609.f8240).f34784).f28489.f17563 & 8);
                    }
                    break;
                case 6:
                    return m19051(((C5557) ((C11674) c2609.f8241.f8240).f34784).f17186, ((C2735) ((C11674) c2609.f8240).f34784).f8522 & 8);
                case 7:
                    return ((C8526) ((C11674) c2609.f8240).f34784).f26045;
                case 8:
                    if (!z) {
                        return ((C18356) this.f21747.f27812.get(((C11674) c2609.f8240).f34784)).f57038;
                    }
                    break;
            }
            c2609 = c2609.f8241;
        }
        C12171.m29636();
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m19051(C14163 c14163, long j) {
        long j2 = j & 8;
        C9184 c9184 = this.f21747;
        if (j2 != 0) {
            C3581 c3581M23953 = c9184.f27815.m23953(c14163);
            if (c3581M23953 != null) {
                this.f21742.put(c14163, c3581M23953);
                return c3581M23953;
            }
            C3581 c3581 = (C3581) this.f21742.get(c14163);
            if (c3581 != null) {
                return c3581;
            }
            C3581 c3582 = new C3581(4106L, c9184.f27819.f18842, new C10658(C2609.m8239(), c9184.f27808.f66501, C2609.m8239(), c9184.f27808.f66481), c14163);
            this.f21742.put(c14163, c3582);
            return c3582;
        }
        Iterator it = c14163.f42762.m20476(c9184.f27819.f18879).iterator();
        if (it.hasNext()) {
            return (AbstractC5698) it.next();
        }
        C12171.m29640("init not found");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 m19061() {
        if (!this.f21744.isEmpty()) {
            for (C2609 c2609 = this.f21744; c2609.m8249(); c2609 = c2609.f8241) {
                int i = C4618.f14693[((C11674) c2609.f8240).f34784.mo989().ordinal()];
                if (i != 4 && i != 7) {
                    if (i == 8) {
                        return ((C11674) c2609.f8240).f34784;
                    }
                }
            }
            C12171.m29636();
            throw null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5144 m19048(int i, AbstractC5698 abstractC5698) {
        C2609 c2609;
        int iM8245 = this.f21744.m8245() - 1;
        for (C11674 c11674 : this.f21744) {
            int[] iArr = C4618.f14693;
            AbstractC5144 abstractC5144 = c11674.f34784;
            AbstractC5144 abstractC5145 = c11674.f34784;
            switch (iArr[abstractC5144.mo989().ordinal()]) {
                case 4:
                    C14163 c14163 = ((C5557) abstractC5145).f17186;
                    C9184 c9184 = this.f21747;
                    if (c14163.mo16080(abstractC5698, c9184.f27821) || abstractC5698.m16067((AbstractC19810) c14163, c9184.f27821)) {
                        if (iM8245 > i) {
                            return null;
                        }
                        return abstractC5145;
                    }
                    break;
                case 5:
                    if ((((C9378) abstractC5145).f28489 == abstractC5698 && abstractC5698.f17561.f17559 == EnumC1296.f4571) || ((c2609 = c11674.f34783) != null && c2609.contains(abstractC5698))) {
                        if (iM8245 > i) {
                            return null;
                        }
                        return abstractC5145;
                    }
                    break;
                    break;
                case 6:
                case 7:
                case 8:
                    C2609 c26010 = c11674.f34783;
                    if (c26010 != null && c26010.contains(abstractC5698)) {
                        if (iM8245 > i) {
                            return null;
                        }
                        return abstractC5145;
                    }
                    break;
                    break;
                default:
                    C12171.m29640("bad decl kind " + abstractC5145.mo989());
                    throw null;
            }
            iM8245--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC24000 m19067() {
        Iterator it = this.f21744.iterator();
        while (it.hasNext()) {
            AbstractC24000 abstractC24000 = (AbstractC24000) this.f21747.f27812.get(((C11674) it.next()).f34784);
            if (abstractC24000 != null) {
                return abstractC24000;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19055(AbstractC5698 abstractC5698) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        return ((enumC1296 != EnumC1296.f4567 && enumC1296 != EnumC1296.f4571) || abstractC5698.mo15572() || abstractC5698.f17562 == this.f21747.f27819.f18879) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19058(AbstractC24000 abstractC24000, C19110 c19110) {
        if (abstractC24000 == null || c19110.f60199 != null || c19110.f60195 != null || c19110.f16086.mo4958().m12913(EnumC9454.NONE)) {
            return false;
        }
        AbstractC4308 abstractC4308Mo4958 = c19110.f16086.mo4958();
        for (AbstractC4308 abstractC4308Mo4959 = abstractC24000.f77787.m16071().f17560; !abstractC4308Mo4959.m12913(EnumC9454.NONE); abstractC4308Mo4959 = abstractC4308Mo4959.mo4958()) {
            if (abstractC4308Mo4959.f13890.mo16080((AbstractC5698) abstractC4308Mo4958.f13890, this.f21747.f27821)) {
                return true;
            }
        }
        return false;
    }

    public C7067(C9184 c9184) {
        this.f21747 = c9184;
    }
}
