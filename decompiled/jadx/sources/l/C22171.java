package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22171 extends AbstractC4121 implements InterfaceC4532 {
    public static final int COMPRESSION_FACTOR_FIELD_NUMBER = 7;
    public static final int COW_VERSION_FIELD_NUMBER = 5;
    public static final C22171 DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    public static final InterfaceC12050 PARSER;
    public static final int SNAPSHOT_ENABLED_FIELD_NUMBER = 2;
    public static final int VABC_COMPRESSION_PARAM_FIELD_NUMBER = 4;
    public static final int VABC_ENABLED_FIELD_NUMBER = 3;
    public static final int VABC_FEATURE_SET_FIELD_NUMBER = 6;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long compressionFactor_;
    public int cowVersion_;
    public List groups_;
    public byte memoizedIsInitialized;
    public boolean snapshotEnabled_;
    public volatile Object vabcCompressionParam_;
    public boolean vabcEnabled_;
    public C15319 vabcFeatureSet_;

    public /* synthetic */ C22171(C21466 c21466) {
        this((AbstractC19916) c21466);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C22171.class.getName());
        DEFAULT_INSTANCE = new C22171();
        PARSER = new C15114();
    }

    public C22171(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C22171() {
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable;
        c9766.m24773(C22171.class, C21466.class);
        return c9766;
    }

    @Override // l.InterfaceC4532
    public List getGroupsList() {
        return this.groups_;
    }

    @Override // l.InterfaceC4532
    public List getGroupsOrBuilderList() {
        return this.groups_;
    }

    @Override // l.InterfaceC4532
    public int getGroupsCount() {
        return this.groups_.size();
    }

    @Override // l.InterfaceC4532
    public C5238 getGroups(int i) {
        return (C5238) this.groups_.get(i);
    }

    @Override // l.InterfaceC4532
    public InterfaceC8060 getGroupsOrBuilder(int i) {
        return (InterfaceC8060) this.groups_.get(i);
    }

    @Override // l.InterfaceC4532
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC4532
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    @Override // l.InterfaceC4532
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC4532
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    @Override // l.InterfaceC4532
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC4532
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.vabcCompressionParam_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC4532
    public AbstractC5886 getVabcCompressionParamBytes() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.vabcCompressionParam_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC4532
    public boolean hasCowVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC4532
    public int getCowVersion() {
        return this.cowVersion_;
    }

    @Override // l.InterfaceC4532
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC4532
    public C15319 getVabcFeatureSet() {
        C15319 c15319 = this.vabcFeatureSet_;
        return c15319 == null ? C15319.getDefaultInstance() : c15319;
    }

    @Override // l.InterfaceC4532
    public InterfaceC22376 getVabcFeatureSetOrBuilder() {
        C15319 c15319 = this.vabcFeatureSet_;
        return c15319 == null ? C15319.getDefaultInstance() : c15319;
    }

    @Override // l.InterfaceC4532
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC4532
    public long getCompressionFactor() {
        return this.compressionFactor_;
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
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        for (int i = 0; i < this.groups_.size(); i++) {
            abstractC14766.mo35104(1, (InterfaceC8522) this.groups_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC14766.mo35093(2, this.snapshotEnabled_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35093(3, this.vabcEnabled_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC4121.m12380(abstractC14766, 4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14766.mo35109(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14766.mo35104(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14766.mo35102(7, this.compressionFactor_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35081 = 0;
        for (int i2 = 0; i2 < this.groups_.size(); i2++) {
            iM35081 += AbstractC14766.m35082(1, (InterfaceC8522) this.groups_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            iM35081 += AbstractC14766.m35080(2);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM35081 += AbstractC14766.m35080(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35081 += AbstractC4121.m12365(4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35081 += AbstractC14766.m35084(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM35081 += AbstractC14766.m35082(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM35081 += AbstractC14766.m35081(7, this.compressionFactor_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35081;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22171)) {
            return super.equals(obj);
        }
        C22171 c22171 = (C22171) obj;
        if (!getGroupsList().equals(c22171.getGroupsList()) || hasSnapshotEnabled() != c22171.hasSnapshotEnabled()) {
            return false;
        }
        if ((hasSnapshotEnabled() && getSnapshotEnabled() != c22171.getSnapshotEnabled()) || hasVabcEnabled() != c22171.hasVabcEnabled()) {
            return false;
        }
        if ((hasVabcEnabled() && getVabcEnabled() != c22171.getVabcEnabled()) || hasVabcCompressionParam() != c22171.hasVabcCompressionParam()) {
            return false;
        }
        if ((hasVabcCompressionParam() && !getVabcCompressionParam().equals(c22171.getVabcCompressionParam())) || hasCowVersion() != c22171.hasCowVersion()) {
            return false;
        }
        if ((hasCowVersion() && getCowVersion() != c22171.getCowVersion()) || hasVabcFeatureSet() != c22171.hasVabcFeatureSet()) {
            return false;
        }
        if ((!hasVabcFeatureSet() || getVabcFeatureSet().equals(c22171.getVabcFeatureSet())) && hasCompressionFactor() == c22171.hasCompressionFactor()) {
            return (!hasCompressionFactor() || getCompressionFactor() == c22171.getCompressionFactor()) && getUnknownFields().equals(c22171.getUnknownFields());
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
        if (getGroupsCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getGroupsList().hashCode();
        }
        if (hasSnapshotEnabled()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33481(getSnapshotEnabled());
        }
        if (hasVabcEnabled()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33481(getVabcEnabled());
        }
        if (hasVabcCompressionParam()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + getVabcCompressionParam().hashCode();
        }
        if (hasCowVersion()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + getCowVersion();
        }
        if (hasVabcFeatureSet()) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + getVabcFeatureSet().hashCode();
        }
        if (hasCompressionFactor()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + C13997.m33480(getCompressionFactor());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22171 parseFrom(ByteBuffer byteBuffer) {
        return (C22171) PARSER.parseFrom(byteBuffer);
    }

    public static C22171 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C22171) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C22171 parseFrom(AbstractC5886 abstractC5886) {
        return (C22171) PARSER.parseFrom(abstractC5886);
    }

    public static C22171 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C22171) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C22171 parseFrom(byte[] bArr) {
        return (C22171) PARSER.parseFrom(bArr);
    }

    public static C22171 parseFrom(byte[] bArr, C17798 c17798) {
        return (C22171) PARSER.parseFrom(bArr, c17798);
    }

    public static C22171 parseFrom(InputStream inputStream) {
        return (C22171) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C22171 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C22171) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C22171 parseDelimitedFrom(InputStream inputStream) {
        return (C22171) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C22171 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C22171) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C22171 parseFrom(AbstractC7297 abstractC7297) {
        return (C22171) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C22171 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C22171) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C21466 newBuilderForType() {
        return newBuilder();
    }

    public static C21466 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C21466 newBuilder(C22171 c22171) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c22171);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C21466 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C21466(i) : new C21466(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C21466 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C21466(interfaceC9415, 0);
    }

    public static C22171 getDefaultInstance() {
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
    public C22171 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
