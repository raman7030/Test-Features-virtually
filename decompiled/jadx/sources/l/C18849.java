package l;

/* JADX INFO: renamed from: l.ᩴܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18849 extends AbstractC19916 implements InterfaceC5443 {
    public int bitField0_;
    public AbstractC5886 data_;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C18849(int i) {
        this();
    }

    public /* synthetic */ C18849(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable;
        c9766.m24773(C19555.class, C18849.class);
        return c9766;
    }

    public C18849() {
        this.data_ = AbstractC5886.f18080;
    }

    public C18849(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.data_ = AbstractC5886.f18080;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C18849 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.version_ = 0;
        this.data_ = AbstractC5886.f18080;
        this.unpaddedSignatureSize_ = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C19555 getDefaultInstanceForType() {
        return C19555.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C19555 build() {
        C19555 c19555BuildPartial = buildPartial();
        if (c19555BuildPartial.isInitialized()) {
            return c19555BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c19555BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C19555 buildPartial() {
        C19555 c19555 = new C19555(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c19555);
        }
        onBuilt();
        return c19555;
    }

    private void buildPartial0(C19555 c19555) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c19555.version_ = this.version_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c19555.data_ = this.data_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c19555.unpaddedSignatureSize_ = this.unpaddedSignatureSize_;
            i |= 4;
        }
        c19555.bitField0_ |= i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C18849 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C19555) {
            return mergeFrom((C19555) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C18849 mergeFrom(C19555 c19555) {
        if (c19555 == C19555.getDefaultInstance()) {
            return this;
        }
        if (c19555.hasVersion()) {
            setVersion(c19555.getVersion());
        }
        if (c19555.hasData()) {
            setData(c19555.getData());
        }
        if (c19555.hasUnpaddedSignatureSize()) {
            setUnpaddedSignatureSize(c19555.getUnpaddedSignatureSize());
        }
        mergeUnknownFields(c19555.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C18849 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.version_ = abstractC7297.mo19577();
                            this.bitField0_ |= 1;
                        } else if (iMo19567 == 18) {
                            this.data_ = abstractC7297.mo19566();
                            this.bitField0_ |= 2;
                        } else if (iMo19567 == 29) {
                            this.unpaddedSignatureSize_ = abstractC7297.mo19576();
                            this.bitField0_ |= 4;
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
        return this;
    }

    @Override // l.InterfaceC5443
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC5443
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Deprecated
    public C18849 setVersion(int i) {
        this.version_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Deprecated
    public C18849 clearVersion() {
        this.bitField0_ &= -2;
        this.version_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC5443
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC5443
    public AbstractC5886 getData() {
        return this.data_;
    }

    public C18849 setData(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.data_ = abstractC5886;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C18849 clearData() {
        this.bitField0_ &= -3;
        this.data_ = C19555.getDefaultInstance().getData();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC5443
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC5443
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
    }

    public C18849 setUnpaddedSignatureSize(int i) {
        this.unpaddedSignatureSize_ = i;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C18849 clearUnpaddedSignatureSize() {
        this.bitField0_ &= -5;
        this.unpaddedSignatureSize_ = 0;
        onChanged();
        return this;
    }
}
