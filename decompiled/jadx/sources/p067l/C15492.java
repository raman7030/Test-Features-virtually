package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S424 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15492 extends AbstractC2562 {

    /* JADX INFO: renamed from: ۠ */
    public static final C6468 f44221 = new C6468();

    /* JADX INFO: renamed from: ֡ */
    public C8374 f44222;

    /* JADX INFO: renamed from: ֫ */
    public C15099 f44224;

    /* JADX INFO: renamed from: ۖ */
    public C22004 f44225;

    /* JADX INFO: renamed from: ۘ */
    public final C6899 f44226;

    /* JADX INFO: renamed from: ۚ */
    public C20271 f44227;

    /* JADX INFO: renamed from: ۜ */
    public C8200 f44228;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC6462 f44229;

    /* JADX INFO: renamed from: ۢ */
    public C7650 f44230;

    /* JADX INFO: renamed from: ۧ */
    public C16852 f44231;

    /* JADX INFO: renamed from: ܳ */
    public C23623 f44232;

    /* JADX INFO: renamed from: ܽ */
    public C4036 f44234;

    /* JADX INFO: renamed from: ܿ */
    public C6953 f44235;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC13035 f44236;

    /* JADX INFO: renamed from: ᩴ */
    public C12955 f44237;

    /* JADX INFO: renamed from: ᩵ */
    public C18318 f44238;

    /* JADX INFO: renamed from: ᩷ */
    public EnumC20590 f44239;

    /* JADX INFO: renamed from: ᩻ */
    public C5473 f44240;

    /* JADX INFO: renamed from: ֨ */
    public C20271 f44223 = new C20271();

    /* JADX INFO: renamed from: ܺ */
    public final C15854 f44233 = new C13482();

    /* JADX INFO: renamed from: ֫ */
    public static C15492 m35238(C5127 c5127) {
        C15492 c15492 = (C15492) c5127.m10905(f44221);
        return c15492 == null ? new C15492(c5127) : c15492;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4036 m35240(AbstractC21195 abstractC21195) {
        return this.f44238.m41755(abstractC21195);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Collection m35246() {
        return this.f44238.m41758();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4036 m35237(C4036 c4036, C7650 c7650) {
        C4036 c4036M8087 = c4036.m8087(c7650, ((C10545) c4036.f8849).m24327(AbstractC15689.m35727(c7650.f20027)));
        c4036M8087.f8855 = c7650;
        c4036M8087.f8852 = c4036;
        C10545 c10545 = (C10545) c4036M8087.f8849;
        c10545.f29215 = false;
        c10545.f29205 = null;
        c10545.f29211 = C9268.m21415(c4036.f8850);
        return c4036M8087;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4036 m35244(C3626 c3626) {
        C10545 c10545 = new C10545();
        C4036 c4036 = new C4036(c3626, c10545);
        c4036.f8851 = c3626;
        c4036.f8855 = this.f44230;
        c3626.f7508 = AbstractC15689.m35727(c3626.f7517);
        c3626.f7513 = new C23737(c3626.f7517);
        c3626.f7511 = new C24407(c3626.f7517);
        c10545.f29201 = c3626.f7508;
        c10545.f29205 = this.f44235;
        return c4036;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC15689 m35239(C4036 c4036) {
        if (c4036.f8850.m16617(EnumC19998.f60806)) {
            return ((C7650) c4036.f8850).f20027.f45850;
        }
        return ((C10545) c4036.f8849).f29201;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m35242(AbstractC7257 abstractC7257, C4036 c4036) {
        AbstractC6462 abstractC6462M38271;
        C15099 c15099 = this.f44224;
        C4036 c4037 = this.f44234;
        try {
            try {
                this.f44234 = c4036;
                c15099.m34512();
                abstractC7257.mo3382(this);
                abstractC6462M38271 = this.f44229;
            } catch (C21865 e) {
                C16852 c16852 = this.f44231;
                abstractC7257.getClass();
                abstractC6462M38271 = c16852.m38271(abstractC7257, e);
            }
            return abstractC6462M38271;
        } finally {
            c15099.m34516();
            this.f44234 = c4037;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m35241(C4848 c4848, C4036 c4036) {
        C20271 c20271 = new C20271();
        while (c4848.m10293()) {
            AbstractC6462 abstractC6462M35242 = m35242((AbstractC7257) c4848.f11034, c4036);
            if (abstractC6462M35242 != null) {
                c20271.m45777(abstractC6462M35242);
            }
            c4848 = c4848.f11035;
        }
        return c20271.m45783();
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
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3780(final C3626 c3626) {
        boolean z;
        C18189 c18189FindAny;
        C4036 c4036M35244;
        C4036 c4036M8087;
        C4036 c4036M41755;
        AbstractC7783 abstractC7783;
        AbstractC14355 abstractC14355;
        InterfaceC19740 interfaceC19740 = c3626.f7516;
        C23623 c23623 = this.f44232;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        InterfaceC19740 interfaceC19741 = c3626.f7516;
        EnumC18398 enumC18398 = EnumC18398.SOURCE;
        boolean zMo23288 = interfaceC19741.mo23288("package-info", enumC18398);
        boolean zMo23289 = c3626.f7516.mo23288("module-info", enumC18398);
        C22004 c22004 = this.f44225;
        if (zMo23289 && c3626.m6848() != null) {
            C9800 c9800M6851 = c3626.m6851();
            if (c9800M6851 != null) {
                c23623.m9352(c9800M6851, C8300.f22006);
            }
            c3626.f7517 = c22004.f69155;
            m35241(c3626.f7509, m35244(c3626));
            C2417 c2417 = c3626.f7510;
            C5473 c5473 = this.f44240;
            c5473.getClass();
            c2417.f3699 = new C24975(8, c5473);
        } else {
            C9800 c9800M6852 = c3626.m6851();
            int i = 1;
            if (c9800M6852 != null) {
                C9794 c9794M49593 = c22004.m49593(c3626.f7510, C9268.m21418(c9800M6852.f27115));
                c9800M6852.f27116 = c9794M49593;
                c3626.f7517 = c9794M49593;
                C15854 c15854 = this.f44233;
                c15854.getClass();
                c15854.mo3799(c9800M6852);
                if (c9800M6852.f27114.m10293() || this.f44239 == EnumC20590.ALWAYS || c3626.f7515 != null) {
                    if (zMo23288) {
                        z = true;
                    } else if (c9800M6852.f27114.m10293()) {
                        C19049 c19049 = (C19049) c9800M6852.f27114.f11034;
                        c19049.getClass();
                        c23623.m9352(c19049, C8300.f22087);
                    }
                }
                final Map map = c3626.f7510.f3689;
                c18189FindAny = C7480.stream(c22004.m49598(c3626.f7517.f27059)).filter(new C8572(i, c3626)).filter(new Predicate() { // from class: l.ۛ۫֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m18807or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C15492 c15492 = this.f21403;
                        c15492.getClass();
                        C3626 c3627 = c3626;
                        return map.get(c3627.f7517.f27059) == c15492.f44225.m49601((C2417) obj, c3627.f7517.f27059);
                    }
                }).findAny();
                if (c18189FindAny.isPresent()) {
                    AbstractC7783 abstractC7784 = (AbstractC7783) c18189FindAny.get();
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(c9800M6852, new C14040("compiler", "package.in.other.module", abstractC7784));
                }
                c3626.f7517.mo18020();
                c4036M35244 = m35244(c3626);
                if (zMo23288) {
                    c4036M8087 = c4036M35244.m8087(c9800M6852, c4036M35244.f8849);
                } else {
                    c4036M8087 = null;
                }
                if (zMo23288) {
                    C9794 c9794 = c3626.f7517;
                    C18318 c18318 = this.f44238;
                    c4036M41755 = c18318.m41755(c9794);
                    if (c4036M41755 != null) {
                        if (!this.f44236.mo4110(c3626.f7516, c4036M41755.f8851.f7516)) {
                            if (c9800M6852 != null) {
                                abstractC14355 = c9800M6852.f27115;
                                abstractC14355.getClass();
                            } else {
                                abstractC14355 = null;
                            }
                            C9794 c9795 = c3626.f7517;
                            C12895 c12895 = C15675.f45417;
                            c23623.m9364(abstractC14355, new C12895("compiler", "pkg-info.already.seen", c9795));
                        }
                    }
                    c18318.m41757(c3626.f7517, c4036M8087);
                    for (abstractC7783 = c3626.f7517; abstractC7783 != null && abstractC7783.f20405 == EnumC3600.f7351; abstractC7783 = abstractC7783.f20407) {
                        abstractC7783.f20409 |= X931RNG.BLOCK128_RESEED_MAX;
                    }
                    C8200 c8200 = this.f44228;
                    AbstractC12224 abstractC12224 = c8200.f21734;
                    C15828 c15828M49588 = c22004.m49588(c3626.f7510, abstractC12224, c3626.f7517);
                    c15828M49588.f45859 = c8200.f21738.m32717(c3626.f7517 + "." + ((Object) abstractC12224));
                    c15828M49588.f45858 = c3626.f7516;
                    c15828M49588.f20410 = InterfaceC8453.f22683;
                    c15828M49588.f45850 = AbstractC15689.m35727(c15828M49588);
                    C9794 c9796 = c3626.f7517;
                    c9796.f27062 = c15828M49588;
                    c9796.f27060 = c3626.f7516;
                }
                m35241(c3626.f7509, c4036M35244);
                if (z) {
                    this.f44226.add(c4036M8087);
                }
            } else {
                c3626.f7517 = c3626.f7510.f3694;
            }
            z = false;
            final Map map2 = c3626.f7510.f3689;
            c18189FindAny = C7480.stream(c22004.m49598(c3626.f7517.f27059)).filter(new C8572(i, c3626)).filter(new Predicate() { // from class: l.ۛ۫֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m18807or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C15492 c15492 = this.f21403;
                    c15492.getClass();
                    C3626 c3627 = c3626;
                    return map2.get(c3627.f7517.f27059) == c15492.f44225.m49601((C2417) obj, c3627.f7517.f27059);
                }
            }).findAny();
            if (c18189FindAny.isPresent()) {
                AbstractC7783 abstractC7785 = (AbstractC7783) c18189FindAny.get();
                C14040 c14041 = C8300.f21997;
                c23623.m9352(c9800M6852, new C14040("compiler", "package.in.other.module", abstractC7785));
            }
            c3626.f7517.mo18020();
            c4036M35244 = m35244(c3626);
            if (zMo23288) {
                c4036M8087 = c4036M35244.m8087(c9800M6852, c4036M35244.f8849);
            } else {
                c4036M8087 = null;
            }
            if (zMo23288) {
                C9794 c9797 = c3626.f7517;
                C18318 c18319 = this.f44238;
                c4036M41755 = c18319.m41755(c9797);
                if (c4036M41755 != null) {
                    if (!this.f44236.mo4110(c3626.f7516, c4036M41755.f8851.f7516)) {
                        if (c9800M6852 != null) {
                            abstractC14355 = c9800M6852.f27115;
                            abstractC14355.getClass();
                        } else {
                            abstractC14355 = null;
                        }
                        C9794 c9798 = c3626.f7517;
                        C12895 c12896 = C15675.f45417;
                        c23623.m9364(abstractC14355, new C12895("compiler", "pkg-info.already.seen", c9798));
                    }
                }
                c18319.m41757(c3626.f7517, c4036M8087);
                while (abstractC7783 != null) {
                    abstractC7783.f20409 |= X931RNG.BLOCK128_RESEED_MAX;
                }
                C8200 c8201 = this.f44228;
                AbstractC12224 abstractC12225 = c8201.f21734;
                C15828 c15828M49589 = c22004.m49588(c3626.f7510, abstractC12225, c3626.f7517);
                c15828M49589.f45859 = c8201.f21738.m32717(c3626.f7517 + "." + ((Object) abstractC12225));
                c15828M49589.f45858 = c3626.f7516;
                c15828M49589.f20410 = InterfaceC8453.f22683;
                c15828M49589.f45850 = AbstractC15689.m35727(c15828M49589);
                C9794 c9799 = c3626.f7517;
                c9799.f27062 = c15828M49589;
                c9799.f27060 = c3626.f7516;
            }
            m35241(c3626.f7509, c4036M35244);
            if (z) {
                this.f44226.add(c4036M8087);
            }
        }
        c23623.m9363(interfaceC19740M9363);
        this.f44229 = null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        C16852 c16852;
        C15828 c15828M49589;
        final C15828 c15828M49588;
        C21333 c21333;
        C20271 c20271;
        C4036 c4036 = this.f44234;
        AbstractC7783 abstractC7783 = ((C10545) c4036.f8849).f29201.f26587;
        AbstractC15689 abstractC15689M35239 = m35239(c4036);
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7351;
        C8374 c8374 = this.f44222;
        C23623 c23623 = this.f44232;
        C22004 c22004 = this.f44225;
        C16852 c16853 = this.f44231;
        if (enumC3600 == enumC3601) {
            C9794 c9794 = (C9794) abstractC7783;
            AbstractC7783 abstractC7784 = c9794;
            while (abstractC7784 != null && abstractC7784.f20405 == EnumC3600.f7351) {
                abstractC7784.f20409 |= X931RNG.BLOCK128_RESEED_MAX;
                abstractC7784 = abstractC7784.f20407;
                c16853 = c16853;
            }
            c16852 = c16853;
            c15828M49589 = c22004.m49588(this.f44234.f8851.f7510, c7650.f20021, c9794);
            c9794.mo18020();
            c9794.f27061.mo28412(c15828M49589);
            if ((c7650.f20022.f9954 & 1) != 0 && !this.f44234.f8851.f7516.mo23288(c15828M49589.f20408.toString(), EnumC18398.SOURCE)) {
                EnumC10306 enumC10306 = EnumC10306.CLASS;
                long j = c7650.f20022.f9954;
                if ((j & 16384) != 0) {
                    enumC10306 = EnumC10306.ENUM;
                } else if ((j & 512) != 0) {
                    enumC10306 = EnumC10306.INTERFACE;
                }
                AbstractC12224 abstractC12224 = c7650.f20021;
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c7650, new C14040("compiler", "class.public.should.be.in.file", enumC10306, abstractC12224));
            }
        } else {
            c16852 = c16853;
            if (!c7650.f20021.isEmpty() && !c16852.m38326(c7650, c7650.f20021, abstractC15689M35239)) {
                this.f44229 = null;
                return;
            }
            EnumC3600 enumC3602 = abstractC7783.f20405;
            EnumC3600 enumC3603 = EnumC3600.f7354;
            if (enumC3602 == enumC3603) {
                AbstractC21195 abstractC21195 = (AbstractC21195) abstractC7783;
                c15828M49588 = c22004.m49588(this.f44234.f8851.f7510, c7650.f20021, abstractC21195);
                if (c15828M49588.f20407 != abstractC7783) {
                    AbstractC12224 abstractC12225 = c15828M49588.f20408;
                    AbstractC12224 abstractC12226 = c7650.f20021;
                    if (abstractC12225 != abstractC12226) {
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(c7650, new C14040("compiler", "same.binary.name", abstractC12225, abstractC12226));
                        AbstractC12224 abstractC12227 = c7650.f20021;
                        C13286 c13286 = AbstractC6462.f16700;
                        c8374.getClass();
                        C13956 c13956M19397 = C8374.m19397(abstractC12227, abstractC21195, c13286);
                        this.f44229 = c13956M19397;
                        c7650.f20027 = (C15828) c13956M19397.f16705;
                        return;
                    }
                    C1446.m31705(abstractC7783.f20407.f20405 != enumC3603, new C5194(1, abstractC7783));
                    C1446.m31705(c15828M49588.f20407.f20405 == enumC3603, new Supplier() { // from class: l.ۤ۫֨
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return c15828M49588.f20407.toString();
                        }
                    });
                    AbstractC15689 abstractC15689 = ((C15828) c15828M49588.f20407).f45850;
                    if (abstractC15689 != null) {
                        abstractC15689.mo28417(c15828M49588);
                    }
                    c15828M49588.f20407 = abstractC7783;
                }
                if ((512 & abstractC7783.f20409) != 0) {
                    c7650.f20022.f9954 |= 9;
                }
            } else {
                c15828M49589 = c22004.m49589(c7650.f20021, abstractC7783);
                c15828M49589.f45859 = c16852.m38349(c15828M49589);
                if (!c15828M49589.f20408.isEmpty()) {
                    c16852.m38304(c7650, c15828M49589, ((C10545) this.f44234.f8849).f29201);
                }
            }
            c7650.f20027 = c15828M49588;
            if (c16852.m38335(c15828M49588) != null) {
                c16852.m38360(c15828M49588);
                abstractC15689M35239.mo28415(c15828M49588);
                C4036 c4036M35237 = m35237(this.f44234, c7650);
                this.f44238.m41757(c15828M49588, c4036M35237);
                c15828M49588.f20410 = InterfaceC8453.f22683;
                c15828M49588.f20409 = this.f44231.m38261(c7650, c7650.f20022.f9954, c15828M49588, c7650);
                c15828M49588.f45858 = this.f44234.f8851.f7516;
                c15828M49588.f45850 = AbstractC15689.m35727(c15828M49588);
                c15828M49588.m35939();
                c21333 = (C21333) c15828M49588.f20406;
                if (abstractC7783.f20405 != EnumC3600.f7351 && (c15828M49588.f20409 & 8) == 0) {
                    while (abstractC7783.f20405.m6623(C17010.f50315) && (abstractC7783.f20409 & 8) == 0) {
                        abstractC7783 = abstractC7783.f20407;
                    }
                    if (abstractC7783.f20405 == EnumC3600.f7354) {
                        c21333.mo7202(abstractC7783.f20406);
                    }
                }
                c21333.f67257 = m35241(c7650.f20026, c4036M35237);
                c21333.f67258 = null;
                c15828M49588.f20410 = this.f44237;
                if (!c15828M49588.m17996() && (c20271 = this.f44227) != null) {
                    c20271.m45777(c15828M49588);
                }
                m35241(c7650.f20020, c4036M35237);
                this.f44229 = c15828M49588.f20406;
                return;
            }
            AbstractC12224 abstractC12228 = c15828M49588.f45855;
            C14040 c14042 = C8300.f21997;
            c23623.m9352(c7650, new C14040("compiler", "duplicate.class", abstractC12228));
            C13286 c13287 = AbstractC6462.f16700;
            c8374.getClass();
            C13956 c13956M19398 = C8374.m19397(c7650.f20021, (AbstractC21195) abstractC7783, c13287);
            this.f44229 = c13956M19398;
            c7650.f20027 = (C15828) c13956M19398.f16705;
        }
        c15828M49588 = c15828M49589;
        c7650.f20027 = c15828M49588;
        if (c16852.m38335(c15828M49588) != null) {
            c16852.m38360(c15828M49588);
            abstractC15689M35239.mo28415(c15828M49588);
            C4036 c4036M35238 = m35237(this.f44234, c7650);
            this.f44238.m41757(c15828M49588, c4036M35238);
            c15828M49588.f20410 = InterfaceC8453.f22683;
            c15828M49588.f20409 = this.f44231.m38261(c7650, c7650.f20022.f9954, c15828M49588, c7650);
            c15828M49588.f45858 = this.f44234.f8851.f7516;
            c15828M49588.f45850 = AbstractC15689.m35727(c15828M49588);
            c15828M49588.m35939();
            c21333 = (C21333) c15828M49588.f20406;
            if (abstractC7783.f20405 != EnumC3600.f7351) {
                while (abstractC7783.f20405.m6623(C17010.f50315)) {
                    abstractC7783 = abstractC7783.f20407;
                }
                if (abstractC7783.f20405 == EnumC3600.f7354) {
                    c21333.mo7202(abstractC7783.f20406);
                }
            }
            c21333.f67257 = m35241(c7650.f20026, c4036M35238);
            c21333.f67258 = null;
            c15828M49588.f20410 = this.f44237;
            if (!c15828M49588.m17996()) {
                c20271.m45777(c15828M49588);
            }
            m35241(c7650.f20020, c4036M35238);
            this.f44229 = c15828M49588.f20406;
            return;
        }
        AbstractC12224 abstractC12229 = c15828M49588.f45855;
        C14040 c14043 = C8300.f21997;
        c23623.m9352(c7650, new C14040("compiler", "duplicate.class", abstractC12229));
        C13286 c13288 = AbstractC6462.f16700;
        c8374.getClass();
        C13956 c13956M19399 = C8374.m19397(c7650.f20021, (AbstractC21195) abstractC7783, c13288);
        this.f44229 = c13956M19399;
        c7650.f20027 = (C15828) c13956M19399.f16705;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        C10485 c10485;
        AbstractC6462 abstractC6462 = c15973.f18925;
        if (abstractC6462 != null) {
            c10485 = (C10485) abstractC6462;
        } else {
            c10485 = new C10485(((C10545) this.f44234.f8849).f29201.f26587, this.f44225.f69204, c15973.f46261);
        }
        c15973.f18925 = c10485;
        if (this.f44231.m38323(c15973, c10485.f16705, ((C10545) this.f44234.f8849).f29201)) {
            ((C10545) this.f44234.f8849).f29201.mo28415(c10485.f16705);
        }
        this.f44229 = c10485;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        C4036 c4036 = this.f44234;
        C1446.m31699(c5777.f14182);
        C4036 c4036M8087 = c4036.m8087(c5777, ((C10545) c4036.f8849).m24327(AbstractC15689.m35727(c5777.f14182)));
        c4036M8087.f8855 = this.f44230;
        c4036M8087.f8852 = c4036;
        C10545 c10545 = (C10545) c4036M8087.f8849;
        c10545.f29215 = false;
        c10545.f29205 = null;
        this.f44238.m41757(c5777.f14182, c4036M8087);
        if (this.f44240.m12092(c5777.f14182)) {
            this.f44226.add(c4036M8087);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
        this.f44229 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35243(C15828 c15828, C4848 c4848) {
        C15099 c15099 = this.f44224;
        c15099.m34512();
        C20271 c20271 = this.f44227;
        C12955 c12955 = this.f44237;
        if (c12955.f36434) {
            this.f44227 = new C20271();
        }
        try {
            m35241(c4848, (C4036) null);
            if (c12955.f36434) {
                while (this.f44227.m45784()) {
                    C15828 c15829 = (C15828) this.f44227.m45782();
                    if (c15828 == null || c15828 == c15829 || c20271 == null) {
                        c15829.mo18020();
                    } else {
                        c20271.m45777(c15829);
                    }
                }
                boolean zM12098 = this.f44240.m12098();
                C20271 c20272 = this.f44223;
                if (!zM12098) {
                    Iterator it = c4848.iterator();
                    while (it.hasNext()) {
                        C3626 c3626 = (C3626) it.next();
                        if (c3626.m6848() != null) {
                            c20272.m45777(c3626);
                        } else {
                            c12955.m29713(C4848.m10276of((Object) c3626));
                        }
                    }
                } else {
                    c12955.m29713(c20272.m45783());
                    c20272.clear();
                    c12955.m29713(c4848);
                }
            }
            this.f44227 = c20271;
            c15099.m34516();
        } catch (Throwable th) {
            this.f44227 = c20271;
            c15099.m34516();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35245() {
        this.f44238.m41756();
    }

    public C15492(C5127 c5127) {
        c5127.m10908(f44221, this);
        this.f44232 = C23623.m52439(c5127);
        C18537 c18537M42139 = C18537.m42139(c5127);
        C22004 c22004M49577 = C22004.m49577(c5127);
        this.f44225 = c22004M49577;
        this.f44231 = C16852.m38215(c5127);
        C12955 c12955 = (C12955) c5127.m10905(C12955.f36424);
        this.f44237 = c12955 == null ? new C12955(c5127) : c12955;
        this.f44222 = C8374.m19396(c5127);
        this.f44224 = C15099.m34493(c5127);
        this.f44235 = C6953.m15930(c5127);
        this.f44228 = C8200.m18988(c5127);
        this.f44240 = C5473.m12055(c5127);
        C8005.m18541(c5127);
        C4436 c4436M42142 = c18537M42139.m42142(1L);
        C15828 c15828 = c22004M49577.f69140;
        C7650 c7650M42151 = c18537M42139.m42151(c4436M42142, c15828.f20408, C4848.m10283(), (AbstractC14355) null, C4848.m10283(), C4848.m10283());
        this.f44230 = c7650M42151;
        c7650M42151.f20027 = c15828;
        this.f44226 = C6899.m15810(c5127);
        this.f44236 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f44239 = EnumC20590.m46547(C13565.m30871(c5127));
        this.f44238 = C18318.m41754(c5127);
    }
}
