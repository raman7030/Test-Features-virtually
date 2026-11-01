package p067l;

/* JADX INFO: renamed from: l.֨᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3662 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public int f7727;

    /* JADX INFO: renamed from: ۙ */
    public C20112 f7728;

    /* JADX INFO: renamed from: ᩶ */
    public C17310 f7729;

    /* JADX INFO: renamed from: ᩸ */
    public int f7730;

    /* JADX INFO: renamed from: ᩹ */
    public int f7731;

    public /* synthetic */ C3662(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m7016();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m7016();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m7016();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m7016();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35233;
        c11650.m26787(C10368.class, C3662.class);
        return c11650;
    }

    public C3662() {
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m7014();
        }
    }

    public C3662(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m7014();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7016() {
        super.clear();
        this.f7730 = 0;
        this.f7727 = 0;
        this.f7731 = 0;
        this.f7728 = null;
        C17310 c17310 = this.f7729;
        if (c17310 != null) {
            c17310.m39271();
            this.f7729 = null;
        }
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35229;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C10368.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C10368.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C10368 c10368BuildPartial = buildPartial();
        if (c10368BuildPartial.isInitialized()) {
            return c10368BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10368BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C10368 c10368BuildPartial = buildPartial();
        if (c10368BuildPartial.isInitialized()) {
            return c10368BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10368BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C10368 buildPartial() {
        C20112 c20112;
        int i = 0;
        C10368 c10368 = new C10368(this, 0);
        int i2 = this.f7730;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c10368.f28700 = this.f7727;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c10368.f28704 = this.f7731;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C17310 c17310 = this.f7729;
                if (c17310 == null) {
                    c20112 = this.f7728;
                } else {
                    c20112 = (C20112) c17310.m39268();
                }
                c10368.f28701 = c20112;
                i |= 4;
            }
            c10368.f28703 = i | c10368.f28703;
        }
        onBuilt();
        return c10368;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10368) {
            m7015((C10368) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10368) {
            m7015((C10368) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3662 m7015(C10368 c10368) {
        C20112 c20112;
        if (c10368 == C10368.getDefaultInstance()) {
            return this;
        }
        if (c10368.m24001()) {
            m7018(c10368.m24004());
        }
        if (c10368.m24003()) {
            m7017(c10368.m24002());
        }
        if (c10368.m24005()) {
            C20112 c20112M24006 = c10368.m24006();
            C17310 c17310 = this.f7729;
            if (c17310 == null) {
                if ((this.f7730 & 4) == 0 || (c20112 = this.f7728) == null || c20112 == C20112.getDefaultInstance()) {
                    this.f7728 = c20112M24006;
                } else {
                    this.f7730 |= 4;
                    onChanged();
                    ((C22124) m7014().m39273()).m49914(c20112M24006);
                }
            } else {
                c17310.m39267(c20112M24006);
            }
            if (this.f7728 != null) {
                this.f7730 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c10368.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C3662 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f7727 = abstractC9303.mo21536();
                            this.f7730 |= 1;
                        } else if (iMo21535 == 16) {
                            this.f7731 = abstractC9303.mo21536();
                            this.f7730 |= 2;
                        } else if (iMo21535 == 26) {
                            abstractC9303.mo21524(m7014().m39273(), c19283);
                            this.f7730 |= 4;
                        } else if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
                        }
                    }
                    z = true;
                } catch (C4293 e) {
                    throw e.m8712();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7018(int i) {
        this.f7727 = i;
        this.f7730 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7017(int i) {
        this.f7731 = i;
        this.f7730 |= 2;
        onChanged();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        C20112 defaultInstance;
        if ((this.f7730 & 4) == 0) {
            return true;
        }
        C17310 c17310 = this.f7729;
        if (c17310 == null) {
            defaultInstance = this.f7728;
            if (defaultInstance == null) {
                defaultInstance = C20112.getDefaultInstance();
            }
        } else {
            defaultInstance = (C20112) c17310.m39272();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m7014() {
        C20112 defaultInstance;
        C17310 c17310 = this.f7729;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f7728;
                if (defaultInstance == null) {
                    defaultInstance = C20112.getDefaultInstance();
                }
            } else {
                defaultInstance = (C20112) c17310.m39272();
            }
            this.f7729 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f7728 = null;
        }
        return this.f7729;
    }
}
