package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22876 extends AbstractC19916 implements InterfaceC16731 {
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC5886 dataSha256Hash_;
    public C14311 dstExtentsBuilder_;
    public List dstExtents_;
    public long dstLength_;
    public C14311 srcExtentsBuilder_;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC5886 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C22876(int i) {
        this();
    }

    public /* synthetic */ C22876(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable;
        c9766.m24773(C1915.class, C22876.class);
        return c9766;
    }

    public C22876() {
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.dataSha256Hash_ = abstractC5886;
        this.srcSha256Hash_ = abstractC5886;
    }

    public C22876(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.dataSha256Hash_ = abstractC5886;
        this.srcSha256Hash_ = abstractC5886;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C22876 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
        } else {
            this.srcExtents_ = null;
            c14311.m34169();
        }
        this.bitField0_ &= -9;
        this.srcLength_ = 0L;
        C14311 c14312 = this.dstExtentsBuilder_;
        if (c14312 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
        } else {
            this.dstExtents_ = null;
            c14312.m34169();
        }
        this.bitField0_ &= -33;
        this.dstLength_ = 0L;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.dataSha256Hash_ = abstractC5886;
        this.srcSha256Hash_ = abstractC5886;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C1915 getDefaultInstanceForType() {
        return C1915.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C1915 build() {
        C1915 c1915BuildPartial = buildPartial();
        if (c1915BuildPartial.isInitialized()) {
            return c1915BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1915BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C1915 buildPartial() {
        C1915 c1915 = new C1915(this);
        buildPartialRepeatedFields(c1915);
        if (this.bitField0_ != 0) {
            buildPartial0(c1915);
        }
        onBuilt();
        return c1915;
    }

    private void buildPartialRepeatedFields(C1915 c1915) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            if ((this.bitField0_ & 8) != 0) {
                this.srcExtents_ = C20195.unmodifiableList(this.srcExtents_);
                this.bitField0_ &= -9;
            }
            c1915.srcExtents_ = this.srcExtents_;
        } else {
            c1915.srcExtents_ = c14311.m34163();
        }
        C14311 c14312 = this.dstExtentsBuilder_;
        if (c14312 == null) {
            if ((this.bitField0_ & 32) != 0) {
                this.dstExtents_ = C20195.unmodifiableList(this.dstExtents_);
                this.bitField0_ &= -33;
            }
            c1915.dstExtents_ = this.dstExtents_;
            return;
        }
        c1915.dstExtents_ = c14312.m34163();
    }

    private void buildPartial0(C1915 c1915) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c1915.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c1915.dataOffset_ = this.dataOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c1915.dataLength_ = this.dataLength_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c1915.srcLength_ = this.srcLength_;
            i |= 8;
        }
        if ((i2 & 64) != 0) {
            c1915.dstLength_ = this.dstLength_;
            i |= 16;
        }
        if ((i2 & 128) != 0) {
            c1915.dataSha256Hash_ = this.dataSha256Hash_;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c1915.srcSha256Hash_ = this.srcSha256Hash_;
            i |= 64;
        }
        c1915.bitField0_ |= i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C22876 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1915) {
            return mergeFrom((C1915) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C22876 mergeFrom(C1915 c1915) {
        if (c1915 == C1915.getDefaultInstance()) {
            return this;
        }
        if (c1915.hasType()) {
            setType(c1915.getType());
        }
        if (c1915.hasDataOffset()) {
            setDataOffset(c1915.getDataOffset());
        }
        if (c1915.hasDataLength()) {
            setDataLength(c1915.getDataLength());
        }
        if (this.srcExtentsBuilder_ == null) {
            if (!c1915.srcExtents_.isEmpty()) {
                if (this.srcExtents_.isEmpty()) {
                    this.srcExtents_ = c1915.srcExtents_;
                    this.bitField0_ &= -9;
                } else {
                    ensureSrcExtentsIsMutable();
                    this.srcExtents_.addAll(c1915.srcExtents_);
                }
                onChanged();
            }
        } else if (!c1915.srcExtents_.isEmpty()) {
            if (this.srcExtentsBuilder_.m34174()) {
                this.srcExtentsBuilder_.m34172();
                this.srcExtentsBuilder_ = null;
                this.srcExtents_ = c1915.srcExtents_;
                this.bitField0_ &= -9;
                this.srcExtentsBuilder_ = AbstractC4121.alwaysUseFieldBuilders ? getSrcExtentsFieldBuilder() : null;
            } else {
                this.srcExtentsBuilder_.m34161(c1915.srcExtents_);
            }
        }
        if (c1915.hasSrcLength()) {
            setSrcLength(c1915.getSrcLength());
        }
        if (this.dstExtentsBuilder_ == null) {
            if (!c1915.dstExtents_.isEmpty()) {
                if (this.dstExtents_.isEmpty()) {
                    this.dstExtents_ = c1915.dstExtents_;
                    this.bitField0_ &= -33;
                } else {
                    ensureDstExtentsIsMutable();
                    this.dstExtents_.addAll(c1915.dstExtents_);
                }
                onChanged();
            }
        } else if (!c1915.dstExtents_.isEmpty()) {
            if (this.dstExtentsBuilder_.m34174()) {
                this.dstExtentsBuilder_.m34172();
                this.dstExtentsBuilder_ = null;
                this.dstExtents_ = c1915.dstExtents_;
                this.bitField0_ &= -33;
                this.dstExtentsBuilder_ = AbstractC4121.alwaysUseFieldBuilders ? getDstExtentsFieldBuilder() : null;
            } else {
                this.dstExtentsBuilder_.m34161(c1915.dstExtents_);
            }
        }
        if (c1915.hasDstLength()) {
            setDstLength(c1915.getDstLength());
        }
        if (c1915.hasDataSha256Hash()) {
            setDataSha256Hash(c1915.getDataSha256Hash());
        }
        if (c1915.hasSrcSha256Hash()) {
            setSrcSha256Hash(c1915.getSrcSha256Hash());
        }
        mergeUnknownFields(c1915.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return hasType();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C22876 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC7354.forNumber(iMo19560) == null) {
                                mergeUnknownVarintField(1, iMo19560);
                            } else {
                                this.type_ = iMo19560;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo19567 == 16) {
                            this.dataOffset_ = abstractC7297.mo19578();
                            this.bitField0_ |= 2;
                        } else if (iMo19567 == 24) {
                            this.dataLength_ = abstractC7297.mo19578();
                            this.bitField0_ |= 4;
                        } else if (iMo19567 == 34) {
                            C12293 c12293 = (C12293) abstractC7297.mo19552(C12293.parser(), c17798);
                            C14311 c14311 = this.srcExtentsBuilder_;
                            if (c14311 == null) {
                                ensureSrcExtentsIsMutable();
                                this.srcExtents_.add(c12293);
                            } else {
                                c14311.m34166(c12293);
                            }
                        } else if (iMo19567 == 40) {
                            this.srcLength_ = abstractC7297.mo19578();
                            this.bitField0_ |= 16;
                        } else if (iMo19567 == 50) {
                            C12293 c12294 = (C12293) abstractC7297.mo19552(C12293.parser(), c17798);
                            C14311 c14312 = this.dstExtentsBuilder_;
                            if (c14312 == null) {
                                ensureDstExtentsIsMutable();
                                this.dstExtents_.add(c12294);
                            } else {
                                c14312.m34166(c12294);
                            }
                        } else if (iMo19567 == 56) {
                            this.dstLength_ = abstractC7297.mo19578();
                            this.bitField0_ |= 64;
                        } else if (iMo19567 == 66) {
                            this.dataSha256Hash_ = abstractC7297.mo19566();
                            this.bitField0_ |= 128;
                        } else if (iMo19567 == 74) {
                            this.srcSha256Hash_ = abstractC7297.mo19566();
                            this.bitField0_ |= 256;
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

    @Override // l.InterfaceC16731
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC16731
    public EnumC7354 getType() {
        EnumC7354 enumC7354ForNumber = EnumC7354.forNumber(this.type_);
        return enumC7354ForNumber == null ? EnumC7354.REPLACE : enumC7354ForNumber;
    }

    public C22876 setType(EnumC7354 enumC7354) {
        enumC7354.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC7354.getNumber();
        onChanged();
        return this;
    }

    public C22876 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16731
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC16731
    public long getDataOffset() {
        return this.dataOffset_;
    }

    public C22876 setDataOffset(long j) {
        this.dataOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C22876 clearDataOffset() {
        this.bitField0_ &= -3;
        this.dataOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16731
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC16731
    public long getDataLength() {
        return this.dataLength_;
    }

    public C22876 setDataLength(long j) {
        this.dataLength_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C22876 clearDataLength() {
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

    @Override // l.InterfaceC16731
    public List getSrcExtentsList() {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.srcExtents_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC16731
    public int getSrcExtentsCount() {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            return this.srcExtents_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC16731
    public C12293 getSrcExtents(int i) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            return (C12293) this.srcExtents_.get(i);
        }
        return (C12293) c14311.m34164(i);
    }

    public C22876 setSrcExtents(int i, C12293 c12293) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            c12293.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c12293);
            onChanged();
            return this;
        }
        c14311.m34170(i, c12293);
        return this;
    }

    public C22876 setSrcExtents(int i, C12998 c12998) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c12998.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c12998.build());
        return this;
    }

    public C22876 addSrcExtents(C12293 c12293) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            c12293.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c12293);
            onChanged();
            return this;
        }
        c14311.m34166(c12293);
        return this;
    }

    public C22876 addSrcExtents(int i, C12293 c12293) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            c12293.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c12293);
            onChanged();
            return this;
        }
        c14311.m34165(i, c12293);
        return this;
    }

    public C22876 addSrcExtents(C12998 c12998) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c12998.build());
            onChanged();
            return this;
        }
        c14311.m34166(c12998.build());
        return this;
    }

    public C22876 addSrcExtents(int i, C12998 c12998) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c12998.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c12998.build());
        return this;
    }

    public C22876 addAllSrcExtents(Iterable iterable) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            ensureSrcExtentsIsMutable();
            AbstractC2359.m7667(iterable, this.srcExtents_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C22876 clearSrcExtents() {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C22876 removeSrcExtents(int i) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C12998 getSrcExtentsBuilder(int i) {
        return (C12998) getSrcExtentsFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC16731
    public InterfaceC5943 getSrcExtentsOrBuilder(int i) {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 == null) {
            return (InterfaceC5943) this.srcExtents_.get(i);
        }
        return (InterfaceC5943) c14311.m34168(i);
    }

    @Override // l.InterfaceC16731
    public List getSrcExtentsOrBuilderList() {
        C14311 c14311 = this.srcExtentsBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.srcExtents_);
    }

    public C12998 addSrcExtentsBuilder() {
        return (C12998) getSrcExtentsFieldBuilder().m34160(C12293.getDefaultInstance());
    }

    public C12998 addSrcExtentsBuilder(int i) {
        return (C12998) getSrcExtentsFieldBuilder().m34159(i, C12293.getDefaultInstance());
    }

    public List getSrcExtentsBuilderList() {
        return getSrcExtentsFieldBuilder().m34171();
    }

    private C14311 getSrcExtentsFieldBuilder() {
        if (this.srcExtentsBuilder_ == null) {
            this.srcExtentsBuilder_ = new C14311(this.srcExtents_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
            this.srcExtents_ = null;
        }
        return this.srcExtentsBuilder_;
    }

    @Override // l.InterfaceC16731
    public boolean hasSrcLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC16731
    public long getSrcLength() {
        return this.srcLength_;
    }

    public C22876 setSrcLength(long j) {
        this.srcLength_ = j;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C22876 clearSrcLength() {
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

    @Override // l.InterfaceC16731
    public List getDstExtentsList() {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.dstExtents_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC16731
    public int getDstExtentsCount() {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            return this.dstExtents_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC16731
    public C12293 getDstExtents(int i) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            return (C12293) this.dstExtents_.get(i);
        }
        return (C12293) c14311.m34164(i);
    }

    public C22876 setDstExtents(int i, C12293 c12293) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            c12293.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c12293);
            onChanged();
            return this;
        }
        c14311.m34170(i, c12293);
        return this;
    }

    public C22876 setDstExtents(int i, C12998 c12998) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c12998.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c12998.build());
        return this;
    }

    public C22876 addDstExtents(C12293 c12293) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            c12293.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c12293);
            onChanged();
            return this;
        }
        c14311.m34166(c12293);
        return this;
    }

    public C22876 addDstExtents(int i, C12293 c12293) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            c12293.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c12293);
            onChanged();
            return this;
        }
        c14311.m34165(i, c12293);
        return this;
    }

    public C22876 addDstExtents(C12998 c12998) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c12998.build());
            onChanged();
            return this;
        }
        c14311.m34166(c12998.build());
        return this;
    }

    public C22876 addDstExtents(int i, C12998 c12998) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c12998.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c12998.build());
        return this;
    }

    public C22876 addAllDstExtents(Iterable iterable) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            ensureDstExtentsIsMutable();
            AbstractC2359.m7667(iterable, this.dstExtents_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C22876 clearDstExtents() {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C22876 removeDstExtents(int i) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C12998 getDstExtentsBuilder(int i) {
        return (C12998) getDstExtentsFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC16731
    public InterfaceC5943 getDstExtentsOrBuilder(int i) {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 == null) {
            return (InterfaceC5943) this.dstExtents_.get(i);
        }
        return (InterfaceC5943) c14311.m34168(i);
    }

    @Override // l.InterfaceC16731
    public List getDstExtentsOrBuilderList() {
        C14311 c14311 = this.dstExtentsBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.dstExtents_);
    }

    public C12998 addDstExtentsBuilder() {
        return (C12998) getDstExtentsFieldBuilder().m34160(C12293.getDefaultInstance());
    }

    public C12998 addDstExtentsBuilder(int i) {
        return (C12998) getDstExtentsFieldBuilder().m34159(i, C12293.getDefaultInstance());
    }

    public List getDstExtentsBuilderList() {
        return getDstExtentsFieldBuilder().m34171();
    }

    private C14311 getDstExtentsFieldBuilder() {
        if (this.dstExtentsBuilder_ == null) {
            this.dstExtentsBuilder_ = new C14311(this.dstExtents_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
            this.dstExtents_ = null;
        }
        return this.dstExtentsBuilder_;
    }

    @Override // l.InterfaceC16731
    public boolean hasDstLength() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC16731
    public long getDstLength() {
        return this.dstLength_;
    }

    public C22876 setDstLength(long j) {
        this.dstLength_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C22876 clearDstLength() {
        this.bitField0_ &= -65;
        this.dstLength_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16731
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC16731
    public AbstractC5886 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    public C22876 setDataSha256Hash(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.dataSha256Hash_ = abstractC5886;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C22876 clearDataSha256Hash() {
        this.bitField0_ &= -129;
        this.dataSha256Hash_ = C1915.getDefaultInstance().getDataSha256Hash();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16731
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC16731
    public AbstractC5886 getSrcSha256Hash() {
        return this.srcSha256Hash_;
    }

    public C22876 setSrcSha256Hash(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.srcSha256Hash_ = abstractC5886;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C22876 clearSrcSha256Hash() {
        this.bitField0_ &= -257;
        this.srcSha256Hash_ = C1915.getDefaultInstance().getSrcSha256Hash();
        onChanged();
        return this;
    }
}
