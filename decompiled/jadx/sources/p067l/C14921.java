package p067l;

/* JADX INFO: renamed from: l.۬ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14921 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC8296 f42616;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC8296 f42617;

    /* JADX INFO: renamed from: ۬ */
    public Object f42618;

    /* JADX INFO: renamed from: ᩶ */
    public C4964 f42619;

    /* JADX INFO: renamed from: ᩸ */
    public int f42620;

    /* JADX INFO: renamed from: ᩹ */
    public Object f42621;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C14921(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m34141();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m34141();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m34141();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m34141();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m34142(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m34142(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m34142(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m34142(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35244;
        c11650.m26787(C14251.class, C14921.class);
        return c11650;
    }

    public C14921() {
        this.f42617 = AbstractC6285.m14287();
        this.f42616 = AbstractC6285.m14287();
        this.f42621 = "";
        this.f42618 = "";
        this.f42619 = C4964.m10513();
    }

    public C14921(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f42617 = AbstractC6285.m14287();
        this.f42616 = AbstractC6285.m14287();
        this.f42621 = "";
        this.f42618 = "";
        this.f42619 = C4964.m10513();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34141() {
        super.clear();
        this.f42620 = 0;
        this.f42617 = AbstractC6285.m14287();
        this.f42616 = AbstractC6285.m14287();
        this.f42621 = "";
        this.f42618 = "";
        this.f42619 = C4964.m10513();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35226;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C14251.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C14251.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C14251 c14251BuildPartial = buildPartial();
        if (c14251BuildPartial.isInitialized()) {
            return c14251BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c14251BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C14251 c14251BuildPartial = buildPartial();
        if (c14251BuildPartial.isInitialized()) {
            return c14251BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c14251BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C14251 buildPartial() {
        int i = 0;
        C14251 c14251 = new C14251(this, 0);
        int i2 = this.f42620;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                this.f42617.mo46787();
                c14251.f40579 = this.f42617;
            }
            if ((i2 & 2) != 0) {
                this.f42616.mo46787();
                c14251.f40577 = this.f42616;
            }
            if ((i2 & 4) != 0) {
                c14251.f40582 = this.f42621;
                i = 1;
            }
            if ((i2 & 8) != 0) {
                c14251.f40576 = this.f42618;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f42619.mo46787();
                c14251.f40580 = this.f42619;
            }
            c14251.f40581 = i | c14251.f40581;
        }
        onBuilt();
        return c14251;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C14251) {
            m34143((C14251) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C14251) {
            m34143((C14251) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34143(C14251 c14251) {
        if (c14251 == C14251.getDefaultInstance()) {
            return;
        }
        if (!c14251.f40579.isEmpty()) {
            if (this.f42617.isEmpty()) {
                InterfaceC8296 interfaceC8296 = c14251.f40579;
                this.f42617 = interfaceC8296;
                interfaceC8296.mo46787();
                this.f42620 |= 1;
            } else {
                m34139();
                this.f42617.addAll(c14251.f40579);
            }
            onChanged();
        }
        if (!c14251.f40577.isEmpty()) {
            if (this.f42616.isEmpty()) {
                InterfaceC8296 interfaceC8297 = c14251.f40577;
                this.f42616 = interfaceC8297;
                interfaceC8297.mo46787();
                this.f42620 |= 2;
            } else {
                m34140();
                this.f42616.addAll(c14251.f40577);
            }
            onChanged();
        }
        if (c14251.m32760()) {
            this.f42621 = c14251.f40582;
            this.f42620 |= 4;
            onChanged();
        }
        if (c14251.m32759()) {
            this.f42618 = c14251.f40576;
            this.f42620 |= 8;
            onChanged();
        }
        if (!c14251.f40580.isEmpty()) {
            if (this.f42619.isEmpty()) {
                this.f42619 = c14251.f40580;
                this.f42620 |= 16;
            } else {
                if (!this.f42619.mo46785()) {
                    this.f42619 = new C4964(this.f42619);
                }
                this.f42620 |= 16;
                this.f42619.addAll(c14251.f40580);
            }
            onChanged();
        }
        mergeUnknownFields(c14251.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34142(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            int iMo21536 = abstractC9303.mo21536();
                            m34139();
                            this.f42617.mo19112(iMo21536);
                        } else if (iMo21535 == 10) {
                            int iMo21538 = abstractC9303.mo21538(abstractC9303.mo21526());
                            m34139();
                            while (abstractC9303.mo21532() > 0) {
                                this.f42617.mo19112(abstractC9303.mo21536());
                            }
                            abstractC9303.mo21533(iMo21538);
                        } else if (iMo21535 == 16) {
                            int iMo21537 = abstractC9303.mo21536();
                            m34140();
                            this.f42616.mo19112(iMo21537);
                        } else if (iMo21535 == 18) {
                            int iMo21539 = abstractC9303.mo21538(abstractC9303.mo21526());
                            m34140();
                            while (abstractC9303.mo21532() > 0) {
                                this.f42616.mo19112(abstractC9303.mo21536());
                            }
                            abstractC9303.mo21533(iMo21539);
                        } else if (iMo21535 == 26) {
                            this.f42621 = abstractC9303.mo21534();
                            this.f42620 |= 4;
                        } else if (iMo21535 == 34) {
                            this.f42618 = abstractC9303.mo21534();
                            this.f42620 |= 8;
                        } else if (iMo21535 == 50) {
                            AbstractC7962 abstractC7962Mo21534 = abstractC9303.mo21534();
                            if (!this.f42619.mo46785()) {
                                this.f42619 = new C4964(this.f42619);
                            }
                            this.f42620 |= 16;
                            this.f42619.mo10516(abstractC7962Mo21534);
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

    /* JADX INFO: renamed from: ܽ */
    private void m34139() {
        if (!this.f42617.mo46785()) {
            this.f42617 = (InterfaceC8296) AbstractC6285.m14263((InterfaceC24389) this.f42617);
        }
        this.f42620 |= 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m34140() {
        if (!this.f42616.mo46785()) {
            this.f42616 = (InterfaceC8296) AbstractC6285.m14263((InterfaceC24389) this.f42616);
        }
        this.f42620 |= 2;
    }
}
