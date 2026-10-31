package l;

/* JADX INFO: renamed from: l.ܰܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13913 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f41468;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41469;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f41470;

    public /* synthetic */ C13913(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m33322();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m33322();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m33322();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m33322();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m33323(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m33323(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m33323(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m33323(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32222;
        c9766.m24773(C7564.class, C13913.class);
        return c9766;
    }

    public C13913() {
        this.f41468 = "";
    }

    public C13913(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f41468 = "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33322() {
        super.clear();
        this.f41469 = 0;
        this.f41468 = "";
        this.f41470 = false;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32226;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C7564.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C7564.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C7564 c7564BuildPartial = buildPartial();
        if (c7564BuildPartial.isInitialized()) {
            return c7564BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c7564BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C7564 c7564BuildPartial = buildPartial();
        if (c7564BuildPartial.isInitialized()) {
            return c7564BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c7564BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C7564 buildPartial() {
        int i = 0;
        C7564 c7564 = new C7564(this, 0);
        int i2 = this.f41469;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c7564.f23356 = this.f41468;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c7564.f23359 = this.f41470;
                i |= 2;
            }
            c7564.f23358 = i | c7564.f23358;
        }
        onBuilt();
        return c7564;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C7564) {
            m33324((C7564) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C7564) {
            m33324((C7564) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33324(C7564 c7564) {
        if (c7564 == C7564.getDefaultInstance()) {
            return;
        }
        if (c7564.m20283()) {
            this.f41468 = c7564.f23356;
            this.f41469 |= 1;
            onChanged();
        }
        if (c7564.m20284()) {
            this.f41470 = c7564.m20282();
            this.f41469 |= 2;
            onChanged();
        }
        mergeUnknownFields(c7564.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33323(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.f41468 = abstractC7297.mo19566();
                            this.f41469 |= 1;
                        } else if (iMo19567 == 16) {
                            this.f41470 = abstractC7297.mo19571();
                            this.f41469 |= 2;
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
        int i = this.f41469;
        return ((i & 1) == 0 || (i & 2) == 0) ? false : true;
    }
}
