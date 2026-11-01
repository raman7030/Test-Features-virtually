package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C24110 extends AbstractC21296 implements InterfaceC18270 {
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC7962 dataSha256Hash_;
    public C15969 dstExtentsBuilder_;
    public List dstExtents_;
    public long dstLength_;
    public C15969 srcExtentsBuilder_;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC7962 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C24110(int i) {
        this();
    }

    public /* synthetic */ C24110(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    public static final C19244 getDescriptor() {
        return C21624.f68162x3e2f7e5d;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68163x4e1cf7db;
        c11650.m26787(C4189.class, C24110.class);
        return c11650;
    }

    public C24110() {
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.dataSha256Hash_ = abstractC7962;
        this.srcSha256Hash_ = abstractC7962;
    }

    public C24110(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.dataSha256Hash_ = abstractC7962;
        this.srcSha256Hash_ = abstractC7962;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C24110 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
        } else {
            this.srcExtents_ = null;
            c15969.m36302();
        }
        this.bitField0_ &= -9;
        this.srcLength_ = 0L;
        C15969 c159610 = this.dstExtentsBuilder_;
        if (c159610 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
        } else {
            this.dstExtents_ = null;
            c159610.m36302();
        }
        this.bitField0_ &= -33;
        this.dstLength_ = 0L;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.dataSha256Hash_ = abstractC7962;
        this.srcSha256Hash_ = abstractC7962;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68162x3e2f7e5d;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C4189 getDefaultInstanceForType() {
        return C4189.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C4189 build() {
        C4189 c4189BuildPartial = buildPartial();
        if (c4189BuildPartial.isInitialized()) {
            return c4189BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c4189BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C4189 buildPartial() {
        C4189 c4189 = new C4189(this);
        buildPartialRepeatedFields(c4189);
        if (this.bitField0_ != 0) {
            buildPartial0(c4189);
        }
        onBuilt();
        return c4189;
    }

    private void buildPartialRepeatedFields(C4189 c4189) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            if ((this.bitField0_ & 8) != 0) {
                this.srcExtents_ = C21562.unmodifiableList(this.srcExtents_);
                this.bitField0_ &= -9;
            }
            c4189.srcExtents_ = this.srcExtents_;
        } else {
            c4189.srcExtents_ = c15969.m36296();
        }
        C15969 c159610 = this.dstExtentsBuilder_;
        if (c159610 == null) {
            if ((this.bitField0_ & 32) != 0) {
                this.dstExtents_ = C21562.unmodifiableList(this.dstExtents_);
                this.bitField0_ &= -33;
            }
            c4189.dstExtents_ = this.dstExtents_;
            return;
        }
        c4189.dstExtents_ = c159610.m36296();
    }

    private void buildPartial0(C4189 c4189) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4189.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4189.dataOffset_ = this.dataOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c4189.dataLength_ = this.dataLength_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c4189.srcLength_ = this.srcLength_;
            i |= 8;
        }
        if ((i2 & 64) != 0) {
            c4189.dstLength_ = this.dstLength_;
            i |= 16;
        }
        if ((i2 & 128) != 0) {
            c4189.dataSha256Hash_ = this.dataSha256Hash_;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c4189.srcSha256Hash_ = this.srcSha256Hash_;
            i |= 64;
        }
        c4189.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C24110 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C4189) {
            return mergeFrom((C4189) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C24110 mergeFrom(C4189 c4189) {
        if (c4189 == C4189.getDefaultInstance()) {
            return this;
        }
        if (c4189.hasType()) {
            setType(c4189.getType());
        }
        if (c4189.hasDataOffset()) {
            setDataOffset(c4189.getDataOffset());
        }
        if (c4189.hasDataLength()) {
            setDataLength(c4189.getDataLength());
        }
        if (this.srcExtentsBuilder_ == null) {
            if (!c4189.srcExtents_.isEmpty()) {
                if (this.srcExtents_.isEmpty()) {
                    this.srcExtents_ = c4189.srcExtents_;
                    this.bitField0_ &= -9;
                } else {
                    ensureSrcExtentsIsMutable();
                    this.srcExtents_.addAll(c4189.srcExtents_);
                }
                onChanged();
            }
        } else if (!c4189.srcExtents_.isEmpty()) {
            if (this.srcExtentsBuilder_.m36307()) {
                this.srcExtentsBuilder_.m36305();
                this.srcExtentsBuilder_ = null;
                this.srcExtents_ = c4189.srcExtents_;
                this.bitField0_ &= -9;
                this.srcExtentsBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getSrcExtentsFieldBuilder() : null;
            } else {
                this.srcExtentsBuilder_.m36294(c4189.srcExtents_);
            }
        }
        if (c4189.hasSrcLength()) {
            setSrcLength(c4189.getSrcLength());
        }
        if (this.dstExtentsBuilder_ == null) {
            if (!c4189.dstExtents_.isEmpty()) {
                if (this.dstExtents_.isEmpty()) {
                    this.dstExtents_ = c4189.dstExtents_;
                    this.bitField0_ &= -33;
                } else {
                    ensureDstExtentsIsMutable();
                    this.dstExtents_.addAll(c4189.dstExtents_);
                }
                onChanged();
            }
        } else if (!c4189.dstExtents_.isEmpty()) {
            if (this.dstExtentsBuilder_.m36307()) {
                this.dstExtentsBuilder_.m36305();
                this.dstExtentsBuilder_ = null;
                this.dstExtents_ = c4189.dstExtents_;
                this.bitField0_ &= -33;
                this.dstExtentsBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getDstExtentsFieldBuilder() : null;
            } else {
                this.dstExtentsBuilder_.m36294(c4189.dstExtents_);
            }
        }
        if (c4189.hasDstLength()) {
            setDstLength(c4189.getDstLength());
        }
        if (c4189.hasDataSha256Hash()) {
            setDataSha256Hash(c4189.getDataSha256Hash());
        }
        if (c4189.hasSrcSha256Hash()) {
            setSrcSha256Hash(c4189.getSrcSha256Hash());
        }
        mergeUnknownFields(c4189.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return hasType();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C24110 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC9358.forNumber(iMo21528) == null) {
                                mergeUnknownVarintField(1, iMo21528);
                            } else {
                                this.type_ = iMo21528;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo21535 == 16) {
                            this.dataOffset_ = abstractC9303.mo21546();
                            this.bitField0_ |= 2;
                        } else if (iMo21535 == 24) {
                            this.dataLength_ = abstractC9303.mo21546();
                            this.bitField0_ |= 4;
                        } else if (iMo21535 == 34) {
                            C14052 c14052 = (C14052) abstractC9303.mo21520(C14052.parser(), c19283);
                            C15969 c15969 = this.srcExtentsBuilder_;
                            if (c15969 == null) {
                                ensureSrcExtentsIsMutable();
                                this.srcExtents_.add(c14052);
                            } else {
                                c15969.m36299(c14052);
                            }
                        } else if (iMo21535 == 40) {
                            this.srcLength_ = abstractC9303.mo21546();
                            this.bitField0_ |= 16;
                        } else if (iMo21535 == 50) {
                            C14052 c14053 = (C14052) abstractC9303.mo21520(C14052.parser(), c19283);
                            C15969 c159610 = this.dstExtentsBuilder_;
                            if (c159610 == null) {
                                ensureDstExtentsIsMutable();
                                this.dstExtents_.add(c14053);
                            } else {
                                c159610.m36299(c14053);
                            }
                        } else if (iMo21535 == 56) {
                            this.dstLength_ = abstractC9303.mo21546();
                            this.bitField0_ |= 64;
                        } else if (iMo21535 == 66) {
                            this.dataSha256Hash_ = abstractC9303.mo21534();
                            this.bitField0_ |= 128;
                        } else if (iMo21535 == 74) {
                            this.srcSha256Hash_ = abstractC9303.mo21534();
                            this.bitField0_ |= 256;
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

    @Override // p067l.InterfaceC18270
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC18270
    public EnumC9358 getType() {
        EnumC9358 enumC9358ForNumber = EnumC9358.forNumber(this.type_);
        return enumC9358ForNumber == null ? EnumC9358.REPLACE : enumC9358ForNumber;
    }

    public C24110 setType(EnumC9358 enumC9358) {
        enumC9358.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC9358.getNumber();
        onChanged();
        return this;
    }

    public C24110 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getDataOffset() {
        return this.dataOffset_;
    }

    public C24110 setDataOffset(long j) {
        this.dataOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C24110 clearDataOffset() {
        this.bitField0_ &= -3;
        this.dataOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getDataLength() {
        return this.dataLength_;
    }

    public C24110 setDataLength(long j) {
        this.dataLength_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C24110 clearDataLength() {
        this.bitField0_ &= -5;
        this.dataLength_ = 0L;
        onChanged();
        return this;
    }

    private void ensureSrcExtentsIsMutable() {
        if ((this.bitField0_ & 8) == 0) {
            this.srcExtents_ = new ArrayList(this.srcExtents_);
            this.bitField0_ |= 8;
        }
    }

    @Override // p067l.InterfaceC18270
    public List getSrcExtentsList() {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.srcExtents_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC18270
    public int getSrcExtentsCount() {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            return this.srcExtents_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC18270
    public C14052 getSrcExtents(int i) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            return (C14052) this.srcExtents_.get(i);
        }
        return (C14052) c15969.m36297(i);
    }

    public C24110 setSrcExtents(int i, C14052 c14052) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            c14052.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c14052);
            onChanged();
            return this;
        }
        c15969.m36303(i, c14052);
        return this;
    }

    public C24110 setSrcExtents(int i, C14722 c14722) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c14722.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c14722.build());
        return this;
    }

    public C24110 addSrcExtents(C14052 c14052) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            c14052.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c14052);
            onChanged();
            return this;
        }
        c15969.m36299(c14052);
        return this;
    }

    public C24110 addSrcExtents(int i, C14052 c14052) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            c14052.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c14052);
            onChanged();
            return this;
        }
        c15969.m36298(i, c14052);
        return this;
    }

    public C24110 addSrcExtents(C14722 c14722) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c14722.build());
            onChanged();
            return this;
        }
        c15969.m36299(c14722.build());
        return this;
    }

    public C24110 addSrcExtents(int i, C14722 c14722) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c14722.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c14722.build());
        return this;
    }

    public C24110 addAllSrcExtents(Iterable iterable) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            ensureSrcExtentsIsMutable();
            AbstractC4610.m9738(iterable, this.srcExtents_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C24110 clearSrcExtents() {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C24110 removeSrcExtents(int i) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C14722 getSrcExtentsBuilder(int i) {
        return (C14722) getSrcExtentsFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC18270
    public InterfaceC8017 getSrcExtentsOrBuilder(int i) {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 == null) {
            return (InterfaceC8017) this.srcExtents_.get(i);
        }
        return (InterfaceC8017) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC18270
    public List getSrcExtentsOrBuilderList() {
        C15969 c15969 = this.srcExtentsBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.srcExtents_);
    }

    public C14722 addSrcExtentsBuilder() {
        return (C14722) getSrcExtentsFieldBuilder().m36293(C14052.getDefaultInstance());
    }

    public C14722 addSrcExtentsBuilder(int i) {
        return (C14722) getSrcExtentsFieldBuilder().m36292(i, C14052.getDefaultInstance());
    }

    public List getSrcExtentsBuilderList() {
        return getSrcExtentsFieldBuilder().m36304();
    }

    private C15969 getSrcExtentsFieldBuilder() {
        if (this.srcExtentsBuilder_ == null) {
            this.srcExtentsBuilder_ = new C15969(this.srcExtents_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
            this.srcExtents_ = null;
        }
        return this.srcExtentsBuilder_;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasSrcLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getSrcLength() {
        return this.srcLength_;
    }

    public C24110 setSrcLength(long j) {
        this.srcLength_ = j;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C24110 clearSrcLength() {
        this.bitField0_ &= -17;
        this.srcLength_ = 0L;
        onChanged();
        return this;
    }

    private void ensureDstExtentsIsMutable() {
        if ((this.bitField0_ & 32) == 0) {
            this.dstExtents_ = new ArrayList(this.dstExtents_);
            this.bitField0_ |= 32;
        }
    }

    @Override // p067l.InterfaceC18270
    public List getDstExtentsList() {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.dstExtents_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC18270
    public int getDstExtentsCount() {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            return this.dstExtents_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC18270
    public C14052 getDstExtents(int i) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            return (C14052) this.dstExtents_.get(i);
        }
        return (C14052) c15969.m36297(i);
    }

    public C24110 setDstExtents(int i, C14052 c14052) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            c14052.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c14052);
            onChanged();
            return this;
        }
        c15969.m36303(i, c14052);
        return this;
    }

    public C24110 setDstExtents(int i, C14722 c14722) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c14722.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c14722.build());
        return this;
    }

    public C24110 addDstExtents(C14052 c14052) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            c14052.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c14052);
            onChanged();
            return this;
        }
        c15969.m36299(c14052);
        return this;
    }

    public C24110 addDstExtents(int i, C14052 c14052) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            c14052.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c14052);
            onChanged();
            return this;
        }
        c15969.m36298(i, c14052);
        return this;
    }

    public C24110 addDstExtents(C14722 c14722) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c14722.build());
            onChanged();
            return this;
        }
        c15969.m36299(c14722.build());
        return this;
    }

    public C24110 addDstExtents(int i, C14722 c14722) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c14722.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c14722.build());
        return this;
    }

    public C24110 addAllDstExtents(Iterable iterable) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            ensureDstExtentsIsMutable();
            AbstractC4610.m9738(iterable, this.dstExtents_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C24110 clearDstExtents() {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C24110 removeDstExtents(int i) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C14722 getDstExtentsBuilder(int i) {
        return (C14722) getDstExtentsFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC18270
    public InterfaceC8017 getDstExtentsOrBuilder(int i) {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 == null) {
            return (InterfaceC8017) this.dstExtents_.get(i);
        }
        return (InterfaceC8017) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC18270
    public List getDstExtentsOrBuilderList() {
        C15969 c15969 = this.dstExtentsBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.dstExtents_);
    }

    public C14722 addDstExtentsBuilder() {
        return (C14722) getDstExtentsFieldBuilder().m36293(C14052.getDefaultInstance());
    }

    public C14722 addDstExtentsBuilder(int i) {
        return (C14722) getDstExtentsFieldBuilder().m36292(i, C14052.getDefaultInstance());
    }

    public List getDstExtentsBuilderList() {
        return getDstExtentsFieldBuilder().m36304();
    }

    private C15969 getDstExtentsFieldBuilder() {
        if (this.dstExtentsBuilder_ == null) {
            this.dstExtentsBuilder_ = new C15969(this.dstExtents_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
            this.dstExtents_ = null;
        }
        return this.dstExtentsBuilder_;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDstLength() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getDstLength() {
        return this.dstLength_;
    }

    public C24110 setDstLength(long j) {
        this.dstLength_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C24110 clearDstLength() {
        this.bitField0_ &= -65;
        this.dstLength_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // p067l.InterfaceC18270
    public AbstractC7962 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    public C24110 setDataSha256Hash(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.dataSha256Hash_ = abstractC7962;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C24110 clearDataSha256Hash() {
        this.bitField0_ &= -129;
        this.dataSha256Hash_ = C4189.getDefaultInstance().getDataSha256Hash();
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // p067l.InterfaceC18270
    public AbstractC7962 getSrcSha256Hash() {
        return this.srcSha256Hash_;
    }

    public C24110 setSrcSha256Hash(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.srcSha256Hash_ = abstractC7962;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C24110 clearSrcSha256Hash() {
        this.bitField0_ &= -257;
        this.srcSha256Hash_ = C4189.getDefaultInstance().getSrcSha256Hash();
        onChanged();
        return this;
    }
}
