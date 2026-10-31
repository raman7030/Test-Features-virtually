package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20599 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f66303;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f66304;

    public C20599(C9310 c9310, boolean z) {
        this.f66304 = c9310;
        this.f66303 = z;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        this.f66304.f28214.m36183(c17551, false);
        super.mo1413(c17551);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        if (c18257.f56779.f16086.mo12948()) {
            return;
        }
        super.mo1416(c18257);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C15240 c15240 = this.f66304.f28214;
        C2609 c2609 = c14315.f43168;
        c15240.getClass();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c15240.m36183((C17551) it.next(), true);
        }
        m33860(c14315.f43170);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        AbstractC4308 abstractC4308;
        C9378 c9378 = c8526.f26052;
        if (c9378 != null && !c9378.f28488.f16086.mo12948()) {
            C9378 c9379 = c8526.f26052;
            m47144(c9379.f28489, c9379.f28486.f7168);
        }
        AbstractC12612 abstractC12612 = c8526.f26051;
        if (abstractC12612 != null && (abstractC4308 = abstractC12612.f16086) != null) {
            m47143(abstractC4308, abstractC12612);
        }
        if (this.f66303) {
            mo10758(c8526.f26046);
            mo10758(c8526.f26051);
            m33860(c8526.f26047);
            mo10758(c8526.f26052);
            m33860(c8526.f26048);
            m33860(c8526.f26042);
            return;
        }
        mo10758(c8526.f26049);
        mo10758(c8526.f26043);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C12048 c12048 = c9378.f28489;
        if (c12048 != null && c12048.f17560 != null && !c9378.m24209()) {
            m47143(c9378.f28489.f17560, c9378.f28488);
        }
        mo10758(c9378.f28486);
        mo10758(c9378.f28488);
        if (this.f66303) {
            return;
        }
        mo10758(c9378.f28487);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        AbstractC4308 abstractC4308;
        AbstractC5144 abstractC5144 = c17844.f54511;
        if (abstractC5144 != null && (abstractC4308 = abstractC5144.f16086) != null) {
            m47143(abstractC4308, abstractC5144);
        }
        super.mo1415(c17844);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        AbstractC4308 abstractC4308;
        AbstractC5144 abstractC5144 = c16286.f50076;
        if (abstractC5144 != null && !(abstractC5144 instanceof AbstractC21932) && (abstractC4308 = abstractC5144.f16086) != null) {
            m47143(abstractC4308, abstractC5144);
        }
        super.mo1410(c16286);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        AbstractC12612 abstractC12612 = c19110.f60196;
        if (abstractC12612 != null && abstractC12612.f16086 != null) {
            if (abstractC12612.m14709(EnumC18550.f57497)) {
                AbstractC12612 abstractC12613 = c19110.f60196;
                m47144(abstractC12613.f16086.f13890, ((C18257) abstractC12613).f56778);
            }
            C5557 c5557 = c19110.f60195;
            if (c5557 != null) {
                m47144(c19110.f60196.f16086.f13890, c5557.f17181.f7168);
            }
            AbstractC12612 abstractC12614 = c19110.f60196;
            m47143(abstractC12614.f16086, abstractC12614);
        }
        super.mo1419(c19110);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        AbstractC12612 abstractC12612 = c18404.f57138;
        if (abstractC12612 != null && abstractC12612.f16086 != null) {
            if (abstractC12612.m14709(EnumC18550.f57497)) {
                AbstractC12612 abstractC12613 = c18404.f57138;
                m47144(abstractC12613.f16086.f13890, ((C18257) abstractC12613).f56778);
            }
            AbstractC12612 abstractC12614 = c18404.f57138;
            m47143(abstractC12614.f16086, abstractC12614);
        }
        super.mo1417(c18404);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        if (this.f66303) {
            mo10758(c5557.f17181);
            m33860(c5557.f17185);
            mo10758(c5557.f17184);
            m33860(c5557.f17183);
        }
        for (AbstractC5144 abstractC5144 : c5557.f17179) {
            if (!abstractC5144.m14709(EnumC18550.f57582)) {
                abstractC5144.mo988(this);
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        if (this.f66303) {
            return;
        }
        m33860(c2735.f8521);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47143(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144) {
        C22364 c22364 = this.f66304.f28253;
        if (abstractC4308.mo12907()) {
            return;
        }
        boolean z = true;
        AbstractC5144 abstractC5145 = abstractC5144;
        while (z) {
            if (abstractC5145.m14709(EnumC18550.f57521)) {
                C2609 c2609Mo12938 = abstractC4308.mo12938();
                C16432 c16432 = (C16432) abstractC5145;
                C2609 c2609 = c16432.f50541;
                if (c2609.m8245() > 0 && c2609Mo12938.m8245() == c2609.m8245()) {
                    for (int i = 0; i < c2609Mo12938.m8245(); i++) {
                        m47143((AbstractC4308) c2609Mo12938.get(i), (AbstractC5144) c2609.get(i));
                    }
                }
                abstractC5145 = c16432.f50542;
            }
            if (abstractC5145.m14709(EnumC18550.f57581)) {
                abstractC5145 = ((C6262) abstractC5145).f19397;
                if (abstractC4308 != null && !abstractC4308.m12913(EnumC9454.NONE)) {
                    abstractC4308 = abstractC4308.mo4958();
                }
            } else if (abstractC5145.m14709(EnumC18550.f57497)) {
                C18257 c18257 = (C18257) abstractC5145;
                if (abstractC4308 == null || abstractC4308.m12913(EnumC9454.NONE)) {
                    if (c18257.f56778.m8245() == 1) {
                        AbstractC12612 abstractC12612 = c18257.f56779;
                        abstractC12612.getClass();
                        C16384 c16384 = ((C17551) c18257.f56778.f8240).f53652;
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(abstractC12612, new C12281("compiler", "cant.type.annotate.scoping.1", c16384));
                    } else {
                        C18837 c18837 = new C18837();
                        Iterator it = c18257.f56778.iterator();
                        while (it.hasNext()) {
                            c18837.m43511(((C17551) it.next()).f53652);
                        }
                        AbstractC12612 abstractC12613 = c18257.f56779;
                        abstractC12613.getClass();
                        C2609 c2609M43517 = c18837.m43517();
                        C12281 c12282 = C6241.f19132;
                        c22364.m7273(abstractC12613, new C12281("compiler", "cant.type.annotate.scoping", c2609M43517));
                    }
                    z = false;
                }
                abstractC5145 = c18257.f56779;
            } else {
                if (!abstractC5145.m14709(EnumC18550.f57566)) {
                    if (abstractC5145.m14709(EnumC18550.f57500)) {
                        C15726 c15726 = (C15726) abstractC5145;
                        if (c15726.mo987() == EnumC3329.EXTENDS_WILDCARD || c15726.mo987() == EnumC3329.SUPER_WILDCARD) {
                            AbstractC5144 abstractC5146 = c15726.f48501;
                            m47143(abstractC5146.f16086, abstractC5146);
                        }
                    } else if (abstractC5145.m14709(EnumC18550.f57518)) {
                        AbstractC12612 abstractC12614 = ((C23901) abstractC5145).f77274;
                        m47143(abstractC12614.f16086, abstractC12614);
                    } else if (abstractC5145.m14709(EnumC18550.f57503)) {
                        for (AbstractC5144 abstractC5147 : ((C23488) abstractC5145).f75416) {
                            m47143(abstractC5147.f16086, abstractC5147);
                        }
                    } else if (abstractC5145.m14709(EnumC18550.f57561)) {
                        for (AbstractC5144 abstractC5148 : ((C17138) abstractC5145).f52525) {
                            m47143(abstractC5148.f16086, abstractC5148);
                        }
                    } else if (abstractC5145.mo987() != EnumC3329.PRIMITIVE_TYPE && abstractC5145.mo987() != EnumC3329.ERRONEOUS) {
                        C12171.m29640("Unexpected tree: " + abstractC5145 + " with kind: " + abstractC5145.mo987() + " within: " + abstractC5144 + " with kind: " + abstractC5144.mo987());
                        throw null;
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47144(AbstractC5698 abstractC5698, C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C17551 c17551 = (C17551) it.next();
            if (!c17551.f16086.mo12948()) {
                C9310 c9310 = this.f66304;
                if (c9310.f28256.m40508(c17551.f53652, abstractC5698) == EnumC1692.DECLARATION) {
                    C22364 c22364 = c9310.f28253;
                    AbstractC4308 abstractC4308 = c17551.f16086;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c17551, new C12281("compiler", "annotation.type.not.applicable.to.type", abstractC4308));
                }
            }
        }
    }
}
