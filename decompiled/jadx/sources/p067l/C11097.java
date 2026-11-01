package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11097 extends C24572 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C6468 f30740 = new C6468();

    /* JADX INFO: renamed from: ֡ */
    public final boolean f30741;

    /* JADX INFO: renamed from: ֨ */
    public C23663 f30742;

    /* JADX INFO: renamed from: ۖ */
    public C23623 f30743;

    /* JADX INFO: renamed from: ۘ */
    public C24507 f30744;

    /* JADX INFO: renamed from: ۚ */
    public C12004 f30745;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f30746;

    /* JADX INFO: renamed from: ۠ */
    public C22004 f30747;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f30748;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f30749;

    /* JADX INFO: renamed from: ۧ */
    public C9085 f30750;

    /* JADX INFO: renamed from: ܳ */
    public HashMap f30751;

    /* JADX INFO: renamed from: ܶ */
    public C12975 f30752;

    /* JADX INFO: renamed from: ܺ */
    public C14133 f30753;

    /* JADX INFO: renamed from: ܽ */
    public C11216 f30754;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC25178 f30755;

    /* JADX INFO: renamed from: ᩳ */
    public C4036 f30756;

    /* JADX INFO: renamed from: ᩴ */
    public C18537 f30757;

    /* JADX INFO: renamed from: ᩵ */
    public C8200 f30758;

    /* JADX INFO: renamed from: ᩷ */
    public C8005 f30759;

    /* JADX INFO: renamed from: ᩸ */
    public C8374 f30760;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f30761;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f30762;

    /* JADX INFO: renamed from: ֫ */
    public static C11097 m25542(C5127 c5127) {
        C11097 c11097 = (C11097) c5127.m10905(f30740);
        return c11097 == null ? new C11097(c5127) : c11097;
    }

    @Override // p067l.C24572
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7257 mo25569(AbstractC7257 abstractC7257) {
        AbstractC25178 abstractC25178 = (AbstractC25178) this.f30751.get(abstractC7257);
        if (abstractC25178 == null) {
            abstractC25178 = this.f30755;
        }
        AbstractC25178 abstractC25179 = this.f30755;
        try {
            this.f30755 = abstractC25178;
            return super.mo25569(abstractC7257);
        } finally {
            this.f30755 = abstractC25179;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m25567(C4848 c4848, AbstractC25178 abstractC25178) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
            AbstractC25178 abstractC25179 = this.f30755;
            try {
                this.f30755 = abstractC25178;
                AbstractC7257 abstractC7257Mo25569 = super.mo25569(abstractC7257);
                this.f30755 = abstractC25179;
                c20271.m45777(abstractC7257Mo25569);
            } catch (Throwable th) {
                this.f30755 = abstractC25179;
                throw th;
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 m25568(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        this.f30757 = c18537;
        this.f30756 = c4036;
        this.f30755 = null;
        this.f30751 = new HashMap();
        return mo25569(abstractC7257);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        if (c7650.f20027.f20407.f20405 == EnumC3600.f7351) {
            c7650 = C9085.m21008(this.f30750, c7650);
        }
        C14133 c14133 = this.f30753;
        try {
            this.f30753 = new C14133(this, c7650);
            super.mo3617(c7650);
            if (!this.f30753.f40128.isEmpty()) {
                C18537 c18537 = this.f30757;
                int i = c18537.f55352;
                try {
                    c18537.m42189((InterfaceC5323) c7650);
                    C14133.m32154(this.f30753, m25564());
                    this.f30757.f55352 = i;
                } catch (Throwable th) {
                    this.f30757.f55352 = i;
                    throw th;
                }
            }
            C4848<AbstractC7257> c4848M45783 = this.f30753.f40126.m45783();
            C4848 c4848 = c7650.f20020;
            c4848.getClass();
            c7650.f20020 = c4848M45783.m10292(c4848);
            for (AbstractC7257 abstractC7257 : c4848M45783) {
                C15828 c15828 = c7650.f20027;
                c15828.mo18020();
                c15828.f45850.mo28415(((C10471) abstractC7257).f28960);
            }
            this.f77797 = c7650;
            this.f30753 = c14133;
        } catch (Throwable th2) {
            this.f30753 = c14133;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        C4848 c4848M42210;
        C5771 c5771;
        C13818 c13818;
        char c;
        C4968 c4968M42145;
        boolean z;
        C5771 c5772;
        C19814 c19814 = (C19814) this.f30755;
        final C5771 c5773 = c19814.f60258;
        final C13818 c13819 = c19814.f60262;
        C12497 c12497 = (C12497) c5773.f20406;
        final AbstractC7783 abstractC7783 = c19814.f80539;
        C12826.requireNonNull(abstractC7783);
        m25549(c15834, new Supplier() { // from class: l.ۚۨ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return abstractC7783.mo18000();
            }
        }, new Consumer() { // from class: l.۠ۨ֨
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                abstractC7783.m17993((C4848) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        }, new C3461(1, c5773));
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        C8200 c8200 = this.f30758;
        int i = 0;
        boolean z2 = abstractC12224 == c8200.f21737;
        if (z2 || abstractC12224 == c8200.f21700) {
            final AbstractC7783 abstractC7784 = abstractC7783.f20407;
            C12826.requireNonNull(abstractC7784);
            Supplier supplier = z2 ? new Supplier() { // from class: l.ܶۨ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC7784.m18024();
                }
            } : new Supplier() { // from class: l.᩸ۨ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC7784.m17992();
                }
            };
            C12826.requireNonNull(abstractC7784);
            m25549(c15834, supplier, z2 ? new C23521(i, abstractC7784) : new C21510(i, abstractC7784), new Consumer() { // from class: l.֨ۨ֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    c5773.m18016((C4848) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        }
        if (c13819 != null && c13819.mo3347() == EnumC24473.FIELD) {
            m25549(c15834, new Supplier() { // from class: l.ۚۨ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return c13819.mo18000();
                }
            }, new Consumer() { // from class: l.۠ۨ֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    c13819.m17993((C4848) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: l.֨ۨ֨
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    c5773.m18016((C4848) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        }
        C18537 c18537 = this.f30757;
        C4436 c4436M42142 = c18537.m42142(c5773.f20409);
        AbstractC12224 abstractC12225 = c5773.f20408;
        AbstractC14355 abstractC14355M42197 = this.f30757.m42197(c12497.f35031.f16705);
        C4848 c4848M10283 = C4848.m10283();
        C4848 c4848 = c19814.f60261;
        C4848 c4849 = c12497.f35032;
        if (c4849 == null) {
            c4848M42210 = C4848.m10283();
        } else {
            c4848M42210 = this.f30757.m42210(c4849);
        }
        C10471 c10471M42160 = c18537.m42160(c4436M42142, abstractC12225, abstractC14355M42197, c4848M10283, null, c4848, c4848M42210, null, null);
        c10471M42160.f28960 = c5773;
        c10471M42160.f18925 = c12497;
        EnumC15394 enumC15394M35951 = c15834.m35951();
        EnumC15394 enumC15394 = EnumC15394.EXPRESSION;
        C22004 c22004 = this.f30747;
        C8374 c8374 = this.f30760;
        if (enumC15394M35951 == enumC15394) {
            AbstractC14355 abstractC14355 = (AbstractC14355) c15834.f45864;
            AbstractC6462 abstractC6462Mo14787 = c10471M42160.f18925.mo14787();
            AbstractC6462 abstractC6462 = abstractC14355.f18925;
            c = 0;
            EnumC11353 enumC11353 = EnumC11353.VOID;
            boolean zM14777 = abstractC6462.m14777(enumC11353);
            boolean zM14778 = abstractC6462Mo14787.m14777(enumC11353);
            boolean zM19490 = c8374.m19490(abstractC6462Mo14787, c8374.m19436(c22004.f69183).f20406);
            C18537 c18538 = this.f30757;
            int i2 = c18538.f55352;
            c5771 = c5773;
            c13818 = c13819;
            try {
                if (zM14778) {
                    c18538.m42189((InterfaceC5323) abstractC14355);
                    c4968M42145 = this.f30757.m42145(0L, C4848.m10276of((Object) c18538.m42196(abstractC14355)));
                } else if (zM14777 && zM19490) {
                    C20271 c20271 = new C20271();
                    C18537 c18539 = this.f30757;
                    c18539.m42189((InterfaceC5323) abstractC14355);
                    c20271.m45777(c18539.m42196(abstractC14355));
                    C18537 c185310 = this.f30757;
                    C24552 c24552M42187 = c185310.m42187(EnumC11353.BOT, (Object) null);
                    c24552M42187.f18925 = c22004.f69204;
                    c20271.m45777(c185310.m42207(c24552M42187));
                    c4968M42145 = this.f30757.m42145(0L, c20271.m45783());
                } else {
                    c18538.m42189((InterfaceC5323) abstractC14355);
                    c4968M42145 = c18538.m42145(0L, C4848.m10276of((Object) this.f30757.m42207(abstractC14355)));
                }
                this.f30757.f55352 = i2;
            } catch (Throwable th) {
                this.f30757.f55352 = i2;
                throw th;
            }
        } else {
            c5771 = c5773;
            c13818 = c13819;
            c = 0;
            C4968 c4968 = (C4968) c15834.f45864;
            boolean z3 = c15834.f45862;
            AbstractC6462 abstractC6462Mo14788 = c10471M42160.f18925.mo14787();
            boolean zM14779 = abstractC6462Mo14788.m14777(EnumC11353.VOID);
            boolean zM19491 = c8374.m19490(abstractC6462Mo14788, c8374.m19436(c22004.f69183).f20406);
            c4968M42145 = (C4968) new C5416(this, zM14779, c10471M42160).mo25569(c4968);
            if (z3 && zM19491) {
                C4848 c48410 = c4968M42145.f11316;
                C18537 c185311 = this.f30757;
                C24552 c24552M42188 = c185311.m42187(EnumC11353.BOT, (Object) null);
                c24552M42188.f18925 = c22004.f69204;
                c4968M42145.f11316 = c48410.m10286(c185311.m42207(c24552M42188));
            }
        }
        c10471M42160.f28958 = (C4968) mo25569(c4968M42145);
        if (!this.f30746 || this.f30762 || c19814.m55242()) {
            z = false;
            c5772 = c5771;
        } else {
            C14803 c14803 = new C14803(this, c10471M42160.f28960, c10471M42160.f28958);
            C14803 c14804 = (C14803) C15525.putIfAbsent(this.f30753.f40129, c14803, c14803);
            if (c14804 != null) {
                c5772 = c14804.f42226;
                if (this.f30761) {
                    C15380 c15380 = C24393.f77212;
                    Object[] objArr = new Object[1];
                    objArr[c] = c5772;
                    this.f30743.m9353(c15834, new C15380("compiler", "verbose.l2m.deduplicate", objArr));
                }
                z = true;
            } else {
                z = false;
                c5772 = c5771;
            }
        }
        if (!z) {
            C14133.m32154(this.f30753, c10471M42160);
        }
        C20271 c20272 = new C20271();
        AbstractC14355 abstractC14356 = c19814.f60264;
        if (abstractC14356 != null) {
            c20272.m45777(abstractC14356);
        } else if (!c5772.mo17483()) {
            c20272.m45777(this.f30757.m42157((AbstractC7783) new C13818(8589938704L, c8200.f21744, c5772.f20407.m17990().f20406, abstractC7783.m17990())));
        }
        for (AbstractC7783 abstractC7785 : c19814.m45050(EnumC22497.CAPTURED_VAR).keySet()) {
            C13818 c138110 = c13818;
            if (abstractC7785 != c138110) {
                C9661 c9661M42157 = this.f30757.m42157(abstractC7785);
                c9661M42157.f18925 = abstractC7785.f20406;
                c20272.m45777(c9661M42157);
            }
            c13818 = c138110;
        }
        Iterator it = c19814.m45050(EnumC22497.CAPTURED_OUTER_THIS).keySet().iterator();
        while (it.hasNext()) {
            c20272.m45777(this.f30757.m42153(((AbstractC7783) it.next()).f20406));
        }
        this.f77797 = m25546(this.f30755, c5772.mo12943(), m25567(c20272.m45783(), c19814.f80541));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25549(C15834 c15834, Supplier supplier, Consumer consumer, Consumer consumer2) {
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        for (C8552 c8552 : (C4848) supplier.get()) {
            if (c8552.f53587.f33006 == c15834) {
                c20272.m45777(c8552);
            } else {
                c20271.m45777(c8552);
            }
        }
        if (c20272.m45784()) {
            consumer.m45213n(c20271.m45783());
            consumer2.m45213n(c20272.m45783());
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        AbstractC14355 abstractC14355M42157;
        C19143 c19143 = (C19143) this.f30755;
        C5771 c5771 = (C5771) c11142.f30889;
        switch (C6757.f17520[c11142.f30888.ordinal()]) {
            case 1:
            case 2:
                abstractC14355M42157 = this.f30757.m42157((AbstractC7783) new C13818(8589938704L, this.f30758.f21744, c19143.f80539.m17990().f20406, c19143.f80539.m17990()));
                break;
            case 3:
                abstractC14355M42157 = this.f30754.m25948(this.f30752.m29739(this.f30760.m19459(c11142.f30889.f20407.f20406), this.f30756, c11142.f30891));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                abstractC14355M42157 = null;
                break;
            default:
                throw new InternalError("Should not have an invalid kind");
        }
        this.f77797 = m25546(c19143, c5771.mo12943(), abstractC14355M42157 == null ? C4848.m10283() : m25567(C4848.m10276of((Object) abstractC14355M42157), c19143.f80541));
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        if (this.f30755 == null || !this.f30750.m21013(c9661.f26611)) {
            super.mo3798(c9661);
            return;
        }
        C18537 c18537 = this.f30757;
        int i = c18537.f55352;
        try {
            c18537.m42189((InterfaceC5323) c9661);
            AbstractC14355 abstractC14355M45052 = ((C19814) this.f30755).m45052(c9661);
            if (abstractC14355M45052 != null) {
                this.f77797 = abstractC14355M45052;
            } else {
                super.mo3798(c9661);
            }
        } finally {
            this.f30757.f55352 = i;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        if (this.f30755 != null) {
            C11097 c11097 = this.f30750.f24628;
            AbstractC25178 abstractC25178 = c11097.f30755;
            if (abstractC25178 instanceof C19814) {
                C19814 c19814 = (C19814) abstractC25178;
                if (!c8320.f22260.mo17483() && c8320.f22259 == c11097.f30758.f21744 && c8320.f22260.f20407.f20405 == EnumC3600.f7354 && !((Map) c19814.f60259.get(EnumC22497.CAPTURED_OUTER_THIS)).isEmpty()) {
                    C18537 c18537 = this.f30757;
                    int i = c18537.f55352;
                    try {
                        c18537.m42189((InterfaceC5323) c8320);
                        C9661 c9661M45051 = ((C19814) this.f30755).m45051(c8320);
                        if (c9661M45051 != null) {
                            this.f77797 = c9661M45051;
                        } else {
                            super.mo3794(c8320);
                        }
                        return;
                    } finally {
                        this.f30757.f55352 = i;
                    }
                }
            }
        }
        super.mo3794(c8320);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        AbstractC25178 abstractC25178 = this.f30755;
        if (abstractC25178 == null || !this.f30750.m21016(abstractC25178, c20530)) {
            super.mo3832(c20530);
            return;
        }
        C18537 c18537 = this.f30757;
        int i = c18537.f55352;
        try {
            c18537.m42189((InterfaceC5323) c20530);
            ((C19814) this.f30755).m45054(c20530);
            super.mo3832(c20530);
        } finally {
            this.f30757.f55352 = i;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        AbstractC25178 abstractC25178 = this.f30755;
        C19814 c19814 = (C19814) abstractC25178;
        if (abstractC25178 != null) {
            EnumC22497 enumC22497 = EnumC22497.LOCAL_VAR;
            if (c19814.m45050(enumC22497).containsKey(c11281.f31438)) {
                c11281.f31436 = (AbstractC14355) mo25569(c11281.f31436);
                c11281.f31438 = (C13818) c19814.m45050(enumC22497).get(c11281.f31438);
                this.f77797 = c11281;
                return;
            }
        }
        super.mo3805(c11281);
    }

    /* JADX INFO: renamed from: ᩳ */
    private C10471 m25564() {
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        for (Map.Entry entry : this.f30753.f40128.entrySet()) {
            C6309 c6309M42149 = this.f30757.m42149((AbstractC12224) null);
            c20272.m45777(c6309M42149);
            C20271 c20273 = (C20271) entry.getValue();
            c20273.m45777(c6309M42149);
            C4848 c4848M45783 = c20273.m45783();
            C18537 c18537 = this.f30757;
            c20271.m45777(c18537.m42181(C20391.f63041, C4848.m10276of((Object) c18537.m42186(entry.getKey())), c4848M45783, (AbstractC7257) null));
        }
        C18537 c18538 = this.f30757;
        C22004 c22004 = this.f30747;
        C23882 c23882M42215 = c18538.m42215(m25544("getImplMethodName", c22004.f69215, C4848.m10283(), C4848.m10283()), c20271.m45783());
        Iterator it = c20272.iterator();
        while (it.hasNext()) {
            ((C6309) it.next()).f16360 = c23882M42215;
        }
        C18537 c18539 = this.f30757;
        AbstractC6462 abstractC6462 = c22004.f69170;
        C4848 c4848M10276of = C4848.m10276of((Object) c18539.m42186("Invalid lambda deserialization"));
        AbstractC7783 abstractC7783M52652 = this.f30742.m52652((InterfaceC5323) null, this.f30756, abstractC6462, C9268.m21400(c4848M10276of), C4848.m10283());
        C18537 c185310 = this.f30757;
        C20530 c20530M42182 = c185310.m42182((AbstractC14355) null, (C4848) null, c185310.m42197(abstractC6462.f16705), c4848M10276of, (C7650) null, false);
        c20530M42182.f63427 = abstractC7783M52652;
        c20530M42182.f18925 = abstractC6462;
        C4968 c4968M42145 = c18539.m42145(0L, C4848.m10277of((Object) c23882M42215, (Object) c18539.m42214(c20530M42182)));
        C18537 c185311 = this.f30757;
        C10471 c10471M42160 = c185311.m42160(c185311.m42142(this.f30753.f40131.f20409), this.f30758.f21678, this.f30757.m42197(this.f30753.f40131.f20406.mo14787().f16705), C4848.m10283(), null, C4848.m10276of((Object) this.f30757.m42166(this.f30753.f40130, (AbstractC14355) null)), C4848.m10283(), c4968M42145, null);
        c10471M42160.f28960 = this.f30753.f40131;
        c10471M42160.f18925 = this.f30753.f40131.f20406;
        return c10471M42160;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25550(C17169 c17169, AbstractC6462 abstractC6462, C5771 c5771, InterfaceC5323 interfaceC5323, C4848 c4848, C12497 c12497) {
        String strM25538 = m25538(abstractC6462);
        String string = c5771.f20408.toString();
        AbstractC6462 abstractC6463 = c5771.f20406;
        C8374 c8374 = this.f30760;
        int i = 0;
        String strM25539 = m25539(c8374.m19459(abstractC6463), false);
        String strM255310 = m25538(c8374.m19459(c17169.f20407.f20406));
        String string2 = c17169.f20408.toString();
        String strM255311 = m25539(c8374.m19459(c17169.f20406), false);
        C22004 c22004 = this.f30747;
        C9262 c9262 = c22004.f69134;
        C17175 c17175M25544 = m25544("getImplMethodKind", c9262, C4848.m10283(), C4848.m10283());
        C24552 c24552M42186 = this.f30757.m42186(Integer.valueOf(c17169.m38869()));
        C18537 c18537 = this.f30757;
        EnumC19998 enumC19998 = EnumC19998.f60783;
        C11003 c11003M42162 = c18537.m42162(enumC19998, (AbstractC14355) c17175M25544, (AbstractC14355) c24552M42186);
        c11003M42162.f5602 = this.f30745.m27496(c11003M42162, enumC19998, c9262, c9262);
        c11003M42162.f18925 = c22004.f69151;
        C20271 c20271 = new C20271();
        Iterator it = c12497.f35030.iterator();
        while (it.hasNext()) {
            AbstractC6462 abstractC6464 = (AbstractC6462) it.next();
            C20271 c20272 = new C20271();
            String str = string2;
            c20272.m45777(this.f30757.m42186(Integer.valueOf(i)));
            C4848 c4848M45783 = c20272.m45783();
            C20271 c20273 = new C20271();
            c20273.m45777(c22004.f69134);
            c20271.m45777(this.f30757.m42178(c8374.m19459(abstractC6464), m25544("getCapturedArg", c22004.f69208, c20273.m45783(), c4848M45783)));
            i++;
            it = it;
            string2 = str;
            c8374 = c8374;
        }
        String str2 = string2;
        C3765 c3765M42141 = this.f30757.m42141(m25541(m25541(m25541(m25541(m25541(c11003M42162, "getFunctionalInterfaceClass", strM25538), "getFunctionalInterfaceMethodName", string), "getFunctionalInterfaceMethodSignature", strM25539), "getImplClass", strM255310), "getImplMethodSignature", strM255311), this.f30757.m42207(m25545(interfaceC5323, c22004.f69179, this.f30758.f21655, c4848, c12497, c20271.m45783(), c5771.f20408)), (AbstractC13154) null);
        C20271 c20274 = (C20271) this.f30753.f40128.get(str2);
        if (c20274 == null) {
            c20274 = new C20271();
            this.f30753.f40128.put(str2, c20274);
        }
        c20274.m45777(c3765M42141);
    }

    /* JADX INFO: renamed from: ֫ */
    private C11003 m25541(C11003 c11003, String str, String str2) {
        C22004 c22004 = this.f30747;
        C4848 c4848M10276of = C4848.m10276of((Object) c22004.f69208);
        C9262 c9262 = c22004.f69151;
        C12497 c12497 = new C12497(c4848M10276of, c9262, C4848.m10283(), c22004.f69163);
        C4036 c4036 = this.f30756;
        AbstractC6462 abstractC6462 = c22004.f69208;
        AbstractC12224 abstractC12224 = this.f30758.f21729;
        C4848 c4848M10276of2 = C4848.m10276of((Object) abstractC6462);
        C4848 c4848M10283 = C4848.m10283();
        C23663 c23663 = this.f30742;
        c23663.getClass();
        AbstractC7783 abstractC7783M52653 = c23663.m52653((InterfaceC5323) null, c4036, abstractC6462.f16705, abstractC6462, abstractC12224, c4848M10276of2, c4848M10283);
        C18537 c18537 = this.f30757;
        C4848 c4848M10284 = C4848.m10283();
        C8320 c8320M42154 = this.f30757.m42154(m25544(str, c22004.f69215, C4848.m10283(), C4848.m10283()), abstractC7783M52653);
        c8320M42154.f18925 = c12497;
        C17175 c17175M42172 = c18537.m42172(c8320M42154, c4848M10284, C4848.m10276of((Object) this.f30757.m42186(str2)));
        c17175M42172.f18925 = c9262;
        C18537 c18538 = this.f30757;
        EnumC19998 enumC19998 = EnumC19998.f60789;
        C11003 c11003M42162 = c18538.m42162(enumC19998, (AbstractC14355) c11003, (AbstractC14355) c17175M42172);
        c11003M42162.f5602 = this.f30745.m27496(c11003M42162, enumC19998, c9262, c9262);
        c11003M42162.f18925 = c9262;
        return c11003M42162;
    }

    /* JADX INFO: renamed from: ֫ */
    private C17175 m25544(String str, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        C4848 c4848M10283 = C4848.m10283();
        C22004 c22004 = this.f30747;
        C12497 c12497 = new C12497(c4848, abstractC6462, c4848M10283, c22004.f69163);
        C4036 c4036 = this.f30756;
        AbstractC6462 abstractC6463 = c22004.f69189;
        AbstractC14235 abstractC14235 = this.f30758.f21738;
        abstractC14235.getClass();
        char[] charArray = str.toCharArray();
        AbstractC12224 abstractC12224Mo17848 = abstractC14235.mo17848(charArray, charArray.length);
        C4848 c4848M10284 = C4848.m10283();
        C23663 c23663 = this.f30742;
        c23663.getClass();
        AbstractC7783 abstractC7783M52653 = c23663.m52653((InterfaceC5323) null, c4036, abstractC6463.f16705, abstractC6463, abstractC12224Mo17848, c4848, c4848M10284);
        C18537 c18537 = this.f30757;
        C4848 c4848M10285 = C4848.m10283();
        C18537 c18538 = this.f30757;
        C9661 c9661M42157 = c18538.m42157((AbstractC7783) this.f30753.f40130);
        c9661M42157.f18925 = abstractC6463;
        C8320 c8320M42154 = c18538.m42154(c9661M42157, abstractC7783M52653);
        c8320M42154.f18925 = c12497;
        C17175 c17175M42172 = c18537.m42172(c8320M42154, c4848M10285, c4849);
        c17175M42172.f18925 = abstractC6462;
        return c17175M42172;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25558(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        if (abstractC6462 != null) {
            int i = C6757.f17521[abstractC14355.mo3383().ordinal()];
            if (i == 1) {
                ((C17175) abstractC14355).f51141 = abstractC6462;
            } else if (i == 2) {
                ((C20530) abstractC14355).f63426 = abstractC6462;
            } else {
                if (i == 3) {
                    m25558(abstractC6462, ((C19327) abstractC14355).f57710);
                    return;
                }
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25548(C11097 c11097, AbstractC7783 abstractC7783, C4848 c4848, AbstractC6462 abstractC6462) {
        C1446.m31704(abstractC7783.f20405 == EnumC3600.f7343);
        C4848 c4848Mo14797 = c11097.f30760.m19459(abstractC7783.f20406).mo14797();
        if (abstractC6462 != null) {
            C1446.m31704((abstractC7783.mo18003() & 17179869184L) != 0);
        }
        c11097.f30752.m29742(c4848, c4848Mo14797, abstractC6462, c11097.f30756);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private C17175 m25546(AbstractC25178 abstractC25178, C17169 c17169, C4848 c4848) {
        C4848 c4849;
        int i;
        AbstractC24413 abstractC24413 = abstractC25178.f80538;
        C4848<AbstractC7783> c48410 = abstractC25178.f80536;
        AbstractC21195 abstractC21195 = abstractC24413.f77303.f16705;
        C8374 c8374 = this.f30760;
        C5771 c5771 = (C5771) c8374.m19433(abstractC21195);
        AbstractC6462 abstractC6462M19459 = c8374.m19459(c5771.f20406);
        C4848 c4848Mo14797 = abstractC6462M19459.mo14797();
        AbstractC6462 abstractC6462Mo14787 = abstractC6462M19459.mo14787();
        C4848 c4848Mo14794 = abstractC6462M19459.mo14794();
        C22004 c22004 = this.f30747;
        C12497 c12497 = new C12497(c4848Mo14797, abstractC6462Mo14787, c4848Mo14794, c22004.f69163);
        c17169.getClass();
        AbstractC6462 abstractC6462M194510 = c8374.m19459(abstractC24413.m53845(c8374));
        C4848 c4848M10278of = C4848.m10278of((Object) c12497, (Object) c17169, (Object) new C12497(abstractC6462M194510.mo14797(), abstractC6462M194510.mo14787(), abstractC6462M194510.mo14794(), c22004.f69163));
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c20271.m45777(((AbstractC14355) it.next()).f18925);
        }
        C12497 c12498 = new C12497(c20271.m45783(), abstractC24413.f18925, C4848.m10283(), c22004.f69163);
        boolean zM55243 = abstractC25178.m55243();
        C8200 c8200 = this.f30758;
        AbstractC12224 abstractC12224 = zM55243 ? c8200.f21655 : c8200.f21694;
        if (abstractC25178.m55243()) {
            C20271 c20272 = new C20271();
            AbstractC6462 abstractC6462 = abstractC24413.f77303;
            abstractC6462.getClass();
            Iterator it2 = (abstractC6462 instanceof C7921 ? c8374.m19505(abstractC24413.f77303) : C4848.m10283()).iterator();
            while (it2.hasNext()) {
                AbstractC6462 abstractC6462M194511 = c8374.m19459((AbstractC6462) it2.next());
                AbstractC21195 abstractC21196 = abstractC6462M194511.f16705;
                if (abstractC21196 != c22004.f69169.f16705 && abstractC21196 != abstractC24413.f18925.f16705 && abstractC21196 != c22004.f69208.f16705) {
                    c20272.m45777(abstractC6462M194511);
                }
            }
            boolean zM55242 = abstractC25178.m55242();
            boolean zM45784 = c20272.m45784();
            boolean zM10293 = c48410.m10293();
            int i2 = zM55242;
            if (zM45784) {
                i = (zM55242 ? 1 : 0) | 2;
            }
            if (zM10293) {
                i2 = i;
                i2 = (i2 == true ? 1 : 0) | 4;
            }
            i2 = i;
            C4848 c4848M10286 = c4848M10278of.m10286(C7375.m17096(i2));
            if (zM45784) {
                C4848 c4848M10287 = c4848M10286.m10286(C7375.m17096(c20272.m45780()));
                C4848 c4848M45783 = c20272.m45783();
                if (c4848M45783 == null) {
                    c4848M45783 = null;
                } else {
                    Iterator it3 = c4848M45783.iterator();
                    while (it3.hasNext()) {
                        InterfaceC10057.class.cast(it3.next());
                    }
                }
                c4848M10287.getClass();
                c4848M10286 = c4848M45783.m10292(c4848M10287);
            }
            if (zM10293) {
                c4848M10286 = c4848M10286.m10286(C7375.m17096(c48410.m10289() - 1));
                for (AbstractC7783 abstractC7783 : c48410) {
                    if (!c8374.m19490(abstractC7783.mo18010(c8374), c5771.mo18010(c8374))) {
                        c4848M10286 = c4848M10286.m10286((C12497) abstractC7783.mo18010(c8374));
                    }
                }
            }
            C4848 c48411 = c4848M10286;
            if (abstractC25178.m55242()) {
                C18537 c18537 = this.f30757;
                int i3 = c18537.f55352;
                try {
                    c18537.m42189((InterfaceC5323) this.f30753.f40127);
                    m25550(c17169, abstractC24413.f18925, c5771, abstractC24413, c48411, c12498);
                    this.f30757.f55352 = i3;
                } catch (Throwable th) {
                    this.f30757.f55352 = i3;
                    throw th;
                }
            }
            c4849 = c48411;
        } else {
            c4849 = c4848M10278of;
        }
        return m25545(abstractC24413, c22004.f69179, abstractC12224, c4849, c12498, c4848, c5771.f20408);
    }

    /* JADX INFO: renamed from: ֫ */
    private C17175 m25545(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C12497 c12497, C4848 c4849, AbstractC12224 abstractC12225) {
        C8374 c8374 = this.f30760;
        C22004 c22004 = this.f30747;
        C18537 c18537 = this.f30757;
        int i = c18537.f55352;
        try {
            c18537.m42189(interfaceC5323);
            C4848 c4848M10278of = C4848.m10278of((Object) c22004.f69160, (Object) c22004.f69215, (Object) c22004.f69137);
            C12826.requireNonNull(c8374);
            C11136 c11136 = new C11136(abstractC12225, c22004.f69157, this.f30742.m52640(interfaceC5323, this.f30756, abstractC6462, abstractC12224, c4848.m10287((Function) new C12358(1, c8374)).m10292(c4848M10278of), C4848.m10283()).mo12943(), c12497, (InterfaceC10057[]) c4848.toArray(new InterfaceC10057[c4848.m10289()]));
            C18537 c18538 = this.f30757;
            C8320 c8320M42155 = c18538.m42155(c18538.m42197(abstractC6462.f16705), abstractC12224);
            C11136 c11137 = (C11136) C15525.putIfAbsent(this.f30753.f40132, C6034.m13554(c11136, c8374), c11136);
            if (c11137 != null) {
                c11136 = c11137;
            }
            c8320M42155.f22260 = c11136;
            c8320M42155.f18925 = c12497.f35031;
            C17175 c17175M42172 = this.f30757.m42172(c8320M42155, C4848.m10283(), c4849);
            c17175M42172.f18925 = c12497.f35031;
            return c17175M42172;
        } finally {
            this.f30757.f55352 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public String m25539(AbstractC6462 abstractC6462, boolean z) {
        try {
            C12122 c12122 = new C12122(this, z);
            c12122.mo10687(abstractC6462);
            return c12122.f33870.toString();
        } catch (C17761 e) {
            C15828 c15828 = this.f30756.f8855.f20027;
            AbstractC6462 abstractC6462M40339 = e.m40339();
            C13370 c13370 = C13665.f38450;
            this.f30743.m9355(C8300.m19122(c15828, new C13370("compiler", "illegal.signature", c15828, abstractC6462M40339)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m25538(AbstractC6462 abstractC6462) {
        try {
            C12122 c12122 = new C12122(this, false);
            c12122.m10683(abstractC6462);
            return c12122.f33870.toString();
        } catch (C17761 e) {
            C15828 c15828 = this.f30756.f8855.f20027;
            AbstractC6462 abstractC6462M40339 = e.m40339();
            C13370 c13370 = C13665.f38450;
            this.f30743.m9355(C8300.m19122(c15828, new C13370("compiler", "illegal.signature", c15828, abstractC6462M40339)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25551(C11097 c11097, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        return ((abstractC7783.mo18003() & 4) == 0 || abstractC7783.m18008() == abstractC7784.m18008()) ? false : true;
    }

    public C11097(C5127 c5127) {
        boolean zM30877;
        c5127.m10908(f30740, this);
        this.f30759 = C8005.m18541(c5127);
        this.f30743 = C23623.m52439(c5127);
        this.f30744 = C24507.m54026(c5127);
        this.f30758 = C8200.m18988(c5127);
        this.f30747 = C22004.m49577(c5127);
        this.f30742 = C23663.m52629(c5127);
        this.f30745 = C12004.m27492(c5127);
        this.f30757 = C18537.m42139(c5127);
        this.f30760 = C8374.m19396(c5127);
        this.f30752 = C12975.m29735(c5127);
        this.f30750 = new C9085(this);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f30749 = c13565M30871.m30879("debug.dumpLambdaToMethodStats");
        this.f30754 = C11216.m25910(c5127);
        this.f30748 = c13565M30871.m30879("forceSerializable");
        EnumC2483 enumC2483 = EnumC2483.f3978;
        boolean z = c13565M30871.m30884(enumC2483) || c13565M30871.m30877(enumC2483, "lines");
        if (c13565M30871.m30884(enumC2483)) {
            zM30877 = c13565M30871.m30880(EnumC2483.f3954);
        } else {
            zM30877 = c13565M30871.m30877(enumC2483, "vars");
        }
        this.f30762 = z || zM30877;
        this.f30761 = c13565M30871.m30879("debug.dumpLambdaToMethodDeduplication");
        String strM30872 = c13565M30871.m30872("deduplicateLambdas");
        this.f30746 = strM30872 != null ? Boolean.parseBoolean(strM30872) : true;
        this.f30741 = EnumC12720.m29246(c5127).m29247();
    }
}
