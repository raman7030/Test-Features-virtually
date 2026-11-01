package p067l;

/* JADX INFO: renamed from: l.᩸᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23109 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩶ */
    public int f72618;

    /* JADX INFO: renamed from: ᩸ */
    public int f72619;

    /* JADX INFO: renamed from: ᩹ */
    public int f72620;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C23109(int i) {
        this();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m56552mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m56552mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m56552mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m56552mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35223;
        c11650.m26787(C23779.class, C23109.class);
        return c11650;
    }

    public C23109() {
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC11138 clear() {
        super.clear();
        this.f72619 = 0;
        this.f72618 = 0;
        this.f72620 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC15830 clear() {
        super.clear();
        this.f72619 = 0;
        this.f72618 = 0;
        this.f72620 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final AbstractC21296 clear() {
        super.clear();
        this.f72619 = 0;
        this.f72618 = 0;
        this.f72620 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final AbstractC22045 clear() {
        super.clear();
        this.f72619 = 0;
        this.f72618 = 0;
        this.f72620 = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35231;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C23779.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C23779.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C23779 c23779BuildPartial = buildPartial();
        if (c23779BuildPartial.isInitialized()) {
            return c23779BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c23779BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C23779 c23779BuildPartial = buildPartial();
        if (c23779BuildPartial.isInitialized()) {
            return c23779BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c23779BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C23779 buildPartial() {
        int i = 0;
        C23779 c23779 = new C23779(this, 0);
        int i2 = this.f72619;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c23779.f75627 = this.f72618;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c23779.f75630 = this.f72620;
                i |= 2;
            }
            c23779.f75629 = i | c23779.f75629;
        }
        onBuilt();
        return c23779;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C23779) {
            m51540((C23779) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C23779) {
            m51540((C23779) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51540(C23779 c23779) {
        if (c23779 == C23779.getDefaultInstance()) {
            return;
        }
        if (c23779.m52868()) {
            this.f72618 = c23779.m52870();
            this.f72619 |= 1;
            onChanged();
        }
        if (c23779.m52869()) {
            this.f72620 = c23779.m52867();
            this.f72619 |= 2;
            onChanged();
        }
        mergeUnknownFields(c23779.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final void m56552mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f72618 = abstractC9303.mo21536();
                            this.f72619 |= 1;
                        } else if (iMo21535 == 16) {
                            this.f72620 = abstractC9303.mo21536();
                            this.f72619 |= 2;
                        } else if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
                        }
                    }
                    z = true;
                } catch (C4293 e) {
                    throw e.m8712();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }
}
