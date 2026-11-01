package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩵ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20954 extends AbstractC6285 implements InterfaceC7542 {
    public static final int DATA_FIELD_NUMBER = 2;
    public static final C20954 DEFAULT_INSTANCE;
    public static final InterfaceC13820 PARSER;
    public static final int UNPADDED_SIGNATURE_SIZE_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC7962 data_;
    public byte memoizedIsInitialized;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C20954(C20283 c20283) {
        this((AbstractC21296) c20283);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C20954.class.getName());
        DEFAULT_INSTANCE = new C20954();
        PARSER = new C6201();
    }

    public C20954(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.version_ = 0;
        this.data_ = AbstractC7962.f20935;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C20954() {
        this.version_ = 0;
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.data_ = abstractC7962;
    }

    public static final C19244 getDescriptor() {
        return C21624.f68168x19c8add5;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68169x912b2f53;
        c11650.m26787(C20954.class, C20283.class);
        return c11650;
    }

    @Override // p067l.InterfaceC7542
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC7542
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Override // p067l.InterfaceC7542
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC7542
    public AbstractC7962 getData() {
        return this.data_;
    }

    @Override // p067l.InterfaceC7542
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC7542
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
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
            abstractC16402.mo37256(1, this.version_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37237(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC16402.mo37234(3, this.unpaddedSignatureSize_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37231 = (this.bitField0_ & 1) != 0 ? AbstractC16402.m37231(1, this.version_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM37231 += AbstractC16402.m37223(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM37231 += AbstractC16402.m37225(3);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37231;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20954)) {
            return super.equals(obj);
        }
        C20954 c20954 = (C20954) obj;
        if (hasVersion() != c20954.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c20954.getVersion()) || hasData() != c20954.hasData()) {
            return false;
        }
        if ((!hasData() || getData().equals(c20954.getData())) && hasUnpaddedSignatureSize() == c20954.hasUnpaddedSignatureSize()) {
            return (!hasUnpaddedSignatureSize() || getUnpaddedSignatureSize() == c20954.getUnpaddedSignatureSize()) && getUnknownFields().equals(c20954.getUnknownFields());
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
        if (hasVersion()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getVersion();
        }
        if (hasData()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + getData().hashCode();
        }
        if (hasUnpaddedSignatureSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + getUnpaddedSignatureSize();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C20954 parseFrom(ByteBuffer byteBuffer) {
        return (C20954) PARSER.parseFrom(byteBuffer);
    }

    public static C20954 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C20954) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C20954 parseFrom(AbstractC7962 abstractC7962) {
        return (C20954) PARSER.parseFrom(abstractC7962);
    }

    public static C20954 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C20954) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C20954 parseFrom(byte[] bArr) {
        return (C20954) PARSER.parseFrom(bArr);
    }

    public static C20954 parseFrom(byte[] bArr, C19283 c19283) {
        return (C20954) PARSER.parseFrom(bArr, c19283);
    }

    public static C20954 parseFrom(InputStream inputStream) {
        return (C20954) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C20954 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C20954) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C20954 parseDelimitedFrom(InputStream inputStream) {
        return (C20954) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C20954 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C20954) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C20954 parseFrom(AbstractC9303 abstractC9303) {
        return (C20954) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C20954 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C20954) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C20283 newBuilderForType() {
        return newBuilder();
    }

    public static C20283 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C20283 newBuilder(C20954 c20954) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c20954);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C20283 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C20283(i) : new C20283(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C20283 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C20283(interfaceC11316, 0);
    }

    public static C20954 getDefaultInstance() {
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
    public C20954 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
