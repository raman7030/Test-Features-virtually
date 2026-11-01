package p067l;

/* JADX INFO: renamed from: l.ܿܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18941 extends AbstractC21296 implements InterfaceC8883 {
    public int bitField0_;
    public AbstractC7962 hash_;
    public long size_;

    public /* synthetic */ C18941(int i) {
        this();
    }

    public /* synthetic */ C18941(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68164x2a74025b;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68165xd7149dd9;
        c11650.m26787(C16258.class, C18941.class);
        return c11650;
    }

    public C18941() {
        this.hash_ = AbstractC7962.f20935;
    }

    public C18941(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.hash_ = AbstractC7962.f20935;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C18941 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.size_ = 0L;
        this.hash_ = AbstractC7962.f20935;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68164x2a74025b;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C16258 getDefaultInstanceForType() {
        return C16258.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C16258 build() {
        C16258 c16258BuildPartial = buildPartial();
        if (c16258BuildPartial.isInitialized()) {
            return c16258BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c16258BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C16258 buildPartial() {
        C16258 c16258 = new C16258(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c16258);
        }
        onBuilt();
        return c16258;
    }

    private void buildPartial0(C16258 c16258) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c16258.size_ = this.size_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c16258.hash_ = this.hash_;
            i |= 2;
        }
        c16258.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C18941 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C16258) {
            return mergeFrom((C16258) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C18941 mergeFrom(C16258 c16258) {
        if (c16258 == C16258.getDefaultInstance()) {
            return this;
        }
        if (c16258.hasSize()) {
            setSize(c16258.getSize());
        }
        if (c16258.hasHash()) {
            setHash(c16258.getHash());
        }
        mergeUnknownFields(c16258.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C18941 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.size_ = abstractC9303.mo21546();
                            this.bitField0_ |= 1;
                        } else if (iMo21535 == 18) {
                            this.hash_ = abstractC9303.mo21534();
                            this.bitField0_ |= 2;
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
        return this;
    }

    @Override // p067l.InterfaceC8883
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC8883
    public long getSize() {
        return this.size_;
    }

    public C18941 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C18941 clearSize() {
        this.bitField0_ &= -2;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC8883
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC8883
    public AbstractC7962 getHash() {
        return this.hash_;
    }

    public C18941 setHash(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.hash_ = abstractC7962;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C18941 clearHash() {
        this.bitField0_ &= -3;
        this.hash_ = C16258.getDefaultInstance().getHash();
        onChanged();
        return this;
    }
}
