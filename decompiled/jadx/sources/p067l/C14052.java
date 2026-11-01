package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14052 extends AbstractC6285 implements InterfaceC8017 {
    public static final C14052 DEFAULT_INSTANCE;
    public static final int NUM_BLOCKS_FIELD_NUMBER = 2;
    public static final InterfaceC13820 PARSER;
    public static final int START_BLOCK_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C14052(C14722 c14722) {
        this((AbstractC21296) c14722);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C14052.class.getName());
        DEFAULT_INSTANCE = new C14052();
        PARSER = new C5335();
    }

    public C14052(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C14052() {
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C19244 getDescriptor() {
        return C21624.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68161x568dabbd;
        c11650.m26787(C14052.class, C14722.class);
        return c11650;
    }

    @Override // p067l.InterfaceC8017
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC8017
    public long getStartBlock() {
        return this.startBlock_;
    }

    @Override // p067l.InterfaceC8017
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC8017
    public long getNumBlocks() {
        return this.numBlocks_;
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
            abstractC16402.mo37249(1, this.startBlock_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37249(2, this.numBlocks_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37228 = (this.bitField0_ & 1) != 0 ? AbstractC16402.m37228(1, this.startBlock_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM37228 += AbstractC16402.m37228(2, this.numBlocks_);
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
        if (!(obj instanceof C14052)) {
            return super.equals(obj);
        }
        C14052 c14052 = (C14052) obj;
        if (hasStartBlock() != c14052.hasStartBlock()) {
            return false;
        }
        if ((!hasStartBlock() || getStartBlock() == c14052.getStartBlock()) && hasNumBlocks() == c14052.hasNumBlocks()) {
            return (!hasNumBlocks() || getNumBlocks() == c14052.getNumBlocks()) && getUnknownFields().equals(c14052.getUnknownFields());
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
        if (hasStartBlock()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + C15671.m35600(getStartBlock());
        }
        if (hasNumBlocks()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35600(getNumBlocks());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14052 parseFrom(ByteBuffer byteBuffer) {
        return (C14052) PARSER.parseFrom(byteBuffer);
    }

    public static C14052 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C14052) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C14052 parseFrom(AbstractC7962 abstractC7962) {
        return (C14052) PARSER.parseFrom(abstractC7962);
    }

    public static C14052 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C14052) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C14052 parseFrom(byte[] bArr) {
        return (C14052) PARSER.parseFrom(bArr);
    }

    public static C14052 parseFrom(byte[] bArr, C19283 c19283) {
        return (C14052) PARSER.parseFrom(bArr, c19283);
    }

    public static C14052 parseFrom(InputStream inputStream) {
        return (C14052) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C14052 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C14052) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C14052 parseDelimitedFrom(InputStream inputStream) {
        return (C14052) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C14052 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C14052) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C14052 parseFrom(AbstractC9303 abstractC9303) {
        return (C14052) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C14052 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C14052) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C14722 newBuilderForType() {
        return newBuilder();
    }

    public static C14722 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C14722 newBuilder(C14052 c14052) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c14052);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C14722 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C14722(i) : new C14722(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C14722 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C14722(interfaceC11316, 0);
    }

    public static C14052 getDefaultInstance() {
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
    public C14052 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
