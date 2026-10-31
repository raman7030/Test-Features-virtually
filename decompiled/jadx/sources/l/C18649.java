package l;

/* JADX INFO: renamed from: l.ᩴۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18649 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f58957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58958;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f58959;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C18649(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m43240();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m43240();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m43240();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m43240();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m43241(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m43241(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m43241(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m43241(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32272;
        c9766.m24773(C19355.class, C18649.class);
        return c9766;
    }

    public C18649() {
        this.f58959 = 0;
        this.f58957 = "";
    }

    public C18649(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f58959 = 0;
        this.f58957 = "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43240() {
        super.clear();
        this.f58958 = 0;
        this.f58959 = 0;
        this.f58957 = "";
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32242;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C19355.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C19355.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C19355 c19355BuildPartial = buildPartial();
        if (c19355BuildPartial.isInitialized()) {
            return c19355BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c19355BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C19355 c19355BuildPartial = buildPartial();
        if (c19355BuildPartial.isInitialized()) {
            return c19355BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c19355BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C19355 buildPartial() {
        int i = 0;
        C19355 c19355 = new C19355(this, 0);
        int i2 = this.f58958;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c19355.f62657 = this.f58959;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c19355.f62654 = this.f58957;
                i |= 2;
            }
            c19355.f62656 = i | c19355.f62656;
        }
        onBuilt();
        return c19355;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C19355) {
            m43242((C19355) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C19355) {
            m43242((C19355) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43242(C19355 c19355) {
        if (c19355 == C19355.getDefaultInstance()) {
            return;
        }
        if (c19355.m44582()) {
            EnumC3478 enumC3478M44580 = c19355.m44580();
            enumC3478M44580.getClass();
            this.f58958 |= 1;
            this.f58959 = enumC3478M44580.getNumber();
            onChanged();
        }
        if (c19355.m44581()) {
            this.f58957 = c19355.f62654;
            this.f58958 |= 2;
            onChanged();
        }
        mergeUnknownFields(c19355.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43241(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 18) {
                            this.f58957 = abstractC7297.mo19566();
                            this.f58958 |= 2;
                        } else if (iMo19567 == 24) {
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(iMo19560) == null) {
                                mergeUnknownVarintField(3, iMo19560);
                            } else {
                                this.f58959 = iMo19560;
                                this.f58958 |= 1;
                            }
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
