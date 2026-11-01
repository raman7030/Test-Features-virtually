package p067l;

/* JADX INFO: renamed from: l.ᩴۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20092 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩶ */
    public Object f62180;

    /* JADX INFO: renamed from: ᩸ */
    public int f62181;

    /* JADX INFO: renamed from: ᩹ */
    public int f62182;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C20092(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m45506();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m45506();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m45506();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m45506();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m45507(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m45507(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m45507(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m45507(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35247;
        c11650.m26787(C20763.class, C20092.class);
        return c11650;
    }

    public C20092() {
        this.f62182 = 0;
        this.f62180 = "";
    }

    public C20092(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f62182 = 0;
        this.f62180 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45506() {
        super.clear();
        this.f62181 = 0;
        this.f62182 = 0;
        this.f62180 = "";
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35217;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C20763.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C20763.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C20763 c20763BuildPartial = buildPartial();
        if (c20763BuildPartial.isInitialized()) {
            return c20763BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c20763BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C20763 c20763BuildPartial = buildPartial();
        if (c20763BuildPartial.isInitialized()) {
            return c20763BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c20763BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C20763 buildPartial() {
        int i = 0;
        C20763 c20763 = new C20763(this, 0);
        int i2 = this.f62181;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c20763.f65270 = this.f62182;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c20763.f65267 = this.f62180;
                i |= 2;
            }
            c20763.f65269 = i | c20763.f65269;
        }
        onBuilt();
        return c20763;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C20763) {
            m45508((C20763) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C20763) {
            m45508((C20763) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45508(C20763 c20763) {
        if (c20763 == C20763.getDefaultInstance()) {
            return;
        }
        if (c20763.m46876()) {
            EnumC5674 enumC5674M46874 = c20763.m46874();
            enumC5674M46874.getClass();
            this.f62181 |= 1;
            this.f62182 = enumC5674M46874.getNumber();
            onChanged();
        }
        if (c20763.m46875()) {
            this.f62180 = c20763.f65267;
            this.f62181 |= 2;
            onChanged();
        }
        mergeUnknownFields(c20763.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45507(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 18) {
                            this.f62180 = abstractC9303.mo21534();
                            this.f62181 |= 2;
                        } else if (iMo21535 == 24) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21528) == null) {
                                mergeUnknownVarintField(3, iMo21528);
                            } else {
                                this.f62182 = iMo21528;
                                this.f62181 |= 1;
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
