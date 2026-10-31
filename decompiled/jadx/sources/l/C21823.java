package l;

/* JADX INFO: renamed from: l.᩸᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21823 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69909;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69910;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69911;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C21823(int i) {
        this();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m49190mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m49190mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m49190mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m49190mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32248;
        c9766.m24773(C22528.class, C21823.class);
        return c9766;
    }

    public C21823() {
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC9228 clear() {
        super.clear();
        this.f69910 = 0;
        this.f69909 = 0;
        this.f69911 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC14165 clear() {
        super.clear();
        this.f69910 = 0;
        this.f69909 = 0;
        this.f69911 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final AbstractC19916 clear() {
        super.clear();
        this.f69910 = 0;
        this.f69909 = 0;
        this.f69911 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final AbstractC20704 clear() {
        super.clear();
        this.f69910 = 0;
        this.f69909 = 0;
        this.f69911 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32256;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C22528.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C22528.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C22528 c22528BuildPartial = buildPartial();
        if (c22528BuildPartial.isInitialized()) {
            return c22528BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c22528BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C22528 c22528BuildPartial = buildPartial();
        if (c22528BuildPartial.isInitialized()) {
            return c22528BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c22528BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C22528 buildPartial() {
        int i = 0;
        C22528 c22528 = new C22528(this, 0);
        int i2 = this.f69910;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c22528.f72900 = this.f69909;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c22528.f72903 = this.f69911;
                i |= 2;
            }
            c22528.f72902 = i | c22528.f72902;
        }
        onBuilt();
        return c22528;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22528) {
            m49189((C22528) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22528) {
            m49189((C22528) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49189(C22528 c22528) {
        if (c22528 == C22528.getDefaultInstance()) {
            return;
        }
        if (c22528.m50526()) {
            this.f69909 = c22528.m50528();
            this.f69910 |= 1;
            onChanged();
        }
        if (c22528.m50527()) {
            this.f69911 = c22528.m50525();
            this.f69910 |= 2;
            onChanged();
        }
        mergeUnknownFields(c22528.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final void m49190mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.f69909 = abstractC7297.mo19568();
                            this.f69910 |= 1;
                        } else if (iMo19567 == 16) {
                            this.f69911 = abstractC7297.mo19568();
                            this.f69910 |= 2;
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
