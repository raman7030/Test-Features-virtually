package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4189 extends AbstractC6285 implements InterfaceC18270 {
    public static final int DATA_LENGTH_FIELD_NUMBER = 3;
    public static final int DATA_OFFSET_FIELD_NUMBER = 2;
    public static final int DATA_SHA256_HASH_FIELD_NUMBER = 8;
    public static final C4189 DEFAULT_INSTANCE;
    public static final int DST_EXTENTS_FIELD_NUMBER = 6;
    public static final int DST_LENGTH_FIELD_NUMBER = 7;
    public static final InterfaceC13820 PARSER;
    public static final int SRC_EXTENTS_FIELD_NUMBER = 4;
    public static final int SRC_LENGTH_FIELD_NUMBER = 5;
    public static final int SRC_SHA256_HASH_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC7962 dataSha256Hash_;
    public List dstExtents_;
    public long dstLength_;
    public byte memoizedIsInitialized;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC7962 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C4189(C24110 c24110) {
        this((AbstractC21296) c24110);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C4189.class.getName());
        DEFAULT_INSTANCE = new C4189();
        PARSER = new C13382();
    }

    public C4189(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.dataSha256Hash_ = abstractC7962;
        this.srcSha256Hash_ = abstractC7962;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4189() {
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.dataSha256Hash_ = abstractC7962;
        this.srcSha256Hash_ = abstractC7962;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        this.dataSha256Hash_ = abstractC7962;
        this.srcSha256Hash_ = abstractC7962;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68162x3e2f7e5d;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68163x4e1cf7db;
        c11650.m26787(C4189.class, C24110.class);
        return c11650;
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

    @Override // p067l.InterfaceC18270
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getDataOffset() {
        return this.dataOffset_;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getDataLength() {
        return this.dataLength_;
    }

    @Override // p067l.InterfaceC18270
    public List getSrcExtentsList() {
        return this.srcExtents_;
    }

    @Override // p067l.InterfaceC18270
    public List getSrcExtentsOrBuilderList() {
        return this.srcExtents_;
    }

    @Override // p067l.InterfaceC18270
    public int getSrcExtentsCount() {
        return this.srcExtents_.size();
    }

    @Override // p067l.InterfaceC18270
    public C14052 getSrcExtents(int i) {
        return (C14052) this.srcExtents_.get(i);
    }

    @Override // p067l.InterfaceC18270
    public InterfaceC8017 getSrcExtentsOrBuilder(int i) {
        return (InterfaceC8017) this.srcExtents_.get(i);
    }

    @Override // p067l.InterfaceC18270
    public boolean hasSrcLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getSrcLength() {
        return this.srcLength_;
    }

    @Override // p067l.InterfaceC18270
    public List getDstExtentsList() {
        return this.dstExtents_;
    }

    @Override // p067l.InterfaceC18270
    public List getDstExtentsOrBuilderList() {
        return this.dstExtents_;
    }

    @Override // p067l.InterfaceC18270
    public int getDstExtentsCount() {
        return this.dstExtents_.size();
    }

    @Override // p067l.InterfaceC18270
    public C14052 getDstExtents(int i) {
        return (C14052) this.dstExtents_.get(i);
    }

    @Override // p067l.InterfaceC18270
    public InterfaceC8017 getDstExtentsOrBuilder(int i) {
        return (InterfaceC8017) this.dstExtents_.get(i);
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDstLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p067l.InterfaceC18270
    public long getDstLength() {
        return this.dstLength_;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC18270
    public AbstractC7962 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    @Override // p067l.InterfaceC18270
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC18270
    public AbstractC7962 getSrcSha256Hash() {
        return this.srcSha256Hash_;
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
        if (!hasType()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC16402.mo37248(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37249(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC16402.mo37249(3, this.dataLength_);
        }
        for (int i = 0; i < this.srcExtents_.size(); i++) {
            abstractC16402.mo37251(4, (InterfaceC10467) this.srcExtents_.get(i));
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC16402.mo37249(5, this.srcLength_);
        }
        for (int i2 = 0; i2 < this.dstExtents_.size(); i2++) {
            abstractC16402.mo37251(6, (InterfaceC10467) this.dstExtents_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC16402.mo37249(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC16402.mo37237(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC16402.mo37237(9, this.srcSha256Hash_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37226 = (this.bitField0_ & 1) != 0 ? AbstractC16402.m37226(1, this.type_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM37226 += AbstractC16402.m37228(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM37226 += AbstractC16402.m37228(3, this.dataLength_);
        }
        for (int i2 = 0; i2 < this.srcExtents_.size(); i2++) {
            iM37226 += AbstractC16402.m37229(4, (InterfaceC10467) this.srcExtents_.get(i2));
        }
        if ((this.bitField0_ & 8) != 0) {
            iM37226 += AbstractC16402.m37228(5, this.srcLength_);
        }
        for (int i3 = 0; i3 < this.dstExtents_.size(); i3++) {
            iM37226 += AbstractC16402.m37229(6, (InterfaceC10467) this.dstExtents_.get(i3));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM37226 += AbstractC16402.m37228(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM37226 += AbstractC16402.m37223(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM37226 += AbstractC16402.m37223(9, this.srcSha256Hash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37226;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4189)) {
            return super.equals(obj);
        }
        C4189 c4189 = (C4189) obj;
        if (hasType() != c4189.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c4189.type_) || hasDataOffset() != c4189.hasDataOffset()) {
            return false;
        }
        if ((hasDataOffset() && getDataOffset() != c4189.getDataOffset()) || hasDataLength() != c4189.hasDataLength()) {
            return false;
        }
        if ((hasDataLength() && getDataLength() != c4189.getDataLength()) || !getSrcExtentsList().equals(c4189.getSrcExtentsList()) || hasSrcLength() != c4189.hasSrcLength()) {
            return false;
        }
        if ((hasSrcLength() && getSrcLength() != c4189.getSrcLength()) || !getDstExtentsList().equals(c4189.getDstExtentsList()) || hasDstLength() != c4189.hasDstLength()) {
            return false;
        }
        if ((hasDstLength() && getDstLength() != c4189.getDstLength()) || hasDataSha256Hash() != c4189.hasDataSha256Hash()) {
            return false;
        }
        if ((!hasDataSha256Hash() || getDataSha256Hash().equals(c4189.getDataSha256Hash())) && hasSrcSha256Hash() == c4189.hasSrcSha256Hash()) {
            return (!hasSrcSha256Hash() || getSrcSha256Hash().equals(c4189.getSrcSha256Hash())) && getUnknownFields().equals(c4189.getUnknownFields());
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
        if (hasType()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + this.type_;
        }
        if (hasDataOffset()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35600(getDataOffset());
        }
        if (hasDataLength()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35600(getDataLength());
        }
        if (getSrcExtentsCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + getSrcExtentsList().hashCode();
        }
        if (hasSrcLength()) {
            iHashCode = C6316.m14441(iHashCode, 37, 5, 53) + C15671.m35600(getSrcLength());
        }
        if (getDstExtentsCount() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, 6, 53) + getDstExtentsList().hashCode();
        }
        if (hasDstLength()) {
            iHashCode = C6316.m14441(iHashCode, 37, 7, 53) + C15671.m35600(getDstLength());
        }
        if (hasDataSha256Hash()) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + getDataSha256Hash().hashCode();
        }
        if (hasSrcSha256Hash()) {
            iHashCode = C6316.m14441(iHashCode, 37, 9, 53) + getSrcSha256Hash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4189 parseFrom(ByteBuffer byteBuffer) {
        return (C4189) PARSER.parseFrom(byteBuffer);
    }

    public static C4189 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C4189) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C4189 parseFrom(AbstractC7962 abstractC7962) {
        return (C4189) PARSER.parseFrom(abstractC7962);
    }

    public static C4189 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C4189) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C4189 parseFrom(byte[] bArr) {
        return (C4189) PARSER.parseFrom(bArr);
    }

    public static C4189 parseFrom(byte[] bArr, C19283 c19283) {
        return (C4189) PARSER.parseFrom(bArr, c19283);
    }

    public static C4189 parseFrom(InputStream inputStream) {
        return (C4189) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C4189 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C4189) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C4189 parseDelimitedFrom(InputStream inputStream) {
        return (C4189) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C4189 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C4189) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C4189 parseFrom(AbstractC9303 abstractC9303) {
        return (C4189) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C4189 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C4189) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C24110 newBuilderForType() {
        return newBuilder();
    }

    public static C24110 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C24110 newBuilder(C4189 c4189) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4189);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C24110 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C24110(i) : new C24110(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C24110 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C24110(interfaceC11316, 0);
    }

    public static C4189 getDefaultInstance() {
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
    public C4189 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
