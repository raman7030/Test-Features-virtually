package p067l;

/* JADX INFO: renamed from: l.ܰܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15591 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩶ */
    public Object f44549;

    /* JADX INFO: renamed from: ᩸ */
    public int f44550;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f44551;

    public /* synthetic */ C15591(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m35441();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m35441();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m35441();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m35441();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m35442(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m35442(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m35442(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m35442(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35197;
        c11650.m26787(C9557.class, C15591.class);
        return c11650;
    }

    public C15591() {
        this.f44549 = "";
    }

    public C15591(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f44549 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35441() {
        super.clear();
        this.f44550 = 0;
        this.f44549 = "";
        this.f44551 = false;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35201;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C9557.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C9557.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C9557 c9557BuildPartial = buildPartial();
        if (c9557BuildPartial.isInitialized()) {
            return c9557BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c9557BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C9557 c9557BuildPartial = buildPartial();
        if (c9557BuildPartial.isInitialized()) {
            return c9557BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c9557BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C9557 buildPartial() {
        int i = 0;
        C9557 c9557 = new C9557(this, 0);
        int i2 = this.f44550;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c9557.f26268 = this.f44549;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c9557.f26271 = this.f44551;
                i |= 2;
            }
            c9557.f26270 = i | c9557.f26270;
        }
        onBuilt();
        return c9557;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C9557) {
            m35443((C9557) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C9557) {
            m35443((C9557) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35443(C9557 c9557) {
        if (c9557 == C9557.getDefaultInstance()) {
            return;
        }
        if (c9557.m22260()) {
            this.f44549 = c9557.f26268;
            this.f44550 |= 1;
            onChanged();
        }
        if (c9557.m22261()) {
            this.f44551 = c9557.m22259();
            this.f44550 |= 2;
            onChanged();
        }
        mergeUnknownFields(c9557.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35442(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.f44549 = abstractC9303.mo21534();
                            this.f44550 |= 1;
                        } else if (iMo21535 == 16) {
                            this.f44551 = abstractC9303.mo21539();
                            this.f44550 |= 2;
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
        int i = this.f44550;
        return ((i & 1) == 0 || (i & 2) == 0) ? false : true;
    }
}
