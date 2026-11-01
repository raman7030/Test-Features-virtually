package p067l;

/* JADX INFO: renamed from: l.ۡۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10724 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f29701;

    /* JADX INFO: renamed from: ۙ */
    public boolean f29702;

    /* JADX INFO: renamed from: ۬ */
    public Object f29703;

    /* JADX INFO: renamed from: ᩶ */
    public int f29704;

    /* JADX INFO: renamed from: ᩸ */
    public int f29705;

    /* JADX INFO: renamed from: ᩹ */
    public Object f29706;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C10724(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m24660();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m24660();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m24660();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m24660();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24661(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24661(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24661(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24661(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35208;
        c11650.m26787(C17428.class, C10724.class);
        return c11650;
    }

    public C10724() {
        this.f29706 = "";
        this.f29703 = "";
    }

    public C10724(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f29706 = "";
        this.f29703 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24660() {
        super.clear();
        this.f29705 = 0;
        this.f29704 = 0;
        this.f29706 = "";
        this.f29703 = "";
        this.f29701 = false;
        this.f29702 = false;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35190;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C17428.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C17428.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C17428 c17428BuildPartial = buildPartial();
        if (c17428BuildPartial.isInitialized()) {
            return c17428BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c17428BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C17428 c17428BuildPartial = buildPartial();
        if (c17428BuildPartial.isInitialized()) {
            return c17428BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c17428BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C17428 buildPartial() {
        int i = 0;
        C17428 c17428 = new C17428(this, 0);
        int i2 = this.f29705;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c17428.f52091 = this.f29704;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c17428.f52096 = this.f29706;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c17428.f52092 = this.f29703;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c17428.f52093 = this.f29701;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c17428.f52090 = this.f29702;
                i |= 16;
            }
            c17428.f52095 = i | c17428.f52095;
        }
        onBuilt();
        return c17428;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C17428) {
            m24662((C17428) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C17428) {
            m24662((C17428) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24662(C17428 c17428) {
        if (c17428 == C17428.getDefaultInstance()) {
            return;
        }
        if (c17428.m39687()) {
            this.f29704 = c17428.m39694();
            this.f29705 |= 1;
            onChanged();
        }
        if (c17428.m39692()) {
            this.f29706 = c17428.f52096;
            this.f29705 |= 2;
            onChanged();
        }
        if (c17428.hasType()) {
            this.f29703 = c17428.f52092;
            this.f29705 |= 4;
            onChanged();
        }
        if (c17428.m39693()) {
            this.f29701 = c17428.m39690();
            this.f29705 |= 8;
            onChanged();
        }
        if (c17428.m39688()) {
            this.f29702 = c17428.m39691();
            this.f29705 |= 16;
            onChanged();
        }
        mergeUnknownFields(c17428.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24661(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f29704 = abstractC9303.mo21536();
                            this.f29705 |= 1;
                        } else if (iMo21535 == 18) {
                            this.f29706 = abstractC9303.mo21534();
                            this.f29705 |= 2;
                        } else if (iMo21535 == 26) {
                            this.f29703 = abstractC9303.mo21534();
                            this.f29705 |= 4;
                        } else if (iMo21535 == 40) {
                            this.f29701 = abstractC9303.mo21539();
                            this.f29705 |= 8;
                        } else if (iMo21535 == 48) {
                            this.f29702 = abstractC9303.mo21539();
                            this.f29705 |= 16;
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
