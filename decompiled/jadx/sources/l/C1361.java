package l;

/* JADX INFO: renamed from: l.֨᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1361 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f4955;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18670 f4956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f4957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4958;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f4959;

    public /* synthetic */ C1361(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m4778();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m4778();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m4778();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m4778();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32258;
        c9766.m24773(C8417.class, C1361.class);
        return c9766;
    }

    public C1361() {
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m4776();
        }
    }

    public C1361(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m4776();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4778() {
        super.clear();
        this.f4958 = 0;
        this.f4955 = 0;
        this.f4959 = 0;
        this.f4956 = null;
        C15722 c15722 = this.f4957;
        if (c15722 != null) {
            c15722.m37102();
            this.f4957 = null;
        }
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32254;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C8417.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C8417.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C8417 c8417BuildPartial = buildPartial();
        if (c8417BuildPartial.isInitialized()) {
            return c8417BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8417BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C8417 c8417BuildPartial = buildPartial();
        if (c8417BuildPartial.isInitialized()) {
            return c8417BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8417BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C8417 buildPartial() {
        C18670 c18670;
        int i = 0;
        C8417 c8417 = new C8417(this, 0);
        int i2 = this.f4958;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8417.f25786 = this.f4955;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c8417.f25790 = this.f4959;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f4957;
                if (c15722 == null) {
                    c18670 = this.f4956;
                } else {
                    c18670 = (C18670) c15722.m37099();
                }
                c8417.f25787 = c18670;
                i |= 4;
            }
            c8417.f25789 = i | c8417.f25789;
        }
        onBuilt();
        return c8417;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8417) {
            m4777((C8417) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8417) {
            m4777((C8417) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1361 m4777(C8417 c8417) {
        C18670 c18670;
        if (c8417 == C8417.getDefaultInstance()) {
            return this;
        }
        if (c8417.m22031()) {
            m4780(c8417.m22034());
        }
        if (c8417.m22033()) {
            m4779(c8417.m22032());
        }
        if (c8417.m22035()) {
            C18670 c18670M22036 = c8417.m22036();
            C15722 c15722 = this.f4957;
            if (c15722 == null) {
                if ((this.f4958 & 4) == 0 || (c18670 = this.f4956) == null || c18670 == C18670.getDefaultInstance()) {
                    this.f4956 = c18670M22036;
                } else {
                    this.f4958 |= 4;
                    onChanged();
                    ((C20787) m4776().m37104()).m47586(c18670M22036);
                }
            } else {
                c15722.m37098(c18670M22036);
            }
            if (this.f4956 != null) {
                this.f4958 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c8417.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C1361 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.f4955 = abstractC7297.mo19568();
                            this.f4958 |= 1;
                        } else if (iMo19567 == 16) {
                            this.f4959 = abstractC7297.mo19568();
                            this.f4958 |= 2;
                        } else if (iMo19567 == 26) {
                            abstractC7297.mo19556(m4776().m37104(), c17798);
                            this.f4958 |= 4;
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
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4780(int i) {
        this.f4955 = i;
        this.f4958 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4779(int i) {
        this.f4959 = i;
        this.f4958 |= 2;
        onChanged();
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        C18670 defaultInstance;
        if ((this.f4958 & 4) == 0) {
            return true;
        }
        C15722 c15722 = this.f4957;
        if (c15722 == null) {
            defaultInstance = this.f4956;
            if (defaultInstance == null) {
                defaultInstance = C18670.getDefaultInstance();
            }
        } else {
            defaultInstance = (C18670) c15722.m37103();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m4776() {
        C18670 defaultInstance;
        C15722 c15722 = this.f4957;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f4956;
                if (defaultInstance == null) {
                    defaultInstance = C18670.getDefaultInstance();
                }
            } else {
                defaultInstance = (C18670) c15722.m37103();
            }
            this.f4957 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f4956 = null;
        }
        return this.f4957;
    }
}
