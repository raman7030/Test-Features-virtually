package l;

/* JADX INFO: renamed from: l.ۖܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2626 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0508 f8261;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f8262;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f8263;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f8264;

    public /* synthetic */ C2626(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m8259();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m8259();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m8259();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m8259();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m8261(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m8261(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m8261(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m8261(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32224;
        c9766.m24773(C4037.class, C2626.class);
        return c9766;
    }

    public C2626() {
        this.f8264 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m8258();
        }
    }

    public C2626(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f8264 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m8258();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8259() {
        super.clear();
        this.f8263 = 0;
        this.f8264 = "";
        this.f8261 = null;
        C15722 c15722 = this.f8262;
        if (c15722 != null) {
            c15722.m37102();
            this.f8262 = null;
        }
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32220;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C4037.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C4037.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C4037 c4037BuildPartial = buildPartial();
        if (c4037BuildPartial.isInitialized()) {
            return c4037BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c4037BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C4037 c4037BuildPartial = buildPartial();
        if (c4037BuildPartial.isInitialized()) {
            return c4037BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c4037BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C4037 buildPartial() {
        C0508 c0508;
        int i = 0;
        C4037 c4037 = new C4037(this, 0);
        int i2 = this.f8263;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c4037.f12809 = this.f8264;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C15722 c15722 = this.f8262;
                if (c15722 == null) {
                    c0508 = this.f8261;
                } else {
                    c0508 = (C0508) c15722.m37099();
                }
                c4037.f12808 = c0508;
                i |= 2;
            }
            c4037.f12810 = i | c4037.f12810;
        }
        onBuilt();
        return c4037;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C4037) {
            m8260((C4037) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C4037) {
            m8260((C4037) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8260(C4037 c4037) {
        C0508 c0508;
        if (c4037 == C4037.getDefaultInstance()) {
            return;
        }
        if (c4037.hasName()) {
            this.f8264 = c4037.f12809;
            this.f8263 |= 1;
            onChanged();
        }
        if (c4037.m12139()) {
            C0508 c0508M12138 = c4037.m12138();
            C15722 c15722 = this.f8262;
            if (c15722 == null) {
                if ((this.f8263 & 2) == 0 || (c0508 = this.f8261) == null || c0508 == C0508.getDefaultInstance()) {
                    this.f8261 = c0508M12138;
                } else {
                    this.f8263 |= 2;
                    onChanged();
                    ((C19560) m8258().m37104()).m44983(c0508M12138);
                }
            } else {
                c15722.m37098(c0508M12138);
            }
            if (this.f8261 != null) {
                this.f8263 |= 2;
                onChanged();
            }
        }
        mergeUnknownFields(c4037.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8261(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.f8264 = abstractC7297.mo19566();
                            this.f8263 |= 1;
                        } else if (iMo19567 == 18) {
                            abstractC7297.mo19556(m8258().m37104(), c17798);
                            this.f8263 |= 2;
                        } else if (!super.parseUnknownField(abstractC7297, c17798, iMo19567)) {
                        }
                    }
                    z = true;
                } catch (C2025 e) {
                    throw e.m6586();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        C0508 defaultInstance;
        if ((this.f8263 & 2) == 0) {
            return true;
        }
        C15722 c15722 = this.f8262;
        if (c15722 == null) {
            defaultInstance = this.f8261;
            if (defaultInstance == null) {
                defaultInstance = C0508.getDefaultInstance();
            }
        } else {
            defaultInstance = (C0508) c15722.m37103();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m8258() {
        C0508 defaultInstance;
        C15722 c15722 = this.f8262;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f8261;
                if (defaultInstance == null) {
                    defaultInstance = C0508.getDefaultInstance();
                }
            } else {
                defaultInstance = (C0508) c15722.m37103();
            }
            this.f8262 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f8261 = null;
        }
        return this.f8262;
    }
}
