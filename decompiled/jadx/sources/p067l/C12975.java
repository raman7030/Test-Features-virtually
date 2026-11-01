package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4446 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12975 extends C24572 {

    /* JADX INFO: renamed from: ᩵ */
    public static final C6468 f36506 = new C6468();

    /* JADX INFO: renamed from: ۖ */
    public AbstractC6462 f36507 = null;

    /* JADX INFO: renamed from: ۘ */
    public C22004 f36508;

    /* JADX INFO: renamed from: ۜ */
    public C4036 f36509;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC6462 f36510;

    /* JADX INFO: renamed from: ۢ */
    public C8200 f36511;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f36512;

    /* JADX INFO: renamed from: ܳ */
    public final C23559 f36513;

    /* JADX INFO: renamed from: ܺ */
    public final C23663 f36514;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f36515;

    /* JADX INFO: renamed from: ܿ */
    public C11216 f36516;

    /* JADX INFO: renamed from: ᩳ */
    public C15099 f36517;

    /* JADX INFO: renamed from: ᩴ */
    public C8374 f36518;

    /* JADX INFO: renamed from: ᩷ */
    public C18537 f36519;

    /* JADX INFO: renamed from: ᩻ */
    public C15492 f36520;

    /* JADX INFO: renamed from: ֫ */
    public static C12975 m29735(C5127 c5127) {
        C12975 c12975 = (C12975) c5127.m10905(f36506);
        return c12975 == null ? new C12975(c5127) : c12975;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m29739(AbstractC6462 abstractC6462, C4036 c4036, AbstractC14355 abstractC14355) {
        C4036 c4037 = this.f36509;
        try {
            this.f36509 = c4036;
            return m29740(abstractC6462, abstractC14355);
        } finally {
            this.f36509 = c4037;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m29740(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        AbstractC6462 abstractC6462Mo5302 = abstractC6462.mo5302();
        if (abstractC14355.f18925.mo14805() == abstractC6462.mo14805()) {
            AbstractC6462 abstractC6463 = abstractC14355.f18925;
            C8374 c8374 = this.f36518;
            if (!c8374.m19471(abstractC6463, abstractC6462Mo5302, c8374.f22469)) {
                C18537 c18537 = this.f36519;
                int i = c18537.f55352;
                c18537.f55352 = abstractC14355.f18924;
                if (!c8374.m19490(abstractC14355.f18925, abstractC6462Mo5302)) {
                    C4036 c4036 = this.f36509;
                    AbstractC21195 abstractC21195 = abstractC6462Mo5302.f16705;
                    C23663 c23663 = this.f36514;
                    if (!c23663.m52670(c4036, abstractC21195, false)) {
                        C4036 c4037 = this.f36509;
                        C7829 c7829 = new C7829(c23663, c4037, c4037.f8855.f18925, abstractC6462Mo5302.f16705);
                        C7650 c7650 = c4037.f8855;
                        C18258 c18258Mo6320 = c7829.mo6320(EnumC14710.ERROR, abstractC14355, c7650.f20027, c7650.f18925, null, null, null);
                        if (c18258Mo6320 != null) {
                            c18258Mo6320.m41587(EnumC21417.RESOLVE_ERROR);
                            c23663.f75324.mo9356(c18258Mo6320);
                        }
                    }
                    C18537 c18538 = this.f36519;
                    abstractC14355 = c18538.m42179((AbstractC7257) c18538.m42208(abstractC6462Mo5302), abstractC14355);
                    abstractC14355.f18925 = abstractC6462Mo5302;
                }
                this.f36519.f55352 = i;
            }
        }
        return abstractC14355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m29741(AbstractC14355 abstractC14355, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        if (abstractC6462.mo14805()) {
            return abstractC14355;
        }
        if (abstractC6463 != null && abstractC6463.mo14805()) {
            abstractC6463 = this.f36518.m19459(abstractC14355.f18925);
        }
        abstractC14355.f18925 = abstractC6462;
        return abstractC6463 != null ? m29740(abstractC6463, abstractC14355) : abstractC14355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29746(AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        if (c4849.isEmpty()) {
            return;
        }
        while (c4849.f11035.m10293()) {
            c4848.f11034 = m29737((AbstractC6462) c4849.f11034, (AbstractC7257) c4848.f11034);
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
        AbstractC6462 abstractC6463 = (AbstractC6462) c4849.f11034;
        boolean z = true;
        if (abstractC6462 == null && c4848.m10289() != 1) {
            z = false;
        }
        C1446.m31704(z);
        if (abstractC6462 != null) {
            while (c4848.m10293()) {
                c4848.f11034 = m29737(abstractC6462, (AbstractC7257) c4848.f11034);
                c4848 = c4848.f11035;
            }
            return;
        }
        c4848.f11034 = m29737(abstractC6463, (AbstractC7257) c4848.f11034);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29742(C4848 c4848, C4848 c4849, AbstractC6462 abstractC6462, C4036 c4036) {
        C4036 c4037 = this.f36509;
        try {
            this.f36509 = c4036;
            m29746(abstractC6462, c4848, c4849);
        } finally {
            this.f36509 = c4037;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29743(InterfaceC5323 interfaceC5323, C5771 c5771, C5771 c5772, C15828 c15828, C20271 c20271) {
        C5771 c5773;
        C4848 c4848M10283;
        C9661 c9661M42158;
        Object objM42207;
        this.f36519.m42189(interfaceC5323);
        AbstractC6462 abstractC6462 = c5772.f20406;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19459 = c8374.m19459(abstractC6462);
        AbstractC6462 abstractC6462Mo18010 = c5771.mo18010(c8374);
        C5771 c5774 = new C5771((c5772.f20409 & 7) | 2147487744L | (c15828.m17989() ? 8796093022208L : 0L), c5771.f20408, abstractC6462Mo18010, c15828);
        if (c5772.f14172 != null) {
            c4848M10283 = C4848.m10283();
            C4848 c4848 = c5772.f14172;
            C4848 c4849 = ((C12497) abstractC6462Mo18010).f35030;
            while (c4848.m10293() && c4849.m10293()) {
                C13818 c13818 = (C13818) c4848.f11034;
                C4848 c48410 = c4848;
                C5771 c5775 = c5774;
                C13818 c13819 = new C13818(c13818.f20409 | 8589938688L, c13818.f20408, (AbstractC6462) c4849.f11034, c5775);
                c13819.m18012((AbstractC7783) c48410.f11034);
                c4848M10283 = c4848M10283.m10286(c13819);
                c4848 = c48410.f11035;
                c4849 = c4849.f11035;
                c5774 = c5775;
            }
            c5773 = c5774;
        } else {
            c5773 = c5774;
            c4848M10283 = null;
        }
        c5773.f14172 = c4848M10283;
        c5773.m18012(c5772);
        C18537 c18537 = this.f36519;
        c18537.getClass();
        C10471 c10471M42161 = c18537.m42161(c5773, c5773.f20406, (C4968) null);
        if (c5772.f20407 == c15828) {
            c9661M42158 = this.f36519.m42193(c15828.mo18010(c8374));
        } else {
            c9661M42158 = this.f36519.m42158(c15828, c8374.m19502(c15828.f20406).f16705.mo18010(c8374));
        }
        AbstractC6462 abstractC6462Mo14787 = abstractC6462M19459.mo14787();
        C18537 c18538 = this.f36519;
        C8320 c8320M42154 = c18538.m42154(c9661M42158, c5772);
        c8320M42154.f18925 = abstractC6462Mo14787;
        C4848 c4848M42204 = this.f36519.m42204(c10471M42161.f28963);
        m29746((AbstractC6462) null, c4848M42204, abstractC6462M19459.mo14797());
        C17175 c17175M42172 = c18538.m42172(c8320M42154, (C4848) null, c4848M42204);
        c17175M42172.f18925 = abstractC6462Mo14787;
        if (abstractC6462M19459.mo14787().m14777(EnumC11353.VOID)) {
            objM42207 = this.f36519.m42196(c17175M42172);
        } else {
            objM42207 = this.f36519.m42207(m29740(abstractC6462Mo18010.mo14787(), (AbstractC14355) c17175M42172));
        }
        c10471M42161.f28958 = this.f36519.m42145(0L, C4848.m10276of(objM42207));
        c20271.m45777(c10471M42161);
        c15828.mo18020();
        c15828.f45850.mo28415(c5773);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m29745(InterfaceC5323 interfaceC5323, AbstractC21195 abstractC21195, C15828 c15828, C20271 c20271) {
        C8374 c8374;
        boolean zM19490;
        boolean z;
        Iterator it = abstractC21195.mo17983().mo22455((Predicate) null, EnumC3620.NON_RECURSIVE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c8374 = this.f36518;
            if (!zHasNext) {
                break;
            }
            AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
            if (abstractC7783.f20405 == EnumC3600.f7343 && abstractC7783.f20408 != this.f36511.f21737 && (abstractC7783.mo18003() & 10) == 0 && (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && abstractC7783.m17986((AbstractC21195) c15828, c8374)) {
                C5771 c5771 = (C5771) abstractC7783;
                C5771 c5771M12934 = c5771.m12934(c15828, c8374);
                C5771 c5771M12935 = c5771.m12935(c15828, c8374, true);
                if (c5771M12934 == null || c5771M12934 == c5771 || (c5771M12935 != null && !c5771M12934.f20407.mo17999(c5771M12935.f20407, c8374))) {
                    if (c5771M12935 != null && c5771M12934 != c5771M12935) {
                        AbstractC6462 abstractC6462 = c15828.f20406;
                        if (c5771M12935 != c5771) {
                            AbstractC6462 abstractC6462Mo18010 = c5771.mo18010(c8374);
                            if (c8374.m19490(c8374.m19459(c8374.m19483(c5771, abstractC6462)), abstractC6462Mo18010)) {
                                AbstractC6462 abstractC6462Mo18011 = c5771M12935.mo18010(c8374);
                                if (c8374.m19490(c8374.m19459(c8374.m19483(c5771M12935, abstractC6462)), abstractC6462Mo18011)) {
                                    zM19490 = c8374.m19490(abstractC6462Mo18011, abstractC6462Mo18010);
                                    z = !zM19490;
                                }
                            }
                            z = true;
                        } else if ((c5771.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            z = false;
                        } else {
                            zM19490 = c8374.m19490(c8374.m19459(c8374.m19483(c5771, abstractC6462)), c5771.mo18010(c8374));
                            z = !zM19490;
                        }
                        if (z) {
                            m29743(interfaceC5323, c5771, c5771M12935, c15828, c20271);
                        }
                    }
                    if (c5771M12935 == c5771 && c5771M12935.f20407 != c15828 && (c5771M12935.f20409 & 16) == 0 && (c5771.f20409 & 1025) == 1) {
                        c15828.mo18020();
                        if ((c15828.f20409 & 1) > (1 & c5771M12935.f20407.mo18003())) {
                            m29743(interfaceC5323, c5771, c5771M12935, c15828, c20271);
                        }
                    }
                }
            }
        }
        for (C4848 c4848M19450 = c8374.m19450(abstractC21195.f20406); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            m29745(interfaceC5323, ((AbstractC6462) c4848M19450.f11034).f16705, c15828, c20271);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29744(InterfaceC5323 interfaceC5323, C15828 c15828, C20271 c20271) {
        AbstractC6462 abstractC6462 = c15828.f20406;
        C8374 c8374 = this.f36518;
        for (AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462); abstractC6462M19502.m14777(EnumC11353.CLASS); abstractC6462M19502 = c8374.m19502(abstractC6462M19502)) {
            m29745(interfaceC5323, abstractC6462M19502.f16705, c15828, c20271);
        }
        for (C4848 c4848M19450 = c8374.m19450(c15828.f20406); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            m29745(interfaceC5323, ((AbstractC6462) c4848M19450.f11034).f16705, c15828, c20271);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 m29737(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257) {
        AbstractC6462 abstractC6463 = this.f36510;
        try {
            this.f36510 = abstractC6462;
            return mo25569(abstractC7257);
        } finally {
            this.f36510 = abstractC6463;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m29736(AbstractC6462 abstractC6462, C4848 c4848) {
        AbstractC6462 abstractC6463 = this.f36510;
        try {
            this.f36510 = abstractC6462;
            return m54183(c4848);
        } finally {
            this.f36510 = abstractC6463;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        m29747(c7650.f20027);
        this.f77797 = c7650;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462 = this.f36507;
        try {
            this.f36507 = c8374.m19459(c10471.f18925).mo14787();
            c10471.f28966 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c10471.f28966);
            c10471.f28962 = C4848.m10283();
            C4848 c4848 = c10471.f28963;
            m54185(c4848);
            c10471.f28963 = c4848;
            c10471.f28967 = (C11281) m29737((AbstractC6462) null, c10471.f28967);
            c10471.f28957 = m29736((AbstractC6462) null, c10471.f28957);
            c10471.f28958 = (C4968) m29737(c10471.f28960.mo18010(c8374).mo14787(), c10471.f28958);
            c10471.f18925 = c8374.m19459(c10471.f18925);
            this.f77797 = c10471;
        } finally {
            this.f36507 = abstractC6462;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        c11281.f31437 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c11281.f31437);
        AbstractC14355 abstractC14355 = c11281.f31436;
        C13818 c13818 = c11281.f31438;
        C8374 c8374 = this.f36518;
        c11281.f31436 = (AbstractC14355) m29737(c13818.mo18010(c8374), (AbstractC7257) abstractC14355);
        c11281.f18925 = c8374.m19459(c11281.f18925);
        this.f77797 = c11281;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        c21732.f68446 = (AbstractC13154) mo25569(c21732.f68446);
        c21732.f68447 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) c21732.f68447);
        this.f77797 = c21732;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        c10610.f29370 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) c10610.f29370);
        c10610.f29369 = (AbstractC13154) mo25569(c10610.f29369);
        this.f77797 = c10610;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        c13685.f38597 = m29736((AbstractC6462) null, c13685.f38597);
        AbstractC14355 abstractC14355 = c13685.f38598;
        if (abstractC14355 != null) {
            c13685.f38598 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) abstractC14355);
        }
        c13685.f38596 = m29736((AbstractC6462) null, c13685.f38596);
        c13685.f38595 = (AbstractC13154) mo25569(c13685.f38595);
        this.f77797 = c13685;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        c6979.f18157 = (C11281) m29737((AbstractC6462) null, c6979.f18157);
        AbstractC14355 abstractC14355 = c6979.f18158;
        AbstractC6462 abstractC6462 = abstractC14355.f18925;
        C8374 c8374 = this.f36518;
        AbstractC14355 abstractC14356 = (AbstractC14355) m29737(c8374.m19459(abstractC6462), (AbstractC7257) abstractC14355);
        c6979.f18158 = abstractC14356;
        if (c8374.m19455(abstractC14356.f18925) == null) {
            c6979.f18158.f18925 = abstractC6462;
        }
        c6979.f18156 = (AbstractC13154) mo25569(c6979.f18156);
        this.f77797 = c6979;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462 = this.f36507;
        try {
            this.f36507 = c8374.m19459(c15834.m53845(c8374)).mo14787();
            c15834.f45863 = m54183(c15834.f45863);
            AbstractC7257 abstractC7257 = c15834.f45864;
            c15834.f45864 = m29737((abstractC7257.f18925 == null || this.f36507.m14777(EnumC11353.VOID)) ? null : this.f36507, abstractC7257);
            AbstractC6462 abstractC6463 = c15834.f18925;
            abstractC6463.getClass();
            if (abstractC6463 instanceof C7921) {
                c15834.f18925 = c8374.m19459(c8374.m19433(c15834.f18925.f16705).f20407.f20406);
            } else {
                c15834.f18925 = c8374.m19459(c15834.f18925);
            }
            this.f77797 = c15834;
        } finally {
            this.f36507 = abstractC6462;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        AbstractC6462 abstractC6462M19459;
        AbstractC6462 abstractC6462 = c23882.f75829.f18925;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462);
        C22004 c22004 = this.f36508;
        if (abstractC6462M19502 == null || abstractC6462M19502.f16705 != c22004.f69209) {
            abstractC6462M19459 = c22004.f69134;
        } else {
            abstractC6462M19459 = c8374.m19459(c23882.f75829.f18925);
        }
        c23882.f75829 = (AbstractC14355) m29737(abstractC6462M19459, (AbstractC7257) c23882.f75829);
        C4848 c4848 = c23882.f75828;
        m54184(c4848);
        c23882.f75828 = c4848;
        this.f77797 = c23882;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3831(C20391 c20391) {
        c20391.f63044 = m29736((AbstractC6462) null, c20391.f63044);
        c20391.f63043 = m54183(c20391.f63043);
        this.f77797 = c20391;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        c17707.f52887 = (C11281) m29737((AbstractC6462) null, c17707.f52887);
        this.f77797 = c17707;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        AbstractC6462 abstractC6462M19459;
        AbstractC6462 abstractC6462 = c15164.f43267.f18925;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462);
        C22004 c22004 = this.f36508;
        if (abstractC6462M19502 == null || abstractC6462M19502.f16705 != c22004.f69209) {
            abstractC6462M19459 = c22004.f69134;
        } else {
            abstractC6462M19459 = c8374.m19459(c15164.f43267.f18925);
        }
        c15164.f43267 = (AbstractC14355) m29737(abstractC6462M19459, (AbstractC7257) c15164.f43267);
        c15164.f43269 = m54183(c15164.f43269);
        AbstractC6462 abstractC6462M194510 = c8374.m19459(c15164.f18925);
        c15164.f18925 = abstractC6462M194510;
        this.f77797 = m29741(c15164, abstractC6462M194510, this.f36510);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3837(C22542 c22542) {
        c22542.f71103 = (AbstractC23212) m29737((AbstractC6462) null, c22542.f71103);
        this.f77797 = c22542;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3815(C15695 c15695) {
        c15695.f45487 = (AbstractC23212) m29737((AbstractC6462) null, c15695.f45487);
        c15695.f45486 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) c15695.f45486);
        this.f77797 = c15695;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3797(C9130 c9130) {
        AbstractC14355 abstractC14355 = c9130.f24711;
        c9130.f24711 = (AbstractC14355) m29737(this.f36518.m19459(abstractC14355.f18925), (AbstractC7257) abstractC14355);
        c9130.f24710 = (C4968) mo25569(c9130.f24710);
        this.f77797 = c9130;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        c12622.f35422 = m29736(this.f36508.f69213, c12622.f35422);
        c12622.f35421 = (C4968) mo25569(c12622.f35421);
        C4848 c4848 = c12622.f35425;
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c4849.f11034 = mo25569((C2955) c4849.f11034);
        }
        c12622.f35425 = c4848;
        c12622.f35424 = (C4968) mo25569(c12622.f35424);
        this.f77797 = c12622;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        c10332.f28614 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) c10332.f28614);
        AbstractC14355 abstractC14355 = c10332.f28612;
        AbstractC6462 abstractC6462 = c10332.f18925;
        C8374 c8374 = this.f36518;
        c10332.f28612 = (AbstractC14355) m29737(c8374.m19459(abstractC6462), (AbstractC7257) abstractC14355);
        c10332.f28613 = (AbstractC14355) m29737(c8374.m19459(c10332.f18925), (AbstractC7257) c10332.f28613);
        AbstractC6462 abstractC6462M19459 = c8374.m19459(c10332.f18925);
        c10332.f18925 = abstractC6462M19459;
        this.f77797 = m29741(c10332, abstractC6462M19459, this.f36510);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        c3765.f7998 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) c3765.f7998);
        c3765.f7999 = (AbstractC13154) mo25569(c3765.f7999);
        c3765.f8000 = (AbstractC13154) mo25569(c3765.f8000);
        this.f77797 = c3765;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3807(C12344 c12344) {
        c12344.f34446 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c12344.f34446);
        this.f77797 = c12344;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        if (!this.f36507.m14777(EnumC11353.VOID)) {
            c11813.f32975 = (AbstractC14355) m29737(this.f36507, (AbstractC7257) c11813.f32975);
        }
        this.f77797 = c11813;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        this.f77797 = c6309;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        AbstractC14355 abstractC14355 = c4575.f10248;
        AbstractC6462 abstractC6462 = abstractC14355.f18925;
        C8374 c8374 = this.f36518;
        AbstractC14355 abstractC14356 = (AbstractC14355) m29737(c8374.m19459(abstractC6462), (AbstractC7257) abstractC14355);
        c4575.f10248 = abstractC14356;
        abstractC14356.f18925 = c8374.m19459(abstractC14356.f18925);
        AbstractC14355 abstractC14357 = c4575.f10248;
        c4575.f10248 = m29741(abstractC14357, abstractC14357.f18925, this.f36510);
        this.f77797 = c4575;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        AbstractC14355 abstractC14355 = c3904.f8460;
        c3904.f8460 = (AbstractC14355) m29737(this.f36518.m19459(abstractC14355.f18925), (AbstractC7257) abstractC14355);
        this.f77797 = c3904;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3796(C8991 c8991) {
        c8991.f24356 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69151, (AbstractC7257) c8991.f24356);
        AbstractC14355 abstractC14355 = c8991.f24357;
        if (abstractC14355 != null) {
            c8991.f24357 = (AbstractC14355) m29737(this.f36518.m19459(abstractC14355.f18925), (AbstractC7257) abstractC14355);
        }
        this.f77797 = c8991;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        C4848 c4848Mo14797;
        AbstractC14355 abstractC14355 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c17175.f51143);
        c17175.f51143 = abstractC14355;
        AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC14355);
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462Mo18010 = abstractC7783M21438.mo18010(c8374);
        if (this.f36512 && !c8374.m19443((C5771) abstractC7783M21438.mo9143())) {
            c4848Mo14797 = c17175.f51143.f18925.mo14797();
        } else {
            c4848Mo14797 = abstractC6462Mo18010.mo14797();
        }
        if (abstractC7783M21438.f20408 == this.f36511.f21737 && abstractC7783M21438.f20407 == this.f36508.f69209) {
            c4848Mo14797 = c4848Mo14797.f11035.f11035;
        }
        AbstractC6462 abstractC6462 = c17175.f51141;
        if (abstractC6462 != null) {
            c17175.f51141 = c8374.m19459(abstractC6462);
        } else if (c17175.f51144.m10289() != c4848Mo14797.m10289()) {
            C1446.m31702(String.format("Incorrect number of arguments; expected %d, found %d", Integer.valueOf(c17175.f51144.m10289()), Integer.valueOf(c4848Mo14797.m10289())));
            throw null;
        }
        C4848 c4848 = c17175.f51144;
        m29746(c17175.f51141, c4848, c4848Mo14797);
        c17175.f51144 = c4848;
        c17175.f18925 = c8374.m19459(c17175.f18925);
        this.f77797 = m29741(c17175, abstractC6462Mo18010.mo14787(), this.f36510);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        C4848 c4848Mo14797;
        AbstractC14355 abstractC14355 = c20530.f63432;
        C8374 c8374 = this.f36518;
        if (abstractC14355 != null) {
            if (c20530.f63428 == null) {
                c20530.f63432 = (AbstractC14355) m29737(c8374.m19459(abstractC14355.f18925), (AbstractC7257) abstractC14355);
            } else {
                c20530.f63430 = c20530.f63430.m10290(this.f36516.m25948(abstractC14355));
                c20530.f63432 = null;
            }
        }
        AbstractC6462 abstractC6462 = c20530.f63425;
        AbstractC6462 abstractC6462M19459 = abstractC6462 != null ? c8374.m19459(abstractC6462) : null;
        if (abstractC6462M19459 != null && this.f36512) {
            c4848Mo14797 = abstractC6462M19459.mo14797();
        } else {
            c4848Mo14797 = c20530.f63427.mo18010(c8374).mo14797();
        }
        c20530.f63429 = (AbstractC14355) m29737((AbstractC6462) null, c20530.f63429);
        AbstractC6462 abstractC6463 = c20530.f63426;
        if (abstractC6463 != null) {
            c20530.f63426 = c8374.m19459(abstractC6463);
        }
        C4848 c4848 = c20530.f63430;
        m29746(c20530.f63426, c4848, c4848Mo14797);
        c20530.f63430 = c4848;
        c20530.f63428 = (C7650) m29737((AbstractC6462) null, c20530.f63428);
        if (abstractC6462M19459 != null) {
            c20530.f63425 = abstractC6462M19459;
        }
        c20530.f18925 = c8374.m19459(c20530.f18925);
        this.f77797 = c20530;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        c19859.f60358 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c19859.f60358);
        m29736(this.f36508.f69134, c19859.f60360);
        AbstractC6462 abstractC6462 = c19859.f18925;
        if (abstractC6462 != null) {
            C4848 c4848 = c19859.f60359;
            C8374 c8374 = this.f36518;
            c19859.f60359 = m29736(c8374.m19459(c8374.m19455(abstractC6462)), c4848);
            c19859.f18925 = c8374.m19459(c19859.f18925);
        } else {
            c19859.f60359 = m29736((AbstractC6462) null, c19859.f60359);
        }
        this.f77797 = c19859;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(C16505 c16505) {
        AbstractC14355 abstractC14355 = (AbstractC14355) m29737(this.f36510, (AbstractC7257) c16505.f48507);
        c16505.f48507 = abstractC14355;
        c16505.f18925 = this.f36518.m19459(abstractC14355.f18925);
        this.f77797 = c16505;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        AbstractC14355 abstractC14355 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c22403.f70670);
        c22403.f70670 = abstractC14355;
        AbstractC14355 abstractC14356 = c22403.f70671;
        AbstractC6462 abstractC6462 = abstractC14355.f18925;
        C8374 c8374 = this.f36518;
        c22403.f70671 = (AbstractC14355) m29737(c8374.m19459(abstractC6462), (AbstractC7257) abstractC14356);
        AbstractC6462 abstractC6462M19459 = c8374.m19459(c22403.f70670.f18925);
        c22403.f18925 = abstractC6462M19459;
        this.f77797 = m29741(c22403, abstractC6462M19459, this.f36510);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        c11674.f32571 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c11674.f32571);
        c11674.f32570 = (AbstractC14355) m29737((AbstractC6462) c11674.f5602.f20406.mo14797().f11035.f11034, (AbstractC7257) c11674.f32570);
        c11674.f18925 = this.f36518.m19459(c11674.f18925);
        this.f77797 = c11674;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        AbstractC6462 abstractC6462;
        AbstractC14355 abstractC14355 = c8598.f23105;
        if (c8598.mo3383() == EnumC19998.f60784) {
            abstractC6462 = c8598.f18925;
        } else {
            abstractC6462 = (AbstractC6462) c8598.f5602.f20406.mo14797().f11034;
        }
        c8598.f23105 = (AbstractC14355) m29737(abstractC6462, (AbstractC7257) abstractC14355);
        this.f77797 = c8598;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        c11003.f30470 = (AbstractC14355) m29737((AbstractC6462) c11003.f5602.f20406.mo14797().f11034, (AbstractC7257) c11003.f30470);
        c11003.f30469 = (AbstractC14355) m29737((AbstractC6462) c11003.f5602.f20406.mo14797().f11035.f11034, (AbstractC7257) c11003.f30469);
        this.f77797 = c11003;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        C4848 c4848 = c19720.f59995;
        this.f36517.getClass();
        C4848 c4848M34491 = C15099.m34491(c4848);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo25569(c19720.f59996);
        c19720.f59996 = abstractC14355;
        c19720.f18925 = abstractC14355.f18925.mo14773(c4848M34491);
        this.f77797 = c19720;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        c19327.f57709 = m29737((AbstractC6462) null, c19327.f57709);
        AbstractC6462 abstractC6462 = c19327.f18925;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19459 = c8374.m19459(abstractC6462);
        c19327.f18925 = abstractC6462M19459;
        AbstractC14355 abstractC14355 = (AbstractC14355) m29737(abstractC6462M19459, (AbstractC7257) c19327.f57710);
        if (abstractC14355 != c19327.f57710) {
            C19327 c19328 = abstractC14355.m16617(EnumC19998.f60713) ? (C19327) abstractC14355 : null;
            if (c19328 != null && c8374.m19490(c19328.f18925, c19327.f18925)) {
                abstractC14355 = c19328.f57710;
            }
            c19327.f57710 = abstractC14355;
        }
        if (abstractC6462 instanceof C7921) {
            Iterator it = ((C7921) abstractC6462).m18291().iterator();
            while (it.hasNext()) {
                AbstractC6462 abstractC6462M194510 = c8374.m19459((AbstractC6462) it.next());
                if (!c8374.m19490(abstractC6462M194510, c19327.f18925) && !c8374.m19490(abstractC6462M194510, this.f36510)) {
                    c19327.f57710 = m29740(abstractC6462M194510, c19327.f57710);
                }
            }
        }
        this.f77797 = m29741(c19327, c19327.f18925, this.f36510);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        c17846.f53242 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c17846.f53242);
        c17846.f53243 = m29737((AbstractC6462) null, c17846.f53243);
        this.f77797 = c17846;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3817(C16366 c16366) {
        AbstractC14355 abstractC14355 = c16366.f48093;
        AbstractC6462 abstractC6462 = abstractC14355.f18925;
        C8374 c8374 = this.f36518;
        c16366.f48093 = (AbstractC14355) m29737(c8374.m19459(abstractC6462), (AbstractC7257) abstractC14355);
        c16366.f48092 = (AbstractC14355) m29737((AbstractC6462) this.f36508.f69134, (AbstractC7257) c16366.f48092);
        this.f77797 = m29741(c16366, c8374.m19455(c16366.f48093.f18925), this.f36510);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        this.f77797 = c19049;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        AbstractC7783 abstractC7783 = c9661.f26611;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462Mo18010 = abstractC7783.mo18010(c8374);
        AbstractC7783 abstractC7784 = c9661.f26611;
        if (abstractC7784.f20405 == EnumC3600.f7354 && abstractC7784.f20406.m14777(EnumC11353.TYPEVAR)) {
            C18537 c18537 = this.f36519;
            c18537.f55352 = c9661.f18924;
            this.f77797 = c18537.m42208(abstractC6462Mo18010);
        } else if (c9661.f18925.mo14779() != null) {
            this.f77797 = c9661;
        } else if (c9661.f26611.f20405 == EnumC3600.f7339) {
            this.f77797 = m29741(c9661, abstractC6462Mo18010, this.f36510);
        } else {
            c9661.f18925 = c8374.m19459(c9661.f18925);
            this.f77797 = c9661;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        AbstractC6462 abstractC6462 = c8320.f22261.f18925;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19466 = c8374.m19466(abstractC6462, false);
        if (abstractC6462M19466.mo7388()) {
            AbstractC14355 abstractC14355 = c8320.f22261;
            c8320.f22261 = m29740(c8374.m19459(c8320.f22260.f20407.f20406), (AbstractC14355) m29737(c8374.m19459(abstractC14355.f18925), (AbstractC7257) abstractC14355));
        } else {
            c8320.f22261 = (AbstractC14355) m29737(c8374.m19459(abstractC6462M19466), (AbstractC7257) c8320.f22261);
        }
        if (c8320.f18925.mo14779() != null) {
            this.f77797 = c8320;
            return;
        }
        AbstractC7783 abstractC7783 = c8320.f22260;
        if (abstractC7783.f20405 == EnumC3600.f7339) {
            this.f77797 = m29741(c8320, abstractC7783.mo18010(c8374), this.f36510);
        } else {
            c8320.f18925 = c8374.m19459(c8320.f18925);
            this.f77797 = c8320;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        AbstractC6462 abstractC6462 = c11142.f30891.f18925;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19466 = c8374.m19466(abstractC6462, false);
        if (abstractC6462M19466.mo7388()) {
            abstractC6462M19466 = c11142.f30889.f20407.f20406;
        }
        AbstractC6462 abstractC6462M19459 = c8374.m19459(abstractC6462M19466);
        if (c11142.f30888 == EnumC21871.f68799) {
            c11142.f30891 = this.f36519.m42208(abstractC6462M19459);
        } else {
            c11142.f30891 = (AbstractC14355) m29737(abstractC6462M19459, (AbstractC7257) c11142.f30891);
        }
        AbstractC6462 abstractC6463 = c11142.f18925;
        abstractC6463.getClass();
        if (abstractC6463 instanceof C7921) {
            c11142.f18925 = c8374.m19459(c8374.m19433(c11142.f18925.f16705).f20407.f20406);
        } else {
            c11142.f18925 = c8374.m19459(c11142.f18925);
        }
        AbstractC6462 abstractC6464 = c11142.f30894;
        if (abstractC6464 != null) {
            c11142.f30894 = c8374.m19459(abstractC6464);
        }
        this.f77797 = c11142;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3842(C25084 c25084) {
        c25084.f80025 = (AbstractC14355) m29737((AbstractC6462) null, (AbstractC7257) c25084.f80025);
        c25084.f18925 = this.f36518.m19459(c25084.f18925);
        this.f77797 = c25084;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        this.f77797 = m29737((AbstractC6462) null, (AbstractC7257) c17985.f53722);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3825(C18656 c18656) {
        c18656.f55708 = m29736((AbstractC6462) null, c18656.f55708);
        c18656.f18925 = this.f36518.m19459(c18656.f18925);
        this.f77797 = c18656;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:29:0x009b, B:31:0x00b9, B:34:0x00ca, B:33:0x00c7), top: B:45:0x009b, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m29747(C15828 c15828) {
        AbstractC6462 abstractC6462 = c15828.f20406;
        C8374 c8374 = this.f36518;
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462);
        if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
            m29747((C15828) abstractC6462M19502.f16705);
        }
        C4036 c4036M41755 = this.f36520.f44238.m41755(c15828);
        if (c4036M41755 != null) {
            long j = c15828.f20409;
            if ((j & 1125899906842624L) != 0) {
                return;
            }
            c15828.f20409 = j | 1125899906842624L;
            C23559 c23559 = this.f36513;
            boolean z = c23559.get(c4036M41755) != 0;
            if (!z && c15828.mo3350() == c15828) {
                C1446.m31702("No info for outermost class: " + c4036M41755.f8855.f20027);
                throw null;
            }
            if (z && EnumC22889.FLOW.m51120((EnumC22889) c23559.get(c4036M41755))) {
                C1446.m31702(String.format("The current compile state [%s] of class %s is previous to FLOW", c23559.get(c4036M41755), c4036M41755.f8855.f20027));
                throw null;
            }
            C4036 c4036 = this.f36509;
            try {
                this.f36509 = c4036M41755;
                C18537 c18537 = this.f36519;
                AbstractC6462 abstractC6463 = this.f36510;
                this.f36519 = c18537.m42174(c4036M41755.f8851);
                this.f36510 = null;
                try {
                    C7650 c7650 = (C7650) this.f36509.f8850;
                    c7650.f20026 = C4848.m10283();
                    super.mo3617(c7650);
                    this.f36519.f55352 = c7650.f18924;
                    C20271 c20271 = new C20271();
                    if (this.f36515) {
                        m29744(c7650, c15828, c20271);
                    } else {
                        C15828 c15829 = c7650.f20027;
                        c15829.mo18020();
                        if ((c15829.f20409 & 512) == 0) {
                            m29744(c7650, c15828, c20271);
                        }
                    }
                    c7650.f20020 = c20271.m45783().m10292(c7650.f20020);
                    c7650.f18925 = c8374.m19459(c7650.f18925);
                    this.f36519 = c18537;
                    this.f36510 = abstractC6463;
                    this.f36509 = c4036;
                } catch (Throwable th) {
                    this.f36519 = c18537;
                    this.f36510 = abstractC6463;
                    throw th;
                }
            } catch (Throwable th2) {
                this.f36509 = c4036;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 m29738(AbstractC7257 abstractC7257, C18537 c18537) {
        this.f36519 = c18537;
        this.f36510 = null;
        return m29737((AbstractC6462) null, abstractC7257);
    }

    public C12975(C5127 c5127) {
        c5127.m10908(f36506, this);
        this.f36513 = C23559.m52348(c5127);
        this.f36511 = C8200.m18988(c5127);
        C23623.m52439(c5127);
        this.f36508 = C22004.m49577(c5127);
        this.f36520 = C15492.m35238(c5127);
        this.f36518 = C8374.m19396(c5127);
        this.f36519 = C18537.m42139(c5127);
        this.f36514 = C23663.m52629(c5127);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f36515 = EnumC12477.f34962.m28726(enumC17840M40515);
        this.f36512 = EnumC12477.f34964.m28726(enumC17840M40515);
        this.f36517 = C15099.m34493(c5127);
        this.f36516 = C11216.m25910(c5127);
    }
}
