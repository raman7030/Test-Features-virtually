package p067l;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7664 extends AbstractC2562 {

    /* JADX INFO: renamed from: ᩷ */
    public static final C6468 f20099 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public HashMap f20100 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۜ */
    public final C22004 f20101;

    /* JADX INFO: renamed from: ۧ */
    public final C11216 f20102;

    /* JADX INFO: renamed from: ܳ */
    public final C23623 f20103;

    /* JADX INFO: renamed from: ܽ */
    public final C14152 f20104;

    /* JADX INFO: renamed from: ܿ */
    public C4036 f20105;

    /* JADX INFO: renamed from: ᩳ */
    public final C8005 f20106;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC6462 f20107;

    /* JADX INFO: renamed from: ֫ */
    public static C7664 m17734(C5127 c5127) {
        C7664 c7664 = (C7664) c5127.m10905(f20099);
        return c7664 == null ? new C7664(c5127) : c7664;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17747(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        this.f20107 = abstractC6462;
        if (((C10545) this.f20105.f8849).f29199 == EnumC9477.SPECULATIVE) {
            abstractC14355.f18925 = abstractC6462;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC6462 m17733(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, C24626 c24626) {
        if (abstractC6462.m14777(EnumC11353.DEFERRED)) {
            return ((C3423) abstractC6462).m6079(c24626);
        }
        return c24626.mo15456(abstractC7257, abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m17746(AbstractC7257 abstractC7257, C4036 c4036) {
        C4036 c4037 = this.f20105;
        try {
            this.f20105 = c4036;
            abstractC7257.mo3382(this);
            return this.f20107;
        } finally {
            this.f20105 = c4037;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
        C11216 c11216 = this.f20102;
        abstractC7257.mo3382(c11216);
        this.f20107 = c11216.f31172;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17748(final AbstractC14355 abstractC14355, final Function function) {
        final C2969 c2969 = new C2969(this, abstractC14355);
        m17749(abstractC14355, new Supplier() { // from class: l.۟᩹֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return C7664.m17739(this.f26889, abstractC14355, c2969, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC18392 m17739(C7664 c7664, AbstractC14355 abstractC14355, C2969 c2969, Function function) {
        C14152 c14152 = c7664.f20104;
        C4036 c4036 = c7664.f20105;
        C11216 c11216 = c7664.f20102;
        C12826.requireNonNull(c11216);
        return (AbstractC18392) function.apply((AbstractC14355) c14152.m32632(abstractC14355, c4036, new C4311(c7664, c11216, c2969), c14152.f40354, null, EnumC9477.SPECULATIVE, null));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17749(AbstractC14355 abstractC14355, Supplier supplier) {
        C2969 c2969 = new C2969(this, abstractC14355);
        AbstractC18392 abstractC18392 = (AbstractC18392) this.f20100.get(c2969);
        if (abstractC18392 != null) {
            m17747(abstractC18392.mo10549(this.f20105, abstractC14355), abstractC14355);
            return;
        }
        AbstractC18392 abstractC18393 = (AbstractC18392) supplier.get();
        this.f20100.put(c2969, abstractC18393);
        m17747(abstractC18393, abstractC14355);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11688 m17738(C7664 c7664, C16505 c16505, C16505 c16506) {
        return new C11688(c7664, c16505, c7664.f20105, c16506, new HashMap());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(final C16505 c16505) {
        m17748(c16505, new Function() { // from class: l.ܰ᩹֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7664.m17738(this.f45656, c16505, (C16505) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19734 m17740(C7664 c7664, C10332 c10332, C10332 c10333) {
        return new C19734(c7664, c10332, c7664.f20105, c10333, new HashMap());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(final C10332 c10332) {
        m17748(c10332, new Function() { // from class: l.ۤ᩹֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7664.m17740(this.f34699, c10332, (C10332) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21076 m17741(C7664 c7664, C15164 c15164, C15164 c15165) {
        return new C21076(c7664, c15164, c7664.f20105, c15165, new HashMap());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(final C15164 c15164) {
        m17748(c15164, new Function() { // from class: l.ۛ᩹֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7664.m17741(this.f22516, c15164, (C15164) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        boolean z;
        C4036 c4036 = this.f20105;
        C4036 c4036M8087 = c4036.m8087(c11142, c4036.f8849);
        AbstractC14355 abstractC14355 = c11142.f30891;
        C11216 c11216 = this.f20102;
        C24626 c24626M25964 = c11216.m25964(c11142);
        C22417 c22417 = new C22417(this);
        C14152 c14152 = this.f20104;
        AbstractC14355 abstractC14356 = (AbstractC14355) c14152.m32632(abstractC14355, c4036M8087, c24626M25964, c14152.f40354, null, EnumC9477.SPECULATIVE, c22417);
        C11142 c11143 = (C11142) new C21339(c11216.f31198).mo10751((AbstractC7257) c11142, (Object) null);
        c11143.f30891 = abstractC14356;
        AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC14356);
        C10545 c10545 = (C10545) c4036M8087.f8849;
        if (abstractC7783M21438 != null) {
            AbstractC12224 abstractC12224 = abstractC7783M21438.f20408;
            if (abstractC12224 == abstractC12224.f34165.f40540.f21756) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c10545.f29212 = z;
        C23663 c23663 = c11216.f31180;
        AbstractC6462 abstractC6462 = abstractC14356.f18925;
        AbstractC12224 abstractC12225 = c11142.f30890;
        AbstractC6462 abstractC6462M19463 = c23663.f75323.m19463(abstractC6462);
        AbstractC10923 abstractC10923M52663 = c23663.m52663(abstractC6462M19463, EnumC18298.f54637, c11143, C4848.m10283(), (C4848) null, abstractC12225);
        C4036 c4036M8088 = c4036M8087.m8087(c4036M8087.f8850, c10545.m24327(c10545.f29201));
        AbstractC7257 abstractC7257 = c4036M8087.f8850;
        abstractC7257.getClass();
        AbstractC21195 abstractC21195 = abstractC6462M19463.f16705;
        C5817 c5817 = c23663.f75319;
        C14119 c14119 = new C14119(c23663);
        c14119.f40078 = c5817;
        AbstractC7783 abstractC7783M52643 = c23663.m52643(c4036M8088, abstractC7257, abstractC21195, c14119, abstractC10923M52663);
        c10545.f29204 = ((C10545) c4036M8088.f8849).f29204;
        if (!abstractC7783M52643.f20405.m6625()) {
            c11142.f30889 = abstractC7783M52643;
        }
        if (abstractC7783M52643.f20405.m6626()) {
            c11142.mo25670(EnumC8459.ERROR);
        } else {
            AbstractC6462 abstractC6463 = abstractC7783M52643.f20406;
            if ((abstractC6463 != null && abstractC6463.m14777(EnumC11353.FORALL)) || (abstractC7783M52643.mo18003() & 17179869184L) != 0 || (C9268.m21412(abstractC14356, c11142.f30890.f34165.f40540) && abstractC14356.f18925.mo14784() && !abstractC14356.f18925.m14777(EnumC11353.ARRAY))) {
                c11142.mo25670(EnumC8459.OVERLOADED);
            } else {
                c11142.mo25670(EnumC8459.UNOVERLOADED);
            }
        }
        m17747(new C3423(c14152, c11142, this.f20105), c11142);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(final C15834 c15834) {
        if (c15834.f45861 == EnumC18517.EXPLICIT) {
            m17749(c15834, new Supplier() { // from class: l.᩺᩹֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C7664.m17735(this.f77494, c15834);
                }
            });
            return;
        }
        C14152 c14152 = this.f20104;
        C12826.requireNonNull(c14152);
        m17747(new C3423(c14152, c15834, this.f20105), c15834);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9005 m17735(C7664 c7664, C15834 c15834) {
        return new C9005(c7664, c15834, c7664.f20105, c7664.f20104.m32633(c15834, c7664.f20105, c7664.f20102.f31182), new HashMap());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4982 m17732(C7664 c7664, C17175 c17175, C17175 c17176) {
        return new C4982(c7664, c17175, c7664.f20105, c17176, new HashMap());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(final C20530 c20530) {
        if (C9268.m21415(c20530)) {
            m17748(c20530, new Function() { // from class: l.ۨ᩹֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C7664.m17736(this.f38887, c20530, (C20530) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }
            });
            return;
        }
        C4036 c4036 = this.f20105;
        C11216 c11216 = this.f20102;
        m17747(c11216.m25939(c20530, c4036, c11216.f31177), c20530);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11017 m17736(C7664 c7664, C20530 c20530, C20530 c20531) {
        return new C11017(c7664, c20530, c7664.f20105, c20531, new HashMap());
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(final C17175 c17175) {
        if (c17175.f51142.isEmpty()) {
            m17748(c17175, new Function() { // from class: l.۫᩹֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C7664.m17732(this.f41234, c17175, (C17175) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }
            });
            return;
        }
        C4036 c4036 = this.f20105;
        C11216 c11216 = this.f20102;
        m17747(c11216.m25939(c17175, c4036, c11216.f31177), c17175);
    }

    public C7664(C5127 c5127) {
        c5127.m10908(f20099, this);
        this.f20104 = C14152.m32631(c5127);
        this.f20106 = C8005.m18541(c5127);
        this.f20102 = C11216.m25910(c5127);
        this.f20101 = C22004.m49577(c5127);
        this.f20103 = C23623.m52439(c5127);
    }
}
