package p067l;

/* JADX INFO: renamed from: l.ۖܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4864 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۙ */
    public C2851 f11056;

    /* JADX INFO: renamed from: ᩶ */
    public C17310 f11057;

    /* JADX INFO: renamed from: ᩸ */
    public int f11058;

    /* JADX INFO: renamed from: ᩹ */
    public Object f11059;

    public /* synthetic */ C4864(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m10303();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m10303();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m10303();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m10303();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m10305(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m10305(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m10305(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m10305(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35199;
        c11650.m26787(C6205.class, C4864.class);
        return c11650;
    }

    public C4864() {
        this.f11059 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m10302();
        }
    }

    public C4864(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f11059 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m10302();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10303() {
        super.clear();
        this.f11058 = 0;
        this.f11059 = "";
        this.f11056 = null;
        C17310 c17310 = this.f11057;
        if (c17310 != null) {
            c17310.m39271();
            this.f11057 = null;
        }
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35195;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C6205.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C6205.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C6205 c6205BuildPartial = buildPartial();
        if (c6205BuildPartial.isInitialized()) {
            return c6205BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c6205BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C6205 c6205BuildPartial = buildPartial();
        if (c6205BuildPartial.isInitialized()) {
            return c6205BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c6205BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C6205 buildPartial() {
        C2851 c2851;
        int i = 0;
        C6205 c6205 = new C6205(this, 0);
        int i2 = this.f11058;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c6205.f15624 = this.f11059;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C17310 c17310 = this.f11057;
                if (c17310 == null) {
                    c2851 = this.f11056;
                } else {
                    c2851 = (C2851) c17310.m39268();
                }
                c6205.f15623 = c2851;
                i |= 2;
            }
            c6205.f15625 = i | c6205.f15625;
        }
        onBuilt();
        return c6205;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C6205) {
            m10304((C6205) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C6205) {
            m10304((C6205) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10304(C6205 c6205) {
        C2851 c2851;
        if (c6205 == C6205.getDefaultInstance()) {
            return;
        }
        if (c6205.hasName()) {
            this.f11059 = c6205.f15624;
            this.f11058 |= 1;
            onChanged();
        }
        if (c6205.m14060()) {
            C2851 c2851M14059 = c6205.m14059();
            C17310 c17310 = this.f11057;
            if (c17310 == null) {
                if ((this.f11058 & 2) == 0 || (c2851 = this.f11056) == null || c2851 == C2851.getDefaultInstance()) {
                    this.f11056 = c2851M14059;
                } else {
                    this.f11058 |= 2;
                    onChanged();
                    ((C20958) m10302().m39273()).m47278(c2851M14059);
                }
            } else {
                c17310.m39267(c2851M14059);
            }
            if (this.f11056 != null) {
                this.f11058 |= 2;
                onChanged();
            }
        }
        mergeUnknownFields(c6205.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10305(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.f11059 = abstractC9303.mo21534();
                            this.f11058 |= 1;
                        } else if (iMo21535 == 18) {
                            abstractC9303.mo21524(m10302().m39273(), c19283);
                            this.f11058 |= 2;
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
        C2851 defaultInstance;
        if ((this.f11058 & 2) == 0) {
            return true;
        }
        C17310 c17310 = this.f11057;
        if (c17310 == null) {
            defaultInstance = this.f11056;
            if (defaultInstance == null) {
                defaultInstance = C2851.getDefaultInstance();
            }
        } else {
            defaultInstance = (C2851) c17310.m39272();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m10302() {
        C2851 defaultInstance;
        C17310 c17310 = this.f11057;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f11056;
                if (defaultInstance == null) {
                    defaultInstance = C2851.getDefaultInstance();
                }
            } else {
                defaultInstance = (C2851) c17310.m39272();
            }
            this.f11057 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f11056 = null;
        }
        return this.f11057;
    }
}
