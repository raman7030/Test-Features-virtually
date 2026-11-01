package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10895 extends AbstractC6285 implements InterfaceC4860 {
    public static final C10895 DEFAULT_INSTANCE;
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
    public static final InterfaceC13820 PARSER;
    public static final int PARTITION_NAME_FIELD_NUMBER = 1;
    public static final int POSTINSTALL_OPTIONAL_FIELD_NUMBER = 9;
    public static final int POSTINSTALL_PATH_FIELD_NUMBER = 3;
    public static final int RUN_POSTINSTALL_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 17;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C14052 fecDataExtent_;
    public C14052 fecExtent_;
    public int fecRoots_;
    public volatile Object filesystemType_;
    public volatile Object hashTreeAlgorithm_;
    public C14052 hashTreeDataExtent_;
    public C14052 hashTreeExtent_;
    public AbstractC7962 hashTreeSalt_;
    public byte memoizedIsInitialized;
    public List mergeOperations_;
    public C16258 newPartitionInfo_;
    public List newPartitionSignature_;
    public C16258 oldPartitionInfo_;
    public List operations_;
    public volatile Object partitionName_;
    public boolean postinstallOptional_;
    public volatile Object postinstallPath_;
    public boolean runPostinstall_;
    public volatile Object version_;

    public /* synthetic */ C10895(C11566 c11566) {
        this((AbstractC21296) c11566);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C10895.class.getName());
        DEFAULT_INSTANCE = new C10895();
        PARSER = new C22295();
    }

    public C10895(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC7962.f20935;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C10895() {
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.hashTreeSalt_ = abstractC7962;
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
        this.hashTreeSalt_ = abstractC7962;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68166xfb5a5ca0;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68167x6772e31e;
        c11650.m26787(C10895.class, C11566.class);
        return c11650;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.partitionName_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getPartitionNameBytes() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.partitionName_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC4860
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.postinstallPath_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getPostinstallPathBytes() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.postinstallPath_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.filesystemType_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getFilesystemTypeBytes() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.filesystemType_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC4860
    public List getNewPartitionSignatureList() {
        return this.newPartitionSignature_;
    }

    @Override // p067l.InterfaceC4860
    public List getNewPartitionSignatureOrBuilderList() {
        return this.newPartitionSignature_;
    }

    @Override // p067l.InterfaceC4860
    public int getNewPartitionSignatureCount() {
        return this.newPartitionSignature_.size();
    }

    @Override // p067l.InterfaceC4860
    public C20954 getNewPartitionSignature(int i) {
        return (C20954) this.newPartitionSignature_.get(i);
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC7542 getNewPartitionSignatureOrBuilder(int i) {
        return (InterfaceC7542) this.newPartitionSignature_.get(i);
    }

    @Override // p067l.InterfaceC4860
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C16258 getOldPartitionInfo() {
        C16258 c16258 = this.oldPartitionInfo_;
        return c16258 == null ? C16258.getDefaultInstance() : c16258;
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8883 getOldPartitionInfoOrBuilder() {
        C16258 c16258 = this.oldPartitionInfo_;
        return c16258 == null ? C16258.getDefaultInstance() : c16258;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C16258 getNewPartitionInfo() {
        C16258 c16258 = this.newPartitionInfo_;
        return c16258 == null ? C16258.getDefaultInstance() : c16258;
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8883 getNewPartitionInfoOrBuilder() {
        C16258 c16258 = this.newPartitionInfo_;
        return c16258 == null ? C16258.getDefaultInstance() : c16258;
    }

    @Override // p067l.InterfaceC4860
    public List getOperationsList() {
        return this.operations_;
    }

    @Override // p067l.InterfaceC4860
    public List getOperationsOrBuilderList() {
        return this.operations_;
    }

    @Override // p067l.InterfaceC4860
    public int getOperationsCount() {
        return this.operations_.size();
    }

    @Override // p067l.InterfaceC4860
    public C4189 getOperations(int i) {
        return (C4189) this.operations_.get(i);
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC18270 getOperationsOrBuilder(int i) {
        return (InterfaceC18270) this.operations_.get(i);
    }

    @Override // p067l.InterfaceC4860
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC4860
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getHashTreeDataExtent() {
        C14052 c14052 = this.hashTreeDataExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getHashTreeDataExtentOrBuilder() {
        C14052 c14052 = this.hashTreeDataExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getHashTreeExtent() {
        C14052 c14052 = this.hashTreeExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getHashTreeExtentOrBuilder() {
        C14052 c14052 = this.hashTreeExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.hashTreeAlgorithm_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getHashTreeAlgorithmBytes() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.hashTreeAlgorithm_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getFecDataExtent() {
        C14052 c14052 = this.fecDataExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getFecDataExtentOrBuilder() {
        C14052 c14052 = this.fecDataExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFecExtent() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // p067l.InterfaceC4860
    public C14052 getFecExtent() {
        C14052 c14052 = this.fecExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC8017 getFecExtentOrBuilder() {
        C14052 c14052 = this.fecExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasFecRoots() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // p067l.InterfaceC4860
    public int getFecRoots() {
        return this.fecRoots_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // p067l.InterfaceC4860
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.version_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC4860
    public AbstractC7962 getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.version_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC4860
    public List getMergeOperationsList() {
        return this.mergeOperations_;
    }

    @Override // p067l.InterfaceC4860
    public List getMergeOperationsOrBuilderList() {
        return this.mergeOperations_;
    }

    @Override // p067l.InterfaceC4860
    public int getMergeOperationsCount() {
        return this.mergeOperations_.size();
    }

    @Override // p067l.InterfaceC4860
    public C8688 getMergeOperations(int i) {
        return (C8688) this.mergeOperations_.get(i);
    }

    @Override // p067l.InterfaceC4860
    public InterfaceC11371 getMergeOperationsOrBuilder(int i) {
        return (InterfaceC11371) this.mergeOperations_.get(i);
    }

    @Override // p067l.InterfaceC4860
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // p067l.InterfaceC4860
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    @Override // p067l.InterfaceC4860
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // p067l.InterfaceC4860
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
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

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.partitionName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37240(2, this.runPostinstall_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC6285.m14269(abstractC16402, 3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            AbstractC6285.m14269(abstractC16402, 4, this.filesystemType_);
        }
        for (int i = 0; i < this.newPartitionSignature_.size(); i++) {
            abstractC16402.mo37251(5, (InterfaceC10467) this.newPartitionSignature_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC16402.mo37251(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC16402.mo37251(7, getNewPartitionInfo());
        }
        for (int i2 = 0; i2 < this.operations_.size(); i2++) {
            abstractC16402.mo37251(8, (InterfaceC10467) this.operations_.get(i2));
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC16402.mo37240(9, this.postinstallOptional_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC16402.mo37251(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC16402.mo37251(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            AbstractC6285.m14269(abstractC16402, 12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC16402.mo37237(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            abstractC16402.mo37251(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            abstractC16402.mo37251(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            abstractC16402.mo37256(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            AbstractC6285.m14269(abstractC16402, 17, this.version_);
        }
        for (int i3 = 0; i3 < this.mergeOperations_.size(); i3++) {
            abstractC16402.mo37251(18, (InterfaceC10467) this.mergeOperations_.get(i3));
        }
        if ((this.bitField0_ & 32768) != 0) {
            abstractC16402.mo37249(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            abstractC16402.mo37249(20, this.estimateOpCountMax_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.bitField0_ & 1) != 0 ? AbstractC6285.m14254(1, this.partitionName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM14254 += AbstractC16402.m37227(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM14254 += AbstractC6285.m14254(3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM14254 += AbstractC6285.m14254(4, this.filesystemType_);
        }
        for (int i2 = 0; i2 < this.newPartitionSignature_.size(); i2++) {
            iM14254 += AbstractC16402.m37229(5, (InterfaceC10467) this.newPartitionSignature_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM14254 += AbstractC16402.m37229(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM14254 += AbstractC16402.m37229(7, getNewPartitionInfo());
        }
        for (int i3 = 0; i3 < this.operations_.size(); i3++) {
            iM14254 += AbstractC16402.m37229(8, (InterfaceC10467) this.operations_.get(i3));
        }
        if ((this.bitField0_ & 64) != 0) {
            iM14254 += AbstractC16402.m37227(9);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM14254 += AbstractC16402.m37229(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            iM14254 += AbstractC16402.m37229(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            iM14254 += AbstractC6285.m14254(12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM14254 += AbstractC16402.m37223(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            iM14254 += AbstractC16402.m37229(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            iM14254 += AbstractC16402.m37229(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            iM14254 += AbstractC16402.m37231(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            iM14254 += AbstractC6285.m14254(17, this.version_);
        }
        for (int i4 = 0; i4 < this.mergeOperations_.size(); i4++) {
            iM14254 += AbstractC16402.m37229(18, (InterfaceC10467) this.mergeOperations_.get(i4));
        }
        if ((this.bitField0_ & 32768) != 0) {
            iM14254 += AbstractC16402.m37228(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            iM14254 += AbstractC16402.m37228(20, this.estimateOpCountMax_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM14254;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10895)) {
            return super.equals(obj);
        }
        C10895 c10895 = (C10895) obj;
        if (hasPartitionName() != c10895.hasPartitionName()) {
            return false;
        }
        if ((hasPartitionName() && !getPartitionName().equals(c10895.getPartitionName())) || hasRunPostinstall() != c10895.hasRunPostinstall()) {
            return false;
        }
        if ((hasRunPostinstall() && getRunPostinstall() != c10895.getRunPostinstall()) || hasPostinstallPath() != c10895.hasPostinstallPath()) {
            return false;
        }
        if ((hasPostinstallPath() && !getPostinstallPath().equals(c10895.getPostinstallPath())) || hasFilesystemType() != c10895.hasFilesystemType()) {
            return false;
        }
        if ((hasFilesystemType() && !getFilesystemType().equals(c10895.getFilesystemType())) || !getNewPartitionSignatureList().equals(c10895.getNewPartitionSignatureList()) || hasOldPartitionInfo() != c10895.hasOldPartitionInfo()) {
            return false;
        }
        if ((hasOldPartitionInfo() && !getOldPartitionInfo().equals(c10895.getOldPartitionInfo())) || hasNewPartitionInfo() != c10895.hasNewPartitionInfo()) {
            return false;
        }
        if ((hasNewPartitionInfo() && !getNewPartitionInfo().equals(c10895.getNewPartitionInfo())) || !getOperationsList().equals(c10895.getOperationsList()) || hasPostinstallOptional() != c10895.hasPostinstallOptional()) {
            return false;
        }
        if ((hasPostinstallOptional() && getPostinstallOptional() != c10895.getPostinstallOptional()) || hasHashTreeDataExtent() != c10895.hasHashTreeDataExtent()) {
            return false;
        }
        if ((hasHashTreeDataExtent() && !getHashTreeDataExtent().equals(c10895.getHashTreeDataExtent())) || hasHashTreeExtent() != c10895.hasHashTreeExtent()) {
            return false;
        }
        if ((hasHashTreeExtent() && !getHashTreeExtent().equals(c10895.getHashTreeExtent())) || hasHashTreeAlgorithm() != c10895.hasHashTreeAlgorithm()) {
            return false;
        }
        if ((hasHashTreeAlgorithm() && !getHashTreeAlgorithm().equals(c10895.getHashTreeAlgorithm())) || hasHashTreeSalt() != c10895.hasHashTreeSalt()) {
            return false;
        }
        if ((hasHashTreeSalt() && !getHashTreeSalt().equals(c10895.getHashTreeSalt())) || hasFecDataExtent() != c10895.hasFecDataExtent()) {
            return false;
        }
        if ((hasFecDataExtent() && !getFecDataExtent().equals(c10895.getFecDataExtent())) || hasFecExtent() != c10895.hasFecExtent()) {
            return false;
        }
        if ((hasFecExtent() && !getFecExtent().equals(c10895.getFecExtent())) || hasFecRoots() != c10895.hasFecRoots()) {
            return false;
        }
        if ((hasFecRoots() && getFecRoots() != c10895.getFecRoots()) || hasVersion() != c10895.hasVersion()) {
            return false;
        }
        if ((hasVersion() && !getVersion().equals(c10895.getVersion())) || !getMergeOperationsList().equals(c10895.getMergeOperationsList()) || hasEstimateCowSize() != c10895.hasEstimateCowSize()) {
            return false;
        }
        if ((!hasEstimateCowSize() || getEstimateCowSize() == c10895.getEstimateCowSize()) && hasEstimateOpCountMax() == c10895.hasEstimateOpCountMax()) {
            return (!hasEstimateOpCountMax() || getEstimateOpCountMax() == c10895.getEstimateOpCountMax()) && getUnknownFields().equals(c10895.getUnknownFields());
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
        if (hasPartitionName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getPartitionName().hashCode();
        }
        if (hasRunPostinstall()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(getRunPostinstall());
        }
        if (hasPostinstallPath()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + getPostinstallPath().hashCode();
        }
        if (hasFilesystemType()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + getFilesystemType().hashCode();
        }
        if (getNewPartitionSignatureCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + getNewPartitionSignatureList().hashCode();
        }
        if (hasOldPartitionInfo()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + getOldPartitionInfo().hashCode();
        }
        if (hasNewPartitionInfo()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + getNewPartitionInfo().hashCode();
        }
        if (getOperationsCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + getOperationsList().hashCode();
        }
        if (hasPostinstallOptional()) {
            iHashCode = C6316.m14441(iHashCode, 37, 9, 53) + C15671.m35601(getPostinstallOptional());
        }
        if (hasHashTreeDataExtent()) {
            iHashCode = C6316.m14441(iHashCode, 37, 10, 53) + getHashTreeDataExtent().hashCode();
        }
        if (hasHashTreeExtent()) {
            iHashCode = C6316.m14441(iHashCode, 37, 11, 53) + getHashTreeExtent().hashCode();
        }
        if (hasHashTreeAlgorithm()) {
            iHashCode = C6316.m14441(iHashCode, 37, 12, 53) + getHashTreeAlgorithm().hashCode();
        }
        if (hasHashTreeSalt()) {
            iHashCode = C6316.m14441(iHashCode, 37, 13, 53) + getHashTreeSalt().hashCode();
        }
        if (hasFecDataExtent()) {
            iHashCode = C6316.m14441(iHashCode, 37, 14, 53) + getFecDataExtent().hashCode();
        }
        if (hasFecExtent()) {
            iHashCode = C6316.m14441(iHashCode, 37, 15, 53) + getFecExtent().hashCode();
        }
        if (hasFecRoots()) {
            iHashCode = C6316.m14441(iHashCode, 37, 16, 53) + getFecRoots();
        }
        if (hasVersion()) {
            iHashCode = C6316.m14441(iHashCode, 37, 17, 53) + getVersion().hashCode();
        }
        if (getMergeOperationsCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 18, 53) + getMergeOperationsList().hashCode();
        }
        if (hasEstimateCowSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 19, 53) + C15671.m35600(getEstimateCowSize());
        }
        if (hasEstimateOpCountMax()) {
            iHashCode = C6316.m14441(iHashCode, 37, 20, 53) + C15671.m35600(getEstimateOpCountMax());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C10895 parseFrom(ByteBuffer byteBuffer) {
        return (C10895) PARSER.parseFrom(byteBuffer);
    }

    public static C10895 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C10895) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C10895 parseFrom(AbstractC7962 abstractC7962) {
        return (C10895) PARSER.parseFrom(abstractC7962);
    }

    public static C10895 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C10895) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C10895 parseFrom(byte[] bArr) {
        return (C10895) PARSER.parseFrom(bArr);
    }

    public static C10895 parseFrom(byte[] bArr, C19283 c19283) {
        return (C10895) PARSER.parseFrom(bArr, c19283);
    }

    public static C10895 parseFrom(InputStream inputStream) {
        return (C10895) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C10895 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C10895) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C10895 parseDelimitedFrom(InputStream inputStream) {
        return (C10895) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C10895 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C10895) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C10895 parseFrom(AbstractC9303 abstractC9303) {
        return (C10895) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C10895 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C10895) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C11566 newBuilderForType() {
        return newBuilder();
    }

    public static C11566 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C11566 newBuilder(C10895 c10895) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c10895);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C11566 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C11566(i) : new C11566(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C11566 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C11566(interfaceC11316, 0);
    }

    public static C10895 getDefaultInstance() {
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
    public C10895 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
