package p067l;

/* JADX INFO: renamed from: l.ܿܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18945 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public C17310 f56481;

    /* JADX INFO: renamed from: ۙ */
    public Object f56482;

    /* JADX INFO: renamed from: ۤ */
    public boolean f56483;

    /* JADX INFO: renamed from: ۫ */
    public Object f56484;

    /* JADX INFO: renamed from: ۬ */
    public C10899 f56485;

    /* JADX INFO: renamed from: ᩶ */
    public Object f56486;

    /* JADX INFO: renamed from: ᩸ */
    public int f56487;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f56488;

    public /* synthetic */ C18945(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m43032();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m43032();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m43032();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m43032();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m43033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m43033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m43033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m43033(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35213;
        c11650.m26787(C16262.class, C18945.class);
        return c11650;
    }

    public C18945() {
        this.f56482 = "";
        this.f56486 = "";
        this.f56484 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m43031();
        }
    }

    public C18945(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f56482 = "";
        this.f56486 = "";
        this.f56484 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m43031();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43032() {
        super.clear();
        this.f56487 = 0;
        this.f56482 = "";
        this.f56486 = "";
        this.f56484 = "";
        this.f56485 = null;
        C17310 c17310 = this.f56481;
        if (c17310 != null) {
            c17310.m39271();
            this.f56481 = null;
        }
        this.f56488 = false;
        this.f56483 = false;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35242;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C16262.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C16262.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C16262 c16262BuildPartial = buildPartial();
        if (c16262BuildPartial.isInitialized()) {
            return c16262BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c16262BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C16262 c16262BuildPartial = buildPartial();
        if (c16262BuildPartial.isInitialized()) {
            return c16262BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c16262BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C16262 buildPartial() {
        C10899 c10899;
        int i = 0;
        C16262 c16262 = new C16262(this, 0);
        int i2 = this.f56487;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c16262.f47821 = this.f56482;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c16262.f47826 = this.f56486;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c16262.f47824 = this.f56484;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C17310 c17310 = this.f56481;
                if (c17310 == null) {
                    c10899 = this.f56485;
                } else {
                    c10899 = (C10899) c17310.m39268();
                }
                c16262.f47825 = c10899;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c16262.f47828 = this.f56488;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c16262.f47823 = this.f56483;
                i |= 32;
            }
            c16262.f47827 = i | c16262.f47827;
        }
        onBuilt();
        return c16262;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C16262) {
            m43034((C16262) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C16262) {
            m43034((C16262) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43034(C16262 c16262) {
        C10899 c10899;
        if (c16262 == C16262.getDefaultInstance()) {
            return;
        }
        if (c16262.hasName()) {
            this.f56482 = c16262.f47821;
            this.f56487 |= 1;
            onChanged();
        }
        if (c16262.m37051()) {
            this.f56486 = c16262.f47826;
            this.f56487 |= 2;
            onChanged();
        }
        if (c16262.m37057()) {
            this.f56484 = c16262.f47824;
            this.f56487 |= 4;
            onChanged();
        }
        if (c16262.m37056()) {
            C10899 c10899M37054 = c16262.m37054();
            C17310 c17310 = this.f56481;
            if (c17310 == null) {
                if ((this.f56487 & 8) == 0 || (c10899 = this.f56485) == null || c10899 == C10899.getDefaultInstance()) {
                    this.f56485 = c10899M37054;
                } else {
                    this.f56487 |= 8;
                    onChanged();
                    ((C8887) m43031().m39273()).m20495(c10899M37054);
                }
            } else {
                c17310.m39267(c10899M37054);
            }
            if (this.f56485 != null) {
                this.f56487 |= 8;
                onChanged();
            }
        }
        if (c16262.m37050()) {
            this.f56488 = c16262.m37052();
            this.f56487 |= 16;
            onChanged();
        }
        if (c16262.m37049()) {
            this.f56483 = c16262.m37055();
            this.f56487 |= 32;
            onChanged();
        }
        mergeUnknownFields(c16262.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43033(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.f56482 = abstractC9303.mo21534();
                            this.f56487 |= 1;
                        } else if (iMo21535 == 18) {
                            this.f56486 = abstractC9303.mo21534();
                            this.f56487 |= 2;
                        } else if (iMo21535 == 26) {
                            this.f56484 = abstractC9303.mo21534();
                            this.f56487 |= 4;
                        } else if (iMo21535 == 34) {
                            abstractC9303.mo21524(m43031().m39273(), c19283);
                            this.f56487 |= 8;
                        } else if (iMo21535 == 40) {
                            this.f56488 = abstractC9303.mo21539();
                            this.f56487 |= 16;
                        } else if (iMo21535 == 48) {
                            this.f56483 = abstractC9303.mo21539();
                            this.f56487 |= 32;
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

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        C10899 defaultInstance;
        if ((this.f56487 & 8) == 0) {
            return true;
        }
        C17310 c17310 = this.f56481;
        if (c17310 == null) {
            defaultInstance = this.f56485;
            if (defaultInstance == null) {
                defaultInstance = C10899.getDefaultInstance();
            }
        } else {
            defaultInstance = (C10899) c17310.m39272();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m43031() {
        C10899 defaultInstance;
        C17310 c17310 = this.f56481;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f56485;
                if (defaultInstance == null) {
                    defaultInstance = C10899.getDefaultInstance();
                }
            } else {
                defaultInstance = (C10899) c17310.m39272();
            }
            this.f56481 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f56485 = null;
        }
        return this.f56481;
    }
}
