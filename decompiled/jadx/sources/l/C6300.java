package l;

/* JADX INFO: renamed from: l.ۛ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6300 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19478;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f19479;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19480;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C6300(int i) {
        this();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m17341(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m17341(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m17341(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m17341(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32237;
        c9766.m24773(C11945.class, C6300.class);
        return c9766;
    }

    public C6300() {
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC9228 clear() {
        super.clear();
        this.f19479 = 0;
        this.f19478 = 0;
        this.f19480 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC14165 clear() {
        super.clear();
        this.f19479 = 0;
        this.f19478 = 0;
        this.f19480 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final AbstractC19916 clear() {
        super.clear();
        this.f19479 = 0;
        this.f19478 = 0;
        this.f19480 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final AbstractC20704 clear() {
        super.clear();
        this.f19479 = 0;
        this.f19478 = 0;
        this.f19480 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32266;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C11945.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C11945.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C11945 c11945BuildPartial = buildPartial();
        if (c11945BuildPartial.isInitialized()) {
            return c11945BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c11945BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C11945 c11945BuildPartial = buildPartial();
        if (c11945BuildPartial.isInitialized()) {
            return c11945BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c11945BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C11945 buildPartial() {
        int i = 0;
        C11945 c11945 = new C11945(this, 0);
        int i2 = this.f19479;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c11945.f35706 = this.f19478;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c11945.f35709 = this.f19480;
                i |= 2;
            }
            c11945.f35708 = i | c11945.f35708;
        }
        onBuilt();
        return c11945;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C11945) {
            m17342((C11945) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C11945) {
            m17342((C11945) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17342(C11945 c11945) {
        if (c11945 == C11945.getDefaultInstance()) {
            return;
        }
        if (c11945.m29136()) {
            this.f19478 = c11945.m29138();
            this.f19479 |= 1;
            onChanged();
        }
        if (c11945.m29137()) {
            this.f19480 = c11945.m29135();
            this.f19479 |= 2;
            onChanged();
        }
        mergeUnknownFields(c11945.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17341(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.f19478 = abstractC7297.mo19568();
                            this.f19479 |= 1;
                        } else if (iMo19567 == 16) {
                            this.f19480 = abstractC7297.mo19568();
                            this.f19479 |= 2;
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
