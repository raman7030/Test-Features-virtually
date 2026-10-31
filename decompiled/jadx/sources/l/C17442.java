package l;

/* JADX INFO: renamed from: l.ܿܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17442 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f53293;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f53294;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53295;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f53296;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8976 f53297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f53298;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53299;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f53300;

    public /* synthetic */ C17442(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m40774();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m40774();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m40774();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m40774();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m40775(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m40775(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m40775(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m40775(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32238;
        c9766.m24773(C14619.class, C17442.class);
        return c9766;
    }

    public C17442() {
        this.f53294 = "";
        this.f53298 = "";
        this.f53296 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m40773();
        }
    }

    public C17442(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f53294 = "";
        this.f53298 = "";
        this.f53296 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m40773();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40774() {
        super.clear();
        this.f53299 = 0;
        this.f53294 = "";
        this.f53298 = "";
        this.f53296 = "";
        this.f53297 = null;
        C15722 c15722 = this.f53293;
        if (c15722 != null) {
            c15722.m37102();
            this.f53293 = null;
        }
        this.f53300 = false;
        this.f53295 = false;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32267;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C14619.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C14619.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C14619 c14619BuildPartial = buildPartial();
        if (c14619BuildPartial.isInitialized()) {
            return c14619BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c14619BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C14619 c14619BuildPartial = buildPartial();
        if (c14619BuildPartial.isInitialized()) {
            return c14619BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c14619BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C14619 buildPartial() {
        C8976 c8976;
        int i = 0;
        C14619 c14619 = new C14619(this, 0);
        int i2 = this.f53299;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c14619.f44714 = this.f53294;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c14619.f44719 = this.f53298;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c14619.f44717 = this.f53296;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15722 c15722 = this.f53293;
                if (c15722 == null) {
                    c8976 = this.f53297;
                } else {
                    c8976 = (C8976) c15722.m37099();
                }
                c14619.f44718 = c8976;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c14619.f44721 = this.f53300;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c14619.f44716 = this.f53295;
                i |= 32;
            }
            c14619.f44720 = i | c14619.f44720;
        }
        onBuilt();
        return c14619;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C14619) {
            m40776((C14619) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C14619) {
            m40776((C14619) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40776(C14619 c14619) {
        C8976 c8976;
        if (c14619 == C14619.getDefaultInstance()) {
            return;
        }
        if (c14619.hasName()) {
            this.f53294 = c14619.f44714;
            this.f53299 |= 1;
            onChanged();
        }
        if (c14619.m34904()) {
            this.f53298 = c14619.f44719;
            this.f53299 |= 2;
            onChanged();
        }
        if (c14619.m34910()) {
            this.f53296 = c14619.f44717;
            this.f53299 |= 4;
            onChanged();
        }
        if (c14619.m34909()) {
            C8976 c8976M34907 = c14619.m34907();
            C15722 c15722 = this.f53293;
            if (c15722 == null) {
                if ((this.f53299 & 8) == 0 || (c8976 = this.f53297) == null || c8976 == C8976.getDefaultInstance()) {
                    this.f53297 = c8976M34907;
                } else {
                    this.f53299 |= 8;
                    onChanged();
                    ((C6859) m40773().m37104()).m18546(c8976M34907);
                }
            } else {
                c15722.m37098(c8976M34907);
            }
            if (this.f53297 != null) {
                this.f53299 |= 8;
                onChanged();
            }
        }
        if (c14619.m34903()) {
            this.f53300 = c14619.m34905();
            this.f53299 |= 16;
            onChanged();
        }
        if (c14619.m34902()) {
            this.f53295 = c14619.m34908();
            this.f53299 |= 32;
            onChanged();
        }
        mergeUnknownFields(c14619.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40775(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.f53294 = abstractC7297.mo19566();
                            this.f53299 |= 1;
                        } else if (iMo19567 == 18) {
                            this.f53298 = abstractC7297.mo19566();
                            this.f53299 |= 2;
                        } else if (iMo19567 == 26) {
                            this.f53296 = abstractC7297.mo19566();
                            this.f53299 |= 4;
                        } else if (iMo19567 == 34) {
                            abstractC7297.mo19556(m40773().m37104(), c17798);
                            this.f53299 |= 8;
                        } else if (iMo19567 == 40) {
                            this.f53300 = abstractC7297.mo19571();
                            this.f53299 |= 16;
                        } else if (iMo19567 == 48) {
                            this.f53295 = abstractC7297.mo19571();
                            this.f53299 |= 32;
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
        C8976 defaultInstance;
        if ((this.f53299 & 8) == 0) {
            return true;
        }
        C15722 c15722 = this.f53293;
        if (c15722 == null) {
            defaultInstance = this.f53297;
            if (defaultInstance == null) {
                defaultInstance = C8976.getDefaultInstance();
            }
        } else {
            defaultInstance = (C8976) c15722.m37103();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m40773() {
        C8976 defaultInstance;
        C15722 c15722 = this.f53293;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f53297;
                if (defaultInstance == null) {
                    defaultInstance = C8976.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8976) c15722.m37103();
            }
            this.f53293 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f53297 = null;
        }
        return this.f53293;
    }
}
