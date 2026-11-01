package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17404 extends AbstractC21296 implements InterfaceC20088 {
    public C15969 apexInfoBuilder_;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C17310 dynamicPartitionMetadataBuilder_;
    public C23440 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public int minorVersion_;
    public boolean partialUpdate_;
    public C15969 partitionsBuilder_;
    public List partitions_;
    public Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C17404(int i) {
        this();
    }

    public /* synthetic */ C17404(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    public static final C19244 getDescriptor() {
        return C21624.f68155xf6fef290;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68156x53da890e;
        c11650.m26787(C4665.class, C17404.class);
        return c11650;
    }

    public C17404() {
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    public C17404(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC6285.alwaysUseFieldBuilders) {
            getPartitionsFieldBuilder();
            getDynamicPartitionMetadataFieldBuilder();
            getApexInfoFieldBuilder();
        }
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C17404 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
        } else {
            this.partitions_ = null;
            c15969.m36302();
        }
        this.bitField0_ &= -17;
        this.maxTimestamp_ = 0L;
        this.dynamicPartitionMetadata_ = null;
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        this.partialUpdate_ = false;
        C15969 c159610 = this.apexInfoBuilder_;
        if (c159610 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
        } else {
            this.apexInfo_ = null;
            c159610.m36302();
        }
        this.bitField0_ &= -257;
        this.securityPatchLevel_ = "";
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68155xf6fef290;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C4665 getDefaultInstanceForType() {
        return C4665.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C4665 build() {
        C4665 c4665BuildPartial = buildPartial();
        if (c4665BuildPartial.isInitialized()) {
            return c4665BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c4665BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C4665 buildPartial() {
        C4665 c4665 = new C4665(this);
        buildPartialRepeatedFields(c4665);
        if (this.bitField0_ != 0) {
            buildPartial0(c4665);
        }
        onBuilt();
        return c4665;
    }

    private void buildPartialRepeatedFields(C4665 c4665) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.partitions_ = C21562.unmodifiableList(this.partitions_);
                this.bitField0_ &= -17;
            }
            c4665.partitions_ = this.partitions_;
        } else {
            c4665.partitions_ = c15969.m36296();
        }
        C15969 c159610 = this.apexInfoBuilder_;
        if (c159610 == null) {
            if ((this.bitField0_ & 256) != 0) {
                this.apexInfo_ = C21562.unmodifiableList(this.apexInfo_);
                this.bitField0_ &= -257;
            }
            c4665.apexInfo_ = this.apexInfo_;
            return;
        }
        c4665.apexInfo_ = c159610.m36296();
    }

    private void buildPartial0(C4665 c4665) {
        int i;
        C23440 c23440;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4665.blockSize_ = this.blockSize_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4665.signaturesOffset_ = this.signaturesOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c4665.signaturesSize_ = this.signaturesSize_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c4665.minorVersion_ = this.minorVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            c4665.maxTimestamp_ = this.maxTimestamp_;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
            if (c17310 == null) {
                c23440 = this.dynamicPartitionMetadata_;
            } else {
                c23440 = (C23440) c17310.m39268();
            }
            c4665.dynamicPartitionMetadata_ = c23440;
            i |= 32;
        }
        if ((i2 & 128) != 0) {
            c4665.partialUpdate_ = this.partialUpdate_;
            i |= 64;
        }
        if ((i2 & 512) != 0) {
            c4665.securityPatchLevel_ = this.securityPatchLevel_;
            i |= 128;
        }
        c4665.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C17404 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C4665) {
            return mergeFrom((C4665) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C17404 mergeFrom(C4665 c4665) {
        if (c4665 == C4665.getDefaultInstance()) {
            return this;
        }
        if (c4665.hasBlockSize()) {
            setBlockSize(c4665.getBlockSize());
        }
        if (c4665.hasSignaturesOffset()) {
            setSignaturesOffset(c4665.getSignaturesOffset());
        }
        if (c4665.hasSignaturesSize()) {
            setSignaturesSize(c4665.getSignaturesSize());
        }
        if (c4665.hasMinorVersion()) {
            setMinorVersion(c4665.getMinorVersion());
        }
        if (this.partitionsBuilder_ == null) {
            if (!c4665.partitions_.isEmpty()) {
                if (this.partitions_.isEmpty()) {
                    this.partitions_ = c4665.partitions_;
                    this.bitField0_ &= -17;
                } else {
                    ensurePartitionsIsMutable();
                    this.partitions_.addAll(c4665.partitions_);
                }
                onChanged();
            }
        } else if (!c4665.partitions_.isEmpty()) {
            if (this.partitionsBuilder_.m36307()) {
                this.partitionsBuilder_.m36305();
                this.partitionsBuilder_ = null;
                this.partitions_ = c4665.partitions_;
                this.bitField0_ &= -17;
                this.partitionsBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getPartitionsFieldBuilder() : null;
            } else {
                this.partitionsBuilder_.m36294(c4665.partitions_);
            }
        }
        if (c4665.hasMaxTimestamp()) {
            setMaxTimestamp(c4665.getMaxTimestamp());
        }
        if (c4665.hasDynamicPartitionMetadata()) {
            mergeDynamicPartitionMetadata(c4665.getDynamicPartitionMetadata());
        }
        if (c4665.hasPartialUpdate()) {
            setPartialUpdate(c4665.getPartialUpdate());
        }
        if (this.apexInfoBuilder_ == null) {
            if (!c4665.apexInfo_.isEmpty()) {
                if (this.apexInfo_.isEmpty()) {
                    this.apexInfo_ = c4665.apexInfo_;
                    this.bitField0_ &= -257;
                } else {
                    ensureApexInfoIsMutable();
                    this.apexInfo_.addAll(c4665.apexInfo_);
                }
                onChanged();
            }
        } else if (!c4665.apexInfo_.isEmpty()) {
            if (this.apexInfoBuilder_.m36307()) {
                this.apexInfoBuilder_.m36305();
                this.apexInfoBuilder_ = null;
                this.apexInfo_ = c4665.apexInfo_;
                this.bitField0_ &= -257;
                this.apexInfoBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getApexInfoFieldBuilder() : null;
            } else {
                this.apexInfoBuilder_.m36294(c4665.apexInfo_);
            }
        }
        if (c4665.hasSecurityPatchLevel()) {
            this.securityPatchLevel_ = c4665.securityPatchLevel_;
            this.bitField0_ |= 512;
            onChanged();
        }
        mergeUnknownFields(c4665.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        for (int i = 0; i < getPartitionsCount(); i++) {
            if (!getPartitions(i).isInitialized()) {
                return false;
            }
        }
        return !hasDynamicPartitionMetadata() || getDynamicPartitionMetadata().isInitialized();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C17404 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    switch (iMo21535) {
                        case 0:
                            break;
                        case 24:
                            this.blockSize_ = abstractC9303.mo21545();
                            this.bitField0_ |= 1;
                            continue;
                        case 32:
                            this.signaturesOffset_ = abstractC9303.mo21546();
                            this.bitField0_ |= 2;
                            continue;
                        case 40:
                            this.signaturesSize_ = abstractC9303.mo21546();
                            this.bitField0_ |= 4;
                            continue;
                        case 96:
                            this.minorVersion_ = abstractC9303.mo21545();
                            this.bitField0_ |= 8;
                            continue;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            C10895 c10895 = (C10895) abstractC9303.mo21520(C10895.parser(), c19283);
                            C15969 c15969 = this.partitionsBuilder_;
                            if (c15969 == null) {
                                ensurePartitionsIsMutable();
                                this.partitions_.add(c10895);
                            } else {
                                c15969.m36299(c10895);
                                continue;
                            }
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            this.maxTimestamp_ = abstractC9303.mo21525();
                            this.bitField0_ |= 32;
                            continue;
                        case 122:
                            abstractC9303.mo21524(getDynamicPartitionMetadataFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 64;
                            continue;
                        case 128:
                            this.partialUpdate_ = abstractC9303.mo21539();
                            this.bitField0_ |= 128;
                            continue;
                        case 138:
                            C3994 c3994 = (C3994) abstractC9303.mo21520(C3994.parser(), c19283);
                            C15969 c159610 = this.apexInfoBuilder_;
                            if (c159610 == null) {
                                ensureApexInfoIsMutable();
                                this.apexInfo_.add(c3994);
                            } else {
                                c159610.m36299(c3994);
                                continue;
                            }
                            break;
                        case 146:
                            this.securityPatchLevel_ = abstractC9303.mo21534();
                            this.bitField0_ |= 512;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
                                break;
                            }
                            break;
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

    @Override // p067l.InterfaceC20088
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC20088
    public int getBlockSize() {
        return this.blockSize_;
    }

    public C17404 setBlockSize(int i) {
        this.blockSize_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C17404 clearBlockSize() {
        this.bitField0_ &= -2;
        this.blockSize_ = 4096;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC20088
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    public C17404 setSignaturesOffset(long j) {
        this.signaturesOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C17404 clearSignaturesOffset() {
        this.bitField0_ &= -3;
        this.signaturesOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC20088
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    public C17404 setSignaturesSize(long j) {
        this.signaturesSize_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C17404 clearSignaturesSize() {
        this.bitField0_ &= -5;
        this.signaturesSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC20088
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    public C17404 setMinorVersion(int i) {
        this.minorVersion_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C17404 clearMinorVersion() {
        this.bitField0_ &= -9;
        this.minorVersion_ = 0;
        onChanged();
        return this;
    }

    private void ensurePartitionsIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.partitions_ = new ArrayList(this.partitions_);
            this.bitField0_ |= 16;
        }
    }

    @Override // p067l.InterfaceC20088
    public List getPartitionsList() {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.partitions_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC20088
    public int getPartitionsCount() {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            return this.partitions_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC20088
    public C10895 getPartitions(int i) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            return (C10895) this.partitions_.get(i);
        }
        return (C10895) c15969.m36297(i);
    }

    public C17404 setPartitions(int i, C10895 c10895) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            c10895.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c10895);
            onChanged();
            return this;
        }
        c15969.m36303(i, c10895);
        return this;
    }

    public C17404 setPartitions(int i, C11566 c11566) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c11566.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c11566.build());
        return this;
    }

    public C17404 addPartitions(C10895 c10895) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            c10895.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(c10895);
            onChanged();
            return this;
        }
        c15969.m36299(c10895);
        return this;
    }

    public C17404 addPartitions(int i, C10895 c10895) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            c10895.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c10895);
            onChanged();
            return this;
        }
        c15969.m36298(i, c10895);
        return this;
    }

    public C17404 addPartitions(C11566 c11566) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(c11566.build());
            onChanged();
            return this;
        }
        c15969.m36299(c11566.build());
        return this;
    }

    public C17404 addPartitions(int i, C11566 c11566) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c11566.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c11566.build());
        return this;
    }

    public C17404 addAllPartitions(Iterable iterable) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            ensurePartitionsIsMutable();
            AbstractC4610.m9738(iterable, this.partitions_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C17404 clearPartitions() {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C17404 removePartitions(int i) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C11566 getPartitionsBuilder(int i) {
        return (C11566) getPartitionsFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC20088
    public InterfaceC4860 getPartitionsOrBuilder(int i) {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 == null) {
            return (InterfaceC4860) this.partitions_.get(i);
        }
        return (InterfaceC4860) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC20088
    public List getPartitionsOrBuilderList() {
        C15969 c15969 = this.partitionsBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.partitions_);
    }

    public C11566 addPartitionsBuilder() {
        return (C11566) getPartitionsFieldBuilder().m36293(C10895.getDefaultInstance());
    }

    public C11566 addPartitionsBuilder(int i) {
        return (C11566) getPartitionsFieldBuilder().m36292(i, C10895.getDefaultInstance());
    }

    public List getPartitionsBuilderList() {
        return getPartitionsFieldBuilder().m36304();
    }

    private C15969 getPartitionsFieldBuilder() {
        if (this.partitionsBuilder_ == null) {
            this.partitionsBuilder_ = new C15969(this.partitions_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.partitions_ = null;
        }
        return this.partitionsBuilder_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC20088
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    public C17404 setMaxTimestamp(long j) {
        this.maxTimestamp_ = j;
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C17404 clearMaxTimestamp() {
        this.bitField0_ &= -33;
        this.maxTimestamp_ = 0L;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC20088
    public C23440 getDynamicPartitionMetadata() {
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 == null) {
            C23440 c23440 = this.dynamicPartitionMetadata_;
            return c23440 == null ? C23440.getDefaultInstance() : c23440;
        }
        return (C23440) c17310.m39272();
    }

    public C17404 setDynamicPartitionMetadata(C23440 c23440) {
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 == null) {
            c23440.getClass();
            this.dynamicPartitionMetadata_ = c23440;
        } else {
            c17310.m39269(c23440);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C17404 setDynamicPartitionMetadata(C22770 c22770) {
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 == null) {
            this.dynamicPartitionMetadata_ = c22770.build();
        } else {
            c17310.m39269(c22770.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C17404 mergeDynamicPartitionMetadata(C23440 c23440) {
        C23440 c23441;
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 64) != 0 && (c23441 = this.dynamicPartitionMetadata_) != null && c23441 != C23440.getDefaultInstance()) {
                getDynamicPartitionMetadataBuilder().mergeFrom(c23440);
            } else {
                this.dynamicPartitionMetadata_ = c23440;
            }
        } else {
            c17310.m39267(c23440);
        }
        if (this.dynamicPartitionMetadata_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C17404 clearDynamicPartitionMetadata() {
        this.bitField0_ &= -65;
        this.dynamicPartitionMetadata_ = null;
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C22770 getDynamicPartitionMetadataBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C22770) getDynamicPartitionMetadataFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC20088
    public InterfaceC6676 getDynamicPartitionMetadataOrBuilder() {
        C17310 c17310 = this.dynamicPartitionMetadataBuilder_;
        if (c17310 != null) {
            return (InterfaceC6676) c17310.m39270();
        }
        C23440 c23440 = this.dynamicPartitionMetadata_;
        return c23440 == null ? C23440.getDefaultInstance() : c23440;
    }

    private C17310 getDynamicPartitionMetadataFieldBuilder() {
        if (this.dynamicPartitionMetadataBuilder_ == null) {
            this.dynamicPartitionMetadataBuilder_ = new C17310(getDynamicPartitionMetadata(), getParentForChildren(), isClean());
            this.dynamicPartitionMetadata_ = null;
        }
        return this.dynamicPartitionMetadataBuilder_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // p067l.InterfaceC20088
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    public C17404 setPartialUpdate(boolean z) {
        this.partialUpdate_ = z;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C17404 clearPartialUpdate() {
        this.bitField0_ &= -129;
        this.partialUpdate_ = false;
        onChanged();
        return this;
    }

    private void ensureApexInfoIsMutable() {
        if ((this.bitField0_ & 256) == 0) {
            this.apexInfo_ = new ArrayList(this.apexInfo_);
            this.bitField0_ |= 256;
        }
    }

    @Override // p067l.InterfaceC20088
    public List getApexInfoList() {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.apexInfo_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC20088
    public int getApexInfoCount() {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            return this.apexInfo_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC20088
    public C3994 getApexInfo(int i) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            return (C3994) this.apexInfo_.get(i);
        }
        return (C3994) c15969.m36297(i);
    }

    public C17404 setApexInfo(int i, C3994 c3994) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            c3994.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c3994);
            onChanged();
            return this;
        }
        c15969.m36303(i, c3994);
        return this;
    }

    public C17404 setApexInfo(int i, C9162 c9162) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c9162.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c9162.build());
        return this;
    }

    public C17404 addApexInfo(C3994 c3994) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            c3994.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c3994);
            onChanged();
            return this;
        }
        c15969.m36299(c3994);
        return this;
    }

    public C17404 addApexInfo(int i, C3994 c3994) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            c3994.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c3994);
            onChanged();
            return this;
        }
        c15969.m36298(i, c3994);
        return this;
    }

    public C17404 addApexInfo(C9162 c9162) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c9162.build());
            onChanged();
            return this;
        }
        c15969.m36299(c9162.build());
        return this;
    }

    public C17404 addApexInfo(int i, C9162 c9162) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c9162.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c9162.build());
        return this;
    }

    public C17404 addAllApexInfo(Iterable iterable) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            ensureApexInfoIsMutable();
            AbstractC4610.m9738(iterable, this.apexInfo_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C17404 clearApexInfo() {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C17404 removeApexInfo(int i) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C9162 getApexInfoBuilder(int i) {
        return (C9162) getApexInfoFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC20088
    public InterfaceC18075 getApexInfoOrBuilder(int i) {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 == null) {
            return (InterfaceC18075) this.apexInfo_.get(i);
        }
        return (InterfaceC18075) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC20088
    public List getApexInfoOrBuilderList() {
        C15969 c15969 = this.apexInfoBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.apexInfo_);
    }

    public C9162 addApexInfoBuilder() {
        return (C9162) getApexInfoFieldBuilder().m36293(C3994.getDefaultInstance());
    }

    public C9162 addApexInfoBuilder(int i) {
        return (C9162) getApexInfoFieldBuilder().m36292(i, C3994.getDefaultInstance());
    }

    public List getApexInfoBuilderList() {
        return getApexInfoFieldBuilder().m36304();
    }

    private C15969 getApexInfoFieldBuilder() {
        if (this.apexInfoBuilder_ == null) {
            this.apexInfoBuilder_ = new C15969(this.apexInfo_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
            this.apexInfo_ = null;
        }
        return this.apexInfoBuilder_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // p067l.InterfaceC20088
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.securityPatchLevel_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC20088
    public AbstractC7962 getSecurityPatchLevelBytes() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.securityPatchLevel_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C17404 setSecurityPatchLevel(String str) {
        str.getClass();
        this.securityPatchLevel_ = str;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C17404 clearSecurityPatchLevel() {
        this.securityPatchLevel_ = C4665.getDefaultInstance().getSecurityPatchLevel();
        this.bitField0_ &= -513;
        onChanged();
        return this;
    }

    public C17404 setSecurityPatchLevelBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.securityPatchLevel_ = abstractC7962;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }
}
