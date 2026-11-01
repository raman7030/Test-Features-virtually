package p067l;

/* JADX INFO: renamed from: l.ᩴܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20283 extends AbstractC21296 implements InterfaceC7542 {
    public int bitField0_;
    public AbstractC7962 data_;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C20283(int i) {
        this();
    }

    public /* synthetic */ C20283(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68168x19c8add5;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68169x912b2f53;
        c11650.m26787(C20954.class, C20283.class);
        return c11650;
    }

    public C20283() {
        this.data_ = AbstractC7962.f20935;
    }

    public C20283(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.data_ = AbstractC7962.f20935;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C20283 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.version_ = 0;
        this.data_ = AbstractC7962.f20935;
        this.unpaddedSignatureSize_ = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68168x19c8add5;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C20954 getDefaultInstanceForType() {
        return C20954.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C20954 build() {
        C20954 c20954BuildPartial = buildPartial();
        if (c20954BuildPartial.isInitialized()) {
            return c20954BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c20954BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C20954 buildPartial() {
        C20954 c20954 = new C20954(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c20954);
        }
        onBuilt();
        return c20954;
    }

    private void buildPartial0(C20954 c20954) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c20954.version_ = this.version_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c20954.data_ = this.data_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c20954.unpaddedSignatureSize_ = this.unpaddedSignatureSize_;
            i |= 4;
        }
        c20954.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C20283 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C20954) {
            return mergeFrom((C20954) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C20283 mergeFrom(C20954 c20954) {
        if (c20954 == C20954.getDefaultInstance()) {
            return this;
        }
        if (c20954.hasVersion()) {
            setVersion(c20954.getVersion());
        }
        if (c20954.hasData()) {
            setData(c20954.getData());
        }
        if (c20954.hasUnpaddedSignatureSize()) {
            setUnpaddedSignatureSize(c20954.getUnpaddedSignatureSize());
        }
        mergeUnknownFields(c20954.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C20283 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.version_ = abstractC9303.mo21545();
                            this.bitField0_ |= 1;
                        } else if (iMo21535 == 18) {
                            this.data_ = abstractC9303.mo21534();
                            this.bitField0_ |= 2;
                        } else if (iMo21535 == 29) {
                            this.unpaddedSignatureSize_ = abstractC9303.mo21544();
                            this.bitField0_ |= 4;
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

    @Override // p067l.InterfaceC7542
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC7542
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Deprecated
    public C20283 setVersion(int i) {
        this.version_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Deprecated
    public C20283 clearVersion() {
        this.bitField0_ &= -2;
        this.version_ = 0;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC7542
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC7542
    public AbstractC7962 getData() {
        return this.data_;
    }

    public C20283 setData(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.data_ = abstractC7962;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C20283 clearData() {
        this.bitField0_ &= -3;
        this.data_ = C20954.getDefaultInstance().getData();
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC7542
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC7542
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
    }

    public C20283 setUnpaddedSignatureSize(int i) {
        this.unpaddedSignatureSize_ = i;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C20283 clearUnpaddedSignatureSize() {
        this.bitField0_ &= -5;
        this.unpaddedSignatureSize_ = 0;
        onChanged();
        return this;
    }
}
