package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8971 extends AbstractC4121 implements InterfaceC2621 {
    public static final C8971 DEFAULT_INSTANCE;
    public static final int ESTIMATE_COW_SIZE_FIELD_NUMBER = 19;
    public static final int ESTIMATE_OP_COUNT_MAX_FIELD_NUMBER = 20;
    public static final int FEC_DATA_EXTENT_FIELD_NUMBER = 14;
    public static final int FEC_EXTENT_FIELD_NUMBER = 15;
    public static final int FEC_ROOTS_FIELD_NUMBER = 16;
    public static final int FILESYSTEM_TYPE_FIELD_NUMBER = 4;
    public static final int HASH_TREE_ALGORITHM_FIELD_NUMBER = 12;
    public static final int HASH_TREE_DATA_EXTENT_FIELD_NUMBER = 10;
    public static final int HASH_TREE_EXTENT_FIELD_NUMBER = 11;
    public static final int HASH_TREE_SALT_FIELD_NUMBER = 13;
    public static final int MERGE_OPERATIONS_FIELD_NUMBER = 18;
    public static final int NEW_PARTITION_INFO_FIELD_NUMBER = 7;
    public static final int NEW_PARTITION_SIGNATURE_FIELD_NUMBER = 5;
    public static final int OLD_PARTITION_INFO_FIELD_NUMBER = 6;
    public static final int OPERATIONS_FIELD_NUMBER = 8;
    public static final InterfaceC12050 PARSER;
    public static final int PARTITION_NAME_FIELD_NUMBER = 1;
    public static final int POSTINSTALL_OPTIONAL_FIELD_NUMBER = 9;
    public static final int POSTINSTALL_PATH_FIELD_NUMBER = 3;
    public static final int RUN_POSTINSTALL_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 17;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C12293 fecDataExtent_;
    public C12293 fecExtent_;
    public int fecRoots_;
    public volatile Object filesystemType_;
    public volatile Object hashTreeAlgorithm_;
    public C12293 hashTreeDataExtent_;
    public C12293 hashTreeExtent_;
    public AbstractC5886 hashTreeSalt_;
    public byte memoizedIsInitialized;
    public List mergeOperations_;
    public C14614 newPartitionInfo_;
    public List newPartitionSignature_;
    public C14614 oldPartitionInfo_;
    public List operations_;
    public volatile Object partitionName_;
    public boolean postinstallOptional_;
    public volatile Object postinstallPath_;
    public boolean runPostinstall_;
    public volatile Object version_;

    public /* synthetic */ C8971(C9677 c9677) {
        this((AbstractC19916) c9677);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C8971.class.getName());
        DEFAULT_INSTANCE = new C8971();
        PARSER = new C20966();
    }

    public C8971(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC5886.f18080;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C8971() {
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.hashTreeSalt_ = abstractC5886;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = abstractC5886;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable;
        c9766.m24773(C8971.class, C9677.class);
        return c9766;
    }

    @Override // l.InterfaceC2621
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC2621
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.partitionName_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getPartitionNameBytes() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.partitionName_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC2621
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC2621
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    @Override // l.InterfaceC2621
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC2621
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.postinstallPath_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getPostinstallPathBytes() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.postinstallPath_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC2621
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC2621
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.filesystemType_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getFilesystemTypeBytes() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.filesystemType_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC2621
    public List getNewPartitionSignatureList() {
        return this.newPartitionSignature_;
    }

    @Override // l.InterfaceC2621
    public List getNewPartitionSignatureOrBuilderList() {
        return this.newPartitionSignature_;
    }

    @Override // l.InterfaceC2621
    public int getNewPartitionSignatureCount() {
        return this.newPartitionSignature_.size();
    }

    @Override // l.InterfaceC2621
    public C19555 getNewPartitionSignature(int i) {
        return (C19555) this.newPartitionSignature_.get(i);
    }

    @Override // l.InterfaceC2621
    public InterfaceC5443 getNewPartitionSignatureOrBuilder(int i) {
        return (InterfaceC5443) this.newPartitionSignature_.get(i);
    }

    @Override // l.InterfaceC2621
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC2621
    public C14614 getOldPartitionInfo() {
        C14614 c14614 = this.oldPartitionInfo_;
        return c14614 == null ? C14614.getDefaultInstance() : c14614;
    }

    @Override // l.InterfaceC2621
    public InterfaceC6854 getOldPartitionInfoOrBuilder() {
        C14614 c14614 = this.oldPartitionInfo_;
        return c14614 == null ? C14614.getDefaultInstance() : c14614;
    }

    @Override // l.InterfaceC2621
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC2621
    public C14614 getNewPartitionInfo() {
        C14614 c14614 = this.newPartitionInfo_;
        return c14614 == null ? C14614.getDefaultInstance() : c14614;
    }

    @Override // l.InterfaceC2621
    public InterfaceC6854 getNewPartitionInfoOrBuilder() {
        C14614 c14614 = this.newPartitionInfo_;
        return c14614 == null ? C14614.getDefaultInstance() : c14614;
    }

    @Override // l.InterfaceC2621
    public List getOperationsList() {
        return this.operations_;
    }

    @Override // l.InterfaceC2621
    public List getOperationsOrBuilderList() {
        return this.operations_;
    }

    @Override // l.InterfaceC2621
    public int getOperationsCount() {
        return this.operations_.size();
    }

    @Override // l.InterfaceC2621
    public C1915 getOperations(int i) {
        return (C1915) this.operations_.get(i);
    }

    @Override // l.InterfaceC2621
    public InterfaceC16731 getOperationsOrBuilder(int i) {
        return (InterfaceC16731) this.operations_.get(i);
    }

    @Override // l.InterfaceC2621
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC2621
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getHashTreeDataExtent() {
        C12293 c12293 = this.hashTreeDataExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getHashTreeDataExtentOrBuilder() {
        C12293 c12293 = this.hashTreeDataExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getHashTreeExtent() {
        C12293 c12293 = this.hashTreeExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getHashTreeExtentOrBuilder() {
        C12293 c12293 = this.hashTreeExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC2621
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.hashTreeAlgorithm_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getHashTreeAlgorithmBytes() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.hashTreeAlgorithm_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    @Override // l.InterfaceC2621
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getFecDataExtent() {
        C12293 c12293 = this.fecDataExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getFecDataExtentOrBuilder() {
        C12293 c12293 = this.fecDataExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public boolean hasFecExtent() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getFecExtent() {
        C12293 c12293 = this.fecExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getFecExtentOrBuilder() {
        C12293 c12293 = this.fecExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC2621
    public boolean hasFecRoots() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // l.InterfaceC2621
    public int getFecRoots() {
        return this.fecRoots_;
    }

    @Override // l.InterfaceC2621
    public boolean hasVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // l.InterfaceC2621
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.version_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.version_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC2621
    public List getMergeOperationsList() {
        return this.mergeOperations_;
    }

    @Override // l.InterfaceC2621
    public List getMergeOperationsOrBuilderList() {
        return this.mergeOperations_;
    }

    @Override // l.InterfaceC2621
    public int getMergeOperationsCount() {
        return this.mergeOperations_.size();
    }

    @Override // l.InterfaceC2621
    public C6649 getMergeOperations(int i) {
        return (C6649) this.mergeOperations_.get(i);
    }

    @Override // l.InterfaceC2621
    public InterfaceC9472 getMergeOperationsOrBuilder(int i) {
        return (InterfaceC9472) this.mergeOperations_.get(i);
    }

    @Override // l.InterfaceC2621
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // l.InterfaceC2621
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    @Override // l.InterfaceC2621
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // l.InterfaceC2621
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
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
        if (!hasPartitionName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getOperationsCount(); i++) {
            if (!getOperations(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.partitionName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35093(2, this.runPostinstall_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC4121.m12380(abstractC14766, 3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            AbstractC4121.m12380(abstractC14766, 4, this.filesystemType_);
        }
        for (int i = 0; i < this.newPartitionSignature_.size(); i++) {
            abstractC14766.mo35104(5, (InterfaceC8522) this.newPartitionSignature_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14766.mo35104(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14766.mo35104(7, getNewPartitionInfo());
        }
        for (int i2 = 0; i2 < this.operations_.size(); i2++) {
            abstractC14766.mo35104(8, (InterfaceC8522) this.operations_.get(i2));
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC14766.mo35093(9, this.postinstallOptional_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC14766.mo35104(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC14766.mo35104(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            AbstractC4121.m12380(abstractC14766, 12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC14766.mo35090(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            abstractC14766.mo35104(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            abstractC14766.mo35104(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            abstractC14766.mo35109(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            AbstractC4121.m12380(abstractC14766, 17, this.version_);
        }
        for (int i3 = 0; i3 < this.mergeOperations_.size(); i3++) {
            abstractC14766.mo35104(18, (InterfaceC8522) this.mergeOperations_.get(i3));
        }
        if ((this.bitField0_ & 32768) != 0) {
            abstractC14766.mo35102(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            abstractC14766.mo35102(20, this.estimateOpCountMax_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.bitField0_ & 1) != 0 ? AbstractC4121.m12365(1, this.partitionName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM12365 += AbstractC14766.m35080(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM12365 += AbstractC4121.m12365(3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM12365 += AbstractC4121.m12365(4, this.filesystemType_);
        }
        for (int i2 = 0; i2 < this.newPartitionSignature_.size(); i2++) {
            iM12365 += AbstractC14766.m35082(5, (InterfaceC8522) this.newPartitionSignature_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM12365 += AbstractC14766.m35082(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM12365 += AbstractC14766.m35082(7, getNewPartitionInfo());
        }
        for (int i3 = 0; i3 < this.operations_.size(); i3++) {
            iM12365 += AbstractC14766.m35082(8, (InterfaceC8522) this.operations_.get(i3));
        }
        if ((this.bitField0_ & 64) != 0) {
            iM12365 += AbstractC14766.m35080(9);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM12365 += AbstractC14766.m35082(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            iM12365 += AbstractC14766.m35082(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            iM12365 += AbstractC4121.m12365(12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM12365 += AbstractC14766.m35076(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            iM12365 += AbstractC14766.m35082(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            iM12365 += AbstractC14766.m35082(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            iM12365 += AbstractC14766.m35084(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            iM12365 += AbstractC4121.m12365(17, this.version_);
        }
        for (int i4 = 0; i4 < this.mergeOperations_.size(); i4++) {
            iM12365 += AbstractC14766.m35082(18, (InterfaceC8522) this.mergeOperations_.get(i4));
        }
        if ((this.bitField0_ & 32768) != 0) {
            iM12365 += AbstractC14766.m35081(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            iM12365 += AbstractC14766.m35081(20, this.estimateOpCountMax_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM12365;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8971)) {
            return super.equals(obj);
        }
        C8971 c8971 = (C8971) obj;
        if (hasPartitionName() != c8971.hasPartitionName()) {
            return false;
        }
        if ((hasPartitionName() && !getPartitionName().equals(c8971.getPartitionName())) || hasRunPostinstall() != c8971.hasRunPostinstall()) {
            return false;
        }
        if ((hasRunPostinstall() && getRunPostinstall() != c8971.getRunPostinstall()) || hasPostinstallPath() != c8971.hasPostinstallPath()) {
            return false;
        }
        if ((hasPostinstallPath() && !getPostinstallPath().equals(c8971.getPostinstallPath())) || hasFilesystemType() != c8971.hasFilesystemType()) {
            return false;
        }
        if ((hasFilesystemType() && !getFilesystemType().equals(c8971.getFilesystemType())) || !getNewPartitionSignatureList().equals(c8971.getNewPartitionSignatureList()) || hasOldPartitionInfo() != c8971.hasOldPartitionInfo()) {
            return false;
        }
        if ((hasOldPartitionInfo() && !getOldPartitionInfo().equals(c8971.getOldPartitionInfo())) || hasNewPartitionInfo() != c8971.hasNewPartitionInfo()) {
            return false;
        }
        if ((hasNewPartitionInfo() && !getNewPartitionInfo().equals(c8971.getNewPartitionInfo())) || !getOperationsList().equals(c8971.getOperationsList()) || hasPostinstallOptional() != c8971.hasPostinstallOptional()) {
            return false;
        }
        if ((hasPostinstallOptional() && getPostinstallOptional() != c8971.getPostinstallOptional()) || hasHashTreeDataExtent() != c8971.hasHashTreeDataExtent()) {
            return false;
        }
        if ((hasHashTreeDataExtent() && !getHashTreeDataExtent().equals(c8971.getHashTreeDataExtent())) || hasHashTreeExtent() != c8971.hasHashTreeExtent()) {
            return false;
        }
        if ((hasHashTreeExtent() && !getHashTreeExtent().equals(c8971.getHashTreeExtent())) || hasHashTreeAlgorithm() != c8971.hasHashTreeAlgorithm()) {
            return false;
        }
        if ((hasHashTreeAlgorithm() && !getHashTreeAlgorithm().equals(c8971.getHashTreeAlgorithm())) || hasHashTreeSalt() != c8971.hasHashTreeSalt()) {
            return false;
        }
        if ((hasHashTreeSalt() && !getHashTreeSalt().equals(c8971.getHashTreeSalt())) || hasFecDataExtent() != c8971.hasFecDataExtent()) {
            return false;
        }
        if ((hasFecDataExtent() && !getFecDataExtent().equals(c8971.getFecDataExtent())) || hasFecExtent() != c8971.hasFecExtent()) {
            return false;
        }
        if ((hasFecExtent() && !getFecExtent().equals(c8971.getFecExtent())) || hasFecRoots() != c8971.hasFecRoots()) {
            return false;
        }
        if ((hasFecRoots() && getFecRoots() != c8971.getFecRoots()) || hasVersion() != c8971.hasVersion()) {
            return false;
        }
        if ((hasVersion() && !getVersion().equals(c8971.getVersion())) || !getMergeOperationsList().equals(c8971.getMergeOperationsList()) || hasEstimateCowSize() != c8971.hasEstimateCowSize()) {
            return false;
        }
        if ((!hasEstimateCowSize() || getEstimateCowSize() == c8971.getEstimateCowSize()) && hasEstimateOpCountMax() == c8971.hasEstimateOpCountMax()) {
            return (!hasEstimateOpCountMax() || getEstimateOpCountMax() == c8971.getEstimateOpCountMax()) && getUnknownFields().equals(c8971.getUnknownFields());
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
        if (hasPartitionName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getPartitionName().hashCode();
        }
        if (hasRunPostinstall()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(getRunPostinstall());
        }
        if (hasPostinstallPath()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + getPostinstallPath().hashCode();
        }
        if (hasFilesystemType()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + getFilesystemType().hashCode();
        }
        if (getNewPartitionSignatureCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + getNewPartitionSignatureList().hashCode();
        }
        if (hasOldPartitionInfo()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + getOldPartitionInfo().hashCode();
        }
        if (hasNewPartitionInfo()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + getNewPartitionInfo().hashCode();
        }
        if (getOperationsCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 8, 53) + getOperationsList().hashCode();
        }
        if (hasPostinstallOptional()) {
            iHashCode = C4153.m12551(iHashCode, 37, 9, 53) + C13997.m33481(getPostinstallOptional());
        }
        if (hasHashTreeDataExtent()) {
            iHashCode = C4153.m12551(iHashCode, 37, 10, 53) + getHashTreeDataExtent().hashCode();
        }
        if (hasHashTreeExtent()) {
            iHashCode = C4153.m12551(iHashCode, 37, 11, 53) + getHashTreeExtent().hashCode();
        }
        if (hasHashTreeAlgorithm()) {
            iHashCode = C4153.m12551(iHashCode, 37, 12, 53) + getHashTreeAlgorithm().hashCode();
        }
        if (hasHashTreeSalt()) {
            iHashCode = C4153.m12551(iHashCode, 37, 13, 53) + getHashTreeSalt().hashCode();
        }
        if (hasFecDataExtent()) {
            iHashCode = C4153.m12551(iHashCode, 37, 14, 53) + getFecDataExtent().hashCode();
        }
        if (hasFecExtent()) {
            iHashCode = C4153.m12551(iHashCode, 37, 15, 53) + getFecExtent().hashCode();
        }
        if (hasFecRoots()) {
            iHashCode = C4153.m12551(iHashCode, 37, 16, 53) + getFecRoots();
        }
        if (hasVersion()) {
            iHashCode = C4153.m12551(iHashCode, 37, 17, 53) + getVersion().hashCode();
        }
        if (getMergeOperationsCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 18, 53) + getMergeOperationsList().hashCode();
        }
        if (hasEstimateCowSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 19, 53) + C13997.m33480(getEstimateCowSize());
        }
        if (hasEstimateOpCountMax()) {
            iHashCode = C4153.m12551(iHashCode, 37, 20, 53) + C13997.m33480(getEstimateOpCountMax());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8971 parseFrom(ByteBuffer byteBuffer) {
        return (C8971) PARSER.parseFrom(byteBuffer);
    }

    public static C8971 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C8971) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C8971 parseFrom(AbstractC5886 abstractC5886) {
        return (C8971) PARSER.parseFrom(abstractC5886);
    }

    public static C8971 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C8971) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C8971 parseFrom(byte[] bArr) {
        return (C8971) PARSER.parseFrom(bArr);
    }

    public static C8971 parseFrom(byte[] bArr, C17798 c17798) {
        return (C8971) PARSER.parseFrom(bArr, c17798);
    }

    public static C8971 parseFrom(InputStream inputStream) {
        return (C8971) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C8971 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C8971) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C8971 parseDelimitedFrom(InputStream inputStream) {
        return (C8971) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C8971 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C8971) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C8971 parseFrom(AbstractC7297 abstractC7297) {
        return (C8971) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C8971 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C8971) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C9677 newBuilderForType() {
        return newBuilder();
    }

    public static C9677 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C9677 newBuilder(C8971 c8971) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c8971);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C9677 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C9677(i) : new C9677(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C9677 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C9677(interfaceC9415, 0);
    }

    public static C8971 getDefaultInstance() {
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
    public C8971 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
