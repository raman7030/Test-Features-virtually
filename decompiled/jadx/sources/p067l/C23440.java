package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C23440 extends AbstractC6285 implements InterfaceC6676 {
    public static final int COMPRESSION_FACTOR_FIELD_NUMBER = 7;
    public static final int COW_VERSION_FIELD_NUMBER = 5;
    public static final C23440 DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    public static final InterfaceC13820 PARSER;
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
    public C16928 vabcFeatureSet_;

    public /* synthetic */ C23440(C22770 c22770) {
        this((AbstractC21296) c22770);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C23440.class.getName());
        DEFAULT_INSTANCE = new C23440();
        PARSER = new C16733();
    }

    public C23440(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C23440() {
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
    }

    public static final C19244 getDescriptor() {
        return C21624.f68159x4f937aef;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68160x38cc426d;
        c11650.m26787(C23440.class, C22770.class);
        return c11650;
    }

    @Override // p067l.InterfaceC6676
    public List getGroupsList() {
        return this.groups_;
    }

    @Override // p067l.InterfaceC6676
    public List getGroupsOrBuilderList() {
        return this.groups_;
    }

    @Override // p067l.InterfaceC6676
    public int getGroupsCount() {
        return this.groups_.size();
    }

    @Override // p067l.InterfaceC6676
    public C7347 getGroups(int i) {
        return (C7347) this.groups_.get(i);
    }

    @Override // p067l.InterfaceC6676
    public InterfaceC10029 getGroupsOrBuilder(int i) {
        return (InterfaceC10029) this.groups_.get(i);
    }

    @Override // p067l.InterfaceC6676
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC6676
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC6676
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC6676
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.vabcCompressionParam_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC6676
    public AbstractC7962 getVabcCompressionParamBytes() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.vabcCompressionParam_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasCowVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC6676
    public int getCowVersion() {
        return this.cowVersion_;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p067l.InterfaceC6676
    public C16928 getVabcFeatureSet() {
        C16928 c16928 = this.vabcFeatureSet_;
        return c16928 == null ? C16928.getDefaultInstance() : c16928;
    }

    @Override // p067l.InterfaceC6676
    public InterfaceC23635 getVabcFeatureSetOrBuilder() {
        C16928 c16928 = this.vabcFeatureSet_;
        return c16928 == null ? C16928.getDefaultInstance() : c16928;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC6676
    public long getCompressionFactor() {
        return this.compressionFactor_;
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
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        for (int i = 0; i < this.groups_.size(); i++) {
            abstractC16402.mo37251(1, (InterfaceC10467) this.groups_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC16402.mo37240(2, this.snapshotEnabled_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37240(3, this.vabcEnabled_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC6285.m14269(abstractC16402, 4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC16402.mo37256(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC16402.mo37251(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC16402.mo37249(7, this.compressionFactor_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37228 = 0;
        for (int i2 = 0; i2 < this.groups_.size(); i2++) {
            iM37228 += AbstractC16402.m37229(1, (InterfaceC10467) this.groups_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            iM37228 += AbstractC16402.m37227(2);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM37228 += AbstractC16402.m37227(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM37228 += AbstractC6285.m14254(4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM37228 += AbstractC16402.m37231(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM37228 += AbstractC16402.m37229(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM37228 += AbstractC16402.m37228(7, this.compressionFactor_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37228;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23440)) {
            return super.equals(obj);
        }
        C23440 c23440 = (C23440) obj;
        if (!getGroupsList().equals(c23440.getGroupsList()) || hasSnapshotEnabled() != c23440.hasSnapshotEnabled()) {
            return false;
        }
        if ((hasSnapshotEnabled() && getSnapshotEnabled() != c23440.getSnapshotEnabled()) || hasVabcEnabled() != c23440.hasVabcEnabled()) {
            return false;
        }
        if ((hasVabcEnabled() && getVabcEnabled() != c23440.getVabcEnabled()) || hasVabcCompressionParam() != c23440.hasVabcCompressionParam()) {
            return false;
        }
        if ((hasVabcCompressionParam() && !getVabcCompressionParam().equals(c23440.getVabcCompressionParam())) || hasCowVersion() != c23440.hasCowVersion()) {
            return false;
        }
        if ((hasCowVersion() && getCowVersion() != c23440.getCowVersion()) || hasVabcFeatureSet() != c23440.hasVabcFeatureSet()) {
            return false;
        }
        if ((!hasVabcFeatureSet() || getVabcFeatureSet().equals(c23440.getVabcFeatureSet())) && hasCompressionFactor() == c23440.hasCompressionFactor()) {
            return (!hasCompressionFactor() || getCompressionFactor() == c23440.getCompressionFactor()) && getUnknownFields().equals(c23440.getUnknownFields());
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
        if (getGroupsCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getGroupsList().hashCode();
        }
        if (hasSnapshotEnabled()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35601(getSnapshotEnabled());
        }
        if (hasVabcEnabled()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35601(getVabcEnabled());
        }
        if (hasVabcCompressionParam()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + getVabcCompressionParam().hashCode();
        }
        if (hasCowVersion()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + getCowVersion();
        }
        if (hasVabcFeatureSet()) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + getVabcFeatureSet().hashCode();
        }
        if (hasCompressionFactor()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + C15671.m35600(getCompressionFactor());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23440 parseFrom(ByteBuffer byteBuffer) {
        return (C23440) PARSER.parseFrom(byteBuffer);
    }

    public static C23440 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C23440) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C23440 parseFrom(AbstractC7962 abstractC7962) {
        return (C23440) PARSER.parseFrom(abstractC7962);
    }

    public static C23440 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C23440) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C23440 parseFrom(byte[] bArr) {
        return (C23440) PARSER.parseFrom(bArr);
    }

    public static C23440 parseFrom(byte[] bArr, C19283 c19283) {
        return (C23440) PARSER.parseFrom(bArr, c19283);
    }

    public static C23440 parseFrom(InputStream inputStream) {
        return (C23440) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C23440 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C23440) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C23440 parseDelimitedFrom(InputStream inputStream) {
        return (C23440) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C23440 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C23440) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C23440 parseFrom(AbstractC9303 abstractC9303) {
        return (C23440) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C23440 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C23440) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C22770 newBuilderForType() {
        return newBuilder();
    }

    public static C22770 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C22770 newBuilder(C23440 c23440) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c23440);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C22770 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C22770(i) : new C22770(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C22770 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C22770(interfaceC11316, 0);
    }

    public static C23440 getDefaultInstance() {
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
    public C23440 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
