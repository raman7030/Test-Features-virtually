package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S424 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13809 extends AbstractC0204 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C4314 f41143 = new C4314();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6319 f41144;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13395 f41146;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20661 f41147;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4767 f41148;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18837 f41149;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6136 f41150;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f41151;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5557 f41152;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15240 f41153;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22364 f41154;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1755 f41156;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4824 f41157;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f41158;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C11139 f41159;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C16782 f41160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC19173 f41161;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3267 f41162;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18837 f41145 = new C18837();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14190 f41155 = new C11694();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13809 m33121(C2903 c2903) {
        C13809 c13809 = (C13809) c2903.m8838(f41143);
        return c13809 == null ? new C13809(c2903) : c13809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m33123(AbstractC19810 abstractC19810) {
        return this.f41160.m39519(abstractC19810);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Collection m33129() {
        return this.f41160.m39522();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1755 m33120(C1755 c1755, C5557 c5557) {
        C1755 c1755M5877 = c1755.m5877(c5557, ((C8604) c1755.f6073).m22358(AbstractC14016.m33607(c5557.f17186)));
        c1755M5877.f6079 = c5557;
        c1755M5877.f6076 = c1755;
        C8604 c8604 = (C8604) c1755M5877.f6073;
        c8604.f26299 = false;
        c8604.f26289 = null;
        c8604.f26295 = C7260.m19449(c1755.f6074);
        return c1755M5877;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1755 m33127(C1323 c1323) {
        C8604 c8604 = new C8604();
        C1755 c1755 = new C1755(c1323, c8604);
        c1755.f6075 = c1323;
        c1755.f6079 = this.f41152;
        c1323.f4737 = AbstractC14016.m33607(c1323.f4746);
        c1323.f4742 = new C22484(c1323.f4746);
        c1323.f4740 = new C23189(c1323.f4746);
        c8604.f26285 = c1323.f4737;
        c8604.f26289 = this.f41157;
        return c1755;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14016 m33122(C1755 c1755) {
        if (c1755.f6074.m14709(EnumC18550.f57582)) {
            return ((C5557) c1755.f6074).f17186.f42762;
        }
        return ((C8604) c1755.f6073).f26285;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m33125(AbstractC5144 abstractC5144, C1755 c1755) {
        AbstractC4308 abstractC4308M36110;
        C13395 c13395 = this.f41146;
        C1755 c1756 = this.f41156;
        try {
            try {
                this.f41156 = c1755;
                c13395.m32410();
                abstractC5144.mo988(this);
                abstractC4308M36110 = this.f41151;
            } catch (C20515 e) {
                C15240 c15240 = this.f41153;
                abstractC5144.getClass();
                abstractC4308M36110 = c15240.m36110(abstractC5144, e);
            }
            return abstractC4308M36110;
        } finally {
            c13395.m32414();
            this.f41156 = c1756;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33124(C2609 c2609, C1755 c1755) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            AbstractC4308 abstractC4308M33125 = m33125((AbstractC5144) c2609.f8240, c1755);
            if (abstractC4308M33125 != null) {
                c18837.m43511(abstractC4308M33125);
            }
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1367(final C1323 c1323) {
        boolean z;
        C16646 c16646FindAny;
        C1755 c1755M33127;
        C1755 c1755M5877;
        C1755 c1755M39519;
        AbstractC5698 abstractC5698;
        AbstractC12612 abstractC12612;
        InterfaceC18278 interfaceC18278 = c1323.f4745;
        C22364 c22364 = this.f41154;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(interfaceC18278);
        InterfaceC18278 interfaceC18279 = c1323.f4745;
        EnumC16866 enumC16866 = EnumC16866.SOURCE;
        boolean zMo21322 = interfaceC18279.mo21322("package-info", enumC16866);
        boolean zMo21323 = c1323.f4745.mo21322("module-info", enumC16866);
        C20661 c20661 = this.f41147;
        if (zMo21323 && c1323.m4616() != null) {
            C7820 c7820M4619 = c1323.m4619();
            if (c7820M4619 != null) {
                c22364.m7273(c7820M4619, C6241.f19141);
            }
            c1323.f4746 = c20661.f66473;
            m33124(c1323.f4738, m33127(c1323));
            C0052 c0052 = c1323.f4739;
            C3267 c3267 = this.f41162;
            c3267.getClass();
            c0052.f923 = new C23786(8, c3267);
        } else {
            C7820 c7820M46110 = c1323.m4619();
            int i = 1;
            if (c7820M46110 != null) {
                C7814 c7814M47266 = c20661.m47266(c1323.f4739, C7260.m19452(c7820M46110.f24199));
                c7820M46110.f24200 = c7814M47266;
                c1323.f4746 = c7814M47266;
                C14190 c14190 = this.f41155;
                c14190.getClass();
                c14190.mo1386(c7820M46110);
                if (c7820M46110.f24198.m8249() || this.f41161 == EnumC19173.ALWAYS || c1323.f4744 != null) {
                    if (zMo21322) {
                        z = true;
                    } else if (c7820M46110.f24198.m8249()) {
                        C17551 c17551 = (C17551) c7820M46110.f24198.f8240;
                        c17551.getClass();
                        c22364.m7273(c17551, C6241.f19222);
                    }
                }
                final Map map = c1323.f4739.f913;
                c16646FindAny = C5378.stream(c20661.m47271(c1323.f4746.f24143)).filter(new C6528(i, c1323)).filter(new Predicate() { // from class: l.ۛ۫֨
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
                        C13809 c13809 = this.f18547;
                        c13809.getClass();
                        C1323 c1324 = c1323;
                        return map.get(c1324.f4746.f24143) == c13809.f41147.m47274((C0052) obj, c1324.f4746.f24143);
                    }
                }).findAny();
                if (c16646FindAny.isPresent()) {
                    AbstractC5698 abstractC5699 = (AbstractC5698) c16646FindAny.get();
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c7820M46110, new C12281("compiler", "package.in.other.module", abstractC5699));
                }
                c1323.f4746.mo16101();
                c1755M33127 = m33127(c1323);
                if (zMo21322) {
                    c1755M5877 = c1755M33127.m5877(c7820M46110, c1755M33127.f6073);
                } else {
                    c1755M5877 = null;
                }
                if (zMo21322) {
                    C7814 c7814 = c1323.f4746;
                    C16782 c16782 = this.f41160;
                    c1755M39519 = c16782.m39519(c7814);
                    if (c1755M39519 != null) {
                        if (!this.f41158.mo1712(c1323.f4745, c1755M39519.f6075.f4745)) {
                            if (c7820M46110 != null) {
                                abstractC12612 = c7820M46110.f24199;
                                abstractC12612.getClass();
                            } else {
                                abstractC12612 = null;
                            }
                            C7814 c7815 = c1323.f4746;
                            C11076 c11076 = C14001.f42334;
                            c22364.m7285(abstractC12612, new C11076("compiler", "pkg-info.already.seen", c7815));
                        }
                    }
                    c16782.m39521(c1323.f4746, c1755M5877);
                    for (abstractC5698 = c1323.f4746; abstractC5698 != null && abstractC5698.f17559 == EnumC1296.f4579; abstractC5698 = abstractC5698.f17561) {
                        abstractC5698.f17563 |= X931RNG.BLOCK128_RESEED_MAX;
                    }
                    C6136 c6136 = this.f41150;
                    AbstractC10370 abstractC10370 = c6136.f18876;
                    C14163 c14163M47261 = c20661.m47261(c1323.f4739, abstractC10370, c1323.f4746);
                    c14163M47261.f42771 = c6136.f18880.m30652(c1323.f4746 + "." + ((Object) abstractC10370));
                    c14163M47261.f42770 = c1323.f4745;
                    c14163M47261.f17564 = InterfaceC6403.f19811;
                    c14163M47261.f42762 = AbstractC14016.m33607(c14163M47261);
                    C7814 c7816 = c1323.f4746;
                    c7816.f24146 = c14163M47261;
                    c7816.f24144 = c1323.f4745;
                }
                m33124(c1323.f4738, c1755M33127);
                if (z) {
                    this.f41148.add(c1755M5877);
                }
            } else {
                c1323.f4746 = c1323.f4739.f918;
            }
            z = false;
            final Map map2 = c1323.f4739.f913;
            c16646FindAny = C5378.stream(c20661.m47271(c1323.f4746.f24143)).filter(new C6528(i, c1323)).filter(new Predicate() { // from class: l.ۛ۫֨
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
                    C13809 c13809 = this.f18547;
                    c13809.getClass();
                    C1323 c1324 = c1323;
                    return map2.get(c1324.f4746.f24143) == c13809.f41147.m47274((C0052) obj, c1324.f4746.f24143);
                }
            }).findAny();
            if (c16646FindAny.isPresent()) {
                AbstractC5698 abstractC56910 = (AbstractC5698) c16646FindAny.get();
                C12281 c12282 = C6241.f19132;
                c22364.m7273(c7820M46110, new C12281("compiler", "package.in.other.module", abstractC56910));
            }
            c1323.f4746.mo16101();
            c1755M33127 = m33127(c1323);
            if (zMo21322) {
                c1755M5877 = c1755M33127.m5877(c7820M46110, c1755M33127.f6073);
            } else {
                c1755M5877 = null;
            }
            if (zMo21322) {
                C7814 c7817 = c1323.f4746;
                C16782 c16783 = this.f41160;
                c1755M39519 = c16783.m39519(c7817);
                if (c1755M39519 != null) {
                    if (!this.f41158.mo1712(c1323.f4745, c1755M39519.f6075.f4745)) {
                        if (c7820M46110 != null) {
                            abstractC12612 = c7820M46110.f24199;
                            abstractC12612.getClass();
                        } else {
                            abstractC12612 = null;
                        }
                        C7814 c7818 = c1323.f4746;
                        C11076 c11077 = C14001.f42334;
                        c22364.m7285(abstractC12612, new C11076("compiler", "pkg-info.already.seen", c7818));
                    }
                }
                c16783.m39521(c1323.f4746, c1755M5877);
                while (abstractC5698 != null) {
                    abstractC5698.f17563 |= X931RNG.BLOCK128_RESEED_MAX;
                }
                C6136 c6137 = this.f41150;
                AbstractC10370 abstractC10371 = c6137.f18876;
                C14163 c14163M47262 = c20661.m47261(c1323.f4739, abstractC10371, c1323.f4746);
                c14163M47262.f42771 = c6137.f18880.m30652(c1323.f4746 + "." + ((Object) abstractC10371));
                c14163M47262.f42770 = c1323.f4745;
                c14163M47262.f17564 = InterfaceC6403.f19811;
                c14163M47262.f42762 = AbstractC14016.m33607(c14163M47262);
                C7814 c7819 = c1323.f4746;
                c7819.f24146 = c14163M47262;
                c7819.f24144 = c1323.f4745;
            }
            m33124(c1323.f4738, c1755M33127);
            if (z) {
                this.f41148.add(c1755M5877);
            }
        }
        c22364.m7284(interfaceC18278M7284);
        this.f41151 = null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C15240 c15240;
        C14163 c14163M47262;
        final C14163 c14163M47261;
        C19955 c19955;
        C18837 c18837;
        C1755 c1755 = this.f41156;
        AbstractC5698 abstractC5698 = ((C8604) c1755.f6073).f26285.f23673;
        AbstractC14016 abstractC14016M33122 = m33122(c1755);
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4579;
        C6319 c6319 = this.f41144;
        C22364 c22364 = this.f41154;
        C20661 c20661 = this.f41147;
        C15240 c15241 = this.f41153;
        if (enumC1296 == enumC1297) {
            C7814 c7814 = (C7814) abstractC5698;
            AbstractC5698 abstractC5699 = c7814;
            while (abstractC5699 != null && abstractC5699.f17559 == EnumC1296.f4579) {
                abstractC5699.f17563 |= X931RNG.BLOCK128_RESEED_MAX;
                abstractC5699 = abstractC5699.f17561;
                c15241 = c15241;
            }
            c15240 = c15241;
            c14163M47262 = c20661.m47261(this.f41156.f6075.f4739, c5557.f17180, c7814);
            c7814.mo16101();
            c7814.f24145.mo26379(c14163M47262);
            if ((c5557.f17181.f7169 & 1) != 0 && !this.f41156.f6075.f4745.mo21322(c14163M47262.f17562.toString(), EnumC16866.SOURCE)) {
                EnumC8352 enumC8352 = EnumC8352.CLASS;
                long j = c5557.f17181.f7169;
                if ((j & 16384) != 0) {
                    enumC8352 = EnumC8352.ENUM;
                } else if ((j & 512) != 0) {
                    enumC8352 = EnumC8352.INTERFACE;
                }
                AbstractC10370 abstractC10370 = c5557.f17180;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c5557, new C12281("compiler", "class.public.should.be.in.file", enumC8352, abstractC10370));
            }
        } else {
            c15240 = c15241;
            if (!c5557.f17180.isEmpty() && !c15240.m36165(c5557, c5557.f17180, abstractC14016M33122)) {
                this.f41151 = null;
                return;
            }
            EnumC1296 enumC1298 = abstractC5698.f17559;
            EnumC1296 enumC1299 = EnumC1296.f4582;
            if (enumC1298 == enumC1299) {
                AbstractC19810 abstractC19810 = (AbstractC19810) abstractC5698;
                c14163M47261 = c20661.m47261(this.f41156.f6075.f4739, c5557.f17180, abstractC19810);
                if (c14163M47261.f17561 != abstractC5698) {
                    AbstractC10370 abstractC10371 = c14163M47261.f17562;
                    AbstractC10370 abstractC10372 = c5557.f17180;
                    if (abstractC10371 != abstractC10372) {
                        C12281 c12282 = C6241.f19132;
                        c22364.m7273(c5557, new C12281("compiler", "same.binary.name", abstractC10371, abstractC10372));
                        AbstractC10370 abstractC10373 = c5557.f17180;
                        C11488 c11488 = AbstractC4308.f13885;
                        c6319.getClass();
                        C12193 c12193M17457 = C6319.m17457(abstractC10373, abstractC19810, c11488);
                        this.f41151 = c12193M17457;
                        c5557.f17186 = (C14163) c12193M17457.f13890;
                        return;
                    }
                    C12171.m29643(abstractC5698.f17561.f17559 != enumC1299, new C2973(1, abstractC5698));
                    C12171.m29643(c14163M47261.f17561.f17559 == enumC1299, new Supplier() { // from class: l.ۤ۫֨
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return c14163M47261.f17561.toString();
                        }
                    });
                    AbstractC14016 abstractC14016 = ((C14163) c14163M47261.f17561).f42762;
                    if (abstractC14016 != null) {
                        abstractC14016.mo26384(c14163M47261);
                    }
                    c14163M47261.f17561 = abstractC5698;
                }
                if ((512 & abstractC5698.f17563) != 0) {
                    c5557.f17181.f7169 |= 9;
                }
            } else {
                c14163M47262 = c20661.m47262(c5557.f17180, abstractC5698);
                c14163M47262.f42771 = c15240.m36188(c14163M47262);
                if (!c14163M47262.f17562.isEmpty()) {
                    c15240.m36143(c5557, c14163M47262, ((C8604) this.f41156.f6073).f26285);
                }
            }
            c5557.f17186 = c14163M47261;
            if (c15240.m36174(c14163M47261) != null) {
                c15240.m36199(c14163M47261);
                abstractC14016M33122.mo26382(c14163M47261);
                C1755 c1755M33120 = m33120(this.f41156, c5557);
                this.f41160.m39521(c14163M47261, c1755M33120);
                c14163M47261.f17564 = InterfaceC6403.f19811;
                c14163M47261.f17563 = this.f41153.m36100(c5557, c5557.f17181.f7169, c14163M47261, c5557);
                c14163M47261.f42770 = this.f41156.f6075.f4745;
                c14163M47261.f42762 = AbstractC14016.m33607(c14163M47261);
                c14163M47261.m33807();
                c19955 = (C19955) c14163M47261.f17560;
                if (abstractC5698.f17559 != EnumC1296.f4579 && (c14163M47261.f17563 & 8) == 0) {
                    while (abstractC5698.f17559.m4391(C15406.f47185) && (abstractC5698.f17563 & 8) == 0) {
                        abstractC5698 = abstractC5698.f17561;
                    }
                    if (abstractC5698.f17559 == EnumC1296.f4582) {
                        c19955.mo4959(abstractC5698.f17560);
                    }
                }
                c19955.f64616 = m33124(c5557.f17185, c1755M33120);
                c19955.f64617 = null;
                c14163M47261.f17564 = this.f41159;
                if (!c14163M47261.m16077() && (c18837 = this.f41149) != null) {
                    c18837.m43511(c14163M47261);
                }
                m33124(c5557.f17179, c1755M33120);
                this.f41151 = c14163M47261.f17560;
                return;
            }
            AbstractC10370 abstractC10374 = c14163M47261.f42767;
            C12281 c12283 = C6241.f19132;
            c22364.m7273(c5557, new C12281("compiler", "duplicate.class", abstractC10374));
            C11488 c11489 = AbstractC4308.f13885;
            c6319.getClass();
            C12193 c12193M17458 = C6319.m17457(c5557.f17180, (AbstractC19810) abstractC5698, c11489);
            this.f41151 = c12193M17458;
            c5557.f17186 = (C14163) c12193M17458.f13890;
        }
        c14163M47261 = c14163M47262;
        c5557.f17186 = c14163M47261;
        if (c15240.m36174(c14163M47261) != null) {
            c15240.m36199(c14163M47261);
            abstractC14016M33122.mo26382(c14163M47261);
            C1755 c1755M33121 = m33120(this.f41156, c5557);
            this.f41160.m39521(c14163M47261, c1755M33121);
            c14163M47261.f17564 = InterfaceC6403.f19811;
            c14163M47261.f17563 = this.f41153.m36100(c5557, c5557.f17181.f7169, c14163M47261, c5557);
            c14163M47261.f42770 = this.f41156.f6075.f4745;
            c14163M47261.f42762 = AbstractC14016.m33607(c14163M47261);
            c14163M47261.m33807();
            c19955 = (C19955) c14163M47261.f17560;
            if (abstractC5698.f17559 != EnumC1296.f4579) {
                while (abstractC5698.f17559.m4391(C15406.f47185)) {
                    abstractC5698 = abstractC5698.f17561;
                }
                if (abstractC5698.f17559 == EnumC1296.f4582) {
                    c19955.mo4959(abstractC5698.f17560);
                }
            }
            c19955.f64616 = m33124(c5557.f17185, c1755M33121);
            c19955.f64617 = null;
            c14163M47261.f17564 = this.f41159;
            if (!c14163M47261.m16077()) {
                c18837.m43511(c14163M47261);
            }
            m33124(c5557.f17179, c1755M33121);
            this.f41151 = c14163M47261.f17560;
            return;
        }
        AbstractC10370 abstractC10375 = c14163M47261.f42767;
        C12281 c12284 = C6241.f19132;
        c22364.m7273(c5557, new C12281("compiler", "duplicate.class", abstractC10375));
        C11488 c114810 = AbstractC4308.f13885;
        c6319.getClass();
        C12193 c12193M17459 = C6319.m17457(c5557.f17180, (AbstractC19810) abstractC5698, c114810);
        this.f41151 = c12193M17459;
        c5557.f17186 = (C14163) c12193M17459.f13890;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C8541 c8541;
        AbstractC4308 abstractC4308 = c14315.f16086;
        if (abstractC4308 != null) {
            c8541 = (C8541) abstractC4308;
        } else {
            c8541 = new C8541(((C8604) this.f41156.f6073).f26285.f23673, this.f41147.f66522, c14315.f43169);
        }
        c14315.f16086 = c8541;
        if (this.f41153.m36162(c14315, c8541.f13890, ((C8604) this.f41156.f6073).f26285)) {
            ((C8604) this.f41156.f6073).f26285.mo26382(c8541.f13890);
        }
        this.f41151 = c8541;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C1755 c1755 = this.f41156;
        C12171.m29637(c3587.f11377);
        C1755 c1755M5877 = c1755.m5877(c3587, ((C8604) c1755.f6073).m22358(AbstractC14016.m33607(c3587.f11377)));
        c1755M5877.f6079 = this.f41152;
        c1755M5877.f6076 = c1755;
        C8604 c8604 = (C8604) c1755M5877.f6073;
        c8604.f26299 = false;
        c8604.f26289 = null;
        this.f41160.m39521(c3587.f11377, c1755M5877);
        if (this.f41162.m10059(c3587.f11377)) {
            this.f41148.add(c1755M5877);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        this.f41151 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33126(C14163 c14163, C2609 c2609) {
        C13395 c13395 = this.f41146;
        c13395.m32410();
        C18837 c18837 = this.f41149;
        C11139 c11139 = this.f41159;
        if (c11139.f33434) {
            this.f41149 = new C18837();
        }
        try {
            m33124(c2609, (C1755) null);
            if (c11139.f33434) {
                while (this.f41149.m43518()) {
                    C14163 c14164 = (C14163) this.f41149.m43516();
                    if (c14163 == null || c14163 == c14164 || c18837 == null) {
                        c14164.mo16101();
                    } else {
                        c18837.m43511(c14164);
                    }
                }
                boolean zM10065 = this.f41162.m10065();
                C18837 c18838 = this.f41145;
                if (!zM10065) {
                    Iterator it = c2609.iterator();
                    while (it.hasNext()) {
                        C1323 c1323 = (C1323) it.next();
                        if (c1323.m4616() != null) {
                            c18838.m43511(c1323);
                        } else {
                            c11139.m27651(C2609.of((Object) c1323));
                        }
                    }
                } else {
                    c11139.m27651(c18838.m43517());
                    c18838.clear();
                    c11139.m27651(c2609);
                }
            }
            this.f41149 = c18837;
            c13395.m32414();
        } catch (Throwable th) {
            this.f41149 = c18837;
            c13395.m32414();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33128() {
        this.f41160.m39520();
    }

    public C13809(C2903 c2903) {
        c2903.m8841(f41143, this);
        this.f41154 = C22364.m50099(c2903);
        C17013 c17013M39896 = C17013.m39896(c2903);
        C20661 c20661M47250 = C20661.m47250(c2903);
        this.f41147 = c20661M47250;
        this.f41153 = C15240.m36054(c2903);
        C11139 c11139 = (C11139) c2903.m8838(C11139.f33424);
        this.f41159 = c11139 == null ? new C11139(c2903) : c11139;
        this.f41144 = C6319.m17456(c2903);
        this.f41146 = C13395.m32391(c2903);
        this.f41157 = C4824.m14050(c2903);
        this.f41150 = C6136.m17057(c2903);
        this.f41162 = C3267.m10022(c2903);
        C5931.m16615(c2903);
        C2176 c2176M39899 = c17013M39896.m39899(1L);
        C14163 c14163 = c20661M47250.f66458;
        C5557 c5557M39908 = c17013M39896.m39908(c2176M39899, c14163.f17562, C2609.m8239(), (AbstractC12612) null, C2609.m8239(), C2609.m8239());
        this.f41152 = c5557M39908;
        c5557M39908.f17186 = c14163;
        this.f41148 = C4767.m13930(c2903);
        this.f41158 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f41161 = EnumC19173.m44252(C11781.m28823(c2903));
        this.f41160 = C16782.m39518(c2903);
    }
}
