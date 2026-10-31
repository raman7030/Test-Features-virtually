package l;

/* JADX INFO: renamed from: l.۟ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7380 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f22647;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f22648;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5969 f22649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f22650;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22651;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22652;

    public /* synthetic */ C7380(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32264;
        c9766.m24773(C1715.class, C7380.class);
        return c9766;
    }

    public C7380() {
        this.f22652 = 0;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m19836();
            m19835();
        }
    }

    public C7380(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f22652 = 0;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m19836();
            m19835();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19837() {
        super.clear();
        this.f22651 = 0;
        this.f22652 = 0;
        this.f22649 = null;
        C15722 c15722 = this.f22647;
        if (c15722 != null) {
            c15722.m37102();
            this.f22647 = null;
        }
        this.f22648 = null;
        C15722 c15723 = this.f22650;
        if (c15723 != null) {
            c15723.m37102();
            this.f22650 = null;
        }
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32270;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C1715.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C1715.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C1715 c1715BuildPartial = buildPartial();
        if (c1715BuildPartial.isInitialized()) {
            return c1715BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1715BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C1715 c1715BuildPartial = buildPartial();
        if (c1715BuildPartial.isInitialized()) {
            return c1715BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1715BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C1715 buildPartial() {
        C5969 c5969;
        C5969 c59610;
        int i = 0;
        C1715 c1715 = new C1715(this, 0);
        int i2 = this.f22651;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c1715.f5930 = this.f22652;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C15722 c15722 = this.f22647;
                if (c15722 == null) {
                    c59610 = this.f22649;
                } else {
                    c59610 = (C5969) c15722.m37099();
                }
                c1715.f5926 = c59610;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15722 c15723 = this.f22650;
                if (c15723 == null) {
                    c5969 = this.f22648;
                } else {
                    c5969 = (C5969) c15723.m37099();
                }
                c1715.f5928 = c5969;
                i |= 4;
            }
            c1715.f5929 = i | c1715.f5929;
        }
        onBuilt();
        return c1715;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1715) {
            m19838((C1715) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1715) {
            m19838((C1715) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19838(C1715 c1715) {
        C5969 c5969;
        C5969 c59610;
        if (c1715 == C1715.getDefaultInstance()) {
            return;
        }
        if (c1715.m5753()) {
            EnumC3478 enumC3478M5752 = c1715.m5752();
            enumC3478M5752.getClass();
            this.f22651 |= 1;
            this.f22652 = enumC3478M5752.getNumber();
            onChanged();
        }
        if (c1715.m5751()) {
            C5969 c5969M5754 = c1715.m5754();
            C15722 c15722 = this.f22647;
            if (c15722 == null) {
                if ((this.f22651 & 2) == 0 || (c59610 = this.f22649) == null || c59610 == C5969.getDefaultInstance()) {
                    this.f22649 = c5969M5754;
                } else {
                    this.f22651 |= 2;
                    onChanged();
                    ((C0324) m19836().m37104()).m1732(c5969M5754);
                }
            } else {
                c15722.m37098(c5969M5754);
            }
            if (this.f22649 != null) {
                this.f22651 |= 2;
                onChanged();
            }
        }
        if (c1715.m5755()) {
            C5969 c5969M5756 = c1715.m5756();
            C15722 c15723 = this.f22650;
            if (c15723 == null) {
                if ((this.f22651 & 4) == 0 || (c5969 = this.f22648) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f22648 = c5969M5756;
                } else {
                    this.f22651 |= 4;
                    onChanged();
                    ((C0324) m19835().m37104()).m1732(c5969M5756);
                }
            } else {
                c15723.m37098(c5969M5756);
            }
            if (this.f22648 != null) {
                this.f22651 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c1715.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19839(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 24) {
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(iMo19560) == null) {
                                mergeUnknownVarintField(3, iMo19560);
                            } else {
                                this.f22652 = iMo19560;
                                this.f22651 |= 1;
                            }
                        } else if (iMo19567 == 34) {
                            abstractC7297.mo19556(m19836().m37104(), c17798);
                            this.f22651 |= 2;
                        } else if (iMo19567 == 42) {
                            abstractC7297.mo19556(m19835().m37104(), c17798);
                            this.f22651 |= 4;
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
        C5969 defaultInstance;
        C5969 defaultInstance2;
        if ((this.f22651 & 2) != 0) {
            C15722 c15722 = this.f22647;
            if (c15722 == null) {
                defaultInstance2 = this.f22649;
                if (defaultInstance2 == null) {
                    defaultInstance2 = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance2 = (C5969) c15722.m37103();
            }
            if (!defaultInstance2.isInitialized()) {
                return false;
            }
        }
        if ((this.f22651 & 4) == 0) {
            return true;
        }
        C15722 c15723 = this.f22650;
        if (c15723 == null) {
            defaultInstance = this.f22648;
            if (defaultInstance == null) {
                defaultInstance = C5969.getDefaultInstance();
            }
        } else {
            defaultInstance = (C5969) c15723.m37103();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m19836() {
        C5969 defaultInstance;
        C15722 c15722 = this.f22647;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f22649;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f22647 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f22649 = null;
        }
        return this.f22647;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m19835() {
        C5969 defaultInstance;
        C15722 c15722 = this.f22650;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f22648;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f22650 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f22648 = null;
        }
        return this.f22650;
    }
}
