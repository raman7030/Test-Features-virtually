package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3994 extends AbstractC6285 implements InterfaceC18075 {
    public static final int DECOMPRESSED_SIZE_FIELD_NUMBER = 4;
    public static final C3994 DEFAULT_INSTANCE;
    public static final int IS_COMPRESSED_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final InterfaceC13820 PARSER;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public byte memoizedIsInitialized;
    public volatile Object packageName_;
    public long version_;

    public /* synthetic */ C3994(C9162 c9162) {
        this((AbstractC21296) c9162);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C3994.class.getName());
        DEFAULT_INSTANCE = new C3994();
        PARSER = new C15196();
    }

    public C3994(AbstractC21296 abstractC21296) {
        super(abstractC21296);
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C3994() {
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.packageName_ = "";
    }

    public static final C19244 getDescriptor() {
        return C21624.f68149xbbde3ff9;
    }

    @Override // p067l.AbstractC6285
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68150x2f2e5d77;
        c11650.m26787(C3994.class, C9162.class);
        return c11650;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC18075
    public String getPackageName() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.packageName_ = strM18427;
        }
        return strM18427;
    }

    @Override // p067l.InterfaceC18075
    public AbstractC7962 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.packageName_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC18075
    public long getVersion() {
        return this.version_;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC18075
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    @Override // p067l.InterfaceC18075
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC18075
    public long getDecompressedSize() {
        return this.decompressedSize_;
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
            AbstractC6285.m14269(abstractC16402, 1, this.packageName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC16402.mo37249(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC16402.mo37240(3, this.isCompressed_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC16402.mo37249(4, this.decompressedSize_);
        }
        getUnknownFields().writeTo(abstractC16402);
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.bitField0_ & 1) != 0 ? AbstractC6285.m14254(1, this.packageName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM14254 += AbstractC16402.m37222(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM14254 += AbstractC16402.m37227(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM14254 += AbstractC16402.m37222(4, this.decompressedSize_);
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
        if (!(obj instanceof C3994)) {
            return super.equals(obj);
        }
        C3994 c3994 = (C3994) obj;
        if (hasPackageName() != c3994.hasPackageName()) {
            return false;
        }
        if ((hasPackageName() && !getPackageName().equals(c3994.getPackageName())) || hasVersion() != c3994.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c3994.getVersion()) || hasIsCompressed() != c3994.hasIsCompressed()) {
            return false;
        }
        if ((!hasIsCompressed() || getIsCompressed() == c3994.getIsCompressed()) && hasDecompressedSize() == c3994.hasDecompressedSize()) {
            return (!hasDecompressedSize() || getDecompressedSize() == c3994.getDecompressedSize()) && getUnknownFields().equals(c3994.getUnknownFields());
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
        if (hasPackageName()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + getPackageName().hashCode();
        }
        if (hasVersion()) {
            iHashCode = C6316.m14441(iHashCode, 37, 2, 53) + C15671.m35600(getVersion());
        }
        if (hasIsCompressed()) {
            iHashCode = C6316.m14441(iHashCode, 37, 3, 53) + C15671.m35601(getIsCompressed());
        }
        if (hasDecompressedSize()) {
            iHashCode = C6316.m14441(iHashCode, 37, 4, 53) + C15671.m35600(getDecompressedSize());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3994 parseFrom(ByteBuffer byteBuffer) {
        return (C3994) PARSER.parseFrom(byteBuffer);
    }

    public static C3994 parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return (C3994) PARSER.parseFrom(byteBuffer, c19283);
    }

    public static C3994 parseFrom(AbstractC7962 abstractC7962) {
        return (C3994) PARSER.parseFrom(abstractC7962);
    }

    public static C3994 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (C3994) PARSER.parseFrom(abstractC7962, c19283);
    }

    public static C3994 parseFrom(byte[] bArr) {
        return (C3994) PARSER.parseFrom(bArr);
    }

    public static C3994 parseFrom(byte[] bArr, C19283 c19283) {
        return (C3994) PARSER.parseFrom(bArr, c19283);
    }

    public static C3994 parseFrom(InputStream inputStream) {
        return (C3994) AbstractC6285.m14279(PARSER, inputStream);
    }

    public static C3994 parseFrom(InputStream inputStream, C19283 c19283) {
        return (C3994) AbstractC6285.m14280(PARSER, inputStream, c19283);
    }

    public static C3994 parseDelimitedFrom(InputStream inputStream) {
        return (C3994) AbstractC6285.m14265(PARSER, inputStream);
    }

    public static C3994 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return (C3994) AbstractC6285.m14266(PARSER, inputStream, c19283);
    }

    public static C3994 parseFrom(AbstractC9303 abstractC9303) {
        return (C3994) AbstractC6285.m14267(PARSER, abstractC9303);
    }

    public static C3994 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return (C3994) AbstractC6285.m14268(PARSER, abstractC9303, c19283);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C9162 newBuilderForType() {
        return newBuilder();
    }

    public static C9162 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C9162 newBuilder(C3994 c3994) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c3994);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public C9162 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C9162(i) : new C9162(i).mergeFrom(this);
    }

    @Override // p067l.AbstractC10645
    public C9162 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C9162(interfaceC11316, 0);
    }

    public static C3994 getDefaultInstance() {
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
    public C3994 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
