package p067l;

/* JADX INFO: renamed from: l.۟ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9382 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public C17310 f25559;

    /* JADX INFO: renamed from: ۙ */
    public C8041 f25560;

    /* JADX INFO: renamed from: ۬ */
    public C8041 f25561;

    /* JADX INFO: renamed from: ᩶ */
    public C17310 f25562;

    /* JADX INFO: renamed from: ᩸ */
    public int f25563;

    /* JADX INFO: renamed from: ᩹ */
    public int f25564;

    public /* synthetic */ C9382(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m21810();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m21810();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m21810();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m21810();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m21812(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m21812(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m21812(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m21812(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35239;
        c11650.m26787(C3998.class, C9382.class);
        return c11650;
    }

    public C9382() {
        this.f25564 = 0;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m21809();
            m21808();
        }
    }

    public C9382(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f25564 = 0;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m21809();
            m21808();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21810() {
        super.clear();
        this.f25563 = 0;
        this.f25564 = 0;
        this.f25561 = null;
        C17310 c17310 = this.f25559;
        if (c17310 != null) {
            c17310.m39271();
            this.f25559 = null;
        }
        this.f25560 = null;
        C17310 c17311 = this.f25562;
        if (c17311 != null) {
            c17311.m39271();
            this.f25562 = null;
        }
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35245;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C3998.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C3998.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C3998 c3998BuildPartial = buildPartial();
        if (c3998BuildPartial.isInitialized()) {
            return c3998BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3998BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C3998 c3998BuildPartial = buildPartial();
        if (c3998BuildPartial.isInitialized()) {
            return c3998BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3998BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C3998 buildPartial() {
        C8041 c8041;
        C8041 c8042;
        int i = 0;
        C3998 c3998 = new C3998(this, 0);
        int i2 = this.f25563;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c3998.f8708 = this.f25564;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C17310 c17310 = this.f25559;
                if (c17310 == null) {
                    c8042 = this.f25561;
                } else {
                    c8042 = (C8041) c17310.m39268();
                }
                c3998.f8704 = c8042;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C17310 c17311 = this.f25562;
                if (c17311 == null) {
                    c8041 = this.f25560;
                } else {
                    c8041 = (C8041) c17311.m39268();
                }
                c3998.f8706 = c8041;
                i |= 4;
            }
            c3998.f8707 = i | c3998.f8707;
        }
        onBuilt();
        return c3998;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3998) {
            m21811((C3998) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3998) {
            m21811((C3998) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21811(C3998 c3998) {
        C8041 c8041;
        C8041 c8042;
        if (c3998 == C3998.getDefaultInstance()) {
            return;
        }
        if (c3998.m7963()) {
            EnumC5674 enumC5674M7962 = c3998.m7962();
            enumC5674M7962.getClass();
            this.f25563 |= 1;
            this.f25564 = enumC5674M7962.getNumber();
            onChanged();
        }
        if (c3998.m7961()) {
            C8041 c8041M7964 = c3998.m7964();
            C17310 c17310 = this.f25559;
            if (c17310 == null) {
                if ((this.f25563 & 2) == 0 || (c8042 = this.f25561) == null || c8042 == C8041.getDefaultInstance()) {
                    this.f25561 = c8041M7964;
                } else {
                    this.f25563 |= 2;
                    onChanged();
                    ((C2676) m21809().m39273()).m4130(c8041M7964);
                }
            } else {
                c17310.m39267(c8041M7964);
            }
            if (this.f25561 != null) {
                this.f25563 |= 2;
                onChanged();
            }
        }
        if (c3998.m7965()) {
            C8041 c8041M7966 = c3998.m7966();
            C17310 c17311 = this.f25562;
            if (c17311 == null) {
                if ((this.f25563 & 4) == 0 || (c8041 = this.f25560) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f25560 = c8041M7966;
                } else {
                    this.f25563 |= 4;
                    onChanged();
                    ((C2676) m21808().m39273()).m4130(c8041M7966);
                }
            } else {
                c17311.m39267(c8041M7966);
            }
            if (this.f25560 != null) {
                this.f25563 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c3998.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21812(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 24) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21528) == null) {
                                mergeUnknownVarintField(3, iMo21528);
                            } else {
                                this.f25564 = iMo21528;
                                this.f25563 |= 1;
                            }
                        } else if (iMo21535 == 34) {
                            abstractC9303.mo21524(m21809().m39273(), c19283);
                            this.f25563 |= 2;
                        } else if (iMo21535 == 42) {
                            abstractC9303.mo21524(m21808().m39273(), c19283);
                            this.f25563 |= 4;
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
        C8041 defaultInstance;
        C8041 defaultInstance2;
        if ((this.f25563 & 2) != 0) {
            C17310 c17310 = this.f25559;
            if (c17310 == null) {
                defaultInstance2 = this.f25561;
                if (defaultInstance2 == null) {
                    defaultInstance2 = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance2 = (C8041) c17310.m39272();
            }
            if (!defaultInstance2.isInitialized()) {
                return false;
            }
        }
        if ((this.f25563 & 4) == 0) {
            return true;
        }
        C17310 c17311 = this.f25562;
        if (c17311 == null) {
            defaultInstance = this.f25560;
            if (defaultInstance == null) {
                defaultInstance = C8041.getDefaultInstance();
            }
        } else {
            defaultInstance = (C8041) c17311.m39272();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩳ */
    private C17310 m21809() {
        C8041 defaultInstance;
        C17310 c17310 = this.f25559;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f25561;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f25559 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f25561 = null;
        }
        return this.f25559;
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m21808() {
        C8041 defaultInstance;
        C17310 c17310 = this.f25562;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f25560;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f25562 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f25560 = null;
        }
        return this.f25562;
    }
}
