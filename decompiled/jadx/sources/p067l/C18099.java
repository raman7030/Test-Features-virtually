package p067l;

/* JADX INFO: renamed from: l.ܽۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18099 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public C24805 f54028;

    /* JADX INFO: renamed from: ۙ */
    public C17310 f54029;

    /* JADX INFO: renamed from: ᩶ */
    public int f54030;

    /* JADX INFO: renamed from: ᩸ */
    public int f54031;

    /* JADX INFO: renamed from: ᩹ */
    public Object f54032;

    public /* synthetic */ C18099(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m41159();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m41159();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m41159();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m41159();
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
        C11650 c11650 = C12539.f35237;
        c11650.m26787(C19441.class, C18099.class);
        return c11650;
    }

    public C18099() {
        this.f54032 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m41158();
        }
    }

    public C18099(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f54032 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m41158();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41159() {
        super.clear();
        this.f54031 = 0;
        this.f54032 = "";
        this.f54030 = 0;
        this.f54028 = null;
        C17310 c17310 = this.f54029;
        if (c17310 != null) {
            c17310.m39271();
            this.f54029 = null;
        }
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35235;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C19441.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C19441.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C19441 c19441BuildPartial = buildPartial();
        if (c19441BuildPartial.isInitialized()) {
            return c19441BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c19441BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C19441 c19441BuildPartial = buildPartial();
        if (c19441BuildPartial.isInitialized()) {
            return c19441BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c19441BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C19441 buildPartial() {
        C24805 c24805;
        int i = 0;
        C19441 c19441 = new C19441(this, 0);
        int i2 = this.f54031;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c19441.f59217 = this.f54032;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c19441.f59216 = this.f54030;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C17310 c17310 = this.f54029;
                if (c17310 == null) {
                    c24805 = this.f54028;
                } else {
                    c24805 = (C24805) c17310.m39268();
                }
                c19441.f59215 = c24805;
                i |= 4;
            }
            c19441.f59218 = i | c19441.f59218;
        }
        onBuilt();
        return c19441;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C19441) {
            m41162((C19441) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C19441) {
            m41162((C19441) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41162(C19441 c19441) {
        C24805 c24805;
        if (c19441 == C19441.getDefaultInstance()) {
            return;
        }
        if (c19441.hasName()) {
            this.f54032 = c19441.f59217;
            this.f54031 |= 1;
            onChanged();
        }
        if (c19441.m44213()) {
            m41160(c19441.m44211());
        }
        if (c19441.m44212()) {
            C24805 c24805M44214 = c19441.m44214();
            C17310 c17310 = this.f54029;
            if (c17310 == null) {
                if ((this.f54031 & 4) == 0 || (c24805 = this.f54028) == null || c24805 == C24805.getDefaultInstance()) {
                    this.f54028 = c24805M44214;
                } else {
                    this.f54031 |= 4;
                    onChanged();
                    ((C16087) m41158().m39273()).m36596(c24805M44214);
                }
            } else {
                c17310.m39267(c24805M44214);
            }
            if (this.f54028 != null) {
                this.f54031 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c19441.getUnknownFields());
        onChanged();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C18099 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.f54032 = abstractC9303.mo21534();
                            this.f54031 |= 1;
                        } else if (iMo21535 == 16) {
                            this.f54030 = abstractC9303.mo21536();
                            this.f54031 |= 2;
                        } else if (iMo21535 == 26) {
                            abstractC9303.mo21524(m41158().m39273(), c19283);
                            this.f54031 |= 4;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m41161(String str) {
        str.getClass();
        this.f54032 = str;
        this.f54031 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41160(int i) {
        this.f54030 = i;
        this.f54031 |= 2;
        onChanged();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        C24805 defaultInstance;
        if ((this.f54031 & 4) == 0) {
            return true;
        }
        C17310 c17310 = this.f54029;
        if (c17310 == null) {
            defaultInstance = this.f54028;
            if (defaultInstance == null) {
                defaultInstance = C24805.getDefaultInstance();
            }
        } else {
            defaultInstance = (C24805) c17310.m39272();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m41158() {
        C24805 defaultInstance;
        C17310 c17310 = this.f54029;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f54028;
                if (defaultInstance == null) {
                    defaultInstance = C24805.getDefaultInstance();
                }
            } else {
                defaultInstance = (C24805) c17310.m39272();
            }
            this.f54029 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f54028 = null;
        }
        return this.f54029;
    }
}
