package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9184 extends C23363 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4314 f27801 = new C4314();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f27802;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22406 f27803;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22364 f27804;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23294 f27805;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10139 f27806;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f27807;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C20661 f27808;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f27809;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f27810;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7067 f27811;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f27812;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C11160 f27813;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12379 f27814;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9310 f27815;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC24000 f27816;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1755 f27817;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17013 f27818;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C6136 f27819;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5931 f27820;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6319 f27821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f27822;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f27823;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9184 m23590(C2903 c2903) {
        C9184 c9184 = (C9184) c2903.m8838(f27801);
        return c9184 == null ? new C9184(c2903) : c9184;
    }

    @Override // l.C23363
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 mo23617(AbstractC5144 abstractC5144) {
        AbstractC24000 abstractC24000 = (AbstractC24000) this.f27812.get(abstractC5144);
        if (abstractC24000 == null) {
            abstractC24000 = this.f27816;
        }
        AbstractC24000 abstractC24001 = this.f27816;
        try {
            this.f27816 = abstractC24000;
            return super.mo23617(abstractC5144);
        } finally {
            this.f27816 = abstractC24001;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m23615(C2609 c2609, AbstractC24000 abstractC24000) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            AbstractC24000 abstractC24001 = this.f27816;
            try {
                this.f27816 = abstractC24000;
                AbstractC5144 abstractC5144Mo23617 = super.mo23617(abstractC5144);
                this.f27816 = abstractC24001;
                c18837.m43511(abstractC5144Mo23617);
            } catch (Throwable th) {
                this.f27816 = abstractC24001;
                throw th;
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m23616(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        this.f27818 = c17013;
        this.f27817 = c1755;
        this.f27816 = null;
        this.f27812 = new HashMap();
        return mo23617(abstractC5144);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        if (c5557.f17186.f17561.f17559 == EnumC1296.f4579) {
            c5557 = C7067.m19050(this.f27811, c5557);
        }
        C12379 c12379 = this.f27814;
        try {
            this.f27814 = new C12379(this, c5557);
            super.mo1215(c5557);
            if (!this.f27814.f37111.isEmpty()) {
                C17013 c17013 = this.f27818;
                int i = c17013.f52172;
                try {
                    c17013.m39946((InterfaceC3109) c5557);
                    C12379.m30090(this.f27814, m23612());
                    this.f27818.f52172 = i;
                } catch (Throwable th) {
                    this.f27818.f52172 = i;
                    throw th;
                }
            }
            C2609<AbstractC5144> c2609M43517 = this.f27814.f37109.m43517();
            C2609 c2609 = c5557.f17179;
            c2609.getClass();
            c5557.f17179 = c2609M43517.m8248(c2609);
            for (AbstractC5144 abstractC5144 : c2609M43517) {
                C14163 c14163 = c5557.f17186;
                c14163.mo16101();
                c14163.f42762.mo26382(((C8526) abstractC5144).f26045);
            }
            this.f75051 = c5557;
            this.f27814 = c12379;
        } catch (Throwable th2) {
            this.f27814 = c12379;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C2609 c2609M39967;
        C3581 c3581;
        C12048 c12048;
        char c;
        C2735 c2735M39902;
        boolean z;
        C3581 c3582;
        C18356 c18356 = (C18356) this.f27816;
        final C3581 c3583 = c18356.f57038;
        final C12048 c12049 = c18356.f57042;
        C10658 c10658 = (C10658) c3583.f17560;
        final AbstractC5698 abstractC5698 = c18356.f77787;
        C11003.requireNonNull(abstractC5698);
        m23597(c14169, new Supplier() { // from class: l.ۚۨ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return abstractC5698.mo16081();
            }
        }, new Consumer() { // from class: l.۠ۨ֨
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                abstractC5698.m16074((C2609) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        }, new C1150(1, c3583));
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        C6136 c6136 = this.f27819;
        int i = 0;
        boolean z2 = abstractC10370 == c6136.f18879;
        if (z2 || abstractC10370 == c6136.f18842) {
            final AbstractC5698 abstractC5699 = abstractC5698.f17561;
            C11003.requireNonNull(abstractC5699);
            Supplier supplier = z2 ? new Supplier() { // from class: l.ܶۨ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC5699.m16105();
                }
            } : new Supplier() { // from class: l.᩸ۨ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC5699.m16073();
                }
            };
            C11003.requireNonNull(abstractC5699);
            m23597(c14169, supplier, z2 ? new C22257(i, abstractC5699) : new C20141(i, abstractC5699), new Consumer() { // from class: l.֨ۨ֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    c3583.m16097((C2609) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
        if (c12049 != null && c12049.mo952() == EnumC23258.FIELD) {
            m23597(c14169, new Supplier() { // from class: l.ۚۨ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return c12049.mo16081();
                }
            }, new Consumer() { // from class: l.۠ۨ֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    c12049.m16074((C2609) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: l.֨ۨ֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    c3583.m16097((C2609) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
        C17013 c17013 = this.f27818;
        C2176 c2176M39899 = c17013.m39899(c3583.f17563);
        AbstractC10370 abstractC10371 = c3583.f17562;
        AbstractC12612 abstractC12612M39954 = this.f27818.m39954(c10658.f32060.f13890);
        C2609 c2609M8239 = C2609.m8239();
        C2609 c2609 = c18356.f57041;
        C2609 c26010 = c10658.f32061;
        if (c26010 == null) {
            c2609M39967 = C2609.m8239();
        } else {
            c2609M39967 = this.f27818.m39967(c26010);
        }
        C8526 c8526M39917 = c17013.m39917(c2176M39899, abstractC10371, abstractC12612M39954, c2609M8239, null, c2609, c2609M39967, null, null);
        c8526M39917.f26045 = c3583;
        c8526M39917.f16086 = c10658;
        EnumC13706 enumC13706M33819 = c14169.m33819();
        EnumC13706 enumC13706 = EnumC13706.EXPRESSION;
        C20661 c20661 = this.f27808;
        C6319 c6319 = this.f27821;
        if (enumC13706M33819 == enumC13706) {
            AbstractC12612 abstractC12612 = (AbstractC12612) c14169.f42776;
            AbstractC4308 abstractC4308Mo12923 = c8526M39917.f16086.mo12923();
            AbstractC4308 abstractC4308 = abstractC12612.f16086;
            c = 0;
            EnumC9454 enumC9454 = EnumC9454.VOID;
            boolean zM12913 = abstractC4308.m12913(enumC9454);
            boolean zM12914 = abstractC4308Mo12923.m12913(enumC9454);
            boolean zM17550 = c6319.m17550(abstractC4308Mo12923, c6319.m17496(c20661.f66501).f17560);
            C17013 c17014 = this.f27818;
            int i2 = c17014.f52172;
            c3581 = c3583;
            c12048 = c12049;
            try {
                if (zM12914) {
                    c17014.m39946((InterfaceC3109) abstractC12612);
                    c2735M39902 = this.f27818.m39902(0L, C2609.of((Object) c17014.m39953(abstractC12612)));
                } else if (zM12913 && zM17550) {
                    C18837 c18837 = new C18837();
                    C17013 c17015 = this.f27818;
                    c17015.m39946((InterfaceC3109) abstractC12612);
                    c18837.m43511(c17015.m39953(abstractC12612));
                    C17013 c17016 = this.f27818;
                    C23342 c23342M39944 = c17016.m39944(EnumC9454.BOT, (Object) null);
                    c23342M39944.f16086 = c20661.f66522;
                    c18837.m43511(c17016.m39964(c23342M39944));
                    c2735M39902 = this.f27818.m39902(0L, c18837.m43517());
                } else {
                    c17014.m39946((InterfaceC3109) abstractC12612);
                    c2735M39902 = c17014.m39902(0L, C2609.of((Object) this.f27818.m39964(abstractC12612)));
                }
                this.f27818.f52172 = i2;
            } catch (Throwable th) {
                this.f27818.f52172 = i2;
                throw th;
            }
        } else {
            c3581 = c3583;
            c12048 = c12049;
            c = 0;
            C2735 c2735 = (C2735) c14169.f42776;
            boolean z3 = c14169.f42774;
            AbstractC4308 abstractC4308Mo12924 = c8526M39917.f16086.mo12923();
            boolean zM12915 = abstractC4308Mo12924.m12913(EnumC9454.VOID);
            boolean zM17551 = c6319.m17550(abstractC4308Mo12924, c6319.m17496(c20661.f66501).f17560);
            c2735M39902 = (C2735) new C3207(this, zM12915, c8526M39917).mo23617(c2735);
            if (z3 && zM17551) {
                C2609 c26011 = c2735M39902.f8521;
                C17013 c17017 = this.f27818;
                C23342 c23342M39945 = c17017.m39944(EnumC9454.BOT, (Object) null);
                c23342M39945.f16086 = c20661.f66522;
                c2735M39902.f8521 = c26011.m8242(c17017.m39964(c23342M39945));
            }
        }
        c8526M39917.f26043 = (C2735) mo23617(c2735M39902);
        if (!this.f27807 || this.f27823 || c18356.m52836()) {
            z = false;
            c3582 = c3581;
        } else {
            C13084 c13084 = new C13084(this, c8526M39917.f26045, c8526M39917.f26043);
            C13084 c13085 = (C13084) C13843.putIfAbsent(this.f27814.f37112, c13084, c13084);
            if (c13085 != null) {
                c3582 = c13085.f39178;
                if (this.f27822) {
                    C13691 c13691 = C23174.f74467;
                    Object[] objArr = new Object[1];
                    objArr[c] = c3582;
                    this.f27804.m7274(c14169, new C13691("compiler", "verbose.l2m.deduplicate", objArr));
                }
                z = true;
            } else {
                z = false;
                c3582 = c3581;
            }
        }
        if (!z) {
            C12379.m30090(this.f27814, c8526M39917);
        }
        C18837 c18838 = new C18837();
        AbstractC12612 abstractC12613 = c18356.f57044;
        if (abstractC12613 != null) {
            c18838.m43511(abstractC12613);
        } else if (!c3582.mo15572()) {
            c18838.m43511(this.f27818.m39914((AbstractC5698) new C12048(8589938704L, c6136.f18886, c3582.f17561.m16071().f17560, abstractC5698.m16071())));
        }
        for (AbstractC5698 abstractC56910 : c18356.m42778(EnumC21179.CAPTURED_VAR).keySet()) {
            C12048 c120410 = c12048;
            if (abstractC56910 != c120410) {
                C7673 c7673M39914 = this.f27818.m39914(abstractC56910);
                c7673M39914.f16086 = abstractC56910.f17560;
                c18838.m43511(c7673M39914);
            }
            c12048 = c120410;
        }
        Iterator it = c18356.m42778(EnumC21179.CAPTURED_OUTER_THIS).keySet().iterator();
        while (it.hasNext()) {
            c18838.m43511(this.f27818.m39910(((AbstractC5698) it.next()).f17560));
        }
        this.f75051 = m23594(this.f27816, c3582.mo10967(), m23615(c18838.m43517(), c18356.f77789));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23597(C14169 c14169, Supplier supplier, Consumer consumer, Consumer consumer2) {
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        for (C6507 c6507 : (C2609) supplier.get()) {
            if (c6507.f50415.f30049 == c14169) {
                c18838.m43511(c6507);
            } else {
                c18837.m43511(c6507);
            }
        }
        if (c18838.m43518()) {
            consumer.n(c18837.m43517());
            consumer2.n(c18838.m43517());
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        AbstractC12612 abstractC12612M39914;
        C17650 c17650 = (C17650) this.f27816;
        C3581 c3581 = (C3581) c9232.f27943;
        switch (C4618.f14692[c9232.f27942.ordinal()]) {
            case 1:
            case 2:
                abstractC12612M39914 = this.f27818.m39914((AbstractC5698) new C12048(8589938704L, this.f27819.f18886, c17650.f77787.m16071().f17560, c17650.f77787.m16071()));
                break;
            case 3:
                abstractC12612M39914 = this.f27815.m23939(this.f27813.m27677(this.f27821.m17519(c9232.f27943.f17561.f17560), this.f27817, c9232.f27945));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                abstractC12612M39914 = null;
                break;
            default:
                throw new InternalError("Should not have an invalid kind");
        }
        this.f75051 = m23594(c17650, c3581.mo10967(), abstractC12612M39914 == null ? C2609.m8239() : m23615(C2609.of((Object) abstractC12612M39914), c17650.f77789));
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        if (this.f27816 == null || !this.f27811.m19055(c7673.f23697)) {
            super.mo1385(c7673);
            return;
        }
        C17013 c17013 = this.f27818;
        int i = c17013.f52172;
        try {
            c17013.m39946((InterfaceC3109) c7673);
            AbstractC12612 abstractC12612M42780 = ((C18356) this.f27816).m42780(c7673);
            if (abstractC12612M42780 != null) {
                this.f75051 = abstractC12612M42780;
            } else {
                super.mo1385(c7673);
            }
        } finally {
            this.f27818.f52172 = i;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (this.f27816 != null) {
            C9184 c9184 = this.f27811.f21747;
            AbstractC24000 abstractC24000 = c9184.f27816;
            if (abstractC24000 instanceof C18356) {
                C18356 c18356 = (C18356) abstractC24000;
                if (!c6262.f19396.mo15572() && c6262.f19395 == c9184.f27819.f18886 && c6262.f19396.f17561.f17559 == EnumC1296.f4582 && !((Map) c18356.f57039.get(EnumC21179.CAPTURED_OUTER_THIS)).isEmpty()) {
                    C17013 c17013 = this.f27818;
                    int i = c17013.f52172;
                    try {
                        c17013.m39946((InterfaceC3109) c6262);
                        C7673 c7673M42779 = ((C18356) this.f27816).m42779(c6262);
                        if (c7673M42779 != null) {
                            this.f75051 = c7673M42779;
                        } else {
                            super.mo1381(c6262);
                        }
                        return;
                    } finally {
                        this.f27818.f52172 = i;
                    }
                }
            }
        }
        super.mo1381(c6262);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        AbstractC24000 abstractC24000 = this.f27816;
        if (abstractC24000 == null || !this.f27811.m19058(abstractC24000, c19110)) {
            super.mo1419(c19110);
            return;
        }
        C17013 c17013 = this.f27818;
        int i = c17013.f52172;
        try {
            c17013.m39946((InterfaceC3109) c19110);
            ((C18356) this.f27816).m42782(c19110);
            super.mo1419(c19110);
        } finally {
            this.f27818.f52172 = i;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        AbstractC24000 abstractC24000 = this.f27816;
        C18356 c18356 = (C18356) abstractC24000;
        if (abstractC24000 != null) {
            EnumC21179 enumC21179 = EnumC21179.LOCAL_VAR;
            if (c18356.m42778(enumC21179).containsKey(c9378.f28489)) {
                c9378.f28487 = (AbstractC12612) mo23617(c9378.f28487);
                c9378.f28489 = (C12048) c18356.m42778(enumC21179).get(c9378.f28489);
                this.f75051 = c9378;
                return;
            }
        }
        super.mo1392(c9378);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C8526 m23612() {
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        for (Map.Entry entry : this.f27814.f37111.entrySet()) {
            C4146 c4146M39906 = this.f27818.m39906((AbstractC10370) null);
            c18838.m43511(c4146M39906);
            C18837 c18839 = (C18837) entry.getValue();
            c18839.m43511(c4146M39906);
            C2609 c2609M43517 = c18839.m43517();
            C17013 c17013 = this.f27818;
            c18837.m43511(c17013.m39938(C18963.f59812, C2609.of((Object) c17013.m39943(entry.getKey())), c2609M43517, (AbstractC5144) null));
        }
        C17013 c17014 = this.f27818;
        C20661 c20661 = this.f27808;
        C22637 c22637M39972 = c17014.m39972(m23592("getImplMethodName", c20661.f66533, C2609.m8239(), C2609.m8239()), c18837.m43517());
        Iterator it = c18838.iterator();
        while (it.hasNext()) {
            ((C4146) it.next()).f13546 = c22637M39972;
        }
        C17013 c17015 = this.f27818;
        AbstractC4308 abstractC4308 = c20661.f66488;
        C2609 c2609Of = C2609.of((Object) c17015.m39943("Invalid lambda deserialization"));
        AbstractC5698 abstractC5698M50312 = this.f27803.m50312((InterfaceC3109) null, this.f27817, abstractC4308, C7260.m19434(c2609Of), C2609.m8239());
        C17013 c17016 = this.f27818;
        C19110 c19110M39939 = c17016.m39939((AbstractC12612) null, (C2609) null, c17016.m39954(abstractC4308.f13890), c2609Of, (C5557) null, false);
        c19110M39939.f60194 = abstractC5698M50312;
        c19110M39939.f16086 = abstractC4308;
        C2735 c2735M39902 = c17015.m39902(0L, C2609.of((Object) c22637M39972, (Object) c17015.m39971(c19110M39939)));
        C17013 c17017 = this.f27818;
        C8526 c8526M39917 = c17017.m39917(c17017.m39899(this.f27814.f37114.f17563), this.f27819.f18820, this.f27818.m39954(this.f27814.f37114.f17560.mo12923().f13890), C2609.m8239(), null, C2609.of((Object) this.f27818.m39923(this.f27814.f37113, (AbstractC12612) null)), C2609.m8239(), c2735M39902, null);
        c8526M39917.f26045 = this.f27814.f37114;
        c8526M39917.f16086 = this.f27814.f37114.f17560;
        return c8526M39917;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23598(C15574 c15574, AbstractC4308 abstractC4308, C3581 c3581, InterfaceC3109 interfaceC3109, C2609 c2609, C10658 c10658) {
        String strM23586 = m23586(abstractC4308);
        String string = c3581.f17562.toString();
        AbstractC4308 abstractC4309 = c3581.f17560;
        C6319 c6319 = this.f27821;
        int i = 0;
        String strM23587 = m23587(c6319.m17519(abstractC4309), false);
        String strM23588 = m23586(c6319.m17519(c15574.f17561.f17560));
        String string2 = c15574.f17562.toString();
        String strM23589 = m23587(c6319.m17519(c15574.f17560), false);
        C20661 c20661 = this.f27808;
        C7254 c7254 = c20661.f66452;
        C15580 c15580M23592 = m23592("getImplMethodKind", c7254, C2609.m8239(), C2609.m8239());
        C23342 c23342M39943 = this.f27818.m39943(Integer.valueOf(c15574.m36708()));
        C17013 c17013 = this.f27818;
        EnumC18550 enumC18550 = EnumC18550.f57559;
        C9085 c9085M39919 = c17013.m39919(enumC18550, (AbstractC12612) c15580M23592, (AbstractC12612) c23342M39943);
        c9085M39919.f2830 = this.f27806.m25477(c9085M39919, enumC18550, c7254, c7254);
        c9085M39919.f16086 = c20661.f66469;
        C18837 c18837 = new C18837();
        Iterator it = c10658.f32059.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC43010 = (AbstractC4308) it.next();
            C18837 c18838 = new C18837();
            String str = string2;
            c18838.m43511(this.f27818.m39943(Integer.valueOf(i)));
            C2609 c2609M43517 = c18838.m43517();
            C18837 c18839 = new C18837();
            c18839.m43511(c20661.f66452);
            c18837.m43511(this.f27818.m39935(c6319.m17519(abstractC43010), m23592("getCapturedArg", c20661.f66526, c18839.m43517(), c2609M43517)));
            i++;
            it = it;
            string2 = str;
            c6319 = c6319;
        }
        String str2 = string2;
        C1470 c1470M39898 = this.f27818.m39898(m23589(m23589(m23589(m23589(m23589(c9085M39919, "getFunctionalInterfaceClass", strM23586), "getFunctionalInterfaceMethodName", string), "getFunctionalInterfaceMethodSignature", strM23587), "getImplClass", strM23588), "getImplMethodSignature", strM23589), this.f27818.m39964(m23593(interfaceC3109, c20661.f66497, this.f27819.f18797, c2609, c10658, c18837.m43517(), c3581.f17562)), (AbstractC11349) null);
        C18837 c188310 = (C18837) this.f27814.f37111.get(str2);
        if (c188310 == null) {
            c188310 = new C18837();
            this.f27814.f37111.put(str2, c188310);
        }
        c188310.m43511(c1470M39898);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9085 m23589(C9085 c9085, String str, String str2) {
        C20661 c20661 = this.f27808;
        C2609 c2609Of = C2609.of((Object) c20661.f66526);
        C7254 c7254 = c20661.f66469;
        C10658 c10658 = new C10658(c2609Of, c7254, C2609.m8239(), c20661.f66481);
        C1755 c1755 = this.f27817;
        AbstractC4308 abstractC4308 = c20661.f66526;
        AbstractC10370 abstractC10370 = this.f27819.f18871;
        C2609 c2609Of2 = C2609.of((Object) abstractC4308);
        C2609 c2609M8239 = C2609.m8239();
        C22406 c22406 = this.f27803;
        c22406.getClass();
        AbstractC5698 abstractC5698M50313 = c22406.m50313((InterfaceC3109) null, c1755, abstractC4308.f13890, abstractC4308, abstractC10370, c2609Of2, c2609M8239);
        C17013 c17013 = this.f27818;
        C2609 c2609M82310 = C2609.m8239();
        C6262 c6262M39911 = this.f27818.m39911(m23592(str, c20661.f66533, C2609.m8239(), C2609.m8239()), abstractC5698M50313);
        c6262M39911.f16086 = c10658;
        C15580 c15580M39929 = c17013.m39929(c6262M39911, c2609M82310, C2609.of((Object) this.f27818.m39943(str2)));
        c15580M39929.f16086 = c7254;
        C17013 c17014 = this.f27818;
        EnumC18550 enumC18550 = EnumC18550.f57565;
        C9085 c9085M39919 = c17014.m39919(enumC18550, (AbstractC12612) c9085, (AbstractC12612) c15580M39929);
        c9085M39919.f2830 = this.f27806.m25477(c9085M39919, enumC18550, c7254, c7254);
        c9085M39919.f16086 = c7254;
        return c9085M39919;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15580 m23592(String str, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010) {
        C2609 c2609M8239 = C2609.m8239();
        C20661 c20661 = this.f27808;
        C10658 c10658 = new C10658(c2609, abstractC4308, c2609M8239, c20661.f66481);
        C1755 c1755 = this.f27817;
        AbstractC4308 abstractC4309 = c20661.f66507;
        AbstractC12486 abstractC12486 = this.f27819.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        AbstractC10370 abstractC10370Mo15927 = abstractC12486.mo15927(charArray, charArray.length);
        C2609 c2609M82310 = C2609.m8239();
        C22406 c22406 = this.f27803;
        c22406.getClass();
        AbstractC5698 abstractC5698M50313 = c22406.m50313((InterfaceC3109) null, c1755, abstractC4309.f13890, abstractC4309, abstractC10370Mo15927, c2609, c2609M82310);
        C17013 c17013 = this.f27818;
        C2609 c2609M82311 = C2609.m8239();
        C17013 c17014 = this.f27818;
        C7673 c7673M39914 = c17014.m39914((AbstractC5698) this.f27814.f37113);
        c7673M39914.f16086 = abstractC4309;
        C6262 c6262M39911 = c17014.m39911(c7673M39914, abstractC5698M50313);
        c6262M39911.f16086 = c10658;
        C15580 c15580M39929 = c17013.m39929(c6262M39911, c2609M82311, c26010);
        c15580M39929.f16086 = abstractC4308;
        return c15580M39929;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23606(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        if (abstractC4308 != null) {
            int i = C4618.f14693[abstractC12612.mo989().ordinal()];
            if (i == 1) {
                ((C15580) abstractC12612).f48009 = abstractC4308;
            } else if (i == 2) {
                ((C19110) abstractC12612).f60193 = abstractC4308;
            } else {
                if (i == 3) {
                    m23606(abstractC4308, ((C17844) abstractC12612).f54512);
                    return;
                }
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23596(C9184 c9184, AbstractC5698 abstractC5698, C2609 c2609, AbstractC4308 abstractC4308) {
        C12171.m29642(abstractC5698.f17559 == EnumC1296.f4571);
        C2609 c2609Mo12933 = c9184.f27821.m17519(abstractC5698.f17560).mo12933();
        if (abstractC4308 != null) {
            C12171.m29642((abstractC5698.mo16084() & 17179869184L) != 0);
        }
        c9184.f27813.m27680(c2609, c2609Mo12933, abstractC4308, c9184.f27817);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15580 m23594(AbstractC24000 abstractC24000, C15574 c15574, C2609 c2609) {
        C2609 c26010;
        int i;
        AbstractC23195 abstractC23195 = abstractC24000.f77786;
        C2609<AbstractC5698> c26011 = abstractC24000.f77784;
        AbstractC19810 abstractC19810 = abstractC23195.f74560.f13890;
        C6319 c6319 = this.f27821;
        C3581 c3581 = (C3581) c6319.m17493(abstractC19810);
        AbstractC4308 abstractC4308M17519 = c6319.m17519(c3581.f17560);
        C2609 c2609Mo12933 = abstractC4308M17519.mo12933();
        AbstractC4308 abstractC4308Mo12923 = abstractC4308M17519.mo12923();
        C2609 c2609Mo12930 = abstractC4308M17519.mo12930();
        C20661 c20661 = this.f27808;
        C10658 c10658 = new C10658(c2609Mo12933, abstractC4308Mo12923, c2609Mo12930, c20661.f66481);
        c15574.getClass();
        AbstractC4308 abstractC4308M175110 = c6319.m17519(abstractC23195.m51449(c6319));
        C2609 c2609Of = C2609.of((Object) c10658, (Object) c15574, (Object) new C10658(abstractC4308M175110.mo12933(), abstractC4308M175110.mo12923(), abstractC4308M175110.mo12930(), c20661.f66481));
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(((AbstractC12612) it.next()).f16086);
        }
        C10658 c10659 = new C10658(c18837.m43517(), abstractC23195.f16086, C2609.m8239(), c20661.f66481);
        boolean zM52837 = abstractC24000.m52837();
        C6136 c6136 = this.f27819;
        AbstractC10370 abstractC10370 = zM52837 ? c6136.f18797 : c6136.f18836;
        if (abstractC24000.m52837()) {
            C18837 c18838 = new C18837();
            AbstractC4308 abstractC4308 = abstractC23195.f74560;
            abstractC4308.getClass();
            Iterator it2 = (abstractC4308 instanceof C5843 ? c6319.m17565(abstractC23195.f74560) : C2609.m8239()).iterator();
            while (it2.hasNext()) {
                AbstractC4308 abstractC4308M175111 = c6319.m17519((AbstractC4308) it2.next());
                AbstractC19810 abstractC19811 = abstractC4308M175111.f13890;
                if (abstractC19811 != c20661.f66487.f13890 && abstractC19811 != abstractC23195.f16086.f13890 && abstractC19811 != c20661.f66526.f13890) {
                    c18838.m43511(abstractC4308M175111);
                }
            }
            boolean zM52836 = abstractC24000.m52836();
            boolean zM43518 = c18838.m43518();
            boolean zM8249 = c26011.m8249();
            int i2 = zM52836;
            if (zM43518) {
                i = (zM52836 ? 1 : 0) | 2;
            }
            if (zM8249) {
                i2 = i;
                i2 = (i2 == true ? 1 : 0) | 4;
            }
            i2 = i;
            C2609 c2609M8242 = c2609Of.m8242(C5268.m15193(i2));
            if (zM43518) {
                C2609 c2609M8243 = c2609M8242.m8242(C5268.m15193(c18838.m43514()));
                C2609 c2609M43517 = c18838.m43517();
                if (c2609M43517 == null) {
                    c2609M43517 = null;
                } else {
                    Iterator it3 = c2609M43517.iterator();
                    while (it3.hasNext()) {
                        InterfaceC8090.class.cast(it3.next());
                    }
                }
                c2609M8243.getClass();
                c2609M8242 = c2609M43517.m8248(c2609M8243);
            }
            if (zM8249) {
                c2609M8242 = c2609M8242.m8242(C5268.m15193(c26011.m8245() - 1));
                for (AbstractC5698 abstractC5698 : c26011) {
                    if (!c6319.m17550(abstractC5698.mo16091(c6319), c3581.mo16091(c6319))) {
                        c2609M8242 = c2609M8242.m8242((C10658) abstractC5698.mo16091(c6319));
                    }
                }
            }
            C2609 c26012 = c2609M8242;
            if (abstractC24000.m52836()) {
                C17013 c17013 = this.f27818;
                int i3 = c17013.f52172;
                try {
                    c17013.m39946((InterfaceC3109) this.f27814.f37110);
                    m23598(c15574, abstractC23195.f16086, c3581, abstractC23195, c26012, c10659);
                    this.f27818.f52172 = i3;
                } catch (Throwable th) {
                    this.f27818.f52172 = i3;
                    throw th;
                }
            }
            c26010 = c26012;
        } else {
            c26010 = c2609Of;
        }
        return m23593(abstractC23195, c20661.f66497, abstractC10370, c26010, c10659, c2609, c3581.f17562);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15580 m23593(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C10658 c10658, C2609 c26010, AbstractC10370 abstractC10371) {
        C6319 c6319 = this.f27821;
        C20661 c20661 = this.f27808;
        C17013 c17013 = this.f27818;
        int i = c17013.f52172;
        try {
            c17013.m39946(interfaceC3109);
            C2609 c2609Of = C2609.of((Object) c20661.f66478, (Object) c20661.f66533, (Object) c20661.f66455);
            C11003.requireNonNull(c6319);
            C9226 c9226 = new C9226(abstractC10371, c20661.f66475, this.f27803.m50300(interfaceC3109, this.f27817, abstractC4308, abstractC10370, c2609.m8243((Function) new C10511(1, c6319)).m8248(c2609Of), C2609.m8239()).mo10967(), c10658, (InterfaceC8090[]) c2609.toArray(new InterfaceC8090[c2609.m8245()]));
            C17013 c17014 = this.f27818;
            C6262 c6262M39912 = c17014.m39912(c17014.m39954(abstractC4308.f13890), abstractC10370);
            C9226 c9227 = (C9226) C13843.putIfAbsent(this.f27814.f37115, C3857.m11618(c9226, c6319), c9226);
            if (c9227 != null) {
                c9226 = c9227;
            }
            c6262M39912.f19396 = c9226;
            c6262M39912.f16086 = c10658.f32060;
            C15580 c15580M39929 = this.f27818.m39929(c6262M39912, C2609.m8239(), c26010);
            c15580M39929.f16086 = c10658.f32060;
            return c15580M39929;
        } finally {
            this.f27818.f52172 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m23587(AbstractC4308 abstractC4308, boolean z) {
        try {
            C10263 c10263 = new C10263(this, z);
            c10263.mo8627(abstractC4308);
            return c10263.f30906.toString();
        } catch (C16196 e) {
            C14163 c14163 = this.f27817.f6079.f17186;
            AbstractC4308 abstractC4308M38127 = e.m38127();
            C11576 c11576 = C11886.f35440;
            this.f27804.m7276(C6241.m17184(c14163, new C11576("compiler", "illegal.signature", c14163, abstractC4308M38127)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m23586(AbstractC4308 abstractC4308) {
        try {
            C10263 c10263 = new C10263(this, false);
            c10263.m8623(abstractC4308);
            return c10263.f30906.toString();
        } catch (C16196 e) {
            C14163 c14163 = this.f27817.f6079.f17186;
            AbstractC4308 abstractC4308M38127 = e.m38127();
            C11576 c11576 = C11886.f35440;
            this.f27804.m7276(C6241.m17184(c14163, new C11576("compiler", "illegal.signature", c14163, abstractC4308M38127)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23599(C9184 c9184, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        return ((abstractC5698.mo16084() & 4) == 0 || abstractC5698.m16089() == abstractC5699.m16089()) ? false : true;
    }

    public C9184(C2903 c2903) {
        boolean zM28829;
        c2903.m8841(f27801, this);
        this.f27820 = C5931.m16615(c2903);
        this.f27804 = C22364.m50099(c2903);
        this.f27805 = C23294.m51630(c2903);
        this.f27819 = C6136.m17057(c2903);
        this.f27808 = C20661.m47250(c2903);
        this.f27803 = C22406.m50289(c2903);
        this.f27806 = C10139.m25473(c2903);
        this.f27818 = C17013.m39896(c2903);
        this.f27821 = C6319.m17456(c2903);
        this.f27813 = C11160.m27673(c2903);
        this.f27811 = new C7067(this);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f27810 = c11781M28823.m28831("debug.dumpLambdaToMethodStats");
        this.f27815 = C9310.m23901(c2903);
        this.f27809 = c11781M28823.m28831("forceSerializable");
        EnumC0121 enumC0121 = EnumC0121.f1202;
        boolean z = c11781M28823.m28836(enumC0121) || c11781M28823.m28829(enumC0121, "lines");
        if (c11781M28823.m28836(enumC0121)) {
            zM28829 = c11781M28823.m28832(EnumC0121.f1178);
        } else {
            zM28829 = c11781M28823.m28829(enumC0121, "vars");
        }
        this.f27823 = z || zM28829;
        this.f27822 = c11781M28823.m28831("debug.dumpLambdaToMethodDeduplication");
        String strM28824 = c11781M28823.m28824("deduplicateLambdas");
        this.f27807 = strM28824 != null ? Boolean.parseBoolean(strM28824) : true;
        this.f27802 = EnumC10892.m27201(c2903).m27202();
    }
}
