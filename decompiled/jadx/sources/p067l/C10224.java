package p067l;

/* JADX INFO: renamed from: l.۠ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10224 extends AbstractC21296 implements InterfaceC23635 {
    public boolean batchWrites_;
    public int bitField0_;
    public boolean threaded_;

    public /* synthetic */ C10224(int i) {
        this();
    }

    public /* synthetic */ C10224(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68172x668ec8f1;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68173x27226e6f;
        c11650.m26787(C16928.class, C10224.class);
        return c11650;
    }

    public C10224() {
    }

    public C10224(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C10224 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.threaded_ = false;
        this.batchWrites_ = false;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68172x668ec8f1;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C16928 getDefaultInstanceForType() {
        return C16928.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C16928 build() {
        C16928 c16928BuildPartial = buildPartial();
        if (c16928BuildPartial.isInitialized()) {
            return c16928BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c16928BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C16928 buildPartial() {
        C16928 c16928 = new C16928(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c16928);
        }
        onBuilt();
        return c16928;
    }

    private void buildPartial0(C16928 c16928) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c16928.threaded_ = this.threaded_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c16928.batchWrites_ = this.batchWrites_;
            i |= 2;
        }
        c16928.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C10224 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C16928) {
            return mergeFrom((C16928) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C10224 mergeFrom(C16928 c16928) {
        if (c16928 == C16928.getDefaultInstance()) {
            return this;
        }
        if (c16928.hasThreaded()) {
            setThreaded(c16928.getThreaded());
        }
        if (c16928.hasBatchWrites()) {
            setBatchWrites(c16928.getBatchWrites());
        }
        mergeUnknownFields(c16928.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C10224 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.threaded_ = abstractC9303.mo21539();
                            this.bitField0_ |= 1;
                        } else if (iMo21535 == 16) {
                            this.batchWrites_ = abstractC9303.mo21539();
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

    @Override // p067l.InterfaceC23635
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC23635
    public boolean getThreaded() {
        return this.threaded_;
    }

    public C10224 setThreaded(boolean z) {
        this.threaded_ = z;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C10224 clearThreaded() {
        this.bitField0_ &= -2;
        this.threaded_ = false;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC23635
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC23635
    public boolean getBatchWrites() {
        return this.batchWrites_;
    }

    public C10224 setBatchWrites(boolean z) {
        this.batchWrites_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C10224 clearBatchWrites() {
        this.bitField0_ &= -3;
        this.batchWrites_ = false;
        onChanged();
        return this;
    }
}
