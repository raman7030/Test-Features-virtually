package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6649 extends AbstractC4121 implements InterfaceC9472 {
    public static final C6649 DEFAULT_INSTANCE;
    public static final int DST_EXTENT_FIELD_NUMBER = 3;
    public static final InterfaceC12050 PARSER;
    public static final int SRC_EXTENT_FIELD_NUMBER = 2;
    public static final int SRC_OFFSET_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public C12293 dstExtent_;
    public byte memoizedIsInitialized;
    public C12293 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C6649(C17232 c17232) {
        this((AbstractC19916) c17232);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C6649.class.getName());
        DEFAULT_INSTANCE = new C6649();
        PARSER = new C17938();
    }

    public C6649(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.type_ = 0;
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C6649() {
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable;
        c9766.m24773(C6649.class, C17232.class);
        return c9766;
    }

    @Override // l.InterfaceC9472
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC9472
    public EnumC23582 getType() {
        EnumC23582 enumC23582ForNumber = EnumC23582.forNumber(this.type_);
        return enumC23582ForNumber == null ? EnumC23582.COW_COPY : enumC23582ForNumber;
    }

    @Override // l.InterfaceC9472
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC9472
    public C12293 getSrcExtent() {
        C12293 c12293 = this.srcExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC9472
    public InterfaceC5943 getSrcExtentOrBuilder() {
        C12293 c12293 = this.srcExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC9472
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC9472
    public C12293 getDstExtent() {
        C12293 c12293 = this.dstExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC9472
    public InterfaceC5943 getDstExtentOrBuilder() {
        C12293 c12293 = this.dstExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    @Override // l.InterfaceC9472
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC9472
    public int getSrcOffset() {
        return this.srcOffset_;
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14766.mo35101(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35104(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14766.mo35104(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14766.mo35109(4, this.srcOffset_);
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
            iM35079 += AbstractC14766.m35082(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35079 += AbstractC14766.m35082(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35079 += AbstractC14766.m35084(4, this.srcOffset_);
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
        if (!(obj instanceof C6649)) {
            return super.equals(obj);
        }
        C6649 c6649 = (C6649) obj;
        if (hasType() != c6649.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c6649.type_) || hasSrcExtent() != c6649.hasSrcExtent()) {
            return false;
        }
        if ((hasSrcExtent() && !getSrcExtent().equals(c6649.getSrcExtent())) || hasDstExtent() != c6649.hasDstExtent()) {
            return false;
        }
        if ((!hasDstExtent() || getDstExtent().equals(c6649.getDstExtent())) && hasSrcOffset() == c6649.hasSrcOffset()) {
            return (!hasSrcOffset() || getSrcOffset() == c6649.getSrcOffset()) && getUnknownFields().equals(c6649.getUnknownFields());
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
        if (hasSrcExtent()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + getSrcExtent().hashCode();
        }
        if (hasDstExtent()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + getDstExtent().hashCode();
        }
        if (hasSrcOffset()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + getSrcOffset();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C6649 parseFrom(ByteBuffer byteBuffer) {
        return (C6649) PARSER.parseFrom(byteBuffer);
    }

    public static C6649 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C6649) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C6649 parseFrom(AbstractC5886 abstractC5886) {
        return (C6649) PARSER.parseFrom(abstractC5886);
    }

    public static C6649 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C6649) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C6649 parseFrom(byte[] bArr) {
        return (C6649) PARSER.parseFrom(bArr);
    }

    public static C6649 parseFrom(byte[] bArr, C17798 c17798) {
        return (C6649) PARSER.parseFrom(bArr, c17798);
    }

    public static C6649 parseFrom(InputStream inputStream) {
        return (C6649) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C6649 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C6649) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C6649 parseDelimitedFrom(InputStream inputStream) {
        return (C6649) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C6649 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C6649) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C6649 parseFrom(AbstractC7297 abstractC7297) {
        return (C6649) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C6649 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C6649) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C17232 newBuilderForType() {
        return newBuilder();
    }

    public static C17232 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C17232 newBuilder(C6649 c6649) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c6649);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C17232 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C17232(i) : new C17232(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C17232 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C17232(interfaceC9415, 0);
    }

    public static C6649 getDefaultInstance() {
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
    public C6649 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
