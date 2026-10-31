package l;

/* JADX INFO: renamed from: l.ۡۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8792 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f26776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26777;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f26778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26779;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26780;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f26781;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C8792(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m22690();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m22690();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m22690();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m22690();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m22691(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m22691(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m22691(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m22691(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32233;
        c9766.m24773(C15846.class, C8792.class);
        return c9766;
    }

    public C8792() {
        this.f26781 = "";
        this.f26778 = "";
    }

    public C8792(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f26781 = "";
        this.f26778 = "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22690() {
        super.clear();
        this.f26780 = 0;
        this.f26779 = 0;
        this.f26781 = "";
        this.f26778 = "";
        this.f26776 = false;
        this.f26777 = false;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32215;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C15846.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C15846.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C15846 c15846BuildPartial = buildPartial();
        if (c15846BuildPartial.isInitialized()) {
            return c15846BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c15846BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C15846 c15846BuildPartial = buildPartial();
        if (c15846BuildPartial.isInitialized()) {
            return c15846BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c15846BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C15846 buildPartial() {
        int i = 0;
        C15846 c15846 = new C15846(this, 0);
        int i2 = this.f26780;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c15846.f48953 = this.f26779;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c15846.f48958 = this.f26781;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c15846.f48954 = this.f26778;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c15846.f48955 = this.f26776;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c15846.f48952 = this.f26777;
                i |= 16;
            }
            c15846.f48957 = i | c15846.f48957;
        }
        onBuilt();
        return c15846;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C15846) {
            m22692((C15846) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C15846) {
            m22692((C15846) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22692(C15846 c15846) {
        if (c15846 == C15846.getDefaultInstance()) {
            return;
        }
        if (c15846.m37515()) {
            this.f26779 = c15846.m37522();
            this.f26780 |= 1;
            onChanged();
        }
        if (c15846.m37520()) {
            this.f26781 = c15846.f48958;
            this.f26780 |= 2;
            onChanged();
        }
        if (c15846.hasType()) {
            this.f26778 = c15846.f48954;
            this.f26780 |= 4;
            onChanged();
        }
        if (c15846.m37521()) {
            this.f26776 = c15846.m37518();
            this.f26780 |= 8;
            onChanged();
        }
        if (c15846.m37516()) {
            this.f26777 = c15846.m37519();
            this.f26780 |= 16;
            onChanged();
        }
        mergeUnknownFields(c15846.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22691(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.f26779 = abstractC7297.mo19568();
                            this.f26780 |= 1;
                        } else if (iMo19567 == 18) {
                            this.f26781 = abstractC7297.mo19566();
                            this.f26780 |= 2;
                        } else if (iMo19567 == 26) {
                            this.f26778 = abstractC7297.mo19566();
                            this.f26780 |= 4;
                        } else if (iMo19567 == 40) {
                            this.f26776 = abstractC7297.mo19571();
                            this.f26780 |= 8;
                        } else if (iMo19567 == 48) {
                            this.f26777 = abstractC7297.mo19571();
                            this.f26780 |= 16;
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
}
