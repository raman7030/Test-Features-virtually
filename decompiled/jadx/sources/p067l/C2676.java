package p067l;

/* JADX INFO: renamed from: l.֡ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2676 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public int f4483;

    /* JADX INFO: renamed from: ۙ */
    public int f4484;

    /* JADX INFO: renamed from: ۤ */
    public int f4485;

    /* JADX INFO: renamed from: ۫ */
    public int f4486;

    /* JADX INFO: renamed from: ۬ */
    public int f4487;

    /* JADX INFO: renamed from: ᩶ */
    public int f4488;

    /* JADX INFO: renamed from: ᩹ */
    public int f4489;

    public C2676(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f4484 = 0;
        this.f4488 = 0;
        this.f4486 = 0;
        this.f4485 = 0;
        this.f4487 = 0;
        this.f4483 = 0;
    }

    public /* synthetic */ C2676(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m4135();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m4135();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m4135();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m4135();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m4135();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m4132(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m4132(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m4132(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m4132(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35218;
        c11650.m26787(C8041.class, C2676.class);
        return c11650;
    }

    public C2676() {
        this.f4484 = 0;
        this.f4488 = 0;
        this.f4486 = 0;
        this.f4485 = 0;
        this.f4487 = 0;
        this.f4483 = 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4135() {
        super.clear();
        this.f4489 = 0;
        this.f4484 = 0;
        this.f4488 = 0;
        this.f4486 = 0;
        this.f4485 = 0;
        this.f4487 = 0;
        this.f4483 = 0;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35220;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C8041.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C8041.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C8041 build() {
        C8041 c8041BuildPartial = buildPartial();
        if (c8041BuildPartial.isInitialized()) {
            return c8041BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c8041BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C8041 buildPartial() {
        int i;
        C8041 c8041 = new C8041(this);
        int i2 = this.f4489;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8041.f21158 = this.f4484;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c8041.f21163 = this.f4488;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c8041.f21160 = this.f4486;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c8041.f21159 = this.f4485;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c8041.f21161 = this.f4487;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c8041.f21157 = this.f4483;
                i |= 32;
            }
            c8041.f21164 = i | c8041.f21164;
        }
        onBuilt();
        return c8041;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C8041) {
            m4130((C8041) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C8041) {
            m4130((C8041) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2676 m4130(C8041 c8041) {
        if (c8041 == C8041.getDefaultInstance()) {
            return this;
        }
        if (c8041.m18649()) {
            m4134(c8041.m18653());
        }
        if (c8041.m18645()) {
            EnumC3347 enumC3347M18651 = c8041.m18651();
            enumC3347M18651.getClass();
            this.f4489 |= 2;
            this.f4488 = enumC3347M18651.getNumber();
            onChanged();
        }
        if (c8041.m18652()) {
            m4133(c8041.m18654());
        }
        if (c8041.m18656()) {
            EnumC12065 enumC12065M18655 = c8041.m18655();
            enumC12065M18655.getClass();
            this.f4489 |= 8;
            this.f4485 = enumC12065M18655.getNumber();
            onChanged();
        }
        if (c8041.m18650()) {
            m4131(c8041.m18648());
        }
        if (c8041.m18646()) {
            EnumC23464 enumC23464M18647 = c8041.m18647();
            enumC23464M18647.getClass();
            this.f4489 |= 32;
            this.f4483 = enumC23464M18647.getNumber();
            onChanged();
        }
        m11167((AbstractC13919) c8041);
        mergeUnknownFields(c8041.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return m11168();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4132(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC16757.m37997(iMo21528) == null) {
                                mergeUnknownVarintField(1, iMo21528);
                            } else {
                                this.f4484 = iMo21528;
                                this.f4489 |= 1;
                            }
                        } else if (iMo21535 == 16) {
                            int iMo21529 = abstractC9303.mo21528();
                            if (EnumC3347.m5840(iMo21529) == null) {
                                mergeUnknownVarintField(2, iMo21529);
                            } else {
                                this.f4488 = iMo21529;
                                this.f4489 |= 2;
                            }
                        } else if (iMo21535 == 24) {
                            int iMo215210 = abstractC9303.mo21528();
                            if (EnumC14746.m33691(iMo215210) == null) {
                                mergeUnknownVarintField(3, iMo215210);
                            } else {
                                this.f4486 = iMo215210;
                                this.f4489 |= 4;
                            }
                        } else if (iMo21535 == 32) {
                            int iMo215211 = abstractC9303.mo21528();
                            if (EnumC12065.m27628(iMo215211) == null) {
                                mergeUnknownVarintField(4, iMo215211);
                            } else {
                                this.f4485 = iMo215211;
                                this.f4489 |= 8;
                            }
                        } else if (iMo21535 == 40) {
                            int iMo215212 = abstractC9303.mo21528();
                            if (EnumC6700.m15296(iMo215212) == null) {
                                mergeUnknownVarintField(5, iMo215212);
                            } else {
                                this.f4487 = iMo215212;
                                this.f4489 |= 16;
                            }
                        } else if (iMo21535 == 48) {
                            int iMo215213 = abstractC9303.mo21528();
                            if (EnumC23464.m52186(iMo215213) == null) {
                                mergeUnknownVarintField(6, iMo215213);
                            } else {
                                this.f4483 = iMo215213;
                                this.f4489 |= 32;
                            }
                        } else if (!parseUnknownField(abstractC9303, c19283, iMo21535)) {
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
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4134(EnumC16757 enumC16757) {
        enumC16757.getClass();
        this.f4489 |= 1;
        this.f4484 = enumC16757.getNumber();
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4133(EnumC14746 enumC14746) {
        enumC14746.getClass();
        this.f4489 |= 4;
        this.f4486 = enumC14746.getNumber();
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4131(EnumC6700 enumC6700) {
        enumC6700.getClass();
        this.f4489 |= 16;
        this.f4487 = enumC6700.getNumber();
        onChanged();
    }
}
