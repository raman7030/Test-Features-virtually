package p067l;

/* JADX INFO: renamed from: l.۬۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14722 extends AbstractC21296 implements InterfaceC8017 {
    public int bitField0_;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C14722(int i) {
        this();
    }

    public /* synthetic */ C14722(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public static final C19244 getDescriptor() {
        return C21624.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68161x568dabbd;
        c11650.m26787(C14052.class, C14722.class);
        return c11650;
    }

    public C14722() {
    }

    public C14722(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C14722 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C14052 getDefaultInstanceForType() {
        return C14052.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C14052 build() {
        C14052 c14052BuildPartial = buildPartial();
        if (c14052BuildPartial.isInitialized()) {
            return c14052BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c14052BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C14052 buildPartial() {
        C14052 c14052 = new C14052(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c14052);
        }
        onBuilt();
        return c14052;
    }

    private void buildPartial0(C14052 c14052) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c14052.startBlock_ = this.startBlock_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c14052.numBlocks_ = this.numBlocks_;
            i |= 2;
        }
        c14052.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C14722 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C14052) {
            return mergeFrom((C14052) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C14722 mergeFrom(C14052 c14052) {
        if (c14052 == C14052.getDefaultInstance()) {
            return this;
        }
        if (c14052.hasStartBlock()) {
            setStartBlock(c14052.getStartBlock());
        }
        if (c14052.hasNumBlocks()) {
            setNumBlocks(c14052.getNumBlocks());
        }
        mergeUnknownFields(c14052.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C14722 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.startBlock_ = abstractC9303.mo21546();
                            this.bitField0_ |= 1;
                        } else if (iMo21535 == 16) {
                            this.numBlocks_ = abstractC9303.mo21546();
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

    @Override // p067l.InterfaceC8017
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC8017
    public long getStartBlock() {
        return this.startBlock_;
    }

    public C14722 setStartBlock(long j) {
        this.startBlock_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C14722 clearStartBlock() {
        this.bitField0_ &= -2;
        this.startBlock_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC8017
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC8017
    public long getNumBlocks() {
        return this.numBlocks_;
    }

    public C14722 setNumBlocks(long j) {
        this.numBlocks_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C14722 clearNumBlocks() {
        this.bitField0_ &= -3;
        this.numBlocks_ = 0L;
        onChanged();
        return this;
    }
}
