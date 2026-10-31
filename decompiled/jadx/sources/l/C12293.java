package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12293 extends AbstractC4121 implements InterfaceC5943 {
    public static final C12293 DEFAULT_INSTANCE;
    public static final int NUM_BLOCKS_FIELD_NUMBER = 2;
    public static final InterfaceC12050 PARSER;
    public static final int START_BLOCK_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C12293(C12998 c12998) {
        this((AbstractC19916) c12998);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C12293.class.getName());
        DEFAULT_INSTANCE = new C12293();
        PARSER = new C3121();
    }

    public C12293(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C12293() {
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable;
        c9766.m24773(C12293.class, C12998.class);
        return c9766;
    }

    @Override // l.InterfaceC5943
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC5943
    public long getStartBlock() {
        return this.startBlock_;
    }

    @Override // l.InterfaceC5943
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC5943
    public long getNumBlocks() {
        return this.numBlocks_;
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
            abstractC14766.mo35102(1, this.startBlock_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35102(2, this.numBlocks_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35081 = (this.bitField0_ & 1) != 0 ? AbstractC14766.m35081(1, this.startBlock_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35081 += AbstractC14766.m35081(2, this.numBlocks_);
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
        if (!(obj instanceof C12293)) {
            return super.equals(obj);
        }
        C12293 c12293 = (C12293) obj;
        if (hasStartBlock() != c12293.hasStartBlock()) {
            return false;
        }
        if ((!hasStartBlock() || getStartBlock() == c12293.getStartBlock()) && hasNumBlocks() == c12293.hasNumBlocks()) {
            return (!hasNumBlocks() || getNumBlocks() == c12293.getNumBlocks()) && getUnknownFields().equals(c12293.getUnknownFields());
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
        if (hasStartBlock()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + C13997.m33480(getStartBlock());
        }
        if (hasNumBlocks()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33480(getNumBlocks());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12293 parseFrom(ByteBuffer byteBuffer) {
        return (C12293) PARSER.parseFrom(byteBuffer);
    }

    public static C12293 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C12293) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C12293 parseFrom(AbstractC5886 abstractC5886) {
        return (C12293) PARSER.parseFrom(abstractC5886);
    }

    public static C12293 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C12293) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C12293 parseFrom(byte[] bArr) {
        return (C12293) PARSER.parseFrom(bArr);
    }

    public static C12293 parseFrom(byte[] bArr, C17798 c17798) {
        return (C12293) PARSER.parseFrom(bArr, c17798);
    }

    public static C12293 parseFrom(InputStream inputStream) {
        return (C12293) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C12293 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C12293) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C12293 parseDelimitedFrom(InputStream inputStream) {
        return (C12293) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C12293 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C12293) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C12293 parseFrom(AbstractC7297 abstractC7297) {
        return (C12293) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C12293 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C12293) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C12998 newBuilderForType() {
        return newBuilder();
    }

    public static C12998 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C12998 newBuilder(C12293 c12293) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c12293);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C12998 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C12998(i) : new C12998(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C12998 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C12998(interfaceC9415, 0);
    }

    public static C12293 getDefaultInstance() {
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
    public C12293 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
