package l;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5572 extends AbstractC0204 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4314 f17259 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f17260 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20661 f17261;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9310 f17262;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22364 f17263;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12399 f17264;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1755 f17265;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5931 f17266;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f17267;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5572 m15819(C2903 c2903) {
        C5572 c5572 = (C5572) c2903.m8838(f17259);
        return c5572 == null ? new C5572(c2903) : c5572;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15832(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        this.f17267 = abstractC4308;
        if (((C8604) this.f17265.f6073).f26283 == EnumC7480.SPECULATIVE) {
            abstractC12612.f16086 = abstractC4308;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4308 m15818(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, C23420 c23420) {
        if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
            return ((C1110) abstractC4308).m3822(c23420);
        }
        return c23420.mo13581(abstractC5144, abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m15831(AbstractC5144 abstractC5144, C1755 c1755) {
        C1755 c1756 = this.f17265;
        try {
            this.f17265 = c1755;
            abstractC5144.mo988(this);
            return this.f17267;
        } finally {
            this.f17265 = c1756;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        C9310 c9310 = this.f17262;
        abstractC5144.mo988(c9310);
        this.f17267 = c9310.f28223;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15833(final AbstractC12612 abstractC12612, final Function function) {
        final C0632 c0632 = new C0632(this, abstractC12612);
        m15834(abstractC12612, new Supplier() { // from class: l.۟᩹֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return C5572.m15824(this.f23975, abstractC12612, c0632, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16860 m15824(C5572 c5572, AbstractC12612 abstractC12612, C0632 c0632, Function function) {
        C12399 c12399 = c5572.f17264;
        C1755 c1755 = c5572.f17265;
        C9310 c9310 = c5572.f17262;
        C11003.requireNonNull(c9310);
        return (AbstractC16860) function.apply((AbstractC12612) c12399.m30568(abstractC12612, c1755, new C2044(c5572, c9310, c0632), c12399.f37339, null, EnumC7480.SPECULATIVE, null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15834(AbstractC12612 abstractC12612, Supplier supplier) {
        C0632 c0632 = new C0632(this, abstractC12612);
        AbstractC16860 abstractC16860 = (AbstractC16860) this.f17260.get(c0632);
        if (abstractC16860 != null) {
            m15832(abstractC16860.mo8502(this.f17265, abstractC12612), abstractC12612);
            return;
        }
        AbstractC16860 abstractC16861 = (AbstractC16860) supplier.get();
        this.f17260.put(c0632, abstractC16861);
        m15832(abstractC16861, abstractC12612);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9806 m15823(C5572 c5572, C14875 c14875, C14875 c14876) {
        return new C9806(c5572, c14875, c5572.f17265, c14876, new HashMap());
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1405(final C14875 c14875) {
        m15833(c14875, new Function() { // from class: l.ܰ᩹֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5572.m15823(this.f42570, c14875, (C14875) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18272 m15825(C5572 c5572, C8379 c8379, C8379 c83710) {
        return new C18272(c5572, c8379, c5572.f17265, c83710, new HashMap());
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(final C8379 c8379) {
        m15833(c8379, new Function() { // from class: l.ۤ᩹֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5572.m15825(this.f31733, c8379, (C8379) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19684 m15826(C5572 c5572, C13464 c13464, C13464 c13465) {
        return new C19684(c5572, c13464, c5572.f17265, c13465, new HashMap());
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(final C13464 c13464) {
        m15833(c13464, new Function() { // from class: l.ۛ᩹֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5572.m15826(this.f19644, c13464, (C13464) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        boolean z;
        C1755 c1755 = this.f17265;
        C1755 c1755M5877 = c1755.m5877(c9232, c1755.f6073);
        AbstractC12612 abstractC12612 = c9232.f27945;
        C9310 c9310 = this.f17262;
        C23420 c23420M23955 = c9310.m23955(c9232);
        C21095 c21095 = new C21095(this);
        C12399 c12399 = this.f17264;
        AbstractC12612 abstractC12613 = (AbstractC12612) c12399.m30568(abstractC12612, c1755M5877, c23420M23955, c12399.f37339, null, EnumC7480.SPECULATIVE, c21095);
        C9232 c9233 = (C9232) new C19961(c9310.f28249).mo8690((AbstractC5144) c9232, (Object) null);
        c9233.f27945 = abstractC12613;
        AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC12613);
        C8604 c8604 = (C8604) c1755M5877.f6073;
        if (abstractC5698M19472 != null) {
            AbstractC10370 abstractC10370 = abstractC5698M19472.f17562;
            if (abstractC10370 == abstractC10370.f31203.f37517.f18898) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c8604.f26296 = z;
        C22406 c22406 = c9310.f28231;
        AbstractC4308 abstractC4308 = abstractC12613.f16086;
        AbstractC10370 abstractC10371 = c9232.f27944;
        AbstractC4308 abstractC4308M17523 = c22406.f72597.m17523(abstractC4308);
        AbstractC9001 abstractC9001M50323 = c22406.m50323(abstractC4308M17523, EnumC16761.f51455, c9233, C2609.m8239(), (C2609) null, abstractC10371);
        C1755 c1755M5878 = c1755M5877.m5877(c1755M5877.f6074, c8604.m22358(c8604.f26285));
        AbstractC5144 abstractC5144 = c1755M5877.f6074;
        abstractC5144.getClass();
        AbstractC19810 abstractC19810 = abstractC4308M17523.f13890;
        C3629 c3629 = c22406.f72593;
        C12364 c12364 = new C12364(c22406);
        c12364.f37062 = c3629;
        AbstractC5698 abstractC5698M50303 = c22406.m50303(c1755M5878, abstractC5144, abstractC19810, c12364, abstractC9001M50323);
        c8604.f26288 = ((C8604) c1755M5878.f6073).f26288;
        if (!abstractC5698M50303.f17559.m4393()) {
            c9232.f27943 = abstractC5698M50303;
        }
        if (abstractC5698M50303.f17559.m4394()) {
            c9232.mo23671(EnumC6409.ERROR);
        } else {
            AbstractC4308 abstractC4309 = abstractC5698M50303.f17560;
            if ((abstractC4309 != null && abstractC4309.m12913(EnumC9454.FORALL)) || (abstractC5698M50303.mo16084() & 17179869184L) != 0 || (C7260.m19446(abstractC12613, c9232.f27944.f31203.f37517) && abstractC12613.f16086.mo12920() && !abstractC12613.f16086.m12913(EnumC9454.ARRAY))) {
                c9232.mo23671(EnumC6409.OVERLOADED);
            } else {
                c9232.mo23671(EnumC6409.UNOVERLOADED);
            }
        }
        m15832(new C1110(c12399, c9232, this.f17265), c9232);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(final C14169 c14169) {
        if (c14169.f42773 == EnumC16992.EXPLICIT) {
            m15834(c14169, new Supplier() { // from class: l.᩺᩹֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C5572.m15820(this.f74750, c14169);
                }
            });
            return;
        }
        C12399 c12399 = this.f17264;
        C11003.requireNonNull(c12399);
        m15832(new C1110(c12399, c14169, this.f17265), c14169);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6983 m15820(C5572 c5572, C14169 c14169) {
        return new C6983(c5572, c14169, c5572.f17265, c5572.f17264.m30569(c14169, c5572.f17265, c5572.f17262.f28233), new HashMap());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2750 m15817(C5572 c5572, C15580 c15580, C15580 c15581) {
        return new C2750(c5572, c15580, c5572.f17265, c15581, new HashMap());
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(final C19110 c19110) {
        if (C7260.m19449(c19110)) {
            m15833(c19110, new Function() { // from class: l.ۨ᩹֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C5572.m15821(this.f35877, c19110, (C19110) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            });
            return;
        }
        C1755 c1755 = this.f17265;
        C9310 c9310 = this.f17262;
        m15832(c9310.m23930(c19110, c1755, c9310.f28228), c19110);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9100 m15821(C5572 c5572, C19110 c19110, C19110 c19111) {
        return new C9100(c5572, c19110, c5572.f17265, c19111, new HashMap());
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(final C15580 c15580) {
        if (c15580.f48010.isEmpty()) {
            m15833(c15580, new Function() { // from class: l.۫᩹֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C5572.m15817(this.f38206, c15580, (C15580) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            });
            return;
        }
        C1755 c1755 = this.f17265;
        C9310 c9310 = this.f17262;
        m15832(c9310.m23930(c15580, c1755, c9310.f28228), c15580);
    }

    public C5572(C2903 c2903) {
        c2903.m8841(f17259, this);
        this.f17264 = C12399.m30567(c2903);
        this.f17266 = C5931.m16615(c2903);
        this.f17262 = C9310.m23901(c2903);
        this.f17261 = C20661.m47250(c2903);
        this.f17263 = C22364.m50099(c2903);
    }
}
