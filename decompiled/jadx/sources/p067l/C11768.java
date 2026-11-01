package p067l;

/* JADX INFO: renamed from: l.ۢ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11768 {

    /* JADX INFO: renamed from: ۧ */
    public final C19143 f32887;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C11097 f32888;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7783 f32889;

    /* JADX INFO: renamed from: ᩻ */
    public final C11142 f32892;

    /* JADX INFO: renamed from: ֫ */
    public final C20271 f32886 = new C20271();

    /* JADX INFO: renamed from: ᩳ */
    public final C20271 f32891 = new C20271();

    /* JADX INFO: renamed from: ܿ */
    public AbstractC14355 f32890 = null;

    public C11768(C11097 c11097, C11142 c11142, C19143 c19143, AbstractC7783 abstractC7783) {
        this.f32888 = c11097;
        this.f32892 = c11142;
        this.f32887 = c19143;
        this.f32889 = abstractC7783;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C15834 m27002() {
        AbstractC14355 abstractC14355M26999;
        C11142 c11142 = this.f32892;
        C11097 c11097 = this.f32888;
        int i = c11097.f30757.f55352;
        try {
            c11097.f30757.m42189((InterfaceC5323) c11142);
            C13818 c13818M27000 = m27000();
            if (c11142.f30886 == EnumC12909.INVOKE) {
                abstractC14355M26999 = m26998(c13818M27000);
            } else {
                abstractC14355M26999 = m26999();
            }
            C15834 c15834M42198 = c11097.f30757.m42198((AbstractC7257) abstractC14355M26999, this.f32891.m45783());
            c15834M42198.f77303 = c11142.f77303;
            c15834M42198.f18925 = c11142.f18925;
            c15834M42198.f18924 = c11142.f18924;
            return c15834M42198;
        } finally {
            c11097.f30757.f55352 = i;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14355 m27001() {
        return this.f32890;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC14355 m26998(C13818 c13818) {
        AbstractC14355 abstractC14355M42157;
        C11142 c11142 = this.f32892;
        C11097 c11097 = this.f32888;
        if (c13818 != null) {
            abstractC14355M42157 = c11097.f30757.m42157((AbstractC7783) c13818);
            AbstractC6462 abstractC6462 = (!c11142.f30892 || C11097.m25551(c11097, c11142.f30889, this.f32889)) ? c11142.f30891.f18925 : c11142.f30889.m17990().f20406;
            if (abstractC6462 == c11097.f30747.f69187.f20406) {
                abstractC6462 = c11142.f30891.f18925;
            }
            if (!c13818.f20406.f16705.mo17999((AbstractC7783) abstractC6462.f16705, c11097.f30760)) {
                abstractC14355M42157 = c11097.f30757.m42179((AbstractC7257) c11097.f30757.m42208(abstractC6462), abstractC14355M42157);
                abstractC14355M42157.f18925 = abstractC6462;
            }
        } else {
            abstractC14355M42157 = c11142.f30891;
        }
        C8320 c8320M42155 = c11097.f30757.m42155(abstractC14355M42157, c11142.f30889.f20408);
        AbstractC7783 abstractC7783 = c11142.f30889;
        c8320M42155.f22260 = abstractC7783;
        c8320M42155.f18925 = abstractC7783.mo18010(c11097.f30760);
        C18537 c18537 = c11097.f30757;
        C4848 c4848M10283 = C4848.m10283();
        AbstractC7783 abstractC7784 = c11142.f30889;
        C4848 c4848M45783 = this.f32886.m45783();
        C11097.m25548(c11097, abstractC7784, c4848M45783, c11142.f30894);
        C17175 c17175M42172 = c18537.m42172(c8320M42155, c4848M10283, c4848M45783);
        c17175M42172.f18925 = c11142.f30889.mo18010(c11097.f30760).mo14787();
        AbstractC14355 abstractC14355M29739 = c11097.f30752.m29739(c11097.f30760.m19459(((C11142) this.f32887.f80538).f30885.mo14787()), c11097.f30756, c17175M42172);
        C11097.m25558(c11142.f30894, abstractC14355M29739);
        return abstractC14355M29739;
    }

    /* JADX INFO: renamed from: ᩳ */
    private AbstractC14355 m26999() {
        C11142 c11142 = this.f32892;
        EnumC21871 enumC21871 = c11142.f30888;
        EnumC21871 enumC21872 = EnumC21871.f68796;
        C11097 c11097 = this.f32888;
        if (enumC21871 == enumC21872) {
            C18537 c18537 = c11097.f30757;
            AbstractC14355 abstractC14355M42208 = c11097.f30757.m42208(c11097.f30760.m19455(c11142.f30891.f18925));
            C18537 c18538 = c11097.f30757;
            C11281 c11281 = (C11281) this.f32891.first();
            c18538.getClass();
            C19859 c19859M42201 = c18537.m42201(abstractC14355M42208, C4848.m10276of((Object) c18538.m42157((AbstractC7783) c11281.f31438)), null);
            c19859M42201.f18925 = c11142.f30891.f18925;
            return c19859M42201;
        }
        C18537 c18539 = c11097.f30757;
        C4848 c4848M10283 = C4848.m10283();
        AbstractC14355 abstractC14355M42209 = c11097.f30757.m42208(c11142.f30891.f18925);
        AbstractC7783 abstractC7783 = c11142.f30889;
        C4848 c4848M45783 = this.f32886.m45783();
        C11097.m25548(c11097, abstractC7783, c4848M45783, c11142.f30894);
        C20530 c20530M42182 = c18539.m42182((AbstractC14355) null, c4848M10283, abstractC14355M42209, c4848M45783, (C7650) null, false);
        AbstractC7783 abstractC7784 = c11142.f30889;
        c20530M42182.f63427 = abstractC7784;
        c20530M42182.f63425 = abstractC7784.mo18010(c11097.f30760);
        c20530M42182.f18925 = c11142.f30891.f18925;
        C11097.m25558(c11142.f30894, c20530M42182);
        return c20530M42182;
    }

    /* JADX INFO: renamed from: ֫ */
    private C13818 m26997(String str, AbstractC6462 abstractC6462, boolean z) {
        C11097 c11097 = this.f32888;
        C13818 c13818 = new C13818(8589938688L, c11097.f30758.f21738.m32717(str), abstractC6462, this.f32889);
        c13818.f39051 = this.f32892.f18924;
        this.f32891.m45777(c11097.f30757.m42166(c13818, (AbstractC14355) null));
        if (z) {
            this.f32886.m45777(c11097.f30757.m42157((AbstractC7783) c13818));
        }
        return c13818;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13818 m27000() {
        C13818 c13818M26997;
        C19143 c19143 = this.f32887;
        C11097 c11097 = c19143.f57156.f24628;
        C8374 c8374 = c11097.f30760;
        C8374 c8375 = c11097.f30760;
        AbstractC24413 abstractC24413 = c19143.f80538;
        AbstractC6462 abstractC6462M19459 = c8374.m19459(c8375.m19433(((C11142) abstractC24413).f77303.f16705).f20406);
        C4848 c4848Mo14797 = abstractC6462M19459.mo14797();
        C11097 c11098 = this.f32888;
        C8374 c8376 = c11098.f30760;
        C11142 c11142 = this.f32892;
        C4848 c4848Mo14798 = c11142.m53845(c8376).mo14797();
        int i = C6757.f17520[c11142.f30888.ordinal()];
        if (i == 3) {
            c13818M26997 = m26997("rec$", c11142.f30891.f18925, false);
            this.f32890 = c11098.f30754.m25948(c11142.f30891);
        } else if (i != 4) {
            c13818M26997 = null;
        } else {
            c13818M26997 = m26997("rec$", (AbstractC6462) abstractC6462M19459.mo14797().f11034, false);
            c4848Mo14797 = c4848Mo14797.f11035;
            c4848Mo14798 = c4848Mo14798.f11035;
        }
        C4848 c4848Mo14799 = c11142.f30889.f20406.mo14797();
        int iM10289 = c4848Mo14799.m10289();
        int iM102810 = c4848Mo14797.m10289();
        int i2 = ((C11142) abstractC24413).f30894 != null ? iM10289 - 1 : iM10289;
        boolean z = c11142.f30894 != null || iM10289 == c4848Mo14798.m10289();
        for (int i3 = 0; c4848Mo14799.m10293() && i3 < i2; i3++) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848Mo14799.f11034;
            if (z) {
                EnumC3035 enumC3035Mo5575 = ((AbstractC6462) c4848Mo14798.f11034).mo5575();
                EnumC3035 enumC3035 = EnumC3035.INTERSECTION;
                if (enumC3035Mo5575 == enumC3035) {
                    abstractC6462 = (AbstractC6462) c4848Mo14797.f11034;
                }
                if (((AbstractC6462) c4848Mo14798.f11034).mo5575() == EnumC3035.TYPEVAR && ((C10485) c4848Mo14798.f11034).mo14803().mo5575() == enumC3035) {
                    abstractC6462 = (AbstractC6462) c4848Mo14797.f11034;
                }
            }
            m26997(C20778.m46922(i3, "x$"), abstractC6462, true);
            c4848Mo14799 = c4848Mo14799.f11035;
            c4848Mo14797 = c4848Mo14797.f11035;
            c4848Mo14798 = c4848Mo14798.f11035;
        }
        while (i2 < iM102810) {
            m26997(C20778.m46922(i2, "xva$"), c11142.f30894, true);
            i2++;
        }
        return c13818M26997;
    }
}
