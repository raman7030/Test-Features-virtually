package p067l;

/* JADX INFO: renamed from: l.ۛ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8356 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩶ */
    public int f22349;

    /* JADX INFO: renamed from: ᩸ */
    public int f22350;

    /* JADX INFO: renamed from: ᩹ */
    public int f22351;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C8356(int i) {
        this();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m19281(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m19281(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m19281(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m19281(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35212;
        c11650.m26787(C13721.class, C8356.class);
        return c11650;
    }

    public C8356() {
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC11138 clear() {
        super.clear();
        this.f22350 = 0;
        this.f22349 = 0;
        this.f22351 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC15830 clear() {
        super.clear();
        this.f22350 = 0;
        this.f22349 = 0;
        this.f22351 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final AbstractC21296 clear() {
        super.clear();
        this.f22350 = 0;
        this.f22349 = 0;
        this.f22351 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final AbstractC22045 clear() {
        super.clear();
        this.f22350 = 0;
        this.f22349 = 0;
        this.f22351 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35241;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C13721.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C13721.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C13721 c13721BuildPartial = buildPartial();
        if (c13721BuildPartial.isInitialized()) {
            return c13721BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c13721BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C13721 c13721BuildPartial = buildPartial();
        if (c13721BuildPartial.isInitialized()) {
            return c13721BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c13721BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C13721 buildPartial() {
        int i = 0;
        C13721 c13721 = new C13721(this, 0);
        int i2 = this.f22350;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c13721.f38717 = this.f22349;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c13721.f38720 = this.f22351;
                i |= 2;
            }
            c13721.f38719 = i | c13721.f38719;
        }
        onBuilt();
        return c13721;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C13721) {
            m19282((C13721) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C13721) {
            m19282((C13721) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19282(C13721 c13721) {
        if (c13721 == C13721.getDefaultInstance()) {
            return;
        }
        if (c13721.m31190()) {
            this.f22349 = c13721.m31192();
            this.f22350 |= 1;
            onChanged();
        }
        if (c13721.m31191()) {
            this.f22351 = c13721.m31189();
            this.f22350 |= 2;
            onChanged();
        }
        mergeUnknownFields(c13721.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19281(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f22349 = abstractC9303.mo21536();
                            this.f22350 |= 1;
                        } else if (iMo21535 == 16) {
                            this.f22351 = abstractC9303.mo21536();
                            this.f22350 |= 2;
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
