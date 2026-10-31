package l;

/* JADX INFO: renamed from: l.۬۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12998 extends AbstractC19916 implements InterfaceC5943 {
    public int bitField0_;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C12998(int i) {
        this();
    }

    public /* synthetic */ C12998(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable;
        c9766.m24773(C12293.class, C12998.class);
        return c9766;
    }

    public C12998() {
    }

    public C12998(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C12998 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C12293 getDefaultInstanceForType() {
        return C12293.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C12293 build() {
        C12293 c12293BuildPartial = buildPartial();
        if (c12293BuildPartial.isInitialized()) {
            return c12293BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c12293BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C12293 buildPartial() {
        C12293 c12293 = new C12293(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c12293);
        }
        onBuilt();
        return c12293;
    }

    private void buildPartial0(C12293 c12293) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c12293.startBlock_ = this.startBlock_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c12293.numBlocks_ = this.numBlocks_;
            i |= 2;
        }
        c12293.bitField0_ |= i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C12998 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C12293) {
            return mergeFrom((C12293) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C12998 mergeFrom(C12293 c12293) {
        if (c12293 == C12293.getDefaultInstance()) {
            return this;
        }
        if (c12293.hasStartBlock()) {
            setStartBlock(c12293.getStartBlock());
        }
        if (c12293.hasNumBlocks()) {
            setNumBlocks(c12293.getNumBlocks());
        }
        mergeUnknownFields(c12293.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C12998 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.startBlock_ = abstractC7297.mo19578();
                            this.bitField0_ |= 1;
                        } else if (iMo19567 == 16) {
                            this.numBlocks_ = abstractC7297.mo19578();
                            this.bitField0_ |= 2;
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

    @Override // l.InterfaceC5943
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC5943
    public long getStartBlock() {
        return this.startBlock_;
    }

    public C12998 setStartBlock(long j) {
        this.startBlock_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C12998 clearStartBlock() {
        this.bitField0_ &= -2;
        this.startBlock_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC5943
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC5943
    public long getNumBlocks() {
        return this.numBlocks_;
    }

    public C12998 setNumBlocks(long j) {
        this.numBlocks_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C12998 clearNumBlocks() {
        this.bitField0_ &= -3;
        this.numBlocks_ = 0L;
        onChanged();
        return this;
    }
}
