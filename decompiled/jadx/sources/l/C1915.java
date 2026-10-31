package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1915 extends AbstractC4121 implements InterfaceC16731 {
    public static final int DATA_LENGTH_FIELD_NUMBER = 3;
    public static final int DATA_OFFSET_FIELD_NUMBER = 2;
    public static final int DATA_SHA256_HASH_FIELD_NUMBER = 8;
    public static final C1915 DEFAULT_INSTANCE;
    public static final int DST_EXTENTS_FIELD_NUMBER = 6;
    public static final int DST_LENGTH_FIELD_NUMBER = 7;
    public static final InterfaceC12050 PARSER;
    public static final int SRC_EXTENTS_FIELD_NUMBER = 4;
    public static final int SRC_LENGTH_FIELD_NUMBER = 5;
    public static final int SRC_SHA256_HASH_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC5886 dataSha256Hash_;
    public List dstExtents_;
    public long dstLength_;
    public byte memoizedIsInitialized;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC5886 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C1915(C22876 c22876) {
        this((AbstractC19916) c22876);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C1915.class.getName());
        DEFAULT_INSTANCE = new C1915();
        PARSER = new C11588();
    }

    public C1915(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.dataSha256Hash_ = abstractC5886;
        this.srcSha256Hash_ = abstractC5886;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C1915() {
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        this.dataSha256Hash_ = abstractC5886;
        this.srcSha256Hash_ = abstractC5886;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        this.dataSha256Hash_ = abstractC5886;
        this.srcSha256Hash_ = abstractC5886;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable;
        c9766.m24773(C1915.class, C22876.class);
        return c9766;
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

    @Override // l.InterfaceC16731
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC16731
    public long getDataOffset() {
        return this.dataOffset_;
    }

    @Override // l.InterfaceC16731
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC16731
    public long getDataLength() {
        return this.dataLength_;
    }

    @Override // l.InterfaceC16731
    public List getSrcExtentsList() {
        return this.srcExtents_;
    }

    @Override // l.InterfaceC16731
    public List getSrcExtentsOrBuilderList() {
        return this.srcExtents_;
    }

    @Override // l.InterfaceC16731
    public int getSrcExtentsCount() {
        return this.srcExtents_.size();
    }

    @Override // l.InterfaceC16731
    public C12293 getSrcExtents(int i) {
        return (C12293) this.srcExtents_.get(i);
    }

    @Override // l.InterfaceC16731
    public InterfaceC5943 getSrcExtentsOrBuilder(int i) {
        return (InterfaceC5943) this.srcExtents_.get(i);
    }

    @Override // l.InterfaceC16731
    public boolean hasSrcLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC16731
    public long getSrcLength() {
        return this.srcLength_;
    }

    @Override // l.InterfaceC16731
    public List getDstExtentsList() {
        return this.dstExtents_;
    }

    @Override // l.InterfaceC16731
    public List getDstExtentsOrBuilderList() {
        return this.dstExtents_;
    }

    @Override // l.InterfaceC16731
    public int getDstExtentsCount() {
        return this.dstExtents_.size();
    }

    @Override // l.InterfaceC16731
    public C12293 getDstExtents(int i) {
        return (C12293) this.dstExtents_.get(i);
    }

    @Override // l.InterfaceC16731
    public InterfaceC5943 getDstExtentsOrBuilder(int i) {
        return (InterfaceC5943) this.dstExtents_.get(i);
    }

    @Override // l.InterfaceC16731
    public boolean hasDstLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC16731
    public long getDstLength() {
        return this.dstLength_;
    }

    @Override // l.InterfaceC16731
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC16731
    public AbstractC5886 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    @Override // l.InterfaceC16731
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC16731
    public AbstractC5886 getSrcSha256Hash() {
        return this.srcSha256Hash_;
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
        if (!hasType()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14766.mo35101(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35102(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14766.mo35102(3, this.dataLength_);
        }
        for (int i = 0; i < this.srcExtents_.size(); i++) {
            abstractC14766.mo35104(4, (InterfaceC8522) this.srcExtents_.get(i));
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14766.mo35102(5, this.srcLength_);
        }
        for (int i2 = 0; i2 < this.dstExtents_.size(); i2++) {
            abstractC14766.mo35104(6, (InterfaceC8522) this.dstExtents_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14766.mo35102(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14766.mo35090(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC14766.mo35090(9, this.srcSha256Hash_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35079 = (this.bitField0_ & 1) != 0 ? AbstractC14766.m35079(1, this.type_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35079 += AbstractC14766.m35081(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35079 += AbstractC14766.m35081(3, this.dataLength_);
        }
        for (int i2 = 0; i2 < this.srcExtents_.size(); i2++) {
            iM35079 += AbstractC14766.m35082(4, (InterfaceC8522) this.srcExtents_.get(i2));
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35079 += AbstractC14766.m35081(5, this.srcLength_);
        }
        for (int i3 = 0; i3 < this.dstExtents_.size(); i3++) {
            iM35079 += AbstractC14766.m35082(6, (InterfaceC8522) this.dstExtents_.get(i3));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM35079 += AbstractC14766.m35081(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM35079 += AbstractC14766.m35076(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM35079 += AbstractC14766.m35076(9, this.srcSha256Hash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35079;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1915)) {
            return super.equals(obj);
        }
        C1915 c1915 = (C1915) obj;
        if (hasType() != c1915.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c1915.type_) || hasDataOffset() != c1915.hasDataOffset()) {
            return false;
        }
        if ((hasDataOffset() && getDataOffset() != c1915.getDataOffset()) || hasDataLength() != c1915.hasDataLength()) {
            return false;
        }
        if ((hasDataLength() && getDataLength() != c1915.getDataLength()) || !getSrcExtentsList().equals(c1915.getSrcExtentsList()) || hasSrcLength() != c1915.hasSrcLength()) {
            return false;
        }
        if ((hasSrcLength() && getSrcLength() != c1915.getSrcLength()) || !getDstExtentsList().equals(c1915.getDstExtentsList()) || hasDstLength() != c1915.hasDstLength()) {
            return false;
        }
        if ((hasDstLength() && getDstLength() != c1915.getDstLength()) || hasDataSha256Hash() != c1915.hasDataSha256Hash()) {
            return false;
        }
        if ((!hasDataSha256Hash() || getDataSha256Hash().equals(c1915.getDataSha256Hash())) && hasSrcSha256Hash() == c1915.hasSrcSha256Hash()) {
            return (!hasSrcSha256Hash() || getSrcSha256Hash().equals(c1915.getSrcSha256Hash())) && getUnknownFields().equals(c1915.getUnknownFields());
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
        if (hasType()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + this.type_;
        }
        if (hasDataOffset()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33480(getDataOffset());
        }
        if (hasDataLength()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33480(getDataLength());
        }
        if (getSrcExtentsCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + getSrcExtentsList().hashCode();
        }
        if (hasSrcLength()) {
            iHashCode = C4153.m12551(iHashCode, 37, 5, 53) + C13997.m33480(getSrcLength());
        }
        if (getDstExtentsCount() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, 6, 53) + getDstExtentsList().hashCode();
        }
        if (hasDstLength()) {
            iHashCode = C4153.m12551(iHashCode, 37, 7, 53) + C13997.m33480(getDstLength());
        }
        if (hasDataSha256Hash()) {
            iHashCode = C4153.m12551(iHashCode, 37, 8, 53) + getDataSha256Hash().hashCode();
        }
        if (hasSrcSha256Hash()) {
            iHashCode = C4153.m12551(iHashCode, 37, 9, 53) + getSrcSha256Hash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C1915 parseFrom(ByteBuffer byteBuffer) {
        return (C1915) PARSER.parseFrom(byteBuffer);
    }

    public static C1915 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C1915) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C1915 parseFrom(AbstractC5886 abstractC5886) {
        return (C1915) PARSER.parseFrom(abstractC5886);
    }

    public static C1915 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C1915) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C1915 parseFrom(byte[] bArr) {
        return (C1915) PARSER.parseFrom(bArr);
    }

    public static C1915 parseFrom(byte[] bArr, C17798 c17798) {
        return (C1915) PARSER.parseFrom(bArr, c17798);
    }

    public static C1915 parseFrom(InputStream inputStream) {
        return (C1915) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C1915 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C1915) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C1915 parseDelimitedFrom(InputStream inputStream) {
        return (C1915) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C1915 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C1915) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C1915 parseFrom(AbstractC7297 abstractC7297) {
        return (C1915) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C1915 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C1915) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C22876 newBuilderForType() {
        return newBuilder();
    }

    public static C22876 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C22876 newBuilder(C1915 c1915) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c1915);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C22876 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C22876(i) : new C22876(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C22876 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C22876(interfaceC9415, 0);
    }

    public static C1915 getDefaultInstance() {
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
    public C1915 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
