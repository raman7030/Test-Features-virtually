package p067l;

/* JADX INFO: renamed from: l.ۚۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7351 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public int f19264;

    /* JADX INFO: renamed from: ۙ */
    public int f19265;

    /* JADX INFO: renamed from: ᩶ */
    public int f19266;

    /* JADX INFO: renamed from: ᩸ */
    public int f19267;

    /* JADX INFO: renamed from: ᩹ */
    public Object f19268;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C7351(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m17031();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m17031();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m17031();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m17031();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m17033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m17033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m17033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m17033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35207;
        c11650.m26787(C3327.class, C7351.class);
        return c11650;
    }

    public C7351() {
        this.f19265 = 0;
        this.f19266 = 0;
        this.f19268 = "";
        this.f19264 = 0;
    }

    public C7351(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f19265 = 0;
        this.f19266 = 0;
        this.f19268 = "";
        this.f19264 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17031() {
        super.clear();
        this.f19267 = 0;
        this.f19265 = 0;
        this.f19266 = 0;
        this.f19268 = "";
        this.f19264 = 0;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35222;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C3327.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C3327.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C3327 c3327BuildPartial = buildPartial();
        if (c3327BuildPartial.isInitialized()) {
            return c3327BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3327BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C3327 c3327BuildPartial = buildPartial();
        if (c3327BuildPartial.isInitialized()) {
            return c3327BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3327BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C3327 buildPartial() {
        int i = 0;
        C3327 c3327 = new C3327(this, 0);
        int i2 = this.f19267;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c3327.f6501 = this.f19265;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c3327.f6503 = this.f19266;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c3327.f6505 = this.f19268;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c3327.f6500 = this.f19264;
                i |= 8;
            }
            c3327.f6504 = i | c3327.f6504;
        }
        onBuilt();
        return c3327;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3327) {
            m17032((C3327) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3327) {
            m17032((C3327) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17032(C3327 c3327) {
        if (c3327 == C3327.getDefaultInstance()) {
            return;
        }
        if (c3327.m5804()) {
            EnumC5674 enumC5674M5807 = c3327.m5807();
            enumC5674M5807.getClass();
            this.f19267 |= 1;
            this.f19265 = enumC5674M5807.getNumber();
            onChanged();
        }
        if (c3327.m5803()) {
            EnumC5674 enumC5674M5810 = c3327.m5810();
            enumC5674M5810.getClass();
            this.f19267 |= 2;
            this.f19266 = enumC5674M5810.getNumber();
            onChanged();
        }
        if (c3327.m5808()) {
            this.f19268 = c3327.f6505;
            this.f19267 |= 4;
            onChanged();
        }
        if (c3327.m5809()) {
            EnumC5674 enumC5674M5806 = c3327.m5806();
            enumC5674M5806.getClass();
            this.f19267 |= 8;
            this.f19264 = enumC5674M5806.getNumber();
            onChanged();
        }
        mergeUnknownFields(c3327.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17033(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21528) == null) {
                                mergeUnknownVarintField(1, iMo21528);
                            } else {
                                this.f19265 = iMo21528;
                                this.f19267 |= 1;
                            }
                        } else if (iMo21535 == 16) {
                            int iMo21529 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21529) == null) {
                                mergeUnknownVarintField(2, iMo21529);
                            } else {
                                this.f19266 = iMo21529;
                                this.f19267 |= 2;
                            }
                        } else if (iMo21535 == 26) {
                            this.f19268 = abstractC9303.mo21534();
                            this.f19267 |= 4;
                        } else if (iMo21535 == 32) {
                            int iMo215210 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo215210) == null) {
                                mergeUnknownVarintField(4, iMo215210);
                            } else {
                                this.f19264 = iMo215210;
                                this.f19267 |= 8;
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
}
