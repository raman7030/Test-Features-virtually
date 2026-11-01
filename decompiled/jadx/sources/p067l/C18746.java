package p067l;

/* JADX INFO: renamed from: l.ܿ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18746 extends AbstractC21296 implements InterfaceC11371 {
    public int bitField0_;
    public C17310 dstExtentBuilder_;
    public C14052 dstExtent_;
    public C17310 srcExtentBuilder_;
    public C14052 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C18746(int i) {
        this();
    }

    public /* synthetic */ C18746(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68153x2ca282d9;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68154xfc71c057;
        c11650.m26787(C8688.class, C18746.class);
        return c11650;
    }

    public C18746() {
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    public C18746(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC6285.alwaysUseFieldBuilders) {
            getSrcExtentFieldBuilder();
            getDstExtentFieldBuilder();
        }
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C18746 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.srcExtent_ = null;
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.srcExtentBuilder_ = null;
        }
        this.dstExtent_ = null;
        C17310 c17311 = this.dstExtentBuilder_;
        if (c17311 != null) {
            c17311.m39271();
            this.dstExtentBuilder_ = null;
        }
        this.srcOffset_ = 0;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68153x2ca282d9;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C8688 getDefaultInstanceForType() {
        return C8688.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C8688 build() {
        C8688 c8688BuildPartial = buildPartial();
        if (c8688BuildPartial.isInitialized()) {
            return c8688BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c8688BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C8688 buildPartial() {
        C8688 c8688 = new C8688(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c8688);
        }
        onBuilt();
        return c8688;
    }

    private void buildPartial0(C8688 c8688) {
        int i;
        C14052 c14052;
        C14052 c14053;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c8688.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            C17310 c17310 = this.srcExtentBuilder_;
            if (c17310 == null) {
                c14053 = this.srcExtent_;
            } else {
                c14053 = (C14052) c17310.m39268();
            }
            c8688.srcExtent_ = c14053;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            C17310 c17311 = this.dstExtentBuilder_;
            if (c17311 == null) {
                c14052 = this.dstExtent_;
            } else {
                c14052 = (C14052) c17311.m39268();
            }
            c8688.dstExtent_ = c14052;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c8688.srcOffset_ = this.srcOffset_;
            i |= 8;
        }
        c8688.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C18746 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C8688) {
            return mergeFrom((C8688) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C18746 mergeFrom(C8688 c8688) {
        if (c8688 == C8688.getDefaultInstance()) {
            return this;
        }
        if (c8688.hasType()) {
            setType(c8688.getType());
        }
        if (c8688.hasSrcExtent()) {
            mergeSrcExtent(c8688.getSrcExtent());
        }
        if (c8688.hasDstExtent()) {
            mergeDstExtent(c8688.getDstExtent());
        }
        if (c8688.hasSrcOffset()) {
            setSrcOffset(c8688.getSrcOffset());
        }
        mergeUnknownFields(c8688.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C18746 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC24781.forNumber(iMo21528) == null) {
                                mergeUnknownVarintField(1, iMo21528);
                            } else {
                                this.type_ = iMo21528;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo21535 == 18) {
                            abstractC9303.mo21524(getSrcExtentFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 2;
                        } else if (iMo21535 == 26) {
                            abstractC9303.mo21524(getDstExtentFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 4;
                        } else if (iMo21535 == 32) {
                            this.srcOffset_ = abstractC9303.mo21545();
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

    @Override // p067l.InterfaceC11371
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC11371
    public EnumC24781 getType() {
        EnumC24781 enumC24781ForNumber = EnumC24781.forNumber(this.type_);
        return enumC24781ForNumber == null ? EnumC24781.COW_COPY : enumC24781ForNumber;
    }

    public C18746 setType(EnumC24781 enumC24781) {
        enumC24781.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC24781.getNumber();
        onChanged();
        return this;
    }

    public C18746 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC11371
    public C14052 getSrcExtent() {
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 == null) {
            C14052 c14052 = this.srcExtent_;
            return c14052 == null ? C14052.getDefaultInstance() : c14052;
        }
        return (C14052) c17310.m39272();
    }

    public C18746 setSrcExtent(C14052 c14052) {
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 == null) {
            c14052.getClass();
            this.srcExtent_ = c14052;
        } else {
            c17310.m39269(c14052);
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C18746 setSrcExtent(C14722 c14722) {
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 == null) {
            this.srcExtent_ = c14722.build();
        } else {
            c17310.m39269(c14722.build());
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C18746 mergeSrcExtent(C14052 c14052) {
        C14052 c14053;
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 2) != 0 && (c14053 = this.srcExtent_) != null && c14053 != C14052.getDefaultInstance()) {
                getSrcExtentBuilder().mergeFrom(c14052);
            } else {
                this.srcExtent_ = c14052;
            }
        } else {
            c17310.m39267(c14052);
        }
        if (this.srcExtent_ != null) {
            this.bitField0_ |= 2;
            onChanged();
        }
        return this;
    }

    public C18746 clearSrcExtent() {
        this.bitField0_ &= -3;
        this.srcExtent_ = null;
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.srcExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14722 getSrcExtentBuilder() {
        this.bitField0_ |= 2;
        onChanged();
        return (C14722) getSrcExtentFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC11371
    public InterfaceC8017 getSrcExtentOrBuilder() {
        C17310 c17310 = this.srcExtentBuilder_;
        if (c17310 != null) {
            return (InterfaceC8017) c17310.m39270();
        }
        C14052 c14052 = this.srcExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    private C17310 getSrcExtentFieldBuilder() {
        if (this.srcExtentBuilder_ == null) {
            this.srcExtentBuilder_ = new C17310(getSrcExtent(), getParentForChildren(), isClean());
            this.srcExtent_ = null;
        }
        return this.srcExtentBuilder_;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC11371
    public C14052 getDstExtent() {
        C17310 c17310 = this.dstExtentBuilder_;
        if (c17310 == null) {
            C14052 c14052 = this.dstExtent_;
            return c14052 == null ? C14052.getDefaultInstance() : c14052;
        }
        return (C14052) c17310.m39272();
    }

    public C18746 setDstExtent(C14052 c14052) {
        C17310 c17310 = this.dstExtentBuilder_;
        if (c17310 == null) {
            c14052.getClass();
            this.dstExtent_ = c14052;
        } else {
            c17310.m39269(c14052);
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C18746 setDstExtent(C14722 c14722) {
        C17310 c17310 = this.dstExtentBuilder_;
        if (c17310 == null) {
            this.dstExtent_ = c14722.build();
        } else {
            c17310.m39269(c14722.build());
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C18746 mergeDstExtent(C14052 c14052) {
        C14052 c14053;
        C17310 c17310 = this.dstExtentBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 4) != 0 && (c14053 = this.dstExtent_) != null && c14053 != C14052.getDefaultInstance()) {
                getDstExtentBuilder().mergeFrom(c14052);
            } else {
                this.dstExtent_ = c14052;
            }
        } else {
            c17310.m39267(c14052);
        }
        if (this.dstExtent_ != null) {
            this.bitField0_ |= 4;
            onChanged();
        }
        return this;
    }

    public C18746 clearDstExtent() {
        this.bitField0_ &= -5;
        this.dstExtent_ = null;
        C17310 c17310 = this.dstExtentBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.dstExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14722 getDstExtentBuilder() {
        this.bitField0_ |= 4;
        onChanged();
        return (C14722) getDstExtentFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC11371
    public InterfaceC8017 getDstExtentOrBuilder() {
        C17310 c17310 = this.dstExtentBuilder_;
        if (c17310 != null) {
            return (InterfaceC8017) c17310.m39270();
        }
        C14052 c14052 = this.dstExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    private C17310 getDstExtentFieldBuilder() {
        if (this.dstExtentBuilder_ == null) {
            this.dstExtentBuilder_ = new C17310(getDstExtent(), getParentForChildren(), isClean());
            this.dstExtent_ = null;
        }
        return this.dstExtentBuilder_;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC11371
    public int getSrcOffset() {
        return this.srcOffset_;
    }

    public C18746 setSrcOffset(int i) {
        this.srcOffset_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C18746 clearSrcOffset() {
        this.bitField0_ &= -9;
        this.srcOffset_ = 0;
        onChanged();
        return this;
    }
}
