package p067l;

/* JADX INFO: renamed from: l.۟֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9162 extends AbstractC21296 implements InterfaceC18075 {
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public Object packageName_;
    public long version_;

    public /* synthetic */ C9162(int i) {
        this();
    }

    public /* synthetic */ C9162(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68149xbbde3ff9;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68150x2f2e5d77;
        c11650.m26787(C3994.class, C9162.class);
        return c11650;
    }

    public C9162() {
        this.packageName_ = "";
    }

    public C9162(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.packageName_ = "";
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C9162 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68149xbbde3ff9;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C3994 getDefaultInstanceForType() {
        return C3994.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C3994 build() {
        C3994 c3994BuildPartial = buildPartial();
        if (c3994BuildPartial.isInitialized()) {
            return c3994BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3994BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C3994 buildPartial() {
        C3994 c3994 = new C3994(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c3994);
        }
        onBuilt();
        return c3994;
    }

    private void buildPartial0(C3994 c3994) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c3994.packageName_ = this.packageName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c3994.version_ = this.version_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c3994.isCompressed_ = this.isCompressed_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c3994.decompressedSize_ = this.decompressedSize_;
            i |= 8;
        }
        c3994.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C9162 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3994) {
            return mergeFrom((C3994) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C9162 mergeFrom(C3994 c3994) {
        if (c3994 == C3994.getDefaultInstance()) {
            return this;
        }
        if (c3994.hasPackageName()) {
            this.packageName_ = c3994.packageName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c3994.hasVersion()) {
            setVersion(c3994.getVersion());
        }
        if (c3994.hasIsCompressed()) {
            setIsCompressed(c3994.getIsCompressed());
        }
        if (c3994.hasDecompressedSize()) {
            setDecompressedSize(c3994.getDecompressedSize());
        }
        mergeUnknownFields(c3994.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C9162 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.packageName_ = abstractC9303.mo21534();
                            this.bitField0_ |= 1;
                        } else if (iMo21535 == 16) {
                            this.version_ = abstractC9303.mo21525();
                            this.bitField0_ |= 2;
                        } else if (iMo21535 == 24) {
                            this.isCompressed_ = abstractC9303.mo21539();
                            this.bitField0_ |= 4;
                        } else if (iMo21535 == 32) {
                            this.decompressedSize_ = abstractC9303.mo21525();
                            this.bitField0_ |= 8;
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

    @Override // p067l.InterfaceC18075
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC18075
    public String getPackageName() {
        Object obj = this.packageName_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.packageName_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC18075
    public AbstractC7962 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.packageName_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C9162 setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C9162 clearPackageName() {
        this.packageName_ = C3994.getDefaultInstance().getPackageName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C9162 setPackageNameBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.packageName_ = abstractC7962;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC18075
    public long getVersion() {
        return this.version_;
    }

    public C9162 setVersion(long j) {
        this.version_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C9162 clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC18075
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    public C9162 setIsCompressed(boolean z) {
        this.isCompressed_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C9162 clearIsCompressed() {
        this.bitField0_ &= -5;
        this.isCompressed_ = false;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC18075
    public long getDecompressedSize() {
        return this.decompressedSize_;
    }

    public C9162 setDecompressedSize(long j) {
        this.decompressedSize_ = j;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C9162 clearDecompressedSize() {
        this.bitField0_ &= -9;
        this.decompressedSize_ = 0L;
        onChanged();
        return this;
    }
}
