package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9310 extends AbstractC0204 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f28208 = new C4314();

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC9454[] f28209 = {EnumC9454.BYTE, EnumC9454.CHAR, EnumC9454.SHORT, EnumC9454.INT, EnumC9454.LONG, EnumC9454.FLOAT, EnumC9454.DOUBLE, EnumC9454.BOOLEAN};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5931 f28210;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1755 f28211;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f28212;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C23420 f28213;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15240 f28214;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28215;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C1856 f28216;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13809 f28219;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C10139 f28220;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4224 f28221;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C16782 f28222;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f28223;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C10222 f28224;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7898 f28225;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28226;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5572 f28227;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28228;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6136 f28229;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f28230;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22406 f28231;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23168 f28232;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16364 f28233;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16672 f28234;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28236;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4658 f28239;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f28240;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f28241;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f28242;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28243;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C20661 f28244;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f28245;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28246;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12399 f28247;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C18230 f28248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17013 f28249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13395 f28250;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C6319 f28251;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6735 f28252;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22364 f28253;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14247 f28254;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f28255;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C17214 f28256;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC12501 f28238 = new C1548(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7772 f28218 = C1856.f6336;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23363 f28235 = new C22051();

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C2086 f28237 = new C12173(this);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public HashMap f28217 = new HashMap();

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1395(C10643 c10643) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9310 m23901(C2903 c2903) {
        C9310 c9310 = (C9310) c2903.m8838(f28208);
        return c9310 == null ? new C9310(c2903) : c9310;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23934(final AbstractC5144 abstractC5144, final AbstractC4308 abstractC4308, final C15406 c15406, final C23420 c23420) {
        AbstractC4308 abstractC4308Mo13581;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        EnumC22756 enumC22756 = c23420.f75216;
        C15406 c15407 = c23420.f75217;
        AbstractC4308 abstractC4309 = c23420.f75219;
        final C0384 c0384Mo3857 = interfaceC3953.mo3857();
        boolean z = (abstractC4308.m12913(EnumC9454.ERROR) || abstractC4309.m12913(EnumC9454.METHOD) || abstractC4309.m12913(EnumC9454.FORALL)) ? false : true;
        if (z && !c15406.m36458(c15407)) {
            abstractC5144.getClass();
            EnumSet enumSetM36456 = c15407.m36456();
            EnumSet enumSetM36457 = c15406.m36456();
            C12281 c12281 = C6241.f19132;
            this.f28253.m7273(abstractC5144, new C12281("compiler", "unexpected.type", enumSetM36456, enumSetM36457));
            abstractC4308Mo13581 = this.f28251.m17535(abstractC4308);
        } else if (this.f28241 && abstractC4308.m12928(c0384Mo3857.f1817)) {
            AbstractC4308 abstractC43010 = z ? abstractC4309 : abstractC4308;
            if (enumC22756.mo28274()) {
                c0384Mo3857.m1864(C2609.of((Object) abstractC4308), new InterfaceC3748() { // from class: l.۠᩶֨
                    @Override // l.InterfaceC3748
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo4673(C0384 c0384) {
                        C9310 c9310 = this.f25738;
                        c9310.getClass();
                        C23420 c23421 = c23420;
                        AbstractC4308 abstractC43011 = c23421.f75219;
                        C0384 c0385 = c0384Mo3857;
                        C23420 c23420Mo38523 = c23421.mo38523(c0385.m1859(abstractC43011));
                        c9310.m23934(abstractC5144, c0385.m1859(abstractC4308), c15406, c23420Mo38523);
                    }
                });
            }
            abstractC4308Mo13581 = abstractC43010;
        } else {
            abstractC4308Mo13581 = z ? c23420.mo13581(abstractC5144, abstractC4308) : abstractC4308;
        }
        if (enumC22756.mo16323()) {
            abstractC5144.f16086 = abstractC4308Mo13581;
        }
        return abstractC4308Mo13581;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23947(AbstractC12612 abstractC12612, C12048 c12048, AbstractC5144 abstractC5144, C1755 c1755) {
        boolean z;
        AbstractC10370 abstractC10370 = c12048.f17562;
        C6136 c6136 = this.f28229;
        AbstractC10370 abstractC10371 = c6136.f18886;
        C22364 c22364 = this.f28253;
        if (abstractC10370 != abstractC10371) {
            long j = c12048.f17563;
            if ((16 & j) != 0) {
                if ((j & 262144) == 0 && (abstractC5144 == null || C7260.m19453(abstractC5144))) {
                    AbstractC5698 abstractC5698 = ((C8604) c1755.f6073).f26285.f23673;
                    if (c12048.f17561 != abstractC5698) {
                        if ((abstractC5698.f17562 == c6136.f18879 || abstractC5698.f17559 == EnumC1296.f4567 || (abstractC5698.mo16084() & 1048576) != 0) && c12048.f17561 == abstractC5698.f17561) {
                            z = (((c12048.f17563 & 8) > 0L ? 1 : ((c12048.f17563 & 8) == 0L ? 0 : -1)) != 0) == C22406.m50291(c1755);
                        }
                    }
                    C8526 c8526 = c1755.f6077;
                    if (z & (!(c8526 != null && C7260.m19454(c8526)))) {
                        return;
                    }
                }
                if (c12048.m29422()) {
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(abstractC12612, new C12281("compiler", "try.resource.may.not.be.assigned", c12048));
                    return;
                } else {
                    C12281 c12282 = C6241.f19132;
                    c22364.m7273(abstractC12612, new C12281("compiler", "cant.assign.val.to.final.var", c12048));
                    return;
                }
            }
            return;
        }
        c22364.m7273(abstractC12612, C6241.f19235);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m23937(AbstractC12612 abstractC12612, C1323 c1323) {
        C1755 c1755M33127 = this.f28219.m33127(c1323);
        C17013 c17013 = this.f28249;
        C2176 c2176M39899 = c17013.m39899(0L);
        C20661 c20661 = this.f28244;
        C5557 c5557M39908 = c17013.m39908(c2176M39899, c20661.f66462.f17562, (C2609) null, (AbstractC12612) null, (C2609) null, (C2609) null);
        c1755M33127.f6079 = c5557M39908;
        c5557M39908.f17186 = c20661.f66462;
        return (AbstractC5698) abstractC12612.mo986(this.f28238, c1755M33127);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23928(AbstractC5144 abstractC5144, C1755 c1755) {
        C4224 c4224 = this.f28221;
        C1755 c1756 = null;
        C23420 c23420 = null;
        c1756 = null;
        c1756 = null;
        c1756 = null;
        c1756 = null;
        c1756 = null;
        c1756 = null;
        if (!c4224.f13704.isEmpty() && !((C8604) c1755.f6073).f26283.f23066 && (abstractC5144 instanceof AbstractC11349) && !abstractC5144.m14709(EnumC18550.f57582) && !abstractC5144.m14709(EnumC18550.f57550) && !abstractC5144.m14709(EnumC18550.f57511) && !abstractC5144.m14709(EnumC18550.f57532)) {
            AbstractC5144 abstractC5145 = c1755.f6074;
            C8604 c8604 = (C8604) c1755.f6073;
            AbstractC14016 abstractC14016 = c8604.f26285;
            C1755 c1755M5877 = c1755.m5877(abstractC5145, c8604.m22358(abstractC14016.mo26383(abstractC14016.f23673)));
            C8604 c8605 = (C8604) c1755M5877.f6073;
            if (c8605.f26284 != null) {
                C9310 c9310 = c4224.f13708;
                C11003.requireNonNull(c9310);
                C23420 c23421 = c8605.f26284;
                c23420 = new C23420(c9310, c23421.f75217, c23421.f75219);
            }
            c8605.f26284 = c23420;
            c1756 = c1755M5877;
        }
        AbstractC4308 abstractC4308M23930 = m23930(abstractC5144, c1755, this.f28246);
        if (c1756 != null) {
            C16217 c16217 = new C16217(c4224, (AbstractC11349) abstractC5144, c1756);
            c16217.mo10758(c16217.f49918);
            if (!c16217.f49919.isEmpty()) {
                Iterator it = c16217.f49919.iterator();
                while (it.hasNext()) {
                    c4224.f13711.mo33691((C9869) it.next());
                }
            }
        }
        this.f28225.m21193();
        return abstractC4308M23930;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        AbstractC5698 abstractC5698M50303;
        AbstractC5698 abstractC5698;
        AbstractC5698 abstractC5698M50314;
        AbstractC10370 abstractC10370;
        boolean zM12913 = this.f28213.f75219.m12913(EnumC9454.METHOD);
        C22406 c22406 = this.f28231;
        if (zM12913 || this.f28213.f75219.m12913(EnumC9454.FORALL)) {
            C1755 c1755 = this.f28211;
            ((C8604) c1755.f6073).f26288 = null;
            AbstractC10370 abstractC10371 = c7673.f23696;
            C2609 c2609Mo12933 = this.f28213.f75219.mo12933();
            C2609 c2609Mo12938 = this.f28213.f75219.mo12938();
            c22406.getClass();
            C14163 c14163 = c1755.f6079.f17186;
            C5040 c5040 = c22406.f72585;
            C17740 c17740 = new C17740(c22406, abstractC10371, c14163.f17560, c2609Mo12933, c2609Mo12938);
            C12364 c12364 = new C12364(c22406);
            c12364.f37062 = c5040;
            abstractC5698M50303 = c22406.m50303(c1755, c7673, c14163, c12364, c17740);
        } else {
            abstractC5698M50303 = c7673.f23697;
            if (abstractC5698M50303 == null || abstractC5698M50303.f17559 == EnumC1296.f4567) {
                C1755 c1756 = this.f28211;
                AbstractC10370 abstractC10372 = c7673.f23696;
                AbstractC5698 abstractC5698M50322 = c22406.m50322(c7673, c1756, abstractC10372, this.f28213.f75217);
                AbstractC4308 abstractC4308 = c1756.f6079.f17186.f17560;
                abstractC5698M50303 = c22406.m50316(abstractC5698M50322, (InterfaceC3109) c7673, (AbstractC5698) abstractC4308.f13890, abstractC4308, abstractC10372, false);
            }
        }
        AbstractC5698 abstractC5699 = abstractC5698M50303;
        c7673.f23697 = abstractC5699;
        C1755 c1757 = this.f28211;
        EnumC1296 enumC1296 = c1757.f6079.f17186.f17561.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4579;
        C6136 c6136 = this.f28229;
        if (enumC1296 != enumC1297 && abstractC5699.f17559.m4391(C15406.f47185) && abstractC5699.f17561.f17559 == EnumC1296.f4582 && (abstractC10370 = c7673.f23696) != c6136.f18886 && abstractC10370 != c6136.f18898) {
            while (c1757.f6076 != null && !abstractC5699.m16067((AbstractC19810) c1757.f6079.f17186, this.f28251)) {
                c1757.f6079.f17186.mo16101();
                c1757 = c1757.f6076;
            }
        }
        EnumC1296 enumC1298 = abstractC5699.f17559;
        EnumC1296 enumC1299 = EnumC1296.f4567;
        if (enumC1298 == enumC1299) {
            C12048 c12048 = (C12048) abstractC5699;
            m23910((AbstractC12612) c7673, this.f28211, c12048, false);
            if (C15406.f47183.m36458(this.f28213.f75217)) {
                m23947(c7673, c12048, (AbstractC5144) null, this.f28211);
            }
        }
        boolean z = ((C8604) c1757.f6073).f26299;
        C15240 c15240 = this.f28214;
        if (z && abstractC5699.f17559.m4391(C15406.f47185) && abstractC5699.f17561.f17559 == EnumC1296.f4582 && (abstractC5699.mo16084() & 8) == 0) {
            if (abstractC5699.f17559 == enumC1299) {
                abstractC5698M50314 = abstractC5699;
            } else {
                C1755 c1758 = this.f28211;
                abstractC5698M50314 = c22406.m50314(c7673, c1758, c1758.f6079.f17186, c6136.f18886);
            }
            c15240.m36177(c7673, abstractC5698M50314);
        }
        C1755 c1759 = this.f28211;
        EnumC1296 enumC12910 = abstractC5699.f17559;
        if (enumC12910 != EnumC1296.f4581 && enumC12910 != EnumC1296.f4582 && (abstractC5698 = abstractC5699.f17561) != null && abstractC5698 != c1759.f6079.f17186) {
            while (c1759.f6076 != null && !c22406.m50328(this.f28211, c1759.f6079.f17186.f17560, abstractC5699)) {
                c1759 = c1759.f6076;
            }
        }
        C8604 c8604 = (C8604) this.f28211.f6073;
        if (c8604.f26287) {
            c15240.m36155(c7673, c8604.f26298);
        }
        this.f28223 = m23932(c7673, c1759.f6079.f17186.f17560, abstractC5699, this.f28211, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(final C13464 c13464) throws Throwable {
        C23420 c23420Mo38522;
        AbstractC4308 abstractC4308;
        EnumC19816 enumC19816 = (!this.f28213.f75219.m12913(EnumC9454.NONE) || (abstractC4308 = this.f28213.f75219) == AbstractC4308.f13884 || abstractC4308 == C6735.f20919) ? EnumC19816.POLY : EnumC19816.STANDALONE;
        c13464.f13845 = enumC19816;
        if (enumC19816 == EnumC19816.POLY && this.f28213.f75219.m12913(EnumC9454.VOID)) {
            this.f28213.f75215.mo1084(c13464, this.f28210.m16617(C11886.f35459));
            C12193 c12193M17535 = this.f28251.m17535(this.f28213.f75219);
            c13464.f16086 = c12193M17535;
            this.f28223 = c12193M17535;
            return;
        }
        EnumC19816 enumC19817 = c13464.f13845;
        EnumC19816 enumC19818 = EnumC19816.STANDALONE;
        if (enumC19817 == enumC19818) {
            c23420Mo38522 = this.f28228;
        } else {
            C23420 c23420 = this.f28213;
            c23420Mo38522 = c23420.mo38522(new C14994(this, c23420.f75215));
        }
        final C23420 c23421 = c23420Mo38522;
        final C18837 c18837 = new C18837();
        final C18837 c18838 = new C18837();
        m23903(c13464, c13464.f40197, c13464.f40199, new BiConsumer() { // from class: l.ᩳۙ֨
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C18963 c18963 = (C18963) obj;
                C1755 c1755 = (C1755) obj2;
                ((C8604) c1755.f6073).f26286 = c23421;
                C2609 c2609 = c18963.f59814;
                C9310 c9310 = this.f54459;
                c9310.m23956(c2609, c1755);
                new C7939(c9310, c13464, c18837, c18838).m33860(c18963.f59814);
            }
        });
        boolean zIsEmpty = c13464.f40199.isEmpty();
        C22364 c22364 = this.f28253;
        if (zIsEmpty) {
            c22364.m7273(c13464, C6241.f19291);
        } else if (c18838.isEmpty()) {
            c22364.m7273(c13464, C6241.f19296);
        }
        AbstractC4308 abstractC4308M23934 = m23934(c13464, c13464.f13845 == enumC19818 ? m23924(c18837.m43517(), c18838.m43517()) : this.f28213.f75219, C15406.f47181, this.f28213);
        c13464.f16086 = abstractC4308M23934;
        this.f28223 = abstractC4308M23934;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23930(AbstractC5144 abstractC5144, C1755 c1755, C23420 c23420) {
        AbstractC4308 abstractC4308M36110;
        C1755 c1756 = this.f28211;
        C23420 c23421 = this.f28213;
        try {
            try {
                this.f28211 = c1755;
                this.f28213 = c23420;
                if (c23420.mo6717(abstractC5144)) {
                    this.f28223 = this.f28227.m15831(abstractC5144, c1755);
                } else {
                    abstractC5144.mo988(this);
                }
                C1856 c1856 = this.f28216;
                C7772 c7772 = this.f28218;
                c1856.getClass();
                switch (C14121.f42604[abstractC5144.mo989().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        c7772 = C1856.f6336;
                        break;
                }
                this.f28218 = c7772;
                abstractC4308M36110 = this.f28223;
            } catch (C20515 e) {
                abstractC5144.f16086 = this.f28244.f66457;
                abstractC4308M36110 = this.f28214.m36110(abstractC5144, e);
            }
            return abstractC4308M36110;
        } finally {
            this.f28211 = c1756;
            this.f28213 = c23421;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1755 m23919(C1755 c1755) {
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        AbstractC14016 abstractC14016M33607 = AbstractC14016.m33607(abstractC14016.f23673);
        C2609 c2609M8239 = C2609.m8239();
        Iterator it = abstractC14016.mo20475((Predicate) null, EnumC1317.RECURSIVE).iterator();
        while (it.hasNext()) {
            c2609M8239 = c2609M8239.m8246((AbstractC5698) it.next());
        }
        Iterator it2 = c2609M8239.iterator();
        while (it2.hasNext()) {
            abstractC14016M33607.mo26382((AbstractC5698) it2.next());
        }
        C1755 c1755M5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016M33607));
        C1755 c1756 = c1755M5877.f6076;
        if (c1756 != null) {
            c1755M5877.f6076 = m23919(c1756);
        }
        return c1755M5877;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23929(AbstractC5144 abstractC5144, C1755 c1755, AbstractC4308 abstractC4308) {
        C15406 c15406 = C15406.f47181;
        if (abstractC4308.m12913(EnumC9454.ERROR)) {
            abstractC4308 = AbstractC4308.f13885;
        }
        return m23930(abstractC5144, c1755, new C23420(this, c15406, abstractC4308));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23954(AbstractC5144 abstractC5144, C1755 c1755, AbstractC4308 abstractC4308) {
        return m23930(abstractC5144, c1755, new C23420(this, C15406.f47189, abstractC4308));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23956(C2609 c2609, C1755 c1755) {
        while (c2609.m8249()) {
            m23928((AbstractC5144) c2609.f8240, c1755);
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15406 m23940(C15406 c15406, C2609 c2609, C1755 c1755, C18837 c18837) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC12612 abstractC12612 = (AbstractC12612) it.next();
            AbstractC4308 abstractC4308M36202 = this.f28214.m36202(abstractC12612, m23930(abstractC12612, c1755, this.f28241 ? this.f28233 : this.f28228));
            if (abstractC4308M36202.m12913(EnumC9454.DEFERRED)) {
                c15406 = C15406.m36455(C15406.f47180, c15406);
            }
            c18837.m43511(abstractC4308M36202);
        }
        return c15406;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m23923(C2609 c2609, C1755 c1755) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            c18837.m43511(m23954((AbstractC5144) c2609.f8240, c1755, AbstractC4308.f13885));
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23943(C2609 c2609, C1755 c1755, boolean z) {
        C2609 c2609Of;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C14315 c14315 = (C14315) it.next();
            C8541 c8541 = (C8541) c14315.f16086;
            c8541.f13890.f17563 |= 268435456;
            C11488 c11488 = AbstractC4308.f13885;
            c8541.mo21267(c11488);
            boolean zIsEmpty = c14315.f43170.isEmpty();
            C6319 c6319 = this.f28251;
            if (!zIsEmpty) {
                C2609 c2609Of2 = C2609.of((Object) m23954((AbstractC5144) c14315.f43170.f8240, c1755, c11488));
                Iterator it2 = c14315.f43170.f8241.iterator();
                while (it2.hasNext()) {
                    c2609Of2 = c2609Of2.m8246(m23954((AbstractC12612) it2.next(), c1755, AbstractC4308.f13885));
                }
                c2609Of = c2609Of2.m8250();
                c6319.getClass();
            } else {
                c2609Of = C2609.of((Object) this.f28244.f66526);
                c6319.getClass();
            }
            c6319.m17501(c8541, c2609Of, ((AbstractC4308) c2609Of.f8240).f13890.m16070());
            c8541.f13890.f17563 &= -268435457;
        }
        if (z) {
            Iterator it3 = c2609.iterator();
            while (it3.hasNext()) {
                C14315 c14316 = (C14315) it3.next();
                c14316.getClass();
                this.f28214.m36159(c14316, (C8541) c14316.f16086);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m23921(C15658 c15658, C1755 c1755, C9378 c9378, AbstractC4308 abstractC4308) {
        C18230 c18230 = this.f28248;
        InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) c9378);
        InterfaceC18278 interfaceC18278 = c15658.f6075.f4745;
        C22364 c22364 = this.f28253;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(interfaceC18278);
        try {
            m23908(c9378, c1755);
            AbstractC4308 abstractC4308M23929 = m23929((AbstractC5144) c9378.f28487, (C1755) c15658, abstractC4308);
            if (c9378.m24209()) {
                C12048 c12048 = c9378.f28489;
                abstractC4308 = this.f28214.m36107(c9378, abstractC4308M23929, c9378.f28484);
                c12048.f17560 = abstractC4308;
                c9378.f16086 = abstractC4308;
            }
            if (abstractC4308M23929.mo12915() != null) {
                return this.f28239.m13641(abstractC4308M23929, abstractC4308).mo12915();
            }
            return null;
        } finally {
            c22364.m7284(interfaceC18278M7284);
            c18230.m42471(interfaceC3109M42471);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23936(AbstractC12612 abstractC12612, C1755 c1755, boolean z, boolean z2, boolean z3) {
        AbstractC4308 abstractC4308M23954 = abstractC12612.f16086;
        if (abstractC4308M23954 == null) {
            abstractC4308M23954 = m23954(abstractC12612, c1755, AbstractC4308.f13885);
        }
        return m23926(abstractC4308M23954, abstractC12612, z, z2, z3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23926(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144, boolean z, boolean z2, boolean z3) {
        if (abstractC5144.m14709(EnumC18550.f57521)) {
            abstractC5144 = ((C16432) abstractC5144).f50542;
            abstractC5144.getClass();
        }
        boolean zIsEmpty = abstractC4308.f13890.f17562.isEmpty();
        C6319 c6319 = this.f28251;
        C22364 c22364 = this.f28253;
        if (zIsEmpty) {
            c22364.m7273(abstractC5144, C6241.f19292);
            return c6319.m17535(abstractC4308);
        }
        if (abstractC4308.mo12948()) {
            return abstractC4308;
        }
        boolean zM12913 = abstractC4308.m12913(EnumC9454.TYPEVAR);
        C15240 c15240 = this.f28214;
        if (zM12913 && !z && !z2) {
            if (abstractC4308.mo12939() == null) {
                c22364.m7273(abstractC5144, C6241.f19199);
                return c6319.m17535(abstractC4308);
            }
        } else {
            abstractC4308 = c15240.m36108(abstractC5144, abstractC4308, z3);
        }
        if (z2 && (abstractC4308.f13890.mo16084() & 512) == 0) {
            c22364.m7273(abstractC5144, C6241.f19140);
            return c6319.m17535(abstractC4308);
        }
        if (z3 && z && (abstractC4308.f13890.mo16084() & 512) != 0) {
            c22364.m7273(abstractC5144, C6241.f19195);
            return c6319.m17535(abstractC4308);
        }
        if (z3 && (abstractC4308.f13890.mo16084() & 16) != 0) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC5144, new C12281("compiler", "cant.inherit.from.final", abstractC19810));
        }
        c15240.m36186(abstractC5144, abstractC4308);
        return abstractC4308;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4308 m23897(C1755 c1755, C7673 c7673) {
        C5557 c5557 = c1755.f6079;
        Object obj = c1755.f6073;
        C14163 c14163 = c5557.f17186;
        c14163.mo16101();
        C12171.m29642((c14163.f17563 & 16384) != 0);
        C8604 c8604 = (C8604) obj;
        c7673.f16086 = c8604.f26285.f23673.m16071().f17560;
        c7673.f23697 = c8604.f26285.f23673.m16071();
        return c7673.f16086;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C21095 c21095;
        C3644 c3644M11135;
        if (((C8604) this.f28211.f6073).f26283.f23066) {
            C5572 c5572 = this.f28227;
            c5572.getClass();
            c21095 = new C21095(c5572);
        } else {
            c21095 = null;
        }
        C16646 c16646OfNullable = C16646.ofNullable(c21095);
        try {
            boolean zM4391 = ((C8604) this.f28211.f6073).f26285.f23673.f17559.m4391(C15406.f47185);
            C13809 c13809 = this.f28219;
            if (zM4391) {
                c13809.m33125(c5557, this.f28211);
            } else if (this.f28211.f6074.m14709(EnumC18550.f57548) && (c3644M11135 = C3644.m11135(this.f28211.f6075, c5557)) != null) {
                Iterator it = c3644M11135.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC13206) it.next()).mo987() == EnumC3329.ANNOTATION) {
                        c13809.m33125(c5557, this.f28211);
                        break;
                    }
                }
            }
            C14163 c14163 = c5557.f17186;
            if (c14163 == null) {
                this.f28223 = null;
            } else {
                c14163.mo16101();
                C1755 c1755 = this.f28211;
                if (((C8604) c1755.f6073).f26299 && c1755.f6074.m14709(EnumC18550.f57548)) {
                    c14163.f17563 |= 4194304;
                }
                try {
                    this.f28250.m32413();
                    m23948(c14163);
                } catch (C20515 e) {
                    this.f28214.m36110(c5557, e);
                }
                AbstractC4308 abstractC4308 = c14163.f17560;
                c5557.f16086 = abstractC4308;
                this.f28223 = abstractC4308;
            }
            c16646OfNullable.ifPresent(new C3455());
        } catch (Throwable th) {
            c16646OfNullable.ifPresent(new C3455());
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03c0  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(final C8526 c8526) throws Throwable {
        C4824 c4824;
        C3581 c3581;
        C4824 c4825;
        C3581 c3582;
        C1755 c1755;
        C20661 c20661;
        C12281 c12281M17187;
        C9378 c9378;
        C13395 c13395 = this.f28250;
        C16672 c16672 = this.f28234;
        C17013 c17013 = this.f28249;
        C3581 c3583 = c8526.f26045;
        AbstractC10370 abstractC10370 = c8526.f26044;
        boolean z = (c3583.f17563 & 8796093022208L) != 0;
        C4824 c4824M14053 = ((C8604) this.f28211.f6073).f26289.m14053(c3583);
        C15240 c15240 = this.f28214;
        C4824 c4824M36112 = c15240.m36112(c4824M14053);
        C3581 c3581M36103 = c15240.m36103(c3583);
        try {
            this.f28248.m42472((AbstractC5144) c8526);
            c15240.m36144(c3583, c8526);
            C1755 c1755M39195 = c16672.m39195(c8526, this.f28211);
            Object obj = c1755M39195.f6073;
            ((C8604) obj).f26289 = c4824M14053;
            m23956(c8526.f26047, c1755M39195);
            if (c3583.mo15572()) {
                c15240.m36150(c8526, this.f28211.f6079.f16086, c3583);
            } else {
                c15240.m36181(c8526, this.f28211.f6079.f16086, c3583);
            }
            c15240.m36120(this.f28211, c8526, c3583);
            C6319 c6319 = this.f28251;
            C22364 c22364 = this.f28253;
            if (z) {
                c3582 = c3581M36103;
                try {
                    if (c6319.m17508(c3583.m16071(), c3583)) {
                        AbstractC10370 abstractC10371 = c3583.f17562;
                        EnumC8352 enumC8352M49076 = C21758.m49076(c3583.m16072());
                        AbstractC5698 abstractC5698M16072 = c3583.m16072();
                        C12281 c12281 = C6241.f19132;
                        c4825 = c4824M36112;
                        try {
                            c22364.m7273(c8526, new C12281("compiler", "default.overrides.object.member", abstractC10371, enumC8352M49076, abstractC5698M16072));
                        } catch (Throwable th) {
                            th = th;
                            c3581 = c3582;
                            c4824 = c4825;
                            c15240.m36112(c4824);
                            c15240.m36103(c3581);
                            throw th;
                        }
                    } else {
                        c4825 = c4824M36112;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c4825 = c4824M36112;
                    c3581 = c3582;
                    c4824 = c4825;
                    c15240.m36112(c4824);
                    c15240.m36103(c3581);
                    throw th;
                }
            } else {
                c4825 = c4824M36112;
                c3582 = c3581M36103;
            }
            for (C2609 c2609 = c8526.f26047; c2609.m8249(); c2609 = c2609.f8241) {
                ((C8604) obj).f26285.mo26379(((C14315) c2609.f8240).f16086.f13890);
            }
            C14163 c14163 = this.f28211.f6079.f17186;
            c14163.mo16101();
            if ((c14163.f17563 & 8192) != 0 && (c8526.f26048.m8249() || c8526.f26052 != null)) {
                if (c8526.f26048.m8249()) {
                    c9378 = (C9378) c8526.f26048.f8240;
                    c9378.getClass();
                } else {
                    c9378 = c8526.f26052;
                    c9378.getClass();
                }
                c22364.m7273(c9378, C6241.f19188);
            }
            for (C2609 c26010 = c8526.f26048; c26010.m8249(); c26010 = c26010.f8241) {
                m23928((AbstractC5144) c26010.f8240, c1755M39195);
            }
            c15240.m36147(c8526);
            c15240.m36122(c8526.f26047, c1755M39195);
            AbstractC12612 abstractC12612 = c8526.f26051;
            if (abstractC12612 != null && !abstractC12612.f16086.m12913(EnumC9454.VOID)) {
                c15240.m36137((AbstractC5144) c8526.f26051, c1755M39195, true);
            }
            if (c8526.f26052 != null) {
                C1755 c1755M39196 = c16672.m39195(c8526, this.f28211);
                m23954(c8526.f26052, c1755M39196, AbstractC4308.f13885);
                c15240.m36137((AbstractC5144) c8526.f26052, c1755M39196, true);
            }
            boolean zM33810 = this.f28211.f6079.f17186.m33810();
            C6136 c6136 = this.f28229;
            if (zM33810 && c8526.f26045.f17561.f17559 == EnumC1296.f4582) {
                C16646 c16646FindFirst = C5378.stream(this.f28211.f6079.f17186.m33811()).filter(new Predicate() { // from class: l.᩹᩶֨
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
                    public final boolean test(Object obj2) {
                        C3581 c3584 = ((C21221) obj2).f68391;
                        return c3584 == c8526.f26045 && (c3584.f17563 & 16777216) == 0;
                    }
                }).findFirst();
                if (c16646FindFirst.isPresent()) {
                    if (!c8526.f26045.m16099()) {
                        c22364.m7273(c8526, C6241.m17194(this.f28211.f6079.f17186, C11886.f35478));
                    }
                    if (!c6319.m17550(c8526.f26045.f17560.mo12923(), ((C21221) c16646FindFirst.get()).f17560)) {
                        c22364.m7273(c8526, C6241.m17194(this.f28211.f6079.f17186, C11886.m29012(c8526.f26045, (AbstractC5698) c16646FindFirst.get())));
                    }
                    if (c8526.f26045.f17560.mo12945().f32061 != null && !c8526.f26045.f17560.mo12945().f32061.isEmpty()) {
                        c22364.m7273(c8526, C6241.m17194(this.f28211.f6079.f17186, C11886.f35440));
                    }
                    if (!c8526.f26047.isEmpty()) {
                        c22364.m7273(c8526, C6241.m17194(this.f28211.f6079.f17186, C11886.f35470));
                    }
                    if (c8526.f26045.mo15572()) {
                        c22364.m7273(c8526, C6241.m17194(this.f28211.f6079.f17186, C11886.f35488));
                    }
                }
                AbstractC10370 abstractC10372 = c6136.f18879;
                AbstractC10370 abstractC10373 = c6136.f18886;
                if (abstractC10370 == abstractC10372) {
                    c1755 = c1755M39195;
                    long j = c8526.f26045.f17563;
                    if ((j & 2305843009213693952L) == 0) {
                        C15580 c15580M19466 = C7260.m19466(c8526);
                        if (c15580M19466 == null || C7260.m19462(c15580M19466.f48011) != abstractC10373 || !m23952(c15580M19466, c8526, false)) {
                            c22364.m7273(c8526, C6241.m17193(this.f28211.f6079.f17186));
                        }
                    } else {
                        if ((j & 68719476736L) == 0) {
                            if (C15240.m36050(c3583.f17563) > C15240.m36050(this.f28211.f6079.f17186.mo16084())) {
                                if ((this.f28211.f6079.f17186.mo16084() & 7) == 0) {
                                    c12281M17187 = C6241.m17187(C11886.f35481, this.f28211.f6079.f17186.f17562, C11886.m29009());
                                } else {
                                    C11576 c11576 = C11886.f35481;
                                    C14163 c14164 = this.f28211.f6079.f17186;
                                    c12281M17187 = C6241.m17187(c11576, c14164.f17562, new C11576("compiler", "canonical.must.not.have.stronger.access", C19642.m45150(c14164.mo16084() & 7)));
                                }
                                c22364.m7273(c8526, c12281M17187);
                            } else {
                                abstractC10370 = abstractC10370;
                                z = z;
                                obj = obj;
                            }
                            C15580 c15580M19467 = C7260.m19466(c8526);
                            if (c15580M19467 != null && ((C7260.m19462(c15580M19467.f48011) == abstractC10373 || C7260.m19462(c15580M19467.f48011) == c6136.f18898) && m23952(c15580M19467, c8526, false))) {
                                c22364.m7273(c8526, C6241.m17187(C11886.f35481, this.f28211.f6079.f17186.f17562, C11886.f35455));
                            }
                        } else {
                            abstractC10370 = abstractC10370;
                            z = z;
                            obj = obj;
                        }
                        if (!c8526.f26047.isEmpty()) {
                            c22364.m7273(c8526, C6241.m17187(C11886.f35481, this.f28211.f6079.f17186.f17562, C11886.f35503));
                        }
                        C2609 c2609M33811 = this.f28211.f6079.f17186.m33811();
                        C2609 c2609M8243 = C7260.m19436(this.f28211.f6079).m8243((Function) new C16599(6));
                        for (C9378 c9379 : c8526.f26048) {
                            boolean z2 = (c9379.f28489.f17563 & 17179869184L) != 0;
                            if (!c6319.m17550(c9379.f16086, (AbstractC4308) c2609M8243.f8240) || ((C21221) c2609M33811.f8240).m48175() != z2) {
                                c22364.m7273(c9379, C6241.m17187(C11886.f35481, this.f28211.f6079.f17186.f17562, C11886.f35442));
                            }
                            c2609M33811 = c2609M33811.f8241;
                            c2609M8243 = c2609M8243.f8241;
                        }
                    }
                } else {
                    c1755 = c1755M39195;
                }
                obj = obj;
            } else {
                c1755 = c1755M39195;
                obj = obj;
            }
            if ((c14163.mo16084() & 8192) != 0) {
                if (c8526.f26042.m8249()) {
                    AbstractC12612 abstractC12613 = (AbstractC12612) c8526.f26042.f8240;
                    abstractC12613.getClass();
                    c22364.m7273(abstractC12613, C6241.f19148);
                }
                if (c8526.f26047.m8249()) {
                    C14315 c14315 = (C14315) c8526.f26047.f8240;
                    c14315.getClass();
                    c22364.m7273(c14315, C6241.f19242);
                }
                c15240.m36179(c8526.f26051);
                c15240.m36148(c8526, c3583);
            }
            C2609 c26011 = c8526.f26042;
            while (true) {
                boolean zM8249 = c26011.m8249();
                c20661 = this.f28244;
                if (!zM8249) {
                    break;
                }
                AbstractC12612 abstractC12614 = (AbstractC12612) c26011.f8240;
                abstractC12614.getClass();
                c15240.m36106(abstractC12614, ((AbstractC12612) c26011.f8240).f16086, c20661.f66479, c15240.f46781);
                c26011 = c26011.f8241;
            }
            if (c8526.f26043 == null) {
                if (c8526.f26049 != null && (c14163.mo16084() & 8192) == 0) {
                    c22364.m7273(c8526, C6241.f19165);
                }
                if (z || (c8526.f26045.mo16084() & 1280) == 0) {
                    c22364.m7273(c8526, C6241.f19135);
                }
            } else {
                if ((c8526.f26045.mo16084() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                    if ((c14163.mo16084() & 512) != 0) {
                        C2735 c2735 = c8526.f26043;
                        c2735.getClass();
                        c22364.m7273(c2735, C6241.f19151);
                    } else {
                        c22364.m7273(c8526, C6241.f19132);
                    }
                } else if ((c8526.f26046.f7169 & 256) != 0) {
                    c22364.m7273(c8526, C6241.f19305);
                }
                if (abstractC10370 == c6136.f18879 && c14163.f17560 != c20661.f66526) {
                    C2735 c2736 = c8526.f26043;
                    if (c2736.f8521.isEmpty() || C7260.m19440(c2736.f8521, c6136) == c6136.f18867) {
                        c17013.m39945(c2736.f16085);
                        c2736.f8521 = c2736.f8521.m8246(c17013.m39953(c17013.m39929(c17013.m39951(c6136.f18898), C2609.m8239(), c17013.m39961(C2609.m8239()))));
                    } else if ((this.f28211.f6079.f17186.mo16084() & 16384) != 0 && (c8526.f26046.f7169 & 68719476736L) == 0 && C7260.m19451((AbstractC5144) c2736.f8521.f8240)) {
                        AbstractC11349 abstractC11349 = (AbstractC11349) c8526.f26043.f8521.f8240;
                        abstractC11349.getClass();
                        c22364.m7273(abstractC11349, C6241.m17183(this.f28211.f6079.f17186));
                    }
                    if (this.f28211.f6079.f17186.m33810() && (c8526.f26045.f17563 & 2305843009213693952L) != 0) {
                        if (!c8526.f26045.f11367.m8243((Function) new C6639(5)).equals(C7260.m19436(this.f28211.f6079).m8243((Function) new C21673(4)))) {
                            c22364.m7273(c8526, C6241.m17187(C11886.f35481, this.f28211.f6079.f17186.f17562, C11886.f35465));
                        }
                        if (c8526.f26045.f17560.mo12945().f32061 != null && !c8526.f26045.f17560.mo12945().f32061.isEmpty()) {
                            c22364.m7273(c8526, C6241.m17187(C7260.m19454(c8526) ? C11886.f35486 : C11886.f35481, this.f28211.f6079.f17186.f17562, new C11576("compiler", "throws.clause.not.allowed.for.canonical.constructor", C7260.m19454(c8526) ? C11886.f35486 : C11886.f35481)));
                        }
                    }
                }
                C1755 c1756 = c1755;
                c13395.m32408(c8526.f26043, c1756, c3583, (InterfaceC3109) null);
                c13395.m32413();
                m23928(c8526.f26043, c1756);
            }
            ((C8604) obj).f26285.mo26377();
            AbstractC4308 abstractC4308 = c3583.f17560;
            c8526.f16086 = abstractC4308;
            this.f28223 = abstractC4308;
            c15240.m36112(c4825);
            c15240.m36103(c3582);
        } catch (Throwable th3) {
            th = th3;
            c4824 = c4824M36112;
            c3581 = c3581M36103;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C4824 c4824;
        boolean z;
        boolean z2;
        AbstractC12612 abstractC12612;
        C11029 c11029;
        AbstractC10370 abstractC10370 = c9378.f28484;
        C13395 c13395 = this.f28250;
        C1755 c1755 = this.f28211;
        AbstractC14016 abstractC14016 = ((C8604) c1755.f6073).f26285;
        EnumC1296 enumC1296 = abstractC14016.f23673.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4571;
        C16672 c16672 = this.f28234;
        C22364 c22364 = this.f28253;
        if (enumC1296 == enumC1297 || enumC1296 == EnumC1296.f4567) {
            C12048 c12048 = c9378.f28489;
            if (c12048 != null) {
                abstractC14016.mo26382(c12048);
            } else {
                if (c9378.m24209() && (c9378.f28486.f7169 & 8589934592L) == 0) {
                    AbstractC12612 abstractC12613 = c9378.f28487;
                    C17013 c17013 = this.f28249;
                    if (abstractC12613 == null) {
                        c22364.m7273(c9378, C6241.m17185(abstractC10370, C11886.f35461));
                        c9378.f28488 = c17013.m39948();
                    } else {
                        C10721 c10721 = new C10721();
                        c10721.f32305 = null;
                        c10721.f32306 = true;
                        c10721.mo10758(abstractC12613);
                        C11576 c11576 = c10721.f32305;
                        if (c11576 != null) {
                            c22364.m7273(c9378, C6241.m17185(abstractC10370, c11576));
                            c9378.f28488 = c17013.m39948();
                        }
                    }
                }
                try {
                    c13395.m32410();
                    c16672.m39197((AbstractC5144) c9378, this.f28211);
                    c13395.m32414();
                } catch (Throwable th) {
                    c13395.m32414();
                    throw th;
                }
            }
        } else {
            m23908(c9378, c1755);
        }
        C12048 c12049 = c9378.f28489;
        C4824 c4824M14053 = ((C8604) this.f28211.f6073).f26289.m14053(c12049);
        C15240 c15240 = this.f28214;
        C4824 c4824M36112 = c15240.m36112(c4824M14053);
        try {
            if (this.f28211.f6074.m14709(EnumC18550.f57523) && ((C14169) this.f28211.f6074).f42773 == EnumC16992.IMPLICIT) {
                c4824 = c4824M36112;
                z = (c9378.f28489.f17563 & 8589934592L) != 0;
                AbstractC12612 abstractC12614 = c9378.f28488;
                C1755 c1756 = this.f28211;
                if (!z || c9378.m24209()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c15240.m36137(abstractC12614, c1756, z2);
                c12049.m29425();
                this.f28248.m42472((AbstractC5144) c9378);
                c15240.m36144(c12049, c9378);
                abstractC12612 = c9378.f28487;
                if (abstractC12612 != null) {
                    if ((c12049.f17563 & 16) != 0) {
                        c16672.getClass();
                        c11029 = new C11029();
                        abstractC12612.mo988(c11029);
                        if (!c11029.f33159) {
                            C1755 c1757 = this.f28211;
                            c16672.getClass();
                            C15658 c15658M39194 = C16672.m39194(c9378, c1757);
                            Object obj = c15658M39194.f6073;
                            ((C8604) obj).f26289 = c4824M14053;
                            ((C8604) obj).f26293 = c12049;
                            m23929((AbstractC5144) c9378.f28487, (C1755) c15658M39194, c12049.f17560);
                            if (c9378.m24209()) {
                                c12049.f17560 = c15240.m36107(c9378, c9378.f28487.f16086, abstractC10370);
                            }
                        }
                    } else {
                        C1755 c1758 = this.f28211;
                        c16672.getClass();
                        C15658 c15658M39195 = C16672.m39194(c9378, c1758);
                        Object obj2 = c15658M39195.f6073;
                        ((C8604) obj2).f26289 = c4824M14053;
                        ((C8604) obj2).f26293 = c12049;
                        m23929((AbstractC5144) c9378.f28487, (C1755) c15658M39195, c12049.f17560);
                        if (c9378.m24209()) {
                            c12049.f17560 = c15240.m36107(c9378, c9378.f28487.f16086, abstractC10370);
                        }
                    }
                    if (c9378.m24209()) {
                        m23909(c9378, c12049.f17560);
                    }
                }
                AbstractC4308 abstractC4308 = c12049.f17560;
                c9378.f16086 = abstractC4308;
                this.f28223 = abstractC4308;
                if (this.f28211.f6079.f17186.m33810() && c9378.f28489.f17561.f17559 == EnumC1296.f4582 && !c12049.mo15572() && m23917(c12049.f17562)) {
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c9378, new C12281("compiler", "illegal.record.component.name", c12049));
                }
                return;
            }
            c4824 = c4824M36112;
            c12049.m29425();
            this.f28248.m42472((AbstractC5144) c9378);
            c15240.m36144(c12049, c9378);
            abstractC12612 = c9378.f28487;
            if (abstractC12612 != null) {
                if ((c12049.f17563 & 16) != 0) {
                    c16672.getClass();
                    c11029 = new C11029();
                    abstractC12612.mo988(c11029);
                    if (!c11029.f33159) {
                        C1755 c1759 = this.f28211;
                        c16672.getClass();
                        C15658 c15658M39196 = C16672.m39194(c9378, c1759);
                        Object obj3 = c15658M39196.f6073;
                        ((C8604) obj3).f26289 = c4824M14053;
                        ((C8604) obj3).f26293 = c12049;
                        m23929((AbstractC5144) c9378.f28487, (C1755) c15658M39196, c12049.f17560);
                        if (c9378.m24209()) {
                            c12049.f17560 = c15240.m36107(c9378, c9378.f28487.f16086, abstractC10370);
                        }
                    }
                } else {
                    C1755 c17510 = this.f28211;
                    c16672.getClass();
                    C15658 c15658M39197 = C16672.m39194(c9378, c17510);
                    Object obj4 = c15658M39197.f6073;
                    ((C8604) obj4).f26289 = c4824M14053;
                    ((C8604) obj4).f26293 = c12049;
                    m23929((AbstractC5144) c9378.f28487, (C1755) c15658M39197, c12049.f17560);
                    if (c9378.m24209()) {
                        c12049.f17560 = c15240.m36107(c9378, c9378.f28487.f16086, abstractC10370);
                    }
                }
                if (c9378.m24209()) {
                    m23909(c9378, c12049.f17560);
                }
            }
            AbstractC4308 abstractC4309 = c12049.f17560;
            c9378.f16086 = abstractC4309;
            this.f28223 = abstractC4309;
            if (this.f28211.f6079.f17186.m33810()) {
                C12281 c12282 = C6241.f19132;
                c22364.m7273(c9378, new C12281("compiler", "illegal.record.component.name", c12049));
            }
            return;
        } finally {
            c15240.m36112(c4824);
        }
        AbstractC12612 abstractC12615 = c9378.f28488;
        C1755 c17511 = this.f28211;
        if (z) {
            z2 = false;
        } else {
            z2 = false;
        }
        c15240.m36137(abstractC12615, c17511, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23908(C9378 c9378, C1755 c1755) {
        EnumC1296 enumC1296;
        AbstractC12612 abstractC12612 = c9378.f28487;
        if (abstractC12612 != null) {
            C2176 c2176 = c9378.f28486;
            long j = c2176.f7169;
            if ((j & 9007199254740992L) != 0 || (enumC1296 = ((C8604) c1755.f6073).f26285.f23673.f17559) == EnumC1296.f4571 || enumC1296 == EnumC1296.f4567) {
                return;
            }
            c2176.f7169 = j | 9007199254740992L;
            C12048 c12048 = c9378.f28489;
            C13395 c13395 = this.f28250;
            c13395.m32408(abstractC12612, c1755, c12048, c9378);
            c13395.m32413();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23917(AbstractC10370 abstractC10370) {
        AbstractC14016 abstractC14016Mo16064 = this.f28244.f66526.f13890.mo16064();
        C20574 c20574 = new C20574(1);
        abstractC14016Mo16064.getClass();
        Iterator it = abstractC14016Mo16064.mo20477(abstractC10370, c20574, EnumC1317.RECURSIVE).iterator();
        while (it.hasNext()) {
            if (((AbstractC5698) it.next()).f17560.mo12933().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1380(C5704 c5704) {
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        AbstractC5698 abstractC5698 = abstractC14016.f23673;
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4582 || enumC1296 == EnumC1296.f4581) {
            long j = c2735.f8522;
            C3581 c3581 = new C3581(1048576 | j | (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX), this.f28229.f18867, null, ((C8604) this.f28211.f6073).f26285.f23673);
            C1755 c1756 = this.f28211;
            C8604 c8605 = (C8604) c1756.f6073;
            C1755 c1755M5877 = c1756.m5877(c2735, c8605.m22358(c8605.f26285.mo26383(c3581)));
            Object obj = c1755M5877.f6073;
            long j2 = j & 8;
            if (j2 != 0) {
                ((C8604) obj).f26297++;
            }
            C8604 c8606 = (C8604) obj;
            AbstractC5698 abstractC5699 = c8606.f26285.f23673;
            C13395 c13395 = this.f28250;
            c13395.m32408(c2735, c1755M5877, abstractC5699, (InterfaceC3109) null);
            c13395.m32413();
            m23956(c2735.f8521, c1755M5877);
            C14163 c14163 = (C14163) ((C8604) this.f28211.f6073).f26285.f23673;
            C2609 c2609Mo16081 = c8606.f26285.f23673.mo16081();
            if (j2 != 0) {
                c14163.m16079(c2609Mo16081);
            } else {
                c14163.m16092(c2609Mo16081);
            }
        } else {
            C1755 c1755M5878 = c1755.m5877(c2735, c8604.m22358(abstractC14016.mo26380(abstractC5698)));
            Object obj2 = c1755M5878.f6073;
            try {
                m23956(c2735.f8521, c1755M5878);
                ((C8604) obj2).f26285.mo26377();
            } catch (Throwable th) {
                ((C8604) obj2).f26285.mo26377();
                throw th;
            }
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        AbstractC11349 abstractC11349 = c20374.f65770;
        C1755 c1755 = this.f28211;
        m23928(abstractC11349, c1755.m5877(c20374, c1755.f6073));
        m23929((AbstractC5144) c20374.f65771, this.f28211, (AbstractC4308) this.f28244.f66469);
        AbstractC11349 abstractC113410 = c20374.f65770;
        m23959(abstractC113410);
        if (!this.f28224.m25667(this.f28211, abstractC113410, this.f28249)) {
            C7772 c7772 = this.f28218;
            C2609 c2609 = c7772.f24022;
            AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
            C11003.requireNonNull(abstractC14016);
            C19846.forEach(c2609, new C3706(abstractC14016));
            C19846.forEach(c7772.f24022, new C18523());
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        m23929((AbstractC5144) c8672.f26445, this.f28211, (AbstractC4308) this.f28244.f66469);
        C7772 c7772 = this.f28218;
        C1755 c1755 = this.f28211;
        C2609 c2609 = c7772.f24023;
        C2609 c26010 = c7772.f24022;
        C1755 c1755M23896 = m23896(c1755, c1755.f6074, c2609);
        Object obj = c1755M23896.f6073;
        try {
            m23928(c8672.f26444, c1755M23896.m5877(c8672, obj));
            ((C8604) obj).f26285.mo26377();
            AbstractC11349 abstractC11349 = c8672.f26444;
            m23959(abstractC11349);
            if (!this.f28224.m25667(this.f28211, abstractC11349, this.f28249)) {
                AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
                C11003.requireNonNull(abstractC14016);
                C19846.forEach(c26010, new C3706(abstractC14016));
                C19846.forEach(c26010, new C18523());
            }
            this.f28223 = null;
        } catch (Throwable th) {
            ((C8604) obj).f26285.mo26377();
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C1755 c1755 = this.f28211;
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 c1755M5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj = c1755M5877.f6073;
        C7772 c7772 = C1856.f6336;
        try {
            m23956(c11907.f35587, c1755M5877);
            AbstractC12612 abstractC12612 = c11907.f35588;
            if (abstractC12612 != null) {
                m23929((AbstractC5144) abstractC12612, c1755M5877, (AbstractC4308) this.f28244.f66469);
                c7772 = this.f28218;
            }
            C2609 c2609 = c7772.f24023;
            C2609 c26010 = c7772.f24022;
            C1755 c1755M23896 = m23896(c1755M5877, c1755M5877.f6074, c2609);
            try {
                c1755M23896.f6074 = c11907;
                m23956(c11907.f35586, c1755M23896);
                m23928(c11907.f35585, c1755M23896);
                ((C8604) c1755M23896.f6073).f26285.mo26377();
                this.f28223 = null;
                ((C8604) obj).f26285.mo26377();
                AbstractC11349 abstractC11349 = c11907.f35585;
                m23959(abstractC11349);
                if (this.f28224.m25667(this.f28211, abstractC11349, this.f28249)) {
                    return;
                }
                AbstractC14016 abstractC14017 = ((C8604) this.f28211.f6073).f26285;
                C11003.requireNonNull(abstractC14017);
                C19846.forEach(c26010, new C3706(abstractC14017));
                C19846.forEach(c26010, new C18523());
            } catch (Throwable th) {
                ((C8604) c1755M23896.f6073).f26285.mo26377();
                throw th;
            }
        } catch (Throwable th2) {
            ((C8604) obj).f26285.mo26377();
            throw th2;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        AbstractC4308 abstractC4308M17511;
        C20661 c20661 = this.f28244;
        C15240 c15240 = this.f28214;
        C6319 c6319 = this.f28251;
        C1755 c1755 = this.f28211;
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 c1755M5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj = c1755M5877.f6073;
        try {
            AbstractC4308 abstractC4308M23930 = m23930(c4851.f15326, c1755M5877, this.f28228);
            c6319.getClass();
            AbstractC4308 abstractC4308M17473 = C6319.m17473(abstractC4308M23930);
            c15240.m36202(c4851, abstractC4308M17473);
            AbstractC4308 abstractC4308M17515 = c6319.m17515(abstractC4308M17473);
            if (abstractC4308M17515 == null) {
                AbstractC4308 abstractC4308M17527 = c6319.m17527(c20661.f66506.f13890, abstractC4308M17473);
                C22364 c22364 = this.f28253;
                if (abstractC4308M17527 == null) {
                    AbstractC12612 abstractC12612 = c4851.f15326;
                    abstractC12612.getClass();
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(abstractC12612, new C12281("compiler", "foreach.not.applicable.to.type", abstractC4308M17473, C11886.f35472));
                    abstractC4308M17515 = c6319.m17535(abstractC4308M17473);
                } else {
                    C2609 c2609Mo12934 = abstractC4308M17527.mo12934();
                    if (c2609Mo12934.isEmpty()) {
                        abstractC4308M17511 = c20661.f66526;
                    } else {
                        abstractC4308M17511 = c6319.m17511((AbstractC4308) c2609Mo12934.f8240);
                    }
                    AbstractC4308 abstractC4308 = abstractC4308M17511;
                    if (c6319.m17527(c20661.f66512.f13890, this.f28231.m50300(c4851, c1755M5877, c6319.m17526(abstractC4308M17473, false), this.f28229.f18883, C2609.m8239(), C2609.m8239()).f17560.mo12923()) == null) {
                        C12281 c12282 = C6241.f19132;
                        c22364.m7273(c4851, new C12281("compiler", "foreach.not.applicable.to.type", abstractC4308M17473, C11886.f35472));
                    }
                    abstractC4308M17515 = abstractC4308;
                }
            }
            if (c4851.f15325.m24209()) {
                C9378 c9378 = c4851.f15325;
                m23909(c4851.f15325, c15240.m36107(c9378, abstractC4308M17515, c9378.f28484));
            }
            m23928((AbstractC5144) c4851.f15325, c1755M5877);
            AbstractC12612 abstractC12613 = c4851.f15326;
            abstractC12613.getClass();
            c15240.m36106(abstractC12613, abstractC4308M17515, c4851.f15325.f28489.f17560, c15240.f46781);
            c1755M5877.f6074 = c4851;
            m23928(c4851.f15324, c1755M5877);
            this.f28223 = null;
        } finally {
            ((C8604) obj).f26285.mo26377();
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        for (C1755 c1755 = this.f28211; c1755 != null && !c1755.f6074.m14709(EnumC18550.f57582); c1755 = c1755.f6072) {
            if (c1755.f6074.m14709(EnumC18550.f57532)) {
                AbstractC10370 abstractC10370 = ((C17698) c1755.f6074).f54160;
                AbstractC10370 abstractC10371 = c17698.f54160;
                if (abstractC10370 == abstractC10371) {
                    C12281 c12281 = C6241.f19132;
                    this.f28253.m7273(c17698, new C12281("compiler", "label.already.in.use", abstractC10371));
                    break;
                }
            }
        }
        AbstractC11349 abstractC11349 = c17698.f54159;
        C1755 c1756 = this.f28211;
        m23928(abstractC11349, c1756.m5877(c17698, c1756.f6073));
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) throws Throwable {
        m23903(c22637, c22637.f73103, c22637.f73102, new BiConsumer() { // from class: l.ܿۙ֨
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C9310 c9310 = this.f52443;
                c9310.getClass();
                c9310.m23956(((C18963) obj).f59814, (C1755) obj2);
            }
        });
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        c4146.f13546 = m23898(c4146, EnumC18550.f57556, c4146.f13545, this.f28211);
        this.f28223 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23903(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609, BiConsumer biConsumer) throws Throwable {
        Object obj;
        boolean zAnyMatch;
        boolean z;
        C15240 c15240;
        C23420 c23420;
        C7254 c7254;
        boolean z2;
        C23168 c23168;
        C18963 c18963;
        C6319 c6319;
        C15240 c15241;
        HashSet hashSet;
        C22406 c22406 = this.f28231;
        C20661 c20661 = this.f28244;
        C6319 c63110 = this.f28251;
        C1755 c1755 = this.f28211;
        C23420 c23421 = this.f28228;
        AbstractC4308 abstractC4308M23930 = m23930(abstractC12612, c1755, c23421);
        C1755 c1756 = this.f28211;
        C8604 c8604 = (C8604) c1756.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 c1755M5877 = c1756.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj2 = c1755M5877.f6073;
        try {
            boolean z3 = (abstractC4308M23930.f13890.mo16084() & 16384) != 0;
            AbstractC4308 abstractC4308 = c20661.f66533;
            C7254 c7255 = c20661.f66452;
            boolean zM17550 = c63110.m17550(abstractC4308M23930, abstractC4308);
            C1386 c1386 = c63110.f19598;
            boolean zM19448 = C7260.m19448(abstractC12612, c2609);
            C23168 c23169 = this.f28232;
            if (!z3 && !zM17550 && !zM19448 && !c63110.m17531(abstractC4308M23930, c7255, c1386)) {
                c23169.m51346(abstractC12612, EnumC10637.f31989);
                zAnyMatch = true;
            } else {
                zAnyMatch = C5378.stream(c2609).flatMap(new C6416(8)).anyMatch(new C23461(0));
            }
            HashSet hashSet2 = new HashSet();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            C2609 c26010 = c2609;
            C2609 c2609M8239 = C2609.m8239();
            EnumC6652 enumC6652 = null;
            C7772 c7772 = null;
            while (true) {
                boolean zM8249 = c26010.m8249();
                z = zAnyMatch;
                c15240 = this.f28214;
                if (!zM8249) {
                    break;
                }
                obj = obj2;
                C2609 c26011 = c26010;
                C15240 c15242 = c15240;
                try {
                    C18963 c18964 = (C18963) c26011.f8240;
                    C22364 c22364 = this.f28253;
                    if (enumC6652 == null) {
                        enumC6652 = c18964.f59817;
                        c23420 = c23421;
                    } else {
                        c23420 = c23421;
                        if (enumC6652 != c18964.f59817 && !z7) {
                            c22364.m7273(c18964, C6241.f19280);
                            z7 = true;
                        }
                    }
                    Iterator it = c18964.f59815.iterator();
                    C7772 c7772M6169 = c7772;
                    EnumC6652 enumC6653 = enumC6652;
                    C2609 c2609M8246 = c2609M8239;
                    boolean z8 = z6;
                    boolean z9 = z5;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        AbstractC19669 abstractC19669 = (AbstractC19669) it.next();
                        if (abstractC19669.mo30871()) {
                            c18963 = c18964;
                            AbstractC12612 abstractC12613 = (AbstractC12612) abstractC19669;
                            if (C7260.m19429(abstractC12613)) {
                                c7254 = c7255;
                                c23169.m51346(abstractC12613, EnumC10637.f31995);
                                if (z8) {
                                    c22364.m7273(abstractC19669, C6241.f19297);
                                } else if (z5) {
                                    c22364.m7273(abstractC19669, C6241.f19158);
                                }
                                m23929((AbstractC5144) abstractC12613, c1755M5877, abstractC4308M23930);
                                C7772 c7773 = this.f28218;
                                c23168 = c23169;
                                this.f28218 = new C7772(c7773.f24023, c7773.f24022, true);
                                c22406 = c22406;
                                c6319 = c63110;
                                z8 = true;
                            } else {
                                c7254 = c7255;
                                C6319 c63111 = c63110;
                                c23168 = c23169;
                                if (z3) {
                                    AbstractC5698 abstractC5698M23899 = m23899(abstractC4308M23930, abstractC12613);
                                    if (abstractC5698M23899 == null) {
                                        c22364.m7273(abstractC12613, C6241.f19282);
                                    } else if (!hashSet2.add(abstractC5698M23899)) {
                                        c22364.m7273(abstractC19669, C6241.f19297);
                                    } else {
                                        m23913(abstractC19669, c2609M8246, abstractC5698M23899.f17560);
                                    }
                                } else if (zM19448) {
                                    InterfaceC0369 interfaceC0369 = c22406.f72609;
                                    try {
                                        c22406.f72609 = c22406.f72576;
                                        m23929((AbstractC5144) abstractC19669, c1755M5877, abstractC4308M23930);
                                        c22406.f72609 = interfaceC0369;
                                    } catch (Throwable th) {
                                        c22406.f72609 = interfaceC0369;
                                        throw th;
                                    }
                                } else {
                                    C15406 c15406 = C15406.f47178;
                                    EnumC9454 enumC9454 = EnumC9454.ERROR;
                                    AbstractC4308 abstractC4308M23931 = m23930(abstractC12613, c1755M5877, new C23420(this, c15406, !abstractC4308M23930.m12913(enumC9454) ? abstractC4308M23930 : AbstractC4308.f13885));
                                    if (!abstractC4308M23931.m12913(enumC9454)) {
                                        if (abstractC4308M23931.mo12915() == null) {
                                            AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC12613);
                                            if (abstractC5698M19472 != null && abstractC5698M19472.f17559 == EnumC1296.f4582 && this.f28230) {
                                                c22364.m7273(abstractC12613, C6241.f19147);
                                            } else {
                                                c22364.m7273(abstractC12613, zM17550 ? C6241.f19131 : C6241.f19219);
                                            }
                                        } else {
                                            if (zM17550) {
                                                c6319 = c63111;
                                            } else {
                                                c6319 = c63111;
                                                if (c6319.m17531(abstractC4308M23930, c7254, c1386)) {
                                                    c7254 = c7254;
                                                } else {
                                                    C12281 c12281 = C6241.f19132;
                                                    c7254 = c7254;
                                                    z2 = z3;
                                                    c22364.m7273(abstractC19669, new C12281("compiler", "constant.label.not.compatible", abstractC4308M23931, abstractC4308M23930));
                                                    c18963 = c18963;
                                                }
                                            }
                                            z2 = z3;
                                            if (!hashSet2.add(abstractC4308M23931.mo12915())) {
                                                c18963 = c18963;
                                                c22364.m7273(c18963, C6241.f19297);
                                            } else {
                                                c18963 = c18963;
                                                if (abstractC4308M23931.mo12941()) {
                                                    abstractC4308M23931 = c6319.m17496(abstractC4308M23931).f17560;
                                                }
                                                m23913(abstractC19669, c2609M8246, abstractC4308M23931);
                                            }
                                        }
                                    }
                                    c6319 = c63111;
                                }
                                c22406 = c22406;
                                c6319 = c63111;
                            }
                            z2 = z3;
                        } else {
                            c22406 = c22406;
                            c7254 = c7255;
                            z2 = z3;
                            c23168 = c23169;
                            c18963 = c18964;
                            c6319 = c63110;
                            if (!abstractC19669.m14709(EnumC18550.f57516)) {
                                C23420 c23422 = c23420;
                                m23930(abstractC19669, c1755M5877, c23422);
                                C10083 c10083M19457 = C7260.m19457((AbstractC21932) abstractC19669);
                                AbstractC4308 abstractC4308M25340 = c10083M19457.m25340();
                                if (abstractC4308M25340.m12913(EnumC9454.TYPEVAR)) {
                                    c15241 = c15242;
                                } else {
                                    c15241 = c15242;
                                    abstractC4308M25340 = c15241.m36104(abstractC19669, abstractC4308M25340);
                                }
                                m23916(abstractC19669, abstractC4308M23930, abstractC4308M25340);
                                AbstractC4308 abstractC4308M17519 = c6319.m17519(abstractC4308M25340);
                                if (!c10083M19457.m25341() || abstractC4308M17519.mo12948()) {
                                    hashSet = hashSet2;
                                    c23420 = c23422;
                                } else {
                                    hashSet = hashSet2;
                                    c23420 = c23422;
                                    if (c6319.m17546(c6319.m17519(abstractC4308M23930), abstractC4308M17519, true)) {
                                        if (z9) {
                                            c22364.m7273(abstractC19669, C6241.f19176);
                                        } else if (z4) {
                                            c22364.m7273(abstractC19669, C6241.f19218);
                                        }
                                        z9 = true;
                                    }
                                }
                                m23913(abstractC19669, c2609M8246, abstractC4308M17519);
                                if (c10083M19457.m25341() && !abstractC4308M17519.mo12948()) {
                                    c2609M8246 = c2609M8246.m8246(abstractC4308M17519);
                                }
                            } else {
                                if (z4) {
                                    c22364.m7273(abstractC19669, C6241.f19224);
                                } else if (z9) {
                                    c22364.m7273(abstractC19669, C6241.f19218);
                                }
                                this.f28218 = C1856.f6336;
                                z4 = true;
                            }
                            c7772M6169 = this.f28216.m6169(abstractC19669, c7772M6169, this.f28218);
                            hashSet2 = hashSet;
                            c63110 = c6319;
                            c18964 = c18963;
                            c15242 = c15241;
                            it = it2;
                            c7255 = c7254;
                            c23169 = c23168;
                            z3 = z2;
                            c22406 = c22406;
                        }
                        c15241 = c15242;
                        hashSet = hashSet2;
                        c7772M6169 = this.f28216.m6169(abstractC19669, c7772M6169, this.f28218);
                        hashSet2 = hashSet;
                        c63110 = c6319;
                        c18964 = c18963;
                        c15242 = c15241;
                        it = it2;
                        c7255 = c7254;
                        c23169 = c23168;
                        z3 = z2;
                        c22406 = c22406;
                    }
                    HashSet hashSet3 = hashSet2;
                    C22406 c22407 = c22406;
                    C7254 c7256 = c7255;
                    boolean z10 = z3;
                    C23168 c231610 = c23169;
                    C18963 c18965 = c18964;
                    C6319 c63112 = c63110;
                    C7772 c7774 = c7772M6169;
                    C1755 c1755M23896 = m23896(c1755M5877, c18965, c7774.f24023);
                    try {
                        biConsumer.accept(c18965, c1755M23896);
                        ((C8604) c1755M23896.f6073).f26285.mo26377();
                        AbstractC14016 abstractC14017 = ((C8604) obj).f26285;
                        for (C2609 c26012 = c18965.f59814; c26012.m8249(); c26012 = c26012.f8241) {
                            AbstractC5144 abstractC5145 = (AbstractC5144) c26012.f8240;
                            if (abstractC5145.m14709(EnumC18550.f57578)) {
                                abstractC14017.mo26382(((C9378) abstractC5145).f28489);
                            }
                        }
                        m23959(c18965);
                        boolean zM25666 = this.f28224.m25666(c1755M23896, c18965, this.f28249);
                        c18965.f59816 = zM25666;
                        if (c18965.f59817 != EnumC6652.STATEMENT || !zM25666) {
                            c7774 = null;
                        }
                        hashSet2 = hashSet3;
                        c26010 = c26011.f8241;
                        z5 = z9;
                        z6 = z8;
                        obj2 = obj;
                        c23421 = c23420;
                        c7255 = c7256;
                        c23169 = c231610;
                        z3 = z10;
                        c22406 = c22407;
                        c2609M8239 = c2609M8246;
                        enumC6652 = enumC6653;
                        c7772 = c7774;
                        c63110 = c63112;
                        zAnyMatch = z;
                    } catch (Throwable th2) {
                        ((C8604) c1755M23896.f6073).f26285.mo26377();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ((C8604) obj).f26285.mo26377();
                    throw th;
                }
            }
            Object obj3 = obj2;
            if (z) {
                c15240.m36121(c2609);
            }
            if (abstractC5144.m14709(EnumC18550.f57558)) {
                ((C22637) abstractC5144).f73105 = z4 || z5;
                ((C22637) abstractC5144).f73104 = z;
            } else if (abstractC5144.m14709(EnumC18550.f57555)) {
                ((C13464) abstractC5144).f40196 = z4 || z5;
                ((C13464) abstractC5144).f40195 = z;
            } else {
                C12171.m29640(abstractC5144.mo989().name());
                throw null;
            }
            ((C8604) obj3).f26285.mo26377();
        } catch (Throwable th4) {
            th = th4;
            obj = obj2;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        c15433.f47248 = m23898(c15433, EnumC18550.f57519, c15433.f47247, this.f28211);
        this.f28223 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23913(AbstractC19669 abstractC19669, C2609 c2609, AbstractC4308 abstractC4308) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            if (this.f28251.m17546(abstractC4308, (AbstractC4308) it.next(), true)) {
                this.f28253.m7273(abstractC19669, C6241.f19158);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m23899(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        if (!abstractC12612.m14709(EnumC18550.f57566)) {
            return null;
        }
        C7673 c7673 = (C7673) abstractC12612;
        for (AbstractC5698 abstractC5698 : abstractC4308.f13890.mo16064().m20476(c7673.f23696)) {
            if (abstractC5698.f17559 == EnumC1296.f4567) {
                c7673.f23697 = abstractC5698;
                ((C12048) abstractC5698).m29425();
                c7673.f16086 = abstractC5698.f17560;
                if ((abstractC5698.f17563 & 16384) == 0) {
                    return null;
                }
                return abstractC5698;
            }
        }
        return null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1384(C7115 c7115) {
        AbstractC4308 abstractC4308;
        AbstractC19810 abstractC19810;
        this.f28214.m36201(c7115, m23930(c7115.f21831, this.f28211, this.f28228));
        C4824 c4824 = ((C8604) this.f28211.f6073).f26289;
        EnumC20347 enumC20347 = EnumC20347.SYNCHRONIZATION;
        if (c4824.m14055(enumC20347) && (abstractC4308 = c7115.f21831.f16086) != null && (abstractC19810 = abstractC4308.f13890) != null && (abstractC19810.mo16084() & 9007199254740992L) != 0) {
            this.f28253.m7286(enumC20347, c7115, C14001.f42342);
        }
        m23928(c7115.f21830, this.f28211);
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C1755 c1755M5877;
        C20661 c20661;
        C15240 c15240 = this.f28214;
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 c1755M5878 = c1755.m5877(c10789, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj = c1755M5878.f6073;
        try {
            boolean zM8249 = c10789.f32446.m8249();
            if (zM8249) {
                C1755 c1756 = this.f28211;
                AbstractC14016 abstractC14017 = ((C8604) obj).f26285;
                c1755M5877 = c1756.m5877(c10789, ((C8604) obj).m22358(abstractC14017.mo26380(abstractC14017.f23673)));
            } else {
                c1755M5877 = c1755M5878;
            }
            try {
                Iterator it = c10789.f32446.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c20661 = this.f28244;
                    if (!zHasNext) {
                        break;
                    }
                    AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
                    C23420 c23420 = new C23420(this, C15406.f47179, c20661.f66531, new C21346(this, this.f28213.f75215));
                    if (abstractC5144.m14709(EnumC18550.f57578)) {
                        m23928(abstractC5144, c1755M5877);
                        c23420.mo13581(abstractC5144, abstractC5144.f16086);
                        m23944((InterfaceC3109) abstractC5144, c1755M5878, abstractC5144.f16086);
                        ((C9378) abstractC5144).f28489.m29421(EnumC23258.RESOURCE_VARIABLE);
                    } else {
                        m23930(abstractC5144, c1755M5877, c23420);
                    }
                }
                m23928(c10789.f32445, c1755M5877);
                if (zM8249) {
                    ((C8604) c1755M5877.f6073).f26285.mo26377();
                }
                for (C2609 c2609 = c10789.f32449; c2609.m8249(); c2609 = c2609.f8241) {
                    C0617 c0617 = (C0617) c2609.f8240;
                    AbstractC14016 abstractC14018 = ((C8604) obj).f26285;
                    C1755 c1755M5879 = c1755M5878.m5877(c0617, ((C8604) obj).m22358(abstractC14018.mo26380(abstractC14018.f23673)));
                    try {
                        AbstractC4308 abstractC4308M23928 = m23928(c0617.f2373, c1755M5879);
                        if (c0617.f2373.f28488.m14709(EnumC18550.f57503)) {
                            c0617.f2373.f28489.f17563 |= 549755813904L;
                        }
                        C12048 c12048 = c0617.f2373.f28489;
                        if (c12048.f17559 == EnumC1296.f4567) {
                            c12048.m29421(EnumC23258.EXCEPTION_PARAMETER);
                        }
                        AbstractC12612 abstractC12612 = c0617.f2373.f28488;
                        abstractC12612.getClass();
                        AbstractC12612 abstractC12613 = c0617.f2373.f28488;
                        abstractC12613.getClass();
                        c15240.m36106(abstractC12612, c15240.m36173(abstractC12613, abstractC4308M23928), c20661.f66479, c15240.f46781);
                        m23928(c0617.f2372, c1755M5879);
                        ((C8604) c1755M5879.f6073).f26285.mo26377();
                    } catch (Throwable th) {
                        ((C8604) c1755M5879.f6073).f26285.mo26377();
                        throw th;
                    }
                }
                AbstractC5144 abstractC5145 = c10789.f32448;
                if (abstractC5145 != null) {
                    m23928(abstractC5145, c1755M5878);
                }
                this.f28223 = null;
                ((C8604) obj).f26285.mo26377();
            } catch (Throwable th2) {
                if (zM8249) {
                    ((C8604) c1755M5877.f6073).f26285.mo26377();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            ((C8604) obj).f26285.mo26377();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23944(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12948()) {
            return;
        }
        C20661 c20661 = this.f28244;
        AbstractC19810 abstractC19810 = c20661.f66531.f13890;
        C6319 c6319 = this.f28251;
        if (c6319.m17527(abstractC19810, abstractC4308) == null || c6319.m17550(abstractC4308, c20661.f66531)) {
            return;
        }
        C22364 c22364 = this.f28253;
        C8253 c8253 = new C8253(c22364);
        try {
            C22406 c22406 = this.f28231;
            AbstractC4308 abstractC4308M17526 = c6319.m17526(abstractC4308, false);
            AbstractC10370 abstractC10370 = this.f28229.f18851;
            C2609 c2609M8239 = C2609.m8239();
            C2609 c2609M82310 = C2609.m8239();
            c22406.getClass();
            AbstractC5698 abstractC5698M50313 = c22406.m50313(interfaceC3109, c1755, abstractC4308M17526.f13890, abstractC4308M17526, abstractC10370, c2609M8239, c2609M82310);
            c22364.m50112(c8253);
            if (abstractC5698M50313.f17559 == EnumC1296.f4571 && abstractC5698M50313.mo10962(c20661.f66496, abstractC4308.f13890, c6319, true)) {
                AbstractC4308 abstractC4309 = c20661.f66486;
                C2609 c2609Mo12930 = c6319.m17543(abstractC5698M50313, abstractC4308).mo12930();
                C15240 c15240 = this.f28214;
                if (c15240.m36184(abstractC4309) || c15240.m36200(abstractC4309, c2609Mo12930)) {
                    C4824 c4824 = ((C8604) c1755.f6073).f26289;
                    EnumC20347 enumC20347 = EnumC20347.TRY;
                    if (c4824.m14055(enumC20347)) {
                        C11076 c11076 = C14001.f42334;
                        c22364.m7286(enumC20347, interfaceC3109, new C11076("compiler", "try.resource.throws.interrupted.exc", abstractC4308));
                    }
                }
            }
        } catch (Throwable th) {
            c22364.m50112(c8253);
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        C23420 c23420Mo38522;
        AbstractC4308 abstractC4308M13641;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC4308M23929 = m23929((AbstractC5144) c8379.f25701, this.f28211, (AbstractC4308) this.f28244.f66469);
        C7772 c7772 = this.f28218;
        EnumC19816 enumC19816 = (!this.f28241 || !(!this.f28213.f75219.m12913(EnumC9454.NONE) || (abstractC4308 = this.f28213.f75219) == AbstractC4308.f13884 || abstractC4308 == C6735.f20919) || m23915(this.f28211, c8379)) ? EnumC19816.STANDALONE : EnumC19816.POLY;
        c8379.f13845 = enumC19816;
        if (enumC19816 == EnumC19816.POLY && this.f28213.f75219.m12913(EnumC9454.VOID)) {
            this.f28213.f75215.mo1084(c8379, this.f28210.m16617(C11886.f35443));
            C12193 c12193M17535 = this.f28251.m17535(this.f28213.f75219);
            c8379.f16086 = c12193M17535;
            this.f28223 = c12193M17535;
            return;
        }
        EnumC19816 enumC19817 = c8379.f13845;
        EnumC19816 enumC19818 = EnumC19816.STANDALONE;
        if (enumC19817 == enumC19818) {
            c23420Mo38522 = this.f28228;
        } else {
            C23420 c23420 = this.f28213;
            c23420Mo38522 = c23420.mo38522(new C19935(this, c23420.f75215));
        }
        C1755 c1755 = this.f28211;
        C1755 c1755M23896 = m23896(c1755, c1755.f6074, c7772.f24023);
        Object obj = c1755M23896.f6073;
        try {
            AbstractC4308 abstractC4308M23930 = m23930(c8379.f25699, c1755M23896, c23420Mo38522);
            ((C8604) obj).f26285.mo26377();
            C7772 c7773 = this.f28218;
            C1755 c1756 = this.f28211;
            C1755 c1755M23897 = m23896(c1756, c1756.f6074, c7772.f24022);
            Object obj2 = c1755M23897.f6073;
            try {
                AbstractC4308 abstractC4308M23931 = m23930(c8379.f25700, c1755M23897, c23420Mo38522);
                ((C8604) obj2).f26285.mo26377();
                C7772 c7774 = this.f28218;
                if (c8379.f13845 != enumC19818) {
                    abstractC4308M13641 = this.f28213.f75219;
                } else {
                    AbstractC12612 abstractC12612 = c8379.f25699;
                    abstractC12612.getClass();
                    AbstractC12612 abstractC12613 = c8379.f25700;
                    abstractC12613.getClass();
                    abstractC4308M13641 = m23924(C2609.of((Object) abstractC12612, (Object) abstractC12613), C2609.of((Object) abstractC4308M23930, (Object) abstractC4308M23931));
                }
                if (abstractC4308M23929.mo12915() != null && abstractC4308M23930.mo12915() != null && abstractC4308M23931.mo12915() != null && !abstractC4308M13641.m12913(EnumC9454.NONE)) {
                    if (!abstractC4308M23929.mo12935()) {
                        abstractC4308M23930 = abstractC4308M23931;
                    }
                    abstractC4308M13641 = this.f28239.m13641(abstractC4308M23930, abstractC4308M13641);
                }
                this.f28223 = m23934(c8379, abstractC4308M13641, C15406.f47181, this.f28213);
                this.f28218 = this.f28216.m6166(c8379, c7772, c7773, c7774);
            } catch (Throwable th) {
                ((C8604) obj2).f26285.mo26377();
                throw th;
            }
        } catch (Throwable th2) {
            ((C8604) obj).f26285.mo26377();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23915(C1755 c1755, AbstractC12612 abstractC12612) {
        AbstractC4308 abstractC4308;
        int i = C0883.f3449[abstractC12612.mo989().ordinal()];
        C23420 c23420 = this.f28228;
        C5572 c5572 = this.f28227;
        C12399 c12399 = this.f28247;
        switch (i) {
            case 1:
                EnumC9454 enumC9454 = ((C23342) abstractC12612).f74996;
                return enumC9454.m24299(EnumC9454.DOUBLE) || enumC9454 == EnumC9454.BOOLEAN || enumC9454 == EnumC9454.BOT;
            case 2:
            case 3:
                return false;
            case 4:
                return m23915(c1755, ((C14875) abstractC12612).f45392);
            case 5:
                C8379 c8379 = (C8379) abstractC12612;
                return m23915(c1755, c8379.f25699) && m23915(c1755, c8379.f25700);
            case 6:
                c5572.getClass();
                C15580 c15580 = (C15580) c12399.m30568(abstractC12612, c1755, c23420, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572));
                AbstractC5698 abstractC5698M19472 = C7260.m19472(c15580.f48011);
                if (c15580.f48011.m14709(EnumC18550.f57566)) {
                    abstractC4308 = c1755.f6079.f16086;
                } else {
                    abstractC4308 = ((C6262) c15580.f48011).f19397.f16086;
                }
                return m23958(this.f28251.m17543(abstractC5698M19472, abstractC4308).mo12923());
            case 7:
                AbstractC12612 abstractC12613 = (AbstractC12612) this.f28235.mo23617(((C19110) abstractC12612).f60196);
                c5572.getClass();
                return m23958(((AbstractC12612) c12399.m30568(abstractC12613, c1755, this.f28226, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572))).f16086);
            default:
                c5572.getClass();
                return m23958(c12399.m30568(abstractC12612, c1755, c23420, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572)).f16086);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m23958(AbstractC4308 abstractC4308) {
        return (abstractC4308.m12913(EnumC9454.TYPEVAR) || abstractC4308.mo12948() || !this.f28251.m17559(abstractC4308).mo12941()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23924(C2609 c2609, C2609 c26010) {
        boolean zIsEmpty = c26010.isEmpty();
        C20661 c20661 = this.f28244;
        if (zIsEmpty) {
            return c20661.f66526;
        }
        final AbstractC4308 abstractC4308 = (AbstractC4308) c26010.f8240;
        if (C5378.stream(c26010.f8241).allMatch(new Predicate() { // from class: l.۬᩶֨
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
                return this.f39892.f28251.m17550(abstractC4308, (AbstractC4308) obj);
            }
        })) {
            return abstractC4308.mo2973();
        }
        C2609<AbstractC4308> c26011 = (C2609) C5378.stream(c26010).map(new C10511(0, this)).collect(C2609.m8240());
        if (C5378.stream(c26011).allMatch(new C4464(2))) {
            for (final AbstractC4308 abstractC4309 : c26011) {
                if (abstractC4309.mo3258().m24297(EnumC9454.INT) && C5378.stream(c26011).filter(new Predicate() { // from class: l.ۛ᩶֨
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
                        return ((AbstractC4308) obj) != abstractC4309;
                    }
                }).allMatch(new C11922(0, this, abstractC4309))) {
                    return abstractC4309.mo2973();
                }
            }
            for (EnumC9454 enumC9454 : f28209) {
                final AbstractC4308 abstractC43010 = c20661.f66461[enumC9454.ordinal()];
                if (C5378.stream(c26011).allMatch(new Predicate() { // from class: l.᩺᩶֨
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
                        return this.f74593.f28251.m17546((AbstractC4308) obj, abstractC43010, true);
                    }
                })) {
                    return abstractC43010;
                }
            }
        }
        C2609<AbstractC4308> c26012 = (C2609) C5378.stream(c26010).map(new C7688(0, this)).collect(C2609.m8240());
        for (final AbstractC4308 abstractC43011 : c26012) {
            if (C5378.stream(c26012).filter(new Predicate() { // from class: l.֫ۙ֨
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
                    return ((AbstractC4308) obj) != abstractC43011;
                }
            }).allMatch(new C10762(this, abstractC43011))) {
                return abstractC43011.mo2973();
            }
        }
        return this.f28251.m17548((C2609) C5378.stream((C2609) C5378.stream(c26012).map(new C16405(0, this, c2609.iterator())).collect(C2609.m8240())).map(new C7033(5)).filter(new C12627(0)).collect(C2609.m8240()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1755 m23896(C1755 c1755, AbstractC5144 abstractC5144, C2609 c2609) {
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 c1755M5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        AbstractC14016 abstractC14017 = ((C8604) c1755M5877.f6073).f26285;
        C11003.requireNonNull(abstractC14017);
        C19846.forEach(c2609, new C3706(abstractC14017));
        return c1755M5877;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        boolean zM25666;
        m23929((AbstractC5144) c1470.f5225, this.f28211, (AbstractC4308) this.f28244.f66469);
        C7772 c7772 = this.f28218;
        C1755 c1755 = this.f28211;
        C2609 c2609 = c7772.f24023;
        C2609 c26010 = c7772.f24022;
        C1755 c1755M23896 = m23896(c1755, c1755.f6074, c2609);
        Object obj = c1755M23896.f6073;
        try {
            m23928(c1470.f5226, c1755M23896);
            ((C8604) obj).f26285.mo26377();
            m23959(c1470.f5226);
            C1755 c1756 = this.f28211;
            AbstractC11349 abstractC11349 = c1470.f5226;
            C10222 c10222 = this.f28224;
            C17013 c17013 = this.f28249;
            boolean zM25667 = c10222.m25666(c1756, abstractC11349, c17013);
            if (c1470.f5227 != null) {
                C1755 c1757 = this.f28211;
                C1755 c1755M23897 = m23896(c1757, c1757.f6074, c26010);
                Object obj2 = c1755M23897.f6073;
                try {
                    m23928(c1470.f5227, c1755M23897);
                    ((C8604) obj2).f26285.mo26377();
                    m23959(c1470.f5227);
                    zM25666 = c10222.m25666(this.f28211, c1470.f5227, c17013);
                } catch (Throwable th) {
                    ((C8604) obj2).f26285.mo26377();
                    throw th;
                }
            } else {
                zM25666 = true;
            }
            this.f28214.m36118(c1470);
            C2609 c2609M8239 = C2609.m8239();
            if (zM25667 && !zM25666) {
                c26010 = c7772.f24023;
            } else if (!zM25666 || zM25667) {
                c26010 = c2609M8239;
            }
            AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
            C11003.requireNonNull(abstractC14016);
            C19846.forEach(c26010, new C3706(abstractC14016));
            C19846.forEach(c26010, new C18523());
            this.f28223 = null;
        } catch (Throwable th2) {
            ((C8604) obj).f26285.mo26377();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23959(AbstractC5144 abstractC5144) {
        this.f28225.m21193();
        new C4412(this).mo10758(abstractC5144);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1394(C10496 c10496) {
        C1755 c1755 = this.f28211;
        m23930(c10496.f31483, c1755.m5877(c10496, c1755.f6073), this.f28228);
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        C12281 c12281;
        C1755 c1755 = this.f28211;
        C23420 c23420 = ((C8604) c1755.f6073).f26286;
        if (c23420 != null) {
            m23930(c2322.f7456, c1755, c23420);
            c2322.f7455 = m23898(c2322, EnumC18550.f57493, this.f28229.f18867, this.f28211);
        } else {
            if (c2322.f7456.m14709(EnumC18550.f57482)) {
                c12281 = C6241.f19125;
            } else {
                c12281 = C6241.f19273;
            }
            this.f28253.m7273(c2322, c12281);
            m23930(c2322.f7456, this.f28211, this.f28228);
        }
        this.f28223 = null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5144 m23898(AbstractC11349 abstractC11349, EnumC18550 enumC18550, AbstractC10370 abstractC10370, C1755 c1755) {
        C23069 c23069;
        Object obj;
        int i;
        C12281 c12281 = null;
        while (true) {
            if (c1755 != null && (i = C0883.f3449[c1755.f6074.mo989().ordinal()]) != 2) {
                switch (i) {
                    case 8:
                        C17698 c17698 = (C17698) c1755.f6074;
                        if (abstractC10370 != c17698.f54160) {
                            c1755 = c1755.f6072;
                        } else if (enumC18550 != EnumC18550.f57519) {
                            c23069 = new C23069(c17698, c12281);
                        } else {
                            if (!c17698.f54159.m14709(EnumC18550.f57494) && !c17698.f54159.m14709(EnumC18550.f57568) && !c17698.f54159.m14709(EnumC18550.f57513) && !c17698.f54159.m14709(EnumC18550.f57481)) {
                                C12281 c12282 = C6241.f19132;
                                c12281 = new C12281("compiler", "not.loop.label", abstractC10370);
                            }
                            c23069 = new C23069(C7260.m19441(c17698), c12281);
                        }
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (abstractC10370 != null) {
                            c1755 = c1755.f6072;
                        } else {
                            c23069 = new C23069(c1755.f6074, c12281);
                        }
                        break;
                    case 13:
                        if (abstractC10370 == null && enumC18550 == EnumC18550.f57556) {
                            c23069 = new C23069(c1755.f6074, null);
                        } else {
                            c1755 = c1755.f6072;
                        }
                        break;
                    case 14:
                        if (enumC18550 != EnumC18550.f57493) {
                            c12281 = enumC18550 == EnumC18550.f57556 ? C6241.f19122 : C6241.f19198;
                            c1755 = c1755.f6072;
                        } else {
                            c23069 = new C23069(c1755.f6074, null);
                        }
                        break;
                    case 15:
                    case 16:
                        break;
                    default:
                        c1755 = c1755.f6072;
                        break;
                }
                obj = c23069.f74208;
                if (obj != null) {
                    this.f28253.m7273(abstractC11349, (C12281) obj);
                }
                return (AbstractC5144) c23069.f74207;
            }
            if (abstractC10370 != null) {
                C12281 c12283 = C6241.f19132;
                c23069 = new C23069(null, new C12281("compiler", "undef.label", abstractC10370));
            } else if (c12281 != null) {
                c23069 = new C23069(null, c12281);
            } else {
                c23069 = enumC18550 == EnumC18550.f57519 ? new C23069(null, C6241.f19214) : new C23069(null, C6241.f19160);
            }
            obj = c23069.f74208;
            if (obj != null) {
                this.f28253.m7273(abstractC11349, (C12281) obj);
            }
            return (AbstractC5144) c23069.f74207;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        C8526 c8526;
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        C23420 c23420 = c8604.f26284;
        C22364 c22364 = this.f28253;
        if (c23420 == null) {
            c22364.m7273(c9938, C6241.f19175);
        } else if (c8604.f26286 != null) {
            c22364.m7273(c9938, C6241.f19286);
        } else if (!c8604.f26294 && !c8604.f26291 && (c8526 = c1755.f6077) != null && C7260.m19454(c8526)) {
            C8526 c8527 = this.f28211.f6077;
            c22364.m7273(c8527, C6241.m17187(C11886.f35486, c8527.f26045.f17562, C11886.f35512));
        } else {
            AbstractC12612 abstractC12612 = c9938.f30017;
            C5931 c5931 = this.f28210;
            if (abstractC12612 != null) {
                if (((C8604) this.f28211.f6073).f26284.f75219.m12913(EnumC9454.VOID)) {
                    InterfaceC3953 interfaceC3953 = ((C8604) this.f28211.f6073).f26284.f75215;
                    AbstractC12612 abstractC12613 = c9938.f30017;
                    abstractC12613.getClass();
                    interfaceC3953.mo1084(abstractC12613, c5931.m16617(C11886.f35457));
                }
                AbstractC12612 abstractC12614 = c9938.f30017;
                C1755 c1756 = this.f28211;
                m23930(abstractC12614, c1756, ((C8604) c1756.f6073).f26284);
            } else if (!((C8604) this.f28211.f6073).f26284.f75219.m12913(EnumC9454.VOID) && !((C8604) this.f28211.f6073).f26284.f75219.m12913(EnumC9454.NONE)) {
                C23420 c23421 = ((C8604) this.f28211.f6073).f26284;
                c23421.f75215.mo1084(c9938, c5931.m16617(C11886.m29010(c23421.f75219)));
            }
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        AbstractC12612 abstractC12612 = c1616.f5680;
        C1755 c1755 = this.f28211;
        C20661 c20661 = this.f28244;
        boolean z = this.f28241;
        AbstractC4308 abstractC4308M23929 = m23929((AbstractC5144) abstractC12612, c1755, z ? AbstractC4308.f13885 : c20661.f66479);
        if (z) {
            AbstractC4308 abstractC4308 = c20661.f66479;
            C15240 c15240 = this.f28214;
            c15240.m36106(c1616, abstractC4308M23929, abstractC4308, c15240.f46781);
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        m23929((AbstractC5144) c6968.f21475, this.f28211, (AbstractC4308) this.f28244.f66469);
        AbstractC12612 abstractC12612 = c6968.f21476;
        if (abstractC12612 != null) {
            this.f28214.m36202(abstractC12612, m23930(abstractC12612, this.f28211, this.f28228));
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        AbstractC4308 abstractC4308;
        char c;
        AbstractC4308 abstractC4308M17562;
        C20661 c20661;
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        C1755 c1755M5877 = c1755.m5877(c15580, c8604.m22358(c8604.f26285));
        Object obj = c1755M5877.f6073;
        AbstractC10370 abstractC10370M19462 = C7260.m19462(c15580.f48011);
        C6136 c6136 = this.f28229;
        AbstractC10370 abstractC10370 = c6136.f18886;
        AbstractC10370 abstractC10371 = c6136.f18898;
        boolean z = abstractC10370M19462 == abstractC10370 || abstractC10370M19462 == abstractC10371;
        C18837 c18837 = new C18837();
        C15240 c15240 = this.f28214;
        if (z) {
            m23952(c15580, this.f28211.f6077, true);
            C8604 c8605 = (C8604) obj;
            c8605.f26299 = true;
            C15406 c15406M23940 = m23940(C15406.f47187, c15580.f48012, c1755M5877, c18837);
            C2609 c2609M43517 = c18837.m43517();
            C2609 c2609 = c15580.f48010;
            C2609 c2609M23923 = m23923(c2609, c1755M5877);
            c15240.m36123(c2609, c2609M23923);
            AbstractC4308 abstractC4309 = this.f28211.f6079.f17186.f17560;
            C22364 c22364 = this.f28253;
            C20661 c20662 = this.f28244;
            if (abstractC10370M19462 == abstractC10371) {
                AbstractC4308 abstractC43010 = c20662.f66526;
                C6319 c6319 = this.f28251;
                if (abstractC4309 == abstractC43010) {
                    AbstractC12612 abstractC12612 = c15580.f48011;
                    abstractC12612.getClass();
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(abstractC12612, new C12281("compiler", "no.superclass", abstractC4309));
                    abstractC4308M17562 = c6319.m17535(c20662.f66526);
                } else {
                    abstractC4308M17562 = c6319.m17562(abstractC4309);
                }
                c = 0;
            } else {
                c15406M23940 = c15406M23940;
                c2609M23923 = c2609M23923;
                c = 0;
                abstractC4308M17562 = abstractC4309;
            }
            if (abstractC4308M17562.m12913(EnumC9454.CLASS)) {
                AbstractC4308 abstractC4308Mo4958 = abstractC4308M17562.mo4958();
                while (abstractC4308Mo4958 != null && abstractC4308Mo4958.m12913(EnumC9454.TYPEVAR)) {
                    abstractC4308Mo4958 = abstractC4308Mo4958.mo12939();
                }
                if (abstractC4308Mo4958.m12913(EnumC9454.CLASS)) {
                    if (c15580.f48011.m14709(EnumC18550.f57581)) {
                        AbstractC12612 abstractC12613 = ((C6262) c15580.f48011).f19397;
                        abstractC12613.getClass();
                        c15240.m36201(abstractC12613, m23929((AbstractC5144) abstractC12613, c1755M5877, abstractC4308Mo4958));
                    } else if (abstractC10370M19462 == abstractC10371) {
                        AbstractC12612 abstractC12614 = c15580.f48011;
                        abstractC12614.getClass();
                        this.f28231.m50302((InterfaceC3109) abstractC12614, c1755M5877, abstractC4308M17562, true);
                    }
                } else if (c15580.f48011.m14709(EnumC18550.f57581)) {
                    AbstractC12612 abstractC12615 = c15580.f48011;
                    abstractC12615.getClass();
                    AbstractC19810 abstractC19810 = abstractC4308M17562.f13890;
                    C12281 c12282 = C6241.f19132;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC19810;
                    c22364.m7273(abstractC12615, new C12281("compiler", "illegal.qual.not.icls", objArr));
                    m23929((AbstractC5144) ((C6262) c15580.f48011).f19397, c1755M5877, abstractC4308M17562);
                }
                if (abstractC4308M17562.f13890 == c20662.f66527) {
                    c2609M43517 = c2609M43517.m8246(c20662.f66452).m8246(c20662.f66533);
                }
                boolean z2 = c8605.f26296;
                c8605.f26296 = true;
                c8605.f26288 = null;
                AbstractC12612 abstractC12616 = c15580.f48011;
                abstractC12616.getClass();
                C2609 c26010 = c2609M23923;
                AbstractC5698 abstractC5698M50312 = this.f28231.m50312(abstractC12616, c1755M5877, abstractC4308M17562, c2609M43517, c26010);
                c8605.f26296 = z2;
                C7260.m19459(abstractC5698M50312, c15580.f48011);
                c20661 = c20662;
                m23932(c15580.f48011, abstractC4308M17562, abstractC5698M50312, c1755M5877, new C23420(this, c15406M23940, m23925(this.f28213.f75219, c2609M43517, c26010)));
            } else {
                c20661 = c20662;
                if (abstractC4308M17562.m12913(EnumC9454.ERROR) && c15580.f48011.m14709(EnumC18550.f57581)) {
                    m23929((AbstractC5144) ((C6262) c15580.f48011).f19397, c1755M5877, abstractC4308M17562);
                }
            }
            C1485 c1485 = c20661.f66501;
            c15580.f16086 = c1485;
            this.f28223 = c1485;
        } else {
            C15406 c15406 = C15406.f47181;
            C15406 c15406M23941 = m23940(c15406, c15580.f48012, c1755M5877, c18837);
            C2609 c2609M43518 = c18837.m43517();
            C2609 c2609M23924 = m23923(c15580.f48010, c1755M5877);
            AbstractC4308 abstractC4308M23925 = m23925(this.f28213.f75219, c2609M43518, c2609M23924);
            ((C8604) obj).f26288 = null;
            AbstractC4308 abstractC4308M23930 = m23930(c15580.f48011, c1755M5877, new C23420(this, c15406M23941, abstractC4308M23925, this.f28213.f75215));
            AbstractC4308 abstractC4308Mo12923 = abstractC4308M23930.mo12923();
            if (abstractC4308Mo12923.m12913(EnumC9454.WILDCARD)) {
                throw new AssertionError(abstractC4308M23930);
            }
            if (c15580.f48011.m14709(EnumC18550.f57581)) {
                abstractC4308 = ((C6262) c15580.f48011).f19397.f16086;
            } else {
                abstractC4308 = this.f28211.f6079.f17186.f17560;
            }
            AbstractC4308 abstractC4308M23935 = m23935(C7260.m19472(c15580.f48011), abstractC4308, abstractC10370M19462, c2609M43518, abstractC4308Mo12923);
            c15240.m36123(c15580.f48010, c2609M23924);
            this.f28223 = m23934(c15580, this.f28213.f75215.mo3857().m1860((AbstractC5144) c15580, abstractC4308M23935, true), c15406, this.f28213);
        }
        c15240.m36122(c15580.f48010, c1755M5877);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23935(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, AbstractC4308 abstractC4309) {
        C6319 c6319 = this.f28251;
        C6136 c6136 = this.f28229;
        C20661 c20661 = this.f28244;
        if (abstractC5698 != null && abstractC5698.f17561 == c20661.f66526.f13890 && abstractC10370 == c6136.f18828 && c2609.isEmpty()) {
            return new C19955(abstractC4309.mo4958(), C2609.of((Object) new C19831(c6319.m17519(abstractC4308.mo2973()), EnumC15678.EXTENDS, c20661.f66480)), abstractC4309.f13890, abstractC4309.m12921());
        }
        return (abstractC5698 != null && abstractC5698.f17561 == c20661.f66505 && abstractC10370 == c6136.f18902 && c6319.m17512(abstractC4308)) ? abstractC4308 : abstractC4309;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23952(C15580 c15580, C8526 c8526, boolean z) {
        if (c8526 != null && c8526.f26044 == this.f28229.f18879) {
            C2735 c2735 = c8526.f26043;
            if (((AbstractC11349) c2735.f8521.f8240).m14709(EnumC18550.f57478) && ((C10496) c2735.f8521.f8240).f31483 == c15580) {
                return true;
            }
        }
        if (z) {
            AbstractC10370 abstractC10370M19462 = C7260.m19462(c15580.f48011);
            C12281 c12281 = C6241.f19132;
            this.f28253.m7273(c15580, new C12281("compiler", "call.must.be.first.stmt.in.ctor", abstractC10370M19462));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23925(AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010) {
        C10658 c10658 = new C10658(c2609, abstractC4308, C2609.m8239(), this.f28244.f66481);
        return c26010 == null ? c10658 : new C10077(c10658, c26010);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0330  */
    /* JADX WARN: Code duplicated, block: B:102:0x0345  */
    /* JADX WARN: Code duplicated, block: B:104:0x0355  */
    /* JADX WARN: Code duplicated, block: B:106:0x0363  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:109:0x0372  */
    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0408  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a4  */
    /* JADX WARN: Not found block with instruction: 0x01af: MOVE (r6v3 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(final C19110 c19110) {
        AbstractC12612 abstractC12612;
        C18257 c18257;
        AbstractC12612 abstractC12613;
        AbstractC12612 abstractC12614;
        AbstractC12612 abstractC12612M39912;
        C2609 c2609;
        C6319 c6319;
        C2609 c26010;
        boolean z;
        C2609 c26011;
        C2609 c26012;
        boolean zM19449;
        C20661 c20661;
        C1755 c1755;
        C5557 c5557;
        C15240 c15240;
        AbstractC12612 abstractC12615;
        AbstractC4308 abstractC4308M36108;
        C1755 c1755M5877;
        C8604 c8604;
        boolean z2;
        AbstractC5698 abstractC5698M50312;
        EnumC16761 enumC16761;
        boolean z3;
        AbstractC5698 abstractC5698;
        AbstractC4308 abstractC4308;
        boolean z4;
        C6319 c63110;
        AbstractC4308 abstractC4308M23932;
        C0384 c0384Mo3857;
        AbstractC4308 abstractC4309;
        AbstractC4308 abstractC43010 = c19110.f16086;
        C2609 c26013 = c19110.f60198;
        C6319 c63111 = this.f28251;
        C12193 c12193M17535 = c63111.m17535(abstractC43010);
        C1755 c1756 = this.f28211;
        C8604 c8605 = (C8604) c1756.f6073;
        C1755 c1755M5878 = c1756.m5877(c19110, c8605.m22358(c8605.f26285));
        Object obj = c1755M5878.f6073;
        C5557 c5558 = c19110.f60195;
        AbstractC12612 abstractC12616 = c19110.f60196;
        EnumC18550 enumC18550 = EnumC18550.f57521;
        if (abstractC12616.m14709(enumC18550)) {
            abstractC12612 = ((C16432) abstractC12616).f50542;
            if (abstractC12612.m14709(EnumC18550.f57497)) {
                c18257 = (C18257) abstractC12612;
                abstractC12613 = c18257.f56779;
            } else {
                abstractC12613 = abstractC12612;
                c18257 = null;
            }
        } else if (abstractC12616.m14709(EnumC18550.f57497)) {
            c18257 = (C18257) abstractC12616;
            abstractC12613 = c18257.f56779;
        } else {
            abstractC12612 = abstractC12616;
            abstractC12613 = abstractC12612;
            c18257 = null;
        }
        AbstractC5144 abstractC5144 = c19110.f60199;
        C15240 c15241 = this.f28214;
        if (abstractC5144 != null) {
            AbstractC4308 abstractC4308M36201 = c15241.m36201(abstractC5144, m23930(abstractC5144, this.f28211, this.f28228));
            int i = abstractC12616.f16085;
            C17013 c17013 = this.f28249;
            c17013.f52172 = i;
            abstractC12612M39912 = c17013.m39912(c17013.m39965(abstractC4308M36201), ((C7673) abstractC12613).f23696);
            AbstractC12117 abstractC12117 = this.f28211.f6075.f4743;
            abstractC12613.getClass();
            abstractC12117.mo6595(abstractC12612M39912, C7260.m19431(abstractC12613, abstractC12117));
            if (abstractC12616.m14709(EnumC18550.f57497)) {
                C18257 c18258 = (C18257) abstractC12616;
                C2609 c26014 = c18258.f56778;
                if (c18258.f56779.m14709(enumC18550)) {
                    c17013.f52172 = c19110.f16085;
                    abstractC12612M39912 = c17013.m39960(abstractC12612M39912, ((C16432) abstractC12616).f50541);
                }
                c17013.f52172 = c19110.f16085;
                abstractC12612M39912 = c17013.m39937(abstractC12612M39912, c26014);
            } else if (abstractC12616.m14709(enumC18550)) {
                c17013.f52172 = c19110.f16085;
                abstractC12612M39912 = c17013.m39960(abstractC12612M39912, ((C16432) abstractC12616).f50541);
            }
            abstractC12614 = abstractC12612M39912;
        } else {
            abstractC12614 = abstractC12616;
            abstractC12612M39912 = abstractC12613;
        }
        try {
            C1755 c1757 = this.f28211;
            ((C8604) c1757.f6073).f26291 = true;
            AbstractC4308 abstractC4308M23897 = C7260.m19450(c1757.f6074) ? m23897(this.f28211, (C7673) abstractC12614) : m23954(abstractC12614, this.f28211, AbstractC4308.f13885);
            ((C8604) this.f28211.f6073).f26291 = false;
            AbstractC4308 abstractC4308M36111 = c15241.m36111(c19110, abstractC4308M23897);
            c15241.m36137((AbstractC5144) abstractC12614, c1755M5878, true);
            AbstractC12612 abstractC12617 = c19110.f60199;
            C22406 c22406 = this.f28231;
            AbstractC12612 abstractC12618 = abstractC12614;
            C22364 c22364 = this.f28253;
            if (abstractC12617 != null) {
                c19110.f60196.f16086 = abstractC4308M36111;
                C7260.m19459(C7260.m19472(abstractC12612M39912), abstractC12613);
                AbstractC4308 abstractC43011 = ((C7673) abstractC12613).f23697.f17560;
                abstractC12613.f16086 = abstractC43011;
                if (c18257 != null) {
                    c18257.f16086 = abstractC43011;
                }
                if (!abstractC4308M36111.mo12948()) {
                    if (c5558 != null && abstractC4308M36111.f13890.m16070()) {
                        AbstractC12612 abstractC12619 = c19110.f60199;
                        abstractC12619.getClass();
                        c22364.m7273(abstractC12619, C6241.f19192);
                    } else if (abstractC4308M36111.f13890.mo15572()) {
                        AbstractC12612 abstractC126110 = c19110.f60199;
                        abstractC126110.getClass();
                        AbstractC19810 abstractC19810 = abstractC4308M36111.f13890;
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(abstractC126110, new C12281("compiler", "qualified.new.of.static.class", abstractC19810));
                    }
                }
            } else if (!abstractC4308M36111.f13890.m16070() && abstractC4308M36111.mo4958().m12913(EnumC9454.CLASS)) {
                c22406.m50302((InterfaceC3109) c19110, this.f28211, abstractC4308M36111, false);
            }
            C18837 c18837 = new C18837();
            C15406 c15406 = C15406.f47181;
            C15406 c15406M23940 = m23940(c15406, c19110.f60197, c1755M5878, c18837);
            C2609 c2609M43517 = c18837.m43517();
            C2609 c2609M23923 = m23923(c26013, c1755M5878);
            c15241.m36123(c26013, c2609M23923);
            if (abstractC4308M36111.m12913(EnumC9454.CLASS) || abstractC4308M36111.m12913(EnumC9454.ERROR)) {
                if ((abstractC4308M36111.f13890.f17563 & 16384) != 0) {
                    if (this.f28211.f6074.m14709(EnumC18550.f57578)) {
                        C9378 c9378 = (C9378) this.f28211.f6074;
                        c2609 = c26013;
                        c6319 = c63111;
                        if ((c9378.f28486.f7169 & 16384) == 0 || c9378.f28487 != c19110) {
                        }
                    } else {
                        c2609 = c26013;
                        c6319 = c63111;
                    }
                    c22364.m7273(c19110, C6241.f19230);
                } else {
                    c2609 = c26013;
                    c6319 = c63111;
                }
                boolean z5 = C7260.m19449(c19110) && this.f28213.f75215.mo3860().f20970 == EnumC13829.SPECULATIVE;
                if (c5558 != null || z5 || (abstractC4308M36111.f13890.mo16084() & 1536) == 0) {
                    if (c5558 == null || !abstractC4308M36111.f13890.m16070()) {
                        c26010 = c2609;
                        z = false;
                    } else {
                        if (!c2609M43517.isEmpty()) {
                            AbstractC12612 abstractC126111 = (AbstractC12612) c19110.f60197.f8240;
                            abstractC126111.getClass();
                            c22364.m7273(abstractC126111, C6241.f19281);
                        }
                        c26010 = c2609;
                        if (!c2609M23923.isEmpty()) {
                            AbstractC12612 abstractC126112 = (AbstractC12612) c26010.f8240;
                            abstractC126112.getClass();
                            c22364.m7273(abstractC126112, C6241.f19186);
                        }
                        c2609M43517 = C2609.m8239();
                        c2609M23923 = C2609.m8239();
                    }
                    c26011 = c2609M43517;
                    c26012 = c2609M23923;
                    zM19449 = C7260.m19449(c19110);
                    c20661 = this.f28244;
                    if (zM19449) {
                        C19955 c19955 = new C19955(abstractC4308M36111.mo4958(), abstractC4308M36111.f13890.f17560.mo12938(), abstractC4308M36111.f13890, abstractC4308M36111.m12921());
                        C1755 c1755M5879 = c1755M5878.m5877(c19110, obj);
                        C8604 c8606 = (C8604) c1755M5879.f6073;
                        if (c5558 == null || c19110.m44037()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c8606.f26296 = z4;
                        c8606.f26288 = null;
                        c22406.getClass();
                        AbstractC19810 abstractC19811 = c19955.f13890;
                        C5040 c5040 = c22406.f72585;
                        c5557 = c5558;
                        c1755 = c1755M5878;
                        C6451 c6451 = new C6451(c22406, c22406.f72594.f18879, c19955, c26011, c26012, c19110);
                        C12364 c12364 = new C12364(c22406);
                        c12364.f37062 = c5040;
                        AbstractC5698 abstractC5698M50303 = c22406.m50303(c1755M5879, c19110, abstractC19811, c12364, c6451);
                        c19110.f60194 = abstractC5698M50303.mo7048();
                        C23420 c23420 = new C23420(this, c15406M23940, m23925(this.f28213.f75219, c26011, c26012), new C3001(this, this.f28213.f75215, c19110, abstractC4308M36111.f13890), EnumC22756.f73480);
                        c63110 = c6319;
                        c19110.f60192 = c63110.m17535(abstractC4308M36111);
                        abstractC4308M23932 = m23932(c19110, c19955, abstractC5698M50303, c1755M5879, c23420);
                        c19110.f60196.f16086 = c63110.m17535(abstractC4308M36111);
                        if (abstractC4308M23932.mo12948()) {
                            abstractC12615 = abstractC12618;
                        } else {
                            AbstractC12612 abstractC126113 = c19110.f60196;
                            AbstractC4308 abstractC4308Mo12923 = abstractC4308M23932.mo12923();
                            abstractC12615 = abstractC12618;
                            abstractC12615.f16086 = abstractC4308Mo12923;
                            abstractC126113.f16086 = abstractC4308Mo12923;
                            c19110.f60192 = c63110.m17542(abstractC4308M23932, c20661.f66501);
                        }
                        AbstractC12612 abstractC126114 = c19110.f60196;
                        c15240 = c15241;
                        abstractC4308M36108 = c15240.m36108((InterfaceC3109) abstractC126114, abstractC126114.f16086, true);
                    } else {
                        c1755 = c1755M5878;
                        c5557 = c5558;
                        c15240 = c15241;
                        abstractC12615 = abstractC12618;
                        if (!z) {
                            c1755M5877 = c1755.m5877(c19110, obj);
                            c8604 = (C8604) c1755M5877.f6073;
                            if (c5557 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c8604.f26296 = z2;
                            c8604.f26288 = null;
                            c1755 = c1755;
                            abstractC5698M50312 = this.f28231.m50312(c19110, c1755M5877, abstractC4308M36111, c26011, c26012);
                            c19110.f60194 = abstractC5698M50312;
                            if (c5557 == null) {
                                c19110.f60192 = m23932(c19110, abstractC4308M36111, abstractC5698M50312, c1755M5877, new C23420(this, c15406M23940, m23925(c20661.f66501, c26011, c26012), c15240.f46781, EnumC22756.f73480));
                                enumC16761 = c8604.f26288;
                                if (enumC16761 != null && enumC16761.m39436()) {
                                    if (c19110.f60192.mo12948() && c19110.f60193 == null) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C12171.m29642(z3);
                                }
                            }
                        }
                        abstractC4308M36108 = abstractC4308M36111;
                    }
                    if (c5557 != null) {
                        m23912(c19110, abstractC12615, abstractC4308M36108, c5557, c1755, c26011, c26012, c15406M23940);
                        return;
                    }
                    abstractC5698 = c19110.f60194;
                    if (abstractC5698 == null && abstractC5698.f17559 == EnumC1296.f4571) {
                        abstractC4308 = abstractC4308M36108;
                    }
                    this.f28223 = m23934(c19110, abstractC4308, c15406, this.f28213);
                    c0384Mo3857 = this.f28213.f75215.mo3857();
                    abstractC4309 = c19110.f60192;
                    if (abstractC4309 != null && abstractC4309.m12928(c0384Mo3857.f1817)) {
                        c0384Mo3857.m1864(C2609.of((Object) c19110.f60192), new InterfaceC3748() { // from class: l.᩶᩶֨
                            @Override // l.InterfaceC3748
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo4673(C0384 c0384) {
                                C19110 c19111 = c19110;
                                c19111.f60192 = c0384.m1859(c19111.f60192);
                            }
                        });
                    }
                    c15240.m36122(c26010, c1755);
                }
                AbstractC19810 abstractC19812 = abstractC4308M36111.f13890;
                C12281 c12282 = C6241.f19132;
                c22364.m7273(c19110, new C12281("compiler", "abstract.cant.be.instantiated", abstractC19812));
                c26010 = c2609;
                z = true;
                c26011 = c2609M43517;
                c26012 = c2609M23923;
                zM19449 = C7260.m19449(c19110);
                c20661 = this.f28244;
                if (zM19449) {
                    C19955 c19956 = new C19955(abstractC4308M36111.mo4958(), abstractC4308M36111.f13890.f17560.mo12938(), abstractC4308M36111.f13890, abstractC4308M36111.m12921());
                    C1755 c1755M58710 = c1755M5878.m5877(c19110, obj);
                    C8604 c8607 = (C8604) c1755M58710.f6073;
                    if (c5558 == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    c8607.f26296 = z4;
                    c8607.f26288 = null;
                    c22406.getClass();
                    AbstractC19810 abstractC19813 = c19956.f13890;
                    C5040 c5041 = c22406.f72585;
                    c5557 = c5558;
                    c1755 = c1755M5878;
                    C6451 c6452 = new C6451(c22406, c22406.f72594.f18879, c19956, c26011, c26012, c19110);
                    C12364 c12365 = new C12364(c22406);
                    c12365.f37062 = c5041;
                    AbstractC5698 abstractC5698M50304 = c22406.m50303(c1755M58710, c19110, abstractC19813, c12365, c6452);
                    c19110.f60194 = abstractC5698M50304.mo7048();
                    C23420 c23421 = new C23420(this, c15406M23940, m23925(this.f28213.f75219, c26011, c26012), new C3001(this, this.f28213.f75215, c19110, abstractC4308M36111.f13890), EnumC22756.f73480);
                    c63110 = c6319;
                    c19110.f60192 = c63110.m17535(abstractC4308M36111);
                    abstractC4308M23932 = m23932(c19110, c19956, abstractC5698M50304, c1755M58710, c23421);
                    c19110.f60196.f16086 = c63110.m17535(abstractC4308M36111);
                    if (abstractC4308M23932.mo12948()) {
                        AbstractC12612 abstractC126115 = c19110.f60196;
                        AbstractC4308 abstractC4308Mo12924 = abstractC4308M23932.mo12923();
                        abstractC12615 = abstractC12618;
                        abstractC12615.f16086 = abstractC4308Mo12924;
                        abstractC126115.f16086 = abstractC4308Mo12924;
                        c19110.f60192 = c63110.m17542(abstractC4308M23932, c20661.f66501);
                    } else {
                        abstractC12615 = abstractC12618;
                    }
                    AbstractC12612 abstractC126116 = c19110.f60196;
                    c15240 = c15241;
                    abstractC4308M36108 = c15240.m36108((InterfaceC3109) abstractC126116, abstractC126116.f16086, true);
                } else {
                    c1755 = c1755M5878;
                    c5557 = c5558;
                    c15240 = c15241;
                    abstractC12615 = abstractC12618;
                    if (!z) {
                        c1755M5877 = c1755.m5877(c19110, obj);
                        c8604 = (C8604) c1755M5877.f6073;
                        if (c5557 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c8604.f26296 = z2;
                        c8604.f26288 = null;
                        c1755 = c1755;
                        abstractC5698M50312 = this.f28231.m50312(c19110, c1755M5877, abstractC4308M36111, c26011, c26012);
                        c19110.f60194 = abstractC5698M50312;
                        if (c5557 == null) {
                            c19110.f60192 = m23932(c19110, abstractC4308M36111, abstractC5698M50312, c1755M5877, new C23420(this, c15406M23940, m23925(c20661.f66501, c26011, c26012), c15240.f46781, EnumC22756.f73480));
                            enumC16761 = c8604.f26288;
                            if (enumC16761 != null) {
                                if (c19110.f60192.mo12948()) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                C12171.m29642(z3);
                            }
                        }
                    }
                    abstractC4308M36108 = abstractC4308M36111;
                }
                if (c5557 != null) {
                    m23912(c19110, abstractC12615, abstractC4308M36108, c5557, c1755, c26011, c26012, c15406M23940);
                    return;
                }
                abstractC5698 = c19110.f60194;
                if (abstractC5698 == null) {
                }
                this.f28223 = m23934(c19110, abstractC4308, c15406, this.f28213);
                c0384Mo3857 = this.f28213.f75215.mo3857();
                abstractC4309 = c19110.f60192;
                if (abstractC4309 != null) {
                    c0384Mo3857.m1864(C2609.of((Object) c19110.f60192), new InterfaceC3748() { // from class: l.᩶᩶֨
                        @Override // l.InterfaceC3748
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo4673(C0384 c0384) {
                            C19110 c19111 = c19110;
                            c19111.f60192 = c0384.m1859(c19111.f60192);
                        }
                    });
                }
                c15240.m36122(c26010, c1755);
            }
            c26010 = c26013;
            c1755 = c1755M5878;
            c15240 = c15241;
            abstractC4308 = c12193M17535;
            this.f28223 = m23934(c19110, abstractC4308, c15406, this.f28213);
            c0384Mo3857 = this.f28213.f75215.mo3857();
            abstractC4309 = c19110.f60192;
            if (abstractC4309 != null) {
                c0384Mo3857.m1864(C2609.of((Object) c19110.f60192), new InterfaceC3748() { // from class: l.᩶᩶֨
                    @Override // l.InterfaceC3748
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo4673(C0384 c0384) {
                        C19110 c19111 = c19110;
                        c19111.f60192 = c0384.m1859(c19111.f60192);
                    }
                });
            }
            c15240.m36122(c26010, c1755);
        } catch (Throwable th) {
            ((C8604) this.f28211.f6073).f26291 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23912(final C19110 c19110, final AbstractC12612 abstractC12612, AbstractC4308 abstractC4308, final C5557 c5557, final C1755 c1755, final C2609 c2609, final C2609 c26010, final C15406 c15406) {
        C1755 c1756;
        C6319 c6319;
        AbstractC4308 abstractC4308M17535;
        AbstractC4308 abstractC4308M17536;
        C15240 c15240;
        char c;
        C11576 c11576;
        AbstractC4308 abstractC4309;
        AbstractC4308 abstractC43010;
        C0384 c0384Mo3857 = this.f28213.f75215.mo3857();
        boolean zM19449 = C7260.m19449(c19110);
        C6319 c63110 = this.f28251;
        C15240 c15241 = this.f28214;
        if (zM19449 && (((abstractC4309 = c19110.f60192) != null && abstractC4309.m12928(c0384Mo3857.f1817)) || ((abstractC43010 = c19110.f60196.f16086) != null && abstractC43010.m12928(c0384Mo3857.f1817)))) {
            final C23420 c23420 = this.f28213;
            c0384Mo3857.m1864(C2609.of((Object) c19110.f60192, (Object) c19110.f60196.f16086), new InterfaceC3748() { // from class: l.ܳۙ֨
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0384) {
                    C9310.m23906(this.f43067, c19110, abstractC12612, c23420, c5557, c1755, c2609, c26010, c15406, c0384);
                }
            });
            c1756 = c1755;
            abstractC4308M17536 = abstractC4308;
            c6319 = c63110;
            c15240 = c15241;
        } else {
            if (zM19449 && abstractC4308.m12913(EnumC9454.CLASS)) {
                c15241.getClass();
                C18837 c18837 = new C18837();
                for (AbstractC4308 abstractC43011 : ((C19955) abstractC4308).mo12934()) {
                    if (!C15240.m36092(abstractC43011)) {
                        c18837.m43511(abstractC43011);
                    }
                }
                C2609 c2609M43517 = c18837.m43517();
                if (!abstractC4308.mo12948() && c2609M43517.m8249()) {
                    AbstractC19810 abstractC19810 = abstractC4308.f13890;
                    C11576 c11577 = C11886.f35440;
                    C11576 c11578 = new C11576("compiler", "diamond", abstractC19810);
                    AbstractC12612 abstractC12613 = c19110.f60196;
                    abstractC12613.getClass();
                    if (c2609M43517.m8245() <= 1) {
                        c = 0;
                        c11576 = new C11576("compiler", "diamond.invalid.arg", c2609M43517, c11578);
                    } else {
                        c = 0;
                        c11576 = new C11576("compiler", "diamond.invalid.args", c2609M43517, c11578);
                    }
                    C12281 c12281 = C6241.f19132;
                    Object[] objArr = new Object[2];
                    objArr[c] = c11578;
                    objArr[1] = c11576;
                    this.f28253.m7273(abstractC12613, new C12281("compiler", "cant.apply.diamond.1", objArr));
                }
                Iterator it = abstractC4308.mo12938().iterator();
                while (it.hasNext()) {
                    this.f28231.f72575.m21837(this.f28211, (AbstractC4308) it.next());
                }
            }
            if (abstractC4308.f13890.m16070() || (abstractC4308.mo12948() && !abstractC4308.mo12947().m12913(EnumC9454.NONE) && abstractC4308.mo12947().f13890.m16070())) {
                c5557.f17183 = C2609.of((Object) abstractC12612);
            } else {
                c5557.f17184 = abstractC12612;
            }
            if (this.f28213.f75215.mo3860().f20970 == EnumC13829.CHECK && m23951(abstractC4308)) {
                c1756 = c1755;
                ((C8604) c1756.f6073).f26287 = true;
            } else {
                c1756 = c1755;
            }
            m23928(c5557, c1756);
            C2609 c2609M8246 = (c19110.f60199 == null || abstractC4308.f13890.m16070()) ? c2609 : c2609.m8246(c19110.f60199.f16086);
            if (zM19449 && c15406.m36457(C15406.f47180)) {
                c2609M8246 = c2609M8246.m8243((Function) this.f28247.f37348);
            }
            C2609 c26011 = c2609M8246;
            if (abstractC4308.m12913(EnumC9454.ERROR)) {
                c6319 = c63110;
                abstractC4308M17535 = c6319.m17535(c5557.f17186.f17560);
            } else {
                c6319 = c63110;
                abstractC4308M17535 = c5557.f17186.f17560;
            }
            abstractC4308M17536 = abstractC4308M17535;
            AbstractC5698 abstractC5698M50312 = this.f28231.m50312(c19110, c1755, abstractC4308M17536, c26011, c26010);
            c19110.f60194 = abstractC5698M50312;
            C12171.m29642(!abstractC5698M50312.f17559.m4393());
            c19110.f60194 = abstractC5698M50312;
            c15240 = c15241;
            c19110.f60192 = m23932(c19110, abstractC4308M17536, abstractC5698M50312, c1755, new C23420(this, c15406, m23925(this.f28244.f66501, c26011, c26010), c15240.f46781, EnumC22756.f73480));
        }
        AbstractC5698 abstractC5698 = c19110.f60194;
        if (abstractC5698 == null || abstractC5698.f17559 != EnumC1296.f4571) {
            abstractC4308M17536 = c6319.m17535(c19110.f16086);
        }
        this.f28223 = m23934(c19110, abstractC4308M17536, C15406.f47181, this.f28213.mo38525(EnumC22756.f73481));
        c15240.m36122(c19110.f60198, c1756);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23906(C9310 c9310, C19110 c19110, AbstractC12612 abstractC12612, C23420 c23420, C5557 c5557, C1755 c1755, C2609 c2609, C2609 c26010, C15406 c15406, C0384 c0384) {
        c19110.f60192 = c0384.m1859(c19110.f60192);
        AbstractC12612 abstractC12613 = c19110.f60196;
        AbstractC4308 abstractC4308M1859 = c0384.m1859(abstractC12612.f16086);
        abstractC12612.f16086 = abstractC4308M1859;
        abstractC12613.f16086 = abstractC4308M1859;
        C23420 c23421 = c9310.f28213;
        try {
            c9310.f28213 = c23420;
            c9310.m23912(c19110, abstractC12612, abstractC12612.f16086, c5557, c1755, c2609, c26010, c15406);
        } finally {
            c9310.f28213 = c23421;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m23939(AbstractC12612 abstractC12612) {
        if (abstractC12612.mo989() != EnumC18550.f57548) {
            AbstractC10370 abstractC10370M19462 = C7260.m19462(abstractC12612);
            C6136 c6136 = this.f28229;
            if (abstractC10370M19462 != c6136.f18886 && abstractC10370M19462 != c6136.f18898) {
                EnumC18550 enumC18550 = EnumC18550.f57560;
                int i = abstractC12612.f16085;
                C17013 c17013 = this.f28249;
                c17013.f52172 = i;
                C6555 c6555M39913 = c17013.m39913(enumC18550, abstractC12612);
                c6555M39913.f2830 = this.f28220.m25478(abstractC12612, enumC18550, abstractC12612.f16086);
                c6555M39913.f16086 = abstractC12612.f16086;
                return c6555M39913;
            }
        }
        return abstractC12612;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        AbstractC4308 abstractC4308M17535;
        AbstractC5698 abstractC5698;
        AbstractC4308 c5138;
        AbstractC4308 abstractC4308M23954;
        AbstractC4308 abstractC4308 = c18404.f16086;
        C6319 c6319 = this.f28251;
        C12193 c12193M17535 = c6319.m17535(abstractC4308);
        C1755 c1755 = this.f28211;
        C1755 c1755M5877 = c1755.m5877(c18404, c1755.f6073);
        AbstractC12612 abstractC12612 = c18404.f57138;
        C22364 c22364 = this.f28253;
        C20661 c20661 = this.f28244;
        if (abstractC12612 != null) {
            abstractC4308M23954 = m23954(abstractC12612, c1755M5877, AbstractC4308.f13885);
            this.f28214.m36137((AbstractC5144) c18404.f57138, c1755M5877, true);
            C2609 c2609 = c18404.f57140;
            c5138 = abstractC4308M23954;
            while (c2609.m8249()) {
                m23929((AbstractC5144) c2609.f8240, c1755M5877, (AbstractC4308) c20661.f66452);
                C5138 c5139 = new C5138(c5138, c20661.f66505);
                c2609 = c2609.f8241;
                c5138 = c5139;
            }
        } else {
            if (this.f28213.f75219.m12913(EnumC9454.ARRAY)) {
                abstractC4308M17535 = c6319.m17515(this.f28213.f75219);
            } else {
                if (!this.f28213.f75219.m12913(EnumC9454.ERROR) && ((abstractC5698 = ((C8604) this.f28211.f6073).f26293) == null || !abstractC5698.f17560.mo12948())) {
                    AbstractC4308 abstractC4309 = this.f28213.f75219;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c18404, new C12281("compiler", "illegal.initializer.for.type", abstractC4309));
                }
                abstractC4308M17535 = c6319.m17535(this.f28213.f75219);
            }
            AbstractC4308 abstractC43010 = abstractC4308M17535;
            c5138 = c12193M17535;
            abstractC4308M23954 = abstractC43010;
        }
        C2609 c26010 = c18404.f57139;
        if (c26010 != null) {
            C18837 c18837 = new C18837();
            while (c26010.m8249()) {
                c18837.m43511(m23929((AbstractC5144) c26010.f8240, c1755M5877, abstractC4308M23954));
                c26010 = c26010.f8241;
            }
            c18837.m43517();
            c5138 = new C5138(abstractC4308M23954, c20661.f66505);
        }
        if (!c6319.m17477(abstractC4308M23954)) {
            c22364.m7273(c18404, C6241.f19293);
        }
        this.f28223 = m23934(c18404, c5138, C15406.f47181, this.f28213);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0212 A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:126:0x026f A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02d4 A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0303  */
    /* JADX WARN: Code duplicated, block: B:167:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x034c A[DONT_GENERATE, PHI: r1 r15 r16
      0x034c: PHI (r1v33 l.ۙ֨֨) = (r1v32 l.ۙ֨֨), (r1v36 l.ۙ֨֨) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r15v6 l.ۡۗ֨) = (r15v12 l.ۡۗ֨), (r15v13 l.ۡۗ֨) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r16v5 boolean) = (r16v3 boolean), (r16v6 boolean) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: ᩷֡֨ -> 0x008c, all -> 0x02e4, ۛܶ֨ -> 0x02ee, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[Catch: ᩷֡֨ -> 0x008c, all -> 0x02e4, ۛܶ֨ -> 0x02ee, TRY_LEAVE, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: ᩷֡֨ -> 0x008c, all -> 0x02e4, ۛܶ֨ -> 0x02ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0176 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0186 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TRY_LEAVE, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) throws Throwable {
        boolean z;
        AbstractC5698 abstractC5698;
        boolean z2;
        Object obj;
        C6319 c6319;
        AbstractC4308 abstractC4308;
        C2609 c2609M19434;
        AbstractC4308 abstractC4309;
        AbstractC4308 abstractC43010;
        boolean z3;
        boolean zM12913;
        C5931 c5931;
        C22364 c22364;
        C23420 c23420M23941;
        C2735 c2735;
        C15406 c15406;
        boolean z4;
        AbstractC4308 abstractC4308M23934;
        C2609 c2609Mo12933;
        C2609 c2609;
        boolean z5;
        AbstractC4308 abstractC43011;
        C11488 c11488;
        AbstractC4308 abstractC43012;
        AbstractC4308 abstractC43013;
        C11488 c11489;
        AbstractC4308 abstractC43014;
        C11488 c114810;
        C17013 c17013 = this.f28249;
        C10222 c10222 = this.f28224;
        boolean zMo12948 = this.f28213.f75219.mo12948();
        C22364 c22365 = this.f28253;
        C14247 c14247 = this.f28254;
        if (zMo12948 || (this.f28213.f75219.m12913(EnumC9454.NONE) && this.f28213.f75219 != AbstractC4308.f13884)) {
            if (this.f28213.f75219.m12913(EnumC9454.NONE) && ((abstractC5698 = ((C8604) this.f28211.f6073).f26293) == null || !abstractC5698.f17560.mo12948())) {
                c22365.m7273(c14169, C6241.f19233);
            }
            this.f28213 = c14247;
            z = true;
        } else {
            z = false;
        }
        C1755 c1755M23922 = m23922(c14169, this.f28211);
        Object obj2 = c1755M23922.f6073;
        boolean z6 = this.f28213.f75215.mo3860().f20970 == EnumC13829.CHECK;
        C6319 c63110 = this.f28251;
        try {
            if (!z6) {
                if (c14169.f42773 == EnumC16992.EXPLICIT) {
                    m23956(c14169.f42775, c1755M23922);
                    c2609M19434 = C7260.m19434(c14169.f42775);
                } else {
                    c2609M19434 = null;
                }
                C6487 c6487M23938 = m23938(c14169, this.f28213, c2609M19434);
                abstractC4309 = c6487M23938.f20021;
                abstractC43010 = c6487M23938.f20020;
                if (abstractC4309.mo12948()) {
                    c14169.f16086 = abstractC4309;
                    this.f28223 = abstractC4309;
                    ((C8604) obj2).f26285.mo26377();
                    if (z6) {
                        AbstractC4308 abstractC43015 = this.f28223;
                        m23930(c14169, this.f28211, c14247);
                        if (abstractC43014 == c114810) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C23420 c23420 = this.f28213;
                z3 = z;
                c6319 = c63110;
                m23902(c1755M23922, c14169, c23420.f75219, abstractC43010, abstractC4309, c23420.f75215);
                zM12913 = abstractC43010.m12913(EnumC9454.FORALL);
                c5931 = this.f28210;
                if (zM12913) {
                    EnumC8352 enumC8352M49076 = C21758.m49076(abstractC4309.f13890);
                    AbstractC19810 abstractC19810 = abstractC4309.f13890;
                    C11576 c11576 = C11886.f35440;
                    this.f28213.f75215.mo1084(c14169, c5931.m16617(new C11576("compiler", "invalid.generic.lambda.target", abstractC43010, enumC8352M49076, abstractC19810)));
                    C12193 c12193M17535 = c6319.m17535(this.f28213.f75219);
                    c14169.f16086 = c12193M17535;
                    this.f28223 = c12193M17535;
                    ((C8604) obj2).f26285.mo26377();
                    if (z6) {
                        AbstractC4308 abstractC43016 = this.f28223;
                        m23930(c14169, this.f28211, c14247);
                        if (abstractC43013 == c11489) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (c14169.f42773 == EnumC16992.IMPLICIT) {
                    c2609Mo12933 = abstractC43010.mo12933();
                    c2609 = c14169.f42775;
                    z5 = false;
                    while (c2609.m8249()) {
                        if (c2609Mo12933.isEmpty()) {
                            z5 = true;
                        }
                        if (z5) {
                            abstractC43012 = this.f28244.f66457;
                        } else {
                            abstractC43012 = (AbstractC4308) c2609Mo12933.f8240;
                        }
                        C22364 c22366 = c22365;
                        if (((C9378) c2609.f8240).m24209()) {
                            m23909((C9378) c2609.f8240, abstractC43012);
                        }
                        ((C9378) c2609.f8240).f28489 = null;
                        if (c2609Mo12933.isEmpty()) {
                            c2609Mo12933 = c2609Mo12933.f8241;
                        }
                        c2609 = c2609.f8241;
                        z5 = z5;
                        c22365 = c22366;
                    }
                    c22364 = c22365;
                    m23956(c14169.f42775, c1755M23922);
                    if (z5) {
                        this.f28213.f75215.mo1084(c14169, c5931.m16617(C11886.f35463));
                        C12193 c12193M17536 = c6319.m17535(abstractC4309);
                        c14169.f16086 = c12193M17536;
                        this.f28223 = c12193M17536;
                        ((C8604) obj2).f26285.mo26377();
                        if (z6) {
                            AbstractC4308 abstractC43017 = this.f28223;
                            m23930(c14169, this.f28211, c14247);
                            if (abstractC43011 == c11488) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    c22364 = c22365;
                }
                c23420M23941 = m23941(c14169, abstractC43010, this.f28213);
                ((C8604) obj2).f26284 = c23420M23941;
                if (c14169.m33819() == EnumC13706.EXPRESSION) {
                    m23930(c14169.f42776, c1755M23922, c23420M23941);
                } else {
                    c2735 = (C2735) c14169.f42776;
                    if (c2735 == null) {
                        m23919(c1755M23922);
                        throw new C10057();
                    }
                    m23956(c2735.f8521, c1755M23922);
                }
                c15406 = C15406.f47181;
                this.f28223 = m23934(c14169, abstractC4309, c15406, this.f28213);
                if (this.f28213.f75215.mo3860().f20970 == EnumC13829.SPECULATIVE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f28225.m21193();
                new C12878(this).mo10758(c14169.f42776);
                c10222.m25664(this.f28211, c14169, c17013, z4);
                c14169.f16086 = abstractC4309;
                m23949(c14169, abstractC43010, this.f28213.f75215);
                if (!z4) {
                    if (this.f28213.f75215.mo3857().m1873(abstractC43010.mo12930())) {
                        C2609 c2609Mo12930 = abstractC43010.mo12930();
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(c14169, new C12281("compiler", "incompatible.thrown.types.in.mref", c2609Mo12930));
                    }
                    m23914(c14169, c1755M23922, this.f28213.f75215.mo3857(), C2609.m8238((Object[]) new AbstractC4308[]{abstractC43010, abstractC4309}));
                }
                if (z3) {
                    abstractC4308M23934 = c6319.m17535(this.f28213.f75219);
                    c14169.f16086 = abstractC4308M23934;
                } else {
                    abstractC4308M23934 = m23934(c14169, abstractC4309, c15406, this.f28213);
                }
                this.f28223 = abstractC4308M23934;
                ((C8604) obj2).f26285.mo26377();
            }
            try {
                try {
                    try {
                        if (m23951(this.f28213.f75219)) {
                            ((C8604) obj2).f26287 = true;
                            ((C8604) obj2).f26298 = true;
                        }
                        if (c14169.f42773 == EnumC16992.EXPLICIT) {
                            m23956(c14169.f42775, c1755M23922);
                            c2609M19434 = C7260.m19434(c14169.f42775);
                        } else {
                            c2609M19434 = null;
                        }
                        C6487 c6487M23939 = m23938(c14169, this.f28213, c2609M19434);
                        abstractC4309 = c6487M23939.f20021;
                        abstractC43010 = c6487M23939.f20020;
                        if (abstractC4309.mo12948()) {
                            c14169.f16086 = abstractC4309;
                            this.f28223 = abstractC4309;
                            ((C8604) obj2).f26285.mo26377();
                            if (z6) {
                                AbstractC4308 abstractC43018 = this.f28223;
                                try {
                                    m23930(c14169, this.f28211, c14247);
                                    if (abstractC43014 == c114810) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    if (this.f28223 == AbstractC4308.f13884) {
                                        this.f28223 = abstractC43018;
                                    }
                                }
                            }
                            return;
                        }
                        C23420 c23421 = this.f28213;
                        z3 = z;
                        c6319 = c63110;
                        try {
                            m23902(c1755M23922, c14169, c23421.f75219, abstractC43010, abstractC4309, c23421.f75215);
                            zM12913 = abstractC43010.m12913(EnumC9454.FORALL);
                            c5931 = this.f28210;
                            if (zM12913) {
                                EnumC8352 enumC8352M49077 = C21758.m49076(abstractC4309.f13890);
                                AbstractC19810 abstractC19811 = abstractC4309.f13890;
                                C11576 c11577 = C11886.f35440;
                                this.f28213.f75215.mo1084(c14169, c5931.m16617(new C11576("compiler", "invalid.generic.lambda.target", abstractC43010, enumC8352M49077, abstractC19811)));
                                C12193 c12193M17537 = c6319.m17535(this.f28213.f75219);
                                c14169.f16086 = c12193M17537;
                                this.f28223 = c12193M17537;
                                ((C8604) obj2).f26285.mo26377();
                                if (z6) {
                                    AbstractC4308 abstractC43019 = this.f28223;
                                    try {
                                        m23930(c14169, this.f28211, c14247);
                                        if (abstractC43013 == c11489) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    } finally {
                                        if (this.f28223 == AbstractC4308.f13884) {
                                            this.f28223 = abstractC43019;
                                        }
                                    }
                                }
                                return;
                            }
                            if (c14169.f42773 == EnumC16992.IMPLICIT) {
                                c2609Mo12933 = abstractC43010.mo12933();
                                c2609 = c14169.f42775;
                                z5 = false;
                                while (c2609.m8249()) {
                                    if (c2609Mo12933.isEmpty()) {
                                        z5 = true;
                                    }
                                    if (z5) {
                                        abstractC43012 = this.f28244.f66457;
                                    } else {
                                        abstractC43012 = (AbstractC4308) c2609Mo12933.f8240;
                                    }
                                    C22364 c22367 = c22365;
                                    if (((C9378) c2609.f8240).m24209()) {
                                        m23909((C9378) c2609.f8240, abstractC43012);
                                    }
                                    ((C9378) c2609.f8240).f28489 = null;
                                    if (c2609Mo12933.isEmpty()) {
                                        c2609Mo12933 = c2609Mo12933.f8241;
                                    }
                                    c2609 = c2609.f8241;
                                    z5 = z5;
                                    c22365 = c22367;
                                }
                                c22364 = c22365;
                                m23956(c14169.f42775, c1755M23922);
                                if (z5) {
                                    this.f28213.f75215.mo1084(c14169, c5931.m16617(C11886.f35463));
                                    C12193 c12193M17538 = c6319.m17535(abstractC4309);
                                    c14169.f16086 = c12193M17538;
                                    this.f28223 = c12193M17538;
                                    ((C8604) obj2).f26285.mo26377();
                                    if (z6) {
                                        AbstractC4308 abstractC430110 = this.f28223;
                                        try {
                                            m23930(c14169, this.f28211, c14247);
                                            if (abstractC43011 == c11488) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        } finally {
                                            if (this.f28223 == AbstractC4308.f13884) {
                                                this.f28223 = abstractC430110;
                                            }
                                        }
                                    }
                                    return;
                                }
                            } else {
                                c22364 = c22365;
                            }
                            try {
                                c23420M23941 = m23941(c14169, abstractC43010, this.f28213);
                                ((C8604) obj2).f26284 = c23420M23941;
                                if (c14169.m33819() == EnumC13706.EXPRESSION) {
                                    m23930(c14169.f42776, c1755M23922, c23420M23941);
                                } else {
                                    c2735 = (C2735) c14169.f42776;
                                    if (c2735 == null && this.f28213.f75215.mo3860().f20970 == EnumC13829.CHECK) {
                                        m23919(c1755M23922);
                                        throw new C10057();
                                    }
                                    m23956(c2735.f8521, c1755M23922);
                                }
                                c15406 = C15406.f47181;
                                this.f28223 = m23934(c14169, abstractC4309, c15406, this.f28213);
                                if (this.f28213.f75215.mo3860().f20970 == EnumC13829.SPECULATIVE) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                this.f28225.m21193();
                                new C12878(this).mo10758(c14169.f42776);
                                c10222.m25664(this.f28211, c14169, c17013, z4);
                                c14169.f16086 = abstractC4309;
                                m23949(c14169, abstractC43010, this.f28213.f75215);
                                if (!z4) {
                                    if (this.f28213.f75215.mo3857().m1873(abstractC43010.mo12930()) && !m23950(c10222.m25663(this.f28211, c14169, c17013), abstractC43010.mo12930(), this.f28213.f75215.mo3857())) {
                                        C2609 c2609Mo12931 = abstractC43010.mo12930();
                                        C12281 c12282 = C6241.f19132;
                                        c22364.m7273(c14169, new C12281("compiler", "incompatible.thrown.types.in.mref", c2609Mo12931));
                                    }
                                    m23914(c14169, c1755M23922, this.f28213.f75215.mo3857(), C2609.m8238((Object[]) new AbstractC4308[]{abstractC43010, abstractC4309}));
                                }
                                if (z3) {
                                    abstractC4308M23934 = c6319.m17535(this.f28213.f75219);
                                    c14169.f16086 = abstractC4308M23934;
                                } else {
                                    abstractC4308M23934 = m23934(c14169, abstractC4309, c15406, this.f28213);
                                }
                                this.f28223 = abstractC4308M23934;
                                ((C8604) obj2).f26285.mo26377();
                            } catch (C6130 e) {
                                e = e;
                                z6 = false;
                                this.f28213.f75215.mo1084(c14169, e.m17050());
                                C12193 c12193M17539 = c6319.m17535(this.f28213.f75219);
                                c14169.f16086 = c12193M17539;
                                this.f28223 = c12193M17539;
                                C8604 c8604 = (C8604) obj2;
                                c8604.f26285.mo26377();
                                obj2 = c8604;
                                if (z6) {
                                    abstractC4308 = this.f28223;
                                    try {
                                        m23930(c14169, this.f28211, c14247);
                                    } finally {
                                        if (this.f28223 == AbstractC4308.f13884) {
                                            this.f28223 = abstractC4308;
                                        }
                                    }
                                }
                            } catch (C20515 e2) {
                                e = e2;
                                z6 = false;
                                this.f28214.m36110(c14169, e);
                                C8604 c8605 = (C8604) obj2;
                                c8605.f26285.mo26377();
                                obj2 = c8605;
                                if (z6) {
                                    abstractC4308 = this.f28223;
                                    try {
                                        m23930(c14169, this.f28211, c14247);
                                    } finally {
                                        if (this.f28223 == AbstractC4308.f13884) {
                                            this.f28223 = abstractC4308;
                                        }
                                    }
                                }
                            }
                        } catch (C6130 e3) {
                            e = e3;
                        }
                    } catch (C20515 e4) {
                        e = e4;
                        this.f28214.m36110(c14169, e);
                        C8604 c8606 = (C8604) obj2;
                        c8606.f26285.mo26377();
                        obj2 = c8606;
                        if (z6) {
                            abstractC4308 = this.f28223;
                            m23930(c14169, this.f28211, c14247);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = false;
                        obj = obj2;
                        ((C8604) obj).f26285.mo26377();
                        if (z2) {
                            AbstractC4308 abstractC43020 = this.f28223;
                            try {
                                m23930(c14169, this.f28211, c14247);
                            } finally {
                                if (this.f28223 == AbstractC4308.f13884) {
                                    this.f28223 = abstractC43020;
                                }
                            }
                        }
                        throw th;
                    }
                }
            } catch (C6130 e5) {
                e = e5;
                c6319 = c63110;
                this.f28213.f75215.mo1084(c14169, e.m17050());
                C12193 c12193M175310 = c6319.m17535(this.f28213.f75219);
                c14169.f16086 = c12193M175310;
                this.f28223 = c12193M175310;
                C8604 c8607 = (C8604) obj2;
                c8607.f26285.mo26377();
                obj2 = c8607;
                if (z6) {
                    abstractC4308 = this.f28223;
                    m23930(c14169, this.f28211, c14247);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = z6;
            obj = obj2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6487 m23938(AbstractC4293 abstractC4293, C23420 c23420, C2609 c2609) {
        AbstractC4308 c10658;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC4309 = c23420.f75219;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC4308M17535 = AbstractC4308.f13884;
        C6319 c6319 = this.f28251;
        if (abstractC4309 != abstractC4308M17535) {
            C2086 c2086 = this.f28237;
            c2086.getClass();
            AbstractC4308 abstractC4308M18346 = (AbstractC4308) abstractC4309.mo2962(c2086, abstractC4293);
            abstractC4308M18346.getClass();
            boolean z = abstractC4308M18346 instanceof C5843;
            C6735 c6735 = this.f28252;
            if (z) {
                C18837 c18837 = new C18837();
                for (AbstractC4308 abstractC4308M18347 : ((C5843) abstractC4308M18346).m16366()) {
                    if (c2609 != null) {
                        try {
                            abstractC4308M18347 = c6735.m18346(abstractC4293, abstractC4308M18347, c2609, interfaceC3953);
                        } catch (C6130 unused) {
                        }
                    }
                    c18837.m43511(c6319.m17537(abstractC4308M18347));
                }
                abstractC4308M17535 = c6319.m17534(c18837.m43517());
                abstractC4308M17535.f13890.f17563 |= 512;
                c10658 = c6319.m17538(abstractC4308M17535);
            } else {
                if (c2609 != null) {
                    abstractC4308M18346 = c6735.m18346(abstractC4293, abstractC4308M18346, c2609, interfaceC3953);
                }
                abstractC4308M17535 = c6319.m17537(abstractC4308M18346);
                c10658 = c6319.m17538(abstractC4308M17535);
            }
        } else {
            int i = C0883.f3449[abstractC4293.mo989().ordinal()];
            C20661 c20661 = this.f28244;
            if (i == 2) {
                C2609 c2609M8239 = C2609.m8239();
                Iterator it = ((C14169) abstractC4293).f42775.iterator();
                while (it.hasNext()) {
                    AbstractC12612 abstractC12612 = ((C9378) it.next()).f28488;
                    c2609M8239 = (abstractC12612 == null || (abstractC4308 = abstractC12612.f16086) == null) ? c2609M8239.m8242(c20661.f66457) : c2609M8239.m8242(abstractC4308);
                }
                c10658 = new C10658(c2609M8239, AbstractC4308.f13884, C2609.of((Object) c20661.f66479), c20661.f66481);
            } else {
                if (i != 3) {
                    C12171.m29640("Cannot get here!");
                    throw null;
                }
                c10658 = new C10658(C2609.m8239(), abstractC4308M17535, C2609.of((Object) c20661.f66479), c20661.f66481);
            }
        }
        if (abstractC4293.m14709(EnumC18550.f57523) && c10658.m12913(EnumC9454.FORALL)) {
            EnumC8352 enumC8352M49076 = C21758.m49076(abstractC4308M17535.f13890);
            AbstractC19810 abstractC19810 = abstractC4308M17535.f13890;
            C11576 c11576 = C11886.f35440;
            interfaceC3953.mo1084(abstractC4293, this.f28210.m16617(new C11576("compiler", "invalid.generic.lambda.target", c10658, enumC8352M49076, abstractC19810)));
            abstractC4308M17535 = c6319.m17535(this.f28213.f75219);
        }
        C6487 c6487 = new C6487();
        c6487.f20021 = abstractC4308M17535;
        c6487.f20020 = c10658;
        return c6487;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23914(final AbstractC23195 abstractC23195, final C1755 c1755, C0384 c0384, final C2609 c2609) {
        if (c0384.m1873(c2609)) {
            c0384.m1864(c2609, new InterfaceC3748() { // from class: l.ܰ᩶֨
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0385) {
                    this.f42437.m23914(abstractC23195, c1755, c0385, c0385.m1857(c2609));
                }
            });
            return;
        }
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            this.f28231.f72575.m21837(c1755, (AbstractC4308) it.next());
        }
    }

    public C9310(C2903 c2903) {
        c2903.m8841(f28208, this);
        this.f28229 = C6136.m17057(c2903);
        this.f28253 = C22364.m50099(c2903);
        this.f28244 = C20661.m47250(c2903);
        this.f28231 = C22406.m50289(c2903);
        this.f28220 = C10139.m25473(c2903);
        C15240 c15240M36054 = C15240.m36054(c2903);
        this.f28214 = c15240M36054;
        this.f28224 = C10222.m25648(c2903);
        this.f28234 = C16672.m39193(c2903);
        if (((C11139) c2903.m8838(C11139.f33424)) == null) {
            new C11139(c2903);
        }
        this.f28249 = C17013.m39896(c2903);
        this.f28219 = C13809.m33121(c2903);
        this.f28252 = C6735.m18336(c2903);
        this.f28221 = C4224.m12719(c2903);
        C12399 c12399M30567 = C12399.m30567(c2903);
        this.f28247 = c12399M30567;
        this.f28239 = C4658.m13638(c2903);
        EnumC10892.m27201(c2903);
        this.f28251 = C6319.m17456(c2903);
        C23168 c23168M51341 = C23168.m51341(c2903);
        this.f28232 = c23168M51341;
        this.f28210 = C5931.m16615(c2903);
        this.f28250 = C13395.m32391(c2903);
        this.f28256 = C17214.m40507(c2903);
        this.f28248 = C18230.m42469(c2903);
        this.f28222 = C16782.m39518(c2903);
        AbstractC17926.m41937(c2903);
        this.f28227 = C5572.m15819(c2903);
        C1856 c1856 = (C1856) c2903.m8838(C1856.f6337);
        this.f28216 = c1856 == null ? new C1856(c2903) : c1856;
        C7898 c7898 = (C7898) c2903.m8838(C7898.f24468);
        this.f28225 = c7898 == null ? new C7898(c2903) : c7898;
        C11781 c11781M28823 = C11781.m28823(c2903);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f28241 = EnumC10637.f32002.m26686(enumC16280M38301);
        this.f28255 = EnumC10637.f31996.m26686(enumC16280M38301);
        EnumC10637.f32004.m26686(enumC16280M38301);
        this.f28212 = EnumC10637.f31991.m26686(enumC16280M38301);
        this.f28236 = EnumC10637.f32001.m26686(enumC16280M38301);
        this.f28243 = EnumC10637.f31983.m26686(enumC16280M38301);
        this.f28245 = EnumC10637.f32007.m26686(enumC16280M38301);
        this.f28230 = (c23168M51341.m51347() || !c23168M51341.m51351(EnumC10637.f31989)) && EnumC10637.f31989.m26686(enumC16280M38301);
        this.f28242 = enumC16280M38301.f50071;
        this.f28240 = c11781M28823.m28831("useBeforeDeclarationWarning");
        C15406 c15406 = C15406.f47184;
        C11488 c11488 = AbstractC4308.f13885;
        this.f28246 = new C23420(this, c15406, c11488);
        this.f28215 = new C23420(this, C15406.f47183, c11488);
        this.f28228 = new C23420(this, C15406.f47181, c11488);
        this.f28233 = new C16364(this, c15240M36054.f46781);
        this.f28226 = new C23420(this, C15406.f47189, c11488);
        EnumC22756 enumC22756 = EnumC22756.f73483;
        this.f28254 = new C14247(this, c12399M30567.f37355, AbstractC4308.f13884);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23420 m23941(C14169 c14169, AbstractC4308 abstractC4308, C23420 c23420) {
        InterfaceC3953 c7234;
        if (c14169.m33819() == EnumC13706.EXPRESSION) {
            c7234 = new C13583(this, (AbstractC12612) c14169.f42776, c23420.f75215);
        } else {
            c7234 = new C7234(this, c23420.f75215);
        }
        if (abstractC4308.mo12923() == AbstractC4308.f13884) {
            return this.f28254;
        }
        return new C23420(this, C15406.f47181, abstractC4308.mo12923(), c7234);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23949(C14169 c14169, AbstractC4308 abstractC4308, InterfaceC3953 interfaceC3953) {
        AbstractC4308 abstractC4308M1868 = interfaceC3953.mo3857().m1868(abstractC4308.mo12923());
        EnumC13706 enumC13706M33819 = c14169.m33819();
        EnumC13706 enumC13706 = EnumC13706.STATEMENT;
        C5931 c5931 = this.f28210;
        if (enumC13706M33819 == enumC13706 && c14169.f42774 && !abstractC4308M1868.m12913(EnumC9454.VOID) && abstractC4308M1868 != AbstractC4308.f13884) {
            interfaceC3953.mo1084(c14169, c5931.m16617(new C11576("compiler", "incompatible.ret.type.in.lambda", C11886.m29010(abstractC4308M1868))));
        }
        if (this.f28251.m17549(interfaceC3953.mo3857().m1867(abstractC4308.mo12933()), C7260.m19434(c14169.f42775))) {
            return;
        }
        interfaceC3953.mo1084(c14169, c5931.m16617(C11886.f35463));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3581 m23953(C14163 c14163) {
        return (C3581) this.f28217.remove(c14163);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m23922(C14169 c14169, C1755 c1755) {
        C1755 c1755M5877;
        Object obj = c1755.f6073;
        C8604 c8604 = (C8604) obj;
        AbstractC14016 abstractC14016 = c8604.f26285;
        AbstractC5698 abstractC5698 = abstractC14016.f23673;
        if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4582) {
            C14163 c14163M16071 = abstractC5698.m16071();
            C8604 c8605 = (C8604) obj;
            AbstractC5698 abstractC5699 = c8605.f26285.f23673;
            long jMo16084 = abstractC5698.mo16084() & 8;
            C6136 c6136 = this.f28229;
            if (jMo16084 == 0) {
                Iterator it = c14163M16071.f42762.m20476(c6136.f18879).iterator();
                if (it.hasNext()) {
                    abstractC5699 = (AbstractC5698) it.next();
                }
            } else {
                HashMap map = this.f28217;
                C3581 c3581 = (C3581) map.get(c14163M16071);
                if (c3581 == null) {
                    C2609 c2609M8239 = C2609.m8239();
                    C20661 c20661 = this.f28244;
                    c3581 = new C3581(4106L, c6136.f18842, new C10658(c2609M8239, c20661.f66501, C2609.m8239(), c20661.f66481), c14163M16071);
                    c3581.f11367 = C2609.m8239();
                    map.put(c14163M16071, c3581);
                }
                abstractC5699 = c3581;
            }
            c1755M5877 = c1755.m5877(c14169, c8605.m22358(c8605.f26285.mo26383(abstractC5699)));
        } else {
            c1755M5877 = c1755.m5877(c14169, c8604.m22358(abstractC14016.mo26380(abstractC5698)));
        }
        C8604 c8606 = (C8604) c1755M5877.f6073;
        c8606.f26286 = null;
        c8606.f26294 = true;
        return c1755M5877;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e5 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:120:0x031f A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x035d A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x036a A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x036f  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0382 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x038e A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f7 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:157:0x0424  */
    /* JADX WARN: Code duplicated, block: B:158:0x0426  */
    /* JADX WARN: Code duplicated, block: B:161:0x0439 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8 A[Catch: ۛܶ֨ -> 0x0260, TRY_LEAVE, TryCatch #2 {ۛܶ֨ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:188:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0 A[Catch: ۛܶ֨ -> 0x0260, TryCatch #2 {ۛܶ֨ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:188:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0209 A[Catch: ۛܶ֨ -> 0x0260, TryCatch #2 {ۛܶ֨ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:188:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0234 A[Catch: ۛܶ֨ -> 0x025b, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x023a A[Catch: ۛܶ֨ -> 0x025b, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0243 A[Catch: ۛܶ֨ -> 0x025b, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x024b A[Catch: ۛܶ֨ -> 0x025b, TRY_LEAVE, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0273 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0284 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0289  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a9 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ae A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [l.ۗ۠۠, l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.ۛ᩸֨] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.ۘ۬֨] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) throws Throwable {
        AbstractC5698 abstractC5698;
        ?? r14;
        ?? r12;
        AbstractC4308 abstractC4308M17535;
        char c;
        AbstractC5698 abstractC5698M19472;
        boolean z;
        C2609 c2609M8239;
        C2609 c2609;
        EnumC13829 enumC13829;
        EnumC13829 enumC138210;
        boolean z2;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC4309;
        AbstractC4308 abstractC43010;
        EnumC11091 enumC11091;
        C2609 c2609Mo12933;
        AbstractC9980 c20126;
        C2609 c2609M1874;
        EnumC11091 enumC11092;
        C9232 c9233;
        AbstractC5698 abstractC5699;
        AbstractC9001 abstractC9001;
        EnumC1296 enumC1296;
        AbstractC5698 abstractC5698Mo7048;
        EnumC11091 enumC11093;
        AbstractC4308 abstractC4308Mo12923;
        C2609 c26010;
        C23420 c23420Mo38524;
        AbstractC9001 abstractC9002;
        AbstractC4308 abstractC4308M23932;
        AbstractC4308 abstractC4308M17542;
        boolean z3;
        C6136 c6136;
        C15240 c15240;
        AbstractC4308 abstractC4308Mo4958;
        boolean z4;
        C16719 c16719Mo4076;
        AbstractC4520 c12281;
        C16719 c16719M16621;
        AbstractC4308 abstractC43011;
        C6136 c6137 = this.f28229;
        C22406 c22406 = this.f28231;
        boolean zMo12948 = this.f28213.f75219.mo12948();
        C22364 c22364 = this.f28253;
        C6319 c6319 = this.f28251;
        if (zMo12948 || (this.f28213.f75219.m12913(EnumC9454.NONE) && this.f28213.f75219 != AbstractC4308.f13884)) {
            if (this.f28213.f75219.m12913(EnumC9454.NONE) && ((abstractC5698 = ((C8604) this.f28211.f6073).f26293) == null || !abstractC5698.f17560.mo12948())) {
                c22364.m7273(c9232, C6241.f19306);
            }
            C12193 c12193M17535 = c6319.m17535(this.f28213.f75219);
            c9232.f16086 = c12193M17535;
            this.f28223 = c12193M17535;
            return;
        }
        C1755 c1755 = this.f28211;
        C1755 c1755M5877 = c1755.m5877(c9232, c1755.f6073);
        try {
            AbstractC12612 abstractC12612 = c9232.f27945;
            C2609 c26011 = c9232.f27947;
            EnumC11091 enumC11094 = c9232.f27940;
            AbstractC4308 abstractC4308M23930 = m23930(abstractC12612, this.f28211, m23955(c9232));
            EnumC11091 enumC11095 = EnumC11091.NEW;
            C15240 c15241 = this.f28214;
            if (enumC11094 == enumC11095) {
                abstractC4308M23930 = c15241.m36198(c9232.f27945, abstractC4308M23930);
                if (!abstractC4308M23930.mo12948() && abstractC4308M23930.mo12920() && c26011 != null) {
                    AbstractC12612 abstractC12613 = c9232.f27945;
                    abstractC12613.getClass();
                    EnumC8352 enumC8352M49077 = C21758.m49077(enumC11094);
                    C12281 c12282 = C6241.f19132;
                    enumC11095 = enumC11095;
                    enumC11094 = enumC11094;
                    c22364.m7273(abstractC12613, new C12281("compiler", "invalid.mref", enumC8352M49077, C11886.f35476));
                    abstractC4308M17535 = c6319.m17535(abstractC4308M23930);
                    c = 1;
                }
                if (abstractC4308M17535.mo12948()) {
                    c9232.f16086 = abstractC4308M17535;
                    this.f28223 = abstractC4308M17535;
                    return;
                }
                if (C7260.m19446(c9232.f27945, c6137)) {
                    c15241.m36137((AbstractC5144) c9232.f27945, this.f28211, false);
                } else {
                    abstractC5698M19472 = C7260.m19472(c9232.f27945);
                    C8604 c8604 = (C8604) c1755M5877.f6073;
                    if (abstractC5698M19472 == null && abstractC5698M19472.f17562 == c6137.f18898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c8604.f26296 = z;
                }
                c2609M8239 = C2609.m8239();
                if (c26011 != null) {
                    c2609M8239 = m23923(c26011, c1755M5877);
                    c15241.m36123(c26011, c2609M8239);
                }
                c2609 = c2609M8239;
                enumC13829 = this.f28213.f75215.mo3860().f20970;
                enumC138210 = EnumC13829.CHECK;
                if (enumC13829 == enumC138210 || !m23951(this.f28213.f75219)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C6487 c6487M23938 = m23938(c9232, this.f28213, (C2609) null);
                abstractC4308 = c6487M23938.f20021;
                abstractC4309 = c6487M23938.f20020;
                C23420 c23420 = this.f28213;
                abstractC43010 = abstractC4308M17535;
                enumC11091 = enumC11095;
                m23902(c1755M5877, c9232, c23420.f75219, abstractC4309, abstractC4308, c23420.f75215);
                c2609Mo12933 = abstractC4309.mo12933();
                c20126 = c22406.f72585;
                if (this.f28213.f75215.mo3857().m1873(c2609Mo12933)) {
                    c20126 = new C20126(c22406, this.f28213.f75215.mo3857());
                }
                try {
                    AbstractC9980 abstractC9980 = c20126;
                    c2609M1874 = this.f28213.f75215.mo3857().m1874();
                    try {
                        enumC11092 = enumC11094;
                        try {
                            C23069 c23069M50325 = this.f28231.m50325(c1755M5877, c9232, c9232.f27945.f16086, c9232.f27944, c2609Mo12933, c2609, c6487M23938.f20020, abstractC9980, this.f28213.f75215.mo3857(), c22406.f72588);
                            try {
                                this.f28213.f75215.mo3857().m1870(c2609M1874);
                                abstractC5699 = (AbstractC5698) c23069M50325.f74207;
                                abstractC9001 = (AbstractC9001) c23069M50325.f74208;
                                enumC1296 = abstractC5699.f17559;
                                if (enumC1296 == EnumC1296.f4571) {
                                    if (abstractC5699.m16075()) {
                                        abstractC5698Mo7048 = abstractC5699.mo7048();
                                    } else {
                                        abstractC5698Mo7048 = abstractC5699;
                                    }
                                    c9232.f27943 = abstractC5698Mo7048;
                                    c9232.f27942 = abstractC9001.mo9815(abstractC5698Mo7048);
                                    c9232.f27946 = c22406.m50330(c1755M5877, (AbstractC19810) c9232.f27943.m16071(), false);
                                    if (abstractC4309.mo12923() == AbstractC4308.f13884) {
                                        c9232.f16086 = abstractC4308;
                                        this.f28223 = abstractC4308;
                                        return;
                                    }
                                    if (((C8604) this.f28211.f6073).f26283.f23066) {
                                        enumC11093 = enumC11092;
                                    } else {
                                        enumC11093 = enumC11092;
                                        if (enumC11093 == enumC11091 && (abstractC4308Mo4958 = abstractC43010.mo4958()) != null && abstractC4308Mo4958.m12913(EnumC9454.CLASS)) {
                                            c22406.m50302((InterfaceC3109) c9232, this.f28211, abstractC43010, false);
                                        }
                                    }
                                    if (this.f28213.f75215.mo3860().f20970 == enumC138210) {
                                        if (enumC11093 == EnumC11091.INVOKE) {
                                            c6136 = c6137;
                                            if (!C7260.m19446(c9232.f27945, c6136) && c9232.f27942.m47009() && abstractC9001.f3940.mo12920()) {
                                                abstractC9001 = abstractC9001;
                                                c15240 = c15241;
                                                c15240.m36135(c9232.f27945, c1755M5877);
                                            }
                                            if (!c9232.f27943.mo15572() && C7260.m19446(c9232.f27945, c6136) && abstractC43010.mo12938().m8249()) {
                                                AbstractC12612 abstractC12614 = c9232.f27945;
                                                abstractC12614.getClass();
                                                EnumC8352 enumC8352M49078 = C21758.m49077(enumC11093);
                                                C12281 c12283 = C6241.f19132;
                                                Object[] objArr = new Object[2];
                                                objArr[0] = enumC8352M49078;
                                                objArr[c] = C11886.f35480;
                                                c22364.m7273(abstractC12614, new C12281("compiler", "invalid.mref", objArr));
                                                C12193 c12193M17536 = c6319.m17535(abstractC4308);
                                                c9232.f16086 = c12193M17536;
                                                this.f28223 = c12193M17536;
                                                return;
                                            }
                                            if (!abstractC5699.mo15572() && c9232.f27942 == EnumC20521.f66120) {
                                                c22406.m50326(c9232, c9232.f27943);
                                            }
                                            if (z2) {
                                                c15240.m36155((AbstractC12612) c9232, true);
                                            }
                                        } else {
                                            c6136 = c6137;
                                        }
                                        c15240 = c15241;
                                        if (!c9232.f27943.mo15572()) {
                                        }
                                        if (!abstractC5699.mo15572()) {
                                            c22406.m50326(c9232, c9232.f27943);
                                        }
                                        if (z2) {
                                            c15240.m36155((AbstractC12612) c9232, true);
                                        }
                                    } else {
                                        abstractC9001 = abstractC9001;
                                    }
                                    C23420 c23421 = this.f28213;
                                    if (abstractC4309.mo12923().m12913(EnumC9454.VOID)) {
                                        abstractC4308Mo12923 = AbstractC4308.f13885;
                                    } else {
                                        abstractC4308Mo12923 = abstractC4309.mo12923();
                                    }
                                    if (c9232.f27942.m47009()) {
                                        c26010 = c2609Mo12933.f8241;
                                    } else {
                                        c26010 = c2609Mo12933;
                                    }
                                    c23420Mo38524 = c23421.mo38524(m23925(abstractC4308Mo12923, c26010, c2609), new C7234(this, this.f28213.f75215), EnumC22756.f73480);
                                    abstractC9002 = abstractC9001;
                                    abstractC4308M23932 = m23932(c9232, abstractC9002.f3940, abstractC5699, c1755M5877, c23420Mo38524);
                                    if (c9232.f27942.m47009() && ((AbstractC4308) c2609Mo12933.f8240).m12928(this.f28213.f75215.mo3857().f1817) && !c6319.m17546(this.f28213.f75215.mo3857().m1868((AbstractC4308) c2609Mo12933.f8240), abstractC43010, true)) {
                                        C12171.m29640("Can't get here");
                                        throw null;
                                    }
                                    if (abstractC4308M23932.mo12948()) {
                                        abstractC4308M17542 = abstractC4308M23932;
                                    } else {
                                        abstractC4308M17542 = c6319.m17542(abstractC4308M23932, m23935(abstractC5699, abstractC9002.f3940, c9232.f27944, c23420Mo38524.f75219.mo12933(), abstractC4308M23932.mo12923()));
                                    }
                                    if (this.f28213.f75215.mo3860().f20970 == EnumC13829.SPECULATIVE) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c9232.f16086 = abstractC4308;
                                    m23946(c9232, abstractC4309, abstractC4308M17542, this.f28213.f75215, z3);
                                    if (!z3) {
                                        m23914(c9232, c1755M5877, this.f28213.f75215.mo3857(), C2609.m8238((Object[]) new AbstractC4308[]{abstractC4309, abstractC4308}));
                                    }
                                    this.f28223 = m23934(c9232, abstractC4308, C15406.f47181, this.f28213);
                                    return;
                                }
                                switch (C0883.f3447[enumC1296.ordinal()]) {
                                    case 1:
                                    case 2:
                                        z4 = false;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        z4 = true;
                                        break;
                                    default:
                                        C12171.m29640("unexpected result kind " + abstractC5699.f17559);
                                        throw null;
                                }
                                c16719Mo4076 = ((AbstractC5473) abstractC5699.mo7048()).mo4076(EnumC12986.FRAGMENT, c9232, abstractC43010.f13890, abstractC43010, c9232.f27944, c2609Mo12933, c2609);
                                C5931 c5931 = this.f28210;
                                C14397 c14397M7266 = c22364.m7266();
                                if (z4) {
                                    EnumC8352 enumC8352M49079 = C21758.m49077(enumC11092);
                                    C11576 c11576 = C11886.f35440;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = enumC8352M49079;
                                    objArr2[c] = c16719Mo4076;
                                    c12281 = new C11576("compiler", "invalid.mref", objArr2);
                                } else {
                                    EnumC8352 enumC8352M490710 = C21758.m49077(enumC11092);
                                    C12281 c12284 = C6241.f19132;
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = enumC8352M490710;
                                    objArr3[c] = c16719Mo4076;
                                    c12281 = new C12281("compiler", "invalid.mref", objArr3);
                                }
                                c5931.getClass();
                                c9233 = c9232;
                                try {
                                    c16719M16621 = c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397M7266, c9232, c12281);
                                    if (z4) {
                                        abstractC43011 = abstractC4308;
                                        if (abstractC43011 == AbstractC4308.f13884) {
                                            c9233.f16086 = abstractC43011;
                                            this.f28223 = abstractC43011;
                                            return;
                                        }
                                    } else {
                                        abstractC43011 = abstractC4308;
                                    }
                                    if (z4) {
                                        this.f28213.f75215.mo1084(c9233, c16719M16621);
                                    } else {
                                        c22364.mo7277(c16719M16621);
                                    }
                                    C12193 c12193M17537 = c6319.m17535(abstractC43011);
                                    c9233.f16086 = c12193M17537;
                                    this.f28223 = c12193M17537;
                                    return;
                                } catch (C6130 e) {
                                    e = e;
                                }
                            } catch (C6130 e2) {
                                e = e2;
                                c9233 = c9232;
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.f28213.f75215.mo3857().m1870(c2609M1874);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (C6130 e3) {
                    e = e3;
                    r12 = c22364;
                    r14 = c22406;
                }
            }
            abstractC4308M17535 = abstractC4308M23930;
            c = 1;
            if (abstractC4308M17535.mo12948()) {
                c9232.f16086 = abstractC4308M17535;
                this.f28223 = abstractC4308M17535;
                return;
            }
            if (C7260.m19446(c9232.f27945, c6137)) {
                c15241.m36137((AbstractC5144) c9232.f27945, this.f28211, false);
            } else {
                abstractC5698M19472 = C7260.m19472(c9232.f27945);
                C8604 c8605 = (C8604) c1755M5877.f6073;
                if (abstractC5698M19472 == null) {
                    z = false;
                } else {
                    z = false;
                }
                c8605.f26296 = z;
            }
            c2609M8239 = C2609.m8239();
            if (c26011 != null) {
                c2609M8239 = m23923(c26011, c1755M5877);
                c15241.m36123(c26011, c2609M8239);
            }
            c2609 = c2609M8239;
            enumC13829 = this.f28213.f75215.mo3860().f20970;
            enumC138210 = EnumC13829.CHECK;
            if (enumC13829 == enumC138210) {
                z2 = false;
            } else {
                z2 = false;
            }
            C6487 c6487M23939 = m23938(c9232, this.f28213, (C2609) null);
            abstractC4308 = c6487M23939.f20021;
            abstractC4309 = c6487M23939.f20020;
            C23420 c23422 = this.f28213;
            abstractC43010 = abstractC4308M17535;
            enumC11091 = enumC11095;
            m23902(c1755M5877, c9232, c23422.f75219, abstractC4309, abstractC4308, c23422.f75215);
            c2609Mo12933 = abstractC4309.mo12933();
            c20126 = c22406.f72585;
            if (this.f28213.f75215.mo3857().m1873(c2609Mo12933)) {
                c20126 = new C20126(c22406, this.f28213.f75215.mo3857());
            }
            AbstractC9980 abstractC9981 = c20126;
            c2609M1874 = this.f28213.f75215.mo3857().m1874();
            enumC11092 = enumC11094;
            C23069 c23069M50326 = this.f28231.m50325(c1755M5877, c9232, c9232.f27945.f16086, c9232.f27944, c2609Mo12933, c2609, c6487M23939.f20020, abstractC9981, this.f28213.f75215.mo3857(), c22406.f72588);
            this.f28213.f75215.mo3857().m1870(c2609M1874);
            abstractC5699 = (AbstractC5698) c23069M50326.f74207;
            abstractC9001 = (AbstractC9001) c23069M50326.f74208;
            enumC1296 = abstractC5699.f17559;
            if (enumC1296 == EnumC1296.f4571) {
                switch (C0883.f3447[enumC1296.ordinal()]) {
                    case 1:
                    case 2:
                        z4 = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z4 = true;
                        break;
                    default:
                        C12171.m29640("unexpected result kind " + abstractC5699.f17559);
                        throw null;
                }
                c16719Mo4076 = ((AbstractC5473) abstractC5699.mo7048()).mo4076(EnumC12986.FRAGMENT, c9232, abstractC43010.f13890, abstractC43010, c9232.f27944, c2609Mo12933, c2609);
                C5931 c5932 = this.f28210;
                C14397 c14397M7267 = c22364.m7266();
                if (z4) {
                    EnumC8352 enumC8352M490711 = C21758.m49077(enumC11092);
                    C11576 c11577 = C11886.f35440;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = enumC8352M490711;
                    objArr4[c] = c16719Mo4076;
                    c12281 = new C11576("compiler", "invalid.mref", objArr4);
                } else {
                    EnumC8352 enumC8352M490712 = C21758.m49077(enumC11092);
                    C12281 c12285 = C6241.f19132;
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = enumC8352M490712;
                    objArr5[c] = c16719Mo4076;
                    c12281 = new C12281("compiler", "invalid.mref", objArr5);
                }
                c5932.getClass();
                c9233 = c9232;
                c16719M16621 = c5932.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397M7267, c9232, c12281);
                if (z4) {
                    abstractC43011 = abstractC4308;
                    if (abstractC43011 == AbstractC4308.f13884) {
                        c9233.f16086 = abstractC43011;
                        this.f28223 = abstractC43011;
                        return;
                    }
                } else {
                    abstractC43011 = abstractC4308;
                }
                if (z4) {
                    this.f28213.f75215.mo1084(c9233, c16719M16621);
                } else {
                    c22364.mo7277(c16719M16621);
                }
                C12193 c12193M17538 = c6319.m17535(abstractC43011);
                c9233.f16086 = c12193M17538;
                this.f28223 = c12193M17538;
                return;
            }
            if (abstractC5699.m16075()) {
                abstractC5698Mo7048 = abstractC5699.mo7048();
            } else {
                abstractC5698Mo7048 = abstractC5699;
            }
            c9232.f27943 = abstractC5698Mo7048;
            c9232.f27942 = abstractC9001.mo9815(abstractC5698Mo7048);
            c9232.f27946 = c22406.m50330(c1755M5877, (AbstractC19810) c9232.f27943.m16071(), false);
            if (abstractC4309.mo12923() == AbstractC4308.f13884) {
                c9232.f16086 = abstractC4308;
                this.f28223 = abstractC4308;
                return;
            }
            if (((C8604) this.f28211.f6073).f26283.f23066) {
                enumC11093 = enumC11092;
                if (enumC11093 == enumC11091) {
                    c22406.m50302((InterfaceC3109) c9232, this.f28211, abstractC43010, false);
                }
            } else {
                enumC11093 = enumC11092;
            }
            if (this.f28213.f75215.mo3860().f20970 == enumC138210) {
                if (enumC11093 == EnumC11091.INVOKE) {
                    c6136 = c6137;
                    if (!C7260.m19446(c9232.f27945, c6136)) {
                    }
                } else {
                    c6136 = c6137;
                }
                c15240 = c15241;
                if (!c9232.f27943.mo15572()) {
                }
                if (!abstractC5699.mo15572()) {
                    c22406.m50326(c9232, c9232.f27943);
                }
                if (z2) {
                    c15240.m36155((AbstractC12612) c9232, true);
                }
            } else {
                abstractC9001 = abstractC9001;
            }
            C23420 c23423 = this.f28213;
            if (abstractC4309.mo12923().m12913(EnumC9454.VOID)) {
                abstractC4308Mo12923 = AbstractC4308.f13885;
            } else {
                abstractC4308Mo12923 = abstractC4309.mo12923();
            }
            if (c9232.f27942.m47009()) {
                c26010 = c2609Mo12933.f8241;
            } else {
                c26010 = c2609Mo12933;
            }
            c23420Mo38524 = c23423.mo38524(m23925(abstractC4308Mo12923, c26010, c2609), new C7234(this, this.f28213.f75215), EnumC22756.f73480);
            abstractC9002 = abstractC9001;
            abstractC4308M23932 = m23932(c9232, abstractC9002.f3940, abstractC5699, c1755M5877, c23420Mo38524);
            if (c9232.f27942.m47009()) {
                C12171.m29640("Can't get here");
                throw null;
            }
            if (abstractC4308M23932.mo12948()) {
                abstractC4308M17542 = c6319.m17542(abstractC4308M23932, m23935(abstractC5699, abstractC9002.f3940, c9232.f27944, c23420Mo38524.f75219.mo12933(), abstractC4308M23932.mo12923()));
            } else {
                abstractC4308M17542 = abstractC4308M23932;
            }
            if (this.f28213.f75215.mo3860().f20970 == EnumC13829.SPECULATIVE) {
                z3 = true;
            } else {
                z3 = false;
            }
            c9232.f16086 = abstractC4308;
            m23946(c9232, abstractC4309, abstractC4308M17542, this.f28213.f75215, z3);
            if (!z3) {
                m23914(c9232, c1755M5877, this.f28213.f75215.mo3857(), C2609.m8238((Object[]) new AbstractC4308[]{abstractC4309, abstractC4308}));
            }
            this.f28223 = m23934(c9232, abstractC4308, C15406.f47181, this.f28213);
            return;
            r14 = c6319;
            r12 = c9233;
            this.f28213.f75215.mo1084(r12, e.m17050());
            C12193 c12193M17539 = r14.m17535(this.f28213.f75219);
            r12.f16086 = c12193M17539;
            this.f28223 = c12193M17539;
        } catch (C6130 e4) {
            e = e4;
            r14 = c6319;
            r12 = c9232;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23420 m23955(C9232 c9232) {
        return new C23420(this, c9232.f27940 == EnumC11091.INVOKE ? C15406.f47178 : C15406.f47189, AbstractC4308.f13885);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23946(final C9232 c9232, AbstractC4308 abstractC4308, final AbstractC4308 abstractC4309, InterfaceC3953 interfaceC3953, boolean z) {
        AbstractC4308 abstractC4308Mo12923;
        C0384 c0384Mo3857 = interfaceC3953.mo3857();
        AbstractC4308 abstractC4308M1868 = c0384Mo3857.m1868(abstractC4308.mo12923());
        if (C0883.f3446[c9232.f27940.ordinal()] == 1 && !c9232.f27945.f16086.mo12920()) {
            abstractC4308Mo12923 = c9232.f27945.f16086;
        } else {
            abstractC4308Mo12923 = abstractC4309.mo12923();
        }
        EnumC9454 enumC9454 = EnumC9454.VOID;
        AbstractC4308 abstractC43010 = null;
        AbstractC4308 abstractC43011 = abstractC4308M1868.m12913(enumC9454) ? null : abstractC4308Mo12923;
        if (abstractC4308M1868.m12913(enumC9454) || abstractC4308Mo12923.m12913(enumC9454)) {
            abstractC43010 = abstractC43011;
        } else if (!abstractC4308Mo12923.mo12948()) {
            if (!((C23708) this.f28214.f46781).mo3859(interfaceC3953.mo3857().m1868(abstractC4308Mo12923), interfaceC3953.mo3857().m1868(abstractC4308M1868), interfaceC3953.mo3858(c9232, abstractC4308Mo12923, abstractC4308M1868))) {
                abstractC43010 = abstractC43011;
            }
        }
        if (abstractC43010 == null) {
            if (abstractC4309.m12928(c0384Mo3857.f1817)) {
                c0384Mo3857.m1864(C2609.of((Object) abstractC4309), new InterfaceC3748() { // from class: l.֨᩶֨
                    @Override // l.InterfaceC3748
                    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final void mo4673(C0384 c0384) {
                        c9232.f27939 = c0384.m1859(abstractC4309);
                    }
                });
            } else {
                c9232.f27939 = abstractC4309;
            }
        } else {
            interfaceC3953.mo1084(c9232, this.f28210.m16617(new C11576("compiler", "incompatible.ret.type.in.mref", C11886.m29011(abstractC4308Mo12923, abstractC4308.mo12923()))));
        }
        if (z || m23950(abstractC4309.mo12930(), abstractC4308.mo12930(), c0384Mo3857)) {
            return;
        }
        C2609 c2609Mo12930 = abstractC4309.mo12930();
        C12281 c12281 = C6241.f19132;
        this.f28253.m7273(c9232, new C12281("compiler", "incompatible.thrown.types.in.mref", c2609Mo12930));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23950(C2609 c2609, C2609 c26010, C0384 c0384) {
        C2609 c26011 = (C2609) C5378.stream(c26010).filter(new C6528(0, c0384)).collect(C2609.m8240());
        C2609 c2609M8244 = c26010.m8244(c26011);
        C2609<AbstractC4308> c26012 = (C2609) C5378.stream(c2609).filter(new Predicate() { // from class: l.ۢۙ֨
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
                return !this.f28397.f28214.m36184((AbstractC4308) obj);
            }
        }).collect(C2609.m8240());
        C18837 c18837 = new C18837();
        for (AbstractC4308 abstractC4308 : c26012) {
            Iterator it = c2609M8244.iterator();
            do {
                if (!it.hasNext()) {
                    c18837.m43511(abstractC4308);
                    break;
                }
            } while (!this.f28251.m17546(abstractC4308, (AbstractC4308) it.next(), true));
        }
        if (c26011.isEmpty() && !c18837.isEmpty()) {
            return false;
        }
        C2609 c2609M1867 = c0384.m1867(c26011);
        C19846.forEach(c18837, new C8645(0, this, c2609M1867));
        C5378.stream(c2609M1867).filter(new C15699()).forEach(new C2295());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23902(final C1755 c1755, final AbstractC23195 abstractC23195, final AbstractC4308 abstractC4308, final AbstractC4308 abstractC4309, final AbstractC4308 abstractC43010, final InterfaceC3953 interfaceC3953) {
        if (abstractC4309.m12928(interfaceC3953.mo3857().f1817)) {
            interfaceC3953.mo3857().m1864(C2609.of((Object) abstractC4308, (Object) abstractC4309), new InterfaceC3748() { // from class: l.ۙ᩶֨
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0384) {
                    AbstractC4308 abstractC43011 = abstractC43010;
                    this.f15381.m23902(c1755, abstractC23195, abstractC4308, c0384.m1859(abstractC4309), c0384.m1859(abstractC43011), interfaceC3953);
                }
            });
            return;
        }
        if (abstractC4308.m12913(EnumC9454.CLASS)) {
            abstractC23195.f74560 = abstractC43010;
        }
        if (interfaceC3953.mo3860().f20970 != EnumC13829.CHECK || abstractC4308 == AbstractC4308.f13884) {
            return;
        }
        try {
            C14163 c14163M17495 = this.f28251.m17495(c1755, this.f28229.f18867, abstractC23195.f74560, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            if (c14163M17495 != null) {
                this.f28214.m36140(c1755.f6074, c14163M17495, c14163M17495);
                try {
                    c14163M17495.f17563 |= 512;
                    this.f28251.m17538(c14163M17495.f17560);
                } catch (C6130 unused) {
                    this.f28213.f75215.mo1084(abstractC23195, this.f28210.m16617(C11886.m29013(abstractC23195.f74560)));
                }
            }
        } catch (C6130 e) {
            this.f28213.f75215.mo1084(c1755.f6074, e.m17050());
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1405(C14875 c14875) {
        AbstractC4308 abstractC4308M23930 = m23930(c14875.f45392, this.f28211, this.f28213);
        C23420 c23420 = this.f28213;
        this.f28223 = m23934(c14875, abstractC4308M23930, c23420.f75217, c23420);
        AbstractC5698 abstractC5698M19472 = C7260.m19472(c14875);
        if (abstractC5698M19472 == null || !abstractC5698M19472.f17559.m4391(C15406.f47182) || abstractC5698M19472.f17559 == EnumC1296.f4581) {
            return;
        }
        this.f28253.m7273(c14875, C6241.f19298);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        AbstractC12612 abstractC12612 = c21080.f67987;
        C1755 c1755 = this.f28211;
        AbstractC4308 abstractC4308M23930 = m23930(abstractC12612, c1755.m5877(c21080, c1755.f6073), this.f28215);
        AbstractC4308 abstractC4308M17523 = this.f28251.m17523(abstractC4308M23930);
        m23929((AbstractC5144) c21080.f67988, this.f28211, abstractC4308M23930);
        this.f28223 = m23934(c21080, abstractC4308M17523, C15406.f47181, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        AbstractC4308 abstractC4308M23930 = m23930(c9791.f29619, this.f28211, this.f28215);
        AbstractC4308 abstractC4308M23931 = m23930(c9791.f29618, this.f28211, this.f28228);
        EnumC18550 enumC18550M43096 = c9791.mo989().m43096();
        C10139 c10139 = this.f28220;
        C0758 c0758M25477 = c10139.m25477(c9791, enumC18550M43096, abstractC4308M23930, abstractC4308M23931);
        c9791.f2830 = c0758M25477;
        if (c0758M25477 != c10139.f30517 && !abstractC4308M23930.mo12948() && !abstractC4308M23931.mo12948()) {
            AbstractC12612 abstractC12612 = c9791.f29618;
            abstractC12612.getClass();
            C15240 c15240 = this.f28214;
            c15240.m36125(abstractC12612, c0758M25477, abstractC4308M23931);
            AbstractC12612 abstractC12613 = c9791.f29618;
            abstractC12613.getClass();
            c15240.m36105(abstractC12613, c0758M25477.f17560.mo12923(), abstractC4308M23930);
        }
        this.f28223 = m23934(c9791, abstractC4308M23930, C15406.f47181, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        AbstractC4308 abstractC4308M36202;
        AbstractC4308 abstractC4308Mo12923;
        C4658 c4658;
        AbstractC4308 abstractC4308M13639;
        if (c6555.mo989().m43093()) {
            abstractC4308M36202 = m23930(c6555.f20226, this.f28211, this.f28215);
        } else {
            AbstractC12612 abstractC12612 = c6555.f20226;
            abstractC12612.getClass();
            abstractC4308M36202 = this.f28214.m36202(abstractC12612, m23930(c6555.f20226, this.f28211, this.f28228));
        }
        EnumC18550 enumC18550Mo989 = c6555.mo989();
        C10139 c10139 = this.f28220;
        C0758 c0758M25478 = c10139.m25478(c6555, enumC18550Mo989, abstractC4308M36202);
        c6555.f2830 = c0758M25478;
        AbstractC4308 abstractC4308M17535 = this.f28251.m17535(c6555.f16086);
        if (c0758M25478 != c10139.f30517 && !abstractC4308M36202.mo12948()) {
            if (c6555.mo989().m43093()) {
                abstractC4308Mo12923 = c6555.f20226.f16086;
            } else {
                abstractC4308Mo12923 = c0758M25478.f17560.mo12923();
            }
            abstractC4308M17535 = abstractC4308Mo12923;
            int i = c0758M25478.f2814;
            if (abstractC4308M36202.mo12915() != null && (abstractC4308M13639 = (c4658 = this.f28239).m13639(i, abstractC4308M36202)) != null) {
                abstractC4308M17535 = c4658.m13641(abstractC4308M13639, abstractC4308M17535);
            }
        }
        this.f28223 = m23934(c6555, abstractC4308M17535, C15406.f47181, this.f28213);
        C7772 c7772 = this.f28218;
        this.f28216.getClass();
        if (c7772 != C1856.f6336 && c6555.m14709(EnumC18550.f57488)) {
            c7772 = new C7772(c7772.f24022, c7772.f24023, false);
        }
        this.f28218 = c7772;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        C2609 c2609M8239;
        C4658 c4658;
        AbstractC4308 abstractC4308M13640;
        AbstractC12612 abstractC12612 = c9085.f27533;
        abstractC12612.getClass();
        AbstractC12612 abstractC12613 = c9085.f27533;
        C1755 c1755 = this.f28211;
        C23420 c23420 = this.f28228;
        AbstractC4308 abstractC4308M23930 = m23930(abstractC12613, c1755, c23420);
        C15240 c15240 = this.f28214;
        AbstractC4308 abstractC4308M36202 = c15240.m36202(abstractC12612, abstractC4308M23930);
        C7772 c7772 = this.f28218;
        int i = C0883.f3449[c9085.mo989().ordinal()];
        if (i == 17) {
            c2609M8239 = c7772.f24023;
        } else if (i == 18) {
            c2609M8239 = c7772.f24022;
        } else {
            c2609M8239 = C2609.m8239();
        }
        C1755 c1756 = this.f28211;
        C1755 c1755M23896 = m23896(c1756, c1756.f6074, c2609M8239);
        Object obj = c1755M23896.f6073;
        try {
            AbstractC12612 abstractC12614 = c9085.f27532;
            abstractC12614.getClass();
            AbstractC4308 abstractC4308M36203 = c15240.m36202(abstractC12614, m23930(c9085.f27532, c1755M23896, c23420));
            ((C8604) obj).f26285.mo26377();
            this.f28218 = this.f28216.m6167(c9085, c7772, this.f28218);
            EnumC18550 enumC18550Mo989 = c9085.mo989();
            C10139 c10139 = this.f28220;
            C0758 c0758M25477 = c10139.m25477(c9085, enumC18550Mo989, abstractC4308M36202, abstractC4308M36203);
            c9085.f2830 = c0758M25477;
            AbstractC4308 abstractC4308 = c9085.f16086;
            C6319 c6319 = this.f28251;
            AbstractC4308 abstractC4308M17535 = c6319.m17535(abstractC4308);
            if (c0758M25477 != c10139.f30517 && !abstractC4308M36202.mo12948() && !abstractC4308M36203.mo12948()) {
                AbstractC4308 abstractC4308Mo12923 = c0758M25477.f17560.mo12923();
                int i2 = c0758M25477.f2814;
                if (abstractC4308M36202.mo12915() != null && abstractC4308M36203.mo12915() != null && (abstractC4308M13640 = (c4658 = this.f28239).m13640(i2, abstractC4308M36202, abstractC4308M36203)) != null) {
                    abstractC4308Mo12923 = c4658.m13641(abstractC4308M13640, abstractC4308Mo12923);
                }
                if ((i2 == 165 || i2 == 166) && !c6319.m17545(abstractC4308M36202, abstractC4308M36203, new C1386(c9085))) {
                    C12281 c12281 = C6241.f19132;
                    this.f28253.m7273(c9085, new C12281("compiler", "incomparable.types", abstractC4308M36202, abstractC4308M36203));
                }
                AbstractC12612 abstractC12615 = c9085.f27532;
                abstractC12615.getClass();
                c15240.m36125(abstractC12615, c0758M25477, abstractC4308M36203);
                abstractC4308M17535 = abstractC4308Mo12923;
            }
            this.f28223 = m23934(c9085, abstractC4308M17535, C15406.f47181, this.f28213);
        } catch (Throwable th) {
            ((C8604) obj).f26285.mo26377();
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        C23420 c23420;
        AbstractC4308 abstractC4308M23954 = m23954(c17844.f54511, this.f28211, AbstractC4308.f13885);
        AbstractC5144 abstractC5144 = c17844.f54511;
        C1755 c1755 = this.f28211;
        C15240 c15240 = this.f28214;
        boolean z = false;
        c15240.m36137(abstractC5144, c1755, false);
        C1755 c1756 = this.f28211;
        C1755 c1755M5877 = c1756.m5877(c17844, c1756.f6073);
        AbstractC12612 abstractC12612M19458 = C7260.m19458(c17844.f54512);
        if (this.f28241 && (abstractC12612M19458.m14709(EnumC18550.f57523) || abstractC12612M19458.m14709(EnumC18550.f57524))) {
            z = true;
        }
        if (z) {
            c23420 = new C23420(this, C15406.f47181, abstractC4308M23954, new C19229(this, this.f28213.f75215));
        } else {
            c23420 = this.f28228;
        }
        AbstractC4308 abstractC4308M23930 = m23930(c17844.f54512, c1755M5877, c23420);
        if (!z) {
            AbstractC12612 abstractC12612 = c17844.f54512;
            abstractC12612.getClass();
            abstractC4308M23954 = c15240.m36105(abstractC12612, abstractC4308M23930, abstractC4308M23954);
        }
        if (abstractC4308M23930.mo12915() != null) {
            abstractC4308M23954 = this.f28239.m13641(abstractC4308M23930, abstractC4308M23954);
        }
        this.f28223 = m23934(c17844, this.f28251.m17523(abstractC4308M23954), C15406.f47181, this.f28213);
        if (z) {
            return;
        }
        c15240.m36160(c17844);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        AbstractC4308 abstractC4308M17535;
        AbstractC5144 abstractC5144;
        InterfaceC3109 interfaceC3109 = c16286.f50075;
        interfaceC3109.getClass();
        AbstractC12612 abstractC12612 = c16286.f50075;
        C1755 c1755 = this.f28211;
        C23420 c23420 = this.f28228;
        AbstractC4308 abstractC4308M23930 = m23930(abstractC12612, c1755, c23420);
        C15240 c15240 = this.f28214;
        AbstractC4308 abstractC4308M36169 = c15240.m36169(interfaceC3109, abstractC4308M23930);
        EnumC18550 enumC18550Mo989 = c16286.f50076.mo989();
        EnumC18550 enumC18550 = EnumC18550.f57504;
        C22364 c22364 = this.f28253;
        boolean zM23916 = false;
        C6319 c6319 = this.f28251;
        if (enumC18550Mo989 != enumC18550 && c16286.f50076.mo989() != EnumC18550.f57514) {
            abstractC4308M17535 = m23954(c16286.f50076, this.f28211, AbstractC4308.f13885);
            abstractC5144 = c16286.f50076;
            c15240.m36137(abstractC5144, this.f28211, false);
        } else {
            m23930(c16286.f50076, this.f28211, c23420);
            abstractC4308M17535 = c16286.f50076.f16086;
            if (c6319.m17546(abstractC4308M36169, abstractC4308M17535, true) && !abstractC4308M36169.mo12948() && !abstractC4308M17535.mo12948()) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c16286, new C12281("compiler", "instanceof.pattern.no.subtype", abstractC4308M36169, abstractC4308M17535));
            }
            abstractC5144 = C7260.m19442((AbstractC21932) c16286.f50076).f49721.f28488;
        }
        if (!abstractC4308M17535.m12913(EnumC9454.TYPEVAR)) {
            abstractC5144.getClass();
            abstractC4308M17535 = c15240.m36104(abstractC5144, abstractC4308M17535);
        }
        if (!abstractC4308M17535.mo12948() && !c6319.m17477(abstractC4308M17535)) {
            if (this.f28243) {
                AbstractC12612 abstractC12613 = c16286.f50075;
                abstractC12613.getClass();
                zM23916 = m23916(abstractC12613, abstractC4308M36169, abstractC4308M17535);
            } else {
                c22364.m7280(EnumC20043.SOURCE_LEVEL, c16286, EnumC10637.f31983.m26684(this.f28242));
                this.f28243 = true;
            }
            if (!zM23916) {
                abstractC4308M17535 = c6319.m17535(abstractC4308M17535);
            }
        }
        InterfaceC3109 interfaceC31010 = c16286.f50075;
        interfaceC31010.getClass();
        c15240.m36105(interfaceC31010, abstractC4308M36169, abstractC4308M17535);
        this.f28223 = m23934(c16286, this.f28244.f66469, C15406.f47181, this.f28213);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23916(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C1386 c1386 = new C1386();
        if (!this.f28251.m17545(abstractC4308, abstractC4309, c1386)) {
            ((C23708) this.f28214.f46781).mo1084(interfaceC3109, this.f28210.m16617(C11886.m29011(abstractC4308, abstractC4309)));
            return false;
        }
        if (!c1386.m4870(EnumC20347.UNCHECKED)) {
            return true;
        }
        C12281 c12281 = C6241.f19132;
        this.f28253.m7273(interfaceC3109, new C12281("compiler", "instanceof.reifiable.not.safe", abstractC4308, abstractC4309));
        return false;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        C15406 c15406 = C15406.f47189;
        C23420 c23420 = this.f28213;
        C23420 c23421 = new C23420(this, c15406, c23420.f75219, c23420.f75215);
        C9378 c9378 = c16139.f49721;
        AbstractC4308 abstractC4308M23930 = m23930(c9378.f28488, this.f28211, c23421);
        c9378.f16086 = abstractC4308M23930;
        c16139.f16086 = abstractC4308M23930;
        C9378 c9379 = c16139.f49721;
        C16986 c16986 = new C16986(c9379.f28486.f7169, c9379.f28484, c9379.f28488.f16086, ((C8604) this.f28211.f6073).f26285.f23673);
        c16986.f36040 = c16139.f16085;
        C9378 c93710 = c16139.f49721;
        c93710.f28489 = c16986;
        AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
        C15240 c15240 = this.f28214;
        if (c15240.m36162((InterfaceC3109) c93710, (AbstractC5698) c16986, abstractC14016)) {
            C9378 c93711 = c16139.f49721;
            c93711.getClass();
            c15240.m36131((InterfaceC3109) c93711, (C12048) c16986, ((C8604) this.f28211.f6073).f26285);
        }
        C2609 c2609 = c16139.f49721.f28486.f7168;
        C1755 c1755 = this.f28211;
        C13395 c13395 = this.f28250;
        c13395.m32406(c2609, c1755, c16986, c16139);
        C9378 c93712 = c16139.f49721;
        c13395.m32408(c93712.f28488, this.f28211, c16986, c93712);
        c13395.m32413();
        c15240.m36137((AbstractC5144) c16139.f49721.f28488, this.f28211, true);
        this.f28223 = c16139.f16086;
        this.f28218 = new C7772(C2609.of((Object) c16986), C2609.m8239(), false);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1424(C21227 c21227) {
        m23930(c21227.f68420, this.f28211, this.f28228);
        AbstractC4308 abstractC4308 = c21227.f68420.f16086;
        c21227.f16086 = abstractC4308;
        this.f28223 = abstractC4308;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1402(C14022 c14022) {
        m23930(c14022.f42404, this.f28211, this.f28228);
        C7772 c7772 = this.f28218;
        C1755 c1755 = this.f28211;
        C1755 c1755M23896 = m23896(c1755, c1755.f6074, c7772.f24023);
        Object obj = c1755M23896.f6073;
        try {
            m23929((AbstractC5144) c14022.f42403, c1755M23896, (AbstractC4308) this.f28244.f66469);
            ((C8604) obj).f26285.mo26377();
            AbstractC4308 abstractC4308 = c14022.f42404.f16086;
            c14022.f16086 = abstractC4308;
            this.f28223 = abstractC4308;
            C7772 c7773 = this.f28218;
            C1856 c1856 = this.f28216;
            c1856.getClass();
            this.f28218 = c1856.m6168(c14022, c7772, c7773);
        } catch (Throwable th) {
            ((C8604) obj).f26285.mo26377();
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1404(C14728 c14728) {
        AbstractC4308 abstractC4308 = c14728.f16086;
        C6319 c6319 = this.f28251;
        AbstractC4308 abstractC4308M17535 = c6319.m17535(abstractC4308);
        AbstractC4308 abstractC4308M23930 = m23930(c14728.f44980, this.f28211, this.f28228);
        m23929((AbstractC5144) c14728.f44979, this.f28211, (AbstractC4308) this.f28244.f66452);
        if (c6319.m17512(abstractC4308M23930)) {
            abstractC4308M17535 = c6319.m17515(abstractC4308M23930);
        } else if (!abstractC4308M23930.m12913(EnumC9454.ERROR)) {
            C12281 c12281 = C6241.f19132;
            this.f28253.m7273(c14728, new C12281("compiler", "array.req.but.found", abstractC4308M23930));
        }
        if (!this.f28213.f75217.m36457(C15406.f47181)) {
            abstractC4308M17535 = c6319.m17523(abstractC4308M17535);
        }
        this.f28223 = m23934(c14728, abstractC4308M17535, C15406.f47179, this.f28213);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x030f  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        AbstractC4308 abstractC4308M17526;
        AbstractC5698 abstractC5698M23900;
        boolean z;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC4308M17527;
        EnumC1296 enumC1296;
        C15406 c15406M36455 = C15406.f47184;
        AbstractC10370 abstractC10370 = c6262.f19395;
        C6136 c6136 = this.f28229;
        AbstractC10370 abstractC10371 = c6136.f18886;
        AbstractC10370 abstractC10372 = c6136.f18894;
        AbstractC10370 abstractC10373 = c6136.f18898;
        if (abstractC10370 == abstractC10371 || abstractC10370 == abstractC10373 || abstractC10370 == abstractC10372) {
            c15406M36455 = C15406.f47189;
        } else {
            C15406 c15406 = this.f28213.f75217;
            C15406 c15407 = C15406.f47190;
            if (c15406.m36457(c15407)) {
                c15406M36455 = C15406.m36455(c15406M36455, c15407);
            }
            C15406 c15408 = this.f28213.f75217;
            C15406 c15409 = C15406.f47189;
            if (c15408.m36457(c15409)) {
                c15406M36455 = C15406.m36455(c15406M36455, c15409, c15407);
            }
            if (this.f28213.f75217.m36457(C15406.f47185)) {
                c15406M36455 = C15406.m36455(c15406M36455, C15406.f47181, c15409);
            }
        }
        AbstractC4308 abstractC4308M23930 = m23930(c6262.f19397, this.f28211, new C23420(this, c15406M36455, AbstractC4308.f13885));
        boolean zM36457 = this.f28213.f75217.m36457(C15406.f47182);
        C6319 c6319 = this.f28251;
        if (!zM36457) {
            abstractC4308M23930 = c6319.m17523(abstractC4308M23930);
        }
        AbstractC4308 abstractC4309 = abstractC4308M23930;
        C15406 c154010 = C15406.f47189;
        C22364 c22364 = this.f28253;
        if (c15406M36455 == c154010) {
            AbstractC4308 abstractC43010 = abstractC4309;
            while (abstractC43010.m12913(EnumC9454.ARRAY)) {
                abstractC43010 = ((C5138) abstractC43010).f16077;
            }
            if (abstractC43010.m12913(EnumC9454.TYPEVAR)) {
                c22364.m7273(c6262, C6241.f19301);
                AbstractC10370 abstractC10374 = c6262.f19395;
                AbstractC19810 abstractC19810 = abstractC4309.f13890;
                c6319.getClass();
                C12193 c12193M17457 = C6319.m17457(abstractC10374, abstractC19810, abstractC4309);
                c6262.f16086 = c12193M17457;
                this.f28223 = c12193M17457;
                c6262.f19396 = c12193M17457.f13890;
                return;
            }
        }
        AbstractC5698 abstractC5698M19472 = C7260.m19472(c6262.f19397);
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        boolean z2 = c8604.f26296;
        c8604.f26296 = abstractC5698M19472 != null && abstractC5698M19472.f17562 == abstractC10373;
        c8604.f26288 = null;
        AbstractC5698 abstractC5698M23901 = m23900(c6262, abstractC5698M19472, abstractC4309, c1755, this.f28213);
        EnumC1296 enumC1297 = abstractC5698M23901.f17559;
        EnumC1296 enumC1298 = EnumC1296.f4567;
        C20661 c20661 = this.f28244;
        if (enumC1297 == enumC1298 && abstractC5698M23901.f17562 != abstractC10373 && ((C8604) this.f28211.f6073).f26290 != null) {
            AbstractC12612 abstractC12612 = c6262.f19397;
            abstractC12612.getClass();
            AbstractC19810 abstractC19811 = abstractC4309.f13890;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "not.encl.class", abstractC19811));
            abstractC5698M23901 = c20661.f66462;
        }
        if (abstractC5698M23901.mo15574() && abstractC5698M23901.f17559 != EnumC1296.f4582 && this.f28213.f75217.m36457(C15406.f47182)) {
            AbstractC4308 abstractC4308M17523 = c6319.m17523(abstractC4309);
            abstractC5698M23900 = m23900(c6262, abstractC5698M19472, abstractC4308M17523, this.f28211, this.f28213);
            abstractC4308M17526 = abstractC4308M17523;
        } else {
            abstractC4308M17526 = abstractC4309;
            abstractC5698M23900 = abstractC5698M23901;
        }
        EnumC16761 enumC16761 = ((C8604) this.f28211.f6073).f26288;
        if (enumC16761 != null) {
            enumC16761.m39436();
        }
        c6262.f19396 = abstractC5698M23900;
        if (!abstractC4308M17526.m12913(EnumC9454.TYPEVAR) || ((abstractC5698M23900 != null && abstractC5698M23900.f17559 == EnumC1296.f4582) || abstractC5698M23900.f17559 == EnumC1296.f4581)) {
            z = true;
        } else {
            z = true;
            abstractC4308M17526 = c6319.m17526(abstractC4308M17526, true);
        }
        if (abstractC5698M23900.f17559 == enumC1298) {
            C12048 c12048 = (C12048) abstractC5698M23900;
            m23910(c6262, this.f28211, c12048, z);
            if (C15406.f47183.m36458(this.f28213.f75217)) {
                m23947(c6262, c12048, c6262.f19397, this.f28211);
            }
        }
        if (abstractC5698M19472 != null && abstractC5698M19472.f17559 == enumC1298 && ((C12048) abstractC5698M19472).m29422() && abstractC5698M23900.f17559 == EnumC1296.f4571 && abstractC5698M23900.f17562.equals(c6136.f18851) && abstractC5698M23900.mo10962(c20661.f66496, abstractC5698M19472.f17560.f13890, c6319, true)) {
            C4824 c4824 = ((C8604) this.f28211.f6073).f26289;
            EnumC20347 enumC20347 = EnumC20347.TRY;
            if (c4824.m14055(enumC20347)) {
                c22364.m7286(enumC20347, c6262, C14001.f42354);
            }
        }
        EnumC1296 enumC1299 = abstractC5698M23900.f17559;
        EnumC1296 enumC12910 = EnumC1296.f4582;
        if (enumC1299 == enumC12910 && (abstractC5698M19472 == null || !abstractC5698M19472.f17559.m4391(C15406.f47182))) {
            c6262.f16086 = m23934(c6262.f19397, this.f28213.f75219, abstractC5698M19472 == null ? C15406.f47181 : abstractC5698M19472.f17559.m4392(), new C23420(this, C15406.f47182, this.f28213.f75219));
        }
        C22406 c22406 = this.f28231;
        C15240 c15240 = this.f28214;
        if (abstractC5698M19472 != null && abstractC5698M19472.f17559 == enumC12910) {
            if (abstractC5698M23900.f17562 == c6136.f18886) {
                C1755 c1756 = this.f28211;
                if (((C8604) c1756.f6073).f26299 && abstractC4308M17526.f13890 == c1756.f6079.f17186) {
                    c15240.m36177(c6262, abstractC5698M23900);
                }
            } else {
                if ((abstractC5698M23900.mo16084() & 8) == 0 && abstractC5698M23900.f17562 != abstractC10373 && ((enumC1296 = abstractC5698M23900.f17559) == enumC1298 || enumC1296 == EnumC1296.f4571)) {
                    C11003.requireNonNull(c22406);
                    c22406.m50316((AbstractC5698) new C1239(abstractC5698M23900, c22406), (InterfaceC3109) c6262, (AbstractC5698) abstractC4308M17526.f13890, abstractC4308M17526, abstractC5698M23900.f17562, true);
                }
                if (!this.f28236 && abstractC5698M19472.m16070() && abstractC5698M23900.mo15572() && abstractC5698M23900.f17559 == EnumC1296.f4571) {
                    c22364.m7280(EnumC20043.SOURCE_LEVEL, c6262, EnumC10637.f32010.m26684(this.f28242));
                }
            }
            if (!this.f28236) {
                c22364.m7280(EnumC20043.SOURCE_LEVEL, c6262, EnumC10637.f32010.m26684(this.f28242));
            }
        } else if (abstractC5698M23900.f17559 != EnumC1296.f4581 && (abstractC5698M23900.mo16084() & 8) != 0 && abstractC5698M23900.f17562 != abstractC10372) {
            EnumC8352 enumC8352M4395 = abstractC5698M23900.f17559.m4395();
            AbstractC5698 abstractC5698 = abstractC5698M23900.f17561;
            C11076 c11076 = C14001.f42334;
            c15240.m36146(c6262, new C11076("compiler", "static.not.qualified.by.type", enumC8352M4395, abstractC5698));
        }
        if (((C8604) this.f28211.f6073).f26296 && (abstractC5698M23900.mo16084() & 8) == 0) {
            c22406.m50326(c6262, abstractC5698M23900);
            if (!abstractC4308M17526.mo12920() || (abstractC4308M17527 = c6319.m17527(abstractC4308M17526.f13890, this.f28211.f6079.f17186.f17560)) == null) {
                abstractC4308 = abstractC4308M17526;
            } else {
                abstractC4308 = abstractC4308M17527;
            }
        } else {
            abstractC4308 = abstractC4308M17526;
        }
        C8604 c8605 = (C8604) this.f28211.f6073;
        if (c8605.f26287) {
            c15240.m36155(c6262, c8605.f26298);
        }
        C1755 c1757 = this.f28211;
        ((C8604) c1757.f6073).f26296 = z2;
        this.f28223 = m23932(c6262, abstractC4308, abstractC5698M23900, c1757, this.f28213);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m23900(C6262 c6262, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, C1755 c1755, C23420 c23420) {
        AbstractC5698 c5746;
        AbstractC10370 abstractC10370 = c6262.f19395;
        int i = C0883.f3448[abstractC4308.mo3258().ordinal()];
        C22406 c22406 = this.f28231;
        C22364 c22364 = this.f28253;
        C6136 c6136 = this.f28229;
        C6319 c6319 = this.f28251;
        C20661 c20661 = this.f28244;
        switch (i) {
            case 1:
                AbstractC19810 abstractC19810 = abstractC4308.f13890;
                C15406 c15406 = c23420.f75217;
                C22406 c22407 = this.f28231;
                return c22407.m50316(c22407.m50321(c6262, c1755, abstractC19810, abstractC10370, c15406), (InterfaceC3109) c6262, abstractC5698, abstractC4308, abstractC10370, true);
            case 2:
            case 3:
                AbstractC4308 abstractC4309 = c23420.f75219;
                if (abstractC4309.m12913(EnumC9454.METHOD) || abstractC4309.m12913(EnumC9454.FORALL)) {
                    return this.f28231.m50313(c6262, c1755, abstractC5698, abstractC4308, abstractC10370, abstractC4309.mo12933(), abstractC4309.mo12938());
                }
                if (abstractC10370 == c6136.f18886 || abstractC10370 == c6136.f18898) {
                    return c22406.m50314(c6262, c1755, abstractC4308.f13890, abstractC10370);
                }
                if (abstractC10370 == c6136.f18894) {
                    return c20661.m47259(abstractC4308, c6319);
                }
                return this.f28231.m50316(this.f28231.m50315(c6262, c1755, abstractC4308, abstractC10370, c23420.f75217), (InterfaceC3109) c6262, abstractC5698, abstractC4308, abstractC10370, true);
            case 4:
                throw new AssertionError(c6262);
            case 5:
                AbstractC5698 abstractC5698M23900 = abstractC4308.mo12939() != null ? m23900(c6262, abstractC5698, c6319.m17523(abstractC4308.mo12939()), c1755, c23420) : null;
                if (abstractC5698M23900 == null) {
                    c22364.m7273(c6262, C6241.f19301);
                    return c20661.f66462;
                }
                if ((abstractC5698M23900.mo16084() & 2) != 0) {
                    C11003.requireNonNull(c22406);
                    c5746 = new C5746(c22406, c1755, abstractC4308, abstractC5698M23900);
                } else {
                    c5746 = abstractC5698M23900;
                }
                this.f28231.m50316(c5746, (InterfaceC3109) c6262, abstractC5698, abstractC4308, abstractC10370, true);
                return abstractC5698M23900;
            case 6:
                AbstractC19810 abstractC19811 = abstractC4308.f13890;
                c6319.getClass();
                return C6319.m17457(abstractC10370, abstractC19811, abstractC4308).f13890;
            default:
                if (abstractC10370 == c6136.f18894) {
                    return c20661.m47259(abstractC4308, c6319);
                }
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c6262, new C12281("compiler", "cant.deref", abstractC4308));
                return c20661.f66462;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23932(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C1755 c1755, C23420 c23420) {
        if (!c23420.f75219.m12913(EnumC9454.FORALL) && !c23420.f75219.m12913(EnumC9454.METHOD)) {
            return m23933(abstractC5144, abstractC4308, abstractC5698, c23420.f75219, c1755, c23420);
        }
        if (c23420.f75217.m36457(C15406.f47180)) {
            return this.f28225.m21192(abstractC5144, abstractC4308, abstractC5698, c1755, c23420);
        }
        return m23933(abstractC5144, abstractC4308, abstractC5698, c23420.f75219, c1755, c23420);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23933(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, AbstractC4308 abstractC4309, C1755 c1755, C23420 c23420) {
        AbstractC4308 c19955;
        AbstractC4308 abstractC4308M17543;
        AbstractC5698 abstractC5698M19472;
        AbstractC10370 abstractC10370;
        AbstractC4308 abstractC4308M17490;
        boolean zMo12948 = abstractC4309.mo12948();
        C6319 c6319 = this.f28251;
        if (zMo12948) {
            return c6319.m17535(abstractC4308);
        }
        int i = C0883.f3447[abstractC5698.f17559.ordinal()];
        C6136 c6136 = this.f28229;
        C15240 c15240 = this.f28214;
        switch (i) {
            case 8:
                c19955 = abstractC5698.f17560;
                EnumC9454 enumC9454 = EnumC9454.CLASS;
                if (c19955.m12913(enumC9454)) {
                    abstractC5144.getClass();
                    c15240.m36136(abstractC5144, c1755, (C14163) abstractC5698);
                    AbstractC4308 abstractC4308Mo4958 = c19955.mo4958();
                    if (c19955.f13890.f17560.mo12938().m8249()) {
                        c19955 = c6319.m17519(c19955);
                    } else if (abstractC4308Mo4958.m12913(enumC9454) && abstractC4308 != abstractC4308Mo4958) {
                        AbstractC4308 abstractC4308M17489 = abstractC4308.m12913(enumC9454) ? c6319.m17489(abstractC4308, abstractC4308Mo4958.f13890) : abstractC4308;
                        if (abstractC4308M17489 == null) {
                            abstractC4308M17489 = c6319.m17519(abstractC4308Mo4958);
                        }
                        if (abstractC4308M17489 != abstractC4308Mo4958) {
                            c19955 = new C19955(abstractC4308M17489, C2609.m8239(), c19955.f13890, c19955.m12921());
                        }
                    }
                }
                break;
            case 9:
                C12048 c12048 = (C12048) abstractC5698;
                if (((C8604) c1755.f6073).f26293 != null && c12048.f17560.m12913(EnumC9454.NONE)) {
                    AbstractC5144 abstractC5145 = c1755.f6079;
                    AbstractC5144 abstractC5144M19438 = C7260.m19438(c12048, abstractC5145);
                    if (abstractC5144M19438 != null) {
                        abstractC5145 = abstractC5144M19438;
                    }
                    this.f28253.m7269(abstractC5145.f16085, C6241.m17185(c12048.f17562, C11886.f35507));
                    C12193 c12193M17535 = c6319.m17535(c12048.f17560);
                    c12048.f17560 = c12193M17535;
                    return c12193M17535;
                }
                if (C15406.f47183.m36458(this.f28213.f75217) && c12048.f17561.f17559 == EnumC1296.f4582 && (c12048.f17563 & 8) == 0 && ((abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.TYPEVAR)) && (abstractC4308M17490 = c6319.m17490(c12048.f17561, abstractC4308)) != null && abstractC4308M17490.mo12920() && !c6319.m17550(c12048.f17560, c12048.mo16091(c6319)))) {
                    abstractC5144.getClass();
                    C11076 c11076 = C14001.f42334;
                    c15240.m36178(abstractC5144, new C11076("compiler", "unchecked.assign.to.var", c12048, abstractC4308M17490));
                }
                EnumC1296 enumC1296 = abstractC5698.f17561.f17559;
                EnumC1296 enumC1297 = EnumC1296.f4582;
                if (enumC1296 == enumC1297 && (abstractC10370 = abstractC5698.f17562) != c6136.f18886 && abstractC10370 != c6136.f18898) {
                    abstractC4308M17543 = c6319.m17543(abstractC5698, abstractC4308);
                } else {
                    abstractC4308M17543 = abstractC5698.f17560;
                }
                c19955 = (c12048.m29425() == null || (abstractC5144.m14709(EnumC18550.f57581) && ((abstractC5698M19472 = C7260.m19472(((C6262) abstractC5144).f19397)) == null || abstractC5698M19472.f17559 != enumC1297))) ? abstractC4308M17543 : abstractC4308M17543.mo3257(c12048.m29425());
                if (c23420.f75217 == C15406.f47181) {
                    c19955 = c6319.m17523(c19955);
                }
                break;
                break;
            case 10:
                C15406 c15406 = c23420.f75217;
                AbstractC4308 abstractC43010 = c23420.f75219;
                c19955 = m23927(abstractC4308, abstractC5698, new C23420(this, c15406, abstractC43010.mo12923(), c23420.f75215, c23420.f75216), c1755, C7260.m19435(c1755.f6074), abstractC43010.mo12933(), abstractC43010.mo12938());
                break;
            case 11:
            case 12:
                c19955 = abstractC5698.f17560;
                break;
            default:
                throw new AssertionError("unexpected kind: " + abstractC5698.f17559 + " in tree " + abstractC5144);
        }
        if (abstractC5698.f17562 != c6136.f18879 || abstractC5144.m14709(EnumC18550.f57524)) {
            abstractC5144.getClass();
            AbstractC5698 abstractC5699 = ((C8604) c1755.f6073).f26285.f23673;
            c15240.getClass();
            c15240.m36116(new C18064(abstractC5144), abstractC5699, abstractC5698);
            c15240.m36192(abstractC5698, abstractC5144);
            c15240.m36180(abstractC5698, abstractC5144);
            c15240.m36127(abstractC5144, ((C8604) c1755.f6073).f26285.f23673, abstractC5698);
        }
        return m23934(abstractC5144, c19955, abstractC5698.f17559.m4392(), c23420);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23910(AbstractC12612 abstractC12612, C1755 c1755, C12048 c12048, boolean z) {
        C14163 c14163M16071;
        C11076 c11076;
        C1755 c1756 = c1755;
        while (true) {
            switch (C0883.f3449[c1756.f6074.mo989().ordinal()]) {
                case 15:
                case 16:
                case 21:
                    c1756 = null;
                    break;
                case 17:
                case 18:
                default:
                    continue;
                    C12171.m29637(c1756.f6072);
                    c1756 = c1756.f6072;
                    break;
                case 19:
                    if (((C9378) c1756.f6074).f28489.f17561.f17559 != EnumC1296.f4582) {
                        C12171.m29637(c1756.f6072);
                        c1756 = c1756.f6072;
                    }
                    break;
                case 20:
                    if (!c1756.f6072.f6074.m14709(EnumC18550.f57582)) {
                        C12171.m29637(c1756.f6072);
                        c1756 = c1756.f6072;
                    }
                    break;
            }
        }
        C22364 c22364 = this.f28253;
        if (c1756 != null) {
            C8604 c8604 = (C8604) c1756.f6073;
            if (c8604.f26293 == c12048 || c12048.f36040 > abstractC12612.f16085) {
                AbstractC5698 abstractC5698 = c12048.f17561;
                if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698 == ((C8604) c1755.f6073).f26285.f23673.m16071()) {
                    if (((c12048.f17563 & 8) != 0) == C22406.m50291(c1755) && (!c1755.f6074.m14709(EnumC18550.f57522) || C7260.m19458(((C21080) c1755.f6074).f67987) != abstractC12612)) {
                        if (!z || m23918(c12048)) {
                            c22364.m7273(abstractC12612, c8604.f26293 == c12048 ? C6241.f19225 : C6241.f19199);
                        } else if (this.f28240) {
                            if (c8604.f26293 == c12048) {
                                C11076 c11077 = C14001.f42334;
                                c11076 = new C11076("compiler", "self.ref", c12048);
                            } else {
                                C11076 c11078 = C14001.f42334;
                                c11076 = new C11076("compiler", "forward.ref", c12048);
                            }
                            c22364.m7285(abstractC12612, c11076);
                        }
                    }
                }
            }
        }
        c12048.m29425();
        if (!m23918(c12048) || (c14163M16071 = ((C8604) c1755.f6073).f26285.f23673.m16071()) == null || c14163M16071.f17561 == null) {
            return;
        }
        AbstractC5698 abstractC5699 = c12048.f17561;
        if (abstractC5699 == c14163M16071 || this.f28251.m17546(c14163M16071.f17560, abstractC5699.f17560, true)) {
            C4314 c4314 = C22406.f72572;
            AbstractC5698 abstractC56910 = ((C8604) c1755.f6073).f26285.f23673;
            if (!abstractC56910.m16075()) {
                if (abstractC56910.f17561.f17559 != EnumC1296.f4582) {
                    return;
                }
                EnumC1296 enumC1296 = abstractC56910.f17559;
                if ((enumC1296 != EnumC1296.f4567 && (enumC1296 != EnumC1296.f4571 || (abstractC56910.mo16084() & 1048576) == 0)) || (abstractC56910.mo16084() & 8) != 0) {
                    return;
                }
            }
            c22364.m7273(abstractC12612, C6241.f19220);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23918(C12048 c12048) {
        AbstractC5698 abstractC5698 = c12048.f17561;
        int i = C19642.f63384;
        return ((abstractC5698.mo16084() & 16384) == 0 || (c12048.f17563 & 8) == 0 || c12048.m29425() != null || c12048.f17562 == this.f28229.f18894) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0297 A[Catch: ᩻ۧ۠ -> 0x02c1, ۬ۛ֨ -> 0x02c5, TryCatch #1 {۬ۛ֨ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:148:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1 A[Catch: ᩻ۧ۠ -> 0x02c1, ۬ۛ֨ -> 0x02c5, TryCatch #1 {۬ۛ֨ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:148:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x026e A[Catch: ۬ۛ֨ -> 0x0283, ᩻ۧ۠ -> 0x02c7, TRY_ENTER, TryCatch #0 {᩻ۧ۠ -> 0x02c7, blocks: (B:90:0x0264, B:92:0x026e, B:94:0x0280, B:98:0x0289, B:76:0x022a), top: B:147:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0289 A[Catch: ᩻ۧ۠ -> 0x02c7, ۬ۛ֨ -> 0x02cd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {᩻ۧ۠ -> 0x02c7, blocks: (B:90:0x0264, B:92:0x026e, B:94:0x0280, B:98:0x0289, B:76:0x022a), top: B:147:0x022a }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23927(AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C23420 c23420, C1755 c1755, C2609 c2609, C2609 c26010, C2609 c26011) {
        InterfaceC3953 interfaceC3953;
        C2609 c26012;
        C22364 c22364;
        Object obj;
        C1755 c1756;
        C2609 c26013;
        C6319 c6319;
        C2609 c26014;
        AbstractC4308 c10658;
        EnumC19816 enumC19816;
        EnumC16761 enumC16761;
        boolean z;
        Object obj2;
        AbstractC4308 abstractC4308M17490;
        InterfaceC3953 interfaceC3954 = c23420.f75215;
        C22406 c22406 = this.f28231;
        long jMo16084 = abstractC5698.mo16084() & 8;
        C15240 c15240 = this.f28214;
        C6319 c63110 = this.f28251;
        if (jMo16084 == 0 && ((abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.TYPEVAR)) && (abstractC4308M17490 = c63110.m17490(abstractC5698.f17561, abstractC4308)) != null && abstractC4308M17490.mo12920() && !c63110.m17549(abstractC5698.f17560.mo12933(), abstractC5698.mo16091(c63110).mo12933()))) {
            AbstractC5144 abstractC5144 = c1755.f6074;
            abstractC5144.getClass();
            C11076 c11076 = C14001.f42334;
            c15240.m36178(abstractC5144, new C11076("compiler", "unchecked.call.mbr.of.raw.type", abstractC5698, abstractC4308M17490));
        }
        Object obj3 = c1755.f6073;
        AbstractC4308 abstractC4309 = ((C8604) obj3).f26290;
        C22364 c22365 = this.f28253;
        if (abstractC4309 != null) {
            Iterator it = c63110.m17510(c1755.f6079.f16086).m8246(c63110.m17562(c1755.f6079.f16086)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC3953 = interfaceC3954;
                    break;
                }
                AbstractC4308 abstractC43010 = (AbstractC4308) it.next();
                if (abstractC43010.f13890.mo16080((AbstractC5698) abstractC5698.m16071(), c63110)) {
                    C8604 c8604 = (C8604) obj3;
                    if (c63110.m17550(abstractC43010, c8604.f26290)) {
                        interfaceC3953 = interfaceC3954;
                    } else {
                        C2609 c2609M17483 = c63110.m17483(abstractC43010, (C3581) abstractC5698);
                        if (!c2609M17483.m8249() || (obj2 = c2609M17483.f8240) == abstractC5698) {
                            interfaceC3953 = interfaceC3954;
                        } else {
                            C3581 c3581 = (C3581) obj2;
                            interfaceC3953 = interfaceC3954;
                            if (c3581.mo10962(abstractC5698, c3581.m16071(), c63110, true)) {
                                AbstractC5144 abstractC5145 = c1755.f6074;
                                abstractC5145.getClass();
                                AbstractC4308 abstractC43011 = c8604.f26290;
                                C11576 c11576 = C11886.f35440;
                                C11576 c11577 = new C11576("compiler", "overridden.default", abstractC5698, abstractC43010);
                                C12281 c12281 = C6241.f19132;
                                c22365.m7273(abstractC5145, new C12281("compiler", "illegal.default.super.call", abstractC43011, c11577));
                                break;
                            }
                        }
                    }
                } else {
                    interfaceC3953 = interfaceC3954;
                }
                it = it;
                interfaceC3954 = interfaceC3953;
                c63110 = c63110;
            }
            ((C8604) obj3).f26290 = null;
        } else {
            c63110 = c63110;
            interfaceC3953 = interfaceC3954;
        }
        if (abstractC5698.mo15572() && abstractC4308.mo12925() && c1755.f6074.m14709(EnumC18550.f57534)) {
            C15580 c15580 = (C15580) c1755.f6074;
            if (c15580.f48011.m14709(EnumC18550.f57581) && !C7260.m19446(((C6262) c15580.f48011).f19397, this.f28229)) {
                AbstractC5144 abstractC5146 = c1755.f6074;
                abstractC5146.getClass();
                C12281 c12282 = C6241.f19132;
                c22365.m7273(abstractC5146, new C12281("compiler", "illegal.static.intf.meth.call", abstractC4308));
            }
        }
        C1386 c1386 = new C1386();
        try {
            obj = obj3;
            c22364 = c22365;
            try {
                try {
                    AbstractC4308 abstractC4308M50301 = this.f28231.m50301(c1755, abstractC4308, abstractC5698, c23420, c26010, c26011, c1386);
                    AbstractC4308 abstractC43012 = c23420.f75219;
                    C12399 c12399 = this.f28247;
                    C11003.requireNonNull(c12399);
                    try {
                        C8166 c8166 = new C8166(c12399, EnumC13829.CHECK, abstractC5698, ((C8604) obj).f26288);
                        c26012 = c26010;
                        try {
                            C2609 c2609M8243 = c26012.m8243((Function) c8166);
                            try {
                                try {
                                    try {
                                        try {
                                            if (c1386.m4872(EnumC20347.UNCHECKED)) {
                                                try {
                                                    try {
                                                        AbstractC5144 abstractC5147 = c1755.f6074;
                                                        abstractC5147.getClass();
                                                        EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698);
                                                        AbstractC10370 abstractC10370 = abstractC5698.f17562;
                                                        Object objM50298 = c22406.m50298(abstractC5698.f17560.mo12933());
                                                        Object objM50299 = c22406.m50298(c2609M8243.m8243((Function) c8166));
                                                        EnumC8352 enumC8352M49077 = C21758.m49076(abstractC5698.m16072());
                                                        AbstractC5698 abstractC5698M16072 = abstractC5698.m16072();
                                                        try {
                                                            C11076 c11077 = C14001.f42334;
                                                            c22406 = c22406;
                                                            try {
                                                                c26014 = c2609M8243;
                                                                try {
                                                                    c15240.m36178(abstractC5147, new C11076("compiler", "unchecked.meth.invocation.applied", enumC8352M49076, abstractC10370, objM50298, objM50299, enumC8352M49077, abstractC5698M16072));
                                                                    try {
                                                                        try {
                                                                            if (abstractC43012 == C6735.f20919) {
                                                                                try {
                                                                                    if (!abstractC4308M50301.m12913(EnumC9454.METHOD) || !abstractC4308M50301.mo12940()) {
                                                                                    }
                                                                                    if (abstractC5698.f17560.m12913(EnumC9454.FORALL) || !abstractC5698.f17560.mo12923().m12928(((C10077) abstractC5698.f17560).f30362)) {
                                                                                        enumC19816 = EnumC19816.STANDALONE;
                                                                                    } else {
                                                                                        enumC19816 = EnumC19816.POLY;
                                                                                    }
                                                                                    c1756 = c1755;
                                                                                    C7260.m19445(c1756.f6074, enumC19816);
                                                                                    if (abstractC43012 == C6735.f20919) {
                                                                                        return c10658;
                                                                                    }
                                                                                    C15240 c15241 = this.f28214;
                                                                                    enumC16761 = ((C8604) obj).f26288;
                                                                                    if (enumC16761 == null && enumC16761.m39436()) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    c26013 = c26014;
                                                                                    try {
                                                                                        c15241.m36133(c10658, abstractC5698, c1755, c2609, c26014, z, interfaceC3953.mo3857());
                                                                                        return c10658;
                                                                                    } catch (C23653 e) {
                                                                                        e = e;
                                                                                        C16719 c16719Mo31425 = e.mo31425();
                                                                                        C11003.requireNonNull(c22406);
                                                                                        C22406 c22407 = c22406;
                                                                                        C0177 c0177 = new C0177(c22407, abstractC5698, c16719Mo31425);
                                                                                        EnumC13829 enumC13829 = EnumC13829.CHECK;
                                                                                        EnumC16761 enumC16762 = ((C8604) obj).f26288;
                                                                                        C12399 c123910 = c22407.f72606;
                                                                                        C11003.requireNonNull(c123910);
                                                                                        c22364.mo7277(c0177.mo4076(EnumC12986.ERROR, c1756.f6074, abstractC5698, abstractC4308, abstractC5698.f17562, c26013.m8243((Function) new C0533(c123910, enumC13829, abstractC5698, enumC16762)), c26011));
                                                                                        return c63110.m17535(abstractC4308);
                                                                                    }
                                                                                } catch (C23653 e2) {
                                                                                    e = e2;
                                                                                    c26013 = c26014;
                                                                                    c1756 = c1755;
                                                                                    c63110 = c63110;
                                                                                    C16719 c16719Mo31426 = e.mo31425();
                                                                                    C11003.requireNonNull(c22406);
                                                                                    C22406 c22408 = c22406;
                                                                                    C0177 c0178 = new C0177(c22408, abstractC5698, c16719Mo31426);
                                                                                    EnumC13829 enumC138210 = EnumC13829.CHECK;
                                                                                    EnumC16761 enumC16763 = ((C8604) obj).f26288;
                                                                                    C12399 c123911 = c22408.f72606;
                                                                                    C11003.requireNonNull(c123911);
                                                                                    c22364.mo7277(c0178.mo4076(EnumC12986.ERROR, c1756.f6074, abstractC5698, abstractC4308, abstractC5698.f17562, c26013.m8243((Function) new C0533(c123911, enumC138210, abstractC5698, enumC16763)), c26011));
                                                                                    return c63110.m17535(abstractC4308);
                                                                                }
                                                                            }
                                                                            c10658 = new C10658(abstractC4308M50301.mo12933(), c63110.m17519(abstractC4308M50301.mo12923()), c63110.m17520(abstractC4308M50301.mo12930()), this.f28244.f66481);
                                                                            if (abstractC5698.f17560.m12913(EnumC9454.FORALL)) {
                                                                                enumC19816 = EnumC19816.STANDALONE;
                                                                            } else {
                                                                                enumC19816 = EnumC19816.STANDALONE;
                                                                            }
                                                                            c1756 = c1755;
                                                                            C7260.m19445(c1756.f6074, enumC19816);
                                                                            if (abstractC43012 == C6735.f20919) {
                                                                                return c10658;
                                                                            }
                                                                            C15240 c15242 = this.f28214;
                                                                            enumC16761 = ((C8604) obj).f26288;
                                                                            if (enumC16761 == null) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            c26013 = c26014;
                                                                            c15242.m36133(c10658, abstractC5698, c1755, c2609, c26014, z, interfaceC3953.mo3857());
                                                                            return c10658;
                                                                        } catch (C23653 e3) {
                                                                            e = e3;
                                                                            c26013 = c26014;
                                                                            c1756 = c1755;
                                                                            C16719 c16719Mo31427 = e.mo31425();
                                                                            C11003.requireNonNull(c22406);
                                                                            C22406 c22409 = c22406;
                                                                            C0177 c0179 = new C0177(c22409, abstractC5698, c16719Mo31427);
                                                                            EnumC13829 enumC138211 = EnumC13829.CHECK;
                                                                            EnumC16761 enumC16764 = ((C8604) obj).f26288;
                                                                            C12399 c123912 = c22409.f72606;
                                                                            C11003.requireNonNull(c123912);
                                                                            c22364.mo7277(c0179.mo4076(EnumC12986.ERROR, c1756.f6074, abstractC5698, abstractC4308, abstractC5698.f17562, c26013.m8243((Function) new C0533(c123912, enumC138211, abstractC5698, enumC16764)), c26011));
                                                                            return c63110.m17535(abstractC4308);
                                                                        }
                                                                    } catch (C12919 e4) {
                                                                        e = e4;
                                                                        c1756 = c1755;
                                                                        c6319 = c63110;
                                                                        AbstractC5144 abstractC5148 = c1756.f6074;
                                                                        abstractC5148.getClass();
                                                                        interfaceC3953.mo1084(abstractC5148, e.mo31425());
                                                                        return c6319.m17535(abstractC4308);
                                                                    }
                                                                    c63110 = c63110;
                                                                } catch (C23653 e5) {
                                                                    e = e5;
                                                                    c63110 = c63110;
                                                                    c26013 = c26014;
                                                                    c1756 = c1755;
                                                                    C16719 c16719Mo31428 = e.mo31425();
                                                                    C11003.requireNonNull(c22406);
                                                                    C22406 c224010 = c22406;
                                                                    C0177 c01710 = new C0177(c224010, abstractC5698, c16719Mo31428);
                                                                    EnumC13829 enumC138212 = EnumC13829.CHECK;
                                                                    EnumC16761 enumC16765 = ((C8604) obj).f26288;
                                                                    C12399 c123913 = c224010.f72606;
                                                                    C11003.requireNonNull(c123913);
                                                                    c22364.mo7277(c01710.mo4076(EnumC12986.ERROR, c1756.f6074, abstractC5698, abstractC4308, abstractC5698.f17562, c26013.m8243((Function) new C0533(c123913, enumC138212, abstractC5698, enumC16765)), c26011));
                                                                    return c63110.m17535(abstractC4308);
                                                                }
                                                            } catch (C23653 e6) {
                                                                e = e6;
                                                                c26014 = c2609M8243;
                                                            }
                                                        } catch (C23653 e7) {
                                                            e = e7;
                                                            c26014 = c2609M8243;
                                                            c22406 = c22406;
                                                        }
                                                    } catch (C23653 e8) {
                                                        e = e8;
                                                        c1756 = c1755;
                                                        c26013 = c2609M8243;
                                                        C16719 c16719Mo31429 = e.mo31425();
                                                        C11003.requireNonNull(c22406);
                                                        C22406 c224011 = c22406;
                                                        C0177 c01711 = new C0177(c224011, abstractC5698, c16719Mo31429);
                                                        EnumC13829 enumC138213 = EnumC13829.CHECK;
                                                        EnumC16761 enumC16766 = ((C8604) obj).f26288;
                                                        C12399 c123914 = c224011.f72606;
                                                        C11003.requireNonNull(c123914);
                                                        c22364.mo7277(c01711.mo4076(EnumC12986.ERROR, c1756.f6074, abstractC5698, abstractC4308, abstractC5698.f17562, c26013.m8243((Function) new C0533(c123914, enumC138213, abstractC5698, enumC16766)), c26011));
                                                        return c63110.m17535(abstractC4308);
                                                    }
                                                } catch (C12919 e9) {
                                                    e = e9;
                                                    abstractC4308 = abstractC4308;
                                                    c1756 = c1755;
                                                    c6319 = c63110;
                                                    AbstractC5144 abstractC5149 = c1756.f6074;
                                                    abstractC5149.getClass();
                                                    interfaceC3953.mo1084(abstractC5149, e.mo31425());
                                                    return c6319.m17535(abstractC4308);
                                                }
                                            } else {
                                                c26014 = c2609M8243;
                                                c22406 = c22406;
                                            }
                                            C7260.m19445(c1756.f6074, enumC19816);
                                            if (abstractC43012 == C6735.f20919) {
                                                return c10658;
                                            }
                                            C15240 c15243 = this.f28214;
                                            enumC16761 = ((C8604) obj).f26288;
                                            if (enumC16761 == null) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            c26013 = c26014;
                                            c15243.m36133(c10658, abstractC5698, c1755, c2609, c26014, z, interfaceC3953.mo3857());
                                            return c10658;
                                        } catch (C12919 e10) {
                                            e = e10;
                                            c6319 = c63110;
                                            AbstractC5144 abstractC51410 = c1756.f6074;
                                            abstractC51410.getClass();
                                            interfaceC3953.mo1084(abstractC51410, e.mo31425());
                                            return c6319.m17535(abstractC4308);
                                        }
                                    } catch (C23653 e11) {
                                        e = e11;
                                        c26013 = c26014;
                                    }
                                    if (abstractC5698.f17560.m12913(EnumC9454.FORALL)) {
                                        enumC19816 = EnumC19816.STANDALONE;
                                    } else {
                                        enumC19816 = EnumC19816.STANDALONE;
                                    }
                                    c1756 = c1755;
                                } catch (C12919 e12) {
                                    e = e12;
                                    c1756 = c1755;
                                }
                                c63110 = c63110;
                                c10658 = abstractC4308M50301;
                            } catch (C23653 e13) {
                                e = e13;
                                c1756 = c1755;
                            }
                        } catch (C23653 e14) {
                            e = e14;
                            c1756 = c1755;
                            c22406 = c22406;
                            c63110 = c63110;
                            c26013 = c26012;
                            C16719 c16719Mo314210 = e.mo31425();
                            C11003.requireNonNull(c22406);
                            C22406 c224012 = c22406;
                            C0177 c01712 = new C0177(c224012, abstractC5698, c16719Mo314210);
                            EnumC13829 enumC138214 = EnumC13829.CHECK;
                            EnumC16761 enumC16767 = ((C8604) obj).f26288;
                            C12399 c123915 = c224012.f72606;
                            C11003.requireNonNull(c123915);
                            c22364.mo7277(c01712.mo4076(EnumC12986.ERROR, c1756.f6074, abstractC5698, abstractC4308, abstractC5698.f17562, c26013.m8243((Function) new C0533(c123915, enumC138214, abstractC5698, enumC16767)), c26011));
                            return c63110.m17535(abstractC4308);
                        }
                    } catch (C23653 e15) {
                        e = e15;
                        c26012 = c26010;
                    }
                } catch (C12919 e16) {
                    e = e16;
                    c1756 = c1755;
                    abstractC4308 = abstractC4308;
                }
            } catch (C23653 e17) {
                e = e17;
                c26012 = c26010;
            }
        } catch (C12919 e18) {
            e = e18;
            abstractC4308 = abstractC4308;
            c1756 = c1755;
        } catch (C23653 e19) {
            e = e19;
            c26012 = c26010;
            c22364 = c22365;
            obj = obj3;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        EnumC9454 enumC9454 = c23342.f74996;
        EnumC9454 enumC9455 = EnumC9454.CLASS;
        C20661 c20661 = this.f28244;
        this.f28223 = m23934(c23342, (enumC9454 == enumC9455 ? c20661.f66533 : c20661.f66461[enumC9454.ordinal()]).mo3257(c23342.f74997), C15406.f47181, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1373(C2882 c2882) {
        this.f28223 = m23934(c2882, this.f28244.f66461[c2882.f9190.ordinal()], C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        this.f28223 = m23934(c23901, new C5138(m23954(c23901.f77274, this.f28211, AbstractC4308.f13885), this.f28244.f66505), C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        AbstractC4308 abstractC4308M17490;
        AbstractC4308 abstractC4308 = c16432.f16086;
        C6319 c6319 = this.f28251;
        C19955 c19955M17535 = c6319.m17535(abstractC4308);
        AbstractC12612 abstractC12612 = c16432.f50542;
        abstractC12612.getClass();
        AbstractC4308 abstractC4308M23954 = m23954(c16432.f50542, this.f28211, AbstractC4308.f13885);
        C15240 c15240 = this.f28214;
        AbstractC4308 abstractC4308M36173 = c15240.m36173(abstractC12612, abstractC4308M23954);
        C2609 c2609 = c16432.f50541;
        C2609 c2609M23923 = m23923(c2609, this.f28211);
        c15240.m36123(c2609, c2609M23923);
        if (abstractC4308M36173.m12913(EnumC9454.CLASS)) {
            C2609 c2609Mo12938 = abstractC4308M36173.f13890.f17560.mo12938();
            if (c2609M23923.isEmpty()) {
                c2609M23923 = c2609Mo12938;
            }
            if (c2609M23923.m8245() == c2609Mo12938.m8245()) {
                C2609 c26010 = c2609M23923;
                while (c26010.m8249()) {
                    c26010.f8240 = ((AbstractC4308) c26010.f8240).mo12937((AbstractC4308) c2609Mo12938.f8240);
                    c26010 = c26010.f8241;
                    c2609Mo12938 = c2609Mo12938.f8241;
                }
                AbstractC4308 abstractC4308Mo4958 = abstractC4308M36173.mo4958();
                EnumC9454 enumC9454 = EnumC9454.CLASS;
                if (abstractC4308Mo4958.m12913(enumC9454)) {
                    AbstractC12612 abstractC12612M19465 = C7260.m19465(c16432.f50542);
                    if (abstractC12612M19465.m14709(EnumC18550.f57566)) {
                        abstractC4308M17490 = this.f28211.f6079.f17186.f17560;
                    } else if (abstractC12612M19465.m14709(EnumC18550.f57581)) {
                        abstractC4308M17490 = ((C6262) abstractC12612M19465).f19397.f16086;
                    } else {
                        throw new AssertionError("" + c16432);
                    }
                    if (abstractC4308Mo4958.m12913(enumC9454) && abstractC4308M17490 != abstractC4308Mo4958) {
                        if (abstractC4308M17490.m12913(enumC9454)) {
                            abstractC4308M17490 = c6319.m17490(abstractC4308Mo4958.f13890, abstractC4308M17490);
                        }
                        abstractC4308Mo4958 = abstractC4308M17490 == null ? c6319.m17519(abstractC4308Mo4958) : abstractC4308M17490;
                    }
                }
                c19955M17535 = new C19955(abstractC4308Mo4958, c2609M23923, abstractC4308M36173.f13890, abstractC4308M36173.m12921());
            } else {
                int iM8245 = c2609Mo12938.m8245();
                C22364 c22364 = this.f28253;
                if (iM8245 != 0) {
                    String string = Integer.toString(c2609Mo12938.m8245());
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c16432, new C12281("compiler", "wrong.number.type.args", string));
                } else {
                    AbstractC19810 abstractC19810 = abstractC4308M36173.f13890;
                    C12281 c12282 = C6241.f19132;
                    c22364.m7273(c16432, new C12281("compiler", "type.doesnt.take.params", abstractC19810));
                }
                c19955M17535 = c6319.m17535(c16432.f16086);
            }
        }
        this.f28223 = m23934(c16432, c19955M17535, C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1428(C23488 c23488) {
        C6319 c6319;
        C18837<AbstractC4308> c18837 = new C18837();
        Iterator it = c23488.f75416.iterator();
        C18837 c18838 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c6319 = this.f28251;
            if (!zHasNext) {
                break;
            }
            AbstractC12612 abstractC12612 = (AbstractC12612) it.next();
            AbstractC4308 abstractC4308M23954 = m23954(abstractC12612, this.f28211, AbstractC4308.f13885);
            abstractC12612.getClass();
            C15240 c15240 = this.f28214;
            AbstractC4308 abstractC4308M36106 = c15240.m36106(abstractC12612, c15240.m36173(abstractC12612, abstractC4308M23954), this.f28244.f66479, c15240.f46781);
            if (!abstractC4308M36106.mo12948()) {
                if (c15240.m36193(abstractC4308M36106, c18837.m43517())) {
                    for (AbstractC4308 abstractC4308 : c18837) {
                        boolean zM17546 = c6319.m17546(abstractC4308M36106, abstractC4308, true);
                        boolean zM17547 = c6319.m17546(abstractC4308, abstractC4308M36106, true);
                        if (zM17546 || zM17547) {
                            AbstractC4308 abstractC4309 = zM17546 ? abstractC4308M36106 : abstractC4308;
                            if (!zM17546) {
                                abstractC4308 = abstractC4308M36106;
                            }
                            C12281 c12281 = C6241.f19132;
                            this.f28253.m7273(abstractC12612, new C12281("compiler", "multicatch.types.must.be.disjoint", abstractC4309, abstractC4308));
                        }
                    }
                }
                c18837.m43511(abstractC4308M36106);
                if (c18838 != null) {
                    c18838.m43511(abstractC4308M36106);
                }
            } else {
                if (c18838 == null) {
                    c18838 = new C18837();
                    c18838.m43513(c18837);
                }
                c18838.m43511(abstractC4308M36106);
            }
        }
        AbstractC4308 abstractC4308M23934 = m23934(c23488, c6319.m17548(c18837.m43517()), C15406.f47189, this.f28213.mo38525(EnumC22756.f73480));
        if (abstractC4308M23934.m12913(EnumC9454.CLASS)) {
            if (c18838 != null) {
                c18837 = c18838;
            }
            abstractC4308M23934 = new C7835((C19955) abstractC4308M23934, c18837.m43517());
        }
        this.f28223 = abstractC4308M23934;
        c23488.f16086 = abstractC4308M23934;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1412(C17138 c17138) throws Throwable {
        C2609 c2609 = c17138.f52525;
        this.f28214.m36123(c2609, m23923(c2609, this.f28211));
        AbstractC4308 abstractC4308M23931 = m23931(c17138, c17138.f52525);
        this.f28223 = abstractC4308M23931;
        c17138.f16086 = abstractC4308M23931;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C8541 c8541 = (C8541) c14315.f16086;
        C2609 c2609 = c14315.f43168;
        if (c2609 != null && c2609.m8249()) {
            C2609 c26010 = c14315.f43168;
            C13395 c13395 = this.f28250;
            c13395.getClass();
            c13395.f40035.m43511(new RunnableC6061(2, c13395, c26010));
        }
        if (c8541.mo12939().mo12948()) {
            return;
        }
        c8541.mo21267(m23931(c14315, c14315.f43170));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23931(AbstractC5144 abstractC5144, C2609 c2609) throws Throwable {
        AbstractC12612 abstractC12612;
        HashSet hashSet = new HashSet();
        boolean zM8249 = c2609.m8249();
        C6319 c6319 = this.f28251;
        if (zM8249) {
            Object obj = c2609.f8240;
            AbstractC12612 abstractC12613 = (AbstractC12612) obj;
            abstractC12613.f16086 = m23926(abstractC12613.f16086, (AbstractC5144) obj, false, false, false);
            hashSet.add(c6319.m17519(((AbstractC12612) c2609.f8240).f16086));
            if (((AbstractC12612) c2609.f8240).f16086.mo12948()) {
                return ((AbstractC12612) c2609.f8240).f16086;
            }
            if (((AbstractC12612) c2609.f8240).f16086.m12913(EnumC9454.TYPEVAR)) {
                if (c2609.f8241.m8249()) {
                    AbstractC12612 abstractC12614 = (AbstractC12612) c2609.f8241.f8240;
                    abstractC12614.getClass();
                    this.f28253.m7273(abstractC12614, C6241.f19228);
                    return ((AbstractC12612) c2609.f8240).f16086;
                }
            } else {
                for (AbstractC12612 abstractC12615 : c2609.f8241) {
                    AbstractC4308 abstractC4308M23926 = m23926(abstractC12615.f16086, (AbstractC5144) abstractC12615, false, true, false);
                    abstractC12615.f16086 = abstractC4308M23926;
                    if (abstractC4308M23926.mo12948()) {
                        c2609 = C2609.of((Object) abstractC12615);
                    } else if (abstractC12615.f16086.m12913(EnumC9454.CLASS)) {
                        this.f28214.m36154(abstractC12615, c6319.m17519(abstractC12615.f16086), hashSet);
                    }
                }
            }
        }
        if (c2609.m8245() == 0) {
            return this.f28244.f66526;
        }
        if (c2609.m8245() == 1) {
            return ((AbstractC12612) c2609.f8240).f16086;
        }
        C5843 c5843M17534 = c6319.m17534(C7260.m19434(c2609));
        if (((AbstractC12612) c2609.f8240).f16086.mo12925()) {
            abstractC12612 = null;
        } else {
            abstractC12612 = (AbstractC12612) c2609.f8240;
            c2609 = c2609.f8241;
        }
        C17013 c17013 = this.f28249;
        c17013.m39946((InterfaceC3109) abstractC5144);
        C5557 c5557M39908 = c17013.m39908(c17013.m39899(1025L), this.f28229.f18867, C2609.m8239(), abstractC12612, c2609, C2609.m8239());
        C14163 c14163 = (C14163) c5843M17534.f13890;
        c14163.mo16101();
        C12171.m29642((c14163.f17563 & 16777216) != 0);
        c5557M39908.f17186 = c14163;
        C1755 c1755 = this.f28211;
        c14163.f42770 = c1755.f6075.f4745;
        c14163.f17563 |= 268435456;
        this.f28219.getClass();
        this.f28222.m39521(c14163, C13809.m33120(c1755, c5557M39908));
        m23948(c14163);
        return c5843M17534;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        AbstractC4308 abstractC4308M23954;
        EnumC15678 enumC15678 = c15726.f48502.f60620;
        EnumC15678 enumC15679 = EnumC15678.UNBOUND;
        C20661 c20661 = this.f28244;
        if (enumC15678 != enumC15679) {
            abstractC4308M23954 = m23954(c15726.f48501, this.f28211, AbstractC4308.f13885);
        } else {
            abstractC4308M23954 = c20661.f66526;
        }
        this.f28223 = m23934(c15726, new C19831(this.f28214.m36201(c15726, abstractC4308M23954), c15726.f48502.f60620, c20661.f66480), C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        C12171.m29640("should be handled in annotate");
        throw null;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        C1755 c1755 = this.f28211;
        for (C2609 c2609 = c18257.f56778; c2609.m8249(); c2609 = c2609.f8241) {
            m23954(((C17551) c2609.f8240).f53650, c1755, AbstractC4308.f13885);
        }
        final AbstractC4308 abstractC4308Mo12909 = m23954(c18257.f56779, this.f28211, AbstractC4308.f13885).mo12909(C14391.f43357);
        if (!((C8604) this.f28211.f6073).f26291) {
            final C2609 c26010 = c18257.f56778;
            final C13395 c13395 = this.f28250;
            c13395.getClass();
            c13395.f40035.m43511(new Runnable() { // from class: l.ᩴ᩹֨
                @Override // java.lang.Runnable
                public final void run() {
                    c13395.getClass();
                    C2609 c26011 = c26010;
                    C2609 c2609M32389 = C13395.m32389(c26011);
                    C12171.m29642(c26011.m8245() == c2609M32389.m8245());
                    abstractC4308Mo12909.m12910(EnumC23564.ANNOTATIONS).mo18159(new C14391(c2609M32389));
                }
            });
        }
        c18257.f16086 = abstractC4308Mo12909;
        this.f28223 = abstractC4308Mo12909;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1374(C3440 c3440) {
        C2609 c2609 = c3440.f10874;
        if (c2609 != null) {
            C1755 c1755 = this.f28211;
            C1755 c1755M5877 = c1755.m5877(c1755.f6074, c1755.f6073);
            ((C8604) c1755M5877.f6073).f26284 = this.f28228;
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                m23930((AbstractC5144) it.next(), c1755M5877, new C23420(this, C15406.f47186, this.f28213.f75219));
            }
        }
        C12193 c12193 = this.f28244.f66457;
        c3440.f16086 = c12193;
        this.f28223 = c12193;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23942(C1755 c1755) throws Throwable {
        int i = C0883.f3449[c1755.f6074.mo989().ordinal()];
        C13395 c13395 = this.f28250;
        C15240 c15240 = this.f28214;
        if (i == 22) {
            AbstractC5144 abstractC5144 = c1755.f6074;
            abstractC5144.getClass();
            C0052 c0052 = ((C3587) c1755.f6074).f11377;
            try {
                c13395.m32413();
                C1755 c1755M39519 = this.f28219.f41160.m39519(c0052);
                m23928(c1755M39519.f6074, c1755M39519);
                return;
            } catch (C20515 e) {
                c15240.m36110(abstractC5144, e);
                return;
            }
        }
        if (i == 23) {
            AbstractC5144 abstractC5145 = c1755.f6074;
            abstractC5145.getClass();
            C7814 c7814 = ((C7820) c1755.f6074).f24200;
            try {
                c13395.m32413();
                AbstractC12612 abstractC12612 = ((C7820) this.f28222.m39519(c7814).f6074).f24199;
                abstractC12612.getClass();
                c15240.m36144(c7814, abstractC12612);
                return;
            } catch (C20515 e2) {
                c15240.m36110(abstractC5145, e2);
                return;
            }
        }
        AbstractC5144 abstractC5146 = c1755.f6074;
        abstractC5146.getClass();
        C14163 c14163 = c1755.f6079.f17186;
        try {
            c13395.m32413();
            m23948(c14163);
        } catch (C20515 e3) {
            c15240.m36110(abstractC5146, e3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23948(C14163 c14163) throws Throwable {
        C4824 c4824;
        InterfaceC18278 interfaceC18278;
        C23420 c23420;
        boolean z;
        C11576 c11576;
        if (!c14163.f17560.m12913(EnumC9454.ERROR)) {
            AbstractC4308 abstractC4308 = c14163.f17560;
            C15240 c15240 = this.f28214;
            c15240.m36186(null, abstractC4308);
            AbstractC4308 abstractC4309 = c14163.f17560;
            C6319 c6319 = this.f28251;
            AbstractC4308 abstractC4308M17562 = c6319.m17562(abstractC4309);
            long j = c14163.f17563;
            if ((16777216 & j) == 0 && (j & 536870912) == 0) {
                EnumC9454 enumC9454 = EnumC9454.CLASS;
                if (abstractC4308M17562.m12913(enumC9454)) {
                    m23948((C14163) abstractC4308M17562.f13890);
                }
                AbstractC5698 abstractC5698 = c14163.f17561;
                if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17560.m12913(enumC9454)) {
                    m23948((C14163) c14163.f17561);
                }
                c14163.f17563 |= 536870912;
            }
            long j2 = c14163.f17563;
            if ((268435456 & j2) != 0) {
                c14163.f17563 = j2 & (-268435457);
                C1755 c1755M39519 = this.f28222.m39519(c14163);
                boolean zM16100 = c14163.m16100();
                C22364 c22364 = this.f28253;
                if (zM16100 && !c14163.m16090() && !c14163.f42764 && c14163.f42765.isEmpty()) {
                    c22364.m7273(C7260.m19439(c14163, c1755M39519.f6074, false), C6241.f19191);
                }
                boolean zM16101 = c14163.m16100();
                C20661 c20661 = this.f28244;
                if (zM16101) {
                    HashSet hashSet = new HashSet();
                    boolean z2 = c14163.m16089().f24147 == c20661.f66447 || c14163.m16089().f24147 == c20661.f66465;
                    for (Iterator it = c14163.f42765.iterator(); it.hasNext(); it = it) {
                        AbstractC5698 abstractC5699 = (AbstractC5698) it.next();
                        if (abstractC5699.f17560.mo3258() == EnumC9454.TYPEVAR) {
                            AbstractC5144 abstractC5144M19439 = C7260.m19439(abstractC5699, c1755M39519.f6074, false);
                            AbstractC4308 abstractC43010 = abstractC5699.f17560;
                            C11576 c11577 = C11886.f35440;
                            c22364.m7273(abstractC5144M19439, C6241.m17186(new C11576("compiler", "is.a.type.variable", abstractC43010)));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (abstractC5699.f17562.isEmpty() && !c14163.m16090()) {
                            AbstractC5144 abstractC5144M194310 = C7260.m19439(abstractC5699, c1755M39519.f6074, false);
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(abstractC5144M194310, new C12281("compiler", "local.classes.cant.extend.sealed", C11886.f35494));
                        }
                        if (hashSet.contains(abstractC5699)) {
                            InterfaceC3109 interfaceC3109 = (InterfaceC3109) ((C2609) C5378.stream(c1755M39519.f6079.f17182).filter(new C3379(1, abstractC5699)).limit(2L).collect(C2609.m8240())).get(1);
                            AbstractC4308 abstractC43011 = abstractC5699.f17560;
                            C11576 c11578 = C11886.f35440;
                            c22364.m7273(interfaceC3109, C6241.m17186(new C11576("compiler", "is.duplicated", abstractC43011)));
                        } else {
                            hashSet.add(abstractC5699);
                        }
                        if (z2) {
                            if (abstractC5699.m16089() != c14163.m16089()) {
                                AbstractC5144 abstractC5144M194311 = C7260.m19439(abstractC5699, c1755M39519.f6074, false);
                                C12281 c12282 = C6241.f19132;
                                c22364.m7273(abstractC5144M194311, new C12281("compiler", "class.in.unnamed.module.cant.extend.sealed.in.diff.package", c14163));
                            }
                        } else if (abstractC5699.m16089().f24147 != c14163.m16089().f24147) {
                            AbstractC5144 abstractC5144M194312 = C7260.m19439(abstractC5699, c1755M39519.f6074, false);
                            C0052 c0052 = c14163.m16089().f24147;
                            C12281 c12283 = C6241.f19132;
                            c22364.m7273(abstractC5144M194312, new C12281("compiler", "class.in.module.cant.extend.sealed.in.diff.module", c14163, c0052));
                        }
                        AbstractC4308 abstractC43012 = c14163.f17560;
                        if (abstractC5699 == abstractC43012.f13890 || c6319.m17536(abstractC5699.f17560, abstractC43012)) {
                            InterfaceC3109 interfaceC31010 = (InterfaceC3109) C5378.stream(((C5557) c1755M39519.f6074).f17182).map(new C5693(3, abstractC5699)).filter(new C4464(5)).findFirst().get();
                            if (abstractC5699 == c14163.f17560.f13890) {
                                c11576 = C11886.f35469;
                            } else {
                                AbstractC4308 abstractC43013 = abstractC5699.f17560;
                                C11576 c11579 = C11886.f35440;
                                c11576 = new C11576("compiler", "must.not.be.supertype", abstractC43013);
                            }
                            c22364.m7273(interfaceC31010, C6241.m17186(c11576));
                        } else if (!z && !C5378.stream(c6319.m17565(abstractC5699.f17560)).anyMatch(new C15448(0, c14163))) {
                            AbstractC5144 abstractC5144M194313 = C7260.m19439(abstractC5699, c1755M39519.f6074, false);
                            AbstractC4308 abstractC43014 = abstractC5699.f17560;
                            C11576 c115710 = C11886.f35440;
                            c22364.m7273(abstractC5144M194313, C6241.m17186(new C11576("compiler", "doesnt.extend.sealed", abstractC43014)));
                        }
                        abstractC4308M17562 = abstractC4308M17562;
                        c20661 = c20661;
                    }
                }
                C20661 c20662 = c20661;
                AbstractC4308 abstractC43015 = abstractC4308M17562;
                C2609<C14163> c2609 = (C2609) C5378.stream(c6319.m17565(c14163.f17560)).filter(new C21800(0)).map(new C21670(5)).collect(C2609.m8240());
                if (!c2609.isEmpty()) {
                    if (c14163.m16077() && !c14163.m16090()) {
                        AbstractC5144 abstractC5144M194314 = C7260.m19439(c14163, c1755M39519.f6074, false);
                        C11576 c115711 = c14163.f17562.isEmpty() ? C11886.f35494 : C11886.f35498;
                        C12281 c12284 = C6241.f19132;
                        c22364.m7273(abstractC5144M194314, new C12281("compiler", "local.classes.cant.extend.sealed", c115711));
                    }
                    if (!c14163.f17560.mo5146()) {
                        for (C14163 c14164 : c2609) {
                            if (!c14164.f42765.contains(c14163.f17560.f13890)) {
                                AbstractC5144 abstractC5144M194315 = C7260.m19439(c14163.f17560.f13890, c1755M39519.f6074, false);
                                C12281 c12285 = C6241.f19132;
                                c22364.m7273(abstractC5144M194315, new C12281("compiler", "cant.inherit.from.sealed", c14164));
                            }
                        }
                        long j3 = c14163.f17563;
                        if ((j3 & Long.MIN_VALUE) == 0 && (j3 & 16) == 0 && !c14163.m16100()) {
                            c22364.m7273(C7260.m19439(c14163, c1755M39519.f6074, false), c14163.m16070() ? C6241.f19163 : C6241.f19130);
                        }
                    }
                } else if ((c14163.f17563 & Long.MIN_VALUE) != 0 && !C5378.stream(c6319.m17565(c14163.f17560)).anyMatch(new C18282(2))) {
                    AbstractC5144 abstractC5144M194316 = C7260.m19439(c14163, c1755M39519.f6074, false);
                    C12281 c12286 = C6241.f19132;
                    c22364.m7273(abstractC5144M194316, new C12281("compiler", "non.sealed.with.no.sealed.supertype", c14163));
                }
                C1755 c1755 = c1755M39519;
                while (true) {
                    c4824 = ((C8604) c1755.f6073).f26289;
                    if (c4824 != null) {
                        break;
                    } else {
                        c1755 = c1755.f6072;
                    }
                }
                Object obj = c1755M39519.f6073;
                ((C8604) obj).f26289 = c4824.m14053(c14163);
                C8604 c8604 = (C8604) obj;
                C4824 c4824M36112 = c15240.m36112(c8604.f26289);
                InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c14163.f42770);
                C23420 c23421 = c8604.f26284;
                try {
                    this.f28248.m42472(c1755M39519.f6074);
                    ((C8604) obj).f26284 = null;
                    if (abstractC43015.f13890 == c20662.f66527) {
                        interfaceC18278 = interfaceC18278M7284;
                        c23420 = c23421;
                        try {
                            if ((c14163.f17563 & 16793600) == 0) {
                                AbstractC5144 abstractC5144 = c1755M39519.f6074;
                                abstractC5144.getClass();
                                c22364.m7273(abstractC5144, C6241.f19187);
                            }
                        } catch (Throwable th) {
                            th = th;
                            c8604.f26284 = c23420;
                            c22364.m7284(interfaceC18278);
                            c15240.m36112(c4824M36112);
                            throw th;
                        }
                    } else {
                        interfaceC18278 = interfaceC18278M7284;
                        c23420 = c23421;
                    }
                    AbstractC19810 abstractC19810 = abstractC43015.f13890;
                    if (abstractC19810 != null && (abstractC19810.f17563 & 16384) != 0 && (c14163.f17563 & 16793600) == 0) {
                        AbstractC5144 abstractC5145 = c1755M39519.f6074;
                        abstractC5145.getClass();
                        c22364.m7273(abstractC5145, C6241.f19241);
                    }
                    if (m23951(c14163.f17560)) {
                        ((C8604) obj).f26287 = true;
                    }
                    m23911(c14163, c1755M39519);
                    AbstractC5144 abstractC5146 = c1755M39519.f6074;
                    abstractC5146.getClass();
                    c15240.m36144((AbstractC5698) c14163, abstractC5146);
                    AbstractC5144 abstractC5147 = c1755M39519.f6074;
                    abstractC5147.getClass();
                    c15240.m36139(abstractC5147, c14163);
                    c15240.m36142((C5557) c1755M39519.f6074, c14163);
                    c15240.m36119(c1755M39519, (C5557) c1755M39519.f6074);
                    c8604.f26284 = c23420;
                    c22364.m7284(interfaceC18278);
                    c15240.m36112(c4824M36112);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC18278 = interfaceC18278M7284;
                    c23420 = c23421;
                }
            }
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C0052 c0052 = c3587.f11377;
        InterfaceC6403 interfaceC6403 = c0052.f923;
        InterfaceC6403 interfaceC6404 = InterfaceC6403.f19811;
        if (interfaceC6403 != interfaceC6404) {
            c0052.f923 = interfaceC6404;
            interfaceC6403.mo7076(c0052);
        }
        C0052 c0053 = c3587.f11377;
        C8604 c8604 = (C8604) this.f28211.f6076.f6073;
        C4824 c4824M14053 = c8604.f26289.m14053(c0053);
        c8604.f26289 = c4824M14053;
        C15240 c15240 = this.f28214;
        C4824 c4824M36112 = c15240.m36112(c4824M14053);
        c15240.m36132(c3587);
        c15240.m36144(c0053, c3587);
        try {
            this.f28248.m42472((AbstractC5144) c3587);
        } finally {
            c15240.m36112(c4824M36112);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23911(C14163 c14163, C1755 c1755) throws Throwable {
        C6136 c6136;
        long j;
        C12048 c12048;
        C17551 c17551;
        AbstractC5144 abstractC5144 = c1755.f6074;
        Object obj = c1755.f6073;
        C5557 c5557 = (C5557) abstractC5144;
        C12171.m29642(c14163 == c5557.f17186);
        m23956(c5557.f17185, c1755);
        boolean zIsEmpty = c14163.f17562.isEmpty();
        C15240 c15240 = this.f28214;
        if (!zIsEmpty) {
            c15240.m36122(c5557.f17185, c1755);
            c15240.m36137((AbstractC5144) c5557.f17184, c1755, true);
            c15240.m36122(c5557.f17183, c1755);
        }
        C6319 c6319 = this.f28251;
        c14163.m33813(c6319);
        c14163.mo16101();
        if ((c14163.f17563 & 1536) == 0) {
            c15240.m36157(c14163, (InterfaceC3109) c5557);
        }
        c14163.mo16101();
        long j2 = c14163.f17563 & 8192;
        C22364 c22364 = this.f28253;
        if (j2 != 0) {
            if (c5557.f17183.m8249()) {
                AbstractC12612 abstractC12612 = (AbstractC12612) c5557.f17183.f8240;
                abstractC12612.getClass();
                c22364.m7273(abstractC12612, C6241.f19287);
            }
            if (c5557.f17185.m8249()) {
                C14315 c14315 = (C14315) c5557.f17185.f8240;
                c14315.getClass();
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c14315, new C12281("compiler", "intf.annotation.cant.have.type.params", c14163));
            }
            C16384 c16384Mo36582 = c14163.mo33816().mo36582();
            if (c16384Mo36582 != null) {
                AbstractC4308 abstractC4308 = c16384Mo36582.f26338;
                C2609 c2609 = c5557.f17181.f7168;
                while (true) {
                    if (c2609.isEmpty()) {
                        c17551 = null;
                        break;
                    } else {
                        if (c6319.m17550(((C17551) c2609.f8240).f53650.f16086, abstractC4308)) {
                            c17551 = (C17551) c2609.f8240;
                            c17551.getClass();
                            break;
                        }
                        c2609 = c2609.f8241;
                    }
                }
                C12171.m29637(c17551);
                c15240.m36158(c14163, c16384Mo36582, c17551);
            }
        } else {
            c15240.m36190(c5557, c14163.f17560);
            if (this.f28212) {
                c15240.m36195(c5557, c14163.f17560);
            }
        }
        AbstractC4308 abstractC4309 = c14163.f17560;
        c15240.getClass();
        c15240.m36124(c5557, new HashMap(), abstractC4309);
        c5557.f16086 = c14163.f17560;
        for (C2609 c26010 = c5557.f17185; c26010.m8249(); c26010 = c26010.f8241) {
            C12171.m29637(((C8604) obj).f26285.mo20478(((C14315) c26010.f8240).f43169, (Predicate) null));
        }
        if (!c14163.f17560.mo12934().isEmpty() && c6319.m17546(c14163.f17560, this.f28244.f66479, true)) {
            AbstractC12612 abstractC12613 = c5557.f17184;
            abstractC12613.getClass();
            c22364.m7273(abstractC12613, C6241.f19277);
        }
        C14163 c14164 = c5557.f17186;
        c15240.m36140((AbstractC5144) c5557, c14164, c14164);
        m23944((InterfaceC3109) c5557, c1755, c14163.f17560);
        C2609 c26011 = c5557.f17179;
        while (true) {
            boolean zM8249 = c26011.m8249();
            c6136 = this.f28229;
            if (!zM8249) {
                break;
            }
            m23928((AbstractC5144) c26011.f8240, c1755);
            if (!this.f28245 && c14163.f17561.f17559 != EnumC1296.f4579) {
                c14163.mo16101();
                if (((c14163.f17563 & 8) == 0 || c14163.f17562 == c6136.f18867) && (C7260.m19473((AbstractC5144) c26011.f8240) & 520) != 0) {
                    C12048 c12049 = ((AbstractC5144) c26011.f8240).m14709(EnumC18550.f57578) ? ((C9378) c26011.f8240).f28489 : null;
                    if (c12049 == null || c12049.f17559 != EnumC1296.f4567 || c12049.m29425() == null) {
                        AbstractC5144 abstractC5145 = (AbstractC5144) c26011.f8240;
                        abstractC5145.getClass();
                        C12281 c12282 = C6241.f19132;
                        c22364.m7273(abstractC5145, new C12281("compiler", "icls.cant.have.static.decl", c14163));
                    }
                }
            }
            c26011 = c26011.f8241;
        }
        c15240.m36141(c5557);
        long j3 = c5557.f17186.f17563;
        if ((j3 & 8192) != 0) {
            C12171.m29642((j3 & 134217728) == 0);
            try {
                j = 34359738368L;
                try {
                    c5557.f17186.f17563 |= 134217728;
                    for (AbstractC5144 abstractC5146 : c5557.f17179) {
                        if (abstractC5146.m14709(EnumC18550.f57511)) {
                            C8526 c8526 = (C8526) abstractC5146;
                            c15240.m36149(c8526, c8526.f26051.f16086);
                        }
                    }
                    C14163 c14165 = c5557.f17186;
                    c14165.f17563 = ((-134217729) & c14165.f17563) | 34359738368L;
                } catch (Throwable th) {
                    th = th;
                    C14163 c14166 = c5557.f17186;
                    c14166.f17563 = (c14166.f17563 & (-134217729)) | j;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = 34359738368L;
            }
        }
        C8604 c8604 = (C8604) obj;
        if (c8604.f26289.m14055(EnumC20347.SERIAL) && m23951(c14163.f17560)) {
            c14163.mo16101();
            if ((c14163.f17563 & 16896) == 0 && !c14163.f17562.isEmpty()) {
                c14163.mo16101();
                Iterator it = c14163.f42762.m20476(c6136.f18795).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c12048 = null;
                        break;
                    }
                    AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                    if (abstractC5698.f17559 == EnumC1296.f4567) {
                        c12048 = (C12048) abstractC5698;
                        break;
                    }
                }
                if (c12048 != null) {
                    C4824 c4824M14053 = c8604.f26289.m14053(c12048);
                    EnumC20347 enumC20347 = EnumC20347.SERIAL;
                    if (!c4824M14053.m14056(enumC20347)) {
                        if ((c12048.f17563 & 24) != 24) {
                            AbstractC5144 abstractC5144M19439 = C7260.m19439(c12048, c5557, false);
                            C11076 c11076 = C14001.f42334;
                            c22364.m7286(enumC20347, abstractC5144M19439, new C11076("compiler", "improper.SVUID", c14163));
                        } else if (!c12048.f17560.m12913(EnumC9454.LONG)) {
                            AbstractC5144 abstractC5144M194310 = C7260.m19439(c12048, c5557, false);
                            C11076 c11077 = C14001.f42334;
                            c22364.m7286(enumC20347, abstractC5144M194310, new C11076("compiler", "long.SVUID", c14163));
                        } else if (c12048.m29425() == null) {
                            AbstractC5144 abstractC5144M194311 = C7260.m19439(c12048, c5557, false);
                            C11076 c11078 = C14001.f42334;
                            c22364.m7286(enumC20347, abstractC5144M194311, new C11076("compiler", "constant.SVUID", c14163));
                        }
                    }
                } else if (!c14163.m33810()) {
                    EnumC20347 enumC20348 = EnumC20347.SERIAL;
                    C11076 c11079 = C14001.f42334;
                    c22364.m7286(enumC20348, c5557, new C11076("compiler", "missing.SVUID", c14163));
                }
            }
        }
        if (this.f28255) {
            this.f28256.m40511(c5557);
            m23945((AbstractC5144) c5557, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23951(AbstractC4308 abstractC4308) {
        C20661 c20661 = this.f28244;
        try {
            c20661.f66487.mo12918();
            return this.f28251.m17546(abstractC4308, c20661.f66487, true);
        } catch (C20515 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23909(C9378 c9378, AbstractC4308 abstractC4308) {
        boolean zMo12948 = abstractC4308.mo12948();
        C17013 c17013 = this.f28249;
        if (zMo12948) {
            c17013.f52172 = -1;
            c9378.f28488 = c17013.m39948();
        } else {
            c17013.f52172 = -1;
            c9378.f28488 = c17013.m39965(abstractC4308);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23945(AbstractC5144 abstractC5144, boolean z) {
        abstractC5144.mo988(new C20599(this, z));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23957(AbstractC5144 abstractC5144) {
        new C17776(this).mo10758(abstractC5144);
    }
}
