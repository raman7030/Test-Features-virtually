package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8688 extends AbstractC6285 implements InterfaceC11371 {
    public static final C8688 DEFAULT_INSTANCE;
    public static final int DST_EXTENT_FIELD_NUMBER = 3;
    public static final InterfaceC13820 PARSER;
    public static final int SRC_EXTENT_FIELD_NUMBER = 2;
    public static final int SRC_OFFSET_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public C14052 dstExtent_;
    public byte memoizedIsInitialized;
    public C14052 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C8688(C18746 c18746) {
        this((AbstractC21296) c18746);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C8688.class.getName());
        DEFAULT_INSTANCE = new C8688();
        PARSER = new C19417();
    }

    public C8688(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.type_ = 0;
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C8688() {
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68153x2ca282d9;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68154xfc71c057;
        c11650.m26787(C8688.class, C18746.class);
        return c11650;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC11371
    public EnumC24781 getType() {
        EnumC24781 enumC24781ForNumber = EnumC24781.forNumber(this.type_);
        return enumC24781ForNumber == null ? EnumC24781.COW_COPY : enumC24781ForNumber;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC11371
    public C14052 getSrcExtent() {
        C14052 c14052 = this.srcExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC11371
    public InterfaceC8017 getSrcExtentOrBuilder() {
        C14052 c14052 = this.srcExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC11371
    public C14052 getDstExtent() {
        C14052 c14052 = this.dstExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC11371
    public InterfaceC8017 getDstExtentOrBuilder() {
        C14052 c14052 = this.dstExtent_;
        return c14052 == null ? C14052.getDefaultInstance() : c14052;
    }

    @Override // p067l.InterfaceC11371
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC11371
    public int getSrcOffset() {
        return this.srcOffset_;
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public void writeTo(AbstractC16402 abstractC16402) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC16402.mo37248(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37251(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC16402.mo37251(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC16402.mo37256(4, this.srcOffset_);
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
            iM37226 += AbstractC16402.m37229(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            iM37226 += AbstractC16402.m37229(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM37226 += AbstractC16402.m37231(4, this.srcOffset_);
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
        if (!(obj instanceof C8688)) {
            return super.equals(obj);
        }
        C8688 c8688 = (C8688) obj;
        if (hasType() != c8688.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c8688.type_) || hasSrcExtent() != c8688.hasSrcExtent()) {
            return false;
        }
        if ((hasSrcExtent() && !getSrcExtent().equals(c8688.getSrcExtent())) || hasDstExtent() != c8688.hasDstExtent()) {
            return false;
        }
        if ((!hasDstExtent() || getDstExtent().equals(c8688.getDstExtent())) && hasSrcOffset() == c8688.hasSrcOffset()) {
            return (!hasSrcOffset() || getSrcOffset() == c8688.getSrcOffset()) && getUnknownFields().equals(c8688.getUnknownFields());
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
        if (hasSrcExtent()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + getSrcExtent().hashCode();
        }
        if (hasDstExtent()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + getDstExtent().hashCode();
        }
        if (hasSrcOffset()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + getSrcOffset();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8688 parseFrom(ByteBuffer byteBuffer) {
        return (C8688) PARSER.parseFrom(byteBuffer);
    }

    public static C8688 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C8688) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C8688 parseFrom(AbstractC7962 abstractC7962) {
        return (C8688) PARSER.parseFrom(abstractC7962);
    }

    public static C8688 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C8688) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C8688 parseFrom(byte[] bArr) {
        return (C8688) PARSER.parseFrom(bArr);
    }

    public static C8688 parseFrom(byte[] bArr, C19283 c19283) {
        return (C8688) PARSER.parseFrom(bArr, c19283);
    }

    public static C8688 parseFrom(InputStream inputStream) {
        return (C8688) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C8688 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C8688) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C8688 parseDelimitedFrom(InputStream inputStream) {
        return (C8688) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C8688 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C8688) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C8688 parseFrom(AbstractC9303 abstractC9303) {
        return (C8688) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C8688 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C8688) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C18746 newBuilderForType() {
        return newBuilder();
    }

    public static C18746 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C18746 newBuilder(C8688 c8688) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c8688);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C18746 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C18746(i) : new C18746(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C18746 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C18746(interfaceC11316, 0);
    }

    public static C8688 getDefaultInstance() {
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
    public C8688 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
