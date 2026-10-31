package l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17013 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C4314 f52168 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17719 f52169;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6136 f52170;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6319 f52171;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52172;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1323 f52173;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20661 f52174;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17013 m39896(C2903 c2903) {
        C4314 c4314 = f52168;
        C17013 c17013 = (C17013) c2903.m8838(c4314);
        if (c17013 != null) {
            return c17013;
        }
        C17013 c17014 = new C17013();
        c17014.f52172 = -1;
        c17014.f52169 = new C17719(c17014);
        c2903.m8841(c4314, c17014);
        c17014.f52172 = -1;
        c17014.f52173 = null;
        c17014.f52170 = C6136.m17057(c2903);
        c17014.f52174 = C20661.m47250(c2903);
        c17014.f52171 = C6319.m17456(c2903);
        return c17014;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17013 m39931(C1323 c1323) {
        C6136 c6136 = this.f52170;
        C6319 c6319 = this.f52171;
        C20661 c20661 = this.f52174;
        C17013 c17013 = new C17013();
        c17013.f52169 = new C17719(c17013);
        c17013.f52172 = 0;
        c17013.f52173 = c1323;
        c17013.f52170 = c6136;
        c17013.f52171 = c6319;
        c17013.f52174 = c20661;
        return c17013;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39945(int i) {
        this.f52172 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39946(InterfaceC3109 interfaceC3109) {
        this.f52172 = interfaceC3109 == null ? -1 : interfaceC3109.mo9483();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1323 m39970(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            final AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            C12171.m29643((abstractC5144 instanceof C5557) || (abstractC5144 instanceof C7820) || (abstractC5144 instanceof C10643) || (abstractC5144 instanceof C3587) || (abstractC5144 instanceof C5704) || (abstractC5144 instanceof C3440) || ((abstractC5144 instanceof C10496) && (((C10496) abstractC5144).f31483 instanceof C3440)), new Supplier() { // from class: l.֫֨۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC5144.getClass().getSimpleName();
                }
            });
        }
        C1323 c1323 = new C1323();
        c1323.f4741 = null;
        c1323.f4744 = null;
        c1323.f4743 = null;
        c1323.f4738 = c2609;
        c1323.f16085 = this.f52172;
        return c1323;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5557 m39908(C2176 c2176, AbstractC10370 abstractC10370, C2609 c2609, AbstractC12612 abstractC12612, C2609 c26010, C2609 c26011) {
        return m39909(c2176, abstractC10370, c2609, abstractC12612, c26010, C2609.m8239(), c26011);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5557 m39909(C2176 c2176, AbstractC10370 abstractC10370, C2609 c2609, AbstractC12612 abstractC12612, C2609 c26010, C2609 c26011, C2609 c26012) {
        C5557 c5557 = new C5557();
        c5557.f17181 = c2176;
        c5557.f17180 = abstractC10370;
        c5557.f17185 = c2609;
        c5557.f17184 = abstractC12612;
        c5557.f17183 = c26010;
        c5557.f17182 = c26011;
        c5557.f17179 = c26012;
        c5557.f17186 = null;
        c5557.f16085 = this.f52172;
        return c5557;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8526 m39917(C2176 c2176, AbstractC10370 abstractC10370, AbstractC12612 abstractC12612, C2609 c2609, C9378 c9378, C2609 c26010, C2609 c26011, C2735 c2735, AbstractC12612 abstractC12613) {
        C8526 c8526 = new C8526(c2176, abstractC10370, abstractC12612, c2609, c9378, c26010, c26011, c2735, abstractC12613, null);
        c8526.f16085 = this.f52172;
        return c8526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m39920(C2176 c2176, AbstractC10370 abstractC10370, AbstractC12612 abstractC12612, AbstractC12612 abstractC12613) {
        C9378 c9378 = new C9378(c2176, abstractC10370, abstractC12612, abstractC12613, null, false);
        c9378.f16085 = this.f52172;
        return c9378;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m39921(C2176 c2176, AbstractC10370 abstractC10370, AbstractC12612 abstractC12612, AbstractC12612 abstractC12613, boolean z) {
        C9378 c9378 = new C9378(c2176, abstractC10370, abstractC12612, abstractC12613, null, z);
        c9378.f16085 = this.f52172;
        return c9378;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m39922(C2176 c2176, AbstractC12612 abstractC12612, AbstractC12612 abstractC12613) {
        C9378 c9378 = new C9378(c2176, null, abstractC12613, null, null, false);
        c9378.f28483 = abstractC12612;
        if (abstractC12612.m14709(EnumC18550.f57566)) {
            c9378.f28484 = ((C7673) abstractC12612).f23696;
        } else {
            c9378.f28484 = ((C6262) abstractC12612).f19395;
        }
        c9378.f16085 = this.f52172;
        return c9378;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5704 m39963() {
        C5704 c5704 = new C5704();
        c5704.f16085 = this.f52172;
        return c5704;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2735 m39902(long j, C2609 c2609) {
        C2735 c2735 = new C2735();
        c2735.f8520 = -1;
        c2735.f8521 = c2609;
        c2735.f8522 = j;
        c2735.f16085 = this.f52172;
        return c2735;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11907 m39926(C2609 c2609, AbstractC12612 abstractC12612, C2609 c26010, AbstractC11349 abstractC11349) {
        C11907 c11907 = new C11907();
        c11907.f35587 = c2609;
        c11907.f35588 = abstractC12612;
        c11907.f35586 = c26010;
        c11907.f35585 = abstractC11349;
        c11907.f16085 = this.f52172;
        return c11907;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22637 m39972(AbstractC12612 abstractC12612, C2609 c2609) {
        C22637 c22637 = new C22637();
        c22637.f73106 = -1;
        c22637.f73103 = abstractC12612;
        c22637.f73102 = c2609;
        c22637.f16085 = this.f52172;
        return c22637;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18963 m39938(EnumC6652 enumC6652, C2609 c2609, C2609 c26010, AbstractC5144 abstractC5144) {
        C18963 c18963 = new C18963(enumC6652, c2609, c26010, abstractC5144);
        c18963.f16085 = this.f52172;
        return c18963;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13464 m39968(AbstractC12612 abstractC12612, C2609 c2609) {
        C13464 c13464 = new C13464();
        c13464.f40198 = -1;
        c13464.f40197 = abstractC12612;
        c13464.f40199 = c2609;
        c13464.f16085 = this.f52172;
        return c13464;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10789 m39925(C2609 c2609, C2735 c2735, C2609 c26010, C2735 c2736) {
        C10789 c10789 = new C10789();
        c10789.f32445 = c2735;
        c10789.f32449 = c26010;
        c10789.f32448 = c2736;
        c10789.f32446 = c2609;
        c10789.f16085 = this.f52172;
        return c10789;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0617 m39897(C9378 c9378, C2735 c2735) {
        C0617 c0617 = new C0617();
        c0617.f2373 = c9378;
        c0617.f2372 = c2735;
        c0617.f16085 = this.f52172;
        return c0617;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8379 m39916(AbstractC12612 abstractC12612, AbstractC12612 abstractC12613, AbstractC12612 abstractC12614) {
        C8379 c8379 = new C8379();
        c8379.f25701 = abstractC12612;
        c8379.f25699 = abstractC12613;
        c8379.f25700 = abstractC12614;
        c8379.f16085 = this.f52172;
        return c8379;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1470 m39898(AbstractC12612 abstractC12612, AbstractC11349 abstractC11349, AbstractC11349 abstractC113410) {
        C1470 c1470 = new C1470();
        c1470.f5225 = abstractC12612;
        c1470.f5226 = abstractC11349;
        c1470.f5227 = abstractC113410;
        c1470.f16085 = this.f52172;
        return c1470;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10496 m39953(AbstractC12612 abstractC12612) {
        C10496 c10496 = new C10496();
        c10496.f31483 = abstractC12612;
        c10496.f16085 = this.f52172;
        return c10496;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4146 m39906(AbstractC10370 abstractC10370) {
        C4146 c4146 = new C4146();
        c4146.f13545 = abstractC10370;
        c4146.f13546 = null;
        c4146.f16085 = this.f52172;
        return c4146;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2322 m39959(AbstractC12612 abstractC12612) {
        C2322 c2322 = new C2322();
        c2322.f7456 = abstractC12612;
        c2322.f7455 = null;
        c2322.f16085 = this.f52172;
        return c2322;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9938 m39964(AbstractC12612 abstractC12612) {
        C9938 c9938 = new C9938();
        c9938.f30017 = abstractC12612;
        c9938.f16085 = this.f52172;
        return c9938;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1616 m39971(AbstractC12612 abstractC12612) {
        C1616 c1616 = new C1616();
        c1616.f5680 = abstractC12612;
        c1616.f16085 = this.f52172;
        return c1616;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15580 m39929(AbstractC12612 abstractC12612, C2609 c2609, C2609 c26010) {
        C15580 c15580 = new C15580();
        if (c2609 == null) {
            c2609 = C2609.m8239();
        }
        c15580.f48010 = c2609;
        c15580.f48011 = abstractC12612;
        c15580.f48012 = c26010;
        c15580.f16085 = this.f52172;
        return c15580;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19110 m39939(AbstractC12612 abstractC12612, C2609 c2609, AbstractC12612 abstractC12613, C2609 c26010, C5557 c5557, boolean z) {
        C19110 c19110;
        if (z) {
            c19110 = new C10664(abstractC12612, c2609, abstractC12613, c26010, c5557);
        } else {
            c19110 = new C19110(abstractC12612, c2609, abstractC12613, c26010, c5557);
        }
        c19110.f16085 = this.f52172;
        return c19110;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18404 m39958(AbstractC12612 abstractC12612, C2609 c2609, C2609 c26010) {
        C18404 c18404 = new C18404();
        c18404.f57138 = abstractC12612;
        c18404.f57140 = c2609;
        c18404.f57137 = C2609.m8239();
        c18404.f57141 = C2609.m8239();
        c18404.f57139 = c26010;
        c18404.f16085 = this.f52172;
        return c18404;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14169 m39955(AbstractC5144 abstractC5144, C2609 c2609) {
        C14169 c14169 = new C14169();
        c14169.f42774 = true;
        c14169.f42775 = c2609;
        c14169.f42776 = abstractC5144;
        if (c2609.isEmpty() || ((C9378) c2609.f8240).f28488 != null) {
            c14169.f42773 = EnumC16992.EXPLICIT;
        } else {
            c14169.f42773 = EnumC16992.IMPLICIT;
        }
        c14169.f16085 = this.f52172;
        return c14169;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21080 m39941(AbstractC12612 abstractC12612, AbstractC12612 abstractC12613) {
        C21080 c21080 = new C21080();
        c21080.f67987 = abstractC12612;
        c21080.f67988 = abstractC12613;
        c21080.f16085 = this.f52172;
        return c21080;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9791 m39924(EnumC18550 enumC18550, AbstractC5144 abstractC5144, AbstractC5144 abstractC5145) {
        C9791 c9791 = new C9791();
        c9791.f2829 = enumC18550;
        c9791.f29619 = (AbstractC12612) abstractC5144;
        c9791.f29618 = (AbstractC12612) abstractC5145;
        c9791.f2830 = null;
        c9791.f16085 = this.f52172;
        return c9791;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6555 m39913(EnumC18550 enumC18550, AbstractC12612 abstractC12612) {
        C6555 c6555 = new C6555();
        c6555.f2829 = enumC18550;
        c6555.f20226 = abstractC12612;
        c6555.f16085 = this.f52172;
        return c6555;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9085 m39919(EnumC18550 enumC18550, AbstractC12612 abstractC12612, AbstractC12612 abstractC12613) {
        C9085 c9085 = new C9085();
        c9085.f2829 = enumC18550;
        c9085.f27533 = abstractC12612;
        c9085.f27532 = abstractC12613;
        c9085.f2830 = null;
        c9085.f16085 = this.f52172;
        return c9085;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17844 m39936(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612) {
        C17844 c17844 = new C17844();
        c17844.f54511 = abstractC5144;
        c17844.f54512 = abstractC12612;
        c17844.f16085 = this.f52172;
        return c17844;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21785 m39942() {
        C21785 c21785 = new C21785();
        c21785.f16085 = this.f52172;
        return c21785;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14728 m39956(AbstractC12612 abstractC12612, AbstractC12612 abstractC12613) {
        C14728 c14728 = new C14728(abstractC12612, abstractC12613);
        c14728.f16085 = this.f52172;
        return c14728;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6262 m39912(AbstractC12612 abstractC12612, AbstractC10370 abstractC10370) {
        C6262 c6262 = new C6262(abstractC12612, abstractC10370, null);
        c6262.f16085 = this.f52172;
        return c6262;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7673 m39951(AbstractC10370 abstractC10370) {
        C7673 c7673 = new C7673(abstractC10370, null);
        c7673.f16085 = this.f52172;
        return c7673;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23342 m39944(EnumC9454 enumC9454, Object obj) {
        C23342 c23342 = new C23342();
        c23342.f74996 = enumC9454;
        c23342.f74997 = obj;
        c23342.f16085 = this.f52172;
        return c23342;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2882 m39903(EnumC9454 enumC9454) {
        C2882 c2882 = new C2882();
        c2882.f9190 = enumC9454;
        c2882.f16085 = this.f52172;
        return c2882;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23901 m39969(AbstractC12612 abstractC12612) {
        C23901 c23901 = new C23901();
        c23901.f77274 = abstractC12612;
        c23901.f16085 = this.f52172;
        return c23901;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16432 m39960(AbstractC12612 abstractC12612, C2609 c2609) {
        C16432 c16432 = new C16432();
        c16432.f50542 = abstractC12612;
        c16432.f50541 = c2609;
        c16432.f16085 = this.f52172;
        return c16432;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15726 m39930(C19256 c19256, AbstractC5144 abstractC5144) {
        C15726 c15726 = new C15726();
        C12171.m29637(c19256);
        c15726.f48502 = c19256;
        c15726.f48501 = abstractC5144;
        c15726.f16085 = this.f52172;
        return c15726;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19256 m39940(EnumC15678 enumC15678) {
        C19256 c19256 = new C19256();
        c19256.f60620 = enumC15678;
        c19256.f16085 = this.f52172;
        return c19256;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17551 m39932(AbstractC5144 abstractC5144, C2609 c2609) {
        C17551 c17551 = new C17551(EnumC18550.f57490, abstractC5144, c2609);
        c17551.f16085 = this.f52172;
        return c17551;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17551 m39966(AbstractC5144 abstractC5144, C2609 c2609) {
        C17551 c17551 = new C17551(EnumC18550.f57483, abstractC5144, c2609);
        c17551.f16085 = this.f52172;
        return c17551;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2176 m39947(long j, C2609 c2609) {
        C2176 c2176 = new C2176();
        c2176.f7169 = j;
        c2176.f7168 = c2609;
        c2176.f16085 = ((j & (-4611677222334353921L)) == 0 && c2609.isEmpty()) ? -1 : this.f52172;
        return c2176;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2176 m39899(long j) {
        return m39947(j, C2609.m8239());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3587 m39904(C2176 c2176, EnumC6857 enumC6857, AbstractC12612 abstractC12612, C2609 c2609) {
        C3587 c3587 = new C3587(c2176, enumC6857, abstractC12612, c2609);
        c3587.f16085 = this.f52172;
        return c3587;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18257 m39937(AbstractC12612 abstractC12612, C2609 c2609) {
        C18257 c18257 = new C18257();
        C12171.m29642(c2609 != null && c2609.m8249());
        c18257.f56778 = c2609;
        c18257.f56779 = abstractC12612;
        c18257.f16085 = this.f52172;
        return c18257;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3440 m39948() {
        return m39949(C2609.m8239());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3440 m39949(C2609 c2609) {
        C3440 c3440 = new C3440();
        c3440.f10874 = c2609;
        c3440.f16085 = this.f52172;
        return c3440;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3733 m39962(AbstractC12612 abstractC12612, C2609 c2609) {
        C3733 c3733 = new C3733(abstractC12612, c2609);
        c3733.f16085 = this.f52172;
        return c3733;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5557 m39907(C2176 c2176, C2609 c2609) {
        return m39908(c2176, this.f52170.f18867, C2609.m8239(), (AbstractC12612) null, C2609.m8239(), c2609);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3733 m39905(C9378 c9378, AbstractC12612 abstractC12612) {
        C3733 c3733 = new C3733(abstractC12612, C2609.of((Object) c9378));
        c3733.f16085 = this.f52172;
        return c3733;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7673 m39914(AbstractC5698 abstractC5698) {
        AbstractC10370 abstractC10370Mo16083 = abstractC5698.f17562;
        if (abstractC10370Mo16083 == this.f52170.f18867) {
            abstractC10370Mo16083 = abstractC5698.mo16083();
        }
        C7673 c7673 = new C7673(abstractC10370Mo16083, abstractC5698);
        c7673.f16085 = this.f52172;
        c7673.f16086 = abstractC5698.f17560;
        return c7673;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6262 m39911(AbstractC12612 abstractC12612, AbstractC5698 abstractC5698) {
        C6262 c6262 = new C6262(abstractC12612, abstractC5698.f17562, abstractC5698);
        c6262.f16085 = this.f52172;
        c6262.f16086 = abstractC5698.f17560;
        return c6262;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m39961(C2609 c2609) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            c18837.m43511(m39914((AbstractC5698) ((C9378) c2609.f8240).f28489));
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7673 m39950(AbstractC4308 abstractC4308) {
        return m39914((AbstractC5698) new C12048(16L, this.f52170.f18886, abstractC4308, abstractC4308.f13890));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6262 m39910(AbstractC4308 abstractC4308) {
        return m39911(m39965(abstractC4308), new C12048(16L, this.f52170.f18886, abstractC4308, abstractC4308.f13890));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7673 m39915(C14163 c14163, AbstractC4308 abstractC4308) {
        return m39914((AbstractC5698) new C12048(16L, this.f52170.f18898, abstractC4308, c14163));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15580 m39957(AbstractC12612 abstractC12612, C2609 c2609) {
        C15580 c15580M39929 = m39929(abstractC12612, (C2609) null, c2609);
        c15580M39929.f16086 = abstractC12612.f16086.mo12923();
        return c15580M39929;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15580 m39928(AbstractC12612 abstractC12612) {
        C15580 c15580M39929 = m39929(abstractC12612, (C2609) null, C2609.m8239());
        c15580M39929.f16086 = abstractC12612.f16086.mo12923();
        return c15580M39929;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m39965(AbstractC4308 abstractC4308) {
        AbstractC12612 abstractC12612;
        AbstractC12612 abstractC12612M39903;
        AbstractC12612 abstractC12612M39954;
        if (abstractC4308 == null) {
            return null;
        }
        switch (C16307.f50169[abstractC4308.mo3258().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                abstractC12612M39903 = m39903(abstractC4308.mo3258());
                break;
            case 10:
                abstractC12612M39903 = m39914((AbstractC5698) abstractC4308.f13890);
                break;
            case 11:
                C19831 c19831 = (C19831) abstractC4308;
                EnumC15678 enumC15678 = c19831.f64065;
                abstractC12612M39903 = m39930(m39940(enumC15678), (AbstractC5144) (enumC15678 != EnumC15678.UNBOUND ? m39965(c19831.f64066) : null));
                break;
            case 12:
                int i = C16307.f50170[abstractC4308.mo3256().ordinal()];
                if (i == 1) {
                    C18837 c18837 = new C18837();
                    Iterator it = ((C7835) abstractC4308).m20930().iterator();
                    while (it.hasNext()) {
                        c18837.m43511(m39965((AbstractC4308) it.next()));
                    }
                    C2609 c2609M43517 = c18837.m43517();
                    C23488 c23488 = new C23488();
                    c23488.f75416 = c2609M43517;
                    c23488.f16085 = this.f52172;
                    abstractC12612 = c23488;
                } else if (i == 2) {
                    C18837 c18838 = new C18837();
                    Iterator it2 = ((C5843) abstractC4308).m16366().iterator();
                    while (it2.hasNext()) {
                        c18838.m43511(m39965((AbstractC4308) it2.next()));
                    }
                    C2609 c2609M43518 = c18838.m43517();
                    C17138 c17138 = new C17138();
                    c17138.f52525 = c2609M43518;
                    c17138.f16085 = this.f52172;
                    abstractC12612 = c17138;
                } else {
                    AbstractC4308 abstractC4308Mo4958 = abstractC4308.mo4958();
                    if (abstractC4308Mo4958.m12913(EnumC9454.CLASS) && abstractC4308.f13890.f17561.f17559 == EnumC1296.f4582) {
                        abstractC12612M39954 = m39911(m39965(abstractC4308Mo4958), abstractC4308.f13890);
                    } else {
                        abstractC12612M39954 = m39954(abstractC4308.f13890);
                    }
                    abstractC12612M39903 = abstractC12612M39954;
                    if (!abstractC4308.mo12938().isEmpty()) {
                        abstractC12612M39903 = m39960(abstractC12612M39954, m39967(abstractC4308.mo12938()));
                    }
                }
                abstractC12612M39903 = abstractC12612;
                break;
            case 13:
                abstractC12612M39903 = m39969(m39965(this.f52171.m17515(abstractC4308)));
                break;
            case 14:
                abstractC12612M39903 = m39903(EnumC9454.ERROR);
                break;
            default:
                throw new AssertionError("unexpected type: " + abstractC4308);
        }
        return abstractC12612M39903.mo30870(abstractC4308);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m39967(C2609 c2609) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            c18837.m43511(m39965((AbstractC4308) c2609.f8240));
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m39923(C12048 c12048, AbstractC12612 abstractC12612) {
        C9378 c9378 = new C9378(m39947(c12048.f17563, m39900(c12048.mo16068())), c12048.f17562, m39965(c12048.f17560), abstractC12612, c12048, false);
        c9378.f16085 = this.f52172;
        c9378.f16086 = c12048.f17560;
        return c9378;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m39900(C2609 c2609) {
        if (c2609 == null) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            c18837.m43511(m39934((AbstractC8624) c2609.f8240));
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23342 m39943(Object obj) {
        C23342 c23342M39944;
        AbstractC4308 abstractC4308Mo3257;
        C20661 c20661 = this.f52174;
        if (obj instanceof String) {
            c23342M39944 = m39944(EnumC9454.CLASS, obj);
            abstractC4308Mo3257 = c20661.f66533.mo3257(obj);
        } else if (obj instanceof Integer) {
            c23342M39944 = m39944(EnumC9454.INT, obj);
            abstractC4308Mo3257 = c20661.f66452.mo3257(obj);
        } else if (obj instanceof Long) {
            c23342M39944 = m39944(EnumC9454.LONG, obj);
            abstractC4308Mo3257 = c20661.f66470.mo3257(obj);
        } else if (obj instanceof Byte) {
            c23342M39944 = m39944(EnumC9454.BYTE, obj);
            abstractC4308Mo3257 = c20661.f66502.mo3257(obj);
        } else if (obj instanceof Character) {
            char cCharAt = ((Character) obj).toString().charAt(0);
            c23342M39944 = m39944(EnumC9454.CHAR, Integer.valueOf(cCharAt));
            abstractC4308Mo3257 = c20661.f66454.mo3257(Integer.valueOf(cCharAt));
        } else if (obj instanceof Double) {
            c23342M39944 = m39944(EnumC9454.DOUBLE, obj);
            abstractC4308Mo3257 = c20661.f66499.mo3257(obj);
        } else if (obj instanceof Float) {
            c23342M39944 = m39944(EnumC9454.FLOAT, obj);
            abstractC4308Mo3257 = c20661.f66483.mo3257(obj);
        } else if (obj instanceof Short) {
            c23342M39944 = m39944(EnumC9454.SHORT, obj);
            abstractC4308Mo3257 = c20661.f66513.mo3257(obj);
        } else if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            c23342M39944 = m39944(EnumC9454.BOOLEAN, Integer.valueOf(zBooleanValue ? 1 : 0));
            abstractC4308Mo3257 = c20661.f66469.mo3257(Integer.valueOf(zBooleanValue ? 1 : 0));
        } else {
            throw new AssertionError(obj);
        }
        c23342M39944.f16086 = abstractC4308Mo3257;
        return c23342M39944;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17551 m39934(AbstractC8624 abstractC8624) {
        return this.f52169.m41497((C16384) abstractC8624);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17551 m39933(C6507 c6507) {
        return this.f52169.m41496(c6507);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8526 m39918(C3581 c3581, AbstractC4308 abstractC4308, C2735 c2735) {
        C2176 c2176M39947 = m39947(c3581.f17563, m39900(c3581.mo16068()));
        AbstractC10370 abstractC10370 = c3581.f17562;
        AbstractC12612 abstractC12612M39965 = abstractC10370 != this.f52170.f18879 ? m39965(abstractC4308.mo12923()) : null;
        C18837 c18837 = new C18837();
        for (C2609 c2609Mo12938 = abstractC4308.mo12938(); c2609Mo12938.m8249(); c2609Mo12938 = c2609Mo12938.f8241) {
            Object obj = c2609Mo12938.f8240;
            AbstractC10370 abstractC10371 = ((AbstractC4308) obj).f13890.f17562;
            C8541 c8541 = (C8541) obj;
            C2609 c2609M39967 = m39967(this.f52171.m17484(c8541));
            C2609 c2609M8239 = C2609.m8239();
            C14315 c14315 = new C14315();
            c14315.f43169 = abstractC10371;
            c14315.f43170 = c2609M39967;
            c14315.f43168 = c2609M8239;
            c14315.f16085 = this.f52172;
            c14315.f16086 = c8541;
            c18837.m43511(c14315);
        }
        C8526 c8526 = new C8526(c2176M39947, abstractC10370, abstractC12612M39965, c18837.m43517(), null, m39901(abstractC4308.mo12933(), c3581), m39967(abstractC4308.mo12930()), c2735, null, c3581);
        c8526.f16085 = this.f52172;
        c8526.f16086 = abstractC4308;
        return c8526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m39901(C2609 c2609, C3581 c3581) {
        C18837 c18837 = new C18837();
        C3581 c3582 = c3581.f17559 == EnumC1296.f4571 ? c3581 : null;
        if (c3582 != null && c3582.f11367 != null && c2609.m8245() == c3582.f11367.m8245()) {
            Iterator it = c3581.f11367.iterator();
            while (it.hasNext()) {
                c18837.m43511(m39923((C12048) it.next(), (AbstractC12612) null));
            }
        } else {
            int i = 0;
            while (c2609.m8249()) {
                c18837.m43511(m39923(new C12048(8589934592L, m39952(i), (AbstractC4308) c2609.f8240, c3581), (AbstractC12612) null));
                c2609 = c2609.f8241;
                i++;
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14728 m39927(C12048 c12048, C15580 c15580) {
        C14728 c14728 = new C14728(m39954(c12048), c15580);
        c14728.f16086 = ((C5138) c12048.f17560).f16077;
        return c14728;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17844 m39935(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        C17844 c17844M39936 = m39936((AbstractC5144) m39965(abstractC4308), abstractC12612);
        c17844M39936.f16086 = abstractC4308;
        return c17844M39936;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r0.hasNext() == false) goto L39;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC12612 m39954(AbstractC5698 abstractC5698) {
        AbstractC5698 abstractC5699;
        EnumC1296 enumC1296;
        C1323 c1323 = this.f52173;
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        if (abstractC10370 != this.f52170.f18867 && (abstractC5699 = abstractC5698.f17561) != null && abstractC5699 != this.f52174.f66473 && (enumC1296 = abstractC5699.f17559) != EnumC1296.f4571 && enumC1296 != EnumC1296.f4567) {
            if (abstractC5698.f17559 == EnumC1296.f4582 && c1323 != null) {
                Iterator it = c1323.f4742.m20476(abstractC10370).iterator();
                if (it.hasNext()) {
                    if (((AbstractC5698) it.next()) == abstractC5698) {
                    }
                } else {
                    C7814 c7814 = c1323.f4746;
                    c7814.mo16101();
                    Iterator it2 = c7814.f24145.m20476(abstractC5698.f17562).iterator();
                    if (it2.hasNext()) {
                        if (((AbstractC5698) it2.next()) == abstractC5698) {
                        }
                    } else {
                        Iterator it3 = c1323.f4740.m20476(abstractC5698.f17562).iterator();
                        if (it3.hasNext()) {
                            if (((AbstractC5698) it3.next()) == abstractC5698) {
                            }
                        }
                    }
                }
            }
            return m39911(m39954(abstractC5698.f17561), abstractC5698);
        }
        return m39914(abstractC5698);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m39952(int i) {
        C6136 c6136 = this.f52170;
        return c6136.f18880.m30652(C19370.m44628(i, "x"));
    }
}
