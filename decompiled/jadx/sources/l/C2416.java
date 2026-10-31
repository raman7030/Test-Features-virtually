package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C2416 extends AbstractC4121 implements InterfaceC18644 {
    public static final int APEX_INFO_FIELD_NUMBER = 17;
    public static final int BLOCK_SIZE_FIELD_NUMBER = 3;
    public static final C2416 DEFAULT_INSTANCE;
    public static final int DYNAMIC_PARTITION_METADATA_FIELD_NUMBER = 15;
    public static final int MAX_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MINOR_VERSION_FIELD_NUMBER = 12;
    public static final InterfaceC12050 PARSER;
    public static final int PARTIAL_UPDATE_FIELD_NUMBER = 16;
    public static final int PARTITIONS_FIELD_NUMBER = 13;
    public static final int SECURITY_PATCH_LEVEL_FIELD_NUMBER = 18;
    public static final int SIGNATURES_OFFSET_FIELD_NUMBER = 4;
    public static final int SIGNATURES_SIZE_FIELD_NUMBER = 5;
    public static final long serialVersionUID = 0;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C22171 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public byte memoizedIsInitialized;
    public int minorVersion_;
    public boolean partialUpdate_;
    public List partitions_;
    public volatile Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C2416(C15820 c15820) {
        this((AbstractC19916) c15820);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C2416.class.getName());
        DEFAULT_INSTANCE = new C2416();
        PARSER = new C8766();
    }

    public C2416(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        this.maxTimestamp_ = 0L;
        this.partialUpdate_ = false;
        this.securityPatchLevel_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public C2416() {
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

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable;
        c9766.m24773(C2416.class, C15820.class);
        return c9766;
    }

    @Override // l.InterfaceC18644
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC18644
    public int getBlockSize() {
        return this.blockSize_;
    }

    @Override // l.InterfaceC18644
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC18644
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    @Override // l.InterfaceC18644
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC18644
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    @Override // l.InterfaceC18644
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC18644
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    @Override // l.InterfaceC18644
    public List getPartitionsList() {
        return this.partitions_;
    }

    @Override // l.InterfaceC18644
    public List getPartitionsOrBuilderList() {
        return this.partitions_;
    }

    @Override // l.InterfaceC18644
    public int getPartitionsCount() {
        return this.partitions_.size();
    }

    @Override // l.InterfaceC18644
    public C8971 getPartitions(int i) {
        return (C8971) this.partitions_.get(i);
    }

    @Override // l.InterfaceC18644
    public InterfaceC2621 getPartitionsOrBuilder(int i) {
        return (InterfaceC2621) this.partitions_.get(i);
    }

    @Override // l.InterfaceC18644
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC18644
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    @Override // l.InterfaceC18644
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC18644
    public C22171 getDynamicPartitionMetadata() {
        C22171 c22171 = this.dynamicPartitionMetadata_;
        return c22171 == null ? C22171.getDefaultInstance() : c22171;
    }

    @Override // l.InterfaceC18644
    public InterfaceC4532 getDynamicPartitionMetadataOrBuilder() {
        C22171 c22171 = this.dynamicPartitionMetadata_;
        return c22171 == null ? C22171.getDefaultInstance() : c22171;
    }

    @Override // l.InterfaceC18644
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC18644
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    @Override // l.InterfaceC18644
    public List getApexInfoList() {
        return this.apexInfo_;
    }

    @Override // l.InterfaceC18644
    public List getApexInfoOrBuilderList() {
        return this.apexInfo_;
    }

    @Override // l.InterfaceC18644
    public int getApexInfoCount() {
        return this.apexInfo_.size();
    }

    @Override // l.InterfaceC18644
    public C1710 getApexInfo(int i) {
        return (C1710) this.apexInfo_.get(i);
    }

    @Override // l.InterfaceC18644
    public InterfaceC16526 getApexInfoOrBuilder(int i) {
        return (InterfaceC16526) this.apexInfo_.get(i);
    }

    @Override // l.InterfaceC18644
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC18644
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.securityPatchLevel_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC18644
    public AbstractC5886 getSecurityPatchLevelBytes() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.securityPatchLevel_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
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

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14766.mo35109(3, this.blockSize_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35102(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14766.mo35102(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14766.mo35109(12, this.minorVersion_);
        }
        for (int i = 0; i < this.partitions_.size(); i++) {
            abstractC14766.mo35104(13, (InterfaceC8522) this.partitions_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14766.mo35102(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14766.mo35104(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC14766.mo35093(16, this.partialUpdate_);
        }
        for (int i2 = 0; i2 < this.apexInfo_.size(); i2++) {
            abstractC14766.mo35104(17, (InterfaceC8522) this.apexInfo_.get(i2));
        }
        if ((this.bitField0_ & 128) != 0) {
            AbstractC4121.m12380(abstractC14766, 18, this.securityPatchLevel_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35084 = (this.bitField0_ & 1) != 0 ? AbstractC14766.m35084(3, this.blockSize_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35084 += AbstractC14766.m35081(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35084 += AbstractC14766.m35081(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35084 += AbstractC14766.m35084(12, this.minorVersion_);
        }
        for (int i2 = 0; i2 < this.partitions_.size(); i2++) {
            iM35084 += AbstractC14766.m35082(13, (InterfaceC8522) this.partitions_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM35084 += AbstractC14766.m35075(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM35084 += AbstractC14766.m35082(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            iM35084 += AbstractC14766.m35080(16);
        }
        for (int i3 = 0; i3 < this.apexInfo_.size(); i3++) {
            iM35084 += AbstractC14766.m35082(17, (InterfaceC8522) this.apexInfo_.get(i3));
        }
        if ((this.bitField0_ & 128) != 0) {
            iM35084 += AbstractC4121.m12365(18, this.securityPatchLevel_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35084;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2416)) {
            return super.equals(obj);
        }
        C2416 c2416 = (C2416) obj;
        if (hasBlockSize() != c2416.hasBlockSize()) {
            return false;
        }
        if ((hasBlockSize() && getBlockSize() != c2416.getBlockSize()) || hasSignaturesOffset() != c2416.hasSignaturesOffset()) {
            return false;
        }
        if ((hasSignaturesOffset() && getSignaturesOffset() != c2416.getSignaturesOffset()) || hasSignaturesSize() != c2416.hasSignaturesSize()) {
            return false;
        }
        if ((hasSignaturesSize() && getSignaturesSize() != c2416.getSignaturesSize()) || hasMinorVersion() != c2416.hasMinorVersion()) {
            return false;
        }
        if ((hasMinorVersion() && getMinorVersion() != c2416.getMinorVersion()) || !getPartitionsList().equals(c2416.getPartitionsList()) || hasMaxTimestamp() != c2416.hasMaxTimestamp()) {
            return false;
        }
        if ((hasMaxTimestamp() && getMaxTimestamp() != c2416.getMaxTimestamp()) || hasDynamicPartitionMetadata() != c2416.hasDynamicPartitionMetadata()) {
            return false;
        }
        if ((hasDynamicPartitionMetadata() && !getDynamicPartitionMetadata().equals(c2416.getDynamicPartitionMetadata())) || hasPartialUpdate() != c2416.hasPartialUpdate()) {
            return false;
        }
        if ((!hasPartialUpdate() || getPartialUpdate() == c2416.getPartialUpdate()) && getApexInfoList().equals(c2416.getApexInfoList()) && hasSecurityPatchLevel() == c2416.hasSecurityPatchLevel()) {
            return (!hasSecurityPatchLevel() || getSecurityPatchLevel().equals(c2416.getSecurityPatchLevel())) && getUnknownFields().equals(c2416.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasBlockSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + getBlockSize();
        }
        if (hasSignaturesOffset()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + C13997.m33480(getSignaturesOffset());
        }
        if (hasSignaturesSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + C13997.m33480(getSignaturesSize());
        }
        if (hasMinorVersion()) {
            iHashCode = C4153.m12551(iHashCode, 37, 12, 53) + getMinorVersion();
        }
        if (getPartitionsCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 13, 53) + getPartitionsList().hashCode();
        }
        if (hasMaxTimestamp()) {
            iHashCode = C4153.m12551(iHashCode, 37, 14, 53) + C13997.m33480(getMaxTimestamp());
        }
        if (hasDynamicPartitionMetadata()) {
            iHashCode = C4153.m12551(iHashCode, 37, 15, 53) + getDynamicPartitionMetadata().hashCode();
        }
        if (hasPartialUpdate()) {
            iHashCode = C4153.m12551(iHashCode, 37, 16, 53) + C13997.m33481(getPartialUpdate());
        }
        if (getApexInfoCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 17, 53) + getApexInfoList().hashCode();
        }
        if (hasSecurityPatchLevel()) {
            iHashCode = C4153.m12551(iHashCode, 37, 18, 53) + getSecurityPatchLevel().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2416 parseFrom(ByteBuffer byteBuffer) {
        return (C2416) PARSER.parseFrom(byteBuffer);
    }

    public static C2416 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C2416) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C2416 parseFrom(AbstractC5886 abstractC5886) {
        return (C2416) PARSER.parseFrom(abstractC5886);
    }

    public static C2416 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C2416) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C2416 parseFrom(byte[] bArr) {
        return (C2416) PARSER.parseFrom(bArr);
    }

    public static C2416 parseFrom(byte[] bArr, C17798 c17798) {
        return (C2416) PARSER.parseFrom(bArr, c17798);
    }

    public static C2416 parseFrom(InputStream inputStream) {
        return (C2416) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C2416 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C2416) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C2416 parseDelimitedFrom(InputStream inputStream) {
        return (C2416) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C2416 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C2416) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C2416 parseFrom(AbstractC7297 abstractC7297) {
        return (C2416) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C2416 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C2416) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C15820 newBuilderForType() {
        return newBuilder();
    }

    public static C15820 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C15820 newBuilder(C2416 c2416) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c2416);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C15820 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C15820(i) : new C15820(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C15820 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C15820(interfaceC9415, 0);
    }

    public static C2416 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC12050 parser() {
        return PARSER;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public InterfaceC12050 getParserForType() {
        return PARSER;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C2416 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
