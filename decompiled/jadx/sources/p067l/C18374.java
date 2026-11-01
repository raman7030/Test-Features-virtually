package p067l;

/* JADX INFO: renamed from: l.ܽ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18374 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩶ */
    public int f54876;

    /* JADX INFO: renamed from: ᩸ */
    public int f54877;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f54878;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C18374(int i) {
        this();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m41852(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m41852(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m41852(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m41852(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C25080.f80007;
        c11650.m26787(C16362.class, C18374.class);
        return c11650;
    }

    public C18374() {
        this.f54876 = 0;
    }

    public C18374(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f54876 = 0;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC11138 clear() {
        super.clear();
        this.f54877 = 0;
        this.f54878 = false;
        this.f54876 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC15830 clear() {
        super.clear();
        this.f54877 = 0;
        this.f54878 = false;
        this.f54876 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final AbstractC21296 clear() {
        super.clear();
        this.f54877 = 0;
        this.f54878 = false;
        this.f54876 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final AbstractC22045 clear() {
        super.clear();
        this.f54877 = 0;
        this.f54878 = false;
        this.f54876 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C25080.f80006;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C16362.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C16362.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C16362 c16362BuildPartial = buildPartial();
        if (c16362BuildPartial.isInitialized()) {
            return c16362BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c16362BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C16362 c16362BuildPartial = buildPartial();
        if (c16362BuildPartial.isInitialized()) {
            return c16362BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c16362BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C16362 buildPartial() {
        int i = 0;
        C16362 c16362 = new C16362(this, 0);
        int i2 = this.f54877;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c16362.f48084 = this.f54878;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c16362.f48081 = this.f54876;
                i |= 2;
            }
            c16362.f48083 = i | c16362.f48083;
        }
        onBuilt();
        return c16362;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C16362) {
            m41853((C16362) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C16362) {
            m41853((C16362) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41853(C16362 c16362) {
        if (c16362 == C16362.getDefaultInstance()) {
            return;
        }
        if (c16362.m37182()) {
            this.f54878 = c16362.m37180();
            this.f54877 |= 1;
            onChanged();
        }
        if (c16362.m37181()) {
            m41854(c16362.m37183());
        }
        mergeUnknownFields(c16362.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41852(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f54878 = abstractC9303.mo21539();
                            this.f54877 |= 1;
                        } else if (iMo21535 == 16) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC19045.m43273(iMo21528) == null) {
                                mergeUnknownVarintField(2, iMo21528);
                            } else {
                                this.f54876 = iMo21528;
                                this.f54877 |= 2;
                            }
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
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41854(EnumC19045 enumC19045) {
        enumC19045.getClass();
        this.f54877 |= 2;
        this.f54876 = enumC19045.getNumber();
        onChanged();
    }
}
