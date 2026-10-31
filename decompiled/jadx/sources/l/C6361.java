package l;

/* JADX INFO: renamed from: l.ۛ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6361 extends AbstractC13416 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14163 f19687;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2609 f19688;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23294 f19689;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f19690;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6361(C23294 c23294, C14163 c14163) {
        super(c23294);
        this.f19689 = c23294;
        this.f19687 = c14163;
        this.f19690 = c14163.f17561;
        this.f19688 = C2609.m8239();
    }

    @Override // l.AbstractC13416
    /* JADX INFO: renamed from: ֫ */
    public final void mo16870(C14163 c14163) {
        C2609 c2609 = (C2609) this.f19689.f74796.get(c14163);
        if (c2609 != null) {
            while (c2609.m8249()) {
                C12048 c12048 = (C12048) c2609.f8240;
                C2609 c26010 = this.f19688;
                while (true) {
                    if (c26010.m8249()) {
                        if (c26010.f8240 == c12048) {
                            break;
                        } else {
                            c26010 = c26010.f8241;
                        }
                    } else {
                        this.f19688 = this.f19688.m8246(c12048);
                        break;
                    }
                }
                c2609 = c2609.f8241;
            }
        }
    }

    @Override // l.AbstractC13416
    /* JADX INFO: renamed from: ֫ */
    public final void mo16869(AbstractC5698 abstractC5698) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4567 || enumC1296 == EnumC1296.f4571) {
            AbstractC5698 abstractC5699 = abstractC5698.f17561;
            C23294 c23294 = this.f19689;
            AbstractC5698 abstractC56910 = this.f19690;
            AbstractC5698 abstractC56911 = abstractC5699 != abstractC56910 ? (AbstractC5698) c23294.f74809.get(abstractC5698) : abstractC5698;
            if (abstractC56911 != null && abstractC56911.f17561 == abstractC56910) {
                C12048 c12048 = (C12048) abstractC56911;
                if (c12048.m29425() == null) {
                    for (C2609 c2609 = this.f19688; c2609.m8249(); c2609 = c2609.f8241) {
                        if (c2609.f8240 == c12048) {
                            return;
                        }
                    }
                    this.f19688 = this.f19688.m8246(c12048);
                    return;
                }
                return;
            }
            Object obj = c23294.f74831.f8240;
            if (obj == null || obj == abstractC5698) {
                return;
            }
            mo16869((AbstractC5698) obj);
        }
    }

    @Override // l.AbstractC13416, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        Object obj;
        C14163 c14163 = (C14163) c19110.f60194.f17561;
        if (c19110.f60199 == null && c14163.m16087() && (obj = this.f19689.f74831.f8240) != null) {
            mo16869((AbstractC5698) obj);
        }
        super.mo1419(c19110);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        Object obj;
        AbstractC10370 abstractC10370 = c6262.f19395;
        C23294 c23294 = this.f19689;
        if ((abstractC10370 == c23294.f74798.f18886 || c6262.f19395 == c23294.f74798.f18898) && c6262.f19397.f16086.f13890 != this.f19687 && (obj = c23294.f74831.f8240) != null) {
            mo16869((AbstractC5698) obj);
        }
        mo10758(c6262.f19397);
    }

    @Override // l.AbstractC13416, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        Object obj;
        AbstractC10370 abstractC10370M19462 = C7260.m19462(c15580.f48011);
        C23294 c23294 = this.f19689;
        if (abstractC10370M19462 == c23294.f74798.f18898 && ((C14163) C7260.m19472(c15580.f48011).f17561).m16087() && !c15580.f48011.m14709(EnumC18550.f57581) && (obj = c23294.f74831.f8240) != null) {
            mo16869((AbstractC5698) obj);
        }
        super.mo1407(c15580);
    }
}
