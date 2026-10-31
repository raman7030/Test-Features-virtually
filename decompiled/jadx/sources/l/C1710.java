package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1710 extends AbstractC4121 implements InterfaceC16526 {
    public static final int DECOMPRESSED_SIZE_FIELD_NUMBER = 4;
    public static final C1710 DEFAULT_INSTANCE;
    public static final int IS_COMPRESSED_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final InterfaceC12050 PARSER;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public byte memoizedIsInitialized;
    public volatile Object packageName_;
    public long version_;

    public /* synthetic */ C1710(C7148 c7148) {
        this((AbstractC19916) c7148);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C1710.class.getName());
        DEFAULT_INSTANCE = new C1710();
        PARSER = new C13497();
    }

    public C1710(AbstractC19916 abstractC19916) {
        super(abstractC19916);
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C1710() {
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.packageName_ = "";
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC4121
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable;
        c9766.m24773(C1710.class, C7148.class);
        return c9766;
    }

    @Override // l.InterfaceC16526
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC16526
    public String getPackageName() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.packageName_ = strM16501;
        }
        return strM16501;
    }

    @Override // l.InterfaceC16526
    public AbstractC5886 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.packageName_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    @Override // l.InterfaceC16526
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC16526
    public long getVersion() {
        return this.version_;
    }

    @Override // l.InterfaceC16526
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC16526
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    @Override // l.InterfaceC16526
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC16526
    public long getDecompressedSize() {
        return this.decompressedSize_;
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
            AbstractC4121.m12380(abstractC14766, 1, this.packageName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14766.mo35102(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14766.mo35093(3, this.isCompressed_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14766.mo35102(4, this.decompressedSize_);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.bitField0_ & 1) != 0 ? AbstractC4121.m12365(1, this.packageName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM12365 += AbstractC14766.m35075(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM12365 += AbstractC14766.m35080(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM12365 += AbstractC14766.m35075(4, this.decompressedSize_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM12365;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1710)) {
            return super.equals(obj);
        }
        C1710 c1710 = (C1710) obj;
        if (hasPackageName() != c1710.hasPackageName()) {
            return false;
        }
        if ((hasPackageName() && !getPackageName().equals(c1710.getPackageName())) || hasVersion() != c1710.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c1710.getVersion()) || hasIsCompressed() != c1710.hasIsCompressed()) {
            return false;
        }
        if ((!hasIsCompressed() || getIsCompressed() == c1710.getIsCompressed()) && hasDecompressedSize() == c1710.hasDecompressedSize()) {
            return (!hasDecompressedSize() || getDecompressedSize() == c1710.getDecompressedSize()) && getUnknownFields().equals(c1710.getUnknownFields());
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
        if (hasPackageName()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + getPackageName().hashCode();
        }
        if (hasVersion()) {
            iHashCode = C4153.m12551(iHashCode, 37, 2, 53) + C13997.m33480(getVersion());
        }
        if (hasIsCompressed()) {
            iHashCode = C4153.m12551(iHashCode, 37, 3, 53) + C13997.m33481(getIsCompressed());
        }
        if (hasDecompressedSize()) {
            iHashCode = C4153.m12551(iHashCode, 37, 4, 53) + C13997.m33480(getDecompressedSize());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C1710 parseFrom(ByteBuffer byteBuffer) {
        return (C1710) PARSER.parseFrom(byteBuffer);
    }

    public static C1710 parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return (C1710) PARSER.parseFrom(byteBuffer, c17798);
    }

    public static C1710 parseFrom(AbstractC5886 abstractC5886) {
        return (C1710) PARSER.parseFrom(abstractC5886);
    }

    public static C1710 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (C1710) PARSER.parseFrom(abstractC5886, c17798);
    }

    public static C1710 parseFrom(byte[] bArr) {
        return (C1710) PARSER.parseFrom(bArr);
    }

    public static C1710 parseFrom(byte[] bArr, C17798 c17798) {
        return (C1710) PARSER.parseFrom(bArr, c17798);
    }

    public static C1710 parseFrom(InputStream inputStream) {
        return (C1710) AbstractC4121.m12390(PARSER, inputStream);
    }

    public static C1710 parseFrom(InputStream inputStream, C17798 c17798) {
        return (C1710) AbstractC4121.m12391(PARSER, inputStream, c17798);
    }

    public static C1710 parseDelimitedFrom(InputStream inputStream) {
        return (C1710) AbstractC4121.m12376(PARSER, inputStream);
    }

    public static C1710 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return (C1710) AbstractC4121.m12377(PARSER, inputStream, c17798);
    }

    public static C1710 parseFrom(AbstractC7297 abstractC7297) {
        return (C1710) AbstractC4121.m12378(PARSER, abstractC7297);
    }

    public static C1710 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return (C1710) AbstractC4121.m12379(PARSER, abstractC7297, c17798);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C7148 newBuilderForType() {
        return newBuilder();
    }

    public static C7148 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C7148 newBuilder(C1710 c1710) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c1710);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public C7148 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C7148(i) : new C7148(i).mergeFrom(this);
    }

    @Override // l.AbstractC8709
    public C7148 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C7148(interfaceC9415, 0);
    }

    public static C1710 getDefaultInstance() {
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
    public C1710 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
