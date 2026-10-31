package l;

/* JADX INFO: renamed from: l.۠ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8265 extends AbstractC19916 implements InterfaceC22376 {
    public boolean batchWrites_;
    public int bitField0_;
    public boolean threaded_;

    public /* synthetic */ C8265(int i) {
        this();
    }

    public /* synthetic */ C8265(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable;
        c9766.m24773(C15319.class, C8265.class);
        return c9766;
    }

    public C8265() {
    }

    public C8265(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C8265 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.threaded_ = false;
        this.batchWrites_ = false;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C15319 getDefaultInstanceForType() {
        return C15319.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C15319 build() {
        C15319 c15319BuildPartial = buildPartial();
        if (c15319BuildPartial.isInitialized()) {
            return c15319BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c15319BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C15319 buildPartial() {
        C15319 c15319 = new C15319(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c15319);
        }
        onBuilt();
        return c15319;
    }

    private void buildPartial0(C15319 c15319) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c15319.threaded_ = this.threaded_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c15319.batchWrites_ = this.batchWrites_;
            i |= 2;
        }
        c15319.bitField0_ |= i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C8265 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C15319) {
            return mergeFrom((C15319) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C8265 mergeFrom(C15319 c15319) {
        if (c15319 == C15319.getDefaultInstance()) {
            return this;
        }
        if (c15319.hasThreaded()) {
            setThreaded(c15319.getThreaded());
        }
        if (c15319.hasBatchWrites()) {
            setBatchWrites(c15319.getBatchWrites());
        }
        mergeUnknownFields(c15319.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C8265 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.threaded_ = abstractC7297.mo19571();
                            this.bitField0_ |= 1;
                        } else if (iMo19567 == 16) {
                            this.batchWrites_ = abstractC7297.mo19571();
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

    @Override // l.InterfaceC22376
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC22376
    public boolean getThreaded() {
        return this.threaded_;
    }

    public C8265 setThreaded(boolean z) {
        this.threaded_ = z;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C8265 clearThreaded() {
        this.bitField0_ &= -2;
        this.threaded_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC22376
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC22376
    public boolean getBatchWrites() {
        return this.batchWrites_;
    }

    public C8265 setBatchWrites(boolean z) {
        this.batchWrites_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C8265 clearBatchWrites() {
        this.bitField0_ &= -3;
        this.batchWrites_ = false;
        onChanged();
        return this;
    }
}
