package l;

/* JADX INFO: renamed from: l.۟֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7148 extends AbstractC19916 implements InterfaceC16526 {
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public Object packageName_;
    public long version_;

    public /* synthetic */ C7148(int i) {
        this();
    }

    public /* synthetic */ C7148(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable;
        c9766.m24773(C1710.class, C7148.class);
        return c9766;
    }

    public C7148() {
        this.packageName_ = "";
    }

    public C7148(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.packageName_ = "";
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C7148 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C1710 getDefaultInstanceForType() {
        return C1710.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C1710 build() {
        C1710 c1710BuildPartial = buildPartial();
        if (c1710BuildPartial.isInitialized()) {
            return c1710BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1710BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C1710 buildPartial() {
        C1710 c1710 = new C1710(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c1710);
        }
        onBuilt();
        return c1710;
    }

    private void buildPartial0(C1710 c1710) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c1710.packageName_ = this.packageName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c1710.version_ = this.version_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c1710.isCompressed_ = this.isCompressed_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c1710.decompressedSize_ = this.decompressedSize_;
            i |= 8;
        }
        c1710.bitField0_ |= i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C7148 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1710) {
            return mergeFrom((C1710) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C7148 mergeFrom(C1710 c1710) {
        if (c1710 == C1710.getDefaultInstance()) {
            return this;
        }
        if (c1710.hasPackageName()) {
            this.packageName_ = c1710.packageName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c1710.hasVersion()) {
            setVersion(c1710.getVersion());
        }
        if (c1710.hasIsCompressed()) {
            setIsCompressed(c1710.getIsCompressed());
        }
        if (c1710.hasDecompressedSize()) {
            setDecompressedSize(c1710.getDecompressedSize());
        }
        mergeUnknownFields(c1710.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C7148 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.packageName_ = abstractC7297.mo19566();
                            this.bitField0_ |= 1;
                        } else if (iMo19567 == 16) {
                            this.version_ = abstractC7297.mo19557();
                            this.bitField0_ |= 2;
                        } else if (iMo19567 == 24) {
                            this.isCompressed_ = abstractC7297.mo19571();
                            this.bitField0_ |= 4;
                        } else if (iMo19567 == 32) {
                            this.decompressedSize_ = abstractC7297.mo19557();
                            this.bitField0_ |= 8;
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

    @Override // l.InterfaceC16526
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC16526
    public String getPackageName() {
        Object obj = this.packageName_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String strM16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.packageName_ = strM16501;
            }
            return strM16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC16526
    public AbstractC5886 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.packageName_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    public C7148 setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C7148 clearPackageName() {
        this.packageName_ = C1710.getDefaultInstance().getPackageName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C7148 setPackageNameBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.packageName_ = abstractC5886;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16526
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC16526
    public long getVersion() {
        return this.version_;
    }

    public C7148 setVersion(long j) {
        this.version_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C7148 clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16526
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC16526
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    public C7148 setIsCompressed(boolean z) {
        this.isCompressed_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C7148 clearIsCompressed() {
        this.bitField0_ &= -5;
        this.isCompressed_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16526
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC16526
    public long getDecompressedSize() {
        return this.decompressedSize_;
    }

    public C7148 setDecompressedSize(long j) {
        this.decompressedSize_ = j;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C7148 clearDecompressedSize() {
        this.bitField0_ &= -9;
        this.decompressedSize_ = 0L;
        onChanged();
        return this;
    }
}
