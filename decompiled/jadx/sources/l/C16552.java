package l;

/* JADX INFO: renamed from: l.ܽۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16552 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23608 f50850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15722 f50851;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50852;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50853;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f50854;

    public /* synthetic */ C16552(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m38933();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m38933();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m38933();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m38933();
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
        C9766 c9766 = C10702.f32262;
        c9766.m24773(C17964.class, C16552.class);
        return c9766;
    }

    public C16552() {
        this.f50854 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m38932();
        }
    }

    public C16552(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f50854 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m38932();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38933() {
        super.clear();
        this.f50853 = 0;
        this.f50854 = "";
        this.f50852 = 0;
        this.f50850 = null;
        C15722 c15722 = this.f50851;
        if (c15722 != null) {
            c15722.m37102();
            this.f50851 = null;
        }
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32260;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C17964.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C17964.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C17964 c17964BuildPartial = buildPartial();
        if (c17964BuildPartial.isInitialized()) {
            return c17964BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c17964BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C17964 c17964BuildPartial = buildPartial();
        if (c17964BuildPartial.isInitialized()) {
            return c17964BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c17964BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C17964 buildPartial() {
        C23608 c23608;
        int i = 0;
        C17964 c17964 = new C17964(this, 0);
        int i2 = this.f50853;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c17964.f56020 = this.f50854;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c17964.f56019 = this.f50852;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f50851;
                if (c15722 == null) {
                    c23608 = this.f50850;
                } else {
                    c23608 = (C23608) c15722.m37099();
                }
                c17964.f56018 = c23608;
                i |= 4;
            }
            c17964.f56021 = i | c17964.f56021;
        }
        onBuilt();
        return c17964;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C17964) {
            m38936((C17964) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C17964) {
            m38936((C17964) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38936(C17964 c17964) {
        C23608 c23608;
        if (c17964 == C17964.getDefaultInstance()) {
            return;
        }
        if (c17964.hasName()) {
            this.f50854 = c17964.f56020;
            this.f50853 |= 1;
            onChanged();
        }
        if (c17964.m41964()) {
            m38934(c17964.m41962());
        }
        if (c17964.m41963()) {
            C23608 c23608M41965 = c17964.m41965();
            C15722 c15722 = this.f50851;
            if (c15722 == null) {
                if ((this.f50853 & 4) == 0 || (c23608 = this.f50850) == null || c23608 == C23608.getDefaultInstance()) {
                    this.f50850 = c23608M41965;
                } else {
                    this.f50853 |= 4;
                    onChanged();
                    ((C14435) m38932().m37104()).m34463(c23608M41965);
                }
            } else {
                c15722.m37098(c23608M41965);
            }
            if (this.f50850 != null) {
                this.f50853 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c17964.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C16552 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.f50854 = abstractC7297.mo19566();
                            this.f50853 |= 1;
                        } else if (iMo19567 == 16) {
                            this.f50852 = abstractC7297.mo19568();
                            this.f50853 |= 2;
                        } else if (iMo19567 == 26) {
                            abstractC7297.mo19556(m38932().m37104(), c17798);
                            this.f50853 |= 4;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38935(String str) {
        str.getClass();
        this.f50854 = str;
        this.f50853 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38934(int i) {
        this.f50852 = i;
        this.f50853 |= 2;
        onChanged();
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        C23608 defaultInstance;
        if ((this.f50853 & 4) == 0) {
            return true;
        }
        C15722 c15722 = this.f50851;
        if (c15722 == null) {
            defaultInstance = this.f50850;
            if (defaultInstance == null) {
                defaultInstance = C23608.getDefaultInstance();
            }
        } else {
            defaultInstance = (C23608) c15722.m37103();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m38932() {
        C23608 defaultInstance;
        C15722 c15722 = this.f50851;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f50850;
                if (defaultInstance == null) {
                    defaultInstance = C23608.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23608) c15722.m37103();
            }
            this.f50851 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f50850 = null;
        }
        return this.f50851;
    }
}
