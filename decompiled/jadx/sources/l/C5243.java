package l;

/* JADX INFO: renamed from: l.ۚۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5243 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f16425;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16426;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16427;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f16428;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f16429;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C5243(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m15128();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m15128();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m15128();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m15128();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m15130(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m15130(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m15130(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m15130(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32232;
        c9766.m24773(C1009.class, C5243.class);
        return c9766;
    }

    public C5243() {
        this.f16426 = 0;
        this.f16427 = 0;
        this.f16429 = "";
        this.f16425 = 0;
    }

    public C5243(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f16426 = 0;
        this.f16427 = 0;
        this.f16429 = "";
        this.f16425 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15128() {
        super.clear();
        this.f16428 = 0;
        this.f16426 = 0;
        this.f16427 = 0;
        this.f16429 = "";
        this.f16425 = 0;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32247;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C1009.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C1009.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C1009 c1009BuildPartial = buildPartial();
        if (c1009BuildPartial.isInitialized()) {
            return c1009BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1009BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C1009 c1009BuildPartial = buildPartial();
        if (c1009BuildPartial.isInitialized()) {
            return c1009BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1009BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C1009 buildPartial() {
        int i = 0;
        C1009 c1009 = new C1009(this, 0);
        int i2 = this.f16428;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c1009.f3727 = this.f16426;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c1009.f3729 = this.f16427;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c1009.f3731 = this.f16429;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c1009.f3726 = this.f16425;
                i |= 8;
            }
            c1009.f3730 = i | c1009.f3730;
        }
        onBuilt();
        return c1009;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1009) {
            m15129((C1009) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1009) {
            m15129((C1009) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15129(C1009 c1009) {
        if (c1009 == C1009.getDefaultInstance()) {
            return;
        }
        if (c1009.m3517()) {
            EnumC3478 enumC3478M3520 = c1009.m3520();
            enumC3478M3520.getClass();
            this.f16428 |= 1;
            this.f16426 = enumC3478M3520.getNumber();
            onChanged();
        }
        if (c1009.m3516()) {
            EnumC3478 enumC3478M3523 = c1009.m3523();
            enumC3478M3523.getClass();
            this.f16428 |= 2;
            this.f16427 = enumC3478M3523.getNumber();
            onChanged();
        }
        if (c1009.m3521()) {
            this.f16429 = c1009.f3731;
            this.f16428 |= 4;
            onChanged();
        }
        if (c1009.m3522()) {
            EnumC3478 enumC3478M3519 = c1009.m3519();
            enumC3478M3519.getClass();
            this.f16428 |= 8;
            this.f16425 = enumC3478M3519.getNumber();
            onChanged();
        }
        mergeUnknownFields(c1009.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15130(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(iMo19560) == null) {
                                mergeUnknownVarintField(1, iMo19560);
                            } else {
                                this.f16426 = iMo19560;
                                this.f16428 |= 1;
                            }
                        } else if (iMo19567 == 16) {
                            int iMo19561 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(iMo19561) == null) {
                                mergeUnknownVarintField(2, iMo19561);
                            } else {
                                this.f16427 = iMo19561;
                                this.f16428 |= 2;
                            }
                        } else if (iMo19567 == 26) {
                            this.f16429 = abstractC7297.mo19566();
                            this.f16428 |= 4;
                        } else if (iMo19567 == 32) {
                            int iMo19562 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(iMo19562) == null) {
                                mergeUnknownVarintField(4, iMo19562);
                            } else {
                                this.f16425 = iMo19562;
                                this.f16428 |= 8;
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
