package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21945 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f68983;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C11216 f68984;

    public C21945(C11216 c11216, boolean z) {
        this.f68984 = c11216;
        this.f68983 = z;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        this.f68984.f31163.m38344(c19049, false);
        super.mo3826(c19049);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        if (c19720.f59996.f18925.mo14812()) {
            return;
        }
        super.mo3829(c19720);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        C16852 c16852 = this.f68984.f31163;
        C4848 c4848 = c15973.f46260;
        c16852.getClass();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c16852.m38344((C19049) it.next(), true);
        }
        m35992(c15973.f46262);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        AbstractC6462 abstractC6462;
        C11281 c11281 = c10471.f28967;
        if (c11281 != null && !c11281.f31437.f18925.mo14812()) {
            C11281 c11282 = c10471.f28967;
            m49470(c11282.f31438, c11282.f31435.f9953);
        }
        AbstractC14355 abstractC14355 = c10471.f28966;
        if (abstractC14355 != null && (abstractC6462 = abstractC14355.f18925) != null) {
            m49469(abstractC6462, abstractC14355);
        }
        if (this.f68983) {
            mo12739(c10471.f28961);
            mo12739(c10471.f28966);
            m35992(c10471.f28962);
            mo12739(c10471.f28967);
            m35992(c10471.f28963);
            m35992(c10471.f28957);
            return;
        }
        mo12739(c10471.f28964);
        mo12739(c10471.f28958);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C13818 c13818 = c11281.f31438;
        if (c13818 != null && c13818.f20406 != null && !c11281.m26219()) {
            m49469(c11281.f31438.f20406, c11281.f31437);
        }
        mo12739(c11281.f31435);
        mo12739(c11281.f31437);
        if (this.f68983) {
            return;
        }
        mo12739(c11281.f31436);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        AbstractC6462 abstractC6462;
        AbstractC7257 abstractC7257 = c19327.f57709;
        if (abstractC7257 != null && (abstractC6462 = abstractC7257.f18925) != null) {
            m49469(abstractC6462, abstractC7257);
        }
        super.mo3828(c19327);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        AbstractC6462 abstractC6462;
        AbstractC7257 abstractC7257 = c17846.f53243;
        if (abstractC7257 != null && !(abstractC7257 instanceof AbstractC23212) && (abstractC6462 = abstractC7257.f18925) != null) {
            m49469(abstractC6462, abstractC7257);
        }
        super.mo3823(c17846);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        AbstractC14355 abstractC14355 = c20530.f63429;
        if (abstractC14355 != null && abstractC14355.f18925 != null) {
            if (abstractC14355.m16617(EnumC19998.f60721)) {
                AbstractC14355 abstractC14356 = c20530.f63429;
                m49470(abstractC14356.f18925.f16705, ((C19720) abstractC14356).f59995);
            }
            C7650 c7650 = c20530.f63428;
            if (c7650 != null) {
                m49470(c20530.f63429.f18925.f16705, c7650.f20022.f9953);
            }
            AbstractC14355 abstractC14357 = c20530.f63429;
            m49469(abstractC14357.f18925, abstractC14357);
        }
        super.mo3832(c20530);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        AbstractC14355 abstractC14355 = c19859.f60358;
        if (abstractC14355 != null && abstractC14355.f18925 != null) {
            if (abstractC14355.m16617(EnumC19998.f60721)) {
                AbstractC14355 abstractC14356 = c19859.f60358;
                m49470(abstractC14356.f18925.f16705, ((C19720) abstractC14356).f59995);
            }
            AbstractC14355 abstractC14357 = c19859.f60358;
            m49469(abstractC14357.f18925, abstractC14357);
        }
        super.mo3830(c19859);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        if (this.f68983) {
            mo12739(c7650.f20022);
            m35992(c7650.f20026);
            mo12739(c7650.f20025);
            m35992(c7650.f20024);
        }
        for (AbstractC7257 abstractC7257 : c7650.f20020) {
            if (!abstractC7257.m16617(EnumC19998.f60806)) {
                abstractC7257.mo3382(this);
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        if (this.f68983) {
            return;
        }
        m35992(c4968.f11316);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49469(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257) {
        C23623 c23623 = this.f68984.f31202;
        if (abstractC6462.mo14771()) {
            return;
        }
        boolean z = true;
        AbstractC7257 abstractC7258 = abstractC7257;
        while (z) {
            if (abstractC7258.m16617(EnumC19998.f60745)) {
                C4848 c4848Mo14802 = abstractC6462.mo14802();
                C17985 c17985 = (C17985) abstractC7258;
                C4848 c4848 = c17985.f53721;
                if (c4848.m10289() > 0 && c4848Mo14802.m10289() == c4848.m10289()) {
                    for (int i = 0; i < c4848Mo14802.m10289(); i++) {
                        m49469((AbstractC6462) c4848Mo14802.get(i), (AbstractC7257) c4848.get(i));
                    }
                }
                abstractC7258 = c17985.f53722;
            }
            if (abstractC7258.m16617(EnumC19998.f60805)) {
                abstractC7258 = ((C8320) abstractC7258).f22261;
                if (abstractC6462 != null && !abstractC6462.m14777(EnumC11353.NONE)) {
                    abstractC6462 = abstractC6462.mo7201();
                }
            } else if (abstractC7258.m16617(EnumC19998.f60721)) {
                C19720 c19720 = (C19720) abstractC7258;
                if (abstractC6462 == null || abstractC6462.m14777(EnumC11353.NONE)) {
                    if (c19720.f59995.m10289() == 1) {
                        AbstractC14355 abstractC14355 = c19720.f59996;
                        abstractC14355.getClass();
                        C17939 c17939 = ((C19049) c19720.f59995.f11034).f56842;
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(abstractC14355, new C14040("compiler", "cant.type.annotate.scoping.1", c17939));
                    } else {
                        C20271 c20271 = new C20271();
                        Iterator it = c19720.f59995.iterator();
                        while (it.hasNext()) {
                            c20271.m45777(((C19049) it.next()).f56842);
                        }
                        AbstractC14355 abstractC14356 = c19720.f59996;
                        abstractC14356.getClass();
                        C4848 c4848M45783 = c20271.m45783();
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(abstractC14356, new C14040("compiler", "cant.type.annotate.scoping", c4848M45783));
                    }
                    z = false;
                }
                abstractC7258 = c19720.f59996;
            } else {
                if (!abstractC7258.m16617(EnumC19998.f60790)) {
                    if (abstractC7258.m16617(EnumC19998.f60724)) {
                        C17314 c17314 = (C17314) abstractC7258;
                        if (c17314.mo3381() == EnumC5532.EXTENDS_WILDCARD || c17314.mo3381() == EnumC5532.SUPER_WILDCARD) {
                            AbstractC7257 abstractC7259 = c17314.f51641;
                            m49469(abstractC7259.f18925, abstractC7259);
                        }
                    } else if (abstractC7258.m16617(EnumC19998.f60742)) {
                        AbstractC14355 abstractC14357 = ((C25084) abstractC7258).f80025;
                        m49469(abstractC14357.f18925, abstractC14357);
                    } else if (abstractC7258.m16617(EnumC19998.f60727)) {
                        for (AbstractC7257 abstractC72510 : ((C24691) abstractC7258).f78164) {
                            m49469(abstractC72510.f18925, abstractC72510);
                        }
                    } else if (abstractC7258.m16617(EnumC19998.f60785)) {
                        for (AbstractC7257 abstractC72511 : ((C18656) abstractC7258).f55708) {
                            m49469(abstractC72511.f18925, abstractC72511);
                        }
                    } else if (abstractC7258.mo3381() != EnumC5532.PRIMITIVE_TYPE && abstractC7258.mo3381() != EnumC5532.ERRONEOUS) {
                        C1446.m31702("Unexpected tree: " + abstractC7258 + " with kind: " + abstractC7258.mo3381() + " within: " + abstractC7257 + " with kind: " + abstractC7257.mo3381());
                        throw null;
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49470(AbstractC7783 abstractC7783, C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C19049 c19049 = (C19049) it.next();
            if (!c19049.f18925.mo14812()) {
                C11216 c11216 = this.f68984;
                if (c11216.f31205.m42755(c19049.f56842, abstractC7783) == EnumC3976.DECLARATION) {
                    C23623 c23623 = c11216.f31202;
                    AbstractC6462 abstractC6462 = c19049.f18925;
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(c19049, new C14040("compiler", "annotation.type.not.applicable.to.type", abstractC6462));
                }
            }
        }
    }
}
