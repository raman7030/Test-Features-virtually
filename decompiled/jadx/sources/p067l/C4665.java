package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4665 extends AbstractC6285 implements InterfaceC20088 {
    public static final int APEX_INFO_FIELD_NUMBER = 17;
    public static final int BLOCK_SIZE_FIELD_NUMBER = 3;
    public static final C4665 DEFAULT_INSTANCE;
    public static final int DYNAMIC_PARTITION_METADATA_FIELD_NUMBER = 15;
    public static final int MAX_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MINOR_VERSION_FIELD_NUMBER = 12;
    public static final InterfaceC13820 PARSER;
    public static final int PARTIAL_UPDATE_FIELD_NUMBER = 16;
    public static final int PARTITIONS_FIELD_NUMBER = 13;
    public static final int SECURITY_PATCH_LEVEL_FIELD_NUMBER = 18;
    public static final int SIGNATURES_OFFSET_FIELD_NUMBER = 4;
    public static final int SIGNATURES_SIZE_FIELD_NUMBER = 5;
    public static final long serialVersionUID = 0;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C23440 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public byte memoizedIsInitialized;
    public int minorVersion_;
    public boolean partialUpdate_;
    public List partitions_;
    public volatile Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C4665(C17404 c17404) {
        this((AbstractC21296) c17404);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C4665.class.getName());
        DEFAULT_INSTANCE = new C4665();
        PARSER = new C10700();
    }

    public C4665(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        this.maxTimestamp_ = 0L;
        this.partialUpdate_ = false;
        this.securityPatchLevel_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4665() {
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        this.maxTimestamp_ = 0L;
        this.partialUpdate_ = false;
        this.securityPatchLevel_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
    }

    public static final C19244 getDescriptor() {
        return C21624.f68155xf6fef290;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68156x53da890e;
        c11650.m26787(C4665.class, C17404.class);
        return c11650;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC20088
    public int getBlockSize() {
        return this.blockSize_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC20088
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC20088
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC20088
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    @Override // p067l.InterfaceC20088
    public List getPartitionsList() {
        return this.partitions_;
    }

    @Override // p067l.InterfaceC20088
    public List getPartitionsOrBuilderList() {
        return this.partitions_;
    }

    @Override // p067l.InterfaceC20088
    public int getPartitionsCount() {
        return this.partitions_.size();
    }

    @Override // p067l.InterfaceC20088
    public C10895 getPartitions(int i) {
        return (C10895) this.partitions_.get(i);
    }

    @Override // p067l.InterfaceC20088
    public InterfaceC4860 getPartitionsOrBuilder(int i) {
        return (InterfaceC4860) this.partitions_.get(i);
    }

    @Override // p067l.InterfaceC20088
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p067l.InterfaceC20088
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC20088
    public C23440 getDynamicPartitionMetadata() {
        C23440 c23440 = this.dynamicPartitionMetadata_;
        return c23440 == null ? C23440.getDefaultInstance() : c23440;
    }

    @Override // p067l.InterfaceC20088
    public InterfaceC6676 getDynamicPartitionMetadataOrBuilder() {
        C23440 c23440 = this.dynamicPartitionMetadata_;
        return c23440 == null ? C23440.getDefaultInstance() : c23440;
    }

    @Override // p067l.InterfaceC20088
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC20088
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    @Override // p067l.InterfaceC20088
    public List getApexInfoList() {
        return this.apexInfo_;
    }

    @Override // p067l.InterfaceC20088
    public List getApexInfoOrBuilderList() {
        return this.apexInfo_;
    }

    @Override // p067l.InterfaceC20088
    public int getApexInfoCount() {
        return this.apexInfo_.size();
    }

    @Override // p067l.InterfaceC20088
    public C3994 getApexInfo(int i) {
        return (C3994) this.apexInfo_.get(i);
    }

    @Override // p067l.InterfaceC20088
    public InterfaceC18075 getApexInfoOrBuilder(int i) {
        return (InterfaceC18075) this.apexInfo_.get(i);
    }

    @Override // p067l.InterfaceC20088
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // p067l.InterfaceC20088
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.securityPatchLevel_ = strM18427;
        }
        return strM18427;
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

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getPartitionsCount(); i++) {
            if (!getPartitions(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasDynamicPartitionMetadata() && !getDynamicPartitionMetadata().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC16402.mo37256(3, this.blockSize_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37249(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC16402.mo37249(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC16402.mo37256(12, this.minorVersion_);
        }
        for (int i = 0; i < this.partitions_.size(); i++) {
            abstractC16402.mo37251(13, (InterfaceC10467) this.partitions_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC16402.mo37249(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC16402.mo37251(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC16402.mo37240(16, this.partialUpdate_);
        }
        for (int i2 = 0; i2 < this.apexInfo_.size(); i2++) {
            abstractC16402.mo37251(17, (InterfaceC10467) this.apexInfo_.get(i2));
        }
        if ((this.bitField0_ & 128) != 0) {
            AbstractC6285.m14269(abstractC16402, 18, this.securityPatchLevel_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37231 = (this.bitField0_ & 1) != 0 ? AbstractC16402.m37231(3, this.blockSize_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM37231 += AbstractC16402.m37228(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM37231 += AbstractC16402.m37228(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM37231 += AbstractC16402.m37231(12, this.minorVersion_);
        }
        for (int i2 = 0; i2 < this.partitions_.size(); i2++) {
            iM37231 += AbstractC16402.m37229(13, (InterfaceC10467) this.partitions_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM37231 += AbstractC16402.m37222(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM37231 += AbstractC16402.m37229(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            iM37231 += AbstractC16402.m37227(16);
        }
        for (int i3 = 0; i3 < this.apexInfo_.size(); i3++) {
            iM37231 += AbstractC16402.m37229(17, (InterfaceC10467) this.apexInfo_.get(i3));
        }
        if ((this.bitField0_ & 128) != 0) {
            iM37231 += AbstractC6285.m14254(18, this.securityPatchLevel_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37231;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4665)) {
            return super.equals(obj);
        }
        C4665 c4665 = (C4665) obj;
        if (hasBlockSize() != c4665.hasBlockSize()) {
            return false;
        }
        if ((hasBlockSize() && getBlockSize() != c4665.getBlockSize()) || hasSignaturesOffset() != c4665.hasSignaturesOffset()) {
            return false;
        }
        if ((hasSignaturesOffset() && getSignaturesOffset() != c4665.getSignaturesOffset()) || hasSignaturesSize() != c4665.hasSignaturesSize()) {
            return false;
        }
        if ((hasSignaturesSize() && getSignaturesSize() != c4665.getSignaturesSize()) || hasMinorVersion() != c4665.hasMinorVersion()) {
            return false;
        }
        if ((hasMinorVersion() && getMinorVersion() != c4665.getMinorVersion()) || !getPartitionsList().equals(c4665.getPartitionsList()) || hasMaxTimestamp() != c4665.hasMaxTimestamp()) {
            return false;
        }
        if ((hasMaxTimestamp() && getMaxTimestamp() != c4665.getMaxTimestamp()) || hasDynamicPartitionMetadata() != c4665.hasDynamicPartitionMetadata()) {
            return false;
        }
        if ((hasDynamicPartitionMetadata() && !getDynamicPartitionMetadata().equals(c4665.getDynamicPartitionMetadata())) || hasPartialUpdate() != c4665.hasPartialUpdate()) {
            return false;
        }
        if ((!hasPartialUpdate() || getPartialUpdate() == c4665.getPartialUpdate()) && getApexInfoList().equals(c4665.getApexInfoList()) && hasSecurityPatchLevel() == c4665.hasSecurityPatchLevel()) {
            return (!hasSecurityPatchLevel() || getSecurityPatchLevel().equals(c4665.getSecurityPatchLevel())) && getUnknownFields().equals(c4665.getUnknownFields());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasBlockSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + getBlockSize();
        }
        if (hasSignaturesOffset()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + C15671.m35600(getSignaturesOffset());
        }
        if (hasSignaturesSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + C15671.m35600(getSignaturesSize());
        }
        if (hasMinorVersion()) {
            iHashCode = C6316.m14441(iHashCode, 37, 12, 53) + getMinorVersion();
        }
        if (getPartitionsCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 13, 53) + getPartitionsList().hashCode();
        }
        if (hasMaxTimestamp()) {
            iHashCode = C6316.m14441(iHashCode, 37, 14, 53) + C15671.m35600(getMaxTimestamp());
        }
        if (hasDynamicPartitionMetadata()) {
            iHashCode = C6316.m14441(iHashCode, 37, 15, 53) + getDynamicPartitionMetadata().hashCode();
        }
        if (hasPartialUpdate()) {
            iHashCode = C6316.m14441(iHashCode, 37, 16, 53) + C15671.m35601(getPartialUpdate());
        }
        if (getApexInfoCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 17, 53) + getApexInfoList().hashCode();
        }
        if (hasSecurityPatchLevel()) {
            iHashCode = C6316.m14441(iHashCode, 37, 18, 53) + getSecurityPatchLevel().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4665 parseFrom(ByteBuffer byteBuffer) {
        return (C4665) PARSER.parseFrom(byteBuffer);
    }

    public static C4665 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C4665) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C4665 parseFrom(AbstractC7962 abstractC7962) {
        return (C4665) PARSER.parseFrom(abstractC7962);
    }

    public static C4665 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C4665) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C4665 parseFrom(byte[] bArr) {
        return (C4665) PARSER.parseFrom(bArr);
    }

    public static C4665 parseFrom(byte[] bArr, C19283 c19283) {
        return (C4665) PARSER.parseFrom(bArr, c19283);
    }

    public static C4665 parseFrom(InputStream inputStream) {
        return (C4665) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C4665 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C4665) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C4665 parseDelimitedFrom(InputStream inputStream) {
        return (C4665) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C4665 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C4665) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C4665 parseFrom(AbstractC9303 abstractC9303) {
        return (C4665) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C4665 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C4665) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C17404 newBuilderForType() {
        return newBuilder();
    }

    public static C17404 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C17404 newBuilder(C4665 c4665) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4665);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C17404 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C17404(i) : new C17404(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C17404 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C17404(interfaceC11316, 0);
    }

    public static C4665 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC13820 parser() {
        return PARSER;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public InterfaceC13820 getParserForType() {
        return PARSER;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C4665 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
